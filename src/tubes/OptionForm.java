package tubes;
import java.sql.*;
import javax.swing.JOptionPane;

public class OptionForm extends javax.swing.JFrame {

    public OptionForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        adminFormBtn = new javax.swing.JButton();
        EmployessFormBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Welcome, Login Check Your Data");

        adminFormBtn.setBackground(new java.awt.Color(255, 153, 51));
        adminFormBtn.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        adminFormBtn.setForeground(new java.awt.Color(255, 255, 255));
        adminFormBtn.setText("Admin");
        adminFormBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminFormBtnActionPerformed(evt);
            }
        });

        EmployessFormBtn.setBackground(new java.awt.Color(0, 153, 255));
        EmployessFormBtn.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        EmployessFormBtn.setForeground(new java.awt.Color(255, 255, 255));
        EmployessFormBtn.setText("Employess");
        EmployessFormBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployessFormBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Poppins", 2, 8)); // NOI18N
        jLabel2.setText("made by [1]Mario Rudy Silalahi [2] Lureta Muren M [3] Dika Alim Mu'adin");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(adminFormBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EmployessFormBtn))
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {EmployessFormBtn, adminFormBtn});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminFormBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmployessFormBtn))
                .addGap(107, 107, 107)
                .addComponent(jLabel2)
                .addGap(40, 40, 40))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {EmployessFormBtn, adminFormBtn});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminFormBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminFormBtnActionPerformed
        AdminLogin option = new AdminLogin();
        option.setVisible(true);
        option.pack();
        option.setLocationRelativeTo(null);
        option.setDefaultCloseOperation(AdminLogin.EXIT_ON_CLOSE);
        dispose();
    }//GEN-LAST:event_adminFormBtnActionPerformed

    private void EmployessFormBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployessFormBtnActionPerformed
        EmployessLogin option = new EmployessLogin();
        option.setVisible(true);
        option.pack();
        option.setLocationRelativeTo(null);
        option.setDefaultCloseOperation(AdminLogin.EXIT_ON_CLOSE);
        dispose();
    }//GEN-LAST:event_EmployessFormBtnActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OptionForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EmployessFormBtn;
    private javax.swing.JButton adminFormBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
