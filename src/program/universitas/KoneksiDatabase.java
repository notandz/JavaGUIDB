/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program.universitas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException; 
/**
 *
 * @author nandap
 */
public class KoneksiDatabase {
    private static Connection koneksi;
    
    public static Connection getKoneksi() {
        
        // cek apakah koneksi null
        if (koneksi == null) {
            try{
                String url = "jdbc:mysql://localhost/universitas";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi =  DriverManager.getConnection(url, user, password);
                System.out.println ("Koneksi");
            } catch (SQLException t) {
                System.out.println ("Error Membuat Koneksi");
            }
        }
        return koneksi;
    }
}
