/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import controller.c_adduser;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Muhtar
 */
public class m_adduser {

    private Koneksi kon;


    public m_adduser() {
        try {
            kon = new Koneksi("root", "", "rental_motor");
        } catch (SQLException ex) {
            Logger.getLogger(m_adduser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public DefaultTableModel getTableModel() throws SQLException {
        Object[] header = {"Id_User", "Nama", "Username", "Password", "Status"};
        DefaultTableModel tableModel = new DefaultTableModel(null, header);

        String sql = "select * from tb_user";
        for (int i = tableModel.getRowCount() - 1; i >= 0; i--) {
            tableModel.removeRow(i);
        }
        ResultSet rs = kon.getResult(sql);
        while (rs.next()) {
            String kolom[] = new String[5];
            for (int i = 0; i < kolom.length; i++) {
                kolom[i] = rs.getString(i + 1);
            }
            tableModel.addRow(kolom);
        }
        return tableModel;
    }

    public void save(String namauser, String username, String pass, String status) throws SQLException {
        String query = "INSERT INTO tb_user VALUES(NULL,'" + namauser + "','" + username + "','" + pass + "','" + status + "')";
//        String query = "INSERT INTO tb_motor(merek, type, tahun, nopol, harga, status) VALUES('" + merekmotor + "','" + typemotor + "'," + tahun + ",'" + nopol + "'','" + hargasewa + ",'" + statusmotor + "')";
        kon.execute(query);
//System.out.println(query);
    }

    public void update(String iduser, String namauser, String username, String pass, String status) throws SQLException {
        String query = "UPDATE tb_user SET Nama ='" + namauser + "', Username = '" + username + "', Password ='" + pass + "', Status = '" + status + "' WHERE Id_User =" + iduser;
        kon.execute(query);
        System.out.println(query);
    }

    public void delete(String iduser) throws SQLException {
        String query = "DELETE FROM tb_user where Id_User ='" + iduser + "'";
        kon.execute(query);
    }

}
