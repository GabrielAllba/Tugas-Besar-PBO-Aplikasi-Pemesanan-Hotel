package view.adminHotel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import view.admin.FasilitasHotel;
import view.admin.*;
import exception.InputKosongException;

import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

import controller.ProvinsiControll;
import controller.GradeControll;
import controller.HotelControll;
import controller.JenisHotelControll;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.math.BigInteger;
import java.util.ArrayList;

import model.Provinsi;
import model.Grade;
import model.JenisHotel;
import java.util.List;
import javax.swing.border.EmptyBorder;
import model.Hotel;

public class AdminHotelHome extends javax.swing.JFrame {
    List<Provinsi> listProvinsi;
    List<Grade> listGrade;
    List<JenisHotel> listJenisHotel;
    
    ProvinsiControll provinsiControl = new ProvinsiControll();
    GradeControll gradeControl = new GradeControll();
    JenisHotelControll jenisHotelControl = new JenisHotelControll();
    HotelControll hotelControl = new HotelControll();
    
    String action=null;
    int selectedId = 0;
    
    String actionGrade=null;
    int selectedGradeId=0;
    
    String actionJenisHotel=null;
    int selectedJenisHotelId=0;
    
    public void setProvinsiToDropdown(){
        listProvinsi = provinsiControl.showListProvinsi();
        for(int i=0; i<listProvinsi.size(); i++){
            lokasiHotelDropdown.addItem(listProvinsi.get(i));
        }
    }
    public void setGradeToDropdown(){
        listGrade = gradeControl.showListGrade();
        for(int i=0; i<listGrade.size(); i++){
            gradeHotelDropdown.addItem(listGrade.get(i));
        }
    }
     public void setJenisHotelToDropdown(){
        listJenisHotel = jenisHotelControl.showListJenisHotel();
        for(int i=0; i<listJenisHotel.size(); i++){
            jenisHotelDropdown.addItem(listJenisHotel.get(i));
        }
    }
    
     
    public void setInputPendaftaranHotel(boolean value){
        namaHotelInput.setEnabled(value);
        jenisHotelDropdown.setEnabled(value);
        lokasiHotelDropdown.setEnabled(value);
        alamatLengkapInput.setEnabled(value);
        deskripsiHotelInput.setEnabled(value);
        gradeHotelDropdown.setEnabled(value);
        setTimeCheckin.setEnabled(value);
        setTimeCheckout.setEnabled(value);
        saveHotelBtn.setEnabled(value);
        cancelHotelBtn.setEnabled(value);
    }
    
     public void setLokasiToDropdown(){
        lokasiHotelDropdown.removeAllItems();
        listProvinsi = new ArrayList<Provinsi>();
        listProvinsi = provinsiControl.showListProvinsi();
        for(int i=0; i<listProvinsi.size(); i++){
            lokasiHotelDropdown.addItem(listProvinsi.get(i));
        }
    }
    public void setJenisToDropdown(){
        jenisHotelDropdown.removeAllItems();
        listJenisHotel = new ArrayList<JenisHotel>();
        listJenisHotel = jenisHotelControl.showListJenisHotel();
        for(int i=0; i<listJenisHotel.size(); i++){
            jenisHotelDropdown.addItem(listJenisHotel.get(i));
        }
    }
    
    
    
