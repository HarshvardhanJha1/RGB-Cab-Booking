package findCabs;

import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        this.setSize(1920, 1080);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        label2 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        signupButton = new javax.swing.JButton();
        label1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        userIDLabel = new javax.swing.JLabel();
        userIDField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jPanel1.setLayout(null);
        jPanel2.setBackground(new java.awt.Color(255, 204, 51));
        label2.setFont(new java.awt.Font("Tahoma", 1, 18));
        label2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label2.setText("OR");
        label3.setFont(new java.awt.Font("Tahoma", 3, 18));
        label3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label3.setText("New User ? You should Sign Up !! ");
        signupButton.setFont(new java.awt.Font("Tahoma", 1, 24));
        signupButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/findCabs/button_sign-up (2).png")));
        signupButton.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupButtonMouseClicked(evt);
            }
        });
        label1.setFont(new java.awt.Font("Tahoma", 3, 18));
        label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label1.setText("Already a member ? ");
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24));
        jLabel6.setText("Password :");
        userIDLabel.setFont(new java.awt.Font("Tahoma", 1, 24));
        userIDLabel.setText("Username :");
        userIDField.setFont(new java.awt.Font("Yu Gothic UI", 0, 24));
        userIDField.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userIDFieldActionPerformed(evt);
            }
        });
        passwordField.setFont(new java.awt.Font("Yu Gothic UI", 1, 24));
        passwordField.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        loginButton.setFont(new java.awt.Font("Tahoma", 1, 24));
        loginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/findCabs/button_login.png")));
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButtonMouseClicked(evt);
            }
        });
        loginButton.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(52, 52, 52).addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(userIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(74, 74, 74).addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(userIDField).addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE))))).addGroup(jPanel2Layout.createSequentialGroup().addGap(27, 27, 27).addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(50, 50, 50).addComponent(signupButton, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))).addContainerGap(72, Short.MAX_VALUE)).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE).addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(229, 229, 229)));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(37, 37, 37).addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(signupButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(46, 46, 46).addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(18, 18, 18).addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(48, 48, 48).addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(userIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(userIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(50, 50, 50).addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE).addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(31, 31, 31)));
        jPanel1.add(jPanel2);
        jPanel2.setBounds(610, 210, 780, 640);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/findCabs/wp1898151.jpg")));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1920, 1080);
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1920, Short.MAX_VALUE));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE));
        pack();
    }

    private void userIDFieldActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void signupButtonMouseClicked(java.awt.event.MouseEvent evt) {
        this.setVisible(false);
        this.dispose();
        new signup().setVisible(true);
    }

    private void loginButtonMouseClicked(java.awt.event.MouseEvent evt) {
        String password = new String(passwordField.getPassword());
        if (userIDField.getText().isEmpty() || password.length() == 0) {
            JOptionPane.showMessageDialog(null, "Please Enter the Required Fields");
        } else {
            Cursor c = new Cursor();
            if (c.loginCheck(userIDField.getText(), password) == 1) {
                if (c.checkLogStatus(userIDField.getText(), password) == 0) {
                    c.updateLogStat(userIDField.getText());
                    this.setVisible(false);
                    this.dispose();
                    new home(userIDField.getText()).setVisible(true);
                } else
                    JOptionPane.showMessageDialog(null, "User already logged in");
            } else
                JOptionPane.showMessageDialog(null, "Invalid Username Or Password");
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    private javax.swing.JLabel jLabel1;

    private javax.swing.JLabel jLabel6;

    private javax.swing.JPanel jPanel1;

    private javax.swing.JPanel jPanel2;

    private javax.swing.JLabel label1;

    private javax.swing.JLabel label2;

    private javax.swing.JLabel label3;

    private javax.swing.JButton loginButton;

    private javax.swing.JPasswordField passwordField;

    private javax.swing.JButton signupButton;

    private javax.swing.JTextField userIDField;

    private javax.swing.JLabel userIDLabel;


}
