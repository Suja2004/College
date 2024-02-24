package sams;

import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.*;
import java.sql.PreparedStatement;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
/* *
 * @author Suja
 */
public final class SAHOME extends javax.swing.JFrame {

    /**
     * Creates new form THOME
     */
    Connection conn = null;
    Statement stmt = null;
    College clg = new College();
    Admin a = new Admin();
    private DefaultTableModel model1;
    private int rowIndex;
    public SAHOME() {
         super("Admin");
        initComponents();
        conn = DB.Connection(); 
        updateCombo();
        init();
        AutoCompleteDecorator.decorate(aclg);
    }
    private void updateCombo() {
        String sql="Select * from college";
        try{
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
         ResultSet res = preparedStatement.executeQuery();
         while(res.next()){
             aclg.addItem(res.getString("clgname"));
         }
    }
        catch(Exception e){
           JOptionPane.showMessageDialog(null, e);

        }
    }
public void showCRecord(int id) {
    try {
        stmt = conn.createStatement();
        String sql = "SELECT * FROM college WHERE clgid=?";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        ResultSet res = preparedStatement.executeQuery();
        
        // Define column names for your table model
        String[] columnNames = {"College ID", "College Name","College Code", "Location", "Phone"};

        // Create an empty table model with the defined column names
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);

        // Populate the table model with the query result
        while (res.next()) {
            Object[] row = {res.getInt("clgid"), res.getString("clgname"), res.getString("clgcode"), res.getString("location"), res.getString("phone")};
            model.addRow(row);
        }

        // Set the table model to the table
        ctable.setModel(model);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
}

public void showAllCRecord() {
    try {
        stmt = conn.createStatement();
        String sql = "SELECT * FROM college";
        ResultSet res = stmt.executeQuery(sql);
        
        // Define column names for your table model
        String[] columnNames = {"College ID", "College Name","College Code", "Location", "Phone"};

        // Create an empty table model with the defined column names
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);

        // Populate the table model with the query result
        while (res.next()) {
            Object[] row = {res.getInt("clgid"), res.getString("clgname"), res.getString("clgcode"), res.getString("location"), res.getString("phone")};
            model.addRow(row);
        }

        // Set the table model to the table
        ctable.setModel(model);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
}

public void showAllCourseRecord() {
    try {
        stmt = conn.createStatement();
        String sql = "SELECT * FROM courses";
        ResultSet res = stmt.executeQuery(sql);
        
        // Define column names for your table model
        String[] columnNames = {"Course Code", "Course Name","Credits"};

        // Create an empty table model with the defined column names
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);

        // Populate the table model with the query result
        while (res.next()) {
            Object[] row = {res.getString("crcd"), res.getString("crs"), res.getString("crd")};
            model.addRow(row);
        }

        // Set the table model to the table
        crtable.setModel(model);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
}public void showCourseRecord(String code) {
    try {
        String sql = "SELECT * FROM courses WHERE crcd = ?";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setString(1, code);

        ResultSet res = preparedStatement.executeQuery();

        String[] columnNames = {"Course Code", "Course Name", "Credits"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);

        while (res.next()) {
            Object[] row = {res.getString("crcd"), res.getString("crs"), res.getString("crd")};
            model.addRow(row);
        }

        crtable.setModel(model);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        loc = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        cphone = new javax.swing.JTextField();
        cname = new javax.swing.JTextField();
        cno = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        ccode = new javax.swing.JTextField();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        cid = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ctable = new javax.swing.JTable();
        jPanel20 = new javax.swing.JPanel();
        jButton12 = new javax.swing.JButton();
        up = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        aname = new javax.swing.JTextField();
        amail = new javax.swing.JTextField();
        aphone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        aclg = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        aid = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        aaid = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        atable = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        con = new javax.swing.JTextField();
        crd = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        ccd = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        ccod = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jPanel22 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        crtable = new javax.swing.JTable();
        jPanel23 = new javax.swing.JPanel();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();

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
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
        );

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jPanel12.setBackground(new java.awt.Color(0, 204, 255));

        jPanel13.setBackground(new java.awt.Color(102, 255, 102));
        jPanel13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 255), 4, true));

        jPanel14.setBackground(new java.awt.Color(102, 255, 102));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Location");

        loc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("College Name");

        jLabel26.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Phone No");

        cphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cphoneActionPerformed(evt);
            }
        });
        cphone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cphoneKeyTyped(evt);
            }
        });

        cname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnameActionPerformed(evt);
            }
        });

        cno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnoActionPerformed(evt);
            }
        });
        cno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cnoKeyTyped(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("No.");

        jLabel18.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("College Code");

        ccode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ccodeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ccode))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cno))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(loc, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(cphone))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cname, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)))
                .addGap(39, 39, 39))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ccode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cphone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(125, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel17.setBackground(new java.awt.Color(102, 255, 102));
        jPanel17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 255), 4, true));

        jPanel18.setBackground(new java.awt.Color(102, 255, 102));
        jPanel18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 255), 4, true));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Search College");

        jButton10.setBackground(new java.awt.Color(0, 153, 255));
        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton10.setText("Search");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(51, 153, 255));
        jButton11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton11.setText("Refresh");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(cid, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cid, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel19.setBackground(new java.awt.Color(102, 255, 102));
        jPanel19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 255), 4, true));

        ctable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "College Name", "Location", "Phone No"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ctable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ctableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(ctable);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jPanel20.setBackground(new java.awt.Color(102, 255, 102));
        jPanel20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 255), 4, true));

        jButton12.setBackground(new java.awt.Color(51, 153, 255));
        jButton12.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton12.setText("Add New");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        up.setBackground(new java.awt.Color(51, 153, 255));
        up.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        up.setText("Update");
        up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(51, 153, 255));
        jButton14.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton14.setText("Delete");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setBackground(new java.awt.Color(51, 153, 255));
        jButton15.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton15.setText("LogOut");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setBackground(new java.awt.Color(51, 153, 255));
        jButton16.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton16.setText("Clear");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(up, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(up, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("College", jPanel12);

        jPanel3.setBackground(new java.awt.Color(0, 204, 255));

        jPanel4.setBackground(new java.awt.Color(102, 255, 102));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 255), 4, true));

        jPanel6.setBackground(new java.awt.Color(102, 255, 102));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Email");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Phone No");

        aname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anameActionPerformed(evt);
            }
        });

        amail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amailActionPerformed(evt);
            }
        });

        aphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aphoneActionPerformed(evt);
            }
        });
        aphone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                aphoneKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("College Name");

        aclg.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        aclg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select-College" }));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("ID");

        aid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aidActionPerformed(evt);
            }
        });
        aid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                aidKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(aid))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(amail))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aclg, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(aphone)
                                .addComponent(aname, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(amail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aclg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aphone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(102, 255, 102));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 255), 4, true));

        jPanel9.setBackground(new java.awt.Color(102, 255, 102));
        jPanel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 255), 4, true));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Search Admin");

        jButton3.setBackground(new java.awt.Color(51, 153, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setText("Refresh");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(0, 153, 255));
        jButton13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton13.setText("Search");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(aaid, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(aaid, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel10.setBackground(new java.awt.Color(102, 255, 102));
        jPanel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 255), 4, true));

        atable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Admin ID", "Name", "Email", "College", "Phone No"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        atable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(atable);
        if (atable.getColumnModel().getColumnCount() > 0) {
            atable.getColumnModel().getColumn(2).setHeaderValue("Email");
            atable.getColumnModel().getColumn(4).setHeaderValue("Phone No");
        }

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
        );

        jPanel11.setBackground(new java.awt.Color(102, 255, 102));
        jPanel11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 255), 4, true));

        jButton4.setBackground(new java.awt.Color(51, 153, 255));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton4.setText("Add New");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(51, 153, 255));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton5.setText("Update");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(51, 153, 255));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton6.setText("Delete");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(51, 153, 255));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton7.setText("LogOut");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(51, 153, 255));
        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton8.setText("Clear");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Admin", jPanel3);

        jPanel7.setBackground(new java.awt.Color(0, 204, 255));

        jPanel8.setBackground(new java.awt.Color(102, 255, 102));
        jPanel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 255), 4, true));

        jPanel15.setBackground(new java.awt.Color(102, 255, 102));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Course Name");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Credits");

        con.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conActionPerformed(evt);
            }
        });

        crd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crdActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Course Code");

        ccd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ccdActionPerformed(evt);
            }
        });
        ccd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ccdKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ccd))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(crd))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(con, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ccd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(99, 99, 99)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(con, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(crd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel16.setBackground(new java.awt.Color(102, 255, 102));
        jPanel16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 255), 4, true));

        jPanel21.setBackground(new java.awt.Color(102, 255, 102));
        jPanel21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 255), 4, true));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Search Course");

        jButton9.setBackground(new java.awt.Color(51, 153, 255));
        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton9.setText("Refresh");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton17.setBackground(new java.awt.Color(0, 153, 255));
        jButton17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton17.setText("Search");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(ccod, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ccod, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton17, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel22.setBackground(new java.awt.Color(102, 255, 102));
        jPanel22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 255), 4, true));

        crtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course Code", "Course Name", "Credits"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        crtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crtableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(crtable);

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
        );

        jPanel23.setBackground(new java.awt.Color(102, 255, 102));
        jPanel23.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 255), 4, true));

        jButton18.setBackground(new java.awt.Color(51, 153, 255));
        jButton18.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton18.setText("Add New");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setBackground(new java.awt.Color(51, 153, 255));
        jButton19.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton19.setText("Update");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setBackground(new java.awt.Color(51, 153, 255));
        jButton20.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton20.setText("Delete");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton21.setBackground(new java.awt.Color(51, 153, 255));
        jButton21.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton21.setText("LogOut");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setBackground(new java.awt.Color(51, 153, 255));
        jButton22.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton22.setText("Clear");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Course", jPanel7);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jTabbedPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1316, 733));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void init(){
        tvc();
        tva();
        tvco();
        showAllCRecord();
        showAllARecord();
        showAllCourseRecord();
        cno.setText(String.valueOf(clg.getMax()));
        aid.setText(String.valueOf(a.getMax()));
    }
    private void tvc(){
        model1=(DefaultTableModel) ctable.getModel();
        ctable.setRowHeight(30);
        ctable.setShowGrid(true);
        ctable.setGridColor(Color.black);
        ctable.setBackground(Color.white);
        
    }
    private void tvco(){
        model1=(DefaultTableModel) crtable.getModel();
        crtable.setRowHeight(30);
        crtable.setShowGrid(true);
        crtable.setGridColor(Color.black);
        crtable.setBackground(Color.white);
        
    }

    private void clearc(){
        cname.setText(null);
        loc.setText(null);
        ccode.setText(null);
        cphone.setText(null);
    }
    private void clearco(){
        ccd.setText(null);
        con.setText(null);
        crd.setText(null);
        showAllCourseRecord();
    }
    
    private void tva(){
        model1=(DefaultTableModel) atable.getModel();
        atable.setRowHeight(30);
        atable.setShowGrid(true);
        atable.setGridColor(Color.black);
        atable.setBackground(Color.white);
        
    }
   
    private void cleara(){
        aid.setText(null);
        aname.setText(null);
        amail.setText(null);
        aphone.setText(null);
        aclg.setSelectedIndex(0);
    }
   
    private void anameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anameActionPerformed

    private void amailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amailActionPerformed

    private void aphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aphoneActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        cleara();
        showAllARecord();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
       try {
    // Assuming aid, aname, amail, and aphone are JTextFields for admin ID, name, email, and phone respectively
    String adminId = aid.getText();
    String name = aname.getText();
    String email = amail.getText();
    String clg = aclg.getSelectedItem().toString();
    String phone = aphone.getText();
    
    // Check for empty inputs
    if (adminId.isEmpty() || name.isEmpty() || email.isEmpty() ||clg.isEmpty()|| phone.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please fill in all the fields.");
        return; // Exit the method, no need to proceed with the update
    }

    // Convert admin ID to integer
    int id = Integer.parseInt(adminId);

    // Prepare the SQL query with PreparedStatement
    String sql = "UPDATE admin SET mail=?, name=?,college=?, phone=? WHERE id=?";
    PreparedStatement preparedStatement = conn.prepareStatement(sql);

    // Set parameters for the PreparedStatement
    preparedStatement.setString(1, email);
    preparedStatement.setString(2, name);
    preparedStatement.setString(3, clg);
    preparedStatement.setString(4, phone);
    preparedStatement.setInt(5, id);    

    // Execute the update query
    int rowsUpdated = preparedStatement.executeUpdate();

    if (rowsUpdated > 0) {
        JOptionPane.showMessageDialog(null, "Data Updated Successfully");
                showAllARecord();

    } else {
        JOptionPane.showMessageDialog(null, "Cannot change Admin ID");
    }
} catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(null, "Invalid admin ID. Please enter a valid number.");
} catch (Exception e) {
    JOptionPane.showMessageDialog(null, e);
}


    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        
        try {
    // Prepare the SQL query with PreparedStatement
    String deleteSql = "DELETE FROM admin WHERE id = ?";
    PreparedStatement preparedStatement = conn.prepareStatement(deleteSql);

    // Assuming aid is a JTextField for entering admin ID
    int id = Integer.parseInt(aid.getText());
    preparedStatement.setInt(1, id);

    // Execute the delete query
    preparedStatement.executeUpdate();
    
    JOptionPane.showMessageDialog(null, "Record deleted successfully.");
    cleara();
            showAllARecord();

} catch (Exception e) {
    JOptionPane.showMessageDialog(null, e);
}
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upActionPerformed
        // TODO add your handling code here:
       try {
    // Null check for cname, loc, cno, cphone, and ccode
    if (cname.getText() == null || loc.getText() == null || cno.getText() == null || cphone.getText() == null || ccode.getText() == null) {
        JOptionPane.showMessageDialog(null, "All fields must be filled in to update data.");
        return; // Exit the method, no need to proceed with update
    }

    // Prepare the SQL query with PreparedStatement
    String sql = "UPDATE college SET location=?, clgcode=?, clgname=?, phone=? WHERE clgid=?";
    PreparedStatement preparedStatement = conn.prepareStatement(sql);

    // Assuming cid, cname, and loc are JTextFields for entering college ID, name, and location respectively
    int id = Integer.parseInt(cno.getText());
    String name = cname.getText();
    String loca = loc.getText();
    String ph = cphone.getText();
    String clgcode = ccode.getText();

    // Set parameters for the PreparedStatement
    preparedStatement.setString(1, loca);
    preparedStatement.setString(2, clgcode);    
    preparedStatement.setString(3, name);
    preparedStatement.setString(4, ph);
    preparedStatement.setInt(5, id);

    // Execute the query
    preparedStatement.executeUpdate();

    JOptionPane.showMessageDialog(null, "Data Updated Successfully");
    showAllCRecord();
} catch (Exception e) {
    JOptionPane.showMessageDialog(null, e);
}


    }//GEN-LAST:event_upActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        try {
    int id = Integer.parseInt(cid.getText());

    String deleteSql = "DELETE FROM college WHERE clgid = ?";
    PreparedStatement deleteStatement = conn.prepareStatement(deleteSql);
    deleteStatement.setInt(1, id);
    deleteStatement.executeUpdate();
        JOptionPane.showMessageDialog(null, "Data deleted successfully");
    clearc();
    showAllCRecord();
    

    
} catch (Exception e) {
    JOptionPane.showMessageDialog(null, e);
}

    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        clearc();
        showAllCRecord();
    }//GEN-LAST:event_jButton16ActionPerformed

    private void locActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_locActionPerformed

    private void cphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cphoneActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cphoneActionPerformed

    private void cnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnameActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        int a= JOptionPane.showConfirmDialog(this,"Do you want to logout now?","Select",JOptionPane.YES_NO_OPTION);
        if(a==0){
        setVisible(false);      
        LOGIN object =new LOGIN();
        object.setVisible(true);        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        int a= JOptionPane.showConfirmDialog(this,"Do you want to logout now?","Select",JOptionPane.YES_NO_OPTION);
        if(a==0){
            setVisible(false);
        LOGIN object =new LOGIN();
        object.setVisible(true);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
       try {
    // Null check for cname and loc
    if (cname.getText() == null || loc.getText() == null) {
        JOptionPane.showMessageDialog(null, "College name or location cannot be null.");
        return; // Exit the method, no need to proceed with insertion
    }

    // Prepare the SQL query with PreparedStatement to check for duplicates
    String checkSql = "SELECT COUNT(*) FROM college WHERE clgname = ? AND location = ?";
    PreparedStatement checkStatement = conn.prepareStatement(checkSql);
    checkStatement.setString(1, cname.getText());
    checkStatement.setString(2, loc.getText());
    ResultSet resultSet = checkStatement.executeQuery();

    // Check if any duplicate data exists
    resultSet.next();
    int count = resultSet.getInt(1);
    if (count > 0) {
        JOptionPane.showMessageDialog(null, "Duplicate data exists. Cannot insert.");
        cid.setText(null);
        return; // Exit the method, no need to proceed with insertion
    }

    // Prepare the SQL query with PreparedStatement for insertion
    String sql = "INSERT INTO college (clgname, location, phone, clgid, clgcode) VALUES (?, ?, ?, ?, ?)";
    PreparedStatement preparedStatement = conn.prepareStatement(sql);

    // Set parameters for the PreparedStatement
    preparedStatement.setString(1, cname.getText());
    preparedStatement.setString(2, loc.getText());
    preparedStatement.setString(3, cphone.getText());
    preparedStatement.setString(4, cno.getText());
    preparedStatement.setString(5, ccode.getText());

    // Execute the insertion query
    preparedStatement.executeUpdate();

    JOptionPane.showMessageDialog(null, "Data Inserted Successfully");
    cid.setText(null);
    showAllCRecord();
} catch (Exception e) {
    JOptionPane.showMessageDialog(null, e);
}


    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        
        try {
            if(cid.getText().isEmpty()){
                        JOptionPane.showMessageDialog(null, "Enter College No.");
                        return;
            }
    String sql = "SELECT * FROM college WHERE clgid=?";
    PreparedStatement preparedStatement = conn.prepareStatement(sql);

    int id = Integer.parseInt(cid.getText());
    preparedStatement.setInt(1, id);
    showCRecord(id);
    ResultSet rs = preparedStatement.executeQuery();

    if (rs.next()) {
        cno.setText(rs.getString("clgid"));
        cname.setText(rs.getString("clgname"));
        loc.setText(rs.getString("location"));
        cphone.setText(rs.getString("phone"));
        ccode.setText(rs.getString("clgcode"));
        
    } else {
        JOptionPane.showMessageDialog(null, "Record Not Found");
    }
} catch (Exception e) {
    JOptionPane.showMessageDialog(null, e);
}

        
    }//GEN-LAST:event_jButton10ActionPerformed
public void showARecord(int id){
      try {
    // Prepare the SQL query with PreparedStatement
    String sql = "SELECT id,  name,mail,college,phone FROM admin WHERE id=?";
    PreparedStatement preparedStatement = conn.prepareStatement(sql);
    preparedStatement.setInt(1, id);

    // Execute the query
    ResultSet res = preparedStatement.executeQuery();

    // Define column names for your table model
    String[] columnNames = {"Admin ID", "Admin Name","Email","College","Phone No"};

    // Create an empty table model with the defined column names
    DefaultTableModel model = new DefaultTableModel(columnNames, 0);

    // Populate the table model with the query result
    while (res.next()) {
        Object[] row = {res.getInt("id"),res.getString("name"),res.getString("mail"),res.getString("college"),res.getString("phone") };
        model.addRow(row);
    }

    // Set the table model to the table
    atable.setModel(model);
} catch (Exception e) {
    JOptionPane.showMessageDialog(null, e);
}

    }
public void showAllARecord() {
    try {
        stmt = conn.createStatement();
    String sql = "SELECT id,name,mail,college,phone FROM admin";
        ResultSet res = stmt.executeQuery(sql);
        
        // Define column names for your table model
    String[] columnNames = {"Admin ID", "Admin Name","Email","College","Phone No"};

        // Create an empty table model with the defined column names
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);

        // Populate the table model with the query result
        while (res.next()) {
        Object[] row = {res.getInt("id"),res.getString("name"),res.getString("mail"),res.getString("college"),res.getString("phone") };
            model.addRow(row);
        }

        // Set the table model to the table
        atable.setModel(model);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
}
    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
         try {
            if(aaid.getText().isEmpty()){
                        JOptionPane.showMessageDialog(null, "Enter Admin ID No.");
                        return;
            }
    // Prepare the SQL query with PreparedStatement
    String sql = "SELECT * FROM admin WHERE id=?";
    PreparedStatement preparedStatement = conn.prepareStatement(sql);

    // Assuming cid is a JTextField for entering college ID
    int id = Integer.parseInt(aaid.getText());
    preparedStatement.setInt(1, id);
    showARecord(id);
    // Execute the query
    ResultSet rs = preparedStatement.executeQuery();

    if (rs.next()) {
        // Assuming cname and loc are JTextFields for displaying college name and location respectively
        int aaaid = rs.getInt("id");
        aid.setText(Integer.toString(aaaid));
        aname.setText(rs.getString("name"));
        amail.setText(rs.getString("mail"));
        
        aphone.setText(rs.getString("phone"));
        
    } else {
        JOptionPane.showMessageDialog(null, "Record Not Found");
    }
} catch (Exception e) {
    JOptionPane.showMessageDialog(null, e);
}
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        cid.setText(null);
        
    }//GEN-LAST:event_jButton11ActionPerformed

    private void cnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnoActionPerformed

    private void aidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aidActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try {
    int id = Integer.parseInt(aid.getText());
    String name = aname.getText();
    String email = amail.getText();
    String pass = amail.getText();
    String adclg = (String) aclg.getSelectedItem();
    String ph = aphone.getText();
    String hashedPassword = pHash(pass);

    // Check if any of the required fields are empty
    if (name.isEmpty() || email.isEmpty() || pass.isEmpty() || ("Select-College".equals(adclg))|| ph.isEmpty()) {
        JOptionPane.showMessageDialog(null, "All fields are required");
    } else if (!email.matches("^[A-Za-z0-9._%-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,4}$")) {
        JOptionPane.showMessageDialog(null, "Invalid email format");
    } else {
        String checkDuplicateSql = "SELECT COUNT(*) FROM ADMIN WHERE mail = ?";
        try (PreparedStatement checkStatement = conn.prepareStatement(checkDuplicateSql)) {
            checkStatement.setString(1, email);
            ResultSet resultSet = checkStatement.executeQuery();
            resultSet.next();
            int count = resultSet.getInt(1);
            if (count > 0) {
                JOptionPane.showMessageDialog(null, "Email already exists");
                return; // Exit the method, no need to proceed with insertion
            }
        }

        // Insertion query
        String sql = "INSERT INTO ADMIN (mail, password, name, id, college, phone) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, email);
            pstmt.setString(2, hashedPassword);
            pstmt.setString(3, name);
            pstmt.setInt(4, id);
            pstmt.setString(5, adclg);
            pstmt.setString(6, ph);
            pstmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Data Inserted Successfully");
            showAllARecord();
        }
    }
} catch (Exception e) {
    JOptionPane.showMessageDialog(null, e);
}

    }//GEN-LAST:event_jButton4ActionPerformed

    private void cphoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cphoneKeyTyped
        // TODO add your handling code here:
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
            
        }
    }//GEN-LAST:event_cphoneKeyTyped

    private void aphoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aphoneKeyTyped
        // TODO add your handling code here:
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
            
        }
    }//GEN-LAST:event_aphoneKeyTyped
