/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Muhtar
 */
public class m_peminjampega {
    private Koneksi kon;

    public m_peminjampega() throws SQLException {
//        super();
        try {
            kon = new Koneksi("root", "", "rental_motor");
        } catch (SQLException ex) {
            Logger.getLogger(m_peminjampega.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public DefaultTableModel getTableModel() throws SQLException {
        Object[] header = {"Id_Peminjam", "Id_Motor", "Nama", "Alamat", "NoTelp", "NoKTP", "Merek", "Type", "NoPol", "Tanggal_Pinjam", "Tanggal_Kembali", "Lama", "Harga"};
        DefaultTableModel tableModel = new DefaultTableModel(null, header);

        String sql = "select * from tb_peminjam";
        for (int i = tableModel.getRowCount() - 1; i >= 0; i--) {
            tableModel.removeRow(i);
        }
        ResultSet rs = kon.getResult(sql);
        while (rs.next()) {
            String kolom[] = new String[13];
            for (int i = 0; i < kolom.length; i++) {
                kolom[i] = rs.getString(i + 1);
            }
            tableModel.addRow(kolom);
        }
        return tableModel;
    }
public void save(String idmotor, String nama, String alamat, String notelp, String noktp, String merek, String type, String nopol, String pinja, String kemba, String Hari, String harga) throws SQLException {
        String query = "INSERT INTO tb_peminjam VALUES(NULL,'" + idmotor + "','" + nama + "','" + alamat + "','" + notelp + "','" + noktp + "','" + merek + "','" + type + "','" + nopol + "','" + pinja + "','" + kemba + "','" + Hari + "','" + harga + "')";
//        String query = "INSERT INTO tb_motor(merek, type, tahun, nopol, harga, status) VALUES('" + merekmotor + "','" + typemotor + "'," + tahun + ",'" + nopol + "'','" + hargasewa + ",'" + statusmotor + "')";
        kon.execute(query);
//System.out.println(query);
    }

    public void update(String id, String idmotor, String nama, String alamat, String notelp, String noktp) throws SQLException {
        String query = "UPDATE tb_peminjam SET Id_Motor ='" + idmotor + "',Nama='" + nama + "', Alamat='" + alamat + "', No_Tlp=" + notelp + ", No_KTP='" + "'  WHERE Id_Motor=" + id;
        kon.execute(query);
    }

    public void delete(String idpeminjam) throws SQLException {
        String query = "DELETE FROM tb_peminjam where Id_Peminjaman ='" + idpeminjam + "'";
        kon.execute(query);
    }

    public String[] IdMotor() throws SQLException {
        String query = "SELECT Id_Motor FROM tb_motor";
        ResultSet rs = kon.getResult(query);
        rs.last();
        String IdMotor[] = new String[rs.getRow()];
        rs.beforeFirst();
        int a = 0;
        while (rs.next()) {
            IdMotor[a] = rs.getString("Id_Motor");
            a++;
        }
        a = 0;
        return IdMotor;
    }

    public void status(int id) throws SQLException {
        String sql = "select * from tb_motor where Id_Motor=" + id;
        Statement st = kon.getConnection().createStatement();
        ResultSet rs = st.executeQuery(sql);
        rs.next();
        String idmotorasli = rs.getString("Id_Motor");
//        status = rs.getString("status");
        int harga = rs.getInt("harga");
        String merek = rs.getString("merek");
        String type = rs.getString("type");
        String nopol = rs.getString("nopol");
    }

    public void coba(int id) throws SQLException {
        String sql = "select * from tb_peminjam where Id_Motor=" + id;
        Statement st = kon.getConnection().createStatement();
        ResultSet rs = st.executeQuery(sql);
        rs.next();
        String idmotorcoba = rs.getString("Id_Motor");

    }

    public void statusupdate(String a) throws SQLException {
        String sql = "UPDATE tb_motor set status='Tidak Tersedia' where Id_Motor'" + a + "'";
        kon.execute(sql);
    }
}
