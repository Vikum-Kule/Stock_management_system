package UIs;

import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vikum
 */
public class subTotalDiscount extends javax.swing.JFrame {
    
     private static Connection Connection;
    Connection con =null;
    PreparedStatement pst =null;
    ResultSet rs =null;
    DefaultTableModel model = new DefaultTableModel() {
      public Class<?> getColumnClass(int column)
      {
        switch(column)
        {
        case 3:
          return Integer.class;
        case 6:
          return Float.class;
        case 7:
          return Boolean.class;
          
        default:
            return String.class;
        }
      }
    };

    
      
    /**
     * Creates new form subTotalDiscount
     */
    public subTotalDiscount() {
        initComponents();
       
        jTable1.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 12));
        Object col[]= {"Product Code","Brand Name","Item","Qty","Supplier","DateTime","Total","Add"};
       // Object col[].Type={String.class,String.class,String.class,Integer.class,String.class,String.class,Float.class};
        model.setColumnIdentifiers(col);
        jTable1.setModel(model);
        con = Import.ConnectDB();
        updateTable();
        
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
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        totalDis = new javax.swing.JTextField();
        totalSub = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Date\n\n");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Brand Name\n\n");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Bar Code\n");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(102, 0, 102));
        jButton3.setText("Cancel");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 370, 140, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 0, 102));
        jButton2.setText("Reset");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 290, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 0, 102));
        jButton1.setText("Add");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 290, -1, -1));

        totalDis.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(totalDis, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 200, 150, 30));

        totalSub.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(totalSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 90, 150, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Discount");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 160, 150, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Total");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 50, 150, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "null", "lAdd"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(7).setMaxWidth(20);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 730, 350));

        jLabel1.setBackground(new java.awt.Color(136, 88, 142));
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 460));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        this.setVisible(false);
        new Import().setVisible(true);
    }//GEN-LAST:event_jButton3MouseClicked

    public static Connection ConnectDB(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection con= DriverManager.getConnection("jdbc:sqlite:data_from.db");
            return con;
        }
        catch(Exception e){
           
           JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
    
    public void updateTable(){
        con = Import.ConnectDB();
        if(con!= null){
           String sql = "SELECT brandId,brandName,name,supplyQTY,supplyName,supplyDate,total"
                   + " from brand "
                   + "inner join item on brand.itemName = item.name "
                   + "inner join Supplier on brand.supply_regNo = Supplier.Supplier_regNo ";

           try{
                
                pst = con.prepareStatement(sql);
                rs = pst.executeQuery();
                Object[] columnData = new Object[8];
               // System.out.println("eeajasbc");
               
            int i =0;
            while (rs.next()) {
                    
                     model.addRow(new Object[0]);
                        model.setValueAt(rs.getString("brandId"), i, 0);
                        model.setValueAt(rs.getString("brandName"), i, 1);
                        model.setValueAt(rs.getString("name"), i, 2);
                        model.setValueAt(rs.getString("supplyQTY"), i, 3);
                        model.setValueAt(rs.getString("supplyName"), i, 4);
                        model.setValueAt(rs.getString("supplyDate"), i, 5);
                        model.setValueAt(rs.getFloat("total"), i, 6);
                        model.setValueAt(false,i,7);
                    i++;
//                    columnData[0]= rs.getString("brandId");
//                    columnData[1]= rs.getString("brandName");
//                    columnData[2]= rs.getString("name");
//                    columnData[3]= rs.getString("supplyQTY");
//                    columnData[4]= rs.getString("supplyName");
//                    columnData[5]= rs.getString("supplyDate");
//                    columnData[6]= rs.getFloat("total");
//                   // columnData[7].addElement( Boolean.FALSE );
//                    
                   //model.addRow(columnData);
            }
            
//            JCheckBox[] checkBoxList = new JCheckBox[numberCheckBox];
//
//            for(int i = 0; i < numberCheckBox; i++) {
//                checkBoxList[i] = new JCheckBox("CheckBox" + i);
//                yourPanel.add(checkBoxList[i]);
//                model.addRow(columnData);
//            }
            con.close();
           }
           catch(Exception e){
               JOptionPane.showMessageDialog(null, e);
           }
            
        }
        try {   
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
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
            java.util.logging.Logger.getLogger(subTotalDiscount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(subTotalDiscount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(subTotalDiscount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(subTotalDiscount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new subTotalDiscount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField totalDis;
    private javax.swing.JTextField totalSub;
    // End of variables declaration//GEN-END:variables
}