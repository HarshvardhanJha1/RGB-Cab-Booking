package findCabs;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class signup extends javax.swing.JFrame {

    public signup() {
        initComponents();
        this.setSize(1920, 1080);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        signup_mainPanel = new java.awt.Panel();
        signUpPanel = new java.awt.Panel();
        jLabel4 = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        confirmPasswordLabel = new javax.swing.JLabel();
        contactLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        confirmPassword = new javax.swing.JPasswordField();
        passwordField = new javax.swing.JPasswordField();
        contactText = new javax.swing.JTextField();
        usernameText = new javax.swing.JTextField();
        emailText = new javax.swing.JTextField();
        resetButton = new javax.swing.JButton();
        signUpButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        userIDText = new javax.swing.JTextField();
        userIDLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        signup_mainPanel.setLayout(null);
        signUpPanel.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/findCabs/button_welcome.png")));
        passwordLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 30));
        passwordLabel.setText("PASSWORD :");
        confirmPasswordLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 30));
        confirmPasswordLabel.setText("CONFIRM PASSWORD :");
        contactLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 30));
        contactLabel.setText("CONTACT :");
        emailLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 30));
        emailLabel.setText("EMAIL ID :");
        usernameLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 30));
        usernameLabel.setText("USERNAME :");
        confirmPassword.setFont(new java.awt.Font("Yu Gothic Medium", 0, 30));
        confirmPassword.setToolTipText("Enter the same password as entered before");
        passwordField.setFont(new java.awt.Font("Yu Gothic Medium", 0, 30));
        passwordField.setToolTipText("Password should be at least 6 characters long.");
        contactText.setFont(new java.awt.Font("Yu Gothic Medium", 0, 30));
        contactText.setToolTipText("Enter a valid contact number");
        contactText.addKeyListener(new java.awt.event.KeyAdapter() {

            public void keyTyped(java.awt.event.KeyEvent evt) {
                contactTextKeyTyped(evt);
            }
        });
        usernameText.setFont(new java.awt.Font("Yu Gothic Medium", 0, 30));
        usernameText.setToolTipText("Enter a Username");
        usernameText.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextActionPerformed(evt);
            }
        });
        emailText.setFont(new java.awt.Font("Yu Gothic Medium", 0, 30));
        emailText.setToolTipText("Enter a valid Email-ID");
        resetButton.setFont(new java.awt.Font("Georgia", 1, 36));
        resetButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/findCabs/button_reset.png")));
        resetButton.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetButtonMouseClicked(evt);
            }
        });
        signUpButton.setFont(new java.awt.Font("Georgia", 1, 36));
        signUpButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/findCabs/button_signup.png")));
        signUpButton.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signUpButtonMouseClicked(evt);
            }
        });
        signUpButton.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpButtonActionPerformed(evt);
            }
        });
        backButton.setFont(new java.awt.Font("Georgia", 1, 36));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/findCabs/button_back.png")));
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButtonMouseClicked(evt);
            }
        });
        backButton.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        userIDText.setFont(new java.awt.Font("Yu Gothic Medium", 0, 30));
        userIDText.setToolTipText("Enter a valid Email-ID");
        userIDLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 30));
        userIDLabel.setText("USER ID :");
        javax.swing.GroupLayout signUpPanelLayout = new javax.swing.GroupLayout(signUpPanel);
        signUpPanel.setLayout(signUpPanelLayout);
        signUpPanelLayout.setHorizontalGroup(signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(signUpPanelLayout.createSequentialGroup().addGap(30, 30, 30).addGroup(signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(signUpPanelLayout.createSequentialGroup().addGroup(signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(signUpPanelLayout.createSequentialGroup().addGroup(signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false).addComponent(usernameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(passwordLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)).addGap(114, 114, 114).addGroup(signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(usernameText).addComponent(passwordField))).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signUpPanelLayout.createSequentialGroup().addGroup(signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(confirmPasswordLabel).addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(contactLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(userIDLabel)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGroup(signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(confirmPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE).addComponent(contactText).addComponent(emailText).addComponent(userIDText)))).addGap(99, 99, 99)).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signUpPanelLayout.createSequentialGroup().addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE).addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(46, 46, 46).addComponent(signUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(30, 30, 30)))).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signUpPanelLayout.createSequentialGroup().addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jLabel4).addGap(191, 191, 191)));
        signUpPanelLayout.setVerticalGroup(signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(signUpPanelLayout.createSequentialGroup().addGap(35, 35, 35).addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(29, 29, 29).addGroup(signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(usernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE).addComponent(usernameText)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(passwordField)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(confirmPassword).addComponent(confirmPasswordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(contactText).addComponent(contactLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(emailText).addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(userIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(userIDLabel)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(resetButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE).addGroup(signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(signUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))).addContainerGap(63, Short.MAX_VALUE)));
        signup_mainPanel.add(signUpPanel);
        signUpPanel.setBounds(510, 40, 870, 750);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/findCabs/taxiwallpaper.jpg")));
        signup_mainPanel.add(jLabel5);
        jLabel5.setBounds(0, 0, 1920, 1080);
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(signup_mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(signup_mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        pack();
    }

    private void usernameTextActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void signUpButtonMouseClicked(java.awt.event.MouseEvent evt) {
        Cursor cur = new Cursor();
        String password = new String(passwordField.getPassword());
        String confirmPass = new String(confirmPassword.getPassword());
        if (usernameText.getText().isEmpty() || password.length() == 0 || confirmPass.length() == 0 || contactText.getText().isEmpty() || emailText.getText().isEmpty() || userIDText.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "All the fields are not present");
        } else {
            if (cur.popMessage(usernameText.getText()) == 1) {
            } else {
                if (password.equals(confirmPass) == false) {
                    JOptionPane.showMessageDialog(null, "password are not same");
                } else if (password.equals(confirmPass) == true) {
                    if (contactText.getText().length() == 10) {
                        if (emailText.getText().indexOf("@") != -1 && emailText.getText().indexOf(".") != -1) {
                            if (cur.checkUser(userIDText.getText()) == 0) {
                                cur.updateTable("insert into SignUp(Name,Password,Contact,EmailID,UserID,Wallet,LogStatus) values('" + usernameText.getText() + "','" + password + "','" + contactText.getText() + "','" + emailText.getText() + "','" + userIDText.getText() + "'," + 0 + "," + 0 + ")");
                                this.setVisible(false);
                                this.dispose();
                                new Login().setVisible(true);
                            } else if (cur.checkUser(userIDText.getText()) == 1) {
                                JOptionPane.showMessageDialog(null, "UserID already exists");
                            }
                        } else
                            JOptionPane.showMessageDialog(null, "Invalid Email ID");
                    } else
                        JOptionPane.showMessageDialog(null, "Invalid Contact number,Please type 10 digits");
                }
            }
        }
    }

    private void resetButtonMouseClicked(java.awt.event.MouseEvent evt) {
        confirmPassword.setText("");
        passwordField.setText("");
        contactText.setText("");
        usernameText.setText("");
        emailText.setText("");
        userIDText.setText("");
    }

    private void contactTextKeyTyped(java.awt.event.KeyEvent evt) {
        char vchar = evt.getKeyChar();
        if (!(Character.isDigit(vchar)) || (vchar == KeyEvent.VK_BACK_SPACE) || (vchar == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }

    private void backButtonMouseClicked(java.awt.event.MouseEvent evt) {
        this.setVisible(false);
        this.dispose();
        new Login().setVisible(true);
    }

    private void signUpButtonActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {
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
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new signup().setVisible(true);
            }
        });
    }

    private javax.swing.JLabel address;

    private javax.swing.JLabel contact;

    private javax.swing.JLabel dob;

    private javax.swing.JLabel email;

    private javax.swing.JButton jButton1;

    private javax.swing.JButton jButton2;

    private javax.swing.JLabel jLabel1;

    private javax.swing.JLabel jLabel2;

    private javax.swing.JLabel jLabel3;

    private javax.swing.JPanel jPanel1;

    private javax.swing.JPasswordField jPasswordField1;

    private javax.swing.JPasswordField jPasswordField2;

    private javax.swing.JScrollPane jScrollPane1;

    private javax.swing.JTextArea jTextArea1;

    private javax.swing.JTextField jTextField1;

    private javax.swing.JTextField jTextField2;

    private javax.swing.JTextField jTextField3;

    private javax.swing.JTextField jTextField4;

    private javax.swing.JLabel password;

    private javax.swing.JLabel re_password;

    private javax.swing.JLabel username;

    private javax.swing.JButton backButton;

    private javax.swing.JPasswordField confirmPassword;

    private javax.swing.JLabel confirmPasswordLabel;

    private javax.swing.JLabel contactLabel;

    private javax.swing.JTextField contactText;

    private javax.swing.JLabel emailLabel;

    private javax.swing.JTextField emailText;

    private javax.swing.JLabel jLabel4;

    private javax.swing.JLabel jLabel5;

    private javax.swing.JPasswordField passwordField;

    private javax.swing.JLabel passwordLabel;

    private javax.swing.JButton resetButton;

    private javax.swing.JButton signUpButton;

    private java.awt.Panel signUpPanel;

    private java.awt.Panel signup_mainPanel;

    private javax.swing.JLabel userIDLabel;

    private javax.swing.JTextField userIDText;

    private javax.swing.JLabel usernameLabel;

    private javax.swing.JTextField usernameText;
}
