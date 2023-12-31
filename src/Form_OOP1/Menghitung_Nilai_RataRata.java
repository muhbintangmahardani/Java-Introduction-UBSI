/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Form_OOP1;
import javax.swing.*;

/**
 *
 * @author CYBER
 */
public class Menghitung_Nilai_RataRata extends javax.swing.JFrame {
     Ratarata rata=new Ratarata();

    /**
     * Creates new form Menghitung_RataRata
     */
    public Menghitung_Nilai_RataRata() {
        initComponents();
        nonAktif();
    }

    void Bersih(){
        tNilai1.setText("");
        tNilai2.setText("");
        tRata.setText("");
    }
    
    void Aktif(){
        tNilai1.setEnabled(true);
        tNilai2.setEnabled(true);
        tRata.setEnabled(true);
    }
    
    void nonAktif(){
        tNilai2.setEnabled(false);
        tNilai1.setEnabled(false);
        tRata.setEnabled(false);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tNilai1 = new javax.swing.JTextField();
        tNilai2 = new javax.swing.JTextField();
        tHitung = new javax.swing.JButton();
        tBersih = new javax.swing.JButton();
        tTutup = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        tRata = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(0, 204, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 255, 255)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 255, 255))); // NOI18N
        jPanel1.setLayout(new java.awt.BorderLayout());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Menghitung Nilai Rata Rata, Created by : Muh Bintang Mahardani - 17225123, Kelas : 17.2A.26 ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Berlin Sans FB Demi", 1, 18))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 12)); // NOI18N
        jLabel2.setText("Nilai 1");

        jLabel3.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 12)); // NOI18N
        jLabel3.setText("Nilai 2");

        tHitung.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 12)); // NOI18N
        tHitung.setText("Hitung");
        tHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tHitungActionPerformed(evt);
            }
        });

        tBersih.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 12)); // NOI18N
        tBersih.setText("Bersih");
        tBersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tBersihActionPerformed(evt);
            }
        });

        tTutup.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 12)); // NOI18N
        tTutup.setText("Tutup");
        tTutup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tTutupActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 12)); // NOI18N
        jLabel4.setText("Rata Rata");

        tRata.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 12)); // NOI18N
        tRata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tRataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(tRata, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(tHitung)
                        .addGap(18, 18, 18)
                        .addComponent(tBersih)
                        .addGap(18, 18, 18)
                        .addComponent(tTutup))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(tNilai2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(tNilai1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tNilai1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(tNilai2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tHitung)
                    .addComponent(tBersih)
                    .addComponent(tTutup))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tRata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(101, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tRataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tRataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tRataActionPerformed

    private void tHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tHitungActionPerformed
        // TODO add your handling code here:
        rata.setNilai1(Double.parseDouble(tNilai1.getText()));
        rata.setNilai2(Double.parseDouble(tNilai2.getText()));
        tRata.setText(Double.toString(rata.getNilaiRata()));
    }//GEN-LAST:event_tHitungActionPerformed

    private void tBersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tBersihActionPerformed
        // TODO add your handling code here:
        Bersih();
        Aktif();
        tNilai1.requestFocus();
    }//GEN-LAST:event_tBersihActionPerformed

    private void tTutupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tTutupActionPerformed
        // TODO add your handling code here:
        int tutup;
        tutup=JOptionPane.showConfirmDialog(null,"Yakin tutup program?","Konfirmasi",JOptionPane.YES_NO_OPTION);
        if(tutup==JOptionPane.YES_OPTION)
        {dispose();}
        else
        {return;}
    }//GEN-LAST:event_tTutupActionPerformed

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
            java.util.logging.Logger.getLogger(Menghitung_Nilai_RataRata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menghitung_Nilai_RataRata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menghitung_Nilai_RataRata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menghitung_Nilai_RataRata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menghitung_Nilai_RataRata().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton tBersih;
    private javax.swing.JButton tHitung;
    private javax.swing.JTextField tNilai1;
    private javax.swing.JTextField tNilai2;
    private javax.swing.JTextField tRata;
    private javax.swing.JButton tTutup;
    // End of variables declaration//GEN-END:variables
}
