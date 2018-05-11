/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Muhtar
 */
public class m_login {

    private Koneksi kon;

    public m_login() {
        try {
            this.kon = new Koneksi("root", "", "rental_motor");
        } catch (SQLException ex) {
            Logger.getLogger(m_login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ResultSet check(String Username, String Password) throws SQLException {
        String query = "SELECT * FROM tb_user WHERE Username='" + Username + "' AND Password='" + Password + "'";
        ResultSet Result = kon.getResult(query);
        return Result;
    }
}
