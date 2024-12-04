import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.math.BigDecimal;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Form extends javax.swing.JFrame {

    
private Connection connection;
    public Form() {
        initComponents();
         connectToDatabase();
        setLocationRelativeTo(null);
    }
private void connectToDatabase() {
        try {
           
            String url = "jdbc:mysql://localhost:3306/inventory";
            String user = "root"; 
            String password = "nemuimors";
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Database connection failed!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void clearFields() {
        ProductIDField.setText("");
        PField.setText("");
        CIDField.setText("");
        PRcField.setText("");
        SField.setText("");
        DField.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        SvBTN = new javax.swing.JButton();
        SrchBTN = new javax.swing.JButton();
        UBTN = new javax.swing.JButton();
        DBTN = new javax.swing.JButton();
        ShwABTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        DField = new javax.swing.JTextField();
        SField = new javax.swing.JTextField();
        PRcField = new javax.swing.JTextField();
        ProductIDField = new javax.swing.JTextField();
        PField = new javax.swing.JTextField();
        CIDField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        SvBTN.setBackground(new java.awt.Color(204, 204, 255));
        SvBTN.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        SvBTN.setText("Save");
        SvBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SvBTNActionPerformed(evt);
            }
        });

        SrchBTN.setBackground(new java.awt.Color(204, 204, 255));
        SrchBTN.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        SrchBTN.setText("Search");
        SrchBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SrchBTNActionPerformed(evt);
            }
        });

        UBTN.setBackground(new java.awt.Color(204, 204, 255));
        UBTN.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        UBTN.setText("Update");
        UBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UBTNActionPerformed(evt);
            }
        });

        DBTN.setBackground(new java.awt.Color(204, 204, 255));
        DBTN.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        DBTN.setText("Delete");
        DBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DBTNActionPerformed(evt);
            }
        });

        ShwABTN.setBackground(new java.awt.Color(204, 204, 255));
        ShwABTN.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        ShwABTN.setText("Show All");
        ShwABTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShwABTNActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Product:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Product ID:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Category ID:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Price:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Stock:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Date:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ShwABTN, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(SrchBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(SvBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(UBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(60, 60, 60))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ProductIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(DField, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(105, 105, 105)
                                    .addComponent(SField, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(PField, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PRcField, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SvBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(ProductIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(PField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SrchBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(CIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(PRcField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ShwABTN, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(SField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(DField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jTable1.setBackground(new java.awt.Color(204, 204, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Product ID", "Product", "Category ID", "Price", "Stock", "Date"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 904, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SvBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SvBTNActionPerformed
try {
        // Validate that fields are not empty
        if (PField.getText().isEmpty() || CIDField.getText().isEmpty() || 
            PRcField.getText().isEmpty() || 
            SField.getText().isEmpty()) { // Removed DField from validation
            JOptionPane.showMessageDialog(this, "Please fill in all fields!", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Exit the method if validation fails
        }

        // Update the query without the date column
        String query = "INSERT INTO products (ProductName, CategoryID, SupplierID, Price, StockQuantity) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement pstmt = connection.prepareStatement(query);

        // Set the values for the placeholders
        pstmt.setString(1, PField.getText()); // ProductName
        pstmt.setInt(2, Integer.parseInt(CIDField.getText())); // CategoryID
        pstmt.setInt(3, Integer.parseInt(ProductIDField.getText())); // SupplierID
        pstmt.setBigDecimal(4, new BigDecimal(PRcField.getText())); // Price
        pstmt.setInt(5, Integer.parseInt(SField.getText())); // StockQuantity

        pstmt.executeUpdate(); // Execute the statement
        JOptionPane.showMessageDialog(this, "Product added successfully.");
        clearFields();
        
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error adding product!", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (NumberFormatException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Please enter valid numeric values!", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_SvBTNActionPerformed

    private void UBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UBTNActionPerformed
       try {
        // Validate that fields are not empty
        if (PField.getText().isEmpty() || CIDField.getText().isEmpty() || 
            ProductIDField.getText().isEmpty() || PRcField.getText().isEmpty() || 
            SField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all fields!", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Exit the method if validation fails
        }

        // Update the product in the Products table
        String updateQuery = "UPDATE Products SET ProductName = ?, CategoryID = ?, Price = ?, StockQuantity = ? WHERE ProductID = ?";
        PreparedStatement pstmt = connection.prepareStatement(updateQuery);

        // Set the values for the placeholders
        pstmt.setString(1, PField.getText()); // ProductName
        pstmt.setInt(2, Integer.parseInt(CIDField.getText())); // CategoryID
        pstmt.setBigDecimal(3, new BigDecimal(PRcField.getText())); // Price
        pstmt.setInt(4, Integer.parseInt(SField.getText())); // StockQuantity
        pstmt.setInt(5, Integer.parseInt(ProductIDField.getText())); // ProductID

        pstmt.executeUpdate(); // Execute the update statement
        JOptionPane.showMessageDialog(this, "Product updated successfully.");
        clearFields();
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error updating product!", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (NumberFormatException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Please enter valid numeric values!", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_UBTNActionPerformed

    private void SrchBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SrchBTNActionPerformed
        try {
        // Validate that the ProductID field is not empty
        if (ProductIDField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a Product ID!", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Exit the method if validation fails
        }

        // Clear existing rows in the table model
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        // Check if the ProductID exists in the Products table
        int productId = Integer.parseInt(ProductIDField.getText());
        String productCheckQuery = "SELECT * FROM products WHERE ProductID = ?";
        PreparedStatement productCheckStmt = connection.prepareStatement(productCheckQuery);
        productCheckStmt.setInt(1, productId);
        ResultSet rsProduct = productCheckStmt.executeQuery();
        
        // If the product exists, populate the table
        if (rsProduct.next()) {
            Object[] rowData = new Object[6];
            rowData[0] = rsProduct.getInt("ProductID"); // ProductID
            rowData[1] = rsProduct.getString("ProductName"); // ProductName
            rowData[2] = rsProduct.getInt("CategoryID"); // CategoryID
            rowData[3] = rsProduct.getBigDecimal("Price"); // Price
            rowData[4] = rsProduct.getInt("StockQuantity"); // StockQuantity
            rowData[5] = rsProduct.getDate("CreatedAt"); // Date (assuming you have a Date column)

            // Add the row to the table model
            model.addRow(rowData);
        } else {
            JOptionPane.showMessageDialog(this, "Product ID not found!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error retrieving product data!", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (NumberFormatException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Please enter a valid numeric Product ID!", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_SrchBTNActionPerformed

    private void DBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DBTNActionPerformed
         try {
        // Validate that the ProductID field is not empty
        if (ProductIDField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a Product ID!", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Exit the method if validation fails
        }

        // Check if the ProductID exists in the Products table
        int productId = Integer.parseInt(ProductIDField.getText());
        String productCheckQuery = "SELECT COUNT(*) FROM Products WHERE ProductID = ?";
        PreparedStatement productCheckStmt = connection.prepareStatement(productCheckQuery);
        productCheckStmt.setInt(1, productId);
        ResultSet rsProduct = productCheckStmt.executeQuery();
        
        if (rsProduct.next() && rsProduct.getInt(1) == 0) {
            JOptionPane.showMessageDialog(this, "Product ID does not exist!", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Exit if the product ID is invalid
        }

        // Delete the product from the Products table
        String deleteQuery = "DELETE FROM Products WHERE ProductID = ?";
        PreparedStatement deleteStmt = connection.prepareStatement(deleteQuery);
        deleteStmt.setInt(1, productId);
        deleteStmt.executeUpdate(); // Execute the delete statement

        JOptionPane.showMessageDialog(this, "Product deleted successfully.");
        clearFields();
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error deleting product!", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (NumberFormatException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Please enter a valid numeric Product ID!", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_DBTNActionPerformed

    private void ShwABTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShwABTNActionPerformed
        try {
        // Clear existing rows in the table model
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        // Query to get all products
        String query = "SELECT * FROM Products";
        PreparedStatement pstmt = connection.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();

        // Loop through the result set and add rows to the table
        while (rs.next()) {
            Object[] rowData = new Object[6];
            rowData[0] = rs.getInt("ProductID"); // ProductID
            rowData[1] = rs.getString("ProductName"); // ProductName
            rowData[2] = rs.getInt("CategoryID"); // CategoryID
            rowData[3] = rs.getBigDecimal("Price"); // Price
            rowData[4] = rs.getInt("StockQuantity"); // StockQuantity
            rowData[5] = rs.getDate("CreatedAt"); // Date (assuming you have a Date column)

            // Add the row to the table model
            model.addRow(rowData);
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error retrieving product data!", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_ShwABTNActionPerformed


    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CIDField;
    private javax.swing.JButton DBTN;
    private javax.swing.JTextField DField;
    private javax.swing.JTextField PField;
    private javax.swing.JTextField PRcField;
    private javax.swing.JTextField ProductIDField;
    private javax.swing.JTextField SField;
    private javax.swing.JButton ShwABTN;
    private javax.swing.JButton SrchBTN;
    private javax.swing.JButton SvBTN;
    private javax.swing.JButton UBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
