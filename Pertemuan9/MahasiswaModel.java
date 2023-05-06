/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan9;
import java.sql.*;
import static Pertemuan9.Koneksi.*;
/**
 *
 * @author User
 */
public class MahasiswaModel {
    
    private String nim, nama;
    
    public MahasiswaModel(){
        cekKoneksi();
    }
    public String getNim(){
        return nim;
    }
    public void setNim(String nim){
        this.nim = nim;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public static ResultSet all(){
        try{
            String sql = "SELECT * FROM mahasiswa";
            ResultSet rs = stmt.executeQuery(sql);
            return rs;
        }catch (SQLException e){
            System.out.println("EROR tampil data: " + e.getMessage());
        }
        return null;
    }
    
    public static ResultSet find(String pilih_nim){
        try{
            String sql = "SELECT * FROM mahasiswa WHERE nim = '%s'";
            sql = String.format(sql, pilih_nim);
            ResultSet rs = stmt.executeQuery(sql);
            if (!rs.next()){
                System.out.println("data tidak ditemukan");
                System.exit(0);
            }else{
                return rs;
            }
        }catch (SQLException e){
            System.out.println("Eror tampil data: " + e.getMessage());
        }
        return null;
    }
    
    public static void store(MahasiswaModel object){
        try{
            String sql = "INSERT INTO mahasiswa (nim, nama) VALUE('%s', '%s')";
            sql = String.format(sql, object.nim,object.nama);
            stmt.execute(sql);
            System.out.println("Sukses insert data");
        }catch (SQLException e){
            System.out.println("Eror insert data: " + e.getMessage());
        }
    }
    public static void update(String pilih_nim, MahasiswaModel object){
        try{
            String sql = "UPDATE mahasiswa SET nim = '%s', nama = '%s' WHERE nim = '%s'";
            sql = String.format(sql, object.nim,object.nama,pilih_nim);
            stmt.execute(sql);
            System.out.println("Sukses update data");
        }catch (SQLException e){
            System.out.println("Eror update data: " + e.getMessage());
        }
    }
    public static void delete(String pilih_nim){
        try{
            String sql = "DELETE FROM mahasiswa WHERE nim ='%s'";
            sql = String.format(sql, pilih_nim);
            stmt.execute(sql);
            System.out.println("Sukses hapus data");
        }catch (SQLException e){
            System.out.println("Eror update data: " + e.getMessage());
        }
    }
}
