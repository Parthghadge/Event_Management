
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 91812
 */
public class menu extends javax.swing.JFrame {

    /**
     * Creates new form menu
     */
    public menu() {
        initComponents();
    }
    
    public menu(String id)
    {
        initComponents();
        labelID.setText(id);
        fillCombo();
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        UpdateProfile = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        comboBoxV = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        showDetailsBtn = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        eventTable = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtEventID = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtBookingStatus = new javax.swing.JLabel();
        checkBtn = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtNo = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtDOB = new javax.swing.JTextField();
        updateBtn = new javax.swing.JButton();
        labelID = new javax.swing.JLabel();
        changePassBtn = new javax.swing.JButton();
        CreateEvent = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtDay = new javax.swing.JComboBox<>();
        txtMonth = new javax.swing.JComboBox<>();
        txtYear = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        comboBoxVenue = new javax.swing.JComboBox<>();
        checkStage = new javax.swing.JCheckBox();
        checkDj = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        comboBoxFoodPack = new javax.swing.JComboBox<>();
        labelDj = new javax.swing.JLabel();
        labelStage = new javax.swing.JLabel();
        comboBoxPackageType = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        labelFood = new javax.swing.JLabel();
        labelPackage = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtGuest = new javax.swing.JTextField();
        submitBtn = new javax.swing.JButton();
        textEID = new javax.swing.JTextField();
        generateEIDBtn = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        comboBoxOccassion = new javax.swing.JComboBox<>();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(213, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(353, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 525, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        UpdateProfile.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        UpdateProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateProfileMouseClicked(evt);
            }
        });

