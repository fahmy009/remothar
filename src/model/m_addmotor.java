/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import controller.c_addmotor;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Muhtar
 */
public class m_addmotor {
    
    private Koneksi kon;
    private static String status;
    
    public m_addmotor() {
        try {
            kon = new Koneksi("root", "", "rental_motor");
        } catch (SQLException ex) {
            Logger.getLogger(m_addmotor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public DefaultTableModel getTableModel() throws SQLException {
        Object[] header = {"Id_Motor", "motor", "type", "tahun", "nopol", "harga"};
        DefaultTableModel tableModel = new DefaultTableModel(null, header);
        
        String sql = "select * from tb_motor";
        for (int i = tableModel.getRowCount() - 1; i >= 0; i--) {
            tableModel.removeRow(i);
        }
        ResultSet rs = kon.getResult(sql);
        while (rs.next()) {
            String kolom[] = new String[6];
            for (int i = 0; i < kolom.length; i++) {
                kolom[i] = rs.getString(i + 1);
            }
            tableModel.addRow(kolom);
        }
        return tableModel;
    }
    
    public void save(String merekmotor, String typemotor, String tahun, String nopol, String hargasewa) throws SQLException {
        String query = "INSERT INTO tb_motor VALUES(NULL,'" + merekmotor + "','" + typemotor+ "','" +tahun+"','"+nopol+"','"+hargasewa+"')";
//        String query = "INSERT INTO tb_motor(merek, type, tahun, nopol, harga, status) VALUES('" + merekmotor + "','" + typemotor + "'," + tahun + ",'" + nopol + "'','" + hargasewa + ",'" + statusmotor + "')";
        kon.execute(query);
//System.out.println(query);
    }
    
    public void update(String idtor, String merekmotor, String typemotor, String tahun, String nopol, String hargasewa) throws SQLException {
        String query = "UPDATE tb_motor SET merek='" + merekmotor + "', type='" + typemotor + "', tahun=" + tahun + ", nopol='" + nopol + "', harga=" + hargasewa + "  WHERE Id_Motor=" + idtor;
        kon.execute(query);
    }
    
    public void delete(String idtor) throws SQLException {
        String query = "DELETE FROM tb_motor where Id_Motor ='" + idtor + "'";
        kon.execute(query);
    }


    
}
