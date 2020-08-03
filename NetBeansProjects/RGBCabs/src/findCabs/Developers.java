package findCabs;

import static findCabs.home.UserID;
import static findCabs.persDetails.UserID;

public class Developers extends javax.swing.JFrame {

    static String UserID;

    public Developers(String name) {
        UserID = name;
        initComponents();
        this.setSize(1920, 1080);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        homeTab1 = new javax.swing.JMenu();
        bookTab1 = new javax.swing.JMenu();
        persTab1 = new javax.swing.JMenu();
        aboutMenu1 = new javax.swing.JMenu();
        logoutMenu = new javax.swing.JMenu();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 48));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Development Team");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(140, 430, 1620, 60);
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 48));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Shivang Singh");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(1310, 810, 300, 60);
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 48));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Nishit Chouhan");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(290, 820, 390, 60);
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 48));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Harshvardhan Jha");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(1260, 100, 410, 60);
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 48));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Deepak George");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(320, 110, 330, 56);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/findCabs/aboutusbg.jpg")));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1920, 960);
        jMenuBar1.setPreferredSize(new java.awt.Dimension(1920, 126));
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
        pack();
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
            java.util.logging.Logger.getLogger(Developers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Developers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Developers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Developers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Developers(UserID).setVisible(true);
            }
        });
    }

    private javax.swing.JMenu aboutMenu1;

    private javax.swing.JMenu bookTab1;

    private javax.swing.JMenu homeTab1;

    private javax.swing.JLabel jLabel1;

    private javax.swing.JLabel jLabel2;

    private javax.swing.JLabel jLabel3;

    private javax.swing.JLabel jLabel4;

    private javax.swing.JLabel jLabel5;

    private javax.swing.JLabel jLabel6;

    private javax.swing.JMenuBar jMenuBar1;

    private javax.swing.JMenu logoutMenu;

    private javax.swing.JMenu persTab1;

    
}
