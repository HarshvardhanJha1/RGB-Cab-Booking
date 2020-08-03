package findCabs;

import static findCabs.persDetails.UserID;
import javax.swing.JOptionPane;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.util.Calendar;
import javax.swing.JPanel;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class BookFrame extends javax.swing.JFrame {

    static String UserID;

    public BookFrame() {
        initComponents();
        this.setSize(1920, 1080);
        this.setResizable(false);
    }

    public BookFrame(String name) {
        UserID = name;
        initComponents();
        this.setSize(1920, 1080);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        toLabel = new javax.swing.JLabel();
        bookButton = new javax.swing.JButton();
        locationComboBox2 = new javax.swing.JComboBox();
        locationComboBox1 = new javax.swing.JComboBox();
        fromLabel1 = new javax.swing.JLabel();
        estButton = new javax.swing.JButton();
        bckgLabel = new javax.swing.JLabel();
        estimate = new javax.swing.JTextField();
        menuBar = new javax.swing.JMenuBar();
        homeTab1 = new javax.swing.JMenu();
        bookTab1 = new javax.swing.JMenu();
        persTab1 = new javax.swing.JMenu();
        aboutMenu1 = new javax.swing.JMenu();
        logoutMenu = new javax.swing.JMenu();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/findCabs/pickup.png")));
        toLabel.setFont(new java.awt.Font("Tahoma", 1, 24));
        toLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/findCabs/destination.png")));
        bookButton.setFont(new java.awt.Font("Tahoma", 1, 24));
        bookButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/findCabs/button_book (1).png")));
        bookButton.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookButtondisplayResults(evt);
            }
        });
        bookButton.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookButtonActionPerformed(evt);
            }
        });
        locationComboBox2.setFont(new java.awt.Font("Tahoma", 1, 18));
        locationComboBox2.setMaximumRowCount(5);
        locationComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C", "D", "E" }));
        locationComboBox2.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationComboBox2ActionPerformed(evt);
            }
        });
        locationComboBox1.setFont(new java.awt.Font("Tahoma", 1, 18));
        locationComboBox1.setMaximumRowCount(5);
        locationComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C", "D", "E" }));
        locationComboBox1.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationComboBox1ActionPerformed(evt);
            }
        });
        fromLabel1.setFont(new java.awt.Font("Tahoma", 1, 24));
        fromLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/findCabs/estimatedFare.png")));
        estButton.setFont(new java.awt.Font("Tahoma", 1, 24));
        estButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/findCabs/button_estimate.png")));
        estButton.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                estButtondisplayResults(evt);
            }
        });
        estButton.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estButtonActionPerformed(evt);
            }
        });
        bckgLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/findCabs/map.jpg")));
        estimate.setEditable(false);
        estimate.setFont(new java.awt.Font("Yu Gothic UI", 1, 40));
        estimate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        estimate.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estimateActionPerformed(evt);
            }
        });
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
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addGap(187, 187, 187).addComponent(estButton, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(bookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(116, 116, 116)).addGroup(layout.createSequentialGroup().addGap(616, 616, 616).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(toLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(fromLabel1)).addGap(30, 30, 30).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(locationComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(locationComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)).addComponent(estimate, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)).addContainerGap(757, Short.MAX_VALUE)).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(bckgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 1920, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap())));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(232, 232, 232).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(locationComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(toLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(layout.createSequentialGroup().addGap(11, 11, 11).addComponent(locationComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))).addGap(18, 18, 18).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(fromLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(estimate, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 346, Short.MAX_VALUE).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(estButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(bookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(170, 170, 170)).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(bckgLabel).addGap(0, 144, Short.MAX_VALUE))));
        pack();
    }

    private void bookButtondisplayResults(java.awt.event.MouseEvent evt) {
    }

    private void locationComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void locationComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void estButtondisplayResults(java.awt.event.MouseEvent evt) {
    }

    private void estButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String pickup = (String) locationComboBox1.getSelectedItem();
        String destination = (String) locationComboBox2.getSelectedItem();
        if (pickup == destination) {
            JOptionPane.showMessageDialog(null, "Please enter different pickup and destination points");
        }
        if (pickup == "A") {
            switch(destination) {
                case "B":
                    estimate.setText("150");
                    break;
                case "C":
                    estimate.setText("430");
                    break;
                case "D":
                    estimate.setText("330");
                    break;
                case "E":
                    estimate.setText("280");
                    break;
            }
        } else if (pickup == "B") {
            switch(destination) {
                case "A":
                    estimate.setText("150");
                    break;
                case "C":
                    estimate.setText("280");
                    break;
                case "D":
                    estimate.setText("180");
                    break;
                case "E":
                    estimate.setText("130");
                    break;
            }
        } else if (pickup == "C") {
            switch(destination) {
                case "A":
                    estimate.setText("430");
                    break;
                case "B":
                    estimate.setText("280");
                    break;
                case "D":
                    estimate.setText("100");
                    break;
                case "E":
                    estimate.setText("210");
                    break;
            }
        } else if (pickup == "D") {
            switch(destination) {
                case "A":
                    estimate.setText("330");
                    break;
                case "B":
                    estimate.setText("180");
                    break;
                case "C":
                    estimate.setText("100");
                    break;
                case "E":
                    estimate.setText("110");
                    break;
            }
        } else {
            switch(destination) {
                case "A":
                    estimate.setText("280");
                    break;
                case "B":
                    estimate.setText("130");
                    break;
                case "C":
                    estimate.setText("210");
                    break;
                case "D":
                    estimate.setText("110");
                    break;
            }
        }
    }

    private void bookButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String pickup = (String) locationComboBox1.getSelectedItem();
        String destination = (String) locationComboBox2.getSelectedItem();
        if (pickup == destination) {
            JOptionPane.showMessageDialog(null, "Please enter different pickup and destination points");
        }
        if (pickup == "A") {
            switch(destination) {
                case "B":
                    estimate.setText("150");
                    break;
                case "C":
                    estimate.setText("430");
                    break;
                case "D":
                    estimate.setText("330");
                    break;
                case "E":
                    estimate.setText("280");
                    break;
            }
        } else if (pickup == "B") {
            switch(destination) {
                case "A":
                    estimate.setText("150");
                    break;
                case "C":
                    estimate.setText("280");
                    break;
                case "D":
                    estimate.setText("180");
                    break;
                case "E":
                    estimate.setText("130");
                    break;
            }
        } else if (pickup == "C") {
            switch(destination) {
                case "A":
                    estimate.setText("430");
                    break;
                case "B":
                    estimate.setText("280");
                    break;
                case "D":
                    estimate.setText("100");
                    break;
                case "E":
                    estimate.setText("210");
                    break;
            }
        } else if (pickup == "D") {
            switch(destination) {
                case "A":
                    estimate.setText("330");
                    break;
                case "B":
                    estimate.setText("180");
                    break;
                case "C":
                    estimate.setText("100");
                    break;
                case "E":
                    estimate.setText("110");
                    break;
            }
        } else if (pickup == "E") {
            switch(destination) {
                case "A":
                    estimate.setText("280");
                    break;
                case "B":
                    estimate.setText("130");
                    break;
                case "C":
                    estimate.setText("210");
                    break;
                case "D":
                    estimate.setText("110");
                    break;
            }
        }
        Cursor c = new Cursor();
        if (c.checkMinBal(UserID) == true) {
            double fare = Double.parseDouble(estimate.getText());
            double temp = c.getWalletBalance(UserID);
            temp = temp - fare;
            if (temp >= 0) {
                String success = c.allocateDrivers(UserID, pickup);
                if (success != null) {
                    JOptionPane.showMessageDialog(null, "Cab has been succesfully allocated");
                    c.updateWallet(fare, UserID, this);
                    String driverName = c.getDriverName(success);
                    this.dispose();
                    new CabJourney(success, UserID, fare, pickup, destination, driverName).setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Cab cannot be allocated right now. Please try again later.");
                    this.dispose();
                    new home(UserID).setVisible(true);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Insufficient balance for trip. Add Money ");
                this.dispose();
                new persDetails(UserID).setVisible(true);
            }
        } else {
            this.dispose();
            new persDetails(UserID).setVisible(true);
        }
    }

    private void estimateActionPerformed(java.awt.event.ActionEvent evt) {
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
            java.util.logging.Logger.getLogger(BookFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new BookFrame().setVisible(true);
            }
        });
    }

    private javax.swing.JMenu aboutMenu1;

    private javax.swing.JLabel bckgLabel;

    private javax.swing.JButton bookButton;

    private javax.swing.JMenu bookTab1;

    private javax.swing.JButton estButton;

    private javax.swing.JTextField estimate;

    private javax.swing.JLabel fromLabel1;

    private javax.swing.JMenu homeTab1;

    private javax.swing.JLabel jLabel1;

    private javax.swing.JComboBox<String> locationComboBox1;

    private javax.swing.JComboBox<String> locationComboBox2;

    private javax.swing.JMenu logoutMenu;

    private javax.swing.JMenuBar menuBar;

    private javax.swing.JMenu persTab1;

    private javax.swing.JLabel toLabel;
}
