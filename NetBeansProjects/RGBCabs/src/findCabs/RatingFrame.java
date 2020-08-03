package findCabs;

import javax.swing.JOptionPane;

public class RatingFrame extends javax.swing.JFrame {

    static String vehicleID;

    static String UserID;

    static double fare;

    static String pickUp;

    static String destination;

    double nRating = 0;

    public RatingFrame() {
        initComponents();
    }

    public RatingFrame(String VehicleID, String UserID, double fare, String pickUp, String destination, String driverName) {
        this.UserID = UserID;
        this.vehicleID = VehicleID;
        this.fare = fare;
        this.pickUp = pickUp;
        this.destination = destination;
        initComponents();
        rateMessage1.setText("Please rate your trip with " + driverName);
        rateMessage2.setText(" from Pick Up point " + pickUp + " to Drop point " + destination);
        this.setSize(1920, 1080);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        starGroup = new javax.swing.ButtonGroup();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        rateMessage2 = new javax.swing.JLabel();
        rateMessage1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rateButton = new javax.swing.JButton();
        backGround = new javax.swing.JLabel();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        starGroup.add(jRadioButton1);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(1090, 890, 50, 60);
        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        starGroup.add(jRadioButton2);
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(190, 890, 50, 60);
        jRadioButton3.setBackground(new java.awt.Color(255, 255, 255));
        starGroup.add(jRadioButton3);
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton3);
        jRadioButton3.setBounds(850, 890, 50, 60);
        jRadioButton4.setBackground(new java.awt.Color(255, 255, 255));
        starGroup.add(jRadioButton4);
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton4);
        jRadioButton4.setBounds(630, 890, 50, 60);
        jRadioButton5.setBackground(new java.awt.Color(255, 255, 255));
        starGroup.add(jRadioButton5);
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton5);
        jRadioButton5.setBounds(410, 890, 50, 60);
        rateMessage2.setFont(new java.awt.Font("Yu Gothic UI", 1, 60));
        getContentPane().add(rateMessage2);
        rateMessage2.setBounds(40, 110, 1540, 80);
        rateMessage1.setFont(new java.awt.Font("Yu Gothic UI", 1, 60));
        getContentPane().add(rateMessage1);
        rateMessage1.setBounds(30, 40, 1740, 70);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/findCabs/star.png")));
        jLabel3.setText("jLabel2");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(520, 800, 240, 220);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/findCabs/star.png")));
        jLabel4.setText("jLabel2");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(740, 800, 240, 220);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/findCabs/star.png")));
        jLabel5.setText("jLabel2");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(980, 800, 240, 220);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/findCabs/star.png")));
        jLabel6.setText("jLabel2");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(300, 800, 240, 220);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/findCabs/star.png")));
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 800, 240, 220);
        rateButton.setFont(new java.awt.Font("Yu Gothic UI", 1, 40));
        rateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/findCabs/button_rate (1).png")));
        rateButton.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rateButtonActionPerformed(evt);
            }
        });
        getContentPane().add(rateButton);
        rateButton.setBounds(1420, 881, 300, 99);
        backGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/findCabs/rating.jpg")));
        backGround.setText("jLabel1");
        getContentPane().add(backGround);
        backGround.setBounds(0, 0, 1920, 1050);
        pack();
    }

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        nRating = 1;
    }

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        nRating = 2;
    }

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        nRating = 3;
    }

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        nRating = 4;
    }

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        nRating = 5;
    }

    private void rateButtonActionPerformed(java.awt.event.ActionEvent evt) {
        int flag = 0;
        if (nRating > 0) {
            Cursor c = new Cursor();
            double oRating = c.getoRating(vehicleID);
            int numberOfTrips = c.getNTrips(vehicleID);
            c.updateRating(nRating, oRating, numberOfTrips, vehicleID, UserID, fare, pickUp, destination);
            c.insertIntoTripHistory(vehicleID, UserID, fare, pickUp, destination);
            this.dispose();
            new home(UserID).setVisible(true);
            flag = 1;
        } else {
            JOptionPane.showMessageDialog(null, "Please select a rating checkbutton");
        }
        if (flag == 1) {
            Cursor cur = new Cursor();
            int ttrips = cur.getTTrips();
            System.out.println(ttrips);
            if (ttrips % 5 == 0) {
                cur.realloCab();
            }
        }
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
            java.util.logging.Logger.getLogger(RatingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RatingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RatingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RatingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new RatingFrame().setVisible(true);
            }
        });
    }

    private javax.swing.JLabel backGround;

    private javax.swing.JLabel jLabel2;

    private javax.swing.JLabel jLabel3;

    private javax.swing.JLabel jLabel4;

    private javax.swing.JLabel jLabel5;

    private javax.swing.JLabel jLabel6;

    private javax.swing.JRadioButton jRadioButton1;

    private javax.swing.JRadioButton jRadioButton2;

    private javax.swing.JRadioButton jRadioButton3;

    private javax.swing.JRadioButton jRadioButton4;

    private javax.swing.JRadioButton jRadioButton5;

    private javax.swing.JButton rateButton;

    private javax.swing.JLabel rateMessage1;

    private javax.swing.JLabel rateMessage2;

    private javax.swing.ButtonGroup starGroup;

}
