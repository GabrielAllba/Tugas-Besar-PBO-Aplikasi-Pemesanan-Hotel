package view.admin;


import exception.InputKosongException;

import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

import controller.ProvinsiControll;
import controller.GradeControll;
import controller.JenisHotelControll;

import model.Provinsi;
import model.Grade;
import model.JenisHotel;

public class AdminHome extends javax.swing.JFrame {
    
    ProvinsiControll provinsiControl = new ProvinsiControll();
    GradeControll gradeControl = new GradeControll();
    JenisHotelControll jenisHotelControl = new JenisHotelControll();
    
    String action=null;
    int selectedId = 0;
    
    String actionGrade=null;
    int selectedGradeId=0;
    
    String actionJenisHotel=null;
    int selectedJenisHotelId=0;
    
    public AdminHome() {
       initComponents();
       
       // provinsi
       showProvinsi();
       setSaveCancelProvinsi(false);
       setInputProvinsi(false);
       
       // grade
       showGrade();
       setSaveCancelGrade(false);
       setInputGrade(false);
       
       // jenis hotel
       showJenisHotel();
       setSaveCancelJenisHotel(false);
       setInputJenisHotel(false);
    }
    
    // Provinsi
    public void setInputProvinsi(boolean value){
        namaProvinsiInput.setEnabled(value);
    }
    public void setSaveCancelProvinsi(boolean value){
        saveProvinsiBtn.setEnabled(value);
        cancelProvinsiBtn.setEnabled(value);
    }
    
    public void showProvinsi(){
        tableProvinsi.setModel(provinsiControl.showProvinsi(""));
    }
    
    // Grade
    public void setInputGrade(boolean value){
        namaGradeInput.setEnabled(value);
        keteranganInput.setEnabled(value);
    }
    public void setSaveCancelGrade(boolean value){
        saveGradeBtn.setEnabled(value);
        cancelGradeBtn.setEnabled(value);
    }
    
    public void showGrade(){
        tableGrade.setModel(gradeControl.showGrade(""));
    }
    
    // Jenis Hotel
    public void setInputJenisHotel(boolean value){
        namaJenisInput.setEnabled(value);
        deskripsiInput.setEnabled(value);
    }
    public void setSaveCancelJenisHotel(boolean value){
        saveJenisHotelBtn.setEnabled(value);
        cancelJenisHotelBtn.setEnabled(value);
    }
    
    public void showJenisHotel(){
        tableJenisHotel.setModel(jenisHotelControl.showJenisHotel(""));
    }
  
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ruangKelasGroup = new javax.swing.ButtonGroup();
        sidebarPanel = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        lecturerPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        coursePanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        userPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        containerPanel = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        headerPanel = new javax.swing.JPanel();
        titleContent = new javax.swing.JLabel();
        contentPanel1 = new javax.swing.JPanel();
        namaGradeInput = new javax.swing.JTextField();
        mataKuliahLabel2 = new javax.swing.JLabel();
        cancelGradeBtn = new javax.swing.JButton();
        saveGradeBtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableGrade = new javax.swing.JTable();
        mataKuliahLabel3 = new javax.swing.JLabel();
        keteranganInput = new javax.swing.JTextField();
        mataKuliahLabel4 = new javax.swing.JLabel();
        addGradeBtn = new javax.swing.JButton();
        editGradeBtn = new javax.swing.JButton();
        deleteGradeBtn = new javax.swing.JButton();
        contentPanel = new javax.swing.JPanel();
        namaProvinsiInput = new javax.swing.JTextField();
        mataKuliahLabel = new javax.swing.JLabel();
        cancelProvinsiBtn = new javax.swing.JButton();
        saveProvinsiBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProvinsi = new javax.swing.JTable();
        mataKuliahLabel1 = new javax.swing.JLabel();
        addProvinsiBtn = new javax.swing.JButton();
        editProvinsiBtn = new javax.swing.JButton();
        deleteProvinsiBtn = new javax.swing.JButton();
        contentPanel2 = new javax.swing.JPanel();
        namaJenisInput = new javax.swing.JTextField();
        mataKuliahLabel5 = new javax.swing.JLabel();
        cancelJenisHotelBtn = new javax.swing.JButton();
        saveJenisHotelBtn = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableJenisHotel = new javax.swing.JTable();
        mataKuliahLabel6 = new javax.swing.JLabel();
        deskripsiInput = new javax.swing.JTextField();
        mataKuliahLabel7 = new javax.swing.JLabel();
        addJenisHotelBtn = new javax.swing.JButton();
        editJenisHotelBtn = new javax.swing.JButton();
        removeJenisHotelBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sidebarPanel.setBackground(new java.awt.Color(204, 204, 204));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/admin-icon.png"))); // NOI18N

