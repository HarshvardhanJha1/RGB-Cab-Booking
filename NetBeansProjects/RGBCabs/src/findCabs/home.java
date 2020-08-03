package findCabs;

import static findCabs.persDetails.UserID;
import javax.swing.UIManager;

public class home extends javax.swing.JFrame {

    static String UserID;

    public home(String name) {
        this.UserID = name;
        initComponents();
        this.setSize(1920, 1080);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        homeTab1 = new javax.swing.JMenu();
        bookTab1 = new javax.swing.JMenu();
        persTab1 = new javax.swing.JMenu();
        aboutMenu1 = new javax.swing.JMenu();
        logoutMenu = new javax.swing.JMenu();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 80));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CABS");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(850, 590, 220, 70);
        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 55));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Welcome to ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(810, 450, 610, 70);
        jLabel6.setFont(new java.awt.Font("Rockwell", 1, 80));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("RGB");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(860, 510, 190, 70);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/findCabs/border circle.png")));
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(760, 300, 410, 480);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/findCabs/rgbgiffin.gif")));
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1917, 1080);
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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new home(UserID).setVisible(true);
            }
        });
    }

    private javax.swing.JMenu aboutMenu1;

    private javax.swing.JMenu bookTab1;

    private javax.swing.JMenu homeTab1;

    private javax.swing.JLabel jLabel1;

    private javax.swing.JLabel jLabel2;

    private javax.swing.JLabel jLabel4;

    private javax.swing.JLabel jLabel5;

    private javax.swing.JLabel jLabel6;

    private javax.swing.JMenu logoutMenu;

    private javax.swing.JMenuBar menuBar;

    private javax.swing.JMenu persTab1;

}
