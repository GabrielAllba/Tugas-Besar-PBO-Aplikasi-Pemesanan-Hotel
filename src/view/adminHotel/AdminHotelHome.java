
package view.adminHotel;

import view.admin.*;
import java.awt.Color;
import view.LandingPage;

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
    
    Color panDefault,panClick,panEnter;
    public AdminHotelHome() {
        initComponents();
        panDefault = Color.white;
        panClick = Color.LIGHT_GRAY;
        panEnter = new Color(204,204,204);
        
        menu1.setBackground(panEnter);
        menu2.setBackground(panDefault);
        menu3.setBackground(panDefault);
        logout.setBackground(Color.white);
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

    // Provinsi
    public void showHotelAll(){
        tableHotel.setModel(hotelControl.showHotelAlsoUnverified(""));
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

        timePickerCheckin = new com.raven.swing.TimePicker();
        timePickerCheckout = new com.raven.swing.TimePicker();
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
        userNameValueInput = new javax.swing.JLabel();
        idValueInput = new javax.swing.JLabel();
        idValueInput1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        addPendaftaran = new javax.swing.JButton();
        editPendaftaran = new javax.swing.JButton();
        deletePendaftaran = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        namaHotelInput = new javax.swing.JTextField();
        cancelHotelBtn = new javax.swing.JButton();
        saveHotelBtn = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jenisHotelDropdown = new javax.swing.JComboBox<>();
        lokasiHotelDropdown = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        gradeHotelDropdown = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        showCheckinTime = new javax.swing.JTextField();
        showCheckoutTime = new javax.swing.JTextField();
        setTimeCheckin = new javax.swing.JLabel();
        setTimeCheckout = new javax.swing.JLabel();
        alamatLengkapInput = new javax.swing.JTextField();
        deskripsiHotelInput = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        listHotelPanel1 = new javax.swing.JScrollPane();
        tableHotel = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        filterHotelDropdown = new javax.swing.JComboBox<>();
        jPanel9 = new javax.swing.JPanel();
        jTextField9 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        listSubFasilitasPanel = new javax.swing.JScrollPane();
        tableSubFasilitas = new javax.swing.JTable();
        addSubFasillitas = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        editSubFasilitas = new javax.swing.JButton();
        namaFasilitasInput = new javax.swing.JTextField();
        saveFasilitasBtn = new javax.swing.JButton();
        deleteSubFasilitas = new javax.swing.JButton();
        cancelFasilitasBtn = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        temaFasilitasDropdown = new javax.swing.JComboBox<>();

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

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/bedroom.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(60, 72, 107));
        jLabel5.setText("Room Type");

        javax.swing.GroupLayout menu2Layout = new javax.swing.GroupLayout(menu2);
        menu2.setLayout(menu2Layout);
        menu2Layout.setHorizontalGroup(
            menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addContainerGap(30, Short.MAX_VALUE))
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
        jLabel6.setText("Booking");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/booking.png"))); // NOI18N

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
        jLabel10.setText("ADMIN HOTEL");

        userNameValueInput.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        userNameValueInput.setText("User name ");

        idValueInput.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        idValueInput.setText("ID");

        idValueInput1.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        idValueInput1.setText("-");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 1042, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(460, 460, 460)
                .addComponent(userNameValueInput)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idValueInput1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idValueInput)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameValueInput)
                    .addComponent(idValueInput)
                    .addComponent(idValueInput1))
                .addGap(0, 17, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(60, 72, 107));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Form Pendaftaran Hotel");

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

        addPendaftaran.setBackground(new java.awt.Color(0, 153, 0));
        addPendaftaran.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        addPendaftaran.setForeground(new java.awt.Color(250, 247, 240));
        addPendaftaran.setText("ADD");
        addPendaftaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPendaftaranActionPerformed(evt);
            }
        });

        editPendaftaran.setBackground(new java.awt.Color(236, 168, 30));
        editPendaftaran.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        editPendaftaran.setForeground(new java.awt.Color(250, 247, 240));
        editPendaftaran.setText("EDIT");
        editPendaftaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editPendaftaranActionPerformed(evt);
            }
        });

        deletePendaftaran.setBackground(new java.awt.Color(153, 0, 0));
        deletePendaftaran.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        deletePendaftaran.setForeground(new java.awt.Color(250, 247, 240));
        deletePendaftaran.setText("DELETE");
        deletePendaftaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePendaftaranActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(60, 72, 107));
        jLabel12.setText("Nama Hotel");

        namaHotelInput.setToolTipText("");
        namaHotelInput.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(60, 72, 107)));
        namaHotelInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaHotelInputActionPerformed(evt);
            }
        });

        cancelHotelBtn.setBackground(new java.awt.Color(153, 0, 0));
        cancelHotelBtn.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        cancelHotelBtn.setForeground(new java.awt.Color(250, 247, 240));
        cancelHotelBtn.setText("CANCEL");
        cancelHotelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelHotelBtnActionPerformed(evt);
            }
        });

        saveHotelBtn.setBackground(new java.awt.Color(22, 52, 122));
        saveHotelBtn.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        saveHotelBtn.setForeground(new java.awt.Color(250, 247, 240));
        saveHotelBtn.setText("SAVE");
        saveHotelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveHotelBtnActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(60, 72, 107));
        jLabel19.setText("Jenis Hotel");

        jLabel20.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(60, 72, 107));
        jLabel20.setText("Lokasi Hotel");

        jenisHotelDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jenisHotelDropdownActionPerformed(evt);
            }
        });

        lokasiHotelDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lokasiHotelDropdownActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(60, 72, 107));
        jLabel21.setText("Alamat Lengkap");

        jLabel22.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(60, 72, 107));
        jLabel22.setText("Deskripsi Hotel");

        gradeHotelDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradeHotelDropdownActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(60, 72, 107));
        jLabel23.setText("Grade Hotel");

        jLabel24.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(60, 72, 107));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Check-In");

        jLabel25.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(60, 72, 107));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Check-Out");

        setTimeCheckin.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        setTimeCheckin.setForeground(new java.awt.Color(60, 72, 107));
        setTimeCheckin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        setTimeCheckin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/date.png"))); // NOI18N
        setTimeCheckin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                setTimeCheckinMouseClicked(evt);
            }
        });

        setTimeCheckout.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        setTimeCheckout.setForeground(new java.awt.Color(60, 72, 107));
        setTimeCheckout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        setTimeCheckout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/date.png"))); // NOI18N
        setTimeCheckout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                setTimeCheckoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addComponent(lokasiHotelDropdown, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(alamatLengkapInput, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jenisHotelDropdown, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(gradeHotelDropdown, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(deskripsiHotelInput))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(addPendaftaran, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editPendaftaran, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deletePendaftaran)
                        .addGap(0, 15, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(showCheckinTime)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                                .addGap(3, 3, 3)
                                .addComponent(setTimeCheckin, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(showCheckoutTime, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(setTimeCheckout, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(saveHotelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cancelHotelBtn))
                            .addComponent(namaHotelInput))))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addPendaftaran)
                    .addComponent(editPendaftaran)
                    .addComponent(deletePendaftaran))
                .addGap(24, 24, 24)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGap(4, 4, 4)
                .addComponent(namaHotelInput, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jenisHotelDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lokasiHotelDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alamatLengkapInput, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deskripsiHotelInput, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel23)
                .addGap(11, 11, 11)
                .addComponent(gradeHotelDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(showCheckoutTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(showCheckinTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(setTimeCheckin))
                    .addComponent(setTimeCheckout))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveHotelBtn)
                    .addComponent(cancelHotelBtn))
                .addContainerGap())
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(60, 72, 107));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("LIST HOTEL");

        jTextField4.setBackground(new java.awt.Color(60, 72, 107));
        jTextField4.setText("jTextField1");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        listHotelPanel1.setBorder(null);

        tableHotel.setAutoCreateRowSorter(true);
        tableHotel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        tableHotel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tableHotel.setForeground(new java.awt.Color(60, 72, 107));
        tableHotel.setModel(new javax.swing.table.DefaultTableModel(
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
        tableHotel.setGridColor(new java.awt.Color(255, 255, 255));
        tableHotel.setIntercellSpacing(new java.awt.Dimension(5, 5));
        tableHotel.setRowHeight(25);
        tableHotel.setSelectionBackground(new java.awt.Color(152, 168, 248));
        tableHotel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableHotelMouseClicked(evt);
            }
        });
        listHotelPanel1.setViewportView(tableHotel);
        if (tableHotel.getColumnModel().getColumnCount() > 0) {
            tableHotel.getColumnModel().getColumn(0).setResizable(false);
            tableHotel.getColumnModel().getColumn(1).setResizable(false);
            tableHotel.getColumnModel().getColumn(2).setResizable(false);
            tableHotel.getColumnModel().getColumn(3).setResizable(false);
            tableHotel.getColumnModel().getColumn(3).setPreferredWidth(10);
        }

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(60, 72, 107));
        jLabel14.setText("Sort by :");

        filterHotelDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterHotelDropdownActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                    .addComponent(filterHotelDropdown, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listHotelPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(filterHotelDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(listHotelPanel1)
                .addContainerGap())
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
        jLabel18.setText("Fasilitas Hotel");

        listSubFasilitasPanel.setBorder(null);

        tableSubFasilitas.setAutoCreateRowSorter(true);
        tableSubFasilitas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        tableSubFasilitas.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tableSubFasilitas.setForeground(new java.awt.Color(60, 72, 107));
        tableSubFasilitas.setModel(new javax.swing.table.DefaultTableModel(
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
        tableSubFasilitas.setGridColor(new java.awt.Color(255, 255, 255));
        tableSubFasilitas.setIntercellSpacing(new java.awt.Dimension(5, 5));
        tableSubFasilitas.setRowHeight(25);
        tableSubFasilitas.setSelectionBackground(new java.awt.Color(152, 168, 248));
        tableSubFasilitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableSubFasilitasMouseClicked(evt);
            }
        });
        listSubFasilitasPanel.setViewportView(tableSubFasilitas);
        if (tableSubFasilitas.getColumnModel().getColumnCount() > 0) {
            tableSubFasilitas.getColumnModel().getColumn(0).setResizable(false);
            tableSubFasilitas.getColumnModel().getColumn(1).setResizable(false);
            tableSubFasilitas.getColumnModel().getColumn(2).setResizable(false);
            tableSubFasilitas.getColumnModel().getColumn(3).setResizable(false);
            tableSubFasilitas.getColumnModel().getColumn(3).setPreferredWidth(10);
        }

        addSubFasillitas.setBackground(new java.awt.Color(0, 153, 0));
        addSubFasillitas.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        addSubFasillitas.setForeground(new java.awt.Color(250, 247, 240));
        addSubFasillitas.setText("ADD");
        addSubFasillitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSubFasillitasActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(60, 72, 107));
        jLabel16.setText("Nama Fasilitas");

        jLabel17.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(60, 72, 107));
        jLabel17.setText("Tema Fasilitas");

        editSubFasilitas.setBackground(new java.awt.Color(236, 168, 30));
        editSubFasilitas.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        editSubFasilitas.setForeground(new java.awt.Color(250, 247, 240));
        editSubFasilitas.setText("EDIT");
        editSubFasilitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editSubFasilitasActionPerformed(evt);
            }
        });

        namaFasilitasInput.setToolTipText("");
        namaFasilitasInput.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(60, 72, 107)));
        namaFasilitasInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaFasilitasInputActionPerformed(evt);
            }
        });

        saveFasilitasBtn.setBackground(new java.awt.Color(22, 52, 122));
        saveFasilitasBtn.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        saveFasilitasBtn.setForeground(new java.awt.Color(250, 247, 240));
        saveFasilitasBtn.setText("SAVE");
        saveFasilitasBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveFasilitasBtnActionPerformed(evt);
            }
        });

        deleteSubFasilitas.setBackground(new java.awt.Color(153, 0, 0));
        deleteSubFasilitas.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        deleteSubFasilitas.setForeground(new java.awt.Color(250, 247, 240));
        deleteSubFasilitas.setText("DELETE");
        deleteSubFasilitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteSubFasilitasActionPerformed(evt);
            }
        });

        cancelFasilitasBtn.setBackground(new java.awt.Color(153, 0, 0));
        cancelFasilitasBtn.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        cancelFasilitasBtn.setForeground(new java.awt.Color(250, 247, 240));
        cancelFasilitasBtn.setText("CANCEL");
        cancelFasilitasBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelFasilitasBtnActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 11)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 51, 51));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("[!] Pilih dulu hotel yang merupakan kepemilikan kamu");

        temaFasilitasDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temaFasilitasDropdownActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(addSubFasillitas, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editSubFasilitas, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteSubFasilitas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField9)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listSubFasilitasPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(namaFasilitasInput, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                    .addComponent(temaFasilitasDropdown, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saveFasilitasBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelFasilitasBtn)
                .addGap(67, 67, 67))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel28)
                .addGap(15, 15, 15)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addSubFasillitas)
                    .addComponent(editSubFasilitas)
                    .addComponent(deleteSubFasilitas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(temaFasilitasDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(namaFasilitasInput, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveFasilitasBtn)
                    .addComponent(cancelFasilitasBtn))
                .addGap(18, 18, 18)
                .addComponent(listSubFasilitasPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void inputHotelKosongException() throws InputKosongException{
        if(namaHotelInput.getText().isEmpty() || jenisHotelDropdown.getSelectedIndex() == -1 || lokasiHotelDropdown.getSelectedIndex() == -1 || 
                alamatLengkapInput.getText().isEmpty() || deskripsiHotelInput.getText().isEmpty() || gradeHotelDropdown.getSelectedIndex() == -1 ||
                showCheckinTime.getText().isEmpty() || showCheckoutTime.getText().isEmpty()){
            throw new InputKosongException();
        }
    }
    
    public void setEditDeleteFasilitas(boolean value){
        editSubFasilitas.setEnabled(value);
        deleteSubFasilitas.setEnabled(value);
    }
    public void inputSubFasilitasKosong() throws InputKosongException{
        if(namaFasilitasInput.getText().isEmpty() || temaFasilitasDropdown.getSelectedIndex() == -1){
            throw new InputKosongException();    
        }
    }
    
    private void namaHotelInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaHotelInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaHotelInputActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void cancelHotelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelHotelBtnActionPerformed
        
    }//GEN-LAST:event_cancelHotelBtnActionPerformed

    private void cancelFasilitasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelFasilitasBtnActionPerformed
        setSubFasilitasInput(false);
        setAddEditDeleteSubFasilitas(true);
        setSaveCancelFasilitas(false);
        deletePendaftaran.setEnabled(true);
        temaFasilitasDropdown.setSelectedIndex(-1);
        namaFasilitasInput.setText("");
    }//GEN-LAST:event_cancelFasilitasBtnActionPerformed

    private void namaFasilitasInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaFasilitasInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaFasilitasInputActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void menu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu2MouseClicked
        
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
                r.idHotelAdmin.setText(idValueInput.getText());
                
            }
        }
    }//GEN-LAST:event_menu2MouseClicked

    private void menu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu3MouseClicked
        this.dispose();
        AdminHotelPemesanan a = new AdminHotelPemesanan();
        a.setVisible(true);
        a.idHotelAdminValuePemesanan.setText(idValueInput.getText());
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
        if(namaHotelInput.getText().isEmpty()){
            throw new InputKosongException();
        }
    }
    
    
    private void addPendaftaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPendaftaranActionPerformed
        setInputPendaftaranHotel(true);
        action="tambah";
    }//GEN-LAST:event_addPendaftaranActionPerformed

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
                    addPendaftaran.setEnabled(true);
                }catch(Exception e){
                    System.out.println("Error : "+e.getMessage());
                }
                break;
                case 1:
                break;
            }
        }
    }//GEN-LAST:event_deletePendaftaranActionPerformed

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
            
            saveHotelBtn.setEnabled(false);
            cancelHotelBtn.setEnabled(false);
            
            showHotelAll();
        }catch(InputKosongException e){
            JOptionPane.showMessageDialog(this, e.message());
        }
    }//GEN-LAST:event_saveHotelBtnActionPerformed

    private void tableHotelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableHotelMouseClicked
        int clickedHotel = tableHotel.getSelectedRow();
        TableModel tableModel = tableHotel.getModel();

        selectedIdHotel = Integer.parseInt(tableModel.getValueAt(clickedHotel, 1).toString());

        if(hotelControl.checkIdHotelAdmin(selectedIdHotel) != Integer.valueOf(idValueInput.getText())){
            setAddEditDeleteSubFasilitas(false);
            //            setTableFasilitas(false);
            addPendaftaran.setEnabled(true);
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
            String status = hotelControl.detailHotel(selectedIdHotel).get(0).getStatus();
            if(status.compareToIgnoreCase("declined")==0){
                JOptionPane.showMessageDialog(this, "[!] Hotel di decline, mungkin ada inputan yang belum lengkap");
            }else if(status.compareToIgnoreCase("unverified")==0){
                JOptionPane.showMessageDialog(this, "[!] Hotel masih dalam tahap review ");
            }
            
            addPendaftaran.setEnabled(false);
            editPendaftaran.setEnabled(true);
            deletePendaftaran.setEnabled(true);
        }
    }//GEN-LAST:event_tableHotelMouseClicked

    private void addSubFasillitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSubFasillitasActionPerformed
        setSubFasilitasInput(true);
        actionSubFasilitas = "tambah";
        deletePendaftaran.setEnabled(false);
        setSaveCancelFasilitas(true);
    }//GEN-LAST:event_addSubFasillitasActionPerformed

    private void editSubFasilitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editSubFasilitasActionPerformed
        setSubFasilitasInput(true);
        actionSubFasilitas = "ubah";
        deletePendaftaran.setEnabled(false);
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
                    saveFasilitasBtn.setEnabled(false);
                    cancelFasilitasBtn.setEnabled(false);
                    setAddEditDeleteSubFasilitas(true);
                }catch(Exception e){
                    System.out.println("Error : "+e.getMessage());
                }
                break;
                case 1:
                break;
            }
        }
    }//GEN-LAST:event_deleteSubFasilitasActionPerformed

    private void saveFasilitasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveFasilitasBtnActionPerformed
        try{
            
            deletePendaftaran.setEnabled(true);
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
                setAddEditDeleteSubFasilitas(true);
                setSaveCancelFasilitas(false);
                showSubFasilitasByHotel();
            }catch(InputKosongException e){
                JOptionPane.showMessageDialog(this, e.message());
            }
    }//GEN-LAST:event_saveFasilitasBtnActionPerformed

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

    private void lokasiHotelDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lokasiHotelDropdownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lokasiHotelDropdownActionPerformed

    private void setTimeCheckinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setTimeCheckinMouseClicked
        timePickerCheckin.showPopup(this, 100, 100);
    }//GEN-LAST:event_setTimeCheckinMouseClicked

    private void setTimeCheckoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setTimeCheckoutMouseClicked
        timePickerCheckout.showPopup(this, 100, 100);
    }//GEN-LAST:event_setTimeCheckoutMouseClicked

    private void filterHotelDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterHotelDropdownActionPerformed
        if(filterHotelDropdown.getSelectedIndex()==1){
            showHotelByAdmin();
        }else{
            showHotelAll();
        }
    }//GEN-LAST:event_filterHotelDropdownActionPerformed

    private void jenisHotelDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jenisHotelDropdownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jenisHotelDropdownActionPerformed

    private void gradeHotelDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradeHotelDropdownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gradeHotelDropdownActionPerformed

    private void temaFasilitasDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temaFasilitasDropdownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_temaFasilitasDropdownActionPerformed

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
    private javax.swing.JButton addSubFasillitas;
    private javax.swing.JTextField alamatLengkapInput;
    private javax.swing.JButton cancelFasilitasBtn;
    private javax.swing.JButton cancelHotelBtn;
    private javax.swing.JButton deletePendaftaran;
    private javax.swing.JButton deleteSubFasilitas;
    private javax.swing.JTextField deskripsiHotelInput;
    private javax.swing.JButton editPendaftaran;
    private javax.swing.JButton editSubFasilitas;
    private javax.swing.JComboBox<String> filterHotelDropdown;
    private javax.swing.JComboBox<Grade> gradeHotelDropdown;
    public javax.swing.JLabel idValueInput;
    public javax.swing.JLabel idValueInput1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JComboBox<JenisHotel> jenisHotelDropdown;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JScrollPane listHotelPanel1;
    private javax.swing.JScrollPane listSubFasilitasPanel;
    private javax.swing.JPanel logout;
    private javax.swing.JComboBox<Provinsi> lokasiHotelDropdown;
    private javax.swing.JPanel menu1;
    private javax.swing.JPanel menu2;
    private javax.swing.JPanel menu3;
    private javax.swing.JTextField namaFasilitasInput;
    private javax.swing.JTextField namaHotelInput;
    private javax.swing.JButton saveFasilitasBtn;
    private javax.swing.JButton saveHotelBtn;
    private javax.swing.JLabel setTimeCheckin;
    private javax.swing.JLabel setTimeCheckout;
    private javax.swing.JTextField showCheckinTime;
    private javax.swing.JTextField showCheckoutTime;
    private javax.swing.JTable tableHotel;
    private javax.swing.JTable tableSubFasilitas;
    private javax.swing.JComboBox<TemaFasilitas> temaFasilitasDropdown;
    private com.raven.swing.TimePicker timePickerCheckin;
    private com.raven.swing.TimePicker timePickerCheckout;
    public javax.swing.JLabel userNameValueInput;
    // End of variables declaration//GEN-END:variables
}
