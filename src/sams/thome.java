/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sams;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.awt.Image;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author Suja
 */
public final class thome extends javax.swing.JFrame {

    Connection conn = null;
    private DefaultTableModel model1;
    private int rowIndex;
    private String imagePath;
    int teacherCollegeID = LOGIN.CollegeIDHolder.getTeacherCollegeID();
    int tID = LOGIN.TeacherIDHolder.getTeacherID();

    public thome() {
        super("student");
        initComponents();
        conn = DB.Connection();
        init();
        AutoCompleteDecorator.decorate(sub);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel12 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        ssusn = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jPanel39 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        attable = new javax.swing.JTable();
        jPanel40 = new javax.swing.JPanel();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        ssec = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        ssem = new javax.swing.JComboBox<>();
        branch = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        adate = new com.toedter.calendar.JDateChooser();
        jToggleButton1 = new javax.swing.JToggleButton();
        atpanel = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        USN = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        ssname = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        att = new javax.swing.JComboBox<>();
        jButton10 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel41 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        ausn = new javax.swing.JTextField();
        jButton14 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jPanel42 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        artable = new javax.swing.JTable();
        jPanel43 = new javax.swing.JPanel();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        tcc = new javax.swing.JTextField();
        jPanel18 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        jButton15 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        sc = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        ss = new javax.swing.JComboBox<>();
        sb = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        AUSN = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        aname = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        attper = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel44 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        sub = new javax.swing.JComboBox<>();
        jLabel56 = new javax.swing.JLabel();
        sem = new javax.swing.JComboBox<>();
        jLabel57 = new javax.swing.JLabel();
        sec = new javax.swing.JComboBox<>();
        jLabel58 = new javax.swing.JLabel();
        jButton42 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        subtable = new javax.swing.JTable();
        jPanel20 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        tid = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        tname = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        tmail = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        tdept = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        tphone = new javax.swing.JTextField();
        jPanel46 = new javax.swing.JPanel();
        jButton41 = new javax.swing.JButton();
        jPanel25 = new javax.swing.JPanel();
        img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setBackground(new java.awt.Color(102, 255, 102));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("STUDENT ATTENDENCE MANAGEMENT SYSTEM");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(161, 161, 161))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jPanel12.setBackground(new java.awt.Color(0, 204, 255));

