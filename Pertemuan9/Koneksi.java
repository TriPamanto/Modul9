/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan9;
import java.sql.*;
/**
 *
 * @author User
 */
public class Koneksi {
    static Connection conn;
    public static Statement stmt;
    static String database = "praktikum_pbo_m9";
    static String port = "3306";
    static String url = "jdbc:mysql://localhost:"+port+"/"+database;
    static String user = "root";
    static String pass = "";
    
    public static void cekKoneksi(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url,user,pass);
            stmt = conn.createStatement();
            System.out.println("Connected");
        }catch (ClassNotFoundException | SQLException e){
            System.err.println("Koneksi gagal: "+e.getMessage());
        }
    }
}
