package tubes;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class AdminCheckData extends javax.swing.JFrame {

    public AdminCheckData() {
        initComponents();
    }

    public void clearInput(){
        inputNIPLabel.setText("");
        inputMainSalaryLabel.setText("");
        inputAllowanceLabel.setText("");
        inputOvertimeLabel.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        inputNIPLabel = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        inputMainSalaryLabel = new javax.swing.JTextField();
        inputAllowanceLabel = new javax.swing.JTextField();
        inputOvertimeLabel = new javax.swing.JTextField();
        checkBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        nameResultField = new javax.swing.JTextField();
        divisionResultField = new javax.swing.JTextField();
        NIPResultField = new javax.swing.JTextField();
        insuranceResultField = new javax.swing.JTextField();
        saralyMinInsuranceField = new javax.swing.JTextField();
        totalSalaryResultField = new javax.swing.JTextField();
        previousPageLabel = new javax.swing.JLabel();
        saveSalaryBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        mainSalaryResultField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        allowanceResultField = new javax.swing.JTextField();
        overtimeResultField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel2.setText("Input Employe's NIP");

        inputNIPLabel.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel3.setText("Main Salary");

        jLabel4.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel4.setText("Allowance");

        jLabel5.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel5.setText("Overtime");

        inputMainSalaryLabel.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        inputMainSalaryLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputMainSalaryLabelActionPerformed(evt);
            }
        });

        inputAllowanceLabel.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        inputOvertimeLabel.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        checkBtn.setBackground(new java.awt.Color(255, 153, 51));
        checkBtn.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        checkBtn.setForeground(new java.awt.Color(255, 255, 255));
        checkBtn.setText("CHECK !");
        checkBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBtnActionPerformed(evt);
            }
        });

        jLabel6.setText("Division");

        jLabel7.setText("NIP");

        jLabel8.setText("Insurance");

        jLabel9.setText("Salary - Insurance");

        jLabel10.setText("Total Salary");

        jLabel11.setText("Name");

        nameResultField.setEditable(false);
        nameResultField.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        nameResultField.setBorder(null);
        nameResultField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameResultFieldActionPerformed(evt);
            }
        });

        divisionResultField.setEditable(false);
        divisionResultField.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        divisionResultField.setBorder(null);

        NIPResultField.setEditable(false);
        NIPResultField.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        NIPResultField.setBorder(null);

        insuranceResultField.setEditable(false);
        insuranceResultField.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        insuranceResultField.setBorder(null);

        saralyMinInsuranceField.setEditable(false);
        saralyMinInsuranceField.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        saralyMinInsuranceField.setBorder(null);

        totalSalaryResultField.setEditable(false);
        totalSalaryResultField.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        totalSalaryResultField.setBorder(null);

        previousPageLabel.setText("< Previous Page");
        previousPageLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                previousPageLabelMouseClicked(evt);
            }
        });

        saveSalaryBtn.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        saveSalaryBtn.setText("SAVE");
        saveSalaryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveSalaryBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Main Salary");

        jLabel12.setText("Allowance");

        mainSalaryResultField.setEditable(false);
        mainSalaryResultField.setBorder(null);

        jLabel13.setText("Overtime");

        allowanceResultField.setEditable(false);
        allowanceResultField.setBorder(null);

        overtimeResultField.setEditable(false);
        overtimeResultField.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(saveSalaryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(totalSalaryResultField))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(saralyMinInsuranceField))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(insuranceResultField)))
                        .addGap(6, 6, 6))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nameResultField))
                            .addComponent(inputNIPLabel)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inputOvertimeLabel)
                                    .addComponent(inputAllowanceLabel)
                                    .addComponent(inputMainSalaryLabel, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(checkBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(divisionResultField))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NIPResultField))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mainSalaryResultField))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(allowanceResultField))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(overtimeResultField))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(317, 317, 317)
                                .addComponent(previousPageLabel)))
                        .addGap(12, 12, 12))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel3, jLabel4, jLabel5});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel10, jLabel11, jLabel12, jLabel13, jLabel6, jLabel7, jLabel8, jLabel9});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputNIPLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(inputMainSalaryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(inputAllowanceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(inputOvertimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(checkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(nameResultField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(divisionResultField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(NIPResultField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mainSalaryResultField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(allowanceResultField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(overtimeResultField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(insuranceResultField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(saralyMinInsuranceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(totalSalaryResultField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(saveSalaryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(previousPageLabel)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameResultFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameResultFieldActionPerformed

        
    }//GEN-LAST:event_nameResultFieldActionPerformed

    private void checkBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBtnActionPerformed

        if (inputNIPLabel.getText().isEmpty() || inputMainSalaryLabel
                      .getText().isEmpty()
                || inputAllowanceLabel.getText().isEmpty() || inputOvertimeLabel
                              .getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "No Empty Data Allowed !");
        }
        
        double main_salary = Double.parseDouble(inputMainSalaryLabel.getText()),
                tunjangan = Double.parseDouble(inputAllowanceLabel.getText()),
                overtime =  Double.parseDouble(inputOvertimeLabel.getText());
        
        // gajinya didapat dari gajipokok + tunjangan + (lembur(/jam) dibayar 1000)
        double salary = main_salary + tunjangan + (overtime * 1000);
                      
                      
        try {
            Connection con = openKoneksi.configDB(); 
            Statement s = con.createStatement(); 

            String sql = "SELECT * FROM employess where nip= '" 
                          + inputNIPLabel.getText() + "'"; 
            ResultSet res = s.executeQuery(sql);

            if (res.next()) {
                nameResultField.setText(res.getString("Name"));
                divisionResultField.setText(res.getString("division"));
                NIPResultField.setText(res.getString("NIP"));
                
                mainSalaryResultField.setText("Rp."+ String.valueOf(main_salary));
                allowanceResultField.setText("Rp."+ String.valueOf(tunjangan));
                overtimeResultField.setText(String.valueOf(overtime) + " Jam ");
                
                insuranceResultField.setText("Rp."+res.getString("insurance"));
                saralyMinInsuranceField.setText("Rp."+ String.valueOf(salary)
                              + " - " + "Rp."+ res.getString("insurance"));
                
                double salaryMinInsurance = salary - res.getInt("insurance");
                totalSalaryResultField.setText("Rp."
                              + String.valueOf(salaryMinInsurance));
                
                clearInput();
                
            } else {
                JOptionPane.showMessageDialog(this, "NIP tidak terdaftar");
            }
            
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        
    }//GEN-LAST:event_checkBtnActionPerformed

    private void previousPageLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previousPageLabelMouseClicked
        // TODO add your handling code here:
        AdminOption previous = new AdminOption();
        previous.setVisible(true);
        previous.pack();
        previous.setLocationRelativeTo(null);
        previous.setDefaultCloseOperation(OptionForm.EXIT_ON_CLOSE);
        dispose();
    }//GEN-LAST:event_previousPageLabelMouseClicked

    private void saveSalaryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveSalaryBtnActionPerformed
        // TODO add your handling code here:
        try {
           
            
            String sqlKode = "INSERT INTO salaryData (NIP, Name, division, "
                          + "MainSalary, Allowance, Overtime, totalSalary, DateCheck) "
                          + "VALUES " +
                            " ('" + NIPResultField.getText() + "', " +
                            " '" + nameResultField.getText() + "', " +
                            " '" + divisionResultField.getText() + "', " +
                            " '" + mainSalaryResultField.getText() + "', " +
                            " '" + allowanceResultField.getText() + "', " +
                            " '" + overtimeResultField.getText() + "', " +
                            " '" + totalSalaryResultField.getText() + "', now());";
            
            if (NIPResultField.getText().equals("") || nameResultField.getText()
                          .equals("") || divisionResultField.getText().equals("")
                    || totalSalaryResultField.getText().equals("")) {

                JOptionPane.showMessageDialog(this, "No Empty Data Allowed!");
                return;
            }
            
            
            java.sql.Connection conn = (Connection) openKoneksi.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sqlKode);
            pstm.execute();
            JOptionPane.showMessageDialog(this, "Success Adding Employess Salary Data");
            
            clearInput();
            
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());

        }
    }//GEN-LAST:event_saveSalaryBtnActionPerformed

    private void inputMainSalaryLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputMainSalaryLabelActionPerformed
    }//GEN-LAST:event_inputMainSalaryLabelActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminCheckData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NIPResultField;
    private javax.swing.JTextField allowanceResultField;
    private javax.swing.JButton checkBtn;
    private javax.swing.JTextField divisionResultField;
    private javax.swing.JTextField inputAllowanceLabel;
    private javax.swing.JTextField inputMainSalaryLabel;
    private javax.swing.JTextField inputNIPLabel;
    private javax.swing.JTextField inputOvertimeLabel;
    private javax.swing.JTextField insuranceResultField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField mainSalaryResultField;
    private javax.swing.JTextField nameResultField;
    private javax.swing.JTextField overtimeResultField;
    private javax.swing.JLabel previousPageLabel;
    private javax.swing.JTextField saralyMinInsuranceField;
    private javax.swing.JButton saveSalaryBtn;
    private javax.swing.JTextField totalSalaryResultField;
    // End of variables declaration//GEN-END:variables
}
