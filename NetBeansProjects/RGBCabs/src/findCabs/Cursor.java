package findCabs;

import javax.swing.JOptionPane;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.util.Calendar;
import java.sql.*;
import java.util.*;

public class Cursor {

    public static String url = "jdbc:sqlite:\\C:\\Users\\Shivang\\Documents\\NetBeansProjects\\RGBCabs\\Data\\RGB.sqlite";

    public ArrayList<ArrayList<String>> getTrips(String UserID) {
        Connection conn = null;
        ArrayList<ArrayList<String>> resultArray = new ArrayList<ArrayList<String>>();
        try {
            conn = DriverManager.getConnection(url);
            Statement stmt = (Statement) conn.createStatement();
            String query = "SELECT * FROM TripHistory;";
            ResultSet rst = stmt.executeQuery(query);
            while (rst.next()) {
                if (rst.getString("UserID").equals(UserID) == true) {
                    ArrayList<String> temp = new ArrayList<String>();
                    temp.add(rst.getString(1));
                    temp.add(rst.getString(2));
                    temp.add(rst.getString(3));
                    temp.add(rst.getString(4));
                    double f = rst.getDouble(5);
                    String f2 = Double.toString(f);
                    temp.add(f2);
                    resultArray.add(temp);
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return resultArray;
    }

    public String[] getUserInfo(String UserID) {
        Connection conn = null;
        String[] resultArray = new String[4];
        try {
            conn = DriverManager.getConnection(url);
            Statement stmt = (Statement) conn.createStatement();
            String query = "SELECT * FROM SignUp";
            ResultSet rst = stmt.executeQuery(query);
            resultArray[0] = UserID;
            while (rst.next()) {
                if (rst.getString("UserID").equals(UserID) == true) {
                    String emailid = rst.getString("EmailID");
                    String contact = rst.getString("Contact");
                    String wallet = Float.toString(rst.getFloat("Wallet"));
                    resultArray[1] = emailid;
                    resultArray[2] = contact;
                    resultArray[3] = wallet;
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            return resultArray;
        }
    }

    public int loginCheck(String UserID, String password) {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
            Statement stmt = (Statement) conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM SignUp;");
            while (rs.next()) {
                String s1 = rs.getString("UserID");
                String s2 = rs.getString("Password");
                if (s1.equals(UserID) == true && s2.equals(password) == true) {
                    return 1;
                }
            }
            System.out.println("Connection to SQLite has been established.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return 0;
    }

    public int checkLogStatus(String UserID, String password) {
        Connection conn = null;
        int flag = 1;
        try {
            conn = DriverManager.getConnection(url);
            Statement stmt = (Statement) conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM SignUp WHERE UserID='" + UserID + "';");
            rs.next();
            if (rs.getInt("LogStatus") == 0)
                flag = 0;
            else
                flag = 1;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return flag;
    }

    public int checkUser(String UserID) {
        Connection conn = null;
        int flag = 0;
        try {
            conn = DriverManager.getConnection(url);
            Statement stmt = (Statement) conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM SignUp WHERE UserID='" + UserID + "';");
            if (rs.next())
                flag = 1;
            else
                flag = 0;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return flag;
    }

    public void updateLogStat(String UserID) {
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = DriverManager.getConnection(url);
            stmt = (Statement) conn.createStatement();
            String query = "UPDATE SignUp SET LogStatus = " + 1 + " WHERE UserID = '" + UserID + "';";
            stmt.executeUpdate(query);
            stmt.close();
        } catch (SQLException sq) {
            System.out.println(sq.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public static void logoutUpdate(String UserID) {
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = DriverManager.getConnection(url);
            stmt = (Statement) conn.createStatement();
            String query = "UPDATE SignUp SET LogStatus = " + 0 + " WHERE UserID = '" + UserID + "';";
            stmt.executeUpdate(query);
            stmt.close();
        } catch (SQLException sq) {
            System.out.println(sq.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public static int popMessage(String UserID) {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
            Statement stmt = (Statement) conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM SignUp");
            while (rs.next()) {
                String s = rs.getString("UserID");
                if (s.equals(UserID) == true) {
                    JOptionPane.showMessageDialog(null, "Duplicate UserID Try again");
                    return 1;
                }
            }
            System.out.println("Connection to SQLite Database has been established.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return 0;
    }

    public static void updateTable(String query) {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
            Statement stmt = (Statement) conn.createStatement();
            stmt.execute(query);
            System.out.println("Connection to SQLite has been established.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public static double getWalletBalance(String UserID) {
        Connection conn = null;
        double finbal = 0;
        try {
            conn = DriverManager.getConnection(url);
            Statement stmt = (Statement) conn.createStatement();
            String query = "SELECT * FROM SignUp WHERE UserID = '" + UserID + "';";
            ResultSet rs = stmt.executeQuery(query);
            if (rs.next()) {
                double balance = rs.getDouble("Wallet");
                finbal = balance;
            }
            stmt.close();
            return finbal;
        } catch (SQLException sq) {
            System.out.println(sq.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            return finbal;
        }
    }

    public static boolean checkMinBal(String UserID) {
        Connection conn = null;
        boolean flag = false;
        try {
            conn = DriverManager.getConnection(url);
            Statement stmt = (Statement) conn.createStatement();
            String query = "SELECT * FROM SignUp WHERE UserID = '" + UserID + "';";
            ResultSet rs = stmt.executeQuery(query);
            rs.next();
            double balance = rs.getDouble("Wallet");
            if (balance > 300) {
                flag = true;
            } else {
                flag = false;
            }
            stmt.close();
        } catch (SQLException sq) {
            System.out.println(sq.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            return flag;
        }
    }

    public static void addWallet(double amt, String UserID) {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
            Statement stmt = (Statement) conn.createStatement();
            String query = "SELECT * FROM SignUp WHERE UserID = '" + UserID + "';";
            ResultSet rs = stmt.executeQuery(query);
            rs.next();
            double balance = rs.getDouble("Wallet");
            double newBalance = balance + amt;
            String newQuery = "UPDATE SignUp SET Wallet =" + newBalance + " WHERE UserID ='" + UserID + "';";
            stmt.close();
            Statement stmt2 = (Statement) conn.createStatement();
            stmt2.executeUpdate(newQuery);
            stmt2.close();
        } catch (SQLException sq) {
            System.out.println(sq.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public static String[] availableDrivers() {
        Connection conn = null;
        String drivers[] = new String[15];
        try {
            conn = DriverManager.getConnection(url);
            String query = "SELECT * FROM DriverData WHERE Status =" + 0 + ";";
            Statement stmt = (Statement) conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            int counter = 0;
            while (rs.next()) {
                String vID = rs.getString("VehicleID");
                drivers[counter] = vID;
                counter++;
            }
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            return drivers;
        }
    }

    public static int getTTrips() {
        Connection conn = null;
        int TTrips = 0;
        try {
            conn = DriverManager.getConnection(url);
            String query = "SELECT SUM(Trips) FROM DriverData;";
            Statement stmt = (Statement) conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            rs.next();
            TTrips = rs.getInt("SUM(Trips)");
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            return TTrips;
        }
    }

    public static void realloCab() {
        Connection conn = null;
        String registrationNo;
        try {
            conn = DriverManager.getConnection(url);
            String tempchar;
            char val;
            String aDrivers[] = new String[15];
            aDrivers = availableDrivers();
            for (int i = 0; i < aDrivers.length; i++) {
                registrationNo = aDrivers[i];
                Statement stmt3 = (Statement) conn.createStatement();
                val = (char) ('A' + (i % 5));
                tempchar = String.valueOf(val);
                System.out.println(tempchar);
                String query3 = "UPDATE DriverData SET Location ='" + val + "' WHERE VehicleID ='" + registrationNo + "';";
                System.out.println(query3);
                stmt3.executeUpdate(query3);
                stmt3.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public static void updateWallet(double fare, String UserID, BookFrame bf) {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
            Statement stmt = (Statement) conn.createStatement();
            String query = "SELECT * FROM SignUp WHERE UserID ='" + UserID + "';";
            ResultSet rs = stmt.executeQuery(query);
            rs.next();
            double balance = rs.getDouble("Wallet");
            if (balance > 300) {
                if (balance < fare) {
                    JOptionPane.showMessageDialog(null, "You have insufficient balance. Kindly add more money.");
                    bf.dispose();
                    new persDetails(UserID).setVisible(true);
                } else {
                    double newBalance = balance - fare;
                    String newQuery = "UPDATE SignUp SET Wallet =" + newBalance + " WHERE UserID ='" + UserID + "';";
                    Statement stmt2 = (Statement) conn.createStatement();
                    stmt2.executeUpdate(newQuery);
                    stmt2.close();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Minimum balance is not being maintained. Please add money.");
                bf.dispose();
                new persDetails(UserID).setVisible(true);
            }
            stmt.close();
        } catch (SQLException sq) {
            System.out.println(sq.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public static String selectNextAlloc(String UserID, String closeLocation) {
        Connection conn = null;
        String VehicleID = null;
        try {
            conn = DriverManager.getConnection(url);
            Statement stmt = (Statement) conn.createStatement();
            String query = "SELECT * FROM DriverData WHERE Location='" + closeLocation + "' AND Status =" + 0 + " ORDER BY Rating DESC;";
            ResultSet rs = stmt.executeQuery(query);
            if (rs.next())
                ;
            {
                VehicleID = rs.getString("VehicleID");
            }
            stmt.close();
        } catch (SQLException e) {
            return null;
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            return VehicleID;
        }
    }

    public static void allocUpdater(String VehicleID) {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
            Statement stmt = (Statement) conn.createStatement();
            String query = "UPDATE DriverData SET Status =" + 1 + " WHERE VehicleID='" + VehicleID + "';";
            stmt.executeUpdate(query);
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public static String allocateDrivers(String UserID, String pickup) {
        Connection conn = null;
        int value = 0;
        String registrationNo = null;
        try {
            conn = DriverManager.getConnection(url);
            registrationNo = selectNextAlloc(UserID, pickup);
            if (registrationNo != null) {
                value = 1;
                allocUpdater(registrationNo);
            } else {
                String closeLocation;
                if (value == 0) {
                    if (pickup == "A") {
                        closeLocation = "B";
                        registrationNo = selectNextAlloc(UserID, closeLocation);
                        if (registrationNo != null) {
                            value = 1;
                            allocUpdater(registrationNo);
                        }
                        if (value == 0) {
                            closeLocation = "E";
                            registrationNo = selectNextAlloc(UserID, closeLocation);
                            if (registrationNo != null) {
                                value = 1;
                                allocUpdater(registrationNo);
                            }
                        }
                        if (value == 0) {
                            closeLocation = "D";
                            registrationNo = selectNextAlloc(UserID, closeLocation);
                            if (registrationNo != null) {
                                value = 1;
                                allocUpdater(registrationNo);
                            }
                        }
                        if (value == 0) {
                            closeLocation = "C";
                            registrationNo = selectNextAlloc(UserID, closeLocation);
                            if (registrationNo != null) {
                                value = 1;
                                allocUpdater(registrationNo);
                            }
                        }
                    } else if (pickup == "B") {
                        closeLocation = "E";
                        registrationNo = selectNextAlloc(UserID, closeLocation);
                        if (registrationNo != null) {
                            value = 1;
                            allocUpdater(registrationNo);
                        }
                        if (value == 0) {
                            closeLocation = "A";
                            registrationNo = selectNextAlloc(UserID, closeLocation);
                            if (registrationNo != null) {
                                value = 1;
                                allocUpdater(registrationNo);
                            }
                        }
                        if (value == 0) {
                            closeLocation = "D";
                            registrationNo = selectNextAlloc(UserID, closeLocation);
                            if (registrationNo != null) {
                                value = 1;
                                allocUpdater(registrationNo);
                            }
                        }
                        if (value == 0) {
                            closeLocation = "C";
                            registrationNo = selectNextAlloc(UserID, closeLocation);
                            if (registrationNo != null) {
                                value = 1;
                                allocUpdater(registrationNo);
                            }
                        }
                    } else if (pickup == "C") {
                        closeLocation = "D";
                        registrationNo = selectNextAlloc(UserID, closeLocation);
                        if (registrationNo != null) {
                            value = 1;
                            allocUpdater(registrationNo);
                        }
                        if (value == 0) {
                            closeLocation = "E";
                            registrationNo = selectNextAlloc(UserID, closeLocation);
                            if (registrationNo != null) {
                                value = 1;
                                allocUpdater(registrationNo);
                            }
                        }
                        if (value == 0) {
                            closeLocation = "B";
                            registrationNo = selectNextAlloc(UserID, closeLocation);
                            if (registrationNo != null) {
                                value = 1;
                                allocUpdater(registrationNo);
                            }
                        }
                        if (value == 0) {
                            closeLocation = "A";
                            registrationNo = selectNextAlloc(UserID, closeLocation);
                            if (registrationNo != null) {
                                value = 1;
                                allocUpdater(registrationNo);
                            }
                        }
                    } else if (pickup == "D") {
                        closeLocation = "C";
                        registrationNo = selectNextAlloc(UserID, closeLocation);
                        if (registrationNo != null) {
                            value = 1;
                            allocUpdater(registrationNo);
                        }
                        if (value == 0) {
                            closeLocation = "E";
                            registrationNo = selectNextAlloc(UserID, closeLocation);
                            if (registrationNo != null) {
                                value = 1;
                                allocUpdater(registrationNo);
                            }
                        }
                        if (value == 0) {
                            closeLocation = "B";
                            registrationNo = selectNextAlloc(UserID, closeLocation);
                            if (registrationNo != null) {
                                value = 1;
                                allocUpdater(registrationNo);
                            }
                        }
                        if (value == 0) {
                            closeLocation = "A";
                            registrationNo = selectNextAlloc(UserID, closeLocation);
                            if (registrationNo != null) {
                                value = 1;
                                allocUpdater(registrationNo);
                            }
                        }
                    } else if (pickup == "E") {
                        closeLocation = "D";
                        registrationNo = selectNextAlloc(UserID, closeLocation);
                        if (registrationNo != null) {
                            value = 1;
                            allocUpdater(registrationNo);
                        }
                        if (value == 0) {
                            closeLocation = "B";
                            registrationNo = selectNextAlloc(UserID, closeLocation);
                            if (registrationNo != null) {
                                value = 1;
                                allocUpdater(registrationNo);
                            }
                        }
                        if (value == 0) {
                            closeLocation = "C";
                            registrationNo = selectNextAlloc(UserID, closeLocation);
                            if (registrationNo != null) {
                                value = 1;
                                allocUpdater(registrationNo);
                            }
                        }
                        if (value == 0) {
                            closeLocation = "A";
                            registrationNo = selectNextAlloc(UserID, closeLocation);
                            if (registrationNo != null) {
                                value = 1;
                                allocUpdater(registrationNo);
                            }
                        }
                    }
                }
            }
            if (value == 0) {
                registrationNo = null;
                return registrationNo;
            } else {
                return registrationNo;
            }
        } catch (SQLException e) {
            value = 0;
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public static void updateRating(double nRating, double oRating, int numberOfTrips, String vehicleID, String UserID, double fare, String pickup, String destination) {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
            Statement stmt = (Statement) conn.createStatement();
            double newRating = (nRating + (oRating * numberOfTrips)) / (numberOfTrips + 1);
            String query = "UPDATE DriverData SET Status = " + 0 + ",Location='" + destination + "',Rating=" + newRating + ",Trips = " + (numberOfTrips + 1) + " WHERE VehicleID = '" + vehicleID + "';";
            stmt.executeUpdate(query);
        } catch (SQLException sq) {
            System.out.println(sq.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public static String getDriverName(String vehicleid) {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
            Statement stmt = (Statement) conn.createStatement();
            String query = "SELECT * FROM DriverData WHERE VehicleID ='" + vehicleid + "';";
            ResultSet rs = stmt.executeQuery(query);
            rs.next();
            String driverName = rs.getString("DriverName");
            return driverName;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public static String getDriverNumber(String vehicleid) {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
            Statement stmt = (Statement) conn.createStatement();
            String query = "SELECT * FROM DriverData WHERE VehicleID ='" + vehicleid + "';";
            ResultSet rs = stmt.executeQuery(query);
            rs.next();
            int driverNo = rs.getInt("PhoneNo");
            String driverNumber = Integer.toString(driverNo);
            return driverNumber;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public static double getoRating(String vehicleid) {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
            Statement stmt = (Statement) conn.createStatement();
            String query = "SELECT * FROM DriverData WHERE VehicleID ='" + vehicleid + "';";
            ResultSet rs = stmt.executeQuery(query);
            rs.next();
            double oRating = rs.getDouble("Rating");
            return oRating;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return 0;
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public static int getNTrips(String vehicleid) {
        Connection conn = null;
        int numberOfTrips = 0;
        try {
            conn = DriverManager.getConnection(url);
            Statement stmt = (Statement) conn.createStatement();
            String query = "SELECT * FROM DriverData WHERE VehicleID ='" + vehicleid + "';";
            ResultSet rs = stmt.executeQuery(query);
            rs.next();
            numberOfTrips = rs.getInt("Trips");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return 0;
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            return numberOfTrips;
        }
    }

    public static void insertIntoTripHistory(String vehicleID, String UserID, double fare, String pickup, String destination) {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
            Statement stmt = (Statement) conn.createStatement();
            String query = "INSERT INTO TripHistory values('" + pickup + "','" + destination + "','" + UserID + "','" + vehicleID + "'," + fare + ");";
            stmt.executeUpdate(query);
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
