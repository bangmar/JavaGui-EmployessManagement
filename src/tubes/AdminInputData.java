package tubes;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class AdminInputData extends javax.swing.JFrame {


    public void clearInput(){
            inputNIP.setText("");
            inputName.setText("");
            inputDivision.setText("");
            inputAddress.setText("");
            inputInsurance.setText("");
            inputPassword.setText("");
    }
    
    public AdminInputData() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        inputNIP = new javax.swing.JTextField();
        inputName = new javax.swing.JTextField();
        inputAddress = new javax.swing.JTextField();
        inputDivision = new javax.swing.JTextField();
        inputInsurance = new javax.swing.JTextField();
        inputPassword = new javax.swing.JPasswordField();
        submitBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        previousPageLabel = new javax.swing.JLabel();
        showDataBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 153, 0));
        jLabel1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INPUT EMPLOYES DATA");
        jLabel1.setToolTipText("");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        inputNIP.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        inputNIP.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NIP", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins", 0, 12))); // NOI18N

        inputName.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        inputName.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins", 0, 12))); // NOI18N
        inputName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNameActionPerformed(evt);
            }
        });

        inputAddress.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        inputAddress.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Address", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins", 0, 12))); // NOI18N
        inputAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputAddressActionPerformed(evt);
            }
        });

        inputDivision.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        inputDivision.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Division", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins", 0, 12))); // NOI18N

        inputInsurance.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        inputInsurance.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Insurance", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins", 0, 12))); // NOI18N
        inputInsurance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputInsuranceActionPerformed(evt);
            }
        });

        inputPassword.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        inputPassword.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins", 0, 12))); // NOI18N
        inputPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPasswordActionPerformed(evt);
            }
        });

        submitBtn.setBackground(new java.awt.Color(255, 153, 0));
        submitBtn.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        submitBtn.setForeground(new java.awt.Color(255, 255, 255));
        submitBtn.setText("SUMBIT DATA");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        clearBtn.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        clearBtn.setText("CLEAR");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        previousPageLabel.setText("< Previous Page");
        previousPageLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                previousPageLabelMouseClicked(evt);
            }
        });

        showDataBtn.setBackground(new java.awt.Color(0, 0, 0));
        showDataBtn.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        showDataBtn.setForeground(new java.awt.Color(255, 153, 0));
        showDataBtn.setText("Show Data");
        showDataBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 2));
        showDataBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showDataBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(previousPageLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(inputNIP)
                        .addComponent(inputName)
                        .addComponent(inputAddress)
                        .addComponent(inputDivision, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(inputInsurance)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                        .addComponent(inputPassword)
                        .addComponent(submitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(showDataBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputNIP, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(inputName, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(inputAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(inputDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(inputInsurance, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showDataBtn)
                    .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(previousPageLabel)
                .addGap(17, 17, 17))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {inputAddress, inputDivision, inputInsurance, inputNIP, inputName, inputPassword});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {clearBtn, showDataBtn, submitBtn});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNameActionPerformed
    }//GEN-LAST:event_inputNameActionPerformed

    private void inputAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputAddressActionPerformed
    }//GEN-LAST:event_inputAddressActionPerformed

    private void inputInsuranceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputInsuranceActionPerformed
    }//GEN-LAST:event_inputInsuranceActionPerformed

    private void inputPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPasswordActionPerformed
    }//GEN-LAST:event_inputPasswordActionPerformed

    private void previousPageLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previousPageLabelMouseClicked
        AdminOption previous = new AdminOption();
        previous.setVisible(true);
        previous.pack();
        previous.setLocationRelativeTo(null);
        previous.setDefaultCloseOperation(OptionForm.EXIT_ON_CLOSE);
        dispose();
    }//GEN-LAST:event_previousPageLabelMouseClicked

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        try {
            String sqlKode = "INSERT INTO employess (NIP, Name, division, "
                          + "Address, insurance, password) VALUES " +
                            " ('" + inputNIP.getText() + "', " +
                            " '" + inputName.getText() + "', " +
                            " '" + inputDivision.getText() + "', " +
                            " '" + inputAddress.getText() + "', " +
                            " '" + inputInsurance.getText() + "', " +
                            " '" + inputPassword.getText() + "');";

            if (inputNIP.getText().equals("") || inputName.getText().equals("") 
                          || inputDivision.getText().equals("") 
                          || inputAddress.getText().equals("") 
                          || inputInsurance.getText().equals("") 
                          || inputPassword.getText().equals("")) {

                //this untuk pesan error berada di depan form
                JOptionPane.showMessageDialog(this, "No Empty Data Allowed!");
                return;
            }
            
            java.sql.Connection conn = (Connection) openKoneksi.configDB();

            java.sql.PreparedStatement pstm = conn.prepareStatement(sqlKode);

            pstm.execute();
            JOptionPane.showMessageDialog(this, "Success Adding Employess Data");
            
            clearInput();
            
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());

        }
    }//GEN-LAST:event_submitBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        clearInput();
    }//GEN-LAST:event_clearBtnActionPerformed

    private void showDataBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showDataBtnActionPerformed
        AdminShowData previous = new AdminShowData();
        previous.setVisible(true);
        previous.pack();
        previous.setLocationRelativeTo(null);
        previous.setDefaultCloseOperation(OptionForm.EXIT_ON_CLOSE);
        dispose();
    }//GEN-LAST:event_showDataBtnActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminInputData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearBtn;
    private javax.swing.JTextField inputAddress;
    private javax.swing.JTextField inputDivision;
    private javax.swing.JTextField inputInsurance;
    private javax.swing.JTextField inputNIP;
    private javax.swing.JTextField inputName;
    private javax.swing.JPasswordField inputPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel previousPageLabel;
    private javax.swing.JButton showDataBtn;
    private javax.swing.JButton submitBtn;
    // End of variables declaration//GEN-END:variables
}
