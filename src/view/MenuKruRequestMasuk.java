                /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import model.Database;
/**
 *
 * @author LENOVO
 */
public class MenuKruRequestMasuk extends javax.swing.JFrame {

    /**
     * Creates new form MenuKruLihatData
     */
    public MenuKruRequestMasuk() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelputih = new javax.swing.JPanel();
        panelhijau = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btDataMasyarakat = new javax.swing.JLabel();
        btRequestMasuk = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btKiri = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        RequestMasyarakat = new javax.swing.JTable();
        btDelete = new javax.swing.JButton();
        ButtonEdit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelputih.setBackground(new java.awt.Color(255, 255, 255));

        panelhijau.setBackground(new java.awt.Color(80, 200, 120));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon admin_1.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SELAMAT");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DATANG");

        btDataMasyarakat.setForeground(new java.awt.Color(255, 255, 255));
        btDataMasyarakat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon grub.png"))); // NOI18N
        btDataMasyarakat.setText("Data Masyarakat");
        btDataMasyarakat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btDataMasyarakatMouseClicked(evt);
            }
        });

        btRequestMasuk.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btRequestMasuk.setForeground(new java.awt.Color(255, 255, 255));
        btRequestMasuk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon pesawat.png"))); // NOI18N
        btRequestMasuk.setText("Request Masuk");
        btRequestMasuk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btRequestMasukMouseClicked(evt);
            }
        });

        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logout.png"))); // NOI18N
        logout.setText("Log Out");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelhijauLayout = new javax.swing.GroupLayout(panelhijau);
        panelhijau.setLayout(panelhijauLayout);
        panelhijauLayout.setHorizontalGroup(
            panelhijauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelhijauLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(panelhijauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)))
            .addGroup(panelhijauLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelhijauLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelhijauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelhijauLayout.createSequentialGroup()
                        .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelhijauLayout.createSequentialGroup()
                        .addGroup(panelhijauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btDataMasyarakat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btRequestMasuk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29))))
        );
        panelhijauLayout.setVerticalGroup(
            panelhijauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelhijauLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btDataMasyarakat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btRequestMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel4.setText("REQUEST MASYARAKAT");

        btKiri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon panah.png"))); // NOI18N
        btKiri.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btKiriMouseClicked(evt);
            }
        });

        RequestMasyarakat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nama Lengkap", "Kontak", "Domisili", "Jenis Sampah", "Jam Masuk", "Jam Jemput", "Status", "Kru penjemput"
            }
        ));
        jScrollPane1.setViewportView(RequestMasyarakat);

        btDelete.setBackground(new java.awt.Color(80, 200, 120));
        btDelete.setForeground(new java.awt.Color(255, 255, 255));
        btDelete.setText("Delete");
        btDelete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btDelete.setBorderPainted(false);

        ButtonEdit.setBackground(new java.awt.Color(80, 200, 120));
        ButtonEdit.setForeground(new java.awt.Color(255, 255, 255));
        ButtonEdit.setText("Edit");
        ButtonEdit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonEdit.setBorderPainted(false);

        javax.swing.GroupLayout panelputihLayout = new javax.swing.GroupLayout(panelputih);
        panelputih.setLayout(panelputihLayout);
        panelputihLayout.setHorizontalGroup(
            panelputihLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelputihLayout.createSequentialGroup()
                .addComponent(panelhijau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelputihLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelputihLayout.createSequentialGroup()
                        .addGroup(panelputihLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelputihLayout.createSequentialGroup()
                                .addGap(152, 152, 152)
                                .addComponent(jLabel4))
                            .addGroup(panelputihLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(panelputihLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelputihLayout.createSequentialGroup()
                                        .addComponent(ButtonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(26, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelputihLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btKiri)
                        .addGap(18, 18, 18))))
        );
        panelputihLayout.setVerticalGroup(
            panelputihLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelputihLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btKiri)
                .addGap(25, 25, 25)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(panelputihLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(56, 56, 56))
            .addComponent(panelhijau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(panelputih, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btDataMasyarakatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btDataMasyarakatMouseClicked
        dispose();
        new MenuKruRequestMasuk().setVisible(true);
    }//GEN-LAST:event_btDataMasyarakatMouseClicked

    private void btRequestMasukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btRequestMasukMouseClicked
        dispose();
        new MenuKruRequestMasuk().setVisible(true);
    }//GEN-LAST:event_btRequestMasukMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_logoutMouseClicked

    private void btKiriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btKiriMouseClicked
        dispose();
        new MenuKruLihatData().setVisible(true);
    }//GEN-LAST:event_btKiriMouseClicked

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
            java.util.logging.Logger.getLogger(MenuKruRequestMasuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuKruRequestMasuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuKruRequestMasuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuKruRequestMasuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuKruRequestMasuk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonEdit;
    private javax.swing.JTable RequestMasyarakat;
    private javax.swing.JLabel btDataMasyarakat;
    private javax.swing.JButton btDelete;
    private javax.swing.JLabel btKiri;
    private javax.swing.JLabel btRequestMasuk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logout;
    private javax.swing.JPanel panelhijau;
    private javax.swing.JPanel panelputih;
    // End of variables declaration//GEN-END:variables
}