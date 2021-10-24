/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pointofsales;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class PointOfSales {

    /**
     * @param args the command line arguments
     */
    
    private static Connection MySQLConfig;
    
    public static Connection configDB()throws SQLException
    {
        try {
            String url = "jdbc:mysql://localhost:3306/projectsdp";
            String user = "root";
            String pass = "";
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            MySQLConfig = DriverManager.getConnection(url,user,pass);
        } catch (SQLException e) {
            System.out.println("Koneksi ke DB Gagal");
        }
        return MySQLConfig;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        FormLogin frm = new FormLogin(/*arr1*/);
        frm.setVisible(true);
    }
    
}
