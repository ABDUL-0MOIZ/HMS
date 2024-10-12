/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frame;

import hospitalmangmentsystem.DTO;
import hospitalmangmentsystem.Database;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ABDUL MOIZ
 */
public class dashbord extends javax.swing.JFrame {

    /**
     * Creates new form dashbord
     */
    public void Doctorlist() {
        DefaultTableModel model = (DefaultTableModel) doclist.getModel();
        model.setRowCount(0);
        Connection conect;
        try {
            conect = Database.conectDataBase();
            Statement smt = conect.createStatement();
            boolean check = smt.execute("use hms");
            ResultSet rs = smt.executeQuery("Select *from Doctor");
            while (rs.next()) {
                Object[] cols = new Object[5];
                cols[0] = rs.getString("ID");
                cols[1] = rs.getString("Name");
                cols[2] = rs.getString("Edu");
                cols[3] = rs.getString("Disg");
                cols[4] = rs.getString("Salery");
                model.addRow(cols);
            }

            if (check) {
                System.out.print("data shown");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

    }

    public void Doctorlist1() {
        DefaultTableModel model = (DefaultTableModel) doclist1.getModel();
        model.setRowCount(0);
        Connection conect;
        try {
            conect = Database.conectDataBase();
            Statement smt = conect.createStatement();
            boolean check = smt.execute("use hms");
            ResultSet rs = smt.executeQuery("Select *from Doctor");
            while (rs.next()) {
                Object[] cols = new Object[5];
                cols[0] = rs.getString("ID");
                cols[1] = rs.getString("Name");
                cols[2] = rs.getString("Edu");
                cols[3] = rs.getString("Disg");
                cols[4] = rs.getString("Salery");
                model.addRow(cols);
            }

            if (check) {
                System.out.print("data shown");
            }
        } catch (SQLException | ClassNotFoundException ex) {
            System.err.print(ex.getMessage());
        }

    }

    public void Doctorlist4() {
        DefaultTableModel model = (DefaultTableModel) doclist4.getModel();
        model.setRowCount(0);
        Connection conect;
        try {
            conect = Database.conectDataBase();
            Statement smt = conect.createStatement();
            boolean check = smt.execute("use hms");
            ResultSet rs = smt.executeQuery("Select *from Doctor");
            while (rs.next()) {
                Object[] cols = new Object[5];
                cols[0] = rs.getString("ID");
                cols[1] = rs.getString("Name");
                cols[2] = rs.getString("Edu");
                cols[3] = rs.getString("Disg");
                cols[4] = rs.getString("Salery");
                model.addRow(cols);
            }

            if (check) {
                System.out.print("data shown");
            }
        } catch (SQLException | ClassNotFoundException ex) {
            System.err.print(ex.getMessage());
        }

    }

    public void ptlist() {
        DefaultTableModel model = (DefaultTableModel) ptlist.getModel();
        model.setRowCount(0);
        Connection conect;
        try {
            conect = Database.conectDataBase();
            Statement smt = conect.createStatement();
            boolean check = smt.execute("use hms");
            ResultSet rs = smt.executeQuery("Select *from paitent");
            while (rs.next()) {
                Object[] cols = new Object[6];
                cols[0] = rs.getString("ID");
                cols[1] = rs.getString("Doc_ID");
                cols[2] = rs.getString("Name");
                cols[3] = rs.getString("Issue");
                cols[4] = rs.getString("age");
                cols[5] = rs.getString("phno");
                model.addRow(cols);
            }

            if (check) {
                System.out.print("data shown");
            }
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public void ptlist1() {
        DefaultTableModel model = (DefaultTableModel) ptlist1.getModel();
        model.setRowCount(0);
        Connection conect;
        try {
            conect = Database.conectDataBase();
            Statement smt = conect.createStatement();
            boolean check = smt.execute("use hms");
            ResultSet rs = smt.executeQuery("Select *from paitent");
            while (rs.next()) {
                Object[] cols = new Object[6];
                cols[0] = rs.getString("ID");
                cols[1] = rs.getString("Doc_ID");
                cols[2] = rs.getString("Name");
                cols[3] = rs.getString("Issue");
                cols[4] = rs.getString("age");
                cols[5] = rs.getString("phno");
                model.addRow(cols);
            }

            if (check) {
                System.out.print("data shown");
            }
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public void ptlist2() {
        DefaultTableModel model = (DefaultTableModel) ptlist2.getModel();
        model.setRowCount(0);
        Connection conect;
        try {
            conect = Database.conectDataBase();
            Statement smt = conect.createStatement();
            boolean check = smt.execute("use hms");
            ResultSet rs = smt.executeQuery("Select *from paitent");
            while (rs.next()) {
                Object[] cols = new Object[6];
                cols[0] = rs.getString("ID");
                cols[1] = rs.getString("Doc_ID");
                cols[2] = rs.getString("Name");
                cols[3] = rs.getString("Issue");
                cols[4] = rs.getString("age");
                cols[5] = rs.getString("phno");
                model.addRow(cols);
            }

            if (check) {
                System.out.print("data shown");
            }
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public void ptcount() {

        Connection conect;
        try {
            conect = Database.conectDataBase();
            Statement smt = conect.createStatement();
            boolean check = smt.execute("use hms");
            ResultSet rs = smt.executeQuery("Select Count(*) As pcount from paitent;");
            while (rs.next()) {

                pno.setText(rs.getString("pcount"));

            }

            if (check) {
                System.out.print("data shown");
            }
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public void Dcount() {

        Connection conect;
        try {
            conect = Database.conectDataBase();
            Statement smt = conect.createStatement();
            boolean check = smt.execute("use hms");
            ResultSet rs = smt.executeQuery("Select Count(*) As Dcount from Doctor;");
            while (rs.next()) {

                noD.setText(rs.getString("Dcount"));

            }

            if (check) {
                System.out.print("data shown");
            }
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public void apoinmentlist() {
        DefaultTableModel model = (DefaultTableModel) aplist.getModel();
        model.setRowCount(0);
        Connection conect;
        try {
            conect = Database.conectDataBase();
            Statement smt = conect.createStatement();
            boolean check = smt.execute("use hms");
            ResultSet rs = smt.executeQuery("Select *from Apoinment");
            while (rs.next()) {
                Object[] cols = new Object[4];
                cols[0] = rs.getString("ID");
                cols[1] = rs.getString("P_ID");
                cols[2] = rs.getString("D_ID");
                cols[3] = rs.getString("Datetime");

                model.addRow(cols);
            }

            if (check) {
                System.out.print("data shown");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

    }

    public void billlist() {
        DefaultTableModel model = (DefaultTableModel) billlist.getModel();
        model.setRowCount(0);
        Connection conect;
        try {
            conect = Database.conectDataBase();
            Statement smt = conect.createStatement();
            boolean check = smt.execute("use hms");
            ResultSet rs = smt.executeQuery("Select *from bill");
            while (rs.next()) {
                Object[] cols = new Object[5];
                cols[0] = rs.getString("ID");
                cols[1] = rs.getString("AP_ID");
                cols[2] = rs.getString("pid");
                cols[3] = rs.getString("bill");

                model.addRow(cols);
            }

            if (check) {
                System.out.print("data shown");
            }
        } catch (SQLException | ClassNotFoundException ex) {
            System.err.print(ex.getMessage());
        }

    }

    public void apoinmentlist1() {
        DefaultTableModel model = (DefaultTableModel) aplist1.getModel();
        model.setRowCount(0);
        Connection conect;
        try {
            conect = Database.conectDataBase();
            Statement smt = conect.createStatement();
            boolean check = smt.execute("use hms");
            ResultSet rs = smt.executeQuery("Select *from Apoinment");
            while (rs.next()) {
                Object[] cols = new Object[4];
                cols[0] = rs.getString("ID");
                cols[1] = rs.getString("P_ID");
                cols[2] = rs.getString("D_ID");
                cols[3] = rs.getString("Datetime");

                model.addRow(cols);
            }

            if (check) {
                System.out.print("data shown");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

    }

    public dashbord() {
        initComponents();
        Doctorlist();
        Doctorlist1();
        ptlist();
        ptlist1();
        ptlist2();
        Doctorlist4();
        apoinmentlist();
        apoinmentlist1();
        billlist();
        ptcount();
        Dcount();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tabp1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        noD = new javax.swing.JLabel();
        pno = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        doc1 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        pt1 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        ap1 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        ap2 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        ap3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        serch4 = new javax.swing.JTextField();
        serch5 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        doclist4 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        ptlist2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        aplist = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        Dname = new javax.swing.JLabel();
        DID = new javax.swing.JLabel();
        PID = new javax.swing.JLabel();
        Pname = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        tp2 = new javax.swing.JTabbedPane();
        jPanel12 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        doc = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        pt = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        ap = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        serch2 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        doclist1 = new javax.swing.JTable();
        jPanel14 = new javax.swing.JPanel();
        serch3 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        ptlist1 = new javax.swing.JTable();
        jScrollPane10 = new javax.swing.JScrollPane();
        doclist3 = new javax.swing.JTable();
        jLabel45 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        aplist1 = new javax.swing.JTable();
        jTextField20 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        ptlist5 = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        doclist = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        edu = new javax.swing.JTextField();
        Disg = new javax.swing.JTextField();
        sly = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        did = new javax.swing.JLabel();
        serch = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        ptlist = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        Did = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        issue = new javax.swing.JTextField();
        phno = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        ID = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        serch1 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        billlist = new javax.swing.JTable();
        apid = new javax.swing.JTextField();
        pid = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        bill = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(100, 90, 0, 0));
        setFocusable(false);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Home");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Apoinment");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });
        jLabel4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel4KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jLabel4KeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Bill");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Information");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Exit");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Doctor");
        jLabel40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel40MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel40MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel40MouseExited(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("Paitent");
        jLabel41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel41MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel41MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel41MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel40)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel41))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel3)
                .addGap(39, 39, 39)
                .addComponent(jLabel4)
                .addGap(49, 49, 49)
                .addComponent(jLabel6)
                .addGap(47, 47, 47)
                .addComponent(jLabel40)
                .addGap(60, 60, 60)
                .addComponent(jLabel41)
                .addGap(49, 49, 49)
                .addComponent(jLabel5)
                .addGap(55, 55, 55)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 0, 0));

        jLabel1.setBackground(new java.awt.Color(204, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" Hospital Mangment System");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 90)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("+");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(279, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tabp1.setBackground(new java.awt.Color(204, 204, 204));
        tabp1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabp1MouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Doctor :");

        noD.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        noD.setForeground(new java.awt.Color(255, 255, 255));
        noD.setText("null");

        pno.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pno.setForeground(new java.awt.Color(255, 255, 255));
        pno.setText("null");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Paitent :");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Admin Portal");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(noD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pno)
                .addGap(21, 21, 21))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noD)
                    .addComponent(pno)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel19.setBackground(new java.awt.Color(0, 153, 255));
        jPanel19.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 102, 255), new java.awt.Color(0, 102, 255), new java.awt.Color(0, 102, 255), new java.awt.Color(0, 102, 255)));
        jPanel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel19MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel19MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel19MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel19MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel19MouseReleased(evt);
            }
        });

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assist/medical-assistance.png"))); // NOI18N

        doc1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        doc1.setForeground(new java.awt.Color(255, 255, 255));
        doc1.setText("Doctor");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(doc1))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel33)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(doc1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel20.setBackground(new java.awt.Color(0, 153, 255));
        jPanel20.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 102, 255), new java.awt.Color(0, 102, 255), new java.awt.Color(0, 102, 255), new java.awt.Color(0, 102, 255)));
        jPanel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel20MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel20MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel20MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel20MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel20MouseReleased(evt);
            }
        });

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assist/patient.png"))); // NOI18N

        pt1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pt1.setForeground(new java.awt.Color(255, 255, 255));
        pt1.setText("Paitent");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(pt1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel47)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pt1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel21.setBackground(new java.awt.Color(0, 153, 255));
        jPanel21.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 102, 255), new java.awt.Color(0, 102, 255), new java.awt.Color(0, 102, 255), new java.awt.Color(0, 102, 255)));
        jPanel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel21MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel21MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel21MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel21MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel21MouseReleased(evt);
            }
        });

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assist/patient.png"))); // NOI18N
        jLabel48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel48MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel48MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel48MouseExited(evt);
            }
        });

        ap1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ap1.setForeground(new java.awt.Color(255, 255, 255));
        ap1.setText("Apinment");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(ap1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel48)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jLabel48)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ap1)
                .addContainerGap())
        );

        jPanel22.setBackground(new java.awt.Color(0, 153, 255));
        jPanel22.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 102, 255), new java.awt.Color(0, 102, 255), new java.awt.Color(0, 102, 255), new java.awt.Color(0, 102, 255)));
        jPanel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel22MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel22MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel22MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel22MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel22MouseReleased(evt);
            }
        });

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assist/patient.png"))); // NOI18N

        ap2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ap2.setForeground(new java.awt.Color(255, 255, 255));
        ap2.setText("information");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(ap2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel49)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ap2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel23.setBackground(new java.awt.Color(0, 153, 255));
        jPanel23.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 102, 255), new java.awt.Color(0, 102, 255), new java.awt.Color(0, 102, 255), new java.awt.Color(0, 102, 255)));
        jPanel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel23MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel23MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel23MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel23MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel23MouseReleased(evt);
            }
        });

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assist/patient.png"))); // NOI18N

        ap3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ap3.setForeground(new java.awt.Color(255, 255, 255));
        ap3.setText("Bill");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(ap3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ap3))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, Short.MAX_VALUE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(49, 49, 49)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        tabp1.addTab("home", jPanel2);

        jPanel5.setBackground(new java.awt.Color(0, 102, 204));

        serch4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serch4ActionPerformed(evt);
            }
        });
        serch4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                serch4KeyPressed(evt);
            }
        });

        serch5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                serch5KeyPressed(evt);
            }
        });

        doclist4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Name", "Dignation"
            }
        ));
        doclist4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doclist4MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(doclist4);

        ptlist2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Name"
            }
        ));
        ptlist2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ptlist2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(ptlist2);

        aplist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Paitent ID", "Doctor ID", "Date&Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(aplist);

        jButton7.setText("Genrate Apoinment");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Search Doctor");

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Search paitent");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Doctor :");
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel20MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel20MouseExited(evt);
            }
        });

        jLabel52.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("Paitent :");
        jLabel52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel52MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel52MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel52MouseExited(evt);
            }
        });

        Dname.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Dname.setForeground(new java.awt.Color(255, 255, 255));
        Dname.setText("Name");
        Dname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DnameMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DnameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DnameMouseExited(evt);
            }
        });

        DID.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DID.setForeground(new java.awt.Color(255, 255, 255));
        DID.setText("ID");
        DID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DIDMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DIDMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DIDMouseExited(evt);
            }
        });

        PID.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        PID.setForeground(new java.awt.Color(255, 255, 255));
        PID.setText("ID");
        PID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PIDMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PIDMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PIDMouseExited(evt);
            }
        });

        Pname.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Pname.setForeground(new java.awt.Color(255, 255, 255));
        Pname.setText("NAME");
        Pname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PnameMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PnameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PnameMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel38))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(serch4, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jButton7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel20)))))
                .addGap(29, 29, 29)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(DID)
                        .addGap(30, 30, 30)
                        .addComponent(Dname, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel52)
                        .addGap(18, 18, 18)
                        .addComponent(PID)
                        .addGap(28, 28, 28)
                        .addComponent(Pname, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(serch5, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39))
                .addGap(0, 37, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(serch4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(serch5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(44, 44, 44)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jLabel20)
                    .addComponent(jLabel52)
                    .addComponent(Dname)
                    .addComponent(DID)
                    .addComponent(PID)
                    .addComponent(Pname))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabp1.addTab("apoinment", jPanel5);

        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tp2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tp2MouseClicked(evt);
            }
        });

        jPanel12.setBackground(new java.awt.Color(0, 153, 255));

        jPanel16.setBackground(new java.awt.Color(0, 153, 255));
        jPanel16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 102, 255), new java.awt.Color(0, 102, 255), new java.awt.Color(0, 102, 255), new java.awt.Color(0, 102, 255)));
        jPanel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel16MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel16MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel16MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel16MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel16MouseReleased(evt);
            }
        });

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assist/medical-assistance.png"))); // NOI18N

        doc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        doc.setForeground(new java.awt.Color(255, 255, 255));
        doc.setText("Doctor");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(doc))
                    .addComponent(jLabel32))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(doc, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel17.setBackground(new java.awt.Color(0, 153, 255));
        jPanel17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 102, 255), new java.awt.Color(0, 102, 255), new java.awt.Color(0, 102, 255), new java.awt.Color(0, 102, 255)));
        jPanel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel17MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel17MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel17MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel17MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel17MouseReleased(evt);
            }
        });

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assist/patient.png"))); // NOI18N

        pt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pt.setForeground(new java.awt.Color(255, 255, 255));
        pt.setText("Paitent");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(pt)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel18.setBackground(new java.awt.Color(0, 153, 255));
        jPanel18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 102, 255), new java.awt.Color(0, 102, 255), new java.awt.Color(0, 102, 255), new java.awt.Color(0, 102, 255)));
        jPanel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel18MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel18MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel18MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel18MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel18MouseReleased(evt);
            }
        });

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assist/patient.png"))); // NOI18N

        ap.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ap.setForeground(new java.awt.Color(255, 255, 255));
        ap.setText("Apinment");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(ap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel46)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ap)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(318, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, Short.MAX_VALUE))
                .addContainerGap(285, Short.MAX_VALUE))
        );

        tp2.addTab("Home", jPanel12);

        jPanel13.setBackground(new java.awt.Color(0, 153, 255));

        serch2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serch2ActionPerformed(evt);
            }
        });
        serch2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                serch2KeyPressed(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Search");

        doclist1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Education", "Disgination", "Salery"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(doclist1);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(serch2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel35)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(serch2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tp2.addTab("doctor", jPanel13);

        jPanel14.setBackground(new java.awt.Color(204, 0, 0));

        serch3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                serch3KeyPressed(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Search");

        ptlist1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Doctor ID", "Name", "age", "phno"
            }
        ));
        ptlist1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ptlist1MouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(ptlist1);

        doclist3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Education", "Disgination", "Salery"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane10.setViewportView(doclist3);

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Doctor Detail");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(serch3, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel36)))
                        .addGap(0, 190, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45))
                .addGap(16, 16, 16))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(serch3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45))
                .addGap(24, 24, 24)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tp2.addTab("Paitent", jPanel14);

        jPanel15.setBackground(new java.awt.Color(0, 102, 102));

        aplist1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Doctor ID", "Paitent ID", "Date&Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        aplist1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aplist1MouseClicked(evt);
            }
        });
        aplist1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                aplist1KeyPressed(evt);
            }
        });
        jScrollPane9.setViewportView(aplist1);

        jTextField20.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField20KeyPressed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Search");

        ptlist5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Doctor ID", "Name", "age", "phno"
            }
        ));
        jScrollPane11.setViewportView(ptlist5);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                        .addGap(31, 31, 31))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel37))
                            .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tp2.addTab("Apoinment", jPanel15);

        jPanel9.add(tp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 840, 480));

        tabp1.addTab("info", jPanel9);

        jPanel7.setBackground(new java.awt.Color(0, 102, 204));

        doclist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Education", "Disgination", "Salery"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        doclist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doclistMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(doclist);

        jPanel10.setBackground(new java.awt.Color(0, 102, 102));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Name");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Education");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Disgnation");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Salery");

        edu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eduActionPerformed(evt);
            }
        });

        sly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slyActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("ID  :");

        did.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        did.setForeground(new java.awt.Color(255, 255, 255));
        did.setText("auto increment");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(50, 50, 50)
                        .addComponent(did, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                    .addComponent(jLabel17)
                    .addComponent(jLabel16)
                    .addComponent(jLabel14)
                    .addComponent(Name)
                    .addComponent(edu)
                    .addComponent(Disg)
                    .addComponent(sly)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(did, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(edu, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Disg, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sly, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        serch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serchActionPerformed(evt);
            }
        });
        serch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                serchKeyPressed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/add1.png"))); // NOI18N
        jLabel27.setText("ADD");
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel27MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel27MouseExited(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/editing_1.png"))); // NOI18N
        jLabel28.setText("Edit");
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel28MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel28MouseExited(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Search");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(serch, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel30)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel27)
                        .addGap(83, 83, 83)
                        .addComponent(jLabel28)
                        .addGap(94, 94, 94))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(112, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(serch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(jLabel28))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );

        tabp1.addTab("DOCTOR", jPanel7);

        jPanel8.setBackground(new java.awt.Color(0, 153, 153));

        ptlist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Doct ID", "Name", "Issue", "age", "phno"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ptlist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ptlistMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(ptlist);

        jPanel11.setBackground(new java.awt.Color(0, 102, 204));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("DOCTOR ID");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Name");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Issue");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Age");

        Did.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DidActionPerformed(evt);
            }
        });

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        issue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issueActionPerformed(evt);
            }
        });

        phno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phnoActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("phno");

        age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageActionPerformed(evt);
            }
        });

        ID.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ID.setForeground(new java.awt.Color(255, 255, 255));
        ID.setText("auto increament");

        jLabel51.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("ID  :");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Did)
                    .addComponent(name)
                    .addComponent(issue)
                    .addComponent(age)
                    .addComponent(phno)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel26)
                            .addComponent(jLabel23)
                            .addComponent(jLabel22)
                            .addComponent(jLabel21))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel51)
                        .addGap(54, 54, 54)
                        .addComponent(ID, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Did, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(issue, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        serch1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                serch1KeyPressed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Search");

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/add1.png"))); // NOI18N
        jLabel42.setText("ADD");
        jLabel42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel42MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel42MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel42MouseExited(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/editing_1.png"))); // NOI18N
        jLabel43.setText("Edit");
        jLabel43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel43MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel43MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel43MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(serch1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel31)))))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel42)
                        .addGap(113, 113, 113)
                        .addComponent(jLabel43))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(serch1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel43)
                            .addComponent(jLabel42))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
        );

        tabp1.addTab("PAITENT", jPanel8);

        jPanel6.setBackground(new java.awt.Color(0, 102, 102));

        billlist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Bill ID", "Apoinment ID", "petent ID", "Bill"
            }
        ));
        jScrollPane4.setViewportView(billlist);

        apid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apidActionPerformed(evt);
            }
        });

        pid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pidActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(0, 51, 153));
        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Genrate Bill");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Paitent ID");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Apoinment ID");

        jLabel53.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText(" Bill Amount");

        bill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(apid, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(pid, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(78, 78, 78)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bill, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jButton8))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(jLabel24)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel53)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(jButton8)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );

        tabp1.addTab("bill", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tabp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(tabp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void serch4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serch4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serch4ActionPerformed

    private void apidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apidActionPerformed

    private void pidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pidActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        DTO dt = new DTO();
        dt.addBill(Integer.parseInt(apid.getText()), Integer.parseInt(pid.getText()), Integer.parseInt(bill.getText()));
        billlist();

    }//GEN-LAST:event_jButton8ActionPerformed

    private void slyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_slyActionPerformed

    private void eduActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eduActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eduActionPerformed

    private void issueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_issueActionPerformed

    private void ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageActionPerformed

    private void DidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DidActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void phnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phnoActionPerformed

    private void serchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serchActionPerformed

    private void serch2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serch2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serch2ActionPerformed

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        // TODO add your handling code here:
        jLabel3.setBorder(new MatteBorder(0, 0, 4, 0, Color.white));
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        // TODO add your handling code here:
        jLabel3.setBorder(null);
    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel4KeyPressed
        // TODO add your handling code here:
        jLabel4.setBorder(new MatteBorder(0, 0, 4, 0, Color.white));
    }//GEN-LAST:event_jLabel4KeyPressed

    private void jLabel4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel4KeyReleased
        // TODO add your handling code here:
        jLabel4.setBorder(null);
    }//GEN-LAST:event_jLabel4KeyReleased

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        // TODO add your handling code here:
        jLabel5.setBorder(new MatteBorder(0, 0, 4, 0, Color.white));
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        // TODO add your handling code here:
        jLabel5.setBorder(null);
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        // TODO add your handling code here:
        jLabel6.setBorder(new MatteBorder(0, 0, 4, 0, Color.white));
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        // TODO add your handling code here:
        jLabel6.setBorder(null);
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        // TODO add your handling code here:
        jLabel7.setBorder(new MatteBorder(0, 0, 4, 0, Color.white));
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        // TODO add your handling code here:
        jLabel7.setBorder(null);
    }//GEN-LAST:event_jLabel7MouseExited

    private void jLabel40MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel40MouseEntered
        // TODO add your handling code here:
        jLabel40.setBorder(new MatteBorder(0, 0, 4, 0, Color.white));


    }//GEN-LAST:event_jLabel40MouseEntered

    private void jLabel40MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel40MouseExited
        // TODO add your handling code here:
        jLabel40.setBorder(null);
    }//GEN-LAST:event_jLabel40MouseExited

    private void jLabel41MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel41MouseEntered
        // TODO add your handling code here:
        jLabel41.setBorder(new MatteBorder(0, 0, 4, 0, Color.white));
    }//GEN-LAST:event_jLabel41MouseEntered

    private void jLabel41MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel41MouseExited
        // TODO add your handling code here:
        jLabel41.setBorder(null);
    }//GEN-LAST:event_jLabel41MouseExited

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        tabp1.setSelectedIndex(1);
       
       Doctorlist4();
        ptlist2();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        // TODO add your handling code here:
        jLabel4.setBorder(new MatteBorder(0, 0, 4, 0, Color.white));
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        // TODO add your handling code here:
        jLabel4.setBorder(null);
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        tabp1.setSelectedIndex(0);
        ptcount();
        Dcount();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        tabp1.setSelectedIndex(2);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel40MouseClicked
        // TODO add your handling code here:
        tabp1.setSelectedIndex(3);
        Doctorlist();
    }//GEN-LAST:event_jLabel40MouseClicked

    private void jLabel41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel41MouseClicked
        // TODO add your handling code here:
        tabp1.setSelectedIndex(4);
    }//GEN-LAST:event_jLabel41MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        tabp1.setSelectedIndex(5);
    }//GEN-LAST:event_jLabel5MouseClicked
    LocalTime TIME = LocalTime.of(9, 00, 00);
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        DTO dt = new DTO();
        LocalDate date = LocalDate.now();
        String d = date.toString();
        TIME = TIME.plusMinutes(05);
        String t = TIME.toString();
        dt.addApoinment(Integer.parseInt(PID.getText()), Integer.parseInt(DID.getText()), d + "  " + t);
        apoinmentlist();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jLabel27MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseEntered
        // TODO add your handling code here:
        jLabel27.setBorder(new MatteBorder(0, 0, 4, 0, Color.white));
    }//GEN-LAST:event_jLabel27MouseEntered

    private void jLabel27MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseExited
        // TODO add your handling code here:
        jLabel27.setBorder(null);

    }//GEN-LAST:event_jLabel27MouseExited

    private void jLabel28MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseEntered
        // TODO add your handling code here
        jLabel28.setBorder(new MatteBorder(0, 0, 4, 0, Color.white));
    }//GEN-LAST:event_jLabel28MouseEntered

    private void jLabel28MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseExited
        // TODO add your handling code here:
        jLabel28.setBorder(null);
    }//GEN-LAST:event_jLabel28MouseExited

    private void jLabel42MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel42MouseEntered
        // TODO add your handling code here:
        jLabel42.setBorder(new MatteBorder(0, 0, 4, 0, Color.white));
    }//GEN-LAST:event_jLabel42MouseEntered

    private void jLabel42MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel42MouseExited
        // TODO add your handling code here:
        jLabel42.setBorder(null);
    }//GEN-LAST:event_jLabel42MouseExited

    private void jLabel43MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel43MouseEntered
        // TODO add your handling code here:
        jLabel43.setBorder(new MatteBorder(0, 0, 4, 0, Color.white));
    }//GEN-LAST:event_jLabel43MouseEntered

    private void jLabel43MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel43MouseExited
        // TODO add your handling code here:
        jLabel43.setBorder(null);
    }//GEN-LAST:event_jLabel43MouseExited

    private void jPanel16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel16MouseEntered
        // TODO add your handling code here:
        doc.setBorder(new MatteBorder(0, 0, 3, 0, Color.white));
    }//GEN-LAST:event_jPanel16MouseEntered

    private void jPanel16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel16MouseExited
        // TODO add your handling code here:
        doc.setBorder(null);
    }//GEN-LAST:event_jPanel16MouseExited

    private void jPanel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel16MouseClicked
        // TODO add your handling code here:
        tp2.setSelectedIndex(1);
    }//GEN-LAST:event_jPanel16MouseClicked

    private void jPanel16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel16MousePressed
        // TODO add your handling code here:
        jPanel16.setBackground(new Color(0, 102, 255));
    }//GEN-LAST:event_jPanel16MousePressed

    private void jPanel16MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel16MouseReleased
        // TODO add your handling code here:
        jPanel16.setBackground(new Color(0, 153, 255));
    }//GEN-LAST:event_jPanel16MouseReleased

    private void jPanel17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel17MouseEntered
        // TODO add your handling code here:
        pt.setBorder(new MatteBorder(0, 0, 3, 0, Color.white));
    }//GEN-LAST:event_jPanel17MouseEntered

    private void jPanel17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel17MouseExited
        // TODO add your handling code here:
        pt.setBorder(null);
    }//GEN-LAST:event_jPanel17MouseExited

    private void jPanel17MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel17MousePressed
        // TODO add your handling code here:
        jPanel17.setBackground(new Color(0, 102, 255));
    }//GEN-LAST:event_jPanel17MousePressed

    private void jPanel17MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel17MouseReleased
        // TODO add your handling code here:
        jPanel17.setBackground(new Color(0, 153, 255));
    }//GEN-LAST:event_jPanel17MouseReleased

    private void jPanel18MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel18MouseEntered
        // TODO add your handling code here:
        ap.setBorder(new MatteBorder(0, 0, 3, 0, Color.white));
    }//GEN-LAST:event_jPanel18MouseEntered

    private void jPanel18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel18MouseExited
        // TODO add your handling code here:
        ap.setBorder(null);
    }//GEN-LAST:event_jPanel18MouseExited

    private void jPanel18MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel18MousePressed
        // TODO add your handling code here:
        jPanel18.setBackground(new Color(0, 102, 255));
    }//GEN-LAST:event_jPanel18MousePressed

    private void jPanel18MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel18MouseReleased
        // TODO add your handling code here:
        jPanel18.setBackground(new Color(0, 153, 255));
    }//GEN-LAST:event_jPanel18MouseReleased

    private void jPanel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel17MouseClicked
        // TODO add your handling code here:
        tp2.setSelectedIndex(2);
        ptlist1();
    }//GEN-LAST:event_jPanel17MouseClicked

    private void jPanel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel18MouseClicked
        // TODO add your handling code here:
        tp2.setSelectedIndex(3);
        apoinmentlist1();
    }//GEN-LAST:event_jPanel18MouseClicked

    private void jPanel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel19MouseClicked
        // TODO add your handling code here:
        tabp1.setSelectedIndex(3);
        Doctorlist();
    }//GEN-LAST:event_jPanel19MouseClicked

    private void jPanel19MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel19MouseEntered
        // TODO add your handling code here:
        doc1.setBorder(new MatteBorder(0, 0, 3, 0, Color.white));
    }//GEN-LAST:event_jPanel19MouseEntered

    private void jPanel19MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel19MouseExited
        // TODO add your handling code here:
        doc1.setBorder(null);
    }//GEN-LAST:event_jPanel19MouseExited

    private void jPanel19MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel19MousePressed
        // TODO add your handling code here:
        jPanel19.setBackground(new Color(0, 102, 255));
    }//GEN-LAST:event_jPanel19MousePressed

    private void jPanel19MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel19MouseReleased
        // TODO add your handling code here:
        jPanel19.setBackground(new Color(0, 153, 255));
    }//GEN-LAST:event_jPanel19MouseReleased

    private void jPanel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel20MouseClicked
        // TODO add your handling code here:
        tabp1.setSelectedIndex(4);
    }//GEN-LAST:event_jPanel20MouseClicked

    private void jPanel20MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel20MouseEntered
        // TODO add your handling code here:
        pt1.setBorder(new MatteBorder(0, 0, 3, 0, Color.white));
    }//GEN-LAST:event_jPanel20MouseEntered

    private void jPanel20MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel20MouseExited
        // TODO add your handling code here:
        pt1.setBorder(null);
    }//GEN-LAST:event_jPanel20MouseExited

    private void jPanel20MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel20MousePressed
        // TODO add your handling code here:
        jPanel20.setBackground(new Color(0, 102, 255));
    }//GEN-LAST:event_jPanel20MousePressed

    private void jPanel20MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel20MouseReleased
        // TODO add your handling code here:
        jPanel20.setBackground(new Color(0, 153, 255));
    }//GEN-LAST:event_jPanel20MouseReleased

    private void jPanel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel21MouseClicked
        // TODO add your handling code here:
        tabp1.setSelectedIndex(1);
        Doctorlist4();
    }//GEN-LAST:event_jPanel21MouseClicked

    private void jPanel21MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel21MouseEntered
        // TODO add your handling code here:
        ap1.setBorder(new MatteBorder(0, 0, 3, 0, Color.white));
    }//GEN-LAST:event_jPanel21MouseEntered

    private void jPanel21MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel21MouseExited
        // TODO add your handling code here:
        ap1.setBorder(null);
    }//GEN-LAST:event_jPanel21MouseExited

    private void jPanel21MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel21MousePressed
        // TODO add your handling code here:
        jPanel21.setBackground(new Color(0, 102, 255));
    }//GEN-LAST:event_jPanel21MousePressed

    private void jPanel21MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel21MouseReleased
        // TODO add your handling code here:
        jPanel21.setBackground(new Color(0, 153, 255));
    }//GEN-LAST:event_jPanel21MouseReleased

    private void jPanel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel22MouseClicked
        // TODO add your handling code here:
        tabp1.setSelectedIndex(2);
    }//GEN-LAST:event_jPanel22MouseClicked

    private void jPanel22MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel22MouseEntered
        // TODO add your handling code here:
        ap2.setBorder(new MatteBorder(0, 0, 3, 0, Color.white));

    }//GEN-LAST:event_jPanel22MouseEntered

    private void jPanel22MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel22MouseExited
        // TODO add your handling code here:
        ap2.setBorder(null);
    }//GEN-LAST:event_jPanel22MouseExited

    private void jPanel22MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel22MousePressed
        // TODO add your handling code here:
        jPanel22.setBackground(new Color(0, 102, 255));
    }//GEN-LAST:event_jPanel22MousePressed

    private void jPanel22MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel22MouseReleased
        // TODO add your handling code here:
        jPanel22.setBackground(new Color(0, 153, 255));
    }//GEN-LAST:event_jPanel22MouseReleased

    private void jPanel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel23MouseClicked
        // TODO add your handling code here:
        tabp1.setSelectedIndex(5);
    }//GEN-LAST:event_jPanel23MouseClicked

    private void jPanel23MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel23MouseEntered
        // TODO add your handling code here:
        ap3.setBorder(new MatteBorder(0, 0, 3, 0, Color.white));
    }//GEN-LAST:event_jPanel23MouseEntered

    private void jPanel23MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel23MouseExited
        // TODO add your handling code here:
        ap3.setBorder(null);
    }//GEN-LAST:event_jPanel23MouseExited

    private void jPanel23MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel23MousePressed
        // TODO add your handling code here:
        jPanel23.setBackground(new Color(0, 102, 255));
    }//GEN-LAST:event_jPanel23MousePressed

    private void jPanel23MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel23MouseReleased
        // TODO add your handling code here:
        jPanel23.setBackground(new Color(0, 153, 255));
    }//GEN-LAST:event_jPanel23MouseReleased

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel48MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel48MouseEntered
        // TODO add your handling code here:
        ap1.setBorder(new MatteBorder(0, 0, 3, 0, Color.white));
    }//GEN-LAST:event_jLabel48MouseEntered

    private void jLabel48MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel48MouseExited
        // TODO add your handling code here:
        ap1.setBorder(null);
    }//GEN-LAST:event_jLabel48MouseExited

    private void jLabel48MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel48MouseClicked
        // TODO add your handling code here:
        tabp1.setSelectedIndex(1);
    }//GEN-LAST:event_jLabel48MouseClicked

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
        // TODO add your handling code here:
        DTO dt = new DTO();
        try {
            dt.addDoctor(Name.getText(), edu.getText(), Disg.getText(), Double.parseDouble(sly.getText()));
            Doctorlist();
        } catch (NumberFormatException ex) {
            System.err.print(ex.getMessage());
        }
    }//GEN-LAST:event_jLabel27MouseClicked

    private void serchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_serchKeyPressed
        // TODO add your handling code here:
        if (!serch.getText().isEmpty()) {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                DefaultTableModel model = (DefaultTableModel) doclist.getModel();
                model.setRowCount(0);
                Connection conect;
                try {
                    conect = Database.conectDataBase();
                    Statement smt = conect.createStatement();
                    boolean check = smt.execute("use hms");
                    ResultSet rs = smt.executeQuery("Select *from Doctor where name ='" + serch.getText() + "';");
                    while (rs.next()) {
                        Object[] cols = new Object[5];
                        cols[0] = rs.getString("ID");
                        cols[1] = rs.getString("Name");
                        cols[2] = rs.getString("Edu");
                        cols[3] = rs.getString("Disg");
                        cols[4] = rs.getString("Salery");
                        model.addRow(cols);
                    }

                    if (check) {
                        System.out.print("data shown");
                    }
                } catch (SQLException | ClassNotFoundException ex) {
                    System.err.print(ex.getMessage());
                }

            }
        } else {
            Doctorlist();
        }
    }//GEN-LAST:event_serchKeyPressed

    private void doclistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doclistMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) doclist.getModel();
        doclist.getSelectedRow();
        did.setText(model.getValueAt(doclist.getSelectedRow(), 0).toString());
        Name.setText(model.getValueAt(doclist.getSelectedRow(), 1).toString());
        edu.setText(model.getValueAt(doclist.getSelectedRow(), 2).toString());
        Disg.setText(model.getValueAt(doclist.getSelectedRow(), 3).toString());
        sly.setText(model.getValueAt(doclist.getSelectedRow(), 4).toString());

    }//GEN-LAST:event_doclistMouseClicked

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
        // TODO add your handling code here:
        DTO dt = new DTO();
        try {
            dt.updateDoctor(Integer.parseInt(did.getText()), Name.getText(), edu.getText(), Disg.getText(), Double.parseDouble(sly.getText()));
            Doctorlist();
        } catch (NumberFormatException ex) {
            System.err.print(ex.getMessage());
        }

    }//GEN-LAST:event_jLabel28MouseClicked

    private void serch1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_serch1KeyPressed
        // TODO add your handling code here:

        if (!serch1.getText().isEmpty()) {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                DefaultTableModel model = (DefaultTableModel) ptlist.getModel();
                model.setRowCount(0);
                Connection conect;
                try {
                    conect = Database.conectDataBase();
                    Statement smt = conect.createStatement();
                    boolean check = smt.execute("use hms");
                    ResultSet rs = smt.executeQuery("Select *from paitent where Name ='" + serch1.getText() + "';");
                    while (rs.next()) {
                        Object[] cols = new Object[6];
                        cols[0] = rs.getString("ID");
                        cols[1] = rs.getString("Doc_ID");
                        cols[2] = rs.getString("Name");
                        cols[3] = rs.getString("Issue");
                        cols[4] = rs.getString("age");
                        cols[5] = rs.getString("phno");
                        model.addRow(cols);
                    }

                    if (check) {
                        System.out.print("data shown");
                    }
                } catch (SQLException | ClassNotFoundException ex) {
                    System.err.print(ex.getMessage());
                }
            }
        } else {
            ptlist();
        }


    }//GEN-LAST:event_serch1KeyPressed

    private void jLabel42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel42MouseClicked
        // TODO add your handling code here:
        DTO dt = new DTO();
        try {
            dt.addpaitent(Integer.parseInt(Did.getText()), name.getText(), issue.getText(), Integer.parseInt(age.getText()), phno.getText());
            ptlist();
        } catch (NumberFormatException ex) {
            System.err.print(ex.getMessage());
        }


    }//GEN-LAST:event_jLabel42MouseClicked

    private void ptlistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ptlistMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) ptlist.getModel();
        ptlist.getSelectedRow();
        ID.setText(model.getValueAt(ptlist.getSelectedRow(), 0).toString());
        Did.setText(model.getValueAt(ptlist.getSelectedRow(), 1).toString());
        name.setText(model.getValueAt(ptlist.getSelectedRow(), 2).toString());
        issue.setText(model.getValueAt(ptlist.getSelectedRow(), 3).toString());
        age.setText(model.getValueAt(ptlist.getSelectedRow(), 4).toString());
        phno.setText(model.getValueAt(ptlist.getSelectedRow(), 5).toString());
    }//GEN-LAST:event_ptlistMouseClicked

    private void jLabel43MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel43MouseClicked
        // TODO add your handling code here:

        DTO dt = new DTO();
        try {
            dt.updatepaitent(Integer.parseInt(ID.getText()), Integer.parseInt(Did.getText()), name.getText(), issue.getText(), Integer.parseInt(age.getText()), phno.getText());
            ptlist();
        } catch (NumberFormatException ex) {
            System.err.print(ex.getMessage());
        }


    }//GEN-LAST:event_jLabel43MouseClicked

    private void serch2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_serch2KeyPressed

        // TODO add your handling code here:
        if (!serch2.getText().isEmpty()) {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                DefaultTableModel model = (DefaultTableModel) doclist1.getModel();
                model.setRowCount(0);
                Connection conect;
                try {
                    conect = Database.conectDataBase();
                    Statement smt = conect.createStatement();
                    boolean check = smt.execute("use hms");
                    ResultSet rs = smt.executeQuery("Select *from Doctor where name ='" + serch2.getText() + "';");
                    while (rs.next()) {
                        Object[] cols = new Object[5];
                        cols[0] = rs.getString("ID");
                        cols[1] = rs.getString("Name");
                        cols[2] = rs.getString("Edu");
                        cols[3] = rs.getString("Disg");
                        cols[4] = rs.getString("Salery");
                        model.addRow(cols);
                    }

                    if (check) {
                        System.out.print("data shown");
                    }
                } catch (SQLException | ClassNotFoundException ex) {
                    System.err.print(ex.getMessage());
                }

            }
        } else {
            Doctorlist1();
        }


    }//GEN-LAST:event_serch2KeyPressed

    private void tp2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tp2MouseClicked
        // TODO add your handling code here:
        ptlist1();
        apoinmentlist1();
    }//GEN-LAST:event_tp2MouseClicked

    private void serch3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_serch3KeyPressed
        // TODO add your handling code here:

        if (!serch3.getText().isEmpty()) {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                DefaultTableModel model = (DefaultTableModel) ptlist1.getModel();
                model.setRowCount(0);
                Connection conect;
                try {
                    conect = Database.conectDataBase();
                    Statement smt = conect.createStatement();
                    boolean check = smt.execute("use hms");
                    ResultSet rs = smt.executeQuery("Select *from paitent where Name ='" + serch3.getText() + "';");
                    while (rs.next()) {
                        Object[] cols = new Object[6];
                        cols[0] = rs.getString("ID");
                        cols[1] = rs.getString("Doc_ID");
                        cols[2] = rs.getString("Name");
                        cols[3] = rs.getString("Issue");
                        cols[4] = rs.getString("age");
                        cols[5] = rs.getString("phno");
                        model.addRow(cols);
                    }

                    if (check) {
                        System.out.print("data shown");
                    }
                } catch (SQLException | ClassNotFoundException ex) {
                    System.err.print(ex.getMessage());
                }
            }
        } else {
            ptlist1();
        }


    }//GEN-LAST:event_serch3KeyPressed

    private void ptlist1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ptlist1MouseClicked
        try {
            // TODO add your handling code here:
            DefaultTableModel model = (DefaultTableModel) ptlist1.getModel();
            DefaultTableModel model2 = (DefaultTableModel) doclist3.getModel();
            model2.setRowCount(0);
            int a = Integer.parseInt(model.getValueAt(ptlist1.getSelectedRow(), 1).toString());

            Connection con = Database.conectDataBase();
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery("select *from Doctor where ID=" + a + ";");

            while (rs.next()) {
                Object[] cols = new Object[5];
                cols[0] = rs.getString("ID");
                cols[1] = rs.getString("name");
                cols[2] = rs.getString("edu");
                cols[3] = rs.getString("disg");
                cols[4] = rs.getString("salery");
                model2.addRow(cols);
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(dashbord.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ptlist1MouseClicked

    private void tabp1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabp1MouseClicked
        // TODO add your handling code here:
        Doctorlist4();
        ptlist1();
    }//GEN-LAST:event_tabp1MouseClicked

    private void serch4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_serch4KeyPressed
        // TODO add your handling code here:
        if (!serch4.getText().isEmpty()) {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                DefaultTableModel model = (DefaultTableModel) doclist4.getModel();
                model.setRowCount(0);
                Connection conect;
                try {
                    conect = Database.conectDataBase();
                    Statement smt = conect.createStatement();
                    boolean check = smt.execute("use hms");
                    ResultSet rs = smt.executeQuery("Select *from Doctor where name ='" + serch4.getText() + "';");
                    while (rs.next()) {
                        Object[] cols = new Object[5];
                        cols[0] = rs.getString("ID");
                        cols[1] = rs.getString("Name");
                        cols[2] = rs.getString("Edu");
                        cols[3] = rs.getString("Disg");
                        cols[4] = rs.getString("Salery");
                        model.addRow(cols);
                    }

                    if (check) {
                        System.out.print("data shown");
                    }
                } catch (SQLException | ClassNotFoundException ex) {
                    System.err.print(ex.getMessage());
                }

            }
        } else {
            Doctorlist4();
        }


    }//GEN-LAST:event_serch4KeyPressed

    private void serch5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_serch5KeyPressed
        // TODO add your handling code here:

        if (!serch5.getText().isEmpty()) {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                DefaultTableModel model = (DefaultTableModel) ptlist2.getModel();
                model.setRowCount(0);
                Connection conect;
                try {
                    conect = Database.conectDataBase();
                    Statement smt = conect.createStatement();
                    boolean check = smt.execute("use hms");
                    ResultSet rs = smt.executeQuery("Select *from paitent where Name ='" + serch5.getText() + "';");
                    while (rs.next()) {
                        Object[] cols = new Object[6];
                        cols[0] = rs.getString("ID");
                        cols[1] = rs.getString("Name");
                        cols[2] = rs.getString("Name");
                        cols[3] = rs.getString("Issue");
                        cols[4] = rs.getString("age");
                        cols[5] = rs.getString("phno");
                        model.addRow(cols);
                    }

                    if (check) {
                        System.out.print("data shown");
                    }
                } catch (SQLException | ClassNotFoundException ex) {
                    System.err.print(ex.getMessage());
                }
            }
        } else {
            ptlist2();
        }


    }//GEN-LAST:event_serch5KeyPressed

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel20MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel20MouseEntered

    private void jLabel20MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel20MouseExited

    private void jLabel52MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel52MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel52MouseClicked

    private void jLabel52MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel52MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel52MouseEntered

    private void jLabel52MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel52MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel52MouseExited

    private void DnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DnameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_DnameMouseClicked

    private void DnameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DnameMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_DnameMouseEntered

    private void DnameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DnameMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_DnameMouseExited

    private void DIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DIDMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_DIDMouseClicked

    private void DIDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DIDMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_DIDMouseEntered

    private void DIDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DIDMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_DIDMouseExited

    private void PIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PIDMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_PIDMouseClicked

    private void PIDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PIDMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_PIDMouseEntered

    private void PIDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PIDMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_PIDMouseExited

    private void PnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PnameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_PnameMouseClicked

    private void PnameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PnameMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_PnameMouseEntered

    private void PnameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PnameMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_PnameMouseExited

    private void doclist4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doclist4MouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) doclist4.getModel();
        doclist4.getSelectedRow();
        DID.setText(model.getValueAt(doclist4.getSelectedRow(), 0).toString());
        Dname.setText(model.getValueAt(doclist4.getSelectedRow(), 1).toString());
    }//GEN-LAST:event_doclist4MouseClicked

    private void ptlist2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ptlist2MouseClicked
        // TODO add your handling code here:

        DefaultTableModel model = (DefaultTableModel) ptlist2.getModel();

        PID.setText(model.getValueAt(ptlist2.getSelectedRow(), 0).toString());
        Pname.setText(model.getValueAt(ptlist2.getSelectedRow(), 1).toString());

    }//GEN-LAST:event_ptlist2MouseClicked

    private void aplist1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aplist1KeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_aplist1KeyPressed

    private void jTextField20KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField20KeyPressed
        // TODO add your handling code here:

        if (!jTextField20.getText().isEmpty()) {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                DefaultTableModel model = (DefaultTableModel) aplist1.getModel();
                model.setRowCount(0);
                Connection conect;
                try {
                    conect = Database.conectDataBase();
                    Statement smt = conect.createStatement();
                    boolean check = smt.execute("use hms");
                    ResultSet rs = smt.executeQuery("Select *from Apoinment where ID =" + Integer.valueOf(jTextField20.getText()) + ";");
                    while (rs.next()) {
                        Object[] cols = new Object[4];
                        cols[0] = rs.getString("ID");
                        cols[1] = rs.getString("P_ID");
                        cols[2] = rs.getString("D_ID");
                        cols[3] = rs.getString("DateTime");

                        model.addRow(cols);
                    }

                    if (check) {
                        System.out.print("data shown");
                    }
                } catch (SQLException | ClassNotFoundException ex) {
                    System.err.print(ex.getMessage());
                }
            }
        } else {
            apoinmentlist1();
        }

    }//GEN-LAST:event_jTextField20KeyPressed

    private void aplist1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aplist1MouseClicked
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            DefaultTableModel model = (DefaultTableModel) aplist1.getModel();
            DefaultTableModel model2 = (DefaultTableModel) ptlist5.getModel();
            model2.setRowCount(0);
            int a = Integer.parseInt(model.getValueAt(aplist1.getSelectedRow(), 1).toString());

            Connection con = Database.conectDataBase();
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery("select *from Paitent where ID=" + a + ";");

            while (rs.next()) {
                Object[] cols = new Object[6];
                cols[0] = rs.getInt("ID");
                cols[1] = rs.getInt("Doc_ID");
                cols[2] = rs.getString("Name");
                cols[3] = rs.getString("Issue");

                cols[4] = rs.getInt("age");
                cols[5] = rs.getString("phno");

                model2.addRow(cols);
            }
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.print(ex.getMessage());
        }


    }//GEN-LAST:event_aplist1MouseClicked

    private void billActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_billActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(dashbord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashbord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashbord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashbord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashbord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DID;
    private javax.swing.JTextField Did;
    private javax.swing.JTextField Disg;
    private javax.swing.JLabel Dname;
    private javax.swing.JLabel ID;
    private javax.swing.JTextField Name;
    private javax.swing.JLabel PID;
    private javax.swing.JLabel Pname;
    private javax.swing.JTextField age;
    private javax.swing.JLabel ap;
    private javax.swing.JLabel ap1;
    private javax.swing.JLabel ap2;
    private javax.swing.JLabel ap3;
    private javax.swing.JTextField apid;
    private javax.swing.JTable aplist;
    private javax.swing.JTable aplist1;
    private javax.swing.JTextField bill;
    private javax.swing.JTable billlist;
    private javax.swing.JLabel did;
    private javax.swing.JLabel doc;
    private javax.swing.JLabel doc1;
    private javax.swing.JTable doclist;
    private javax.swing.JTable doclist1;
    private javax.swing.JTable doclist3;
    private javax.swing.JTable doclist4;
    private javax.swing.JTextField edu;
    private javax.swing.JTextField issue;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField name;
    private javax.swing.JLabel noD;
    private javax.swing.JTextField phno;
    private javax.swing.JTextField pid;
    private javax.swing.JLabel pno;
    private javax.swing.JLabel pt;
    private javax.swing.JLabel pt1;
    private javax.swing.JTable ptlist;
    private javax.swing.JTable ptlist1;
    private javax.swing.JTable ptlist2;
    private javax.swing.JTable ptlist5;
    private javax.swing.JTextField serch;
    private javax.swing.JTextField serch1;
    private javax.swing.JTextField serch2;
    private javax.swing.JTextField serch3;
    private javax.swing.JTextField serch4;
    private javax.swing.JTextField serch5;
    private javax.swing.JTextField sly;
    private javax.swing.JTabbedPane tabp1;
    private javax.swing.JTabbedPane tp2;
    // End of variables declaration//GEN-END:variables
}