        comboBoxV.setFont(new java.awt.Font("Segoe UI Historic", 0, 22)); // NOI18N
        comboBoxV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        comboBoxV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboBoxVMouseClicked(evt);
            }
        });
        comboBoxV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxVActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI Historic", 1, 22)); // NOI18N
        jLabel15.setText(" Venue    : ");

        jLabel16.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N

        showDetailsBtn.setFont(new java.awt.Font("Segoe UI Historic", 1, 22)); // NOI18N
        showDetailsBtn.setText("Show Details");
        showDetailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showDetailsBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBoxV, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(250, 250, 250)
                                .addComponent(jLabel16))))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(showDetailsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(285, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxV, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showDetailsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(604, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 188, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 308, Short.MAX_VALUE))
        );

        UpdateProfile.addTab("Browse Venues       ", jPanel6);

        eventTable.setFont(new java.awt.Font("Segoe UI Historic", 0, 22)); // NOI18N
        eventTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Event ID", "Venue Name ", "Date Of Event", "Occassion", "No. Of Guests", "DJ Opted", "Stage Opted", "Food Package", "Package Type", "total Cost", "Booking Status"
            }
        ));
        jScrollPane1.setViewportView(eventTable);

        jLabel17.setFont(new java.awt.Font("Segoe UI Historic", 1, 22)); // NOI18N
        jLabel17.setText("Check Booking Status ");

        jLabel18.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        jLabel18.setText("Enter Event ID : ");

        txtEventID.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        txtEventID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEventIDActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        jLabel20.setText("Booking Status :");

        txtBookingStatus.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N

        checkBtn.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        checkBtn.setText("Check");
        checkBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel17))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(checkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                            .addGap(82, 82, 82)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtBookingStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                            .addGap(91, 91, 91)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28)
                            .addComponent(txtEventID, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 647, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEventID, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(checkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBookingStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(275, Short.MAX_VALUE))
        );

        UpdateProfile.addTab("My Events              ", jPanel7);

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 0, 24)); // NOI18N
        jLabel1.setText("Organiser ID       : ");

        jLabel2.setFont(new java.awt.Font("Segoe UI Historic", 0, 24)); // NOI18N
        jLabel2.setText("Name                 : ");

        jLabel3.setFont(new java.awt.Font("Segoe UI Historic", 0, 24)); // NOI18N
        jLabel3.setText("Contact Number : ");

        jLabel4.setFont(new java.awt.Font("Segoe UI Historic", 0, 24)); // NOI18N
        jLabel4.setText("Email ID              :");

        jLabel5.setFont(new java.awt.Font("Segoe UI Historic", 0, 24)); // NOI18N
        jLabel5.setText("Date Of Birth      :");

        txtName.setFont(new java.awt.Font("Segoe UI Historic", 0, 24)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtNo.setFont(new java.awt.Font("Segoe UI Historic", 0, 24)); // NOI18N
        txtNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoActionPerformed(evt);
            }
        });

        txtEmail.setFont(new java.awt.Font("Segoe UI Historic", 0, 24)); // NOI18N
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        txtDOB.setFont(new java.awt.Font("Segoe UI Historic", 0, 24)); // NOI18N
        txtDOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDOBActionPerformed(evt);
            }
        });

        updateBtn.setFont(new java.awt.Font("Segoe UI Historic", 0, 24)); // NOI18N
        updateBtn.setText("Update Profile");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        labelID.setFont(new java.awt.Font("Segoe UI Historic", 0, 24)); // NOI18N

        changePassBtn.setFont(new java.awt.Font("Segoe UI Historic", 0, 24)); // NOI18N
        changePassBtn.setText("Change Password");
        changePassBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePassBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNo, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelID, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(changePassBtn)
                        .addGap(105, 105, 105)
                        .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(523, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelID, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(updateBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                    .addComponent(changePassBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(545, Short.MAX_VALUE))
        );

        UpdateProfile.addTab("My Profile           ", jPanel8);

        CreateEvent.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                CreateEventMouseMoved(evt);
            }
        });
        CreateEvent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CreateEventMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Historic", 0, 22)); // NOI18N
        jLabel6.setText("Event ID          : ");

        jLabel8.setFont(new java.awt.Font("Segoe UI Historic", 0, 22)); // NOI18N
        jLabel8.setText("Date Of Event : ");

        jLabel9.setFont(new java.awt.Font("Segoe UI Historic", 0, 22)); // NOI18N
        jLabel9.setText("Venue             :  ");

        txtDay.setFont(new java.awt.Font("Segoe UI Historic", 0, 22)); // NOI18N
        txtDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " " }));
        txtDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDayActionPerformed(evt);
            }
        });

        txtMonth.setFont(new java.awt.Font("Segoe UI Historic", 0, 22)); // NOI18N
        txtMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", " ", " ", " " }));
        txtMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMonthActionPerformed(evt);
            }
        });

        txtYear.setFont(new java.awt.Font("Segoe UI Historic", 0, 22)); // NOI18N
        txtYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2019", "2020", " " }));

        jLabel10.setFont(new java.awt.Font("Segoe UI Historic", 0, 22)); // NOI18N
        jLabel10.setText("(dd/mm/yyyy)");

        comboBoxVenue.setFont(new java.awt.Font("Segoe UI Historic", 0, 22)); // NOI18N
        comboBoxVenue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));

        checkStage.setFont(new java.awt.Font("Segoe UI Historic", 0, 22)); // NOI18N
        checkStage.setText("Stage");
        checkStage.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                checkStageItemStateChanged(evt);
            }
        });
        checkStage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkStageActionPerformed(evt);
            }
        });

        checkDj.setFont(new java.awt.Font("Segoe UI Historic", 0, 22)); // NOI18N
        checkDj.setText("DJ");
        checkDj.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                checkDjItemStateChanged(evt);
            }
        });
        checkDj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkDjActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI Historic", 0, 22)); // NOI18N
        jLabel11.setText("Equipments : ");

        jLabel12.setFont(new java.awt.Font("Segoe UI Historic", 0, 22)); // NOI18N
        jLabel12.setText("Food Package : ");

        comboBoxFoodPack.setFont(new java.awt.Font("Segoe UI Historic", 0, 22)); // NOI18N
        comboBoxFoodPack.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Breakfast", "Lunch", "Dinner" }));
        comboBoxFoodPack.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxFoodPackItemStateChanged(evt);
            }
        });
        comboBoxFoodPack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxFoodPackActionPerformed(evt);
            }
        });

        labelDj.setFont(new java.awt.Font("Segoe UI Historic", 0, 22)); // NOI18N

        labelStage.setFont(new java.awt.Font("Segoe UI Historic", 0, 22)); // NOI18N

        comboBoxPackageType.setFont(new java.awt.Font("Segoe UI Historic", 0, 22)); // NOI18N
        comboBoxPackageType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select ", "Normal", "Deluxe", "Royale", " ", " " }));
        comboBoxPackageType.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxPackageTypeItemStateChanged(evt);
            }
        });
        comboBoxPackageType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxPackageTypeActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI Historic", 0, 22)); // NOI18N
        jLabel13.setText("Package Type    : ");

        labelFood.setFont(new java.awt.Font("Segoe UI Historic", 0, 22)); // NOI18N

        labelPackage.setFont(new java.awt.Font("Segoe UI Historic", 0, 22)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Segoe UI Historic", 0, 22)); // NOI18N
        jLabel14.setText("No Of Guests   : ");

        txtGuest.setFont(new java.awt.Font("Segoe UI Historic", 0, 22)); // NOI18N
        txtGuest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGuestActionPerformed(evt);
            }
        });

        submitBtn.setFont(new java.awt.Font("Segoe UI Historic", 0, 22)); // NOI18N
        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        textEID.setFont(new java.awt.Font("Segoe UI Historic", 0, 22)); // NOI18N
        textEID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textEIDActionPerformed(evt);
            }
        });

        generateEIDBtn.setFont(new java.awt.Font("Segoe UI Historic", 0, 22)); // NOI18N
        generateEIDBtn.setText("Generate ID");
        generateEIDBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateEIDBtnActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI Historic", 0, 22)); // NOI18N
        jLabel19.setText("Occassion        : ");

        comboBoxOccassion.setFont(new java.awt.Font("Segoe UI Historic", 0, 22)); // NOI18N
        comboBoxOccassion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select ", "Birthday Party", "College Farewell", "Get Together", "Wedding", "Business Conference" }));
        comboBoxOccassion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxOccassionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CreateEventLayout = new javax.swing.GroupLayout(CreateEvent);
        CreateEvent.setLayout(CreateEventLayout);
        CreateEventLayout.setHorizontalGroup(
            CreateEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreateEventLayout.createSequentialGroup()
                .addGroup(CreateEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CreateEventLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(CreateEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CreateEventLayout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(91, 91, 91)
                                .addComponent(txtGuest, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CreateEventLayout.createSequentialGroup()
                                .addGroup(CreateEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(CreateEventLayout.createSequentialGroup()
                                        .addGroup(CreateEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(CreateEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(checkDj, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(52, 52, 52)
                                        .addGroup(CreateEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(CreateEventLayout.createSequentialGroup()
                                                .addComponent(txtDay, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(78, 78, 78)
                                                .addComponent(txtMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(textEID, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(comboBoxVenue, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(checkStage, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(CreateEventLayout.createSequentialGroup()
                                        .addGroup(CreateEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelDj, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(83, 83, 83)
                                        .addGroup(CreateEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelStage, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(comboBoxOccassion, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(CreateEventLayout.createSequentialGroup()
                                        .addGroup(CreateEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(comboBoxFoodPack, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(labelFood, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(155, 155, 155)
                                        .addGroup(CreateEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(labelPackage, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(comboBoxPackageType, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(CreateEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(CreateEventLayout.createSequentialGroup()
                                        .addGap(78, 78, 78)
                                        .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(CreateEventLayout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(generateEIDBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7))))))
                    .addGroup(CreateEventLayout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        CreateEventLayout.setVerticalGroup(
            CreateEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreateEventLayout.createSequentialGroup()
                .addGroup(CreateEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CreateEventLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel7))
                    .addGroup(CreateEventLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(CreateEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textEID, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CreateEventLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(generateEIDBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addGroup(CreateEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDay, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CreateEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxVenue, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(CreateEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(CreateEventLayout.createSequentialGroup()
                        .addGroup(CreateEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(checkDj, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkStage, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelDj, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelStage, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CreateEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxOccassion, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CreateEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CreateEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CreateEventLayout.createSequentialGroup()
                        .addComponent(comboBoxFoodPack, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(CreateEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelFood, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPackage, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(CreateEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGuest, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(comboBoxPackageType, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(231, Short.MAX_VALUE))
        );

        UpdateProfile.addTab("Create Event             ", CreateEvent);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UpdateProfile)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(UpdateProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 1212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void fillCombo()
    {
        try 
        {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/seProject?autoRecconct=true&useSSL=false", "root", "mysql123");
            Statement st = con.createStatement();
            ResultSet rs= st.executeQuery("Select vname from venue order by vname ");
            while(rs.next())
            {
                comboBoxVenue.addItem(rs.getString(1));
                comboBoxV.addItem(rs.getString(1));
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
              
    }
    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtDOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDOBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDOBActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        String name,contact,email,dob,id;
        name=txtName.getText();
        contact = txtNo.getText();
        email=txtEmail.getText();
        dob=txtDOB.getText();
        id=labelID.getText();
        try
        {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/seProject?autoRecconct=true&useSSL=false", "root", "mysql123");
            PreparedStatement st = con.prepareStatement("update userdb set name='"+name+"',contact_number='"+contact+"',email_id='"+email+"',dob='"+dob+"' where organiser_id='"+id+"'");
            int count = st.executeUpdate();
            System.out.println("row/s afffected");
            JOptionPane.showMessageDialog(this,"Profile Updated Successfully!","Success",JOptionPane.OK_OPTION);
            st.close();
            con.close();
        }
       catch (Exception e )
       {
           System.out.println(e); 
       }
        
    }//GEN-LAST:event_updateBtnActionPerformed

    private void UpdateProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateProfileMouseClicked
        try 
        { 
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/seProject?autoRecconct=true&useSSL=false", "root", "mysql123");
            Statement st = con.createStatement();
            String id=labelID.getText();
            ResultSet rs= st.executeQuery("Select * from userdb where organiser_id ='"+id+"'");
            rs.next();
            txtName.setText(rs.getString(2));    
            txtNo.setText(rs.getString(3));
            txtEmail.setText(rs.getString(4));
            txtDOB.setText(rs.getString(5));   

        }
        catch (Exception e)
        {
            
            System.out.println(e);
        }
        //my events
        try 
        { 
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/seProject?autoRecconct=true&useSSL=false", "root", "mysql123");
            Statement st = con.createStatement();
            String id=labelID.getText();
            DefaultTableModel tm=(DefaultTableModel)eventTable.getModel();
            tm.setRowCount(0);
            eventTable.setRowHeight(30);
            ResultSet rs= st.executeQuery("Select * from event where organiser_id ='"+id+"'");
            while(rs.next())
            {
                Object o[]={rs.getString(1),rs.getString(4),rs.getString(5),rs.getString(13),rs.getInt(6),rs.getInt(7),rs.getInt(8),rs.getString(9),rs.getString(10),rs.getInt(11),rs.getString(12)};
                tm.addRow(o);
            }     
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        
        
        
        
    }//GEN-LAST:event_UpdateProfileMouseClicked

    private void changePassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePassBtnActionPerformed
        String id=labelID.getText();
        new changePassword(id).setVisible(true);
    }//GEN-LAST:event_changePassBtnActionPerformed

    private void txtDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDayActionPerformed

    private void checkStageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkStageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkStageActionPerformed

    private void checkDjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkDjActionPerformed
        
        //labelDj.setText("Rs. "+String.valueOf(rs.getInt("dj")));
    }//GEN-LAST:event_checkDjActionPerformed

    private void txtGuestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGuestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGuestActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        try 
        { 
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/seProject?autoRecconct=true&useSSL=false", "root", "mysql123");
            Statement st = con.createStatement();
            
            String eid=textEID.getText();
            String dov,day=null,month=null,year=null,vname=null;
            Object d=txtDay.getSelectedItem();
            if(d!=null)
                day=d.toString();
            d=txtMonth.getSelectedItem();
            if(d!=null)
                month=d.toString();
            d=txtYear.getSelectedItem();
            if(d!=null)
                year=d.toString();
            dov= year + "-" + month + "-" + day;
            d=comboBoxVenue.getSelectedItem();
            if(d!=null)
                vname=d.toString();
            //d=comboBoxFoodPack.getSelectedItem();
            String foodPackage=null,packageType=null;
            d=comboBoxFoodPack.getSelectedItem();
            if(d!=null)
                foodPackage=d.toString();
            d=comboBoxPackageType.getSelectedItem();
            if(d!=null)
                packageType=d.toString();
            d=comboBoxOccassion.getSelectedItem();
            String occassion=null;
            if(d!=null)
                occassion=d.toString();
            int total=0;
            int guest;
            guest=Integer.parseInt(txtGuest.getText());
            ResultSet rs=st.executeQuery("select capacity from venue where vname='"+vname+"'");
            rs.next();
            if(guest>rs.getInt(1))
            {
                JOptionPane.showMessageDialog(this,"Specified number of guests would not be accomodated in that venue.","Error",JOptionPane.ERROR_MESSAGE);
                return;
            }
            if(vname.equals("Select"))
            {
                JOptionPane.showMessageDialog(this,"Please select venue","No Venue",JOptionPane.ERROR_MESSAGE);
                return;
            }
            rs=st.executeQuery("select vid from venue where vname='"+vname+"'");
            rs.next();
            String vid=rs.getString(1);
            Statement st2=con.createStatement();
            ResultSet rate= st2.executeQuery("Select * from rate where vid='"+vid+"'");
            rate.next();
            PreparedStatement st1=con.prepareStatement("Insert into event values (?,?,?,?,?,?,?,?,?,?,?,?,?)");
            st1.setString(1,eid);
            st1.setString(2,labelID.getText());
            st1.setString(3, vid);
            st1.setString(4,vname);
            st1.setString(5,dov);
            st1.setString(6,txtGuest.getText());
            if(checkDj.isSelected())
            {
                st1.setInt(7,1);
                total+=rate.getInt("dj");
            }
            else
                st1.setInt(7,0);
            if(checkStage.isSelected())
            {
                st1.setInt(8,1);
                total+=rate.getInt("stage");
            }
            else
                st1.setInt(8,0);
            
            st1.setString(9,foodPackage);
            st1.setString(10,packageType);
            String food=labelFood.getText();
            String pack=labelPackage.getText();
            total+=(Integer.parseInt(food.substring(4,food.length())) + Integer.parseInt(pack.substring(4,pack.length())))*Integer.parseInt(txtGuest.getText());
            total+=rate.getInt("rent");
            st1.setInt(11,total);
            st1.setString(12,"Pending");
            st1.setString(13,occassion);
            int count= st1.executeUpdate();
            System.out.println(count+"row affected");
            int yesOrNo=JOptionPane.showConfirmDialog(null,"your event is sent for approval", "",JOptionPane.OK_OPTION);
            if(yesOrNo==0)
            {
                new payment(String.valueOf(total),labelID.getText()).setVisible(true);
                return;
            }
            st.close();
            con.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_submitBtnActionPerformed

    private void CreateEventMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateEventMouseClicked
        
    }//GEN-LAST:event_CreateEventMouseClicked

    private void checkDjItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_checkDjItemStateChanged
        
        try 
        {
            Object d=comboBoxVenue.getSelectedItem();
            String vname=null;
            if(d!=null)
                vname=d.toString();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/seProject?autoRecconct=true&useSSL=false", "root", "mysql123");
            Statement st1=con.createStatement();
            ResultSet rate=st1.executeQuery("select vid from venue where vname='"+vname+"'");
            rate.next();
            String vid=rate.getString(1);
            Statement st=con.createStatement();
            ResultSet rs= st.executeQuery("Select * from rate where vid='"+vid+"'");
            rs.next();
            int dj=0,stage=0;
            if(checkDj.isSelected())
            {
                dj=1;
                labelDj.setText("Rs. "+String.valueOf(rs.getInt("dj")));
            }
            if(!checkDj.isSelected())
            {
                labelDj.setText("");
            }
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_checkDjItemStateChanged

    private void checkStageItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_checkStageItemStateChanged
         try 
        {
            Object d=comboBoxVenue.getSelectedItem();
            String vname=null;
            if(d!=null)
                vname=d.toString();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/seProject?autoRecconct=true&useSSL=false", "root", "mysql123");
            Statement st1=con.createStatement();
            ResultSet rate=st1.executeQuery("select vid from venue where vname='"+vname+"'");
            rate.next();
            String vid=rate.getString(1);
            Statement st=con.createStatement();
            ResultSet rs= st.executeQuery("Select * from rate where vid='"+vid+"'");
            rs.next();
            int stage=0;
            if(checkStage.isSelected())
            {
                stage=1;
                labelStage.setText("Rs. "+String.valueOf(rs.getInt("stage")));
            }
            if(!checkStage.isSelected())
            {
                labelStage.setText("");
            }
            
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_checkStageItemStateChanged

    private void comboBoxFoodPackItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxFoodPackItemStateChanged
        try {
            Object d=comboBoxVenue.getSelectedItem();
            String vname=null;
            if(d!=null)
                vname=d.toString();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/seProject?autoRecconct=true&useSSL=false", "root", "mysql123");
            Statement st1=con.createStatement();
            ResultSet rate=st1.executeQuery("select vid from venue where vname='"+vname+"'");
            rate.next();
            String vid=rate.getString(1);
            Statement st=con.createStatement();
            ResultSet rs= st.executeQuery("Select * from rate where vid='"+vid+"'");
            rs.next();
            String foodPackage=null;
            d=comboBoxFoodPack.getSelectedItem();
            if(d!=null)
                foodPackage=d.toString();
            if(foodPackage.equals("Breakfast"))
            {
                labelFood.setText("Rs. "+rs.getInt("Breakfast"));
            }
            if(foodPackage.equals("Lunch"))
            {
                labelFood.setText("Rs. "+rs.getInt("Lunch"));
            }
            if(foodPackage.equals("Dinner"))
            {
                labelFood.setText("Rs. "+rs.getInt("Dinner"));
            }
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_comboBoxFoodPackItemStateChanged

    private void comboBoxPackageTypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxPackageTypeItemStateChanged
         try {
            Object d=comboBoxVenue.getSelectedItem();
            String vname=null;
            if(d!=null)
                vname=d.toString();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/seProject?autoRecconct=true&useSSL=false", "root", "mysql123");
            Statement st1=con.createStatement();
            ResultSet rate=st1.executeQuery("select vid from venue where vname='"+vname+"'");
            rate.next();
            String vid=rate.getString(1);
            Statement st=con.createStatement();
            ResultSet rs= st.executeQuery("Select * from rate where vid='"+vid+"'");
            rs.next();
            String PackageType=null;
            d=comboBoxPackageType.getSelectedItem();
            if(d!=null)
                PackageType=d.toString();
            
            if(PackageType.equals("Normal"))
            {
                labelPackage.setText("Rs. "+rs.getInt("normal"));
            }
            if(PackageType.equals("Deluxe"))
            {
                labelPackage.setText("Rs. "+rs.getInt("Deluxe"));
            }
            if(PackageType.equals("Royale"))
            {
                labelPackage.setText("Rs. "+rs.getInt("royale"));
            }
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_comboBoxPackageTypeItemStateChanged

    private void textEIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textEIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textEIDActionPerformed

    private void txtMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMonthActionPerformed

    private void generateEIDBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateEIDBtnActionPerformed
        try 
        {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/seProject?autoRecconct=true&useSSL=false", "root", "mysql123");
            Statement st = con.createStatement();
            ResultSet rs= st.executeQuery("Select eid from event order by eid desc limit 1");
            rs.next();
            String eid=rs.getString(1);
            int a=(Integer.parseInt(eid.substring(1,eid.length()))+1);
            textEID.setText("e"+String.valueOf(a));
        }
        catch (SQLException ex)
        {
            Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_generateEIDBtnActionPerformed

    private void CreateEventMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateEventMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_CreateEventMouseMoved

    private void comboBoxVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxVActionPerformed

    private void showDetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showDetailsBtnActionPerformed
        String venueSelected=null;
        Object obj=comboBoxV.getSelectedItem();
        if(obj!=null)
                venueSelected=obj.toString();
        
        new venuedetails(venueSelected,labelID.getText()).setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_showDetailsBtnActionPerformed

    private void txtEventIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEventIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEventIDActionPerformed

    private void checkBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBtnActionPerformed
        try 
        {
            String eid=txtEventID.getText();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/seProject?autoRecconct=true&useSSL=false", "root", "mysql123");
            Statement st = con.createStatement();
            ResultSet rs= st.executeQuery("Select bookingStatus from event where eid='"+eid+"'");
            rs.next();
            txtBookingStatus.setText(rs.getString(1));
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_checkBtnActionPerformed

    private void comboBoxFoodPackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxFoodPackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxFoodPackActionPerformed

    private void comboBoxOccassionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxOccassionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxOccassionActionPerformed

    private void comboBoxPackageTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxPackageTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxPackageTypeActionPerformed

    private void comboBoxVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboBoxVMouseClicked
        
    }//GEN-LAST:event_comboBoxVMouseClicked
    
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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        try 
        {        
            Class.forName("com.mysql.jdbc.Driver");            
        }
        catch (ClassNotFoundException ex) 
        {
            Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
           
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CreateEvent;
    private javax.swing.JTabbedPane UpdateProfile;
    private javax.swing.JButton changePassBtn;
    private javax.swing.JButton checkBtn;
    private javax.swing.JCheckBox checkDj;
    private javax.swing.JCheckBox checkStage;
    private javax.swing.JComboBox<String> comboBoxFoodPack;
    private javax.swing.JComboBox<String> comboBoxOccassion;
    private javax.swing.JComboBox<String> comboBoxPackageType;
    private javax.swing.JComboBox<String> comboBoxV;
    private javax.swing.JComboBox<String> comboBoxVenue;
    private javax.swing.JTable eventTable;
    private javax.swing.JButton generateEIDBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDj;
    private javax.swing.JLabel labelFood;
    private javax.swing.JLabel labelID;
    private javax.swing.JLabel labelPackage;
    private javax.swing.JLabel labelStage;
    private javax.swing.JButton showDetailsBtn;
    private javax.swing.JButton submitBtn;
    private javax.swing.JTextField textEID;
    private javax.swing.JLabel txtBookingStatus;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JComboBox<String> txtDay;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEventID;
    private javax.swing.JTextField txtGuest;
    private javax.swing.JComboBox<String> txtMonth;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNo;
    private javax.swing.JComboBox<String> txtYear;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