        jPanel16.setBackground(new java.awt.Color(102, 255, 102));
        jPanel16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 255), 4, true));

        jPanel38.setBackground(new java.awt.Color(102, 255, 102));
        jPanel38.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 255), 4, true));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Search Student");

        jButton9.setBackground(new java.awt.Color(51, 204, 255));
        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton9.setText("Search");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton29.setBackground(new java.awt.Color(51, 204, 255));
        jButton29.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton29.setText("Refresh");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(ssusn, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ssusn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel39.setBackground(new java.awt.Color(102, 255, 102));
        jPanel39.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 255), 4, true));

        attable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "USN", "Name", "Attendence", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        attable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                attableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(attable);
        if (attable.getColumnModel().getColumnCount() > 0) {
            attable.getColumnModel().getColumn(3).setHeaderValue("Date");
        }

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jPanel40.setBackground(new java.awt.Color(102, 255, 102));
        jPanel40.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 255), 4, true));

        jButton31.setBackground(new java.awt.Color(51, 153, 255));
        jButton31.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton31.setText("Update");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jButton32.setBackground(new java.awt.Color(51, 153, 255));
        jButton32.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton32.setText("Delete");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        jButton33.setBackground(new java.awt.Color(51, 153, 255));
        jButton33.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton33.setText("LogOut");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        jButton34.setBackground(new java.awt.Color(51, 153, 255));
        jButton34.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton34.setText("Clear");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(151, 151, 151)
                .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119)
                .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        jPanel15.setBackground(new java.awt.Color(102, 255, 102));
        jPanel15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 255), 4, true));

        jPanel36.setBackground(new java.awt.Color(102, 255, 102));
        jPanel36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255), 4));

        jButton1.setBackground(new java.awt.Color(0, 204, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Branch");

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Section");

        ssec.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ssec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select-Section", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K" }));

        jLabel23.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Semester");

        ssem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ssem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select-Semester", "1", "2", "3", "4", "5", "6", "7", "8", " " }));

        branch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                branchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ssec, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ssem, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(branch))
                .addGap(41, 41, 41)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel36Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(branch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ssem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ssec, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
        );

        jLabel19.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Date");

        adate.setBackground(new java.awt.Color(255, 255, 255));
        adate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                adateKeyTyped(evt);
            }
        });

        jToggleButton1.setBackground(new java.awt.Color(51, 204, 255));
        jToggleButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jToggleButton1.setText("Take Attendence");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        atpanel.setBackground(new java.awt.Color(102, 255, 102));
        atpanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 255), 4, true));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("USN");

        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Name");

        jLabel18.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Attendence");

        att.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        att.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Present", "Absent", " " }));

        jButton10.setBackground(new java.awt.Color(0, 204, 255));
        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton10.setText("Prev");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(0, 204, 255));
        jButton12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton12.setText("Save");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(0, 204, 255));
        jButton11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton11.setText("Next");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 51, 51));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("X");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout atpanelLayout = new javax.swing.GroupLayout(atpanel);
        atpanel.setLayout(atpanelLayout);
        atpanelLayout.setHorizontalGroup(
            atpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(atpanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(atpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton10)
                    .addGroup(atpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGroup(atpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(atpanelLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(atpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(atpanelLayout.createSequentialGroup()
                                .addComponent(jButton12)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(atpanelLayout.createSequentialGroup()
                                .addGroup(atpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ssname)
                                    .addComponent(att, 0, 188, Short.MAX_VALUE)
                                    .addComponent(USN))
                                .addGap(17, 17, 17))))
                    .addGroup(atpanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton11)))
                .addGap(5, 5, 5)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        atpanelLayout.setVerticalGroup(
            atpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, atpanelLayout.createSequentialGroup()
                .addGroup(atpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(atpanelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(atpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(USN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton2))
                .addGap(28, 28, 28)
                .addGroup(atpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ssname, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(atpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(att, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jButton12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(atpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton11)
                    .addComponent(jButton10))
                .addGap(29, 29, 29))
        );

        cancel.setBackground(new java.awt.Color(0, 204, 255));
        cancel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(atpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel15Layout.createSequentialGroup()
                            .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel15Layout.createSequentialGroup()
                            .addGap(98, 98, 98)
                            .addComponent(adate, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancel))
                .addGap(18, 18, 18)
                .addComponent(atpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Attendance", jPanel12);

        jPanel13.setBackground(new java.awt.Color(0, 204, 255));

        jPanel17.setBackground(new java.awt.Color(102, 255, 102));
        jPanel17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 255), 4, true));

        jPanel41.setBackground(new java.awt.Color(102, 255, 102));
        jPanel41.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 255), 4, true));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Search Student");

        jButton14.setBackground(new java.awt.Color(51, 204, 255));
        jButton14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton14.setText("Search");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton35.setBackground(new java.awt.Color(51, 204, 255));
        jButton35.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton35.setText("Refresh");
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(ausn, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ausn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel42.setBackground(new java.awt.Color(102, 255, 102));
        jPanel42.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 255), 4, true));

        artable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "USN", "Name", "Semester", "Section", "Classes Attended", "Attendence %"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        artable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                artableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(artable);

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
        );

        jPanel43.setBackground(new java.awt.Color(102, 255, 102));
        jPanel43.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 255), 4, true));

        jButton38.setBackground(new java.awt.Color(51, 153, 255));
        jButton38.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton38.setText("Clear");
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });

        jButton39.setBackground(new java.awt.Color(51, 153, 255));
        jButton39.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton39.setText("LogOut");
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Total Class Count");

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tcc, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134)
                .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tcc, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        jPanel18.setBackground(new java.awt.Color(102, 255, 102));
        jPanel18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 255), 4, true));

        jPanel37.setBackground(new java.awt.Color(102, 255, 102));
        jPanel37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255), 4));

        jButton15.setBackground(new java.awt.Color(0, 204, 255));
        jButton15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton15.setText("Search");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Branch");

        jLabel21.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Section");

        sc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select-Section", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K" }));

        jLabel25.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Semester");

        ss.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ss.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select-Semester", "1", "2", "3", "4", "5", "6", "7", "8", " " }));

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ss, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sb))
                .addGap(41, 41, 41)
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel37Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ss, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
        );

        jLabel22.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("USN");

        AUSN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AUSNActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Name");

        aname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anameActionPerformed(evt);
            }
        });

        jPanel8.setBackground(new java.awt.Color(102, 255, 102));
        jPanel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 255), 4, true));

        attper.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        jLabel28.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Attendence %");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                    .addContainerGap(154, Short.MAX_VALUE)
                    .addComponent(attper, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(23, Short.MAX_VALUE)))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                    .addContainerGap(27, Short.MAX_VALUE)
                    .addComponent(attper, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(21, Short.MAX_VALUE)))
        );

        jButton16.setBackground(new java.awt.Color(51, 204, 255));
        jButton16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton16.setText("Get Result");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel37, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aname)
                            .addComponent(AUSN))
                        .addGap(20, 20, 20))))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AUSN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Attendence Report", jPanel13);

        jPanel14.setBackground(new java.awt.Color(0, 204, 255));

        jPanel19.setBackground(new java.awt.Color(102, 255, 102));
        jPanel19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 255), 4, true));

        jPanel44.setBackground(new java.awt.Color(102, 255, 102));
        jPanel44.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 255), 4, true));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("My Classes");

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(718, Short.MAX_VALUE))
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(102, 255, 102));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 255), 4, true));

        sub.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sub.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select-Subject" }));

        jLabel56.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setText("Semester");

        sem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select-Semester", "1", "2", "3", "4", "5", "6", "7", "8" }));

        jLabel57.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setText("Section");

        sec.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select-Section", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K" }));

        jLabel58.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setText("Subject");

        jButton42.setBackground(new java.awt.Color(51, 153, 255));
        jButton42.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton42.setText("Add ");
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });

        jButton43.setBackground(new java.awt.Color(51, 153, 255));
        jButton43.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton43.setText("Delete");
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sec, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sem, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(94, 94, 94)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sub, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sem)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(sub, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(sec, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                        .addComponent(jLabel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(102, 255, 102));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 255), 4, true));

        subtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Semester", "Section", "Subjects", "Class count"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(subtable);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel20.setBackground(new java.awt.Color(102, 255, 102));
        jPanel20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 255), 4, true));

        jLabel35.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("ID");

        tid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tidActionPerformed(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Name");

        tname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnameActionPerformed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Email");

        tmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmailActionPerformed(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Department");

        tdept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tdeptActionPerformed(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Phone");

        tphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tphoneActionPerformed(evt);
            }
        });

        jPanel46.setBackground(new java.awt.Color(102, 255, 102));
        jPanel46.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 255), 4, true));

        jButton41.setBackground(new java.awt.Color(51, 153, 255));
        jButton41.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton41.setText("LogOut");
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel46Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        jPanel25.setBackground(new java.awt.Color(204, 204, 204));
        jPanel25.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 255), 4, true));

        img.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        img.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(img, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(img, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tid)
                            .addComponent(tname, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tmail)
                            .addComponent(tdept, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tphone, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 55, Short.MAX_VALUE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel20Layout.createSequentialGroup()
                    .addGap(125, 125, 125)
                    .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(127, Short.MAX_VALUE)))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tdept, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tphone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel20Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(387, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("About", jPanel14);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void init() {
        atpanel.setVisible(false);
        cancel.setVisible(false);
        tva();
        tvr();
        tvs();
        setTcc();
        updateCombo();
        setbranch();
        Allattres();
        Allattrec();
        showAllSRecord();
    }

    private void tva() {
        model1 = (DefaultTableModel) attable.getModel();
        attable.setRowHeight(30);
        attable.setShowGrid(true);
        attable.setGridColor(Color.black);
        attable.setBackground(Color.white);

    }

    private void tvr() {
        model1 = (DefaultTableModel) artable.getModel();
        artable.setRowHeight(30);
        artable.setShowGrid(true);
        artable.setGridColor(Color.black);
        artable.setBackground(Color.white);

    }

    private void tvs() {
        model1 = (DefaultTableModel) subtable.getModel();
        subtable.setRowHeight(30);
        subtable.setShowGrid(true);
        subtable.setGridColor(Color.black);
        subtable.setBackground(Color.white);
    }

    private void setTcc() {
        try {
            String sql = "SELECT * FROM teacher WHERE id=? ";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, tID);

            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                int aaaid = rs.getInt("id");
                tid.setText(Integer.toString(aaaid));
                tname.setText(rs.getString("name"));
                tmail.setText(rs.getString("mail"));
                tdept.setText(rs.getString("branch"));
                tphone.setText(rs.getString("phone"));
                String path = rs.getString("avpath");
                imagePath = path;
                img.setIcon(imageAdjust(path, null));
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "An error occurred during deletion: " + ex.getMessage());
        }
    }

    private void updateCombo() {
        String sql = "Select * from courses";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet res = preparedStatement.executeQuery();
            while (res.next()) {
                sub.addItem(res.getString("crs"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
    }
    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        // TODO add your handling code here:
        clearA();
        Allattres();
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        
            if (ssusn.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Enter Student USN ");
                return;
            }
            
            String id = ssusn.getText();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String date = dateFormat.format(adate.getDate());
try {
            String AttendanceRepSql = "SELECT * FROM attendance WHERE usn=? AND date=? tid=?";
            PreparedStatement AttendanceRepStatement = conn.prepareStatement(AttendanceRepSql);
            AttendanceRepStatement.setString(1, id);
            AttendanceRepStatement.setString(2, date);
            AttendanceRepStatement.setInt(3, tID);

            ResultSet rs = AttendanceRepStatement.executeQuery();
            if (rs.next()) {
                String at = rs.getString("attres");
                if (at.equals("Present")) {
                    JOptionPane.showMessageDialog(null, "Cannot Delete the Entry Data");
                    return;
                }
            }

            String deleteAttendanceSql = "DELETE FROM attendance WHERE usn=? AND date=? AND tid=?";
            PreparedStatement deleteAttendanceStatement = conn.prepareStatement(deleteAttendanceSql);
            deleteAttendanceStatement.setString(1, id);
            deleteAttendanceStatement.setString(2, date);
            deleteAttendanceStatement.setInt(3, tID);

            int rowsAffected = deleteAttendanceStatement.executeUpdate();

            if (rowsAffected > 0) {

                JOptionPane.showMessageDialog(null, "Attendance records for student with USN " + id + " on " + date + " deleted successfully.");
                clearA();
                Allattres();
                Allattrec();
            } else {
                JOptionPane.showMessageDialog(null, "No attendance records found for student with USN " + id + " on " + date + ".");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "An error occurred while deleting attendance records: " + ex.getMessage());
        }

    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        // TODO add your handling code here:
        String stbranch = branch.getText().trim(); 
        String stname = ssname.getText().trim();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String curdate = dateFormat.format(adate.getDate());
        String usnx = USN.getText();
        String attr = (String) att.getSelectedItem();
        String section = (String) ssec.getSelectedItem();
        String selectedSemester = (String) ssem.getSelectedItem();
        int stsem = Integer.parseInt(selectedSemester);
        String getLastAttendanceSql = "SELECT attres FROM attendance WHERE tid = ? AND usn = ? AND date = ?";

try (PreparedStatement lastAttendanceStmt = conn.prepareStatement(getLastAttendanceSql)) {
    lastAttendanceStmt.setInt(1, tID);
    lastAttendanceStmt.setString(2, usnx);
    lastAttendanceStmt.setString(3, curdate);
    
    ResultSet lastAttendanceResult = lastAttendanceStmt.executeQuery();
    
    String lastAttendanceValue = null;
    if (lastAttendanceResult.next()) {
        lastAttendanceValue = lastAttendanceResult.getString("attres");
    }
    
    // Now you can check if the lastAttendanceValue is equal to a specific value
    if (lastAttendanceValue != null && lastAttendanceValue.equals("Present")) {
         JOptionPane.showMessageDialog(null, "Cannot Update the Entry Data");
    }
    else if(lastAttendanceValue == null ? attr != null : !lastAttendanceValue.equals(attr)){
        
        try{
            String deleteAttendanceSql = "DELETE FROM attendance WHERE usn=? AND date=? AND tid=?";
        
            PreparedStatement deleteAttendanceStatement = conn.prepareStatement(deleteAttendanceSql);
            deleteAttendanceStatement.setString(1, usnx);
            deleteAttendanceStatement.setString(2, curdate);
            deleteAttendanceStatement.setInt(3, tID);

            int rowsAffected = deleteAttendanceStatement.executeUpdate();

            if (rowsAffected > 0) {
                updateattrec(usnx, "save");
                clearA();
                Allattres();
                Allattrec();
            } 
    }catch (Exception ex) {
    JOptionPane.showMessageDialog(null, "An error occurred while fetching last attendance data: " + ex.getMessage());
}
    }
    else if(attr.equals("Absent")){
        String attendanceSql = "INSERT INTO attendance(clgid, tid, stdname, bname, sem, sname, usn, date, attres) "
                             + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement checkDuplicateStatement = conn.prepareStatement("SELECT COUNT(*) FROM attendance WHERE usn = ? AND date = ? AND tid=?")) {
            // Check for duplicate data
            checkDuplicateStatement.setString(1, usnx);
            checkDuplicateStatement.setString(2, curdate);
            checkDuplicateStatement.setInt(3, tID);
            
            ResultSet resultSet = checkDuplicateStatement.executeQuery();
            resultSet.next();
            int count = resultSet.getInt(1);
            if (count > 0) {
                JOptionPane.showMessageDialog(null, "Duplicate attendance data found");
                return;
            }
            try (PreparedStatement atps = conn.prepareStatement(attendanceSql)) {
                atps.setInt(1, teacherCollegeID);
                atps.setInt(2, tID);
                atps.setString(3, stname);
                atps.setString(4, stbranch);
                atps.setInt(5, stsem);
                atps.setString(6, section);
                atps.setString(7, usnx);
                atps.setString(8, curdate);
                atps.setString(9, attr);
                int attendanceRowsAffected = atps.executeUpdate();
                if (attendanceRowsAffected > 0) {
                    updateattrec(usnx, "absent");
                    Allattres();
                    Allattrec();
                } else {
                    JOptionPane.showMessageDialog(null, "Insertion of attendance data failed");
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "An error occurred while inserting attendance data: " + ex.getMessage());
        }
    }
} catch (Exception ex) {
    JOptionPane.showMessageDialog(null, "An error occurred while fetching last attendance data: " + ex.getMessage());
}
    }//GEN-LAST:event_jButton31ActionPerformed

    private void AUSNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AUSNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AUSNActionPerformed

    private void anameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anameActionPerformed
    public void Allattrec() {
        try {
            int tCID = LOGIN.CollegeIDHolder.getTeacherCollegeID();
            String collegeID = String.valueOf(tCID);

            String b = sb.getText();

            String sql1 = "SELECT usn, stdname,semester,section,classcount, attper FROM attrec WHERE branch = ? AND clgid = ?";
            ResultSet res;
            try (PreparedStatement pstmt = conn.prepareStatement(sql1)) {
                pstmt.setString(1, b);
                pstmt.setString(2, collegeID);
                res = pstmt.executeQuery();
                String[] columnNames = {"USN", "Student Name", "Semester", "Section", "Class count", "Attendance"};
                DefaultTableModel model = new DefaultTableModel(columnNames, 0);
                while (res.next()) {
                    Object[] row = {res.getString("usn"), res.getString("stdname"), res.getString("semester"), res.getString("section"), res.getString("classcount"), res.getString("attper")};
                    model.addRow(row);
                }
                artable.setModel(model);
                // Close PreparedStatement and ResultSet
            }
            res.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void attrec(String b, String seme, String section) {
        try {
            int tCID = LOGIN.CollegeIDHolder.getTeacherCollegeID();
            String collegeID = String.valueOf(tCID);

            String sql1 = "SELECT usn, stdname,semester,section,classcount, attper FROM attrec WHERE branch = ? AND semester = ? AND section = ? AND clgid = ? ";

            // Use try-with-resources to auto-close resources
            try (PreparedStatement pstmt = conn.prepareStatement(sql1)) {
                pstmt.setString(1, b);
                pstmt.setString(2, seme);
                pstmt.setString(3, section);
                pstmt.setString(4, collegeID);
                ResultSet res = pstmt.executeQuery();

                String[] columnNames = {"USN", "Student Name", "Semester", "Section", "Class count", "Attendance"};
                DefaultTableModel model = new DefaultTableModel(columnNames, 0);
                while (res.next()) {
                    Object[] row = {res.getString("usn"), res.getString("stdname"), res.getString("semester"), res.getString("section"), res.getString("classcount"), res.getString("attper")};
                    model.addRow(row);
                }
                
                artable.setModel(model);
            } 
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void attrec(String id) {
        try {
            int tCID = LOGIN.CollegeIDHolder.getTeacherCollegeID();
            String collegeID = String.valueOf(tCID);
            String b = branch.getText();
            // Close PreparedStatement

            String sql1 = "SELECT usn, stdname,semester,section,classcount, attper FROM attrec WHERE branch = ?  AND clgid = ? AND usn=?";

            // Use try-with-resources to auto-close resources
            try (PreparedStatement pstmt = conn.prepareStatement(sql1)) {
                pstmt.setString(1, b);

                pstmt.setString(2, collegeID);
                pstmt.setString(3, id);
                ResultSet res = pstmt.executeQuery();

                String[] columnNames = {"USN", "Student Name", "Semester", "Section", "Class count", "Attendance"};
                DefaultTableModel model = new DefaultTableModel(columnNames, 0);
                while (res.next()) {
                    Object[] row = {res.getString("usn"), res.getString("stdname"), res.getString("semester"), res.getString("section"), res.getString("classcount"), res.getString("attper")};
                    model.addRow(row);
                }
                artable.setModel(model);
            } // PreparedStatement and ResultSet are auto-closed here
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        // TODO add your handling code here:
        ausn.setText(null);
        AUSN.setText(null);
        aname.setText(null);
        attper.setText("0.0");
        Allattrec();
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(this, "Do you want to logout now?", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(this, "Do you want to logout now?", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            this.dispose();
            LOGIN object =new LOGIN();
            object.setVisible(true);
        }
    }//GEN-LAST:event_jButton39ActionPerformed


    private void clearA() {
        adate.setDate(new Date());
        USN.setText(null);
        ssname.setText(null);
        att.setSelectedIndex(0);
        ssem.setSelectedIndex(0);
        ssec.setSelectedIndex(0);
    }

    public void Allattres() {
        try {
            int tCID = LOGIN.CollegeIDHolder.getTeacherCollegeID();
            String collegeID = String.valueOf(tCID);

            String b = branch.getText();

            String sql1 = "SELECT usn, stdname, attres, date FROM attendance WHERE bname = ? AND clgid = ?";
            ResultSet res;
            try (PreparedStatement pstmt = conn.prepareStatement(sql1)) {
                pstmt.setString(1, b);
                pstmt.setString(2, collegeID);
                res = pstmt.executeQuery();
                String[] columnNames = {"USN", "Student Name", "Attendance", "Date"};
                DefaultTableModel model = new DefaultTableModel(columnNames, 0);
                while (res.next()) {
                    Object[] row = {res.getString("usn"), res.getString("stdname"), res.getString("attres"), res.getString("date")};
                    model.addRow(row);
                }
                attable.setModel(model);
            }
            res.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void attr(String b, String seme, String section) {
        try {
            int tCID = LOGIN.CollegeIDHolder.getTeacherCollegeID();
            String collegeID = String.valueOf(tCID);

            String sql1 = "SELECT usn, stdname, attres, date FROM attendance WHERE bname = ? AND sem = ? AND sname = ? AND clgid = ? ";

            try (PreparedStatement pstmt = conn.prepareStatement(sql1)) {
                pstmt.setString(1, b);
                pstmt.setString(2, seme);
                pstmt.setString(3, section);
                pstmt.setString(4, collegeID);
                ResultSet res = pstmt.executeQuery();

                String[] columnNames = {"USN", "Student Name", "Attendance", "Date"};
                DefaultTableModel model = new DefaultTableModel(columnNames, 0);
                while (res.next()) {
                    Object[] row = {res.getString("usn"), res.getString("stdname"), res.getString("attres"), res.getString("date")};
                    model.addRow(row);
                }
                attable.setModel(model);
                
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void attres(String id) {
        try {
            int tCID = LOGIN.CollegeIDHolder.getTeacherCollegeID();
            String collegeID = String.valueOf(tCID);
            String b = branch.getText();

            String sql1 = "SELECT usn, stdname, attres, date FROM attendance WHERE bname = ? AND clgid = ? AND usn=?";

            try (PreparedStatement pstmt = conn.prepareStatement(sql1)) {
                pstmt.setString(1, b);

                pstmt.setString(2, collegeID);
                pstmt.setString(3, id);
                ResultSet res = pstmt.executeQuery();

                String[] columnNames = {"USN", "Student Name", "Attendance", "Date"};
                DefaultTableModel model = new DefaultTableModel(columnNames, 0);
                while (res.next()) {
                    Object[] row = {res.getString("usn"), res.getString("stdname"), res.getString("attres"), res.getString("date")};
                    model.addRow(row);
                }
                attable.setModel(model);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void setbranch() {
        try {
            String sql = "SELECT branch FROM teacher WHERE id = ?";
            PreparedStatement pstmtx = conn.prepareStatement(sql);
            pstmtx.setInt(1, tID);
            ResultSet resx = pstmtx.executeQuery();
            if (resx.next()) {
                String b = resx.getString("branch");
                branch.setText(b);
                sb.setText(b);
                adate.setDate(new Date());
            }
        } catch (SQLException ex) {
            Logger.getLogger(thome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (branch.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Enter Student Department.");
                return;
            }
        if (ssem.getSelectedItem().equals("Select-Semester")) {
                JOptionPane.showMessageDialog(null, "Enter Student Semester");
                return;
            }
        if (ssec.getSelectedItem().equals("Select-Section")) {
                JOptionPane.showMessageDialog(null, "Enter Student Section.");
                return;
            }
        String b = branch.getText();
        String seme = (String) ssem.getSelectedItem();
        String section = (String) ssec.getSelectedItem();
        attr(b, seme, section);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        try {
            if (ssusn.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Enter Student USN.");
                return;
            }
            // Prepare the SQL query with PreparedStatement
            String sql = "SELECT * FROM attendance WHERE usn=?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            String id = ssusn.getText();
            preparedStatement.setString(1, id);

            // Assuming cid is a JTextField for entering college ID
            attres(id);
            // Execute the query
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                // Assuming cname and loc are JTextFields for displaying college name and location respectively
                USN.setText(rs.getString("usn"));
                ssname.setText(rs.getString("stdname"));

            } else {
                JOptionPane.showMessageDialog(null, "Record Not Found");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        // TODO add your handling code here:
        ssusn.setText(null);
    }//GEN-LAST:event_jButton29ActionPerformed
    private void next() {
        // Ensure that rowIndex doesn't exceed the number of rows in the table
        if (rowIndex < attable.getRowCount() - 1) {
            rowIndex++; // Increment rowIndex
            model1 = (DefaultTableModel) attable.getModel();
            ssusn.setText(model1.getValueAt(rowIndex, 0).toString());
            USN.setText(model1.getValueAt(rowIndex, 0).toString());
            ssname.setText(model1.getValueAt(rowIndex, 1).toString());
            try {
                // Parse date
                Date date = new SimpleDateFormat("yyyy-MM-dd").parse(model1.getValueAt(rowIndex, 3).toString());
                adate.setDate(date);
            } catch (ParseException ex) {
                Logger.getLogger(thome.class.getName()).log(Level.SEVERE, null, ex);
            }
            String attendance = model1.getValueAt(rowIndex, 2).toString();
            // Set gender based on attendance
            if (attendance.equals("Absent")) {
                att.setSelectedIndex(1);
            } else {
                att.setSelectedIndex(0);
            }
        } else {
            // If rowIndex is at the last row, reset it to the last valid row
            rowIndex = attable.getRowCount() - 1;
            JOptionPane.showMessageDialog(null, "Last data reached.");
        }
    }
    private void attableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attableMouseClicked
        // TODO add your handling code here:
        model1 = (DefaultTableModel) attable.getModel();
        rowIndex = attable.getSelectedRow();
        ssusn.setText(model1.getValueAt(rowIndex, 0).toString());
        USN.setText(model1.getValueAt(rowIndex, 0).toString());
        ssname.setText(model1.getValueAt(rowIndex, 1).toString());

        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(model1.getValueAt(rowIndex, 3).toString());
            adate.setDate(date);
        } catch (ParseException ex) {
            Logger.getLogger(thome.class.getName()).log(Level.SEVERE, null, ex);
        }

        String atte = model1.getValueAt(rowIndex, 2).toString();
        if (atte.equals("Absent")) {
            att.setSelectedIndex(1);
        } else {
            att.setSelectedIndex(0);
        }

        String sql = "SELECT * FROM attendance WHERE usn=?";
        try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
            preparedStatement.setString(1, USN.getText());
            try (ResultSet rs = preparedStatement.executeQuery()) {
                if (rs.next()) {
                    int value = rs.getInt("sem");
                    // Assuming ssem is your JComboBox for semester selection
                    switch (value) {
                        case 1 ->
                            ssem.setSelectedIndex(1);
                        case 2 ->
                            ssem.setSelectedIndex(2);
                        case 3 ->
                            ssem.setSelectedIndex(3);
                        case 4 ->
                            ssem.setSelectedIndex(4);
                        case 5 ->
                            ssem.setSelectedIndex(5);
                        case 6 ->
                            ssem.setSelectedIndex(6);
                        case 7 ->
                            ssem.setSelectedIndex(7);
                        case 8 ->
                            ssem.setSelectedIndex(8);
                        default -> {
                        }
                    }
                    String svalue = rs.getString("sname");
                    switch (svalue) {
                        case "A" ->
                            ssec.setSelectedIndex(1);
                        case "B" ->
                            ssec.setSelectedIndex(2);
                        case "C" ->
                            ssec.setSelectedIndex(3);
                        case "D" ->
                            ssec.setSelectedIndex(4);
                        case "E" ->
                            ssec.setSelectedIndex(5);
                        case "F" ->
                            ssec.setSelectedIndex(6);
                        case "G" ->
                            ssec.setSelectedIndex(7);
                        case "H" ->
                            ssec.setSelectedIndex(8);
                        case "I" ->
                            ssec.setSelectedIndex(9);
                        case "J" ->
                            ssec.setSelectedIndex(10);
                        case "K" ->
                            ssec.setSelectedIndex(11);
                        default -> {
                            // Handle any other cases if needed
                        }
                    }
                } else {
                    // Handle case where no record found
                    // For example, reset the selection of ssem JComboBox
                    ssem.setSelectedIndex(0);
                    ssec.setSelectedIndex(0);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(thome.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Handle the case where the value is out of range
    }//GEN-LAST:event_attableMouseClicked
    private void prev() {
        if (rowIndex >= 0) {
            rowIndex--;
            ssusn.setText(model1.getValueAt(rowIndex, 0).toString());
            USN.setText(model1.getValueAt(rowIndex, 0).toString());
            ssname.setText(model1.getValueAt(rowIndex, 1).toString());
            try {
                // Parse the date from the table and set it to the date picker
                Date date = new SimpleDateFormat("yyyy-MM-dd").parse(model1.getValueAt(rowIndex, 3).toString());
                adate.setDate(date);
            } catch (ParseException ex) {
                Logger.getLogger(thome.class.getName()).log(Level.SEVERE, null, ex);
            }
            String atte = model1.getValueAt(rowIndex, 2).toString();
            // Update the selection in the gender combobox based on attendance value
            if (atte.equals("Absent")) {
                att.setSelectedIndex(1);
            } else {
                att.setSelectedIndex(0);
            }

        } else {
            // Handle the case where rowIndex is out of bounds
            JOptionPane.showMessageDialog(null, "First data reached.");
        }
    }

    private void updateattrec(String usnx, String op) {
        try {
            String section = (String) ssec.getSelectedItem();
            String selectedSemester = (String) ssem.getSelectedItem();
            int stsem = Integer.parseInt(selectedSemester);

            String selectAttendanceQuery = "SELECT * FROM attrec WHERE usn=? AND tid=?";
            PreparedStatement selectAttendanceStatement = conn.prepareStatement(selectAttendanceQuery);
            selectAttendanceStatement.setString(1, usnx);
            selectAttendanceStatement.setInt(2, tID);
            ResultSet rs = selectAttendanceStatement.executeQuery();

            if (rs.next()) {
                 String tsql = "SELECT * FROM classes WHERE sem=? AND sec=? AND tid=?";
                PreparedStatement total = conn.prepareStatement(tsql);
                total.setInt(1, stsem);
                total.setString(2, section);
                total.setInt(3, tID);

                ResultSet trs = total.executeQuery();

                float attendancePercentage = 0;
                int classCount = 0;
                int totalClasses = 0;
                if (trs.next()) {
                    totalClasses = trs.getInt("totcls");
                }
                
                String updateAttendanceQuery = "UPDATE attrec SET classcount=?, attper=? WHERE usn=? AND tid=?";
                PreparedStatement updateAttendanceStatement = conn.prepareStatement(updateAttendanceQuery);
                if (op.equals("save")) {
                    classCount = rs.getInt("classcount") + 1;

                    attendancePercentage = ((float) classCount / totalClasses) * 100;
                    updateAttendanceStatement.setInt(1, classCount);
                }
                else if (op.equals("absent")) {
                    classCount = rs.getInt("classcount");

                    attendancePercentage = ((float) classCount / totalClasses) * 100;
                    updateAttendanceStatement.setInt(1, classCount);
                }
              

                updateAttendanceStatement.setFloat(2, attendancePercentage);
                updateAttendanceStatement.setString(3, usnx);
                updateAttendanceStatement.setInt(4, tID);

                int rowsAffected = updateAttendanceStatement.executeUpdate();

                if (rowsAffected > 0) {
                    Allattres();
                }
                
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Database error occurred: " + ex.getMessage());
        }
    }
    private void branchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_branchKeyReleased
        // TODO add your handling code here:
        int pos = branch.getCaretPosition();
        branch.setText(branch.getText().toUpperCase());
        branch.setCaretPosition(pos);
    }//GEN-LAST:event_branchKeyReleased

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
if (sb.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Enter Student Department.");
                return;
            }
        if (ss.getSelectedItem().equals("Select-Semester")) {
                JOptionPane.showMessageDialog(null, "Enter Student Semester");
                return;
            }
        if (sc.getSelectedItem().equals("Select-Section")) {
                JOptionPane.showMessageDialog(null, "Enter Student Section.");
                return;
            }
        String b = sb.getText();
        String seme = (String) ss.getSelectedItem();
        String section = (String) sc.getSelectedItem();
        attrec(b, seme, section);
        int stsem = Integer.parseInt(seme);
        String selectTotalClassesSql = "SELECT * FROM classes WHERE sem=? AND sec=? AND tid=?";
    try (PreparedStatement selectTotalClassesStmt = conn.prepareStatement(selectTotalClassesSql)) {
        selectTotalClassesStmt.setInt(1, stsem);
        selectTotalClassesStmt.setString(2, section);
        selectTotalClassesStmt.setInt(3, tID);

        // Execute the query
        ResultSet trs = selectTotalClassesStmt.executeQuery(); 
            if (trs.next()) {
                tcc.setText(trs.getString("totcls"));
            }
    }   catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        try {
            if (ausn.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Enter Student USN.");
                return;
            }
            String sql = "SELECT * FROM attrec WHERE usn=?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            String id = ausn.getText();
            preparedStatement.setString(1, id);
            attrec(id);

            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                AUSN.setText(rs.getString("usn"));
                aname.setText(rs.getString("stdname"));
                attper.setText(String.valueOf(rs.getFloat("attper")));
            } else {
                JOptionPane.showMessageDialog(null, "Record Not Found");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void artableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_artableMouseClicked
        // TODO add your handling code here:
        model1 = (DefaultTableModel) artable.getModel();
        rowIndex = artable.getSelectedRow();
        ausn.setText(model1.getValueAt(rowIndex, 0).toString());
        AUSN.setText(model1.getValueAt(rowIndex, 0).toString());
        aname.setText(model1.getValueAt(rowIndex, 1).toString());
        attper.setText(model1.getValueAt(rowIndex, 5).toString());
        String sql = "SELECT * FROM attendance WHERE usn=?";
        try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
            preparedStatement.setString(1, AUSN.getText());
            try (ResultSet rs = preparedStatement.executeQuery()) {
                if (rs.next()) {
                    int value = rs.getInt("sem");
                    // Assuming ssem is your JComboBox for semester selection
                    switch (value) {
                        case 1 ->
                            ss.setSelectedIndex(1);
                        case 2 ->
                            ss.setSelectedIndex(2);
                        case 3 ->
                            ss.setSelectedIndex(3);
                        case 4 ->
                            ss.setSelectedIndex(4);
                        case 5 ->
                            ss.setSelectedIndex(5);
                        case 6 ->
                            ss.setSelectedIndex(6);
                        case 7 ->
                            ss.setSelectedIndex(7);
                        case 8 ->
                            ss.setSelectedIndex(8);
                        default -> {
                        }
                    }
                    String svalue = rs.getString("sname");
                    switch (svalue) {
                        case "A" ->
                            sc.setSelectedIndex(1);
                        case "B" ->
                            sc.setSelectedIndex(2);
                        case "C" ->
                            sc.setSelectedIndex(3);
                        case "D" ->
                            sc.setSelectedIndex(4);
                        case "E" ->
                            sc.setSelectedIndex(5);
                        case "F" ->
                            sc.setSelectedIndex(6);
                        case "G" ->
                            sc.setSelectedIndex(7);
                        case "H" ->
                            sc.setSelectedIndex(8);
                        case "I" ->
                            sc.setSelectedIndex(9);
                        case "J" ->
                            sc.setSelectedIndex(10);
                        case "K" ->
                            sc.setSelectedIndex(11);
                        default -> {
                            // Handle any other cases if needed
                        }
                    }
                } else {
                    // Handle case where no record found
                    // For example, reset the selection of ssem JComboBox
                    ss.setSelectedIndex(0);
                    sc.setSelectedIndex(0);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(thome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_artableMouseClicked

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        // TODO add your handling code here:
        ausn.setText(null);
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        String b = sb.getText();
        String id = AUSN.getText();
        String sql1 = "SELECT usn, stdname,semester,section,classcount, attper FROM attrec WHERE branch = ?  AND clgid = ? AND usn=?";

        // Use try-with-resources to auto-close resources
        try (PreparedStatement pstmt = conn.prepareStatement(sql1)) {
            pstmt.setString(1, b);
            pstmt.setInt(2, teacherCollegeID);
            pstmt.setString(3, id);
            ResultSet res = pstmt.executeQuery();
            attper.setText(String.valueOf(res.getFloat("attrec")));
        } catch (SQLException ex) {
            Logger.getLogger(thome.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(this, "Do you want to logout now?", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            this.dispose();
            LOGIN object =new LOGIN();
            object.setVisible(true);
        }
    }//GEN-LAST:event_jButton41ActionPerformed

    private void tidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tidActionPerformed

    private void tnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tnameActionPerformed

    private void tmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tmailActionPerformed

    private void tdeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tdeptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tdeptActionPerformed

    private void tphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tphoneActionPerformed

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
        // TODO add your handling code here:
        try {
            String semester = (String) sem.getSelectedItem();
            String section = (String) sec.getSelectedItem();
            String subject = (String) sub.getSelectedItem();

            if (semester.equals("Select-Semester") || section.equals("Select-Section") || subject.equals("Select-Subject")) {
                JOptionPane.showMessageDialog(null, "All fields are required");
            } else {
                int seme = Integer.parseInt(semester);
                String duplicateCheckSql = "SELECT COUNT(*) FROM classes WHERE sem = ? AND sec = ? AND sub = ?";
                try (PreparedStatement duplicateCheckStmt = conn.prepareStatement(duplicateCheckSql)) {
                    duplicateCheckStmt.setInt(1, seme);
                    duplicateCheckStmt.setString(2, section);
                    duplicateCheckStmt.setString(3, subject);
                    ResultSet duplicateCheckResult = duplicateCheckStmt.executeQuery();
                    duplicateCheckResult.next();
                    int count = duplicateCheckResult.getInt(1);
                    if (count > 0) {
                        JOptionPane.showMessageDialog(null, "Duplicate record exists.");
                    } else {
                        String sql = "INSERT INTO classes (clgid, tid, sem, sec, sub, totcls) VALUES (?, ?, ?, ?, ?, ?)";
                        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                            pstmt.setInt(1, teacherCollegeID);
                            pstmt.setInt(2, tID);
                            pstmt.setInt(3, seme);
                            pstmt.setString(4, section);
                            pstmt.setString(5, subject);
                            pstmt.setInt(6, 0);

                            int rowsAffected = pstmt.executeUpdate();
                            if (rowsAffected > 0) {
                                JOptionPane.showMessageDialog(null, "Data Inserted Successfully");
                                showAllSRecord();
                            } else {
                                JOptionPane.showMessageDialog(null, "Failed to insert data");
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }

    }//GEN-LAST:event_jButton42ActionPerformed
    private void showAllSRecord() {
        String sql = "SELECT * FROM classes WHERE tid=?"; // SQL query
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, tID); // Set the parameter value
            ResultSet res = pstmt.executeQuery();
            String[] columnNames = {"Semester", "Section", "Subject", "Total Classes"};
            DefaultTableModel model = new DefaultTableModel(columnNames, 0);
            while (res.next()) {
                Object[] row = {res.getInt("sem"), res.getString("sec"), res.getString("sub"), res.getInt("totcls")};
                model.addRow(row);
            }
            subtable.setModel(model);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error occurred while setting parameter: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
        // TODO add your handling code here:
        String semester = (String) sem.getSelectedItem();
        String section = (String) sec.getSelectedItem();
        String subject = (String) sub.getSelectedItem();
        if (semester.equals("Select-Semester") || section.equals("Select-Section") || subject.equals("Select-Subject")) {
            JOptionPane.showMessageDialog(null, "All fields are required");
        } else {
            try {
                int seme = Integer.parseInt(semester);
                int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this record?", "Warning", JOptionPane.YES_NO_OPTION);
                if (dialogResult == JOptionPane.YES_OPTION) {

                    String sql = "DELETE FROM classes WHERE sub=? AND sem=? AND sec=?";
                    try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                        pstmt.setString(1, subject);
                        pstmt.setInt(2, seme);
                        pstmt.setString(3, section);
                        int rowsAffected = pstmt.executeUpdate();
                        if (rowsAffected > 0) {
                            JOptionPane.showMessageDialog(null, "Record deleted successfully.");
                            showAllSRecord();
                        } else {
                            JOptionPane.showMessageDialog(null, "Failed to delete record.");
                        }
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);

                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton43ActionPerformed

    private void imgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgMouseClicked
        // TODO add your handling code here:
        imagePath = null;
        JFileChooser f = new JFileChooser();
        f.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter fil = new FileNameExtensionFilter("Image files", "jpg", "gif", "png");
        f.addChoosableFileFilter(fil);
        int op = f.showSaveDialog(f);
        if (op == JFileChooser.APPROVE_OPTION) {
            File selectedFile = f.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            img.setIcon(imageAdjust(path, null));
            imagePath = path;

            if (imagePath != null) {
                try {
                    String sql = "UPDATE teacher SET avpath = ? WHERE id = ?";
                    try (PreparedStatement updateStatement = conn.prepareStatement(sql)) {
                        updateStatement.setString(1, imagePath);
                        updateStatement.setInt(2, tID);

                        // Use executeUpdate() for UPDATE statements
                        int rowsAffected = updateStatement.executeUpdate();

                        if (rowsAffected > 0) {
                            JOptionPane.showMessageDialog(null, "Image path successfully updated");
                        } else {
                            JOptionPane.showMessageDialog(null, "No records updated");
                        }
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "SQL Exception: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No image selected");
            }
        }

    }//GEN-LAST:event_imgMouseClicked

    private void adateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adateKeyTyped
        // TODO add your handling code here:
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();

        }
    }//GEN-LAST:event_adateKeyTyped

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
String curdate = dateFormat.format(new Date());
String stbranch = branch.getText().trim(); 
String usnx = USN.getText().trim();
String stname = ssname.getText().trim();
String section = (String) ssec.getSelectedItem();
String selectedSemester = (String) ssem.getSelectedItem();


int stsem = Integer.parseInt(selectedSemester);

String attr = (String) att.getSelectedItem();

if (attr.equals("Absent")) {
    if (!stbranch.isEmpty() && !usnx.isEmpty() && !stname.isEmpty()) {
        String attendanceSql = "INSERT INTO attendance(clgid, tid, stdname, bname, sem, sname, usn, date, attres) "
                             + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement checkDuplicateStatement = conn.prepareStatement("SELECT COUNT(*) FROM attendance WHERE usn = ? AND date = ? AND tid=?")) {
            // Check for duplicate data
            checkDuplicateStatement.setString(1, usnx);
            checkDuplicateStatement.setString(2, curdate);
            checkDuplicateStatement.setInt(3, tID);
            
            ResultSet resultSet = checkDuplicateStatement.executeQuery();
            resultSet.next();
            int count = resultSet.getInt(1);
            if (count > 0) {
                JOptionPane.showMessageDialog(null, "Duplicate attendance data found");
                return;
            }

            try (PreparedStatement atps = conn.prepareStatement(attendanceSql)) {
                atps.setInt(1, teacherCollegeID);
                atps.setInt(2, tID);
                atps.setString(3, stname);
                atps.setString(4, stbranch);
                atps.setInt(5, stsem);
                atps.setString(6, section);
                atps.setString(7, usnx);
                atps.setString(8, curdate);
                atps.setString(9, attr);
                int attendanceRowsAffected = atps.executeUpdate();
                if (attendanceRowsAffected > 0) {
                    updateattrec(usnx, "absent");
                    next();
                    Allattres();
                    Allattrec();
                } else {
                    JOptionPane.showMessageDialog(null, "Insertion of attendance data failed");
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "An error occurred while inserting attendance data: " + ex.getMessage());
        }
    } else {
        JOptionPane.showMessageDialog(null, "One or more values are empty");
    }
} else {
    updateattrec(usnx, "save");
    next();
}

    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        prev();

    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        next();

    }//GEN-LAST:event_jButton11ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
       if (branch.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Enter Student Department.");
                return;
            }
        if (ssem.getSelectedItem().equals("Select-Semester")) {
                JOptionPane.showMessageDialog(null, "Enter Student Semester");
                return;
            }
        String selectedSemester = (String) ssem.getSelectedItem();
if (selectedSemester.equals("Select-Semester")) {
    JOptionPane.showMessageDialog(null, "Please select a semester.");
    return; 
}
    String section = (String) ssec.getSelectedItem();
int stsem = Integer.parseInt(selectedSemester);

        try {
            jToggleButton1.setVisible(false);
            cancel.setVisible(true);
    atpanel.setVisible(true);
    
    // Retrieve the selected section and semester
    
    // Prepare the SQL query to retrieve total classes
    String selectTotalClassesSql = "SELECT * FROM classes WHERE sem=? AND sec=? AND tid=?";
    try (PreparedStatement selectTotalClassesStmt = conn.prepareStatement(selectTotalClassesSql)) {
        selectTotalClassesStmt.setInt(1, stsem);
        selectTotalClassesStmt.setString(2, section);
        selectTotalClassesStmt.setInt(3, tID);

        // Execute the query
        try (ResultSet trs = selectTotalClassesStmt.executeQuery()) {
            if (trs.next()) {
                // Retrieve the current total classes
                int currentTotalClasses = trs.getInt("totcls");
                
                // Increment the total classes
                int newTotalClasses = currentTotalClasses + 1;
                
                // Prepare the SQL query to update total classes
                String updateTotalClassesSql = "UPDATE classes SET totcls = ? WHERE tid = ? AND sem = ? AND sec = ?";
                try (PreparedStatement updateTotalClassesStmt = conn.prepareStatement(updateTotalClassesSql)) {
                    updateTotalClassesStmt.setInt(1, newTotalClasses);
                    updateTotalClassesStmt.setInt(2, tID);
                    updateTotalClassesStmt.setInt(3, stsem);
                    updateTotalClassesStmt.setString(4, section);

                    // Execute the update query
                    int rowsAffected = updateTotalClassesStmt.executeUpdate();
                    if (rowsAffected > 0) {
                        
                        showAllSRecord();
                    }
                }
            }
        }
    }
} catch (SQLException ex) {
    JOptionPane.showMessageDialog(null, ex.getMessage());
}

    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
         String selectedSemester = (String) ssem.getSelectedItem();
String section = (String) ssec.getSelectedItem();

// Check if the selected semester is not the default placeholder value
if (!selectedSemester.equals("Select-Semester")) {
    try {
        atpanel.setVisible(false);
        cancel.setVisible(false);
        jToggleButton1.setVisible(true);

        // Parse the selected semester into an integer
        int stsem = Integer.parseInt(selectedSemester);

        // Prepare the SQL query to retrieve total classes
        String selectTotalClassesSql = "SELECT * FROM classes WHERE sem=? AND sec=? AND tid=?";
        try (PreparedStatement selectTotalClassesStmt = conn.prepareStatement(selectTotalClassesSql)) {
            selectTotalClassesStmt.setInt(1, stsem);
            selectTotalClassesStmt.setString(2, section);
            selectTotalClassesStmt.setInt(3, tID);

            // Execute the query
            try (ResultSet trs = selectTotalClassesStmt.executeQuery()) {
                if (trs.next()) {
                    // Retrieve the current total classes
                    int currentTotalClasses = trs.getInt("totcls");

                    // Decrement the total classes by 1
                    int newTotalClasses = currentTotalClasses - 1;

                    // Prepare the SQL query to update total classes
                    String updateTotalClassesSql = "UPDATE classes SET totcls = ? WHERE tid = ? AND sem = ? AND sec = ?";
                    try (PreparedStatement updateTotalClassesStmt = conn.prepareStatement(updateTotalClassesSql)) {
                        updateTotalClassesStmt.setInt(1, newTotalClasses);
                        updateTotalClassesStmt.setInt(2, tID);
                        updateTotalClassesStmt.setInt(3, stsem);
                        updateTotalClassesStmt.setString(4, section);

                        // Execute the update query
                        int rowsAffected = updateTotalClassesStmt.executeUpdate();
                        if (rowsAffected > 0) {
                            // If update is successful, show all records
                            showAllSRecord();
                        }
                    }
                }
            }
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Database error occurred: " + ex.getMessage());
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(null, "Invalid semester selected.");
    }
} else {
    // Handle the case where "Select-Semester" is selected
    JOptionPane.showMessageDialog(null, "Please select a valid semester.");
}

    }//GEN-LAST:event_cancelActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        atpanel.setVisible(false);
        cancel.setVisible(false);
        jToggleButton1.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed
    private ImageIcon imageAdjust(String path, byte[] pic) {
        ImageIcon myImg = null;
        if (path != null) {
            myImg = new ImageIcon(path);
        } else {
            myImg = new ImageIcon(pic);
        }
        Image simg = myImg.getImage();
        Image newImg = simg.getScaledInstance(img.getWidth(), img.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(newImg);
        return icon;
    }

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
            java.util.logging.Logger.getLogger(thome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(thome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(thome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(thome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new thome().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AUSN;
    private javax.swing.JTextField USN;
    private com.toedter.calendar.JDateChooser adate;
    private javax.swing.JTextField aname;
    private javax.swing.JTable artable;
    private javax.swing.JPanel atpanel;
    private javax.swing.JComboBox<String> att;
    private javax.swing.JTable attable;
    private javax.swing.JTextField attper;
    private javax.swing.JTextField ausn;
    private javax.swing.JTextField branch;
    private javax.swing.JButton cancel;
    private javax.swing.JLabel img;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JPanel jPanel1;
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
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField sb;
    private javax.swing.JComboBox<String> sc;
    private javax.swing.JComboBox<String> sec;
    private javax.swing.JComboBox<String> sem;
    private javax.swing.JComboBox<String> ss;
    private javax.swing.JComboBox<String> ssec;
    private javax.swing.JComboBox<String> ssem;
    private javax.swing.JTextField ssname;
    private javax.swing.JTextField ssusn;
    private javax.swing.JComboBox<String> sub;
    private javax.swing.JTable subtable;
    private javax.swing.JTextField tcc;
    private javax.swing.JTextField tdept;
    private javax.swing.JTextField tid;
    private javax.swing.JTextField tmail;
    private javax.swing.JTextField tname;
    private javax.swing.JTextField tphone;
    // End of variables declaration//GEN-END:variables
}
