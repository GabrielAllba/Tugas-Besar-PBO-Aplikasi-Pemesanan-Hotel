
package view.admin;

import java.awt.Color;
import view.LandingPage;

import exception.InputKosongException;

import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

import controller.ProvinsiControll;
import controller.GradeControll;
import controller.JenisHotelControll;
import controller.TemaFasilitasControll;
import java.awt.Image;
import java.awt.Toolkit;

import model.Provinsi;
import model.Grade;
import model.JenisHotel;
import model.TemaFasilitas;


public class AdminHome extends javax.swing.JFrame {

  

    
    ProvinsiControll provinsiControl = new ProvinsiControll();
    GradeControll gradeControl = new GradeControll();
    JenisHotelControll jenisHotelControl = new JenisHotelControll();
    TemaFasilitasControll temaFasilitasControl = new TemaFasilitasControll();
    
    String action=null;
    int selectedId = 0;
    
    String actionGrade=null;
    int selectedGradeId=0;
    
    String actionJenisHotel=null;
    int selectedJenisHotelId=0;
    
    String actionTemaFasilitas = null;
    int selectedTemaFasilitasId = 0;
    
    Color panDefault,panClick,panEnter;
    public AdminHome() {
        initComponents();
        panDefault = Color.white;
        panClick = Color.LIGHT_GRAY;
        panEnter = new Color(204,204,204);
        
        menu1.setBackground(panEnter);
        menu2.setBackground(panDefault);
        menu3.setBackground(panDefault);
        logout.setBackground(Color.white);
        
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
       
       // tema fasilitas
       showTemaFasilitas();
       namaTemaFasilitasInput.setText("");
       namaTemaFasilitasInput.setEnabled(false);
        
       saveTemaFasilitas.setEnabled(false);
       cancelTemaFasilitas.setEnabled(false);
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
    
    public void showTemaFasilitas(){
        tableTemaFasilitas.setModel(temaFasilitasControl.showTemaFasilitas(""));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        menu1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        menu2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        menu3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        logout = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        addProvinsiBtn = new javax.swing.JButton();
        editProvinsiBtn = new javax.swing.JButton();
        deleteProvinsiBtn = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        namaProvinsiInput = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProvinsi = new javax.swing.JTable();
        cancelProvinsiBtn = new javax.swing.JButton();
        saveProvinsiBtn = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        namaGradeInput = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        cancelGradeBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableGrade = new javax.swing.JTable();
        editGradeBtn = new javax.swing.JButton();
        deleteGradeBtn = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        addGradeBtn = new javax.swing.JButton();
        saveGradeBtn = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        keteranganInput = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jTextField9 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableJenisHotel = new javax.swing.JTable();
        addJenisHotelBtn = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        editJenisHotelBtn = new javax.swing.JButton();
        namaJenisInput = new javax.swing.JTextField();
        deskripsiInput = new javax.swing.JTextField();
        saveJenisHotelBtn = new javax.swing.JButton();
        removeJenisHotelBtn = new javax.swing.JButton();
        cancelJenisHotelBtn = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jTextField10 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableTemaFasilitas = new javax.swing.JTable();
        addJenisHotelBtn1 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        editJenisHotelBtn1 = new javax.swing.JButton();
        namaTemaFasilitasInput = new javax.swing.JTextField();
        saveTemaFasilitas = new javax.swing.JButton();
        removeJenisHotelBtn1 = new javax.swing.JButton();
        cancelTemaFasilitas = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setkEndColor(new java.awt.Color(240, 240, 240));
        kGradientPanel1.setkStartColor(new java.awt.Color(240, 240, 240));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/ST (3).png"))); // NOI18N

        jTextField2.setBackground(new java.awt.Color(60, 72, 107));

        menu1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/home.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(60, 72, 107));
        jLabel2.setText("Home");

        javax.swing.GroupLayout menu1Layout = new javax.swing.GroupLayout(menu1);
        menu1.setLayout(menu1Layout);
        menu1Layout.setHorizontalGroup(
            menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        menu1Layout.setVerticalGroup(
            menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menu2.setBackground(new java.awt.Color(255, 255, 255));
        menu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menu2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menu2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menu2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                menu2MouseReleased(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/hotel.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(60, 72, 107));
        jLabel5.setText("Hotel");

        javax.swing.GroupLayout menu2Layout = new javax.swing.GroupLayout(menu2);
        menu2.setLayout(menu2Layout);
        menu2Layout.setHorizontalGroup(
            menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        menu2Layout.setVerticalGroup(
            menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menu3.setBackground(new java.awt.Color(255, 255, 255));
        menu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menu3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menu3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menu3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                menu3MouseReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(60, 72, 107));
        jLabel6.setText("User");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/User.png"))); // NOI18N

        javax.swing.GroupLayout menu3Layout = new javax.swing.GroupLayout(menu3);
        menu3.setLayout(menu3Layout);
        menu3Layout.setHorizontalGroup(
            menu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menu3Layout.setVerticalGroup(
            menu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        logout.setBackground(new java.awt.Color(255, 255, 255));
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                logoutMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                logoutMouseReleased(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/log-out.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(60, 72, 107));
        jLabel8.setText("Logout");

        javax.swing.GroupLayout logoutLayout = new javax.swing.GroupLayout(logout);
        logout.setLayout(logoutLayout);
        logoutLayout.setHorizontalGroup(
            logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logoutLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        logoutLayout.setVerticalGroup(
            logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoutLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menu2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menu3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField2)
                            .addComponent(menu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(logout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(menu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(menu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(menu3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Microsoft YaHei", 1, 40)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(60, 72, 107));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Management Aplikasi");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 1137, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(60, 72, 107));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Provinsi");

        jPanel11.setBackground(new java.awt.Color(255, 255, 204));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel12.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        addProvinsiBtn.setBackground(new java.awt.Color(0, 153, 0));
        addProvinsiBtn.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        addProvinsiBtn.setForeground(new java.awt.Color(250, 247, 240));
        addProvinsiBtn.setText("ADD");
        addProvinsiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProvinsiBtnActionPerformed(evt);
            }
        });

        editProvinsiBtn.setBackground(new java.awt.Color(236, 168, 30));
        editProvinsiBtn.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        editProvinsiBtn.setForeground(new java.awt.Color(250, 247, 240));
        editProvinsiBtn.setText("EDIT");
        editProvinsiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editProvinsiBtnActionPerformed(evt);
            }
        });

        deleteProvinsiBtn.setBackground(new java.awt.Color(153, 0, 0));
        deleteProvinsiBtn.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        deleteProvinsiBtn.setForeground(new java.awt.Color(250, 247, 240));
        deleteProvinsiBtn.setText("DELETE");
        deleteProvinsiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteProvinsiBtnActionPerformed(evt);
            }
        });

        jTextField1.setBackground(new java.awt.Color(60, 72, 107));
        jTextField1.setText("jTextField1");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(60, 72, 107));
        jLabel12.setText("Nama Provinsi");

