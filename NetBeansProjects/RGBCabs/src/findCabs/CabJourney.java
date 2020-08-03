package findCabs;

import java.lang.Thread;
import static findCabs.BookFrame.UserID;
import javax.swing.JOptionPane;

public class CabJourney extends javax.swing.JFrame {

    static String vehicleID;

    static String UserID;

    static double fare;

    static String pickUp;

    static String destination;

    static String driverName;

    public CabJourney() {
        initComponents();
    }

    public CabJourney(String VehicleID, String UserID, double fare, String pickUp, String destination, String driverName) {
        initComponents();
        this.UserID = UserID;
        this.vehicleID = VehicleID;
        this.fare = fare;
        this.pickUp = pickUp;
        this.destination = destination;
        this.driverName = driverName;
        this.setSize(1920, 1080);
        this.setResizable(false);
        updateText(vehicleID, fare, driverName);
    }

    public void updateText(String VehicleID, double fare, String driverName) {
        Cursor c = new Cursor();
        double rating = c.getoRating(VehicleID);
        String trating = Double.toString(rating);
        String tfare = Double.toString(fare);
        String time = Double.toString((fare * 30) / 1000);
        String contact = c.getDriverNumber(VehicleID);
        nameField.setText(driverName);
        rateField.setText(trating);
        fareField.setText(tfare);
        timeField.setText(time);
        contactField.setText(contact);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        nameField = new javax.swing.JTextField();
        contactField = new javax.swing.JTextField();
        rateField = new javax.swing.JTextField();
        fareField = new javax.swing.JTextField();
        timeField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        startTrip = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        setSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);
        nameField.setEditable(false);
        nameField.setFont(new java.awt.Font("Yu Gothic UI", 1, 24));
        nameField.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });
        getContentPane().add(nameField);
        nameField.setBounds(810, 130, 270, 40);
        contactField.setEditable(false);
        contactField.setFont(new java.awt.Font("Yu Gothic UI", 1, 24));
        contactField.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactFieldActionPerformed(evt);
            }
        });
        getContentPane().add(contactField);
        contactField.setBounds(810, 170, 270, 40);
        rateField.setEditable(false);
        rateField.setFont(new java.awt.Font("Yu Gothic UI", 1, 24));
        rateField.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rateFieldActionPerformed(evt);
            }
        });
        getContentPane().add(rateField);
        rateField.setBounds(810, 210, 270, 40);
        fareField.setEditable(false);
        fareField.setFont(new java.awt.Font("Yu Gothic UI", 1, 24));
        fareField.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fareFieldActionPerformed(evt);
            }
        });
        getContentPane().add(fareField);
        fareField.setBounds(810, 250, 270, 40);
        timeField.setEditable(false);
        timeField.setFont(new java.awt.Font("Yu Gothic UI", 1, 24));
        timeField.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeFieldActionPerformed(evt);
            }
        });
        getContentPane().add(timeField);
        timeField.setBounds(810, 290, 270, 40);
        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 36));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Your Trip Details:");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(650, 40, 330, 80);
        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 24));
        jLabel3.setText("Driver Name        :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(560, 130, 210, 40);
        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 1, 24));
        jLabel5.setText("Approx. Duration :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(560, 290, 210, 40);
        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 1, 24));
        jLabel6.setText("Rating                  :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(560, 210, 210, 40);
        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 1, 24));
        jLabel7.setText("Estimated Fare     :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(560, 250, 210, 40);
        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 1, 24));
        jLabel4.setText("Phone Number    :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(560, 170, 210, 40);
        startTrip.setFont(new java.awt.Font("Yu Gothic", 1, 30));
        startTrip.setText("Start Trip");
        startTrip.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startTripActionPerformed(evt);
            }
        });
        getContentPane().add(startTrip);
        startTrip.setBounds(640, 350, 350, 70);
        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 0, 24));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/findCabs/taxi.gif")));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1920, 1090);
        pack();
    }

    private void startTripActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        new java.util.Timer().schedule(new java.util.TimerTask() {

            @Override
            public void run() {
                new RatingFrame(vehicleID, UserID, fare, pickUp, destination, driverName).setVisible(true);
            }
        }, 5000);
    }

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void contactFieldActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void rateFieldActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void fareFieldActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void timeFieldActionPerformed(java.awt.event.ActionEvent evt) {
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
            java.util.logging.Logger.getLogger(CabJourney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CabJourney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CabJourney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CabJourney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new CabJourney().setVisible(true);
            }
        });
    }

    private javax.swing.JTextField contactField;

    private javax.swing.JTextField fareField;

    private javax.swing.JLabel jLabel1;

    private javax.swing.JLabel jLabel2;

    private javax.swing.JLabel jLabel3;

    private javax.swing.JLabel jLabel4;

    private javax.swing.JLabel jLabel5;

    private javax.swing.JLabel jLabel6;

    private javax.swing.JLabel jLabel7;

    private javax.swing.JTextField nameField;

    private javax.swing.JTextField rateField;

    private javax.swing.JButton startTrip;

    private javax.swing.JTextField timeField;

}
