package kasir;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.SQLException;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author HamFin18
 */
import javax.swing.table.DefaultTableModel;

public class barang extends javax.swing.JFrame {
 
    /**
     * Creates new form barang
     */
    public barang() {
        initComponents();
    }
    
    public barang(String pegawai)
    {
        initComponents();
        this.pegawai = pegawai;
        
        
        modelBarang = new DefaultTableModel();
        
        Barang.setModel(modelBarang);
        modelBarang.addColumn("ID barang");
        modelBarang.addColumn("Nama barang");
        modelBarang.addColumn("Stok");
        modelBarang.addColumn("Harga beli");
        modelBarang.addColumn("Harga jual");
        modelBarang.addColumn("Kategori");
        
        panggil_barang();
    }

    String pegawai;
    public Statement st;
    Kontrol.kontrol_barang barang;
    DefaultTableModel modelBarang;
    private ResultSet rs;
    
    private void panggil_barang()
    {
        try
        {
            barang = new Kontrol.kontrol_barang();
            String query = "select * from barang";
            rs = barang.execQuery(query);
      
            while(rs.next())
            {
                Object[] x = new Object[6];
                x[0] = rs.getString("id");
                x[1] = rs.getString("nama");
                x[2] = rs.getString("stok");
                x[3] = rs.getString("harga_beli");
                x[4] = rs.getString("harga_jual");
                x[5] = rs.getString("kategori");
                modelBarang.addRow(x);
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Barang gagal ditampilkan error : "+e);
        }
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
        harga_beli = new javax.swing.JTextField();
        nama_barang = new javax.swing.JTextField();
        id_barang = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tambah = new javax.swing.JButton();
        ubah = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jumlah_barang = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        kategori_barang = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        harga_jual = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Barang = new javax.swing.JTable();
        clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kasir IndoMabar");

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel1.setText("Data Barang");

        harga_beli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                harga_beliActionPerformed(evt);
            }
        });

        nama_barang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nama_barangActionPerformed(evt);
            }
        });

        id_barang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                id_barangMouseClicked(evt);
            }
        });
        id_barang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_barangActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("ID BARANG");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("HARGA BELI");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("NAMA BARANG");

        tambah.setText("Tambah");
        tambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tambahMouseClicked(evt);
            }
        });
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });

        ubah.setText("Perbarui");
        ubah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ubahMouseClicked(evt);
            }
        });
        ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahActionPerformed(evt);
            }
        });

        hapus.setText("Hapus");
        hapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hapusMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("JUMLAH BARANG");

        jumlah_barang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlah_barangActionPerformed(evt);
            }
        });

        back.setText("Back");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("KATEGORI BARANG");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("HARGA JUAL");

        Barang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Barang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BarangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Barang);

        clear.setText("Clear Field");
        clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(harga_beli, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                    .addComponent(id_barang)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2)
                                    .addComponent(nama_barang))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3)
                                    .addComponent(kategori_barang)
                                    .addComponent(jLabel7)
                                    .addComponent(jumlah_barang)
                                    .addComponent(jLabel4)
                                    .addComponent(harga_jual, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(124, 124, 124)))
                        .addGap(24, 24, 24)
                        .addComponent(back))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(tambah)
                        .addGap(18, 18, 18)
                        .addComponent(ubah)
                        .addGap(18, 18, 18)
                        .addComponent(hapus)
                        .addGap(18, 18, 18)
                        .addComponent(clear)
                        .addGap(106, 106, 106))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {harga_beli, harga_jual, id_barang, jumlah_barang, kategori_barang, nama_barang});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {clear, hapus, tambah, ubah});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(id_barang, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nama_barang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jumlah_barang, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kategori_barang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(harga_beli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(harga_jual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tambah)
                    .addComponent(ubah)
                    .addComponent(hapus)
                    .addComponent(clear))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {harga_beli, harga_jual, id_barang, jumlah_barang, kategori_barang, nama_barang});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {clear, hapus, tambah, ubah});

        setSize(new java.awt.Dimension(619, 552));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void harga_beliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_harga_beliActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_harga_beliActionPerformed

    private void nama_barangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nama_barangActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_nama_barangActionPerformed

    private void id_barangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id_barangMouseClicked
        // TODOour handling code here:
    }//GEN-LAST:event_id_barangMouseClicked

    private void id_barangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_barangActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_id_barangActionPerformed

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tambahActionPerformed

    private void ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ubahActionPerformed
    
    Tabel.barang input;
    
    private void tambahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tambahMouseClicked
        // TODO add your handling code here:
        
        barang = new Kontrol.kontrol_barang();
        input = new Tabel.barang();
        
        if (!(id_barang.getText().equals("") | nama_barang.getText().equals("") | harga_beli.getText().equals("") | jumlah_barang.getText().equals("") | kategori_barang.getText().equals("") | harga_jual.getText().equals("")))
        {
            input.set_id_barang(id_barang.getText());
            input.set_nama_barang(nama_barang.getText());
            input.set_harga_beli_barang(Double.valueOf(harga_beli.getText()));
            input.set_stok_barang(Integer.valueOf(jumlah_barang.getText()));
            input.set_kategori_barang(kategori_barang.getText());
            input.set_harga_jual_barang(Double.valueOf(harga_jual.getText()));
        
            barang.add_barang(input);
            modelBarang.getDataVector().removeAllElements();
            panggil_barang();
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Tidak boleh ada field yang kosong!");
        }
    }//GEN-LAST:event_tambahMouseClicked

    private void ubahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ubahMouseClicked
        // TODO add your handling code here:
        barang = new Kontrol.kontrol_barang();
        input = new Tabel.barang();
        
        if (!(id_barang.getText().equals("") | nama_barang.getText().equals("") | harga_beli.getText().equals("") | jumlah_barang.getText().equals("") | kategori_barang.getText().equals("") | harga_jual.getText().equals("")))
        {
            input.set_id_barang(id_barang.getText());
            input.set_nama_barang(nama_barang.getText());
            input.set_harga_beli_barang(Double.valueOf(harga_beli.getText()));
            input.set_stok_barang(Integer.valueOf(jumlah_barang.getText()));
            input.set_kategori_barang(kategori_barang.getText());
            input.set_harga_jual_barang(Double.valueOf(harga_jual.getText()));
        
            barang.update_barang(input);
            modelBarang.getDataVector().removeAllElements();
            panggil_barang();
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Tidak boleh ada field yang kosong!");
        }
    }//GEN-LAST:event_ubahMouseClicked

    private void hapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hapusMouseClicked
        // TODO add your handling code here:
        barang = new Kontrol.kontrol_barang();
        input = new Tabel.barang();
        
        if (!(id_barang.getText().equals("") | nama_barang.getText().equals("") | harga_beli.getText().equals("") | jumlah_barang.getText().equals("") | kategori_barang.getText().equals("") | harga_jual.getText().equals("")))
        {
            input.set_id_barang(id_barang.getText());
            input.set_nama_barang(nama_barang.getText());
            input.set_harga_beli_barang(Double.valueOf(harga_beli.getText()));
            input.set_stok_barang(Integer.valueOf(jumlah_barang.getText()));
            input.set_kategori_barang(kategori_barang.getText());
            input.set_harga_jual_barang(Double.valueOf(harga_jual.getText()));
        
            barang.delete_barang(input);
            modelBarang.getDataVector().removeAllElements();
            panggil_barang();
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Tidak boleh ada field yang kosong!");
        }
    }//GEN-LAST:event_hapusMouseClicked

    private void jumlah_barangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlah_barangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumlah_barangActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here:
        MenuAdmin b=new MenuAdmin(pegawai);
        b.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_backMouseClicked

    private void BarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarangMouseClicked
        // TODO add your handling code here:
        int row = Barang.getSelectedRow();
        
        id_barang.setText(String.valueOf(Barang.getValueAt(row, 0)));
        nama_barang.setText(String.valueOf(Barang.getValueAt(row, 1)));
        jumlah_barang.setText(String.valueOf(Barang.getValueAt(row, 2)));
        harga_beli.setText(String.valueOf(Barang.getValueAt(row, 3)));
        harga_jual.setText(String.valueOf(Barang.getValueAt(row, 4)));
        kategori_barang.setText(String.valueOf(Barang.getValueAt(row, 5)));
    }//GEN-LAST:event_BarangMouseClicked

    private void clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseClicked
        // TODO add your handling code here:
        id_barang.setText("");
        nama_barang.setText("");
        jumlah_barang.setText("");
        harga_beli.setText("");
        harga_jual.setText("");
        kategori_barang.setText("");
    }//GEN-LAST:event_clearMouseClicked

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
            java.util.logging.Logger.getLogger(barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new barang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Barang;
    private javax.swing.JButton back;
    private javax.swing.JButton clear;
    private javax.swing.JButton hapus;
    private javax.swing.JTextField harga_beli;
    private javax.swing.JTextField harga_jual;
    private javax.swing.JTextField id_barang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jumlah_barang;
    private javax.swing.JTextField kategori_barang;
    private javax.swing.JTextField nama_barang;
    private javax.swing.JButton tambah;
    private javax.swing.JButton ubah;
    // End of variables declaration//GEN-END:variables
}