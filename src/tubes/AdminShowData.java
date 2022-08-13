package tubes;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class AdminShowData extends javax.swing.JFrame {

    public AdminShowData() {
        initComponents();
    }
    
    private void showDatatoTable() {

        
        DefaultTableModel model = new DefaultTableModel();

        model.addColumn("NO");
        model.addColumn("NIP");
        model.addColumn("Name");
        model.addColumn("Division");
        model.addColumn("Address");
        model.addColumn("Insurance");
        model.addColumn("Passwprd");
        
        try {

            int no = 1;
            String sql = "SELECT * FROM employess";

            java.sql.Connection conn = (Connection) openKoneksi.configDB();
            java.sql.Statement stm = conn.createStatement();

            java.sql.ResultSet res = stm.executeQuery(sql);

            while (res.next()) {

                model.addRow(new Object[]{no++, res.getString(1)
                              , res.getString(2), res.getString(3),
                              res.getString(4), res.getString(5),
                              res.getString(6)});
            }

            employessTable.setModel(model);

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    
    public void clearInput(){
            NIPEdit.setText("");
            nameEdit.setText("");
            insuranceEdit.setText("");
            divisionEdit.setText("");
            addressEdit.setText("");
            passwordEdit.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        employessTable = new javax.swing.JTable();
        showDataBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        NIPEdit = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nameEdit = new javax.swing.JTextField();
        divisionEdit = new javax.swing.JTextField();
        addressEdit = new javax.swing.JTextField();
        insuranceEdit = new javax.swing.JTextField();
        passwordEdit = new javax.swing.JTextField();
        clearBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        previousPage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel1.setText("Company Employes Data");

        employessTable.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        employessTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NO", "NIP", "NAME", "DIVISION", "ADDRESS", "INSURANCE", "PASSWORD"
            }
        ));
        employessTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employessTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(employessTable);

        showDataBtn.setBackground(new java.awt.Color(255, 204, 0));
        showDataBtn.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        showDataBtn.setForeground(new java.awt.Color(255, 255, 255));
        showDataBtn.setText("SHOW");
        showDataBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showDataBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel2.setText("NIP");

        NIPEdit.setEditable(false);
        NIPEdit.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel3.setText("NAME");

        jLabel4.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel4.setText("DIVISION");

        jLabel5.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel5.setText("ADDRESS");

        jLabel6.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel6.setText("INSURANCE");

        jLabel7.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel7.setText("PASSWORD");

        nameEdit.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        nameEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameEditActionPerformed(evt);
            }
        });

        divisionEdit.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        addressEdit.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        addressEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressEditActionPerformed(evt);
            }
        });

        insuranceEdit.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        passwordEdit.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        clearBtn.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        clearBtn.setText("CLEAR");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        saveBtn.setBackground(new java.awt.Color(255, 204, 0));
        saveBtn.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        saveBtn.setForeground(new java.awt.Color(255, 255, 255));
        saveBtn.setText("SAVE CHANGE");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        previousPage.setText("< Previous Page");
        previousPage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                previousPageMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addressEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(divisionEdit))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NIPEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(passwordEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(insuranceEdit)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nameEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(saveBtn)
                            .addComponent(previousPage))
                        .addGap(9, 9, 9))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(showDataBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {NIPEdit, addressEdit, divisionEdit, insuranceEdit, nameEdit, passwordEdit});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {clearBtn, saveBtn});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(showDataBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(NIPEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(divisionEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(addressEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(nameEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(insuranceEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(passwordEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(saveBtn)))
                .addGap(35, 35, 35)
                .addComponent(previousPage)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {NIPEdit, addressEdit, divisionEdit, insuranceEdit, nameEdit, passwordEdit});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {clearBtn, saveBtn});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showDataBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showDataBtnActionPerformed
        showDatatoTable();
    }//GEN-LAST:event_showDataBtnActionPerformed

    private void addressEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressEditActionPerformed
    }//GEN-LAST:event_addressEditActionPerformed

    private void nameEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameEditActionPerformed
    }//GEN-LAST:event_nameEditActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        try {
            
            String sql = "UPDATE employess SET NIP ='" + NIPEdit.getText() 
                          + "',name='" + nameEdit.getText() 
                          + "',division='" + divisionEdit.getText() 
                          + "',address='" + addressEdit.getText() 
                          + "',insurance='" + insuranceEdit.getText() 
                          + "',password='" + passwordEdit.getText()  
                          + "' WHERE nip = '" + NIPEdit.getText() + "'";

            java.sql.Connection conn = (Connection) openKoneksi.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();

            if (NIPEdit.getText().equals("") || nameEdit.getText().equals("") 
                          || divisionEdit.getText().equals("")
                          || addressEdit.getText().equals("") 
                          || insuranceEdit.getText().equals("") 
                          || passwordEdit.getText().equals("")) {

                JOptionPane.showMessageDialog(this, "No Empty Data Allowed!");
                return;
            }

            JOptionPane.showMessageDialog(this, "Success...");
            clearInput();
            
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void employessTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employessTableMouseClicked
        int row = employessTable.rowAtPoint(evt.getPoint());

        String nip = employessTable.getValueAt(row, 1).toString();
        NIPEdit.setText(nip);
        
        String name = employessTable.getValueAt(row, 2).toString();
        nameEdit.setText(name);

        String division = employessTable.getValueAt(row, 3).toString();
        divisionEdit.setText(division);

        //ini untuk edit alamat
        String address = employessTable.getValueAt(row, 4).toString();
        addressEdit.setText(address);

        //ini untuk edit email
        String insurance = employessTable.getValueAt(row, 5).toString();
        insuranceEdit.setText(insurance);

        //ini untuk edit telpon
        String password = employessTable.getValueAt(row, 6).toString();
        passwordEdit.setText(password);
        
    }//GEN-LAST:event_employessTableMouseClicked

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        clearInput();
    }//GEN-LAST:event_clearBtnActionPerformed

    private void previousPageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previousPageMouseClicked
        AdminInputData previous = new AdminInputData();
        previous.setVisible(true);
        previous.pack();
        previous.setLocationRelativeTo(null);
        previous.setDefaultCloseOperation(OptionForm.EXIT_ON_CLOSE);
        dispose();
    }//GEN-LAST:event_previousPageMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminShowData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NIPEdit;
    private javax.swing.JTextField addressEdit;
    private javax.swing.JButton clearBtn;
    private javax.swing.JTextField divisionEdit;
    private javax.swing.JTable employessTable;
    private javax.swing.JTextField insuranceEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameEdit;
    private javax.swing.JTextField passwordEdit;
    private javax.swing.JLabel previousPage;
    private javax.swing.JLabel previousPageLabel;
    private javax.swing.JLabel previousPageLabel1;
    private javax.swing.JLabel previousPageLabel2;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton showDataBtn;
    // End of variables declaration//GEN-END:variables
}
