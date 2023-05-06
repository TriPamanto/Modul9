/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pertemuan9;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author User
 */
public class MahasiswaView extends javax.swing.JFrame {
    
    MahasiswaModel mahasiswa_model = new MahasiswaModel();
    MahasiswaController mahasiswa_controller = new MahasiswaController(mahasiswa_model , this);
    DefaultTableModel table_model = new DefaultTableModel();
    
    public String paramNim, paramNama, paramPilihNim;
    
    /**
     * Creates new form MahasiswaView
     */
    public MahasiswaView() {
        initComponents();
        initTable();
        tampilData();
    }
    
    private void initTable(){
        tableMahasiswa.setModel(table_model);
        table_model.addColumn("NIM");
        table_model.addColumn("Nama");
    }
    
    private void kosongkanForm(){
        textNim.requestFocus();
        textNim.setText("");
        textNim.setEditable(true);
        textNama.setText("");
    }
    
    private void tampilData(){
        table_model.getDataVector().removeAllElements();
        mahasiswa_controller.index();
        kosongkanForm();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textNim = new javax.swing.JTextField();
        textNama = new javax.swing.JTextField();
        butttonSimpan = new javax.swing.JButton();
        butttonUbah = new javax.swing.JButton();
        butttonHapus = new javax.swing.JButton();
        butttonTutup = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMahasiswa = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Master Mahasiswa");

        jLabel2.setText("NIM");

        jLabel3.setText("Nama");

        butttonSimpan.setText("Simpan");
        butttonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butttonSimpanActionPerformed(evt);
            }
        });

        butttonUbah.setText("Ubah");
        butttonUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butttonUbahActionPerformed(evt);
            }
        });

        butttonHapus.setText("Hapus");
        butttonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butttonHapusActionPerformed(evt);
            }
        });

        butttonTutup.setText("Tutup");
        butttonTutup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butttonTutupActionPerformed(evt);
            }
        });

        tableMahasiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "NIM", "Nama"
            }
        ));
        tableMahasiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMahasiswaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableMahasiswa);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(butttonSimpan)
                                .addGap(18, 18, 18)
                                .addComponent(butttonUbah)
                                .addGap(18, 18, 18)
                                .addComponent(butttonHapus)
                                .addGap(18, 18, 18)
                                .addComponent(butttonTutup))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(86, 86, 86)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1)
                                    .addComponent(textNim)
                                    .addComponent(textNama, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textNim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butttonSimpan)
                    .addComponent(butttonUbah)
                    .addComponent(butttonHapus)
                    .addComponent(butttonTutup))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableMahasiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMahasiswaMouseClicked
        // TODO add your handling code here:
        int row = tableMahasiswa.getSelectedRow();
        paramNim = tableMahasiswa.getValueAt(row, 0).toString();
        paramNama = tableMahasiswa.getValueAt(row, 1).toString();
        paramPilihNim = paramNim;
        textNim.setText(paramNim);
        textNim.setEditable(false);
        textNama.setText(paramNama);                       
    }//GEN-LAST:event_tableMahasiswaMouseClicked

    private void butttonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butttonSimpanActionPerformed
        // TODO add your handling code here:
        paramNim = textNim.getText();
        paramNama = textNama.getText();
        mahasiswa_controller.store();
        tampilData();
        JOptionPane.showMessageDialog(this, "Data berhasil diubah");
    }//GEN-LAST:event_butttonSimpanActionPerformed

    private void butttonUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butttonUbahActionPerformed
        // TODO add your handling code here:
        paramPilihNim = textNim.getText();
        paramNim = textNim.getText();
        paramNama = textNama.getText();
        mahasiswa_controller.update();
        tampilData();
        JOptionPane.showMessageDialog(this, "Data berhasil disimpan");
    }//GEN-LAST:event_butttonUbahActionPerformed

    private void butttonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butttonHapusActionPerformed
        // TODO add your handling code here:
        mahasiswa_controller.delete();
        tampilData();
        JOptionPane.showMessageDialog(this, "Data berhasil dihapus");
    }//GEN-LAST:event_butttonHapusActionPerformed

    private void butttonTutupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butttonTutupActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_butttonTutupActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MahasiswaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MahasiswaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MahasiswaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MahasiswaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MahasiswaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butttonHapus;
    private javax.swing.JButton butttonSimpan;
    private javax.swing.JButton butttonTutup;
    private javax.swing.JButton butttonUbah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableMahasiswa;
    private javax.swing.JTextField textNama;
    private javax.swing.JTextField textNim;
    // End of variables declaration//GEN-END:variables
}