        namaProvinsiInput.setToolTipText("");
        namaProvinsiInput.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(60, 72, 107)));
        namaProvinsiInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaProvinsiInputActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(null);

        tableProvinsi.setAutoCreateRowSorter(true);
        tableProvinsi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        tableProvinsi.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tableProvinsi.setForeground(new java.awt.Color(60, 72, 107));
        tableProvinsi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableProvinsi.setGridColor(new java.awt.Color(255, 255, 255));
        tableProvinsi.setIntercellSpacing(new java.awt.Dimension(5, 5));
        tableProvinsi.setRowHeight(25);
        tableProvinsi.setSelectionBackground(new java.awt.Color(152, 168, 248));
        tableProvinsi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProvinsiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableProvinsi);
        if (tableProvinsi.getColumnModel().getColumnCount() > 0) {
            tableProvinsi.getColumnModel().getColumn(0).setResizable(false);
            tableProvinsi.getColumnModel().getColumn(1).setResizable(false);
            tableProvinsi.getColumnModel().getColumn(2).setResizable(false);
            tableProvinsi.getColumnModel().getColumn(3).setResizable(false);
            tableProvinsi.getColumnModel().getColumn(3).setPreferredWidth(10);
        }

        cancelProvinsiBtn.setBackground(new java.awt.Color(153, 0, 0));
        cancelProvinsiBtn.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        cancelProvinsiBtn.setForeground(new java.awt.Color(250, 247, 240));
        cancelProvinsiBtn.setText("CANCEL");
        cancelProvinsiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelProvinsiBtnActionPerformed(evt);
            }
        });

        saveProvinsiBtn.setBackground(new java.awt.Color(22, 52, 122));
        saveProvinsiBtn.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        saveProvinsiBtn.setForeground(new java.awt.Color(250, 247, 240));
        saveProvinsiBtn.setText("SAVE");
        saveProvinsiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveProvinsiBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saveProvinsiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelProvinsiBtn)
                .addContainerGap())
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(81, 81, 81))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(addProvinsiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editProvinsiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteProvinsiBtn)
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(namaProvinsiInput)
                        .addContainerGap())))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addProvinsiBtn)
                    .addComponent(editProvinsiBtn)
                    .addComponent(deleteProvinsiBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(namaProvinsiInput, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveProvinsiBtn)
                    .addComponent(cancelProvinsiBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        namaGradeInput.setToolTipText("");
        namaGradeInput.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(60, 72, 107)));
        namaGradeInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaGradeInputActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(60, 72, 107));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Grade Hotel");

        jTextField4.setBackground(new java.awt.Color(60, 72, 107));
        jTextField4.setText("jTextField1");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        cancelGradeBtn.setBackground(new java.awt.Color(153, 0, 0));
        cancelGradeBtn.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        cancelGradeBtn.setForeground(new java.awt.Color(250, 247, 240));
        cancelGradeBtn.setText("CANCEL");
        cancelGradeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelGradeBtnActionPerformed(evt);
            }
        });

        jScrollPane2.setBorder(null);

        tableGrade.setAutoCreateRowSorter(true);
        tableGrade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        tableGrade.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tableGrade.setForeground(new java.awt.Color(60, 72, 107));
        tableGrade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableGrade.setGridColor(new java.awt.Color(255, 255, 255));
        tableGrade.setIntercellSpacing(new java.awt.Dimension(5, 5));
        tableGrade.setRowHeight(25);
        tableGrade.setSelectionBackground(new java.awt.Color(152, 168, 248));
        tableGrade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableGradeMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableGrade);
        if (tableGrade.getColumnModel().getColumnCount() > 0) {
            tableGrade.getColumnModel().getColumn(0).setResizable(false);
            tableGrade.getColumnModel().getColumn(1).setResizable(false);
            tableGrade.getColumnModel().getColumn(2).setResizable(false);
            tableGrade.getColumnModel().getColumn(3).setResizable(false);
            tableGrade.getColumnModel().getColumn(3).setPreferredWidth(10);
        }

        editGradeBtn.setBackground(new java.awt.Color(236, 168, 30));
        editGradeBtn.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        editGradeBtn.setForeground(new java.awt.Color(250, 247, 240));
        editGradeBtn.setText("EDIT");
        editGradeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editGradeBtnActionPerformed(evt);
            }
        });

        deleteGradeBtn.setBackground(new java.awt.Color(153, 0, 0));
        deleteGradeBtn.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        deleteGradeBtn.setForeground(new java.awt.Color(250, 247, 240));
        deleteGradeBtn.setText("DELETE");
        deleteGradeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteGradeBtnActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(60, 72, 107));
        jLabel14.setText("Nama Grade");

        addGradeBtn.setBackground(new java.awt.Color(0, 153, 0));
        addGradeBtn.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        addGradeBtn.setForeground(new java.awt.Color(250, 247, 240));
        addGradeBtn.setText("ADD");
        addGradeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addGradeBtnActionPerformed(evt);
            }
        });

        saveGradeBtn.setBackground(new java.awt.Color(22, 52, 122));
        saveGradeBtn.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        saveGradeBtn.setForeground(new java.awt.Color(250, 247, 240));
        saveGradeBtn.setText("SAVE");
        saveGradeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveGradeBtnActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(60, 72, 107));
        jLabel15.setText("Keterangan");

        keteranganInput.setToolTipText("");
        keteranganInput.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(60, 72, 107)));
        keteranganInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keteranganInputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField4)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(addGradeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(editGradeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(deleteGradeBtn))
                            .addComponent(namaGradeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel8Layout.createSequentialGroup()
                                    .addComponent(saveGradeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cancelGradeBtn))
                                .addComponent(keteranganInput, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addGradeBtn)
                    .addComponent(editGradeBtn)
                    .addComponent(deleteGradeBtn))
                .addGap(44, 44, 44)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(namaGradeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(keteranganInput, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveGradeBtn)
                    .addComponent(cancelGradeBtn))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jTextField9.setBackground(new java.awt.Color(60, 72, 107));
        jTextField9.setText("jTextField1");
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Yu Gothic UI", 1, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(60, 72, 107));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Jenis Hotel");

        jScrollPane3.setBorder(null);

        tableJenisHotel.setAutoCreateRowSorter(true);
        tableJenisHotel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        tableJenisHotel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tableJenisHotel.setForeground(new java.awt.Color(60, 72, 107));
        tableJenisHotel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableJenisHotel.setGridColor(new java.awt.Color(255, 255, 255));
        tableJenisHotel.setIntercellSpacing(new java.awt.Dimension(5, 5));
        tableJenisHotel.setRowHeight(25);
        tableJenisHotel.setSelectionBackground(new java.awt.Color(152, 168, 248));
        tableJenisHotel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableJenisHotelMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableJenisHotel);
        if (tableJenisHotel.getColumnModel().getColumnCount() > 0) {
            tableJenisHotel.getColumnModel().getColumn(0).setResizable(false);
            tableJenisHotel.getColumnModel().getColumn(1).setResizable(false);
            tableJenisHotel.getColumnModel().getColumn(2).setResizable(false);
            tableJenisHotel.getColumnModel().getColumn(3).setResizable(false);
            tableJenisHotel.getColumnModel().getColumn(3).setPreferredWidth(10);
        }

        addJenisHotelBtn.setBackground(new java.awt.Color(0, 153, 0));
        addJenisHotelBtn.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        addJenisHotelBtn.setForeground(new java.awt.Color(250, 247, 240));
        addJenisHotelBtn.setText("ADD");
        addJenisHotelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJenisHotelBtnActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(60, 72, 107));
        jLabel16.setText("Deskripsi");

        jLabel17.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(60, 72, 107));
        jLabel17.setText("Jenis Hotel");

        editJenisHotelBtn.setBackground(new java.awt.Color(236, 168, 30));
        editJenisHotelBtn.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        editJenisHotelBtn.setForeground(new java.awt.Color(250, 247, 240));
        editJenisHotelBtn.setText("EDIT");
        editJenisHotelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editJenisHotelBtnActionPerformed(evt);
            }
        });

        namaJenisInput.setToolTipText("");
        namaJenisInput.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(60, 72, 107)));
        namaJenisInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaJenisInputActionPerformed(evt);
            }
        });

        deskripsiInput.setToolTipText("");
        deskripsiInput.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(60, 72, 107)));
        deskripsiInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deskripsiInputActionPerformed(evt);
            }
        });

        saveJenisHotelBtn.setBackground(new java.awt.Color(22, 52, 122));
        saveJenisHotelBtn.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        saveJenisHotelBtn.setForeground(new java.awt.Color(250, 247, 240));
        saveJenisHotelBtn.setText("SAVE");
        saveJenisHotelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveJenisHotelBtnActionPerformed(evt);
            }
        });

        removeJenisHotelBtn.setBackground(new java.awt.Color(153, 0, 0));
        removeJenisHotelBtn.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        removeJenisHotelBtn.setForeground(new java.awt.Color(250, 247, 240));
        removeJenisHotelBtn.setText("DELETE");
        removeJenisHotelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeJenisHotelBtnActionPerformed(evt);
            }
        });

        cancelJenisHotelBtn.setBackground(new java.awt.Color(153, 0, 0));
        cancelJenisHotelBtn.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        cancelJenisHotelBtn.setForeground(new java.awt.Color(250, 247, 240));
        cancelJenisHotelBtn.setText("CANCEL");
        cancelJenisHotelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelJenisHotelBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addComponent(deskripsiInput)
                                .addGap(94, 94, 94))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(saveJenisHotelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cancelJenisHotelBtn))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(namaJenisInput, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(addJenisHotelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(editJenisHotelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(removeJenisHotelBtn))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 39, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addJenisHotelBtn)
                    .addComponent(editJenisHotelBtn)
                    .addComponent(removeJenisHotelBtn))
                .addGap(44, 44, 44)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(namaJenisInput, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deskripsiInput, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveJenisHotelBtn)
                    .addComponent(cancelJenisHotelBtn))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jTextField10.setBackground(new java.awt.Color(60, 72, 107));
        jTextField10.setText("jTextField1");
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Yu Gothic UI", 1, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(60, 72, 107));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Tema Fasilitas");

        jScrollPane4.setBorder(null);

        tableTemaFasilitas.setAutoCreateRowSorter(true);
        tableTemaFasilitas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        tableTemaFasilitas.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tableTemaFasilitas.setForeground(new java.awt.Color(60, 72, 107));
        tableTemaFasilitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableTemaFasilitas.setGridColor(new java.awt.Color(255, 255, 255));
        tableTemaFasilitas.setIntercellSpacing(new java.awt.Dimension(5, 5));
        tableTemaFasilitas.setRowHeight(25);
        tableTemaFasilitas.setSelectionBackground(new java.awt.Color(152, 168, 248));
        tableTemaFasilitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableTemaFasilitasMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tableTemaFasilitas);
        if (tableTemaFasilitas.getColumnModel().getColumnCount() > 0) {
            tableTemaFasilitas.getColumnModel().getColumn(0).setResizable(false);
            tableTemaFasilitas.getColumnModel().getColumn(1).setResizable(false);
            tableTemaFasilitas.getColumnModel().getColumn(2).setResizable(false);
            tableTemaFasilitas.getColumnModel().getColumn(3).setResizable(false);
            tableTemaFasilitas.getColumnModel().getColumn(3).setPreferredWidth(10);
        }

        addJenisHotelBtn1.setBackground(new java.awt.Color(0, 153, 0));
        addJenisHotelBtn1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        addJenisHotelBtn1.setForeground(new java.awt.Color(250, 247, 240));
        addJenisHotelBtn1.setText("ADD");
        addJenisHotelBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJenisHotelBtn1ActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(60, 72, 107));
        jLabel21.setText("Nama Tema");

        editJenisHotelBtn1.setBackground(new java.awt.Color(236, 168, 30));
        editJenisHotelBtn1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        editJenisHotelBtn1.setForeground(new java.awt.Color(250, 247, 240));
        editJenisHotelBtn1.setText("EDIT");
        editJenisHotelBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editJenisHotelBtn1ActionPerformed(evt);
            }
        });

        namaTemaFasilitasInput.setToolTipText("");
        namaTemaFasilitasInput.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(60, 72, 107)));
        namaTemaFasilitasInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaTemaFasilitasInputActionPerformed(evt);
            }
        });

        saveTemaFasilitas.setBackground(new java.awt.Color(22, 52, 122));
        saveTemaFasilitas.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        saveTemaFasilitas.setForeground(new java.awt.Color(250, 247, 240));
        saveTemaFasilitas.setText("SAVE");
        saveTemaFasilitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveTemaFasilitasActionPerformed(evt);
            }
        });

        removeJenisHotelBtn1.setBackground(new java.awt.Color(153, 0, 0));
        removeJenisHotelBtn1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        removeJenisHotelBtn1.setForeground(new java.awt.Color(250, 247, 240));
        removeJenisHotelBtn1.setText("DELETE");
        removeJenisHotelBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeJenisHotelBtn1ActionPerformed(evt);
            }
        });

        cancelTemaFasilitas.setBackground(new java.awt.Color(153, 0, 0));
        cancelTemaFasilitas.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        cancelTemaFasilitas.setForeground(new java.awt.Color(250, 247, 240));
        cancelTemaFasilitas.setText("CANCEL");
        cancelTemaFasilitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelTemaFasilitasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(saveTemaFasilitas, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cancelTemaFasilitas))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(namaTemaFasilitasInput, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addComponent(addJenisHotelBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(editJenisHotelBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(removeJenisHotelBtn1))
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 9, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addJenisHotelBtn1)
                    .addComponent(editJenisHotelBtn1)
                    .addComponent(removeJenisHotelBtn1))
                .addGap(44, 44, 44)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(namaTemaFasilitasInput, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveTemaFasilitas)
                    .addComponent(cancelTemaFasilitas))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void namaProvinsiInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaProvinsiInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaProvinsiInputActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void namaGradeInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaGradeInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaGradeInputActionPerformed

    private void keteranganInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keteranganInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_keteranganInputActionPerformed

    private void cancelGradeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelGradeBtnActionPerformed
        setSaveCancelGrade(false);
        
        namaGradeInput.setText("");
        namaGradeInput.setEnabled(false);
        
        keteranganInput.setText("");
        keteranganInput.setEnabled(false);
    }//GEN-LAST:event_cancelGradeBtnActionPerformed

    private void cancelProvinsiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelProvinsiBtnActionPerformed
        setSaveCancelProvinsi(false);
        namaProvinsiInput.setText("");
        namaProvinsiInput.setEnabled(false);
    }//GEN-LAST:event_cancelProvinsiBtnActionPerformed

    private void cancelJenisHotelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelJenisHotelBtnActionPerformed
        setSaveCancelJenisHotel(false);
        
        namaJenisInput.setText("");
        namaJenisInput.setEnabled(false);
        
        deskripsiInput.setText("");
        deskripsiInput.setEnabled(false);
    }//GEN-LAST:event_cancelJenisHotelBtnActionPerformed

    private void deskripsiInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deskripsiInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deskripsiInputActionPerformed

    private void namaJenisInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaJenisInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaJenisInputActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void menu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu2MouseClicked
        this.dispose();
        AdminHotel a = new AdminHotel();
        a.setVisible(true);
    }//GEN-LAST:event_menu2MouseClicked

    private void menu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu3MouseClicked
        this.dispose();
        AdminUser a = new AdminUser();
        a.setVisible(true);
    }//GEN-LAST:event_menu3MouseClicked

    private void menu2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu2MouseEntered
        menu2.setBackground(panEnter);
    }//GEN-LAST:event_menu2MouseEntered

    private void menu2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu2MouseExited
        menu2.setBackground(panDefault);
    }//GEN-LAST:event_menu2MouseExited

    private void menu2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu2MousePressed
        menu2.setBackground(panClick);
    }//GEN-LAST:event_menu2MousePressed

    private void menu2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu2MouseReleased
        menu2.setBackground(panDefault);
    }//GEN-LAST:event_menu2MouseReleased

    private void menu3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu3MouseEntered
        menu3.setBackground(panEnter);
    }//GEN-LAST:event_menu3MouseEntered

    private void menu3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu3MouseExited
        menu3.setBackground(panDefault);
    }//GEN-LAST:event_menu3MouseExited

    private void menu3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu3MousePressed
        menu3.setBackground(panClick);
    }//GEN-LAST:event_menu3MousePressed

    private void menu3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu3MouseReleased
        menu3.setBackground(panDefault);
    }//GEN-LAST:event_menu3MouseReleased

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        this.dispose();
         LandingPage lp = new LandingPage();
         lp.setVisible(true);
        
    }//GEN-LAST:event_logoutMouseClicked

    private void logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseEntered
        logout.setBackground(panEnter);
    }//GEN-LAST:event_logoutMouseEntered

    private void logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseExited
        logout.setBackground(panDefault);
    }//GEN-LAST:event_logoutMouseExited

    private void logoutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMousePressed
        logout.setBackground(panClick);
    }//GEN-LAST:event_logoutMousePressed

    private void logoutMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseReleased
        logout.setBackground(panDefault);
    }//GEN-LAST:event_logoutMouseReleased

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
    
    private void addProvinsiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProvinsiBtnActionPerformed
        setInputProvinsi(true);
        setSaveCancelProvinsi(true);
        action="tambah";
    }//GEN-LAST:event_addProvinsiBtnActionPerformed

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

    private void tableProvinsiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProvinsiMouseClicked
        int clickedRow = tableProvinsi.getSelectedRow();
        TableModel tableModel = tableProvinsi.getModel();
        
        selectedId = Integer.parseInt(tableModel.getValueAt(clickedRow, 0).toString());
        namaProvinsiInput.setText(tableModel.getValueAt(clickedRow, 1).toString());
    }//GEN-LAST:event_tableProvinsiMouseClicked

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

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void tableTemaFasilitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableTemaFasilitasMouseClicked
        int clickedRow = tableTemaFasilitas.getSelectedRow();
        TableModel tableModel = tableTemaFasilitas.getModel();
        
        selectedTemaFasilitasId = Integer.parseInt(tableModel.getValueAt(clickedRow, 0).toString());
        namaTemaFasilitasInput.setText(tableModel.getValueAt(clickedRow, 1).toString());
        
    }//GEN-LAST:event_tableTemaFasilitasMouseClicked

    private void addJenisHotelBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJenisHotelBtn1ActionPerformed
        namaTemaFasilitasInput.setEnabled(true);
        saveTemaFasilitas.setEnabled(true);
        cancelTemaFasilitas.setEnabled(true);
        actionTemaFasilitas="tambah";
    }//GEN-LAST:event_addJenisHotelBtn1ActionPerformed

    private void editJenisHotelBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editJenisHotelBtn1ActionPerformed
          if(!namaTemaFasilitasInput.getText().isEmpty()){
              namaTemaFasilitasInput.setEnabled(true);
                saveTemaFasilitas.setEnabled(true);
                cancelTemaFasilitas.setEnabled(true);
                actionTemaFasilitas="ubah";
              } 
        
    }//GEN-LAST:event_editJenisHotelBtn1ActionPerformed

    private void namaTemaFasilitasInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaTemaFasilitasInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaTemaFasilitasInputActionPerformed

    
    public void inputTemaFasilitasKosongException() throws InputKosongException{
        if(namaTemaFasilitasInput.getText().isEmpty()){
            throw new InputKosongException();
        }
    }
    
    private void saveTemaFasilitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveTemaFasilitasActionPerformed
         try{
            inputTemaFasilitasKosongException();
            
            String namaTemaFasilitas = namaTemaFasilitasInput.getText();
         
            
            if(actionTemaFasilitas.equals("tambah")){
                TemaFasilitas g = new TemaFasilitas(0,namaTemaFasilitas);
                temaFasilitasControl.insertDataTemaFasilitas(g);
            }else{
                TemaFasilitas g = new TemaFasilitas(selectedTemaFasilitasId,namaTemaFasilitas);
                temaFasilitasControl.updateDataTemaFasilitas(g);
            }
            
            showTemaFasilitas();
            
            namaTemaFasilitasInput.setText("");
            namaTemaFasilitasInput.setEnabled(false);
            
            saveTemaFasilitas.setEnabled(false);
            cancelTemaFasilitas.setEnabled(false);
            
            
            
        }catch(InputKosongException e){
            JOptionPane.showMessageDialog(this, e.message());
        }
    }//GEN-LAST:event_saveTemaFasilitasActionPerformed

    private void removeJenisHotelBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeJenisHotelBtn1ActionPerformed
         if(!namaTemaFasilitasInput.getText().isEmpty()){
            int getAnswer = JOptionPane.showConfirmDialog(rootPane,"Apakah yakin ingin menghapus data ? ", "Konfirmasi", JOptionPane.YES_NO_OPTION);

            switch(getAnswer){
                case 0:
                try{
                    temaFasilitasControl.deleteDataTemaFasilitas(selectedTemaFasilitasId);
                    
                    namaTemaFasilitasInput.setEnabled(false);   
                    namaTemaFasilitasInput.setText("");
                    
                    showTemaFasilitas();
                    
                    saveTemaFasilitas.setEnabled(false);
                    cancelTemaFasilitas.setEnabled(false);
                }catch(Exception e){
                    System.out.println("Error : "+e.getMessage());
                }
                break;
                case 1:
                break;
            }
        }
    }//GEN-LAST:event_removeJenisHotelBtn1ActionPerformed

    private void cancelTemaFasilitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelTemaFasilitasActionPerformed
        saveTemaFasilitas.setEnabled(false);
        cancelTemaFasilitas.setEnabled(false);
        
        namaTemaFasilitasInput.setText("");
        namaTemaFasilitasInput.setEnabled(false);
        
        
    }//GEN-LAST:event_cancelTemaFasilitasActionPerformed

    
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
    private javax.swing.JButton addJenisHotelBtn1;
    private javax.swing.JButton addProvinsiBtn;
    private javax.swing.JButton cancelGradeBtn;
    private javax.swing.JButton cancelJenisHotelBtn;
    private javax.swing.JButton cancelProvinsiBtn;
    private javax.swing.JButton cancelTemaFasilitas;
    private javax.swing.JButton deleteGradeBtn;
    private javax.swing.JButton deleteProvinsiBtn;
    private javax.swing.JTextField deskripsiInput;
    private javax.swing.JButton editGradeBtn;
    private javax.swing.JButton editJenisHotelBtn;
    private javax.swing.JButton editJenisHotelBtn1;
    private javax.swing.JButton editProvinsiBtn;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JToggleButton jToggleButton1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField keteranganInput;
    private javax.swing.JPanel logout;
    private javax.swing.JPanel menu1;
    private javax.swing.JPanel menu2;
    private javax.swing.JPanel menu3;
    private javax.swing.JTextField namaGradeInput;
    private javax.swing.JTextField namaJenisInput;
    private javax.swing.JTextField namaProvinsiInput;
    private javax.swing.JTextField namaTemaFasilitasInput;
    private javax.swing.JButton removeJenisHotelBtn;
    private javax.swing.JButton removeJenisHotelBtn1;
    private javax.swing.JButton saveGradeBtn;
    private javax.swing.JButton saveJenisHotelBtn;
    private javax.swing.JButton saveProvinsiBtn;
    private javax.swing.JButton saveTemaFasilitas;
    private javax.swing.JTable tableGrade;
    private javax.swing.JTable tableJenisHotel;
    private javax.swing.JTable tableProvinsi;
    private javax.swing.JTable tableTemaFasilitas;
    // End of variables declaration//GEN-END:variables
}
