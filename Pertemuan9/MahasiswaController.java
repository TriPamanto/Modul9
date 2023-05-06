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
public class MahasiswaController {
    private final MahasiswaModel model;
    private final MahasiswaView view;
    private String pilih_nim;
    
    public MahasiswaController(MahasiswaModel model, MahasiswaView view){
        this.model = model;
        this.view = view;
    }
    
    public void index(){
        try{
            ResultSet rs = MahasiswaModel.all();
            while (rs.next()){
                Object[] obj = new Object[2];
                obj[0] = rs.getString("nim");
                obj[1] = rs.getString("nama");
                view.table_model.addRow(obj);
            }
        }catch (SQLException e){
            System.out.println("Eror show data: " + e.getMessage());
        }
    }
    public void store(){
        model.setNim(view.paramNim);
        model.setNama(view.paramNama);
        MahasiswaModel.store(model);
    }
    public void update(){
        pilih_nim = view.paramPilihNim;
        MahasiswaModel.find(pilih_nim);
        
        model.setNim(view.paramNim);
        model.setNama(view.paramNama);
        MahasiswaModel.update(pilih_nim, model);
    }
    public void delete(){
        pilih_nim = view.paramPilihNim;
        MahasiswaModel.find(pilih_nim);
        MahasiswaModel.delete(pilih_nim);
    }
}
