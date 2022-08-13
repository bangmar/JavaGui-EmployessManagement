package tubes;

public class AdminOption extends javax.swing.JFrame {

    public AdminOption() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        checkEmployeeBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        inputDataBtn = new javax.swing.JButton();
        previousPageLabel = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel1.setText("Check Employe Salary ");

        checkEmployeeBtn.setBackground(new java.awt.Color(255, 153, 51));
        checkEmployeeBtn.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        checkEmployeeBtn.setForeground(new java.awt.Color(255, 255, 255));
        checkEmployeeBtn.setText("CHECK NOW");
        checkEmployeeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkEmployeeBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel2.setText("Input Employes Data");

        inputDataBtn.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        inputDataBtn.setText("INPUT DATA");
        inputDataBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputDataBtnActionPerformed(evt);
            }
        });

        previousPageLabel.setText("< Previous Page");
        previousPageLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                previousPageLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(checkEmployeeBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(inputDataBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(previousPageLabel))
                .addGap(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkEmployeeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputDataBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(previousPageLabel)
                .addGap(17, 17, 17)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {checkEmployeeBtn, inputDataBtn});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void previousPageLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previousPageLabelMouseClicked
        // TODO add your handling code here:
        AdminLogin previous = new AdminLogin();
        previous.setVisible(true);
        previous.pack();
        previous.setLocationRelativeTo(null);
        previous.setDefaultCloseOperation(OptionForm.EXIT_ON_CLOSE);
        dispose();
    }//GEN-LAST:event_previousPageLabelMouseClicked

    private void checkEmployeeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkEmployeeBtnActionPerformed
        // TODO add your handling code here:
        AdminCheckData cekData = new AdminCheckData();
        cekData.setVisible(true);
        cekData.pack();
        cekData.setLocationRelativeTo(null);
        cekData.setDefaultCloseOperation(OptionForm.EXIT_ON_CLOSE);
        dispose();
    }//GEN-LAST:event_checkEmployeeBtnActionPerformed

    private void inputDataBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputDataBtnActionPerformed
        // TODO add your handling code here:
        AdminInputData cekData = new AdminInputData();
        cekData.setVisible(true);
        cekData.pack();
        cekData.setLocationRelativeTo(null);
        cekData.setDefaultCloseOperation(OptionForm.EXIT_ON_CLOSE);
        dispose();
    }//GEN-LAST:event_inputDataBtnActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminOption().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkEmployeeBtn;
    private javax.swing.JButton inputDataBtn;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel previousPageLabel;
    // End of variables declaration//GEN-END:variables
}
