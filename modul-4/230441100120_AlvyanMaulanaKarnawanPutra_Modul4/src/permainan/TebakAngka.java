/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package permainan;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author TOSHIBA
 */
public class TebakAngka extends javax.swing.JFrame {
    int kesempatan = 10;
    String[][] data_score = new String[10][2];;
    int index = 0;
    StringBuilder text_score = new StringBuilder();
    Random angka1 = new Random();
    int tebakan = angka1.nextInt(101);
    
    

    /**
     * Creates new form TebakAngka
     */
    public TebakAngka() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tabbedPaneCustom1 = new raven.tabbed.TabbedPaneCustom();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Score = new javax.swing.JTextField();
        TebakAngka = new javax.swing.JTextField();
        HasilTebakan = new javax.swing.JTextField();
        rSMaterialButtonRectangle1 = new rojerusan.RSMaterialButtonRectangle();
        BtnTebak = new rojerusan.RSMaterialButtonRectangle();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        PanelRound = new komponen.PanelRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        ReportHasil = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tabbedPaneCustom1.setBackground(new java.awt.Color(255, 255, 255));
        tabbedPaneCustom1.setFont(new java.awt.Font("Stencil", 1, 12)); // NOI18N
        tabbedPaneCustom1.setSelectedColor(new java.awt.Color(204, 255, 255));

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        jLabel3.setText("Score");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 70, 30));

        jLabel4.setFont(new java.awt.Font("Eras Bold ITC", 1, 36)); // NOI18N
        jLabel4.setText("GAME TEBAK ANGKA");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 450, 50));

        jLabel5.setFont(new java.awt.Font("Eras Bold ITC", 1, 36)); // NOI18N
        jLabel5.setText("1 - 100");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 140, 50));

        jLabel6.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        jLabel6.setText("Tebak Angka");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 140, 30));

        jLabel7.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        jLabel7.setText("Hasil Tebakan");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 140, 30));

        Score.setEditable(false);
        jPanel4.add(Score, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 260, 30));

        TebakAngka.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TebakAngkaKeyReleased(evt);
            }
        });
        jPanel4.add(TebakAngka, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 260, 30));

        HasilTebakan.setEditable(false);
        jPanel4.add(HasilTebakan, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 260, 30));

        rSMaterialButtonRectangle1.setBackground(new java.awt.Color(255, 255, 255));
        rSMaterialButtonRectangle1.setForeground(new java.awt.Color(0, 0, 0));
        rSMaterialButtonRectangle1.setText("riset");
        rSMaterialButtonRectangle1.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        rSMaterialButtonRectangle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonRectangle1ActionPerformed(evt);
            }
        });
        jPanel4.add(rSMaterialButtonRectangle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 100, 40));

        BtnTebak.setBackground(new java.awt.Color(255, 255, 255));
        BtnTebak.setForeground(new java.awt.Color(0, 0, 0));
        BtnTebak.setText("Tebak");
        BtnTebak.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        BtnTebak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTebakActionPerformed(evt);
            }
        });
        jPanel4.add(BtnTebak, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 90, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/permainan/DADU-removebg-preview.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 280, 490, 270));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/permainan/DADU-removebg-preview.png"))); // NOI18N
        jLabel12.setText("jLabel2");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 460, 270));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabbedPaneCustom1.addTab("GAME", jPanel2);

        jPanel5.setBackground(new java.awt.Color(204, 255, 255));
        jPanel5.setLayout(null);

        PanelRound.setBackground(new java.awt.Color(255, 255, 255));
        PanelRound.setRoundBottomLeft(50);
        PanelRound.setRoundBottomRight(50);
        PanelRound.setRoundTopLeft(50);
        PanelRound.setRoundTopRight(50);

        ReportHasil.setEditable(false);
        ReportHasil.setColumns(20);
        ReportHasil.setRows(5);
        jScrollPane1.setViewportView(ReportHasil);

        jLabel1.setFont(new java.awt.Font("Eras Bold ITC", 1, 48)); // NOI18N
        jLabel1.setText("SCORE");

        javax.swing.GroupLayout PanelRoundLayout = new javax.swing.GroupLayout(PanelRound);
        PanelRound.setLayout(PanelRoundLayout);
        PanelRoundLayout.setHorizontalGroup(
            PanelRoundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelRoundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
            .addGroup(PanelRoundLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        PanelRoundLayout.setVerticalGroup(
            PanelRoundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRoundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel5.add(PanelRound);
        PanelRound.setBounds(100, 70, 310, 390);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/permainan/DADU-removebg-preview.png"))); // NOI18N
        jPanel5.add(jLabel9);
        jLabel9.setBounds(370, 200, 150, 430);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/permainan/DADU-removebg-preview.png"))); // NOI18N
        jPanel5.add(jLabel10);
        jLabel10.setBounds(-70, 180, 530, 430);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/permainan/DADU-removebg-preview.png"))); // NOI18N
        jPanel5.add(jLabel8);
        jLabel8.setBounds(-240, -50, 490, 290);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/permainan/DADU-removebg-preview.png"))); // NOI18N
        jPanel5.add(jLabel11);
        jLabel11.setBounds(320, 0, 220, 300);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabbedPaneCustom1.addTab("SCORE", jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPaneCustom1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPaneCustom1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnTebakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTebakActionPerformed
        // TODO add your handling code here:
        System.out.println(tebakan);
        
                                                 
        try {
            int angka = Integer.parseInt(TebakAngka.getText());
        
            if (angka > 100) {
                HasilTebakan.setText("");  
                TebakAngka.setText("");
                JOptionPane.showMessageDialog(this, "Masukkan angka antara 1 - 100", "WARNING", JOptionPane.WARNING_MESSAGE);
                return;
            }
 
            if (tebakan > angka) {
                kesempatan -= 1;
                BtnTebak.setText("Tebak (" + kesempatan + ")");
                HasilTebakan.setText("Angka Tebakan Anda Lebih Kecil ");
                TebakAngka.setText("");
                Score.setText("0");
                JOptionPane.showMessageDialog(this, "TEBAKAN ANDA SALAH", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
                if (kesempatan == 0) {
                    kesempatan = 10;
                    BtnTebak.setText("Tebak (" + kesempatan + ")");
                    JOptionPane.showMessageDialog(this, "KESEMPATAN ANDA HABIS \n" + "ANDA GAGAL", "WARNING", JOptionPane.ERROR_MESSAGE);
                }
            } else if (tebakan < angka) {
                HasilTebakan.setText("Angka Tebakan Anda Lebih Besar  ");
                kesempatan -= 1;
                BtnTebak.setText("Tebak (" + kesempatan + ")");
                TebakAngka.setText("");
                Score.setText("0");
                JOptionPane.showMessageDialog(this, "TEBAKAN ANDA SALAH", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
                if (kesempatan == 0) {
                    kesempatan = 10;
                    BtnTebak.setText("Tebak (" + kesempatan + ")");
                    JOptionPane.showMessageDialog(this, "KESEMPATAN ANDA HABIS \n" + "ANDA GAGAL", "WARNING", JOptionPane.ERROR_MESSAGE);
                }
            } else if (tebakan == angka) {
                HasilTebakan.setText(String.valueOf(tebakan));
                int hasil = kesempatan * 10; 
                Score.setText(String.valueOf(hasil));
                JOptionPane.showMessageDialog(this, "SELAMAT TEBAKAN ANDA BENAR", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);

                String nama;
                boolean namaUnik = false;

                do {
                    nama = JOptionPane.showInputDialog(this, "SILAHKAN MASUKAN NAMA", "Nama Pemain", JOptionPane.INFORMATION_MESSAGE);

                    namaUnik = true;
                    for (int i = 0; i < index; i++) {
                        if (data_score[i][0].equals(nama)) {
                            JOptionPane.showMessageDialog(this, "Nama sudah digunakan! Masukkan nama lain.", "WARNING", JOptionPane.WARNING_MESSAGE);
                            namaUnik = false;
                            break;
                        }
                    }
                } while (!namaUnik || nama == null || nama.trim().isEmpty());

                if (index < data_score.length) {
                    data_score[index][0] = nama; 
                    data_score[index][1] = String.valueOf(hasil); 
                    index++; 
                }

            TebakAngka.setText("");
            HasilTebakan.setText("");
            Score.setText("0");
            BtnTebak.setText("Tebak(10)");
            text_score.setLength(0);
            tebakan = angka1.nextInt(101);

            for (int i = 0; i < index; i++) {
                text_score.append(i + 1).append(". Name: ").append(data_score[i][0])
                          .append(", Score: ").append(data_score[i][1]).append("\n");
            }

            ReportHasil.setText(text_score.toString());
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "TEBAKAN HARUS BERUPA ANGKA", "WARNING", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtnTebakActionPerformed

    private void rSMaterialButtonRectangle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonRectangle1ActionPerformed
        // TODO add your handling code here:
        TebakAngka.setText("");
        HasilTebakan.setText("");
        Score.setText("0");
        BtnTebak.setText("Tebak(10)");   
    }//GEN-LAST:event_rSMaterialButtonRectangle1ActionPerformed

    private void TebakAngkaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TebakAngkaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_TebakAngkaKeyReleased

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
            java.util.logging.Logger.getLogger(TebakAngka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TebakAngka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TebakAngka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TebakAngka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TebakAngka().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle BtnTebak;
    private javax.swing.JTextField HasilTebakan;
    private komponen.PanelRound PanelRound;
    private javax.swing.JTextArea ReportHasil;
    private javax.swing.JTextField Score;
    private javax.swing.JTextField TebakAngka;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle1;
    private raven.tabbed.TabbedPaneCustom tabbedPaneCustom1;
    // End of variables declaration//GEN-END:variables
}
