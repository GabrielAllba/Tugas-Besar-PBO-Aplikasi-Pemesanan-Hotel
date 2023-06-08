package view.adminHotel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import view.admin.*;
import exception.InputKosongException;

import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import model.TemaFasilitas;
import model.SubFasilitas;

import controller.ProvinsiControll;
import controller.GradeControll;
import controller.HotelControll;
import controller.JenisHotelControll;
import controller.TemaFasilitasControll;
import controller.SubFasilitasControl;

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
import table.TableSubFasilitas;

public class AdminHotelHome extends javax.swing.JFrame {
    List<Provinsi> listProvinsi;
    List<Grade> listGrade;
    List<JenisHotel> listJenisHotel;
    List<TemaFasilitas> listTemaFasilitas;
    
    ProvinsiControll provinsiControl = new ProvinsiControll();
    GradeControll gradeControl = new GradeControll();
    JenisHotelControll jenisHotelControl = new JenisHotelControll();
    HotelControll hotelControl = new HotelControll();
    TemaFasilitasControll temaFasilitasControl = new TemaFasilitasControll();
    SubFasilitasControl subFasilitasControl = new SubFasilitasControl();
    
    String action=null;
    int selectedId = 0;
    
    String actionGrade=null;
    int selectedGradeId=0;
    
    String actionJenisHotel=null;
    int selectedJenisHotelId=0;
     
    String actionSubFasilitas = null;
    int selectedSubFasilitas = 0;
    
    int selectedIdHotel=-1;
  
    int selectedIdSubFasilitas = 0;
    
    public void setAddEditDeleteSubFasilitas(boolean value){
        addSubFasillitas.setEnabled(value);
        editSubFasilitas.setEnabled(value);
        deleteSubFasilitas.setEnabled(value);
    }
    public void setSubFasilitasInput(boolean value){
        temaFasilitasDropdown.setEnabled(value);
        namaFasilitasInput.setEnabled(value);
        
    }
    public void setProvinsiToDropdown(){
        listProvinsi = provinsiControl.showListProvinsi();
        for(int i=0; i<listProvinsi.size(); i++){
            lokasiHotelDropdown.addItem(listProvinsi.get(i));
        }
    }
    
     public void setFilterToDropdown(){
        String[] namaFilter = {"Semua Hotel", "Berdasarkan Milikmu"};
        for(String n : namaFilter){
            filterHotelDropdown.addItem(n);    
        }
        
    }
     
    public void setTableFasilitas(boolean value){
        listSubFasilitasPanel.setVisible(value);
        tableSubFasilitas.setVisible(value);
    }
     
