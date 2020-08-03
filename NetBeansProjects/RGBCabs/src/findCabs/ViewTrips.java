package findCabs;

import static findCabs.persDetails.UserID;
import javax.swing.table.JTableHeader;
import javax.swing.table.*;
import javax.swing.table.DefaultTableModel;
import java.util.*;
import javax.swing.JOptionPane;

public class ViewTrips extends javax.swing.JFrame {

    static String UserID;

    public ViewTrips(String name) {
        UserID = name;
        initComponents();
        this.setSize(1920, 1080);
        this.setResizable(false);
        displayTrips(UserID);
    }

    private void displayTrips(String UserID) {
        DefaultTableModel model = (DefaultTableModel) bookingTable.getModel();
        model.setRowCount(0);
        Cursor conn = new Cursor();
        ArrayList<ArrayList<String>> transactions;
        transactions = conn.getTrips(UserID);
        for (int i = 0; i < transactions.size(); i++) {
            ArrayList<String> row;
            row = transactions.get(i);
            Object input_row[] = { row.get(0), row.get(1), row.get(2), row.get(3), row.get(4) };
            model.insertRow(i, input_row);
        }
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        bookingPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookingTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        homeTab1 = new javax.swing.JMenu();
        bookTab1 = new javax.swing.JMenu();
        persTab1 = new javax.swing.JMenu();
        aboutMenu1 = new javax.swing.JMenu();
        logoutMenu = new javax.swing.JMenu();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        bookingPanel.setLayout(null);
        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        bookingTable.setRowSelectionAllowed(true);
        bookingTable.setColumnSelectionAllowed(false);
        bookingTable.setFont(new java.awt.Font("Tahoma", 1, 18));
        JTableHeader header = bookingTable.getTableHeader();
        header.setFont(header.getFont().deriveFont(24));
        bookingTable.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {}, new String[] { "Pickup", "Destination", "UserID", "VehicleID", "Fare" }) {

            Class[] types = new Class[] { java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class };

            boolean[] canEdit = new boolean[] { false, false, false, false, false };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        bookingTable.setRowHeight(30);
        bookingTable.getTableHeader().setReorderingAllowed(false);
        bookingTable.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookingTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(bookingTable);
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(40, 40, 40).addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1230, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap(40, Short.MAX_VALUE)));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(58, 58, 58).addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap(114, Short.MAX_VALUE)));
        bookingPanel.add(jPanel2);
        jPanel2.setBounds(270, 90, 1310, 680);
        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 36));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("YOUR BOOKING HISTORY ");
        bookingPanel.add(jLabel2);
        jLabel2.setBounds(290, 0, 1222, 90);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/findCabs/tripHistory.jpg")));
        bookingPanel.add(jLabel1);
        jLabel1.setBounds(0, 0, 1920, 960);
        menuBar.setPreferredSize(new java.awt.Dimension(1920, 126));
        homeTab1.setText("<html>&emsp;&emsp;&emsp;HOME</html>");
        homeTab1.setToolTipText("Homepage");
        homeTab1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        homeTab1.setFont(new java.awt.Font("Rockwell", 1, 36));
        homeTab1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        homeTab1.setPreferredSize(new java.awt.Dimension(384, 24));
        homeTab1.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeTab1MouseClicked(evt);
            }
        });
        menuBar.add(homeTab1);
        bookTab1.setText("<html>&emsp;&emsp;&emsp;BOOK</html>");
        bookTab1.setToolTipText("Search for hotels");
        bookTab1.setFont(new java.awt.Font("Rockwell", 1, 36));
        bookTab1.setPreferredSize(new java.awt.Dimension(384, 24));
        bookTab1.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookTab1MouseClicked(evt);
            }
        });
        menuBar.add(bookTab1);
        persTab1.setText("PERSONAL DETAILS");
        persTab1.setToolTipText("View your account details");
        persTab1.setFont(new java.awt.Font("Rockwell", 1, 36));
        persTab1.setPreferredSize(new java.awt.Dimension(384, 24));
        persTab1.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                persTab1MouseClicked(evt);
            }
        });
        menuBar.add(persTab1);
        aboutMenu1.setText("<html>&emsp;&emsp;DEVELOPERS</html>");
        aboutMenu1.setToolTipText("Get to know more about our sites and other services");
        aboutMenu1.setFont(new java.awt.Font("Rockwell", 1, 36));
        aboutMenu1.setPreferredSize(new java.awt.Dimension(384, 24));
        aboutMenu1.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutMenu1MouseClicked(evt);
            }
        });
        menuBar.add(aboutMenu1);
        logoutMenu.setText("<html>&emsp;LOGOUT</html>");
        logoutMenu.setToolTipText("Contact informtation");
        logoutMenu.setFont(new java.awt.Font("Rockwell", 1, 36));
        logoutMenu.setPreferredSize(new java.awt.Dimension(384, 24));
        logoutMenu.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMenuMouseClicked(evt);
            }
        });
        menuBar.add(logoutMenu);
        setJMenuBar(menuBar);
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(bookingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(bookingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        pack();
    }

    private void bookingTableMouseClicked(java.awt.event.MouseEvent evt) {
        int index = bookingTable.getSelectedRow();
        TableModel model = bookingTable.getModel();
        for (int i = 0; i < model.getRowCount(); i++) {
            if (i != index)
                model.setValueAt(false, i, 0);
        }
    }

    private void homeTab1MouseClicked(java.awt.event.MouseEvent evt) {
        this.dispose();
        new home(UserID).setVisible(true);
    }

    private void bookTab1MouseClicked(java.awt.event.MouseEvent evt) {
        Cursor c = new Cursor();
        boolean flag = c.checkMinBal(UserID);
        if (flag) {
            this.dispose();
            new BookFrame(UserID).setVisible(true);
        } else {
            this.dispose();
            new persDetails(UserID).setVisible(true);
        }
    }

    private void persTab1MouseClicked(java.awt.event.MouseEvent evt) {
        this.setVisible(false);
        this.dispose();
        new persDetails(UserID).setVisible(true);
    }

    private void aboutMenu1MouseClicked(java.awt.event.MouseEvent evt) {
        this.dispose();
        new Developers(UserID).setVisible(true);
    }

    private void logoutMenuMouseClicked(java.awt.event.MouseEvent evt) {
        Cursor c = new Cursor();
        c.logoutUpdate(UserID);
        this.setVisible(false);
        this.dispose();
        new Login().setVisible(true);
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewTrips.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewTrips.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewTrips.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewTrips.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ViewTrips(UserID).setVisible(true);
            }
        });
    }

    private javax.swing.JMenu aboutMenu1;

    private javax.swing.JMenu bookTab1;

    private javax.swing.JPanel bookingPanel;

    private javax.swing.JTable bookingTable;

    private javax.swing.JMenu homeTab1;

    private javax.swing.JLabel jLabel1;

    private javax.swing.JLabel jLabel2;

    private javax.swing.JPanel jPanel2;

    private javax.swing.JScrollPane jScrollPane1;

    private javax.swing.JMenu logoutMenu;

    private javax.swing.JMenuBar menuBar;

    private javax.swing.JMenu persTab1;

}
