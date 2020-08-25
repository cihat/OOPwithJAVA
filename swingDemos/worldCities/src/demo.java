
import java.util.ArrayList;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Cihat
 */
public class demo extends javax.swing.JFrame {

  DefaultTableModel model;

  public demo() {
    initComponents();
    populateTable();
  }

  public void populateTable() {
        model = (DefaultTableModel) tblCities.getModel();
        model.setRowCount(0);
        try {
      ArrayList<City> cities = getCities();
      for (City city : cities) {
        Object[] row = {city.getId(), city.getName(), city.getCountryCode(),
          city.getDistrict(), city.getPopulation()};
        model.addRow(row);
      }
    } catch (SQLException ex) {

    }
  }

  public ArrayList<City> getCities() throws SQLException {
    Connection connection = null;
    DbHelper dbHelper = new DbHelper();
    Statement statement = null;
    ResultSet resultSet;
    ArrayList<City> cities = null;
    try {
      connection = dbHelper.getConnection();
      statement = connection.createStatement();
      resultSet = statement.executeQuery("select * from world.City");
      cities = new ArrayList<City>();
      while (resultSet.next()) {
        cities.add(new City(resultSet.getInt("ID"),
                resultSet.getString("Name"),
                resultSet.getString("CountryCode"),
                resultSet.getString("District"),
                resultSet.getInt("Population")
        ));
      }
    } catch (SQLException exception) {
      dbHelper.showErrorMessage(exception);
    } finally {
      statement.close();
    }
    return cities;
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jScrollPane1 = new javax.swing.JScrollPane();
    tblCities = new javax.swing.JTable();
    txtSearch = new javax.swing.JTextField();
    lblSearch = new javax.swing.JLabel();
    lblName = new javax.swing.JLabel();
    lblCountryCode = new javax.swing.JLabel();
    tbxName = new javax.swing.JTextField();
    tbxCountryCode = new javax.swing.JTextField();
    btnAdd = new javax.swing.JButton();
    lblDistrict = new javax.swing.JLabel();
    lblPopulation = new javax.swing.JLabel();
    tbxDistrict = new javax.swing.JTextField();
    tbxPopulation = new javax.swing.JTextField();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    tblCities.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "ID", "Name", "Country", "District", "Population"
      }
    ) {
      Class[] types = new Class [] {
        java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
      };
      boolean[] canEdit = new boolean [] {
        false, false, false, false, false
      };

      public Class getColumnClass(int columnIndex) {
        return types [columnIndex];
      }

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    jScrollPane1.setViewportView(tblCities);
    if (tblCities.getColumnModel().getColumnCount() > 0) {
      tblCities.getColumnModel().getColumn(0).setResizable(false);
      tblCities.getColumnModel().getColumn(1).setResizable(false);
      tblCities.getColumnModel().getColumn(2).setResizable(false);
      tblCities.getColumnModel().getColumn(3).setResizable(false);
      tblCities.getColumnModel().getColumn(4).setResizable(false);
    }

    txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyReleased(java.awt.event.KeyEvent evt) {
        txtSearchKeyReleased(evt);
      }
    });

    lblSearch.setText("Arama İfadesi : ");

    lblName.setText("Şehir İsmi");

    lblCountryCode.setText("Ülke Kodu ");

    btnAdd.setText("Ekle");
    btnAdd.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnAddActionPerformed(evt);
      }
    });

    lblDistrict.setText("Bölge");

    lblPopulation.setText("Nüfüs");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(51, 51, 51)
        .addComponent(lblSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap(33, Short.MAX_VALUE)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(41, Short.MAX_VALUE))
      .addGroup(layout.createSequentialGroup()
        .addGap(62, 62, 62)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(lblCountryCode)
          .addComponent(lblName))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(tbxCountryCode)
          .addComponent(tbxName, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          .addGroup(layout.createSequentialGroup()
            .addGap(78, 78, 78)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(lblPopulation)
              .addComponent(lblDistrict))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(tbxPopulation)
              .addComponent(tbxDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(lblSearch)
          .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(tbxName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(tbxDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(lblDistrict)))
              .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(lblName)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(lblCountryCode)
              .addComponent(tbxCountryCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addGroup(layout.createSequentialGroup()
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(lblPopulation)
              .addComponent(tbxPopulation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        .addGap(18, 18, 18)
        .addComponent(btnAdd)
        .addGap(43, 43, 43))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
    String searchKey = txtSearch.getText();
    TableRowSorter<DefaultTableModel> tableRowSorter = new TableRowSorter<DefaultTableModel>(model);
    tblCities.setRowSorter(tableRowSorter);
    tableRowSorter.setRowFilter(RowFilter.regexFilter(searchKey));
  }//GEN-LAST:event_txtSearchKeyReleased

  private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
    Connection connection = null;
    DbHelper dbHelper = new DbHelper();
    PreparedStatement statement = null;
    try {
      connection = dbHelper.getConnection();
      String sql = "insert into world.city (Name,CountryCode,District,Population ) values(?, ?, ?, ?)";
      statement = connection.prepareStatement(sql);
      statement.setString(1, tbxName.getText());
      statement.setString(2, tbxCountryCode.getText());
      statement.setString(3, tbxDistrict.getText());
      statement.setInt(4, Integer.valueOf(tbxPopulation.getText()));
      int result = statement.executeUpdate();
      populateTable();
    } catch (SQLException exception) {
      dbHelper.showErrorMessage(exception);
    } finally {
      try {
        statement.close();
        connection.close();
      } catch (SQLException ex) {
      }
    }
  }//GEN-LAST:event_btnAddActionPerformed

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
      java.util.logging.Logger.getLogger(demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new demo().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnAdd;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JLabel lblCountryCode;
  private javax.swing.JLabel lblDistrict;
  private javax.swing.JLabel lblName;
  private javax.swing.JLabel lblPopulation;
  private javax.swing.JLabel lblSearch;
  private javax.swing.JTable tblCities;
  private javax.swing.JTextField tbxCountryCode;
  private javax.swing.JTextField tbxDistrict;
  private javax.swing.JTextField tbxName;
  private javax.swing.JTextField tbxPopulation;
  private javax.swing.JTextField txtSearch;
  // End of variables declaration//GEN-END:variables
}