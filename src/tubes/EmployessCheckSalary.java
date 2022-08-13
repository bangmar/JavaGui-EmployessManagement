package tubes;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EmployessCheckSalary extends javax.swing.JFrame{

    public EmployessCheckSalary() {
        initComponents();
    }
    
    
    private void showDatatoTable() {
        
        DefaultTableModel model = new DefaultTableModel();

        model.addColumn("No");
        model.addColumn("NIP");
        model.addColumn("Name");
        model.addColumn("Division");
        model.addColumn("Main Salary");
        model.addColumn("Allowance");
        model.addColumn("Overtime");
        model.addColumn("Total SAlary");
        model.addColumn("Date");
        
        try {

            int no = 1;
            
            String sql = "select * from salarydata where NIP ='" 
                          +  inputNIP.getText() + "'";

            java.sql.Connection conn = (Connection) openKoneksi.configDB();
            java.sql.Statement stm = conn.createStatement();

            java.sql.ResultSet res = stm.executeQuery(sql);
            
            while (res.next()) {
                model.addRow(new Object[]{no++, res.getString(1), res.getString(2)
                              , res.getString(3),res.getString(4), res.getString(5)
                              , res.getString(6) , res.getString(7) 
                              , res.getString(8)});
            }

            salaryTable.setModel(model);
            
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        inputNIP = new javax.swing.JTextField();
        cekData = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        salaryTable = new javax.swing.JTable();
        previousPage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\KULIAH\\MATKUL\\SMT4\\PBO\\Tubes\\src\\img-Icon\\adminIcon2.png")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel2.setText("NIP");

        jLabel4.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel4.setText("Hola Employess !");

        inputNIP.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        inputNIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNIPActionPerformed(evt);
            }
        });

        cekData.setBackground(new java.awt.Color(0, 153, 255));
        cekData.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        cekData.setForeground(new java.awt.Color(255, 255, 255));
        cekData.setText("Check Salary");
        cekData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cekDataActionPerformed(evt);
            }
        });

        salaryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NO", "NIP", "Name", "Division", "Main Salary", "Allowance", "Overtime", "Total Salary", "Date"
            }
        ));
        jScrollPane1.setViewportView(salaryTable);

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
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cekData, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(500, 500, 500)
                        .addComponent(previousPage))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(39, 39, 39)
                            .addComponent(inputNIP, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 758, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(inputNIP, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cekData, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(previousPage))))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputNIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNIPActionPerformed

    }//GEN-LAST:event_inputNIPActionPerformed

    private void cekDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cekDataActionPerformed

        showDatatoTable(); 
    }//GEN-LAST:event_cekDataActionPerformed

    private void previousPageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previousPageMouseClicked
        EmployessLogin previous = new EmployessLogin();
        previous.setVisible(true);
        previous.pack();
        previous.setLocationRelativeTo(null);
        previous.setDefaultCloseOperation(OptionForm.EXIT_ON_CLOSE);
        dispose();
    }//GEN-LAST:event_previousPageMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployessCheckSalary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cekData;
    private javax.swing.JTextField inputNIP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel previousPage;
    private javax.swing.JTable salaryTable;
    // End of variables declaration//GEN-END:variables
}