     public void setSaveCancelFasilitas(boolean value){
         saveFasilitasBtn.setEnabled(value);
         cancelFasilitasBtn.setEnabled(value);
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
     
     public void setTemaFasilitasToDropdown(){
        listTemaFasilitas = temaFasilitasControl.showListTemaFasilitas();
        for(int i=0; i<listTemaFasilitas.size(); i++){
            temaFasilitasDropdown.addItem(listTemaFasilitas.get(i));
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
       setAddEditDeleteSubFasilitas(false);
       setSubFasilitasInput(false);
       
       setFilterToDropdown();
       filterHotelDropdown.setSelectedIndex(0);
       
       setTemaFasilitasToDropdown();
       temaFasilitasDropdown.setSelectedIndex(0);
       
       inisialisasiSubFasilitasTable();
       
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
               showCheckoutTime.setText(timePickerCheckout.getSelectedTime());
           }
       });
       setSaveCancelFasilitas(false);
       showHotelAll();
       editPendaftaran.setEnabled(false);
       deletePendaftaran.setEnabled(false);
       

    }
    
    public void showHotelAll(){
        tableHotel.setModel(hotelControl.showHotel(""));
//        if(!idValueInput.getText().isEmpty()){
//            for (int row = 0; row < tableHotel.getRowCount(); row++) {
//                if(tableHotel.getValueAt(row, 0) != Integer.valueOf(idValueInput.getText())){
//                    Component n = tableHotel.getComponent(row);
//                    n.setEnabled(false);
//                }
//            }
//        }
        
    }
    
    public void showSubFasilitas(){
        tableSubFasilitas.setModel(subFasilitasControl.showSubFasilitas(""));
    }
    public void showSubFasilitasByHotel(){
        tableSubFasilitas.setModel(subFasilitasControl.showSubFasilitasByHotel(selectedIdHotel));
    }
    public void inisialisasiSubFasilitasTable(){
        
        List<SubFasilitas> dataSubFasilitas = new ArrayList<SubFasilitas>();
        TableSubFasilitas t = new TableSubFasilitas(dataSubFasilitas);
        tableSubFasilitas.setModel(t);
    }
    
    public void setHotelVisibility(boolean value){
        listSubFasilitasPanel.setVisible(value);
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
        RoomPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        pemesananPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        containerPanel = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        headerPanel = new javax.swing.JPanel();
        titleContent = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        idValueInput = new javax.swing.JLabel();
        userNameValueInput = new javax.swing.JLabel();
        editPendaftaran = new javax.swing.JButton();
        deletePendaftaran = new javax.swing.JButton();
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
        mataKuliahLabel3 = new javax.swing.JLabel();
        mataKuliahLabel12 = new javax.swing.JLabel();
        listSubFasilitasPanel = new javax.swing.JScrollPane();
        tableSubFasilitas = new javax.swing.JTable();
        namaFasilitasInput = new javax.swing.JTextField();
        mataKuliahLabel13 = new javax.swing.JLabel();
        addSubFasillitas = new javax.swing.JButton();
        editSubFasilitas = new javax.swing.JButton();
        deleteSubFasilitas = new javax.swing.JButton();
        saveFasilitasBtn = new javax.swing.JButton();
        cancelFasilitasBtn = new javax.swing.JButton();
        mataKuliahLabel14 = new javax.swing.JLabel();
        temaFasilitasDropdown = new javax.swing.JComboBox<>();
        contentPanel4 = new javax.swing.JPanel();
        mataKuliahLabel11 = new javax.swing.JLabel();
        filterHotelDropdown = new javax.swing.JComboBox<>();
        mataKuliahLabel6 = new javax.swing.JLabel();
        listHotelPanel1 = new javax.swing.JScrollPane();
        tableHotel = new javax.swing.JTable();

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

        RoomPanel.setBackground(new java.awt.Color(153, 153, 153));
        RoomPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RoomPanelMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Room");

        javax.swing.GroupLayout RoomPanelLayout = new javax.swing.GroupLayout(RoomPanel);
        RoomPanel.setLayout(RoomPanelLayout);
        RoomPanelLayout.setHorizontalGroup(
            RoomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RoomPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                .addContainerGap())
        );
        RoomPanelLayout.setVerticalGroup(
            RoomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RoomPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pemesananPanel.setBackground(new java.awt.Color(153, 153, 153));
        pemesananPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pemesananPanelMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Pemesanan");

        javax.swing.GroupLayout pemesananPanelLayout = new javax.swing.GroupLayout(pemesananPanel);
        pemesananPanel.setLayout(pemesananPanelLayout);
        pemesananPanelLayout.setHorizontalGroup(
            pemesananPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pemesananPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pemesananPanelLayout.setVerticalGroup(
            pemesananPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pemesananPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout sidebarPanelLayout = new javax.swing.GroupLayout(sidebarPanel);
        sidebarPanel.setLayout(sidebarPanelLayout);
        sidebarPanelLayout.setHorizontalGroup(
            sidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarPanelLayout.createSequentialGroup()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
            .addComponent(RoomPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lecturerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pemesananPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        sidebarPanelLayout.setVerticalGroup(
            sidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lecturerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RoomPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pemesananPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        containerPanel.setBackground(new java.awt.Color(243, 243, 243));

        jLayeredPane1.setPreferredSize(new java.awt.Dimension(1010, 800));

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

        editPendaftaran.setBackground(new java.awt.Color(236, 168, 30));
        editPendaftaran.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        editPendaftaran.setForeground(new java.awt.Color(255, 255, 255));
        editPendaftaran.setText("Ubah");
        editPendaftaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editPendaftaranActionPerformed(evt);
            }
        });

        deletePendaftaran.setBackground(new java.awt.Color(153, 0, 0));
        deletePendaftaran.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deletePendaftaran.setForeground(new java.awt.Color(255, 255, 255));
        deletePendaftaran.setText("Hapus");
        deletePendaftaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePendaftaranActionPerformed(evt);
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addPendaftaran)
                .addGap(18, 18, 18)
                .addComponent(editPendaftaran)
                .addGap(18, 18, 18)
                .addComponent(deletePendaftaran)
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
                    .addComponent(deletePendaftaran)
                    .addComponent(editPendaftaran)
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

        mataKuliahLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mataKuliahLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mataKuliahLabel3.setText("Fasilitas Hotel");

        mataKuliahLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mataKuliahLabel12.setForeground(new java.awt.Color(204, 0, 0));
        mataKuliahLabel12.setText("[!] Pilih dulu hotel yang merupakan kepemilkan kamu");

        listSubFasilitasPanel.setBackground(new java.awt.Color(255, 255, 255));

        tableSubFasilitas.setAutoCreateRowSorter(true);
        tableSubFasilitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        tableSubFasilitas.setDoubleBuffered(true);
        tableSubFasilitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableSubFasilitasMouseClicked(evt);
            }
        });
        listSubFasilitasPanel.setViewportView(tableSubFasilitas);

        namaFasilitasInput.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N

        mataKuliahLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mataKuliahLabel13.setText("Nama Fasilitas");

        addSubFasillitas.setBackground(new java.awt.Color(0, 153, 0));
        addSubFasillitas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addSubFasillitas.setForeground(new java.awt.Color(255, 255, 255));
        addSubFasillitas.setText("Tambah");
        addSubFasillitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSubFasillitasActionPerformed(evt);
            }
        });

        editSubFasilitas.setBackground(new java.awt.Color(236, 168, 30));
        editSubFasilitas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        editSubFasilitas.setForeground(new java.awt.Color(255, 255, 255));
        editSubFasilitas.setText("Ubah");
        editSubFasilitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editSubFasilitasActionPerformed(evt);
            }
        });

        deleteSubFasilitas.setBackground(new java.awt.Color(153, 0, 0));
        deleteSubFasilitas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deleteSubFasilitas.setForeground(new java.awt.Color(255, 255, 255));
        deleteSubFasilitas.setText("Hapus");
        deleteSubFasilitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteSubFasilitasActionPerformed(evt);
            }
        });

        saveFasilitasBtn.setBackground(new java.awt.Color(22, 52, 122));
        saveFasilitasBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        saveFasilitasBtn.setForeground(new java.awt.Color(255, 255, 255));
        saveFasilitasBtn.setText("Simpan");
        saveFasilitasBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveFasilitasBtnActionPerformed(evt);
            }
        });

        cancelFasilitasBtn.setBackground(new java.awt.Color(153, 0, 0));
        cancelFasilitasBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancelFasilitasBtn.setForeground(new java.awt.Color(255, 255, 255));
        cancelFasilitasBtn.setText("Batal");
        cancelFasilitasBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelFasilitasBtnActionPerformed(evt);
            }
        });

        mataKuliahLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mataKuliahLabel14.setText("Tema Fasilitas");

        temaFasilitasDropdown.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N

        javax.swing.GroupLayout fasilitasContentPanelLayout = new javax.swing.GroupLayout(fasilitasContentPanel);
        fasilitasContentPanel.setLayout(fasilitasContentPanelLayout);
        fasilitasContentPanelLayout.setHorizontalGroup(
            fasilitasContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fasilitasContentPanelLayout.createSequentialGroup()
                .addComponent(mataKuliahLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(listSubFasilitasPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(fasilitasContentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fasilitasContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mataKuliahLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fasilitasContentPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(saveFasilitasBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelFasilitasBtn))
                    .addGroup(fasilitasContentPanelLayout.createSequentialGroup()
                        .addGroup(fasilitasContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(namaFasilitasInput, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mataKuliahLabel13)
                            .addGroup(fasilitasContentPanelLayout.createSequentialGroup()
                                .addComponent(addSubFasillitas)
                                .addGap(18, 18, 18)
                                .addComponent(editSubFasilitas)
                                .addGap(18, 18, 18)
                                .addComponent(deleteSubFasilitas))
                            .addComponent(mataKuliahLabel14)
                            .addComponent(temaFasilitasDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        fasilitasContentPanelLayout.setVerticalGroup(
            fasilitasContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fasilitasContentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mataKuliahLabel3)
                .addGap(18, 18, 18)
                .addComponent(mataKuliahLabel12)
                .addGap(18, 18, 18)
                .addGroup(fasilitasContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteSubFasilitas)
                    .addComponent(editSubFasilitas)
                    .addComponent(addSubFasillitas))
                .addGap(18, 18, 18)
                .addComponent(mataKuliahLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(temaFasilitasDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(mataKuliahLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(namaFasilitasInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(fasilitasContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveFasilitasBtn)
                    .addComponent(cancelFasilitasBtn))
                .addGap(47, 47, 47)
                .addComponent(listSubFasilitasPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        contentPanel4.setBackground(new java.awt.Color(255, 255, 255));
        contentPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.lightGray));

        mataKuliahLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mataKuliahLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mataKuliahLabel11.setText("List Hotel");

        filterHotelDropdown.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        filterHotelDropdown.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                filterHotelDropdownMouseClicked(evt);
            }
        });
        filterHotelDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterHotelDropdownActionPerformed(evt);
            }
        });

        mataKuliahLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mataKuliahLabel6.setText("Filter");

        listHotelPanel1.setBackground(new java.awt.Color(255, 255, 255));

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
        listHotelPanel1.setViewportView(tableHotel);

        javax.swing.GroupLayout contentPanel4Layout = new javax.swing.GroupLayout(contentPanel4);
        contentPanel4.setLayout(contentPanel4Layout);
        contentPanel4Layout.setHorizontalGroup(
            contentPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanel4Layout.createSequentialGroup()
                .addComponent(mataKuliahLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
            .addGroup(contentPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contentPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPanel4Layout.createSequentialGroup()
                        .addGroup(contentPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mataKuliahLabel6)
                            .addComponent(filterHotelDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(listHotelPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        contentPanel4Layout.setVerticalGroup(
            contentPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mataKuliahLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mataKuliahLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filterHotelDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(listHotelPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(contentPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fasilitasContentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout containerPanelLayout = new javax.swing.GroupLayout(containerPanel);
        containerPanel.setLayout(containerPanelLayout);
        containerPanelLayout.setHorizontalGroup(
            containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerPanelLayout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1033, Short.MAX_VALUE)
                .addContainerGap())
        );
        containerPanelLayout.setVerticalGroup(
            containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 868, Short.MAX_VALUE)
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
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    
    
    private void lecturerPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lecturerPanelMouseClicked

    }//GEN-LAST:event_lecturerPanelMouseClicked

    
    private void inputHotelKosongException() throws InputKosongException{
        if(namaHotelInput.getText().isEmpty() || jenisHotelDropdown.getSelectedIndex() == -1 || lokasiHotelDropdown.getSelectedIndex() == -1 || 
                alamatLengkapInput.getText().isEmpty() || deskripsiHotelInput.getText().isEmpty() || gradeHotelDropdown.getSelectedIndex() == -1 ||
                showCheckinTime.getText().isEmpty() || showCheckoutTime.getText().isEmpty()){
            throw new InputKosongException();
        }
    }
    
    private void cancelHotelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelHotelBtnActionPerformed

        
 
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
            
            
            String status = "unverified";
            BigInteger pemasukan = BigInteger.valueOf(0);
            
            System.out.println("asldfjk");
          
            
            if(action.equals("tambah")){
                System.out.println("asldfjk");
                Hotel h = new Hotel(0, Integer.parseInt(idValueInput.getText()), idJenisHotel, idProvinsiHotel, idGradeHotel, namaHotel,
                alamatLengkap, deskripsiHotel, checkinTime, checkoutTime, status, pemasukan);
                hotelControl.insertDataHotel(h);
                System.out.println("asldfjk");
            }else{
                Hotel h = new Hotel(selectedIdHotel, Integer.parseInt(idValueInput.getText()), idJenisHotel, idProvinsiHotel, idGradeHotel, namaHotel,
                alamatLengkap, deskripsiHotel, checkinTime, checkoutTime, status, pemasukan);
                hotelControl.updateDataHotel(h);
            }
            
            
            
            editPendaftaran.setEnabled(false);
            deletePendaftaran.setEnabled(false);
            
            namaHotelInput.setText("");
            namaHotelInput.setEnabled(false);
            
            alamatLengkapInput.setText("");
            alamatLengkapInput.setEnabled(false);
            
            deskripsiHotelInput.setText("");
            deskripsiHotelInput.setEnabled(false);
            
            showCheckinTime.setText("");
            showCheckinTime.setEnabled(false);
            
            showCheckoutTime.setText("");
            showCheckoutTime.setEnabled(false);
            
            jenisHotelDropdown.setSelectedIndex(-1);
            jenisHotelDropdown.setEnabled(false);
            
            gradeHotelDropdown.setSelectedIndex(-1);
            gradeHotelDropdown.setEnabled(false);
            
            lokasiHotelDropdown.setSelectedIndex(-1);
            lokasiHotelDropdown.setEnabled(false);
            addPendaftaran.setEnabled(true);
            showHotelByAdmin();
        }catch(InputKosongException e){
            JOptionPane.showMessageDialog(this, e.message());
        }
    }//GEN-LAST:event_saveHotelBtnActionPerformed

    private void tableSubFasilitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSubFasilitasMouseClicked
        
        setSubFasilitasInput(false);
         setAddEditDeleteSubFasilitas(false);     
         setEditDeleteFasilitas(true);
         
         int clickedSubFasilitas = tableSubFasilitas.getSelectedRow();
         TableModel tableModel = tableSubFasilitas.getModel();
         
         int selectedIdTemaFasilitas = Integer.parseInt(tableModel.getValueAt(clickedSubFasilitas, 1).toString());
         selectedIdSubFasilitas = Integer.parseInt(tableModel.getValueAt(clickedSubFasilitas, 0).toString());
         namaFasilitasInput.setText(tableModel.getValueAt(clickedSubFasilitas, 2).toString());
         
        int index=-1;
        for(TemaFasilitas tema : listTemaFasilitas){
            if(tema.getId() == selectedIdTemaFasilitas){
                index = listTemaFasilitas.indexOf(tema);
            }
        }
        
        temaFasilitasDropdown.setSelectedIndex(index);

    }//GEN-LAST:event_tableSubFasilitasMouseClicked

    private void setTimeCheckinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setTimeCheckinActionPerformed
        timePickerCheckin.showPopup(this, 100, 100);
    }//GEN-LAST:event_setTimeCheckinActionPerformed

    private void setTimeCheckoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setTimeCheckoutActionPerformed
        timePickerCheckout.showPopup(this, 100, 100);
    }//GEN-LAST:event_setTimeCheckoutActionPerformed

    private void alamatLengkapInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alamatLengkapInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alamatLengkapInputActionPerformed

    private void editPendaftaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editPendaftaranActionPerformed

        setInputPendaftaranHotel(true);
        action="ubah";
    }//GEN-LAST:event_editPendaftaranActionPerformed

    private void deletePendaftaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePendaftaranActionPerformed

        if(!namaHotelInput.getText().isEmpty()){
            int getAnswer = JOptionPane.showConfirmDialog(rootPane,"Apakah yakin ingin menghapus data ? ", "Konfirmasi", JOptionPane.YES_NO_OPTION);

            switch(getAnswer){
                case 0:
                try{
                    hotelControl.deleteDataHotel(selectedIdHotel);
                    
                    editPendaftaran.setEnabled(false);
                    deletePendaftaran.setEnabled(false);

                    namaHotelInput.setText("");
                    namaHotelInput.setEnabled(false);

                    alamatLengkapInput.setText("");
                    alamatLengkapInput.setEnabled(false);

                    deskripsiHotelInput.setText("");
                    deskripsiHotelInput.setEnabled(false);

                    showCheckinTime.setText("");
                    showCheckinTime.setEnabled(false);

                    showCheckoutTime.setText("");
                    showCheckoutTime.setEnabled(false);

                    jenisHotelDropdown.setSelectedIndex(-1);
                    jenisHotelDropdown.setEnabled(false);

                    gradeHotelDropdown.setSelectedIndex(-1);
                    gradeHotelDropdown.setEnabled(false);

                    lokasiHotelDropdown.setSelectedIndex(-1);
                    lokasiHotelDropdown.setEnabled(false);
                    addPendaftaran.setEnabled(true);
                    showHotelByAdmin();
                    inisialisasiSubFasilitasTable();
                    
                }catch(Exception e){
                    System.out.println("Error : "+e.getMessage());
                }
                break;
                case 1:
                break;
            }
        }
    }//GEN-LAST:event_deletePendaftaranActionPerformed

    private void addPendaftaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPendaftaranActionPerformed
        setInputPendaftaranHotel(true);
        action="tambah";
    }//GEN-LAST:event_addPendaftaranActionPerformed

    private void filterHotelDropdownMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filterHotelDropdownMouseClicked
        
    }//GEN-LAST:event_filterHotelDropdownMouseClicked

    private void filterHotelDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterHotelDropdownActionPerformed
        if(filterHotelDropdown.getSelectedIndex()==1){
            showHotelByAdmin();
        }else{
            showHotelAll();
        }
    }//GEN-LAST:event_filterHotelDropdownActionPerformed

    public void setEditDeleteFasilitas(boolean value){
        editSubFasilitas.setEnabled(value);
        deleteSubFasilitas.setEnabled(value);
    }
    private void tableHotelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableHotelMouseClicked
        
        int clickedHotel = tableHotel.getSelectedRow();
        TableModel tableModel = tableHotel.getModel();
        
        selectedIdHotel = Integer.parseInt(tableModel.getValueAt(clickedHotel, 1).toString());
        
       
        
        if(hotelControl.checkIdHotelAdmin(selectedIdHotel) != Integer.valueOf(idValueInput.getText())){
            setAddEditDeleteSubFasilitas(false);     
//            setTableFasilitas(false);
            JOptionPane.showMessageDialog(this, "Bukan punya kamu!");
            inisialisasiSubFasilitasTable();
            temaFasilitasDropdown.setSelectedIndex(-1);
            namaFasilitasInput.setText("");
            
            editPendaftaran.setEnabled(false);
            deletePendaftaran.setEnabled(false);
            
            namaHotelInput.setText("");
            alamatLengkapInput.setText("");
            deskripsiHotelInput.setText("");
            showCheckinTime.setText("");
            showCheckoutTime.setText("");
            jenisHotelDropdown.setSelectedIndex(-1);
            gradeHotelDropdown.setSelectedIndex(-1);
            lokasiHotelDropdown.setSelectedIndex(-1);
            
        }else{
            
            List<Hotel> detailHotel = hotelControl.detailHotel(selectedIdHotel);
        
            Hotel h = detailHotel.get(0);
        
            namaHotelInput.setText(h.getNamaHotel());
            alamatLengkapInput.setText(h.getDetailLokasi());
            deskripsiHotelInput.setText(h.getDeskripsi());
            showCheckinTime.setText(h.getCheckinTime());
            showCheckoutTime.setText(h.getCheckoutTime());
        
            int indexJenisHotel=-1;
            for(JenisHotel jenisHotel : listJenisHotel){
                if(jenisHotel.getId() == h.getId_jenis()){
                    indexJenisHotel = listJenisHotel.indexOf(jenisHotel);
                }
            }
        
            jenisHotelDropdown.setSelectedIndex(indexJenisHotel);
            
            int indexLokasi=-1;
            for(Provinsi provinsi : listProvinsi){
                if(provinsi.getId() == h.getId_provinsi()){
                    indexLokasi = listProvinsi.indexOf(provinsi);
                }
            }
        
            lokasiHotelDropdown.setSelectedIndex(indexLokasi);
            
            int indexGrade=-1;
            for(Grade grade : listGrade){
                if(grade.getId() == h.getId_grade()){
                    indexGrade = listGrade.indexOf(grade);
                }
            }
        
            gradeHotelDropdown.setSelectedIndex(indexGrade);
            
            
            setAddEditDeleteSubFasilitas(true);
            setEditDeleteFasilitas(false);
            showSubFasilitasByHotel();
            
            addPendaftaran.setEnabled(false);
            editPendaftaran.setEnabled(true);
            deletePendaftaran.setEnabled(true);
        }
        
    }//GEN-LAST:event_tableHotelMouseClicked

    private void addSubFasillitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSubFasillitasActionPerformed
        setSubFasilitasInput(true);
        actionSubFasilitas = "tambah";
        setSaveCancelFasilitas(true);
    }//GEN-LAST:event_addSubFasillitasActionPerformed

    private void editSubFasilitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editSubFasilitasActionPerformed
        setSubFasilitasInput(true);
        actionSubFasilitas = "ubah";
        setSaveCancelFasilitas(true);
    }//GEN-LAST:event_editSubFasilitasActionPerformed

    private void deleteSubFasilitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteSubFasilitasActionPerformed
        if(!namaFasilitasInput.getText().isEmpty()){
            int getAnswer = JOptionPane.showConfirmDialog(rootPane,"Apakah yakin ingin menghapus data ? ", "Konfirmasi", JOptionPane.YES_NO_OPTION);

            switch(getAnswer){
                case 0:
                try{
                    subFasilitasControl.deleteDataSubFasilitas(selectedIdSubFasilitas);
                    
                    temaFasilitasDropdown.setEnabled(false);   
                    temaFasilitasDropdown.setSelectedIndex(-1);
                    
                    
                    namaFasilitasInput.setEnabled(false);   
                    namaFasilitasInput.setText("");   
                    
                    showSubFasilitasByHotel();
                    
                    setSaveCancelJenisHotel(false);
                    setAddEditDeleteSubFasilitas(false);
                }catch(Exception e){
                    System.out.println("Error : "+e.getMessage());
                }
                break;
                case 1:
                break;
            }
        }        
    }//GEN-LAST:event_deleteSubFasilitasActionPerformed

    public void inputSubFasilitasKosong() throws InputKosongException{
        if(namaFasilitasInput.getText().isEmpty() || temaFasilitasDropdown.getSelectedIndex() == -1){
            throw new InputKosongException();    
        }
        
    }
    private void saveFasilitasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveFasilitasBtnActionPerformed
        try{
            inputSubFasilitasKosong();
            
            String namaFasilitas = namaFasilitasInput.getText();
            int indexTemaFasilitas = temaFasilitasDropdown.getSelectedIndex();
            int idTema = listTemaFasilitas.get(indexTemaFasilitas).getId();
            
            if(actionSubFasilitas.equals("tambah")){
//                public SubFasilitas(int id, int idTema,int id_hotel, String nama) {
                SubFasilitas f = new SubFasilitas(0, idTema, selectedIdHotel, namaFasilitas);
                subFasilitasControl.insertDataSubFasilitas(f);
                
            }else{
                SubFasilitas f = new SubFasilitas(selectedIdSubFasilitas, idTema, selectedIdHotel, namaFasilitas);
                subFasilitasControl.updateDataSubFasilitas(f);
            }
             setSubFasilitasInput(false);
             setAddEditDeleteSubFasilitas(false);
             setSaveCancelFasilitas(false);
             showSubFasilitasByHotel();
        }catch(InputKosongException e){
            JOptionPane.showMessageDialog(this, e.message());
        }
    }//GEN-LAST:event_saveFasilitasBtnActionPerformed

    private void cancelFasilitasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelFasilitasBtnActionPerformed
        setSubFasilitasInput(false);
        setAddEditDeleteSubFasilitas(false);
        setSaveCancelFasilitas(false);
        
        temaFasilitasDropdown.setSelectedIndex(-1);
        namaFasilitasInput.setText("");
        
    }//GEN-LAST:event_cancelFasilitasBtnActionPerformed

    private void RoomPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RoomPanelMouseClicked
    
        int clickedHotel = tableHotel.getSelectedRow();
        TableModel tableModel = tableHotel.getModel();
        String namaHotel;
        if(selectedIdHotel == -1){
            JOptionPane.showMessageDialog(this, "Pilih dulu hotel yang kamu punya!");
        }else{
            selectedIdHotel = Integer.parseInt(tableModel.getValueAt(clickedHotel, 1).toString());
            namaHotel = tableModel.getValueAt(clickedHotel, 2).toString();
            if(hotelControl.checkIdHotelAdmin(selectedIdHotel) != Integer.valueOf(idValueInput.getText())){
                 JOptionPane.showMessageDialog(this, "Pilih dulu hotel yang punya kamu!");
            }else{
                AdminHotelTipeRoom r = new AdminHotelTipeRoom();
                r.setVisible(true);
                r.idHotelValueTipeRoom.setText(""+selectedIdHotel);
                r.namaHotelValueTipeRoom.setText(namaHotel);
                
            }
        }
        
        
    }//GEN-LAST:event_RoomPanelMouseClicked

    private void pemesananPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pemesananPanelMouseClicked
        this.dispose();
        AdminHotelPemesanan a = new AdminHotelPemesanan();
        a.setVisible(true);
        a.idHotelAdminValuePemesanan.setText(idValueInput.getText());
    }//GEN-LAST:event_pemesananPanelMouseClicked

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
    private javax.swing.JPanel RoomPanel;
    private javax.swing.JButton addPendaftaran;
    private javax.swing.JButton addSubFasillitas;
    private javax.swing.JTextField alamatLengkapInput;
    private javax.swing.JButton cancelFasilitasBtn;
    private javax.swing.JButton cancelHotelBtn;
    private javax.swing.JPanel containerPanel;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JPanel contentPanel4;
    private javax.swing.JButton deletePendaftaran;
    private javax.swing.JButton deleteSubFasilitas;
    private javax.swing.JTextField deskripsiHotelInput;
    private javax.swing.JButton editPendaftaran;
    private javax.swing.JButton editSubFasilitas;
    private javax.swing.JPanel fasilitasContentPanel;
    private javax.swing.JComboBox<String> filterHotelDropdown;
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
    private javax.swing.JComboBox<JenisHotel> jenisHotelDropdown;
    private javax.swing.JPanel lecturerPanel;
    private javax.swing.JScrollPane listHotelPanel1;
    private javax.swing.JScrollPane listSubFasilitasPanel;
    private javax.swing.JLabel logo;
    private javax.swing.JComboBox<Provinsi> lokasiHotelDropdown;
    private javax.swing.JLabel mataKuliahLabel;
    private javax.swing.JLabel mataKuliahLabel1;
    private javax.swing.JLabel mataKuliahLabel10;
    private javax.swing.JLabel mataKuliahLabel11;
    private javax.swing.JLabel mataKuliahLabel12;
    private javax.swing.JLabel mataKuliahLabel13;
    private javax.swing.JLabel mataKuliahLabel14;
    private javax.swing.JLabel mataKuliahLabel2;
    private javax.swing.JLabel mataKuliahLabel3;
    private javax.swing.JLabel mataKuliahLabel4;
    private javax.swing.JLabel mataKuliahLabel5;
    private javax.swing.JLabel mataKuliahLabel6;
    private javax.swing.JLabel mataKuliahLabel7;
    private javax.swing.JLabel mataKuliahLabel8;
    private javax.swing.JLabel mataKuliahLabel9;
    private javax.swing.JTextField namaFasilitasInput;
    private javax.swing.JTextField namaHotelInput;
    private javax.swing.JPanel pemesananPanel;
    private javax.swing.ButtonGroup ruangKelasGroup;
    private javax.swing.JButton saveFasilitasBtn;
    private javax.swing.JButton saveHotelBtn;
    private javax.swing.JButton setTimeCheckin;
    private javax.swing.JButton setTimeCheckout;
    private javax.swing.JTextField showCheckinTime;
    private javax.swing.JTextField showCheckoutTime;
    private javax.swing.JPanel sidebarPanel;
    private javax.swing.JTable tableHotel;
    private javax.swing.JTable tableSubFasilitas;
    private javax.swing.JComboBox<TemaFasilitas> temaFasilitasDropdown;
    private com.raven.swing.TimePicker timePickerCheckin;
    private com.raven.swing.TimePicker timePickerCheckout;
    private javax.swing.JLabel titleContent;
    public javax.swing.JLabel userNameValueInput;
    // End of variables declaration//GEN-END:variables
}
