/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasir;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author HamFin18
 */
public class TambahAkunPegawai extends javax.swing.JFrame {

    /**
     * Creates new form TambahAdmin
     */
    public TambahAkunPegawai() {
        initComponents();
    }
    
    public TambahAkunPegawai(String admin)
    {
        initComponents();
        
        this.admin = admin;
    }
private String admin;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buatAkun = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        verif_password = new javax.swing.JPasswordField();
        showPassword = new javax.swing.JLabel();
        showVerif = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        id_pegawai = new javax.swing.JTextField();
        akunAdmin = new javax.swing.JRadioButton();
        akunPegawai = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kasir IndoMabar");

        buatAkun.setText("Buat Akun");
        buatAkun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buatAkunActionPerformed(evt);
            }
        });

        jLabel1.setText("Username");

        jLabel2.setText("Password");

        jLabel3.setText("Verify Password");

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24)); // NOI18N
        jLabel4.setText("Buat Akun Pegawai");

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        verif_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verif_passwordActionPerformed(evt);
            }
        });

        showPassword.setText("Show Password");
        showPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showPasswordMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                showPasswordMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                showPasswordMouseReleased(evt);
            }
        });

        showVerif.setText("Show Password");
        showVerif.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showVerifMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                showVerifMouseExited(evt);
            }
        });

        jLabel7.setText("Id Pegawai");

        akunAdmin.setText("Admin");

        akunPegawai.setText("Pegawai");

        jLabel8.setText("Kategori");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(username)
                            .addComponent(id_pegawai)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(47, 47, 47)
                        .addComponent(akunAdmin)
                        .addGap(14, 14, 14)
                        .addComponent(akunPegawai)
                        .addGap(38, 38, 38)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buatAkun)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(password)
                            .addComponent(verif_password, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(showPassword)
                    .addComponent(showVerif))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {id_pegawai, password, username, verif_password});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addComponent(jButton2))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_pegawai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(akunAdmin)
                        .addComponent(akunPegawai))
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(verif_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showVerif))
                .addGap(18, 18, 18)
                .addComponent(buatAkun)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {id_pegawai, password, username, verif_password});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //dispose();
        OpsiAdmin b=new OpsiAdmin(admin);
        b.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void buatAkunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buatAkunActionPerformed
        // TODO add your handling code here:
        String kategori="";
        if(akunAdmin.isSelected())
        {
            kategori = "admin";
        }
        if(akunPegawai.isSelected())
        {
            kategori = "pegawai";
        }
        if(!(id_pegawai.getText().equals("") | username.getText().equals("") | password.getPassword().equals("") | verif_password.getPassword().equals("") | kategori.equals("")))
        {
            if(String.valueOf(password.getPassword()).equals(String.valueOf(verif_password.getPassword())))
            {
                String query = "select * from pegawai where id = '"+id_pegawai.getText()+"'";
                Kontrol.kontrol_login_pegawai x = new Kontrol.kontrol_login_pegawai();
            
                try
                {
                    ResultSet rs = x.execQuery(query);
                    
                
                    if(rs.first())
                    {
                        Tabel.login_pegawai daftar = new Tabel.login_pegawai();
                    
                        daftar.set_id_login_pegawai(id_pegawai.getText());
                        daftar.set_username_login_pegawai(username.getText());
                        daftar.set_kategori_login_pegawai(kategori);
                        daftar.set_password_login_pegawai(String.valueOf(password.getPassword()));
                        
                        x.add_login_pegawai(daftar);
                        JOptionPane.showMessageDialog(this, "Akun berhasil dibuat");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this,"ID pegawai Tidak terdaftar");
                    }
                }
                catch(SQLException ex)
                {
                    System.out.println("Query gagal dieksekusi : "+ex);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(this,"verifikasi gagal!");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Field tidak boleh kosong!");
        }
    }//GEN-LAST:event_buatAkunActionPerformed

    private void showPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showPasswordMouseClicked
        // TODO add your handling code here:
        password.setEchoChar((char)0);
        showPassword.setForeground(Color.red);
    }//GEN-LAST:event_showPasswordMouseClicked

    private void showPasswordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showPasswordMouseExited
        // TODO add your handling code here:
        password.setEchoChar('*');
        showPassword.setForeground(Color.black);
    }//GEN-LAST:event_showPasswordMouseExited

    private void showVerifMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showVerifMouseClicked
        verif_password.setEchoChar((char)0);
        showVerif.setForeground(Color.red);
    }//GEN-LAST:event_showVerifMouseClicked

    private void showVerifMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showVerifMouseExited
        // TODO add your handling code here:
        verif_password.setEchoChar('*');
        showVerif.setForeground(Color.black);
    }//GEN-LAST:event_showVerifMouseExited

    private void verif_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verif_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_verif_passwordActionPerformed

    private void showPasswordMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showPasswordMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_showPasswordMouseReleased

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
            java.util.logging.Logger.getLogger(TambahAkunPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TambahAkunPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TambahAkunPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TambahAkunPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TambahAkunPegawai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton akunAdmin;
    private javax.swing.JRadioButton akunPegawai;
    private javax.swing.JButton buatAkun;
    private javax.swing.JTextField id_pegawai;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel showPassword;
    private javax.swing.JLabel showVerif;
    private javax.swing.JTextField username;
    private javax.swing.JPasswordField verif_password;
    // End of variables declaration//GEN-END:variables
}