    public AdminHotelHome() {
       initComponents();
       
       showHotelAll();
       
       setInputPendaftaranHotel(false);
       showCheckinTime.setEnabled(false);
       showCheckoutTime.setEnabled(false);
       setLokasiToDropdown();
       setJenisToDropdown();
       setGradeToDropdown();
       timePickerCheckin.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent ae){
               showCheckinTime.setText(timePickerCheckin.getSelectedTime());
           }
       });
       
       timePickerCheckout.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent ae){
               showCheckoutTime.setText(timePickerCheckin.getSelectedTime());
           }
       });
   

    }
    
    // Provinsi
    public void setInputProvinsi(boolean value){
//        namaProvinsiInput.setEnabled(value);
    }
    public void setSaveCancelProvinsi(boolean value){
//        saveProvinsiBtn.setEnabled(value);
//        cancelProvinsiBtn.setEnabled(value);
    }
    
    public void showHotelAll(){
        tableHotel.setModel(hotelControl.showHotel(""));
    }
    public void showHotelByAdmin(){
        tableHotel.setModel(hotelControl.showHotelByHotelAdmin(Integer.parseInt(idValueInput.getText())));
    }
    
    // Grade
    public void setInputGrade(boolean value){
//        namaGradeInput.setEnabled(value);
//        keteranganInput.setEnabled(value);
    }
    public void setSaveCancelGrade(boolean value){
//        saveGradeBtn.setEnabled(value);
//        cancelGradeBtn.setEnabled(value);
    }
    
    public void showGrade(){
//        tableGrade.setModel(gradeControl.showGrade(""));
    }
    
    // Jenis Hotel
    public void setInputJenisHotel(boolean value){
//        namaJenisInput.setEnabled(value);
//        deskripsiInput.setEnabled(value);
    }
    public void setSaveCancelJenisHotel(boolean value){
//        saveJenisHotelBtn.setEnabled(value);
//        cancelJenisHotelBtn.setEnabled(value);
    }
    
    public void showJenisHotel(){
//        tableJenisHotel.setModel(jenisHotelControl.showJenisHotel(""));
    }
  
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ruangKelasGroup = new javax.swing.ButtonGroup();
        timePickerCheckin = new com.raven.swing.TimePicker();
        timePickerCheckout = new com.raven.swing.TimePicker();
        sidebarPanel = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        lecturerPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        coursePanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        coursePanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        containerPanel = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        headerPanel = new javax.swing.JPanel();
        titleContent = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        idValueInput = new javax.swing.JLabel();
        userNameValueInput = new javax.swing.JLabel();
        editTemaBtn = new javax.swing.JButton();
        deleteTemaBtn = new javax.swing.JButton();
        addPendaftaran = new javax.swing.JButton();
        contentPanel = new javax.swing.JPanel();
        namaHotelInput = new javax.swing.JTextField();
        mataKuliahLabel = new javax.swing.JLabel();
        cancelHotelBtn = new javax.swing.JButton();
        saveHotelBtn = new javax.swing.JButton();
        mataKuliahLabel1 = new javax.swing.JLabel();
        jenisHotelDropdown = new javax.swing.JComboBox<>();
        mataKuliahLabel2 = new javax.swing.JLabel();
        lokasiHotelDropdown = new javax.swing.JComboBox<>();
        mataKuliahLabel4 = new javax.swing.JLabel();
        alamatLengkapInput = new javax.swing.JTextField();
        mataKuliahLabel5 = new javax.swing.JLabel();
        deskripsiHotelInput = new javax.swing.JTextField();
        mataKuliahLabel7 = new javax.swing.JLabel();
        gradeHotelDropdown = new javax.swing.JComboBox<>();
        mataKuliahLabel8 = new javax.swing.JLabel();
        mataKuliahLabel9 = new javax.swing.JLabel();
        mataKuliahLabel10 = new javax.swing.JLabel();
        setTimeCheckin = new javax.swing.JButton();
        setTimeCheckout = new javax.swing.JButton();
        showCheckoutTime = new javax.swing.JTextField();
        showCheckinTime = new javax.swing.JTextField();
        fasilitasContentPanel = new javax.swing.JPanel();
        contentPanel4 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tableHotel = new javax.swing.JTable();
        mataKuliahLabel11 = new javax.swing.JLabel();
        showHotelBtn = new javax.swing.JButton();

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
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
        );
        lecturerPanelLayout.setVerticalGroup(
            lecturerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lecturerPanelLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(50, 50, 50))
        );

        coursePanel1.setBackground(new java.awt.Color(153, 153, 153));

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
                .addGap(41, 41, 41)
                .addComponent(jLabel4)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        coursePanel.setBackground(new java.awt.Color(153, 153, 153));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("User");

        javax.swing.GroupLayout coursePanelLayout = new javax.swing.GroupLayout(coursePanel);
        coursePanel.setLayout(coursePanelLayout);
        coursePanelLayout.setHorizontalGroup(
            coursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coursePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        coursePanelLayout.setVerticalGroup(
            coursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coursePanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout sidebarPanelLayout = new javax.swing.GroupLayout(sidebarPanel);
        sidebarPanel.setLayout(sidebarPanelLayout);
        sidebarPanelLayout.setHorizontalGroup(
            sidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarPanelLayout.createSequentialGroup()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
            .addComponent(coursePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(coursePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(coursePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        titleContent.setText("Admin Hotel");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ID : ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Username : ");

        idValueInput.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        idValueInput.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        userNameValueInput.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        userNameValueInput.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        editTemaBtn.setBackground(new java.awt.Color(236, 168, 30));
        editTemaBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        editTemaBtn.setForeground(new java.awt.Color(255, 255, 255));
        editTemaBtn.setText("Ubah");
        editTemaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editTemaBtnActionPerformed(evt);
            }
        });

        deleteTemaBtn.setBackground(new java.awt.Color(153, 0, 0));
        deleteTemaBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deleteTemaBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteTemaBtn.setText("Hapus");
        deleteTemaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteTemaBtnActionPerformed(evt);
            }
        });

        addPendaftaran.setBackground(new java.awt.Color(0, 153, 0));
        addPendaftaran.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addPendaftaran.setForeground(new java.awt.Color(255, 255, 255));
        addPendaftaran.setText("Tambah");
        addPendaftaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPendaftaranActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userNameValueInput, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idValueInput, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(addPendaftaran)
                .addGap(18, 18, 18)
                .addComponent(editTemaBtn)
                .addGap(18, 18, 18)
                .addComponent(deleteTemaBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titleContent, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(255, 255, 255))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(idValueInput))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(userNameValueInput))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleContent)
                    .addComponent(deleteTemaBtn)
                    .addComponent(editTemaBtn)
                    .addComponent(addPendaftaran))
                .addContainerGap())
        );

        contentPanel.setBackground(new java.awt.Color(255, 255, 255));
        contentPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.lightGray));

        namaHotelInput.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N

        mataKuliahLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mataKuliahLabel.setText("Nama Hotel");

        cancelHotelBtn.setBackground(new java.awt.Color(153, 0, 0));
        cancelHotelBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancelHotelBtn.setForeground(new java.awt.Color(255, 255, 255));
        cancelHotelBtn.setText("Batal");
        cancelHotelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelHotelBtnActionPerformed(evt);
            }
        });

        saveHotelBtn.setBackground(new java.awt.Color(22, 52, 122));
        saveHotelBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        saveHotelBtn.setForeground(new java.awt.Color(255, 255, 255));
        saveHotelBtn.setText("Simpan");
        saveHotelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveHotelBtnActionPerformed(evt);
            }
        });

        mataKuliahLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mataKuliahLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mataKuliahLabel1.setText("Form Pendaftaran Hotel");

        jenisHotelDropdown.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N

        mataKuliahLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mataKuliahLabel2.setText("Jenis Hotel");

        lokasiHotelDropdown.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N

        mataKuliahLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mataKuliahLabel4.setText("Lokasi Hotel");

        alamatLengkapInput.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        alamatLengkapInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alamatLengkapInputActionPerformed(evt);
            }
        });

        mataKuliahLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mataKuliahLabel5.setText("Alamat Lengkap");

        deskripsiHotelInput.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N

        mataKuliahLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mataKuliahLabel7.setText("Deskripsi Hotel");

        gradeHotelDropdown.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N

        mataKuliahLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mataKuliahLabel8.setText("Grade Hotel");

        mataKuliahLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mataKuliahLabel9.setText("Checkin time");

        mataKuliahLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mataKuliahLabel10.setText("Checkout time");

        setTimeCheckin.setText("Set time");
        setTimeCheckin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setTimeCheckinActionPerformed(evt);
            }
        });

        setTimeCheckout.setText("Set time");
        setTimeCheckout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setTimeCheckoutActionPerformed(evt);
            }
        });

        showCheckoutTime.setEditable(false);
        showCheckoutTime.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N

        showCheckinTime.setEditable(false);
        showCheckinTime.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(namaHotelInput, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mataKuliahLabel)
                            .addComponent(mataKuliahLabel2)
                            .addComponent(jenisHotelDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mataKuliahLabel4)
                            .addComponent(lokasiHotelDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(alamatLengkapInput, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mataKuliahLabel5)
                            .addComponent(deskripsiHotelInput, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mataKuliahLabel7)
                            .addComponent(mataKuliahLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mataKuliahLabel8)
                            .addComponent(gradeHotelDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mataKuliahLabel9))
                        .addContainerGap(21, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPanelLayout.createSequentialGroup()
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(setTimeCheckin)
                            .addComponent(showCheckinTime, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(setTimeCheckout)
                            .addComponent(mataKuliahLabel10)
                            .addGroup(contentPanelLayout.createSequentialGroup()
                                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(saveHotelBtn)
                                    .addComponent(showCheckoutTime, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cancelHotelBtn)))
                        .addGap(29, 29, 29))))
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mataKuliahLabel1)
                .addGap(18, 18, 18)
                .addComponent(mataKuliahLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(namaHotelInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mataKuliahLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jenisHotelDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mataKuliahLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lokasiHotelDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mataKuliahLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(alamatLengkapInput, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mataKuliahLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deskripsiHotelInput, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mataKuliahLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gradeHotelDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addComponent(mataKuliahLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(setTimeCheckin))
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addComponent(mataKuliahLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(setTimeCheckout)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showCheckoutTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showCheckinTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveHotelBtn)
                    .addComponent(cancelHotelBtn))
                .addContainerGap())
        );

        fasilitasContentPanel.setBackground(new java.awt.Color(255, 255, 255));
        fasilitasContentPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.lightGray));

        javax.swing.GroupLayout fasilitasContentPanelLayout = new javax.swing.GroupLayout(fasilitasContentPanel);
        fasilitasContentPanel.setLayout(fasilitasContentPanelLayout);
        fasilitasContentPanelLayout.setHorizontalGroup(
            fasilitasContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        fasilitasContentPanelLayout.setVerticalGroup(
            fasilitasContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 249, Short.MAX_VALUE)
        );

        contentPanel4.setBackground(new java.awt.Color(255, 255, 255));
        contentPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.lightGray));

        jScrollPane6.setBackground(new java.awt.Color(255, 255, 255));

        tableHotel.setAutoCreateRowSorter(true);
        tableHotel.setModel(new javax.swing.table.DefaultTableModel(
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
        tableHotel.setDoubleBuffered(true);
        tableHotel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableHotelMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tableHotel);

        mataKuliahLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        mataKuliahLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mataKuliahLabel11.setText("List Hotel");

        showHotelBtn.setBackground(new java.awt.Color(0, 153, 0));
        showHotelBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        showHotelBtn.setForeground(new java.awt.Color(255, 255, 255));
        showHotelBtn.setText("Lihat berdasarkan kepemilikanmu");
        showHotelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showHotelBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentPanel4Layout = new javax.swing.GroupLayout(contentPanel4);
        contentPanel4.setLayout(contentPanel4Layout);
        contentPanel4Layout.setHorizontalGroup(
            contentPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanel4Layout.createSequentialGroup()
                .addGroup(contentPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, contentPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(showHotelBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(mataKuliahLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 14, Short.MAX_VALUE))
        );
        contentPanel4Layout.setVerticalGroup(
            contentPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mataKuliahLabel11)
                .addGap(18, 18, 18)
                .addComponent(showHotelBtn)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLayeredPane1.setLayer(headerPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(contentPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(fasilitasContentPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(contentPanel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(contentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fasilitasContentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(contentPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contentPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fasilitasContentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(156, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout containerPanelLayout = new javax.swing.GroupLayout(containerPanel);
        containerPanel.setLayout(containerPanelLayout);
        containerPanelLayout.setHorizontalGroup(
            containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerPanelLayout.createSequentialGroup()
                .addComponent(jLayeredPane1)
                .addContainerGap())
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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1010, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidebarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 808, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void inputProvinsiKosongException() throws InputKosongException{
//        if(namaProvinsiInput.getText().isEmpty()){
//            throw new InputKosongException();
//        }
    }
    
    public void inputGradeKosongException() throws InputKosongException{
//        if(namaGradeInput.getText().isEmpty() || keteranganInput.getText().isEmpty()){
//            throw new InputKosongException();
//        }
    }
    
    public void inputJenisHotelKosongException() throws InputKosongException{
//        if(namaJenisInput.getText().isEmpty() || deskripsiInput.getText().isEmpty()){
//            throw new InputKosongException();
//        }
    }
    
    private void lecturerPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lecturerPanelMouseClicked
//        DosenView dv = new DosenView();
//        this.dispose();
//        dv.setVisible(true);
    }//GEN-LAST:event_lecturerPanelMouseClicked

    
    private void inputHotelKosongException() throws InputKosongException{
        if(namaHotelInput.getText().isEmpty() || jenisHotelDropdown.getSelectedIndex() == -1 || lokasiHotelDropdown.getSelectedIndex() == -1 || 
                alamatLengkapInput.getText().isEmpty() || deskripsiHotelInput.getText().isEmpty() || gradeHotelDropdown.getSelectedIndex() == -1 ||
                showCheckinTime.getText().isEmpty() || showCheckoutTime.getText().isEmpty()){
            throw new InputKosongException();
        }
    }
    
    private void cancelHotelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelHotelBtnActionPerformed

        setSaveCancelProvinsi(false);
        //        namaHotelInput.setText("");
        //        namaHotelInput.setEnabled(false);
    }//GEN-LAST:event_cancelHotelBtnActionPerformed

    private void saveHotelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveHotelBtnActionPerformed
       try{
            inputHotelKosongException();

//            TemaFasilitas t = listTemaFasilitas.get(temaFasilitas);
            System.out.println("asldfjk");
            String namaHotel = namaHotelInput.getText();
            
            int indexJenisHotel = jenisHotelDropdown.getSelectedIndex();
            int idJenisHotel = listJenisHotel.get(indexJenisHotel).getId();
                    
            int indexLokkasiHotel = lokasiHotelDropdown.getSelectedIndex();
            int idProvinsiHotel = listProvinsi.get(indexLokkasiHotel).getId();
            
            String alamatLengkap = alamatLengkapInput.getText();
            String deskripsiHotel = deskripsiHotelInput.getText();
            
            int indexGradeHotel = gradeHotelDropdown.getSelectedIndex();
            int idGradeHotel = listGrade.get(indexGradeHotel).getId();
            
            String checkinTime = showCheckinTime.getText();
            String checkoutTime = showCheckoutTime.getText();
            
            String fasilitas = "";
            String status = "unverified";
            BigInteger pemasukan = BigInteger.valueOf(0);
            
            System.out.println("asldfjk");
          
            
            if(action.equals("tambah")){
                System.out.println("asldfjk");
                Hotel h = new Hotel(0, Integer.parseInt(idValueInput.getText()), idJenisHotel, idProvinsiHotel, idGradeHotel, namaHotel,
                alamatLengkap, deskripsiHotel, fasilitas, checkinTime, checkoutTime, status, pemasukan);
                hotelControl.insertDataHotel(h);
                System.out.println("asldfjk");
            }else{
                Hotel h = new Hotel(0, Integer.parseInt(idValueInput.getText()), idJenisHotel, idProvinsiHotel, idGradeHotel, namaHotel,
                alamatLengkap, deskripsiHotel, fasilitas, checkinTime, checkoutTime, status, pemasukan);
                hotelControl.insertDataHotel(h);
            }
            
              showHotelByAdmin();
//            temaFasilitasInput.setText("");
//            temaFasilitasInput.setEnabled(false);
//            setSaveCancelTemaFasilitas(false);
//            setTemaFasilitasToDropdown();
            
            
            
        }catch(InputKosongException e){
            JOptionPane.showMessageDialog(this, e.message());
        }
    }//GEN-LAST:event_saveHotelBtnActionPerformed

    private void tableHotelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableHotelMouseClicked
//        int clickedRow = tableJenisHotel.getSelectedRow();
//        TableModel tableModel = tableJenisHotel.getModel();

//        selectedJenisHotelId = Integer.parseInt(tableModel.getValueAt(clickedRow, 0).toString());
//        namaJenisInput.setText(tableModel.getValueAt(clickedRow, 1).toString());
//        deskripsiInput.setText(tableModel.getValueAt(clickedRow, 2).toString());
    }//GEN-LAST:event_tableHotelMouseClicked

    private void setTimeCheckinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setTimeCheckinActionPerformed
        timePickerCheckin.showPopup(this, 100, 100);
    }//GEN-LAST:event_setTimeCheckinActionPerformed

    private void setTimeCheckoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setTimeCheckoutActionPerformed
        timePickerCheckout.showPopup(this, 100, 100);
    }//GEN-LAST:event_setTimeCheckoutActionPerformed

    private void alamatLengkapInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alamatLengkapInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alamatLengkapInputActionPerformed

    private void showHotelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showHotelBtnActionPerformed
        showHotelByAdmin();
    }//GEN-LAST:event_showHotelBtnActionPerformed

    private void editTemaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editTemaBtnActionPerformed

//        if(!temaFasilitasInput.getText().isEmpty()){
//            action = "ubah";
//            temaFasilitasInput.setEnabled(true);
//            setSaveCancelTemaFasilitas(true);
//        }
    }//GEN-LAST:event_editTemaBtnActionPerformed

    private void deleteTemaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteTemaBtnActionPerformed
//
//        if(!temaFasilitasInput.getText().isEmpty()){
//            int getAnswer = JOptionPane.showConfirmDialog(rootPane,"Apakah yakin ingin menghapus data ? ", "Konfirmasi", JOptionPane.YES_NO_OPTION);
//
//            switch(getAnswer){
//                case 0:
//                try{
//                    temaFasilitasControl.deleteDataTemaFasilitas(selectedId);
//
//                    temaFasilitasInput.setEnabled(false);
//                    temaFasilitasInput.setText("");
//
//                    showTemaFasilitas();
//                    showSubFasilitas();
//
//                    setSaveCancelTemaFasilitas(false);
//                    setTemaFasilitasToDropdown();
//                }catch(Exception e){
//                    System.out.println("Error : "+e.getMessage());
//                }
//                break;
//                case 1:
//                break;
//            }
//        }
    }//GEN-LAST:event_deleteTemaBtnActionPerformed

    private void addPendaftaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPendaftaranActionPerformed
        setInputPendaftaranHotel(true);
        action="tambah";
    }//GEN-LAST:event_addPendaftaranActionPerformed

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
            java.util.logging.Logger.getLogger(AdminHotelHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminHotelHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminHotelHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminHotelHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHotelHome().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPendaftaran;
    private javax.swing.JTextField alamatLengkapInput;
    private javax.swing.JButton cancelHotelBtn;
    private javax.swing.JPanel containerPanel;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JPanel contentPanel4;
    private javax.swing.JPanel coursePanel;
    private javax.swing.JPanel coursePanel1;
    private javax.swing.JButton deleteTemaBtn;
    private javax.swing.JTextField deskripsiHotelInput;
    private javax.swing.JButton editTemaBtn;
    private javax.swing.JPanel fasilitasContentPanel;
    private javax.swing.JComboBox<Grade> gradeHotelDropdown;
    private javax.swing.JPanel headerPanel;
    public javax.swing.JLabel idValueInput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JComboBox<JenisHotel> jenisHotelDropdown;
    private javax.swing.JPanel lecturerPanel;
    private javax.swing.JLabel logo;
    private javax.swing.JComboBox<Provinsi> lokasiHotelDropdown;
    private javax.swing.JLabel mataKuliahLabel;
    private javax.swing.JLabel mataKuliahLabel1;
    private javax.swing.JLabel mataKuliahLabel10;
    private javax.swing.JLabel mataKuliahLabel11;
    private javax.swing.JLabel mataKuliahLabel2;
    private javax.swing.JLabel mataKuliahLabel4;
    private javax.swing.JLabel mataKuliahLabel5;
    private javax.swing.JLabel mataKuliahLabel7;
    private javax.swing.JLabel mataKuliahLabel8;
    private javax.swing.JLabel mataKuliahLabel9;
    private javax.swing.JTextField namaHotelInput;
    private javax.swing.ButtonGroup ruangKelasGroup;
    private javax.swing.JButton saveHotelBtn;
    private javax.swing.JButton setTimeCheckin;
    private javax.swing.JButton setTimeCheckout;
    private javax.swing.JTextField showCheckinTime;
    private javax.swing.JTextField showCheckoutTime;
    private javax.swing.JButton showHotelBtn;
    private javax.swing.JPanel sidebarPanel;
    private javax.swing.JTable tableHotel;
    private com.raven.swing.TimePicker timePickerCheckin;
    private com.raven.swing.TimePicker timePickerCheckout;
    private javax.swing.JLabel titleContent;
    public javax.swing.JLabel userNameValueInput;
    // End of variables declaration//GEN-END:variables
}