        lecturerPanel.setBackground(new java.awt.Color(153, 153, 153));
        lecturerPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lecturerPanelMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Home");

        javax.swing.GroupLayout lecturerPanelLayout = new javax.swing.GroupLayout(lecturerPanel);
        lecturerPanel.setLayout(lecturerPanelLayout);
        lecturerPanelLayout.setHorizontalGroup(
            lecturerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        lecturerPanelLayout.setVerticalGroup(
            lecturerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lecturerPanelLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(50, 50, 50))
        );

        coursePanel1.setBackground(new java.awt.Color(153, 153, 153));
        coursePanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                coursePanel1MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Hotel");

        javax.swing.GroupLayout coursePanel1Layout = new javax.swing.GroupLayout(coursePanel1);
        coursePanel1.setLayout(coursePanel1Layout);
        coursePanel1Layout.setHorizontalGroup(
            coursePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, coursePanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                .addContainerGap())
        );
        coursePanel1Layout.setVerticalGroup(
            coursePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coursePanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel4)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        userPanel.setBackground(new java.awt.Color(153, 153, 153));
        userPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userPanelMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("User");

        javax.swing.GroupLayout userPanelLayout = new javax.swing.GroupLayout(userPanel);
        userPanel.setLayout(userPanelLayout);
        userPanelLayout.setHorizontalGroup(
            userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        userPanelLayout.setVerticalGroup(
            userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel3)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout sidebarPanelLayout = new javax.swing.GroupLayout(sidebarPanel);
        sidebarPanel.setLayout(sidebarPanelLayout);
        sidebarPanelLayout.setHorizontalGroup(
            sidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarPanelLayout.createSequentialGroup()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
            .addComponent(coursePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(userPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lecturerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        sidebarPanelLayout.setVerticalGroup(
            sidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lecturerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(userPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(coursePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        containerPanel.setBackground(new java.awt.Color(243, 243, 243));

        headerPanel.setBackground(new java.awt.Color(255, 255, 255));
        headerPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.lightGray));

        titleContent.setBackground(new java.awt.Color(0, 0, 0));
        titleContent.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titleContent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleContent.setText("Management aplikasi");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(titleContent)
                .addGap(42, 42, 42))
        );

        contentPanel1.setBackground(new java.awt.Color(255, 255, 255));
        contentPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.lightGray));

        namaGradeInput.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N

        mataKuliahLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mataKuliahLabel2.setText("Nama grade");

        cancelGradeBtn.setBackground(new java.awt.Color(153, 0, 0));
        cancelGradeBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancelGradeBtn.setForeground(new java.awt.Color(255, 255, 255));
        cancelGradeBtn.setText("Batal");
        cancelGradeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelGradeBtnActionPerformed(evt);
            }
        });

        saveGradeBtn.setBackground(new java.awt.Color(22, 52, 122));
        saveGradeBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        saveGradeBtn.setForeground(new java.awt.Color(255, 255, 255));
        saveGradeBtn.setText("Simpan");
        saveGradeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveGradeBtnActionPerformed(evt);
            }
        });

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));

        tableGrade.setAutoCreateRowSorter(true);
        tableGrade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        tableGrade.setDoubleBuffered(true);
        tableGrade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableGradeMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableGrade);
        tableGrade.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        mataKuliahLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        mataKuliahLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mataKuliahLabel3.setText("Grade Hotel");

        keteranganInput.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N

        mataKuliahLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mataKuliahLabel4.setText("Keterangan");

        addGradeBtn.setBackground(new java.awt.Color(0, 153, 0));
        addGradeBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addGradeBtn.setForeground(new java.awt.Color(255, 255, 255));
        addGradeBtn.setText("Tambah");
        addGradeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addGradeBtnActionPerformed(evt);
            }
        });

        editGradeBtn.setBackground(new java.awt.Color(236, 168, 30));
        editGradeBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        editGradeBtn.setForeground(new java.awt.Color(255, 255, 255));
        editGradeBtn.setText("Ubah");
        editGradeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editGradeBtnActionPerformed(evt);
            }
        });

        deleteGradeBtn.setBackground(new java.awt.Color(153, 0, 0));
        deleteGradeBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deleteGradeBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteGradeBtn.setText("Hapus");
        deleteGradeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteGradeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentPanel1Layout = new javax.swing.GroupLayout(contentPanel1);
        contentPanel1.setLayout(contentPanel1Layout);
        contentPanel1Layout.setHorizontalGroup(
            contentPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(contentPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(contentPanel1Layout.createSequentialGroup()
                        .addComponent(saveGradeBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelGradeBtn))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(255, 255, 255))
            .addGroup(contentPanel1Layout.createSequentialGroup()
                .addComponent(mataKuliahLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(contentPanel1Layout.createSequentialGroup()
                .addGroup(contentPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(contentPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(namaGradeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mataKuliahLabel2)
                            .addComponent(keteranganInput, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mataKuliahLabel4)))
                    .addGroup(contentPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(addGradeBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editGradeBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteGradeBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contentPanel1Layout.setVerticalGroup(
            contentPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mataKuliahLabel3)
                .addGap(13, 13, 13)
                .addGroup(contentPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addGradeBtn)
                    .addComponent(editGradeBtn)
                    .addComponent(deleteGradeBtn))
                .addGap(29, 29, 29)
                .addComponent(mataKuliahLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(namaGradeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(mataKuliahLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(keteranganInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(contentPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveGradeBtn)
                    .addComponent(cancelGradeBtn))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        contentPanel.setBackground(new java.awt.Color(255, 255, 255));
        contentPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.lightGray));

        namaProvinsiInput.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N

        mataKuliahLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mataKuliahLabel.setText("Nama provinsi");

        cancelProvinsiBtn.setBackground(new java.awt.Color(153, 0, 0));
        cancelProvinsiBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancelProvinsiBtn.setForeground(new java.awt.Color(255, 255, 255));
        cancelProvinsiBtn.setText("Batal");
        cancelProvinsiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelProvinsiBtnActionPerformed(evt);
            }
        });

        saveProvinsiBtn.setBackground(new java.awt.Color(22, 52, 122));
        saveProvinsiBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        saveProvinsiBtn.setForeground(new java.awt.Color(255, 255, 255));
        saveProvinsiBtn.setText("Simpan");
        saveProvinsiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveProvinsiBtnActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        tableProvinsi.setAutoCreateRowSorter(true);
        tableProvinsi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        tableProvinsi.setColumnSelectionAllowed(true);
        tableProvinsi.setDoubleBuffered(true);
        tableProvinsi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProvinsiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableProvinsi);
        tableProvinsi.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        mataKuliahLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        mataKuliahLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mataKuliahLabel1.setText("Provinsi");

        addProvinsiBtn.setBackground(new java.awt.Color(0, 153, 0));
        addProvinsiBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addProvinsiBtn.setForeground(new java.awt.Color(255, 255, 255));
        addProvinsiBtn.setText("Tambah");
        addProvinsiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProvinsiBtnActionPerformed(evt);
            }
        });

        editProvinsiBtn.setBackground(new java.awt.Color(236, 168, 30));
        editProvinsiBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        editProvinsiBtn.setForeground(new java.awt.Color(255, 255, 255));
        editProvinsiBtn.setText("Ubah");
        editProvinsiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editProvinsiBtnActionPerformed(evt);
            }
        });

        deleteProvinsiBtn.setBackground(new java.awt.Color(153, 0, 0));
        deleteProvinsiBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deleteProvinsiBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteProvinsiBtn.setText("Hapus");
        deleteProvinsiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteProvinsiBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addComponent(saveProvinsiBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelProvinsiBtn))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(255, 255, 255))
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addComponent(mataKuliahLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(namaProvinsiInput, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mataKuliahLabel)))
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(addProvinsiBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editProvinsiBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteProvinsiBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mataKuliahLabel1)
                .addGap(13, 13, 13)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addProvinsiBtn)
                    .addComponent(editProvinsiBtn)
                    .addComponent(deleteProvinsiBtn))
                .addGap(27, 27, 27)
                .addComponent(mataKuliahLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(namaProvinsiInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveProvinsiBtn)
                    .addComponent(cancelProvinsiBtn))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        contentPanel2.setBackground(new java.awt.Color(255, 255, 255));
        contentPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.lightGray));

        namaJenisInput.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N

        mataKuliahLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mataKuliahLabel5.setText("Jenis Hotel");

        cancelJenisHotelBtn.setBackground(new java.awt.Color(153, 0, 0));
        cancelJenisHotelBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancelJenisHotelBtn.setForeground(new java.awt.Color(255, 255, 255));
        cancelJenisHotelBtn.setText("Batal");
        cancelJenisHotelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelJenisHotelBtnActionPerformed(evt);
            }
        });

        saveJenisHotelBtn.setBackground(new java.awt.Color(22, 52, 122));
        saveJenisHotelBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        saveJenisHotelBtn.setForeground(new java.awt.Color(255, 255, 255));
        saveJenisHotelBtn.setText("Simpan");
        saveJenisHotelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveJenisHotelBtnActionPerformed(evt);
            }
        });

        jScrollPane4.setBackground(new java.awt.Color(255, 255, 255));

        tableJenisHotel.setAutoCreateRowSorter(true);
        tableJenisHotel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        tableJenisHotel.setDoubleBuffered(true);
        tableJenisHotel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableJenisHotelMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tableJenisHotel);
        tableJenisHotel.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        mataKuliahLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        mataKuliahLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mataKuliahLabel6.setText("Jenis Hotel");

        deskripsiInput.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N

        mataKuliahLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mataKuliahLabel7.setText("Deskripsi");

        addJenisHotelBtn.setBackground(new java.awt.Color(0, 153, 0));
        addJenisHotelBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addJenisHotelBtn.setForeground(new java.awt.Color(255, 255, 255));
        addJenisHotelBtn.setText("Tambah");
        addJenisHotelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJenisHotelBtnActionPerformed(evt);
            }
        });

        editJenisHotelBtn.setBackground(new java.awt.Color(236, 168, 30));
        editJenisHotelBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        editJenisHotelBtn.setForeground(new java.awt.Color(255, 255, 255));
        editJenisHotelBtn.setText("Ubah");
        editJenisHotelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editJenisHotelBtnActionPerformed(evt);
            }
        });

        removeJenisHotelBtn.setBackground(new java.awt.Color(153, 0, 0));
        removeJenisHotelBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        removeJenisHotelBtn.setForeground(new java.awt.Color(255, 255, 255));
        removeJenisHotelBtn.setText("Hapus");
        removeJenisHotelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeJenisHotelBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentPanel2Layout = new javax.swing.GroupLayout(contentPanel2);
        contentPanel2.setLayout(contentPanel2Layout);
        contentPanel2Layout.setHorizontalGroup(
            contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(contentPanel2Layout.createSequentialGroup()
                        .addComponent(saveJenisHotelBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelJenisHotelBtn))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(255, 255, 255))
            .addGroup(contentPanel2Layout.createSequentialGroup()
                .addComponent(mataKuliahLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(contentPanel2Layout.createSequentialGroup()
                .addGroup(contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(namaJenisInput, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mataKuliahLabel5)
                            .addComponent(deskripsiInput, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mataKuliahLabel7)))
                    .addGroup(contentPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(addJenisHotelBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editJenisHotelBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(removeJenisHotelBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contentPanel2Layout.setVerticalGroup(
            contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mataKuliahLabel6)
                .addGap(13, 13, 13)
                .addGroup(contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addJenisHotelBtn)
                    .addComponent(editJenisHotelBtn)
                    .addComponent(removeJenisHotelBtn))
                .addGap(29, 29, 29)
                .addComponent(mataKuliahLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(namaJenisInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(mataKuliahLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deskripsiInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveJenisHotelBtn)
                    .addComponent(cancelJenisHotelBtn))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        jLayeredPane1.setLayer(headerPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(contentPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(contentPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(contentPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(contentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(contentPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(contentPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contentPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contentPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout containerPanelLayout = new javax.swing.GroupLayout(containerPanel);
        containerPanel.setLayout(containerPanelLayout);
        containerPanelLayout.setHorizontalGroup(
            containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerPanelLayout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 214, Short.MAX_VALUE))
        );
        containerPanelLayout.setVerticalGroup(
            containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1)
                .addContainerGap())
        );

        jScrollPane2.setViewportView(containerPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sidebarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 972, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidebarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addProvinsiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProvinsiBtnActionPerformed
        setInputProvinsi(true);
        setSaveCancelProvinsi(true);
        action="tambah";
    }//GEN-LAST:event_addProvinsiBtnActionPerformed

    private void cancelProvinsiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelProvinsiBtnActionPerformed

        setSaveCancelProvinsi(false);
        namaProvinsiInput.setText("");
        namaProvinsiInput.setEnabled(false);
    }//GEN-LAST:event_cancelProvinsiBtnActionPerformed

    
    public void inputProvinsiKosongException() throws InputKosongException{
        if(namaProvinsiInput.getText().isEmpty()){
            throw new InputKosongException();
        }
    }
    
    public void inputGradeKosongException() throws InputKosongException{
        if(namaGradeInput.getText().isEmpty() || keteranganInput.getText().isEmpty()){
            throw new InputKosongException();
        }
    }
    
    public void inputJenisHotelKosongException() throws InputKosongException{
        if(namaJenisInput.getText().isEmpty() || deskripsiInput.getText().isEmpty()){
            throw new InputKosongException();
        }
    }
    
    private void saveProvinsiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveProvinsiBtnActionPerformed
        try{
            inputProvinsiKosongException();
            
            String namaProvinsi = namaProvinsiInput.getText();
            
            if(action.equals("tambah")){
                Provinsi p = new Provinsi(0,namaProvinsi);
                provinsiControl.insertDataProvinsi(p);
            }else{
                Provinsi p = new Provinsi(selectedId,namaProvinsi);
                provinsiControl.updateDataProvinsi(p);
            }
            
            showProvinsi();
            namaProvinsiInput.setText("");
            namaProvinsiInput.setEnabled(false);
            setSaveCancelProvinsi(false);
            
            
            
        }catch(InputKosongException e){
            JOptionPane.showMessageDialog(this, e.message());
        }
    }//GEN-LAST:event_saveProvinsiBtnActionPerformed

    private void lecturerPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lecturerPanelMouseClicked
//        DosenView dv = new DosenView();
//        this.dispose();
//        dv.setVisible(true);
    }//GEN-LAST:event_lecturerPanelMouseClicked

    private void tableProvinsiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProvinsiMouseClicked
        
        int clickedRow = tableProvinsi.getSelectedRow();
        TableModel tableModel = tableProvinsi.getModel();
        
        selectedId = Integer.parseInt(tableModel.getValueAt(clickedRow, 0).toString());
        namaProvinsiInput.setText(tableModel.getValueAt(clickedRow, 1).toString());
    }//GEN-LAST:event_tableProvinsiMouseClicked

    private void cancelGradeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelGradeBtnActionPerformed
        setSaveCancelGrade(false);
        
        namaGradeInput.setText("");
        namaGradeInput.setEnabled(false);
        
        keteranganInput.setText("");
        keteranganInput.setEnabled(false);
        
    }//GEN-LAST:event_cancelGradeBtnActionPerformed

    private void saveGradeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveGradeBtnActionPerformed
        try{
            inputGradeKosongException();
            
            String namaGrade = namaGradeInput.getText();
            String keterangan = keteranganInput.getText();
            
            if(actionGrade.equals("tambah")){
                Grade g = new Grade(0,namaGrade, keterangan);
                gradeControl.insertDataGrade(g);
            }else{
                Grade g = new Grade(selectedGradeId,namaGrade, keterangan);
                gradeControl.updateDataGrade(g);
            }
            
            showGrade();
            
            namaGradeInput.setText("");
            namaGradeInput.setEnabled(false);
            
            keteranganInput.setText("");
            keteranganInput.setEnabled(false);
            
            
            setSaveCancelGrade(false);
            
            
            
        }catch(InputKosongException e){
            JOptionPane.showMessageDialog(this, e.message());
        }
    }//GEN-LAST:event_saveGradeBtnActionPerformed

    private void tableGradeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableGradeMouseClicked
        int clickedRow = tableGrade.getSelectedRow();
        TableModel tableModel = tableGrade.getModel();
        
        selectedGradeId = Integer.parseInt(tableModel.getValueAt(clickedRow, 0).toString());
        namaGradeInput.setText(tableModel.getValueAt(clickedRow, 1).toString());
        keteranganInput.setText(tableModel.getValueAt(clickedRow, 2).toString());
    }//GEN-LAST:event_tableGradeMouseClicked

    private void editProvinsiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editProvinsiBtnActionPerformed

        
        if(!namaProvinsiInput.getText().isEmpty()){
            action = "ubah";
            namaProvinsiInput.setEnabled(true);    
            setSaveCancelProvinsi(true);
        }
        

    }//GEN-LAST:event_editProvinsiBtnActionPerformed

    private void deleteProvinsiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteProvinsiBtnActionPerformed
    
        if(!namaProvinsiInput.getText().isEmpty()){
            int getAnswer = JOptionPane.showConfirmDialog(rootPane,"Apakah yakin ingin menghapus data ? ", "Konfirmasi", JOptionPane.YES_NO_OPTION);

            switch(getAnswer){
                case 0:
                try{
                    provinsiControl.deleteDataProvinsi(selectedId);
                    
                    namaProvinsiInput.setEnabled(false);   
                    namaProvinsiInput.setText("");   
                    
                    showProvinsi();
                    
                    setSaveCancelProvinsi(false);
                }catch(Exception e){
                    System.out.println("Error : "+e.getMessage());
                }
                break;
                case 1:
                break;
            }
        }
        

    }//GEN-LAST:event_deleteProvinsiBtnActionPerformed

    private void addGradeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addGradeBtnActionPerformed
        setInputGrade(true);
        setSaveCancelGrade(true);
        actionGrade="tambah";
    }//GEN-LAST:event_addGradeBtnActionPerformed

    private void editGradeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editGradeBtnActionPerformed
         if(!namaGradeInput.getText().isEmpty()){
            actionGrade = "ubah";
            
            namaGradeInput.setEnabled(true);    
            keteranganInput.setEnabled(true);    
            
            setSaveCancelGrade(true);
        }
    }//GEN-LAST:event_editGradeBtnActionPerformed

    private void deleteGradeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteGradeBtnActionPerformed
         if(!namaGradeInput.getText().isEmpty()){
            int getAnswer = JOptionPane.showConfirmDialog(rootPane,"Apakah yakin ingin menghapus data ? ", "Konfirmasi", JOptionPane.YES_NO_OPTION);

            switch(getAnswer){
                case 0:
                try{
                    gradeControl.deleteDataGrade(selectedGradeId);
                    
                    namaGradeInput.setEnabled(false);   
                    namaGradeInput.setText("");   
                    
                    keteranganInput.setEnabled(false);   
                    keteranganInput.setText("");   
                    
                    showGrade();
                    
                    setSaveCancelGrade(false);
                }catch(Exception e){
                    System.out.println("Error : "+e.getMessage());
                }
                break;
                case 1:
                break;
            }
        }
    }//GEN-LAST:event_deleteGradeBtnActionPerformed

    private void cancelJenisHotelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelJenisHotelBtnActionPerformed
        setSaveCancelJenisHotel(false);
        
        namaJenisInput.setText("");
        namaJenisInput.setEnabled(false);
        
        deskripsiInput.setText("");
        deskripsiInput.setEnabled(false);
    }//GEN-LAST:event_cancelJenisHotelBtnActionPerformed

    private void saveJenisHotelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveJenisHotelBtnActionPerformed
          try{
            inputJenisHotelKosongException();
            
            String namaJenis = namaJenisInput.getText();
            String deskripsi = deskripsiInput.getText();
            
            if(actionJenisHotel.equals("tambah")){
                JenisHotel g = new JenisHotel(0,namaJenis, deskripsi);
                jenisHotelControl.insertDataJenisHotel(g);
            }else{
                JenisHotel g = new JenisHotel(selectedJenisHotelId,namaJenis, deskripsi);
                jenisHotelControl.updateDataJenisHotel(g);
            }
            
            showJenisHotel();
            
            namaJenisInput.setText("");
            namaJenisInput.setEnabled(false);
            
            deskripsiInput.setText("");
            deskripsiInput.setEnabled(false);
            
            
            setSaveCancelJenisHotel(false);
            
            
            
        }catch(InputKosongException e){
            JOptionPane.showMessageDialog(this, e.message());
        }
    }//GEN-LAST:event_saveJenisHotelBtnActionPerformed

    private void tableJenisHotelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableJenisHotelMouseClicked
        int clickedRow = tableJenisHotel.getSelectedRow();
        TableModel tableModel = tableJenisHotel.getModel();
        
        selectedJenisHotelId = Integer.parseInt(tableModel.getValueAt(clickedRow, 0).toString());
        namaJenisInput.setText(tableModel.getValueAt(clickedRow, 1).toString());
        deskripsiInput.setText(tableModel.getValueAt(clickedRow, 2).toString());
    }//GEN-LAST:event_tableJenisHotelMouseClicked

    private void addJenisHotelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJenisHotelBtnActionPerformed
        setInputJenisHotel(true);
        setSaveCancelJenisHotel(true);
        actionJenisHotel="tambah";
    }//GEN-LAST:event_addJenisHotelBtnActionPerformed

    private void editJenisHotelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editJenisHotelBtnActionPerformed
        if(!namaJenisInput.getText().isEmpty()){
            actionJenisHotel = "ubah";
            
            namaJenisInput.setEnabled(true);    
            deskripsiInput.setEnabled(true);    
            
            setSaveCancelJenisHotel(true);
        }
    }//GEN-LAST:event_editJenisHotelBtnActionPerformed

    private void removeJenisHotelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeJenisHotelBtnActionPerformed
         if(!namaJenisInput.getText().isEmpty()){
            int getAnswer = JOptionPane.showConfirmDialog(rootPane,"Apakah yakin ingin menghapus data ? ", "Konfirmasi", JOptionPane.YES_NO_OPTION);

            switch(getAnswer){
                case 0:
                try{
                    jenisHotelControl.deleteDataJenisHotel(selectedJenisHotelId);
                    
                    namaJenisInput.setEnabled(false);   
                    namaJenisInput.setText("");   
                    
                    deskripsiInput.setEnabled(false);   
                    deskripsiInput.setText("");   
                    
                    showJenisHotel();
                    
                    setSaveCancelJenisHotel(false);
                }catch(Exception e){
                    System.out.println("Error : "+e.getMessage());
                }
                break;
                case 1:
                break;
            }
        }
    }//GEN-LAST:event_removeJenisHotelBtnActionPerformed

    private void coursePanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_coursePanel1MouseClicked
        this.dispose();
        AdminHotel a = new AdminHotel();
        a.setVisible(true);
    }//GEN-LAST:event_coursePanel1MouseClicked

    private void userPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userPanelMouseClicked
        this.dispose();
        AdminUser a = new AdminUser();
        a.setVisible(true);
    }//GEN-LAST:event_userPanelMouseClicked

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
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addGradeBtn;
    private javax.swing.JButton addJenisHotelBtn;
    private javax.swing.JButton addProvinsiBtn;
    private javax.swing.JButton cancelGradeBtn;
    private javax.swing.JButton cancelJenisHotelBtn;
    private javax.swing.JButton cancelProvinsiBtn;
    private javax.swing.JPanel containerPanel;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JPanel contentPanel1;
    private javax.swing.JPanel contentPanel2;
    private javax.swing.JPanel coursePanel1;
    private javax.swing.JButton deleteGradeBtn;
    private javax.swing.JButton deleteProvinsiBtn;
    private javax.swing.JTextField deskripsiInput;
    private javax.swing.JButton editGradeBtn;
    private javax.swing.JButton editJenisHotelBtn;
    private javax.swing.JButton editProvinsiBtn;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField keteranganInput;
    private javax.swing.JPanel lecturerPanel;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel mataKuliahLabel;
    private javax.swing.JLabel mataKuliahLabel1;
    private javax.swing.JLabel mataKuliahLabel2;
    private javax.swing.JLabel mataKuliahLabel3;
    private javax.swing.JLabel mataKuliahLabel4;
    private javax.swing.JLabel mataKuliahLabel5;
    private javax.swing.JLabel mataKuliahLabel6;
    private javax.swing.JLabel mataKuliahLabel7;
    private javax.swing.JTextField namaGradeInput;
    private javax.swing.JTextField namaJenisInput;
    private javax.swing.JTextField namaProvinsiInput;
    private javax.swing.JButton removeJenisHotelBtn;
    private javax.swing.ButtonGroup ruangKelasGroup;
    private javax.swing.JButton saveGradeBtn;
    private javax.swing.JButton saveJenisHotelBtn;
    private javax.swing.JButton saveProvinsiBtn;
    private javax.swing.JPanel sidebarPanel;
    private javax.swing.JTable tableGrade;
    private javax.swing.JTable tableJenisHotel;
    private javax.swing.JTable tableProvinsi;
    private javax.swing.JLabel titleContent;
    private javax.swing.JPanel userPanel;
    // End of variables declaration//GEN-END:variables
}