public static String pHash(String password) {
    try {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(password.getBytes(StandardCharsets.UTF_8));
        byte[] hashedBytes = md.digest();
        StringBuilder sb = new StringBuilder();
        for (byte b : hashedBytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException("Error hashing password", e);
    }
}
    private void atableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atableMouseClicked
        // TODO add your handling code here:
        model1=(DefaultTableModel) atable.getModel();
        rowIndex = atable.getSelectedRow();
        aid.setText(model1.getValueAt(rowIndex,0).toString());
        aname.setText(model1.getValueAt(rowIndex,1).toString());
        amail.setText(model1.getValueAt(rowIndex,2).toString());
        
        aphone.setText(model1.getValueAt(rowIndex,4).toString());
        
    }//GEN-LAST:event_atableMouseClicked

    private void ctableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ctableMouseClicked
        // TODO add your handling code here:
         model1=(DefaultTableModel) ctable.getModel();
        rowIndex = ctable.getSelectedRow();
        cid.setText(model1.getValueAt(rowIndex,0).toString());
        cno.setText(model1.getValueAt(rowIndex,0).toString());
        cname.setText(model1.getValueAt(rowIndex,1).toString());
        ccode.setText(model1.getValueAt(rowIndex,2).toString());                
        loc.setText(model1.getValueAt(rowIndex,3).toString());   
        cphone.setText(model1.getValueAt(rowIndex,4).toString());
    }//GEN-LAST:event_ctableMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
                aaid.setText(null);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void aidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aidKeyTyped
        // TODO add your handling code here:
         if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
            
        }
    }//GEN-LAST:event_aidKeyTyped

    private void cnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cnoKeyTyped
        // TODO add your handling code here:
         if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
            
        }
    }//GEN-LAST:event_cnoKeyTyped

    private void ccodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ccodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ccodeActionPerformed

    private void conActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conActionPerformed

    private void crdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crdActionPerformed

    private void ccdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ccdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ccdActionPerformed

    private void ccdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ccdKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_ccdKeyTyped

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        ccod.setText(null);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
         try {
            if(ccod.getText().isEmpty()){
                        JOptionPane.showMessageDialog(null, "Enter Course code.");
                        return;
            }
    String sql = "SELECT * FROM courses WHERE crcd = ?";
    String cd =ccod.getText();    
    PreparedStatement preparedStatement = conn.prepareStatement(sql);
    preparedStatement.setString(1, cd);
    ResultSet rs = preparedStatement.executeQuery();

    if (rs.next()) {
            showCourseRecord(cd);
        ccd.setText(rs.getString("crcd"));
        con.setText(rs.getString("crs"));
        crd.setText(rs.getString("crd"));
        
    } else {
        
        JOptionPane.showMessageDialog(null, "Record Not Found");
    }
} catch (Exception e) {
    JOptionPane.showMessageDialog(null, e);
}
    }//GEN-LAST:event_jButton17ActionPerformed

    private void crtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crtableMouseClicked
        // TODO add your handling code here:
        model1=(DefaultTableModel) crtable.getModel();
        rowIndex = crtable.getSelectedRow();
        ccd.setText(model1.getValueAt(rowIndex,0).toString());
        ccod.setText(model1.getValueAt(rowIndex,0).toString());
        con.setText(model1.getValueAt(rowIndex,1).toString());
        crd.setText(model1.getValueAt(rowIndex,2).toString()); 
    }//GEN-LAST:event_crtableMouseClicked

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
        try {
    // Null check for cname and loc
    if (ccd.getText() == null || con.getText() == null) {
        JOptionPane.showMessageDialog(null, "Course code or name cannot be null.");
        return; // Exit the method, no need to proceed with insertion
    }

    // Prepare the SQL query with PreparedStatement to check for duplicates
    String checkSql = "SELECT COUNT(*) FROM courses WHERE crcd = ?";
    PreparedStatement checkStatement = conn.prepareStatement(checkSql);
    checkStatement.setString(1, ccd.getText());
    ResultSet resultSet = checkStatement.executeQuery();

    // Check if any duplicate data exists
    resultSet.next();
    int count = resultSet.getInt(1);
    if (count > 0) {
        JOptionPane.showMessageDialog(null, "Duplicate data exists. Cannot insert.");
        return; 
    }

    // Prepare the SQL query with PreparedStatement for insertion
    String sql = "INSERT INTO courses (crcd, crs, crd) VALUES (?, ?, ?)";
    PreparedStatement preparedStatement = conn.prepareStatement(sql);

    // Set parameters for the PreparedStatement
    preparedStatement.setString(1, ccd.getText());
    preparedStatement.setString(2, con.getText());
    preparedStatement.setString(3, crd.getText());


    // Execute the insertion query
    preparedStatement.executeUpdate();

    JOptionPane.showMessageDialog(null, "Data Inserted Successfully");
    ccod.setText(ccd.getText());
    showAllCourseRecord();
} catch (Exception e) {
    JOptionPane.showMessageDialog(null, e);
}
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        try {
    // Null check for ccd, con, and crd
    if (ccd.getText() == null || con.getText() == null || crd.getText() == null) {
        JOptionPane.showMessageDialog(null, "Course code, name, or duration cannot be null.");
        return; // Exit the method, no need to proceed with update
    }

    // Prepare the SQL query with PreparedStatement for update
    String sql = "UPDATE courses SET  crs = ?, crd = ? ,crcd=? WHERE crcd = ?";
    PreparedStatement preparedStatement = conn.prepareStatement(sql);

    // Set parameters for the PreparedStatement
    preparedStatement.setString(1, con.getText());
    preparedStatement.setString(2, crd.getText());
    preparedStatement.setString(3, ccd.getText());
    preparedStatement.setString(4, ccod.getText());
    

    // Execute the update query
    int rowsAffected = preparedStatement.executeUpdate();

    if (rowsAffected > 0) {
        JOptionPane.showMessageDialog(null, "Data Updated Successfully");
        showAllCourseRecord();
    } else {
        JOptionPane.showMessageDialog(null, "No data found for update.");
    }
} catch (Exception e) {
    JOptionPane.showMessageDialog(null, e);
}

        
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
       try {
    // Null check for ccd
    if (ccd.getText() == null) {
        JOptionPane.showMessageDialog(null, "Course code cannot be null.");
        return; // Exit the method, no need to proceed with deletion
    }

    // Prepare the SQL query with PreparedStatement for deletion
    String sql = "DELETE FROM courses WHERE crcd = ?";
    PreparedStatement preparedStatement = conn.prepareStatement(sql);

    // Set parameter for the PreparedStatement
    preparedStatement.setString(1, ccd.getText());

    // Execute the deletion query
    int rowsAffected = preparedStatement.executeUpdate();

    if (rowsAffected > 0) {
        JOptionPane.showMessageDialog(null, "Data Deleted Successfully");
        showAllCourseRecord();
        clearco();
    } else {
        JOptionPane.showMessageDialog(null, "No data found for deletion.");
    }
} catch (Exception e) {
    JOptionPane.showMessageDialog(null, e);
}
 
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
         int a= JOptionPane.showConfirmDialog(this,"Do you want to logout now?","Select",JOptionPane.YES_NO_OPTION);
        if(a==0){
            setVisible(false);
        LOGIN object =new LOGIN();
        object.setVisible(true);
        }
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
        clearco();
    }//GEN-LAST:event_jButton22ActionPerformed
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
            java.util.logging.Logger.getLogger(AHOME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AHOME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AHOME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AHOME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SAHOME().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aaid;
    private javax.swing.JComboBox<String> aclg;
    private javax.swing.JTextField aid;
    private javax.swing.JTextField amail;
    private javax.swing.JTextField aname;
    private javax.swing.JTextField aphone;
    private javax.swing.JTable atable;
    private javax.swing.JTextField ccd;
    private javax.swing.JTextField ccod;
    private javax.swing.JTextField ccode;
    private javax.swing.JTextField cid;
    private javax.swing.JTextField cname;
    private javax.swing.JTextField cno;
    private javax.swing.JTextField con;
    private javax.swing.JTextField cphone;
    private javax.swing.JTextField crd;
    private javax.swing.JTable crtable;
    private javax.swing.JTable ctable;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField loc;
    private javax.swing.JButton up;
    // End of variables declaration//GEN-END:variables
}
