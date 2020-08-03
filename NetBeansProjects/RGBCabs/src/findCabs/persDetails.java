package findCabs;

import static findCabs.home.UserID;
import javax.swing.JOptionPane;

public class persDetails extends javax.swing.JFrame {

    static String UserID;

    public persDetails(String name) {
        this.UserID = name;
        System.out.println(UserID);
        initComponents();
        this.setSize(1920, 1080);
        this.setResizable(false);
        displayInfo(UserID);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jLabel6 = new javax.swing.JLabel();
        profilePanel = new javax.swing.JPanel();
        entryPanel = new javax.swing.JPanel();
        usernameLabel = new javax.swing.JLabel();
        emailidLabel = new javax.swing.JLabel();
        mobileLabel = new javax.swing.JLabel();
        prevTripsButton = new javax.swing.JButton();
        valueofUserID = new javax.swing.JLabel();
        valueofEmailID = new javax.swing.JLabel();
        valueofMobile = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        valueofWallet = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        payCode = new javax.swing.JTextField();
        addMoney = new javax.swing.JButton();
        bckgimageLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        homeTab1 = new javax.swing.JMenu();
        bookTab1 = new javax.swing.JMenu();
        persTab1 = new javax.swing.JMenu();
        aboutMenu1 = new javax.swing.JMenu();
        logoutMenu = new javax.swing.JMenu();
        jMenu1.setText("jMenu1");
        jMenu2.setText("jMenu2");
        jMenu2.setOpaque(true);
        jMenu3.setText("jMenu3");
        jMenu4.setText("jMenu4");
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(-10, 0, 0, 0);
        profilePanel.setPreferredSize(new java.awt.Dimension(1920, 100));
        profilePanel.setLayout(null);
        entryPanel.setBackground(new java.awt.Color(208, 98, 0));
        usernameLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 36));
        usernameLabel.setText("Username                     :");
        emailidLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 36));
        emailidLabel.setText("Email ID                        :");
        mobileLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 36));
        mobileLabel.setText("Mobile                          :");
        prevTripsButton.setBackground(new java.awt.Color(153, 255, 153));
        prevTripsButton.setFont(new java.awt.Font("Yu Gothic UI", 1, 40));
        prevTripsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/findCabs/button_previous-trips.png")));
        prevTripsButton.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prevTripsButtonMouseClicked(evt);
            }
        });
        prevTripsButton.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevTripsButtonActionPerformed(evt);
            }
        });
        valueofUserID.setFont(new java.awt.Font("Yu Gothic UI", 1, 36));
        valueofUserID.setOpaque(false);
        valueofEmailID.setBackground(new java.awt.Color(255, 255, 255));
        valueofEmailID.setFont(new java.awt.Font("Yu Gothic UI", 1, 36));
        valueofEmailID.setOpaque(false);
        valueofMobile.setFont(new java.awt.Font("Yu Gothic UI", 1, 36));
        valueofMobile.setOpaque(false);
        logoutButton.setBackground(new java.awt.Color(255, 0, 0));
        logoutButton.setFont(new java.awt.Font("Yu Gothic UI", 1, 40));
        logoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/findCabs/button_logout.png")));
        logoutButton.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutButtonMouseClicked(evt);
            }
        });
        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 40));
        jLabel1.setText("Wallet                        :");
        valueofWallet.setFont(new java.awt.Font("Yu Gothic UI", 0, 40));
        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 40));
        jLabel3.setText("Enter Amount            :");
        amount.setFont(new java.awt.Font("Yu Gothic UI", 0, 40));
        amount.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountActionPerformed(evt);
            }
        });
        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 1, 40));
        jLabel4.setText("Enter 6 digit code      :");
        payCode.setFont(new java.awt.Font("Yu Gothic UI", 0, 40));
        addMoney.setFont(new java.awt.Font("Yu Gothic UI", 1, 40));
        addMoney.setIcon(new javax.swing.ImageIcon(getClass().getResource("/findCabs/button_add-money.png")));
        addMoney.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMoneyActionPerformed(evt);
            }
        });
        javax.swing.GroupLayout entryPanelLayout = new javax.swing.GroupLayout(entryPanel);
        entryPanel.setLayout(entryPanelLayout);
        entryPanelLayout.setHorizontalGroup(entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(entryPanelLayout.createSequentialGroup().addGap(28, 28, 28).addGroup(entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(entryPanelLayout.createSequentialGroup().addGroup(entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(logoutButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(entryPanelLayout.createSequentialGroup().addGap(18, 18, 18).addGroup(entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(amount, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE).addComponent(payCode, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE).addComponent(valueofWallet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))).addGroup(entryPanelLayout.createSequentialGroup().addGap(53, 53, 53).addComponent(prevTripsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))).addGap(3067, 3067, 3067)).addGroup(entryPanelLayout.createSequentialGroup().addGroup(entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(emailidLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(usernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(mobileLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(entryPanelLayout.createSequentialGroup().addGap(16, 16, 16).addGroup(entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(valueofMobile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(valueofUserID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)).addGap(3067, 3067, 3067)).addGroup(entryPanelLayout.createSequentialGroup().addGap(18, 18, 18).addComponent(valueofEmailID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addContainerGap()))))).addGroup(entryPanelLayout.createSequentialGroup().addGap(504, 504, 504).addComponent(addMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(0, 0, Short.MAX_VALUE)));
        entryPanelLayout.setVerticalGroup(entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(entryPanelLayout.createSequentialGroup().addGap(29, 29, 29).addGroup(entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(usernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE).addComponent(valueofUserID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(emailidLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE).addComponent(valueofEmailID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(mobileLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE).addComponent(valueofMobile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(valueofWallet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE).addComponent(payCode)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE).addComponent(addMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(18, 18, 18).addGroup(entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(logoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(prevTripsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)).addGap(72, 72, 72)));
        profilePanel.add(entryPanel);
        entryPanel.setBounds(510, 40, 910, 740);
        bckgimageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/findCabs/MINCAB.jpg")));
        profilePanel.add(bckgimageLabel);
        bckgimageLabel.setBounds(0, 0, 2470, 980);
        getContentPane().add(profilePanel);
        profilePanel.setBounds(0, 0, 1950, 970);
        jMenuBar1.setPreferredSize(new java.awt.Dimension(1920, 127));
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
        jMenuBar1.add(homeTab1);
        bookTab1.setText("<html>&emsp;&emsp;&emsp;BOOK</html>");
        bookTab1.setToolTipText("Search for hotels");
        bookTab1.setFont(new java.awt.Font("Rockwell", 1, 36));
        bookTab1.setPreferredSize(new java.awt.Dimension(384, 24));
        bookTab1.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookTab1MouseClicked(evt);
            }
        });
        jMenuBar1.add(bookTab1);
        persTab1.setText("PERSONAL DETAILS");
        persTab1.setToolTipText("View your account details");
        persTab1.setFont(new java.awt.Font("Rockwell", 1, 36));
        persTab1.setPreferredSize(new java.awt.Dimension(384, 24));
        persTab1.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                persTab1MouseClicked(evt);
            }
        });
        jMenuBar1.add(persTab1);
        aboutMenu1.setText("<html>&emsp;&emsp;DEVELOPERS</html>");
        aboutMenu1.setToolTipText("Get to know more about our sites and other services");
        aboutMenu1.setFont(new java.awt.Font("Rockwell", 1, 36));
        aboutMenu1.setPreferredSize(new java.awt.Dimension(384, 24));
        aboutMenu1.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(aboutMenu1);
        logoutMenu.setText("<html>&emsp;LOGOUT</html>");
        logoutMenu.setToolTipText("Contact informtation");
        logoutMenu.setFont(new java.awt.Font("Rockwell", 1, 36));
        logoutMenu.setPreferredSize(new java.awt.Dimension(384, 24));
        logoutMenu.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(logoutMenu);
        setJMenuBar(jMenuBar1);
        getAccessibleContext().setAccessibleName("HOME");
        getAccessibleContext().setAccessibleDescription("");
        pack();
    }

    private void displayInfo(String UserID) {
        Cursor conn = new Cursor();
        String[] info;
        info = conn.getUserInfo(UserID);
        valueofUserID.setText(info[0]);
        valueofEmailID.setText(info[1]);
        valueofMobile.setText(info[2]);
        valueofWallet.setText(info[3]);
    }

    private void logoutButtonMouseClicked(java.awt.event.MouseEvent evt) {
        Cursor c = new Cursor();
        c.logoutUpdate(UserID);
        this.setVisible(false);
        this.dispose();
        new Login().setVisible(true);
    }

    private void prevTripsButtonMouseClicked(java.awt.event.MouseEvent evt) {
        this.dispose();
        new ViewTrips(UserID).setVisible(true);
    }

    private void bookTabMouseClicked(java.awt.event.MouseEvent evt) {
        this.dispose();
        new BookFrame(UserID).setVisible(true);
    }

    private void persTabMouseClicked(java.awt.event.MouseEvent evt) {
        this.setVisible(false);
        this.dispose();
        new persDetails(UserID).setVisible(true);
    }

    private void aboutMenuMouseClicked(java.awt.event.MouseEvent evt) {
        this.dispose();
        new Developers(UserID).setVisible(true);
    }

    private void contactMenuMouseClicked(java.awt.event.MouseEvent evt) {
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

    private void prevTripsButtonActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void amountActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void addMoneyActionPerformed(java.awt.event.ActionEvent evt) {
        double amt = Double.parseDouble(amount.getText());
        String str = payCode.getText();
        int len = str.length();
        int dum = 0;
        for (int i = 0; i < len; i++) {
            if ((str.charAt(i) >= 48) && (str.charAt(i) <= 57)) {
                dum++;
            }
        }
        if (len == 6 && dum == 6) {
            if (amt >= 0) {
                Cursor conn = new Cursor();
                conn.addWallet(amt, UserID);
                this.dispose();
                new home(UserID).setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Please enter a positive value to add money ");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please enter a valid 6 digit paytm code ");
        }
    }

    private void homeTab1MouseClicked(java.awt.event.MouseEvent evt) {
        this.dispose();
        new home(UserID).setVisible(true);
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
            java.util.logging.Logger.getLogger(persDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(persDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(persDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(persDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new persDetails(UserID).setVisible(true);
            }
        });
    }

    private javax.swing.JMenu aboutMenu1;

    private javax.swing.JButton addMoney;

    private javax.swing.JTextField amount;

    private javax.swing.JLabel bckgimageLabel;

    private javax.swing.JMenu bookTab1;

    private javax.swing.JLabel emailidLabel;

    private javax.swing.JPanel entryPanel;

    private javax.swing.JMenu homeTab1;

    private javax.swing.JLabel jLabel1;

    private javax.swing.JLabel jLabel3;

    private javax.swing.JLabel jLabel4;

    private javax.swing.JLabel jLabel6;

    private javax.swing.JMenu jMenu1;

    private javax.swing.JMenu jMenu2;

    private javax.swing.JMenu jMenu3;

    private javax.swing.JMenu jMenu4;

    private javax.swing.JMenuBar jMenuBar1;

    private javax.swing.JButton logoutButton;

    private javax.swing.JMenu logoutMenu;

    private javax.swing.JLabel mobileLabel;

    private javax.swing.JTextField payCode;

    private javax.swing.JMenu persTab1;

    private javax.swing.JButton prevTripsButton;

    private javax.swing.JPanel profilePanel;

    private javax.swing.JLabel usernameLabel;

    private javax.swing.JLabel valueofEmailID;

    private javax.swing.JLabel valueofMobile;

    private javax.swing.JLabel valueofUserID;

    private javax.swing.JLabel valueofWallet;

    
}
