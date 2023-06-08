package view.user;



import exception.InputKosongException;
import controller.ProvinsiControll;
import controller.GradeControll;
import controller.HotelControll;
import controller.JenisHotelControll;
import controller.SubFasilitasControl;
import controller.TipeRoomControll;
import java.util.List;
import javax.swing.table.TableModel;
import model.Hotel;
import model.JenisHotel;
import java.sql.Date;

import controller.PemesananControll;
import controller.UserControll;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.ZoneId;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import model.Pemesanan;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class UserPembayaran extends javax.swing.JFrame {
    
    HotelControll hotelControl = new HotelControll();
    GradeControll gradeControl = new GradeControll();
    ProvinsiControll lokasiControl = new ProvinsiControll();
    SubFasilitasControl subFasilitasControl = new SubFasilitasControl();
    TipeRoomControll tipeRoomControl = new TipeRoomControll();
    PemesananControll pemesananControl = new PemesananControll();
    UserControll userControl = new UserControll();
    
    int selectedIdTipeRoom = 0;
    String action=null;
    int selectedId = 0;
    
    String actionGrade=null;
    int selectedGradeId=0;
    
    String actionJenisHotel=null;
    int selectedJenisHotelId=0;
    
    int selectedIdHotel = 0;
    String cinDate = null;
    String coutDate =null;
    
    long daysCounter = 0;
    
   
    
    public UserPembayaran() {
       initComponents();
       showHotelAll();
       setDetailInputVisibility(false);
       
       dateChooseCheckout.setEnabled(false);
       
       dateChooseCheckin.getDateEditor().addPropertyChangeListener(e -> {
            if ("date".equals(e.getPropertyName())) {
                java.util.Date selectedDate = dateChooseCheckin.getDate();
                Date date = new Date(selectedDate.getTime());
                
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");
                String formattedDate = dateFormat.format(selectedDate);
                
                System.out.println("formatted date : "+formattedDate);
                System.out.println("sql            : "+date);
                cinDate = date.toString();
                tanggalCheckinValue.setText(formattedDate);
                dateChooseCheckout.setEnabled(true);
                dateChooseCheckout.getJCalendar().setMinSelectableDate(date); 

            }
        });
       
       
       
       dateChooseCheckout.getDateEditor().addPropertyChangeListener(e -> {
           
               if ("date".equals(e.getPropertyName())) {
                   java.util.Date selectedDate = dateChooseCheckout.getDate();
                   Date date = new Date(selectedDate.getTime());
                   
                   SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");
                   String formattedDate = dateFormat.format(selectedDate);
                
                    System.out.println("formatted date : "+formattedDate);
                    System.out.println("sql            : "+date);
                    coutDate = date.toString();
                    tanggalCheckoutValue.setText(formattedDate);
                
                    LocalDate startDate = LocalDate.parse(cinDate);
                    LocalDate endDate = LocalDate.parse(coutDate);
                
                    daysCounter = ChronoUnit.DAYS.between(startDate, endDate);
                    daysCount.setText(""+daysCounter+" malam");
                  
            }  
           
            
        });
    }
    
     public void showHotelAll(){
//        tableHotel.setModel(hotelControl.showHotel(""));
     }
    
    public void showSubFasilitasByHotel(){
        tableTipeRoomPembayaran.setModel(tipeRoomControl.showTipeRoomByHotel(Integer.valueOf(idHotelValuePembayaran.getText())));
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
        coursePanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        containerPanel = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        headerPanel = new javax.swing.JPanel();
        titleContent = new javax.swing.JLabel();
        contentPanel2 = new javax.swing.JPanel();
        mataKuliahLabel5 = new javax.swing.JLabel();
        mataKuliahLabel6 = new javax.swing.JLabel();
        gradeInput = new javax.swing.JTextField();
        mataKuliahLabel7 = new javax.swing.JLabel();
        lokasiInput = new javax.swing.JTextField();
        mataKuliahLabel8 = new javax.swing.JLabel();
        mataKuliahLabel11 = new javax.swing.JLabel();
        mataKuliahLabel13 = new javax.swing.JLabel();
        checkinInput = new javax.swing.JTextField();
        checkoutTime = new javax.swing.JTextField();
        mataKuliahLabel15 = new javax.swing.JLabel();
        mataKuliahLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        deskripsiInput = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tableTemaAndFasilitas = new javax.swing.JTable();
        mataKuliahLabel9 = new javax.swing.JLabel();
        idHotelValuePembayaran = new javax.swing.JLabel();
        namaHotelPembayaran = new javax.swing.JLabel();
        headerPanel2 = new javax.swing.JPanel();
        mataKuliahLabel3 = new javax.swing.JLabel();
        emailInput = new javax.swing.JTextField();
        mataKuliahLabel10 = new javax.swing.JLabel();
        noHandphoneInput = new javax.swing.JTextField();
        mataKuliahLabel12 = new javax.swing.JLabel();
        namaLengkapInput = new javax.swing.JTextField();
        mataKuliahLabel16 = new javax.swing.JLabel();
        pesanButton = new javax.swing.JButton();
        mataKuliahLabel18 = new javax.swing.JLabel();
        idUserValuePembayaran = new javax.swing.JLabel();
        mataKuliahLabel19 = new javax.swing.JLabel();
        daysCount = new javax.swing.JLabel();
        totalBiaya = new javax.swing.JLabel();
        headerPanel3 = new javax.swing.JPanel();
        mataKuliahLabel4 = new javax.swing.JLabel();
        dateChooseCheckin = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        mataKuliahLabel2 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tableTipeRoomPembayaran = new javax.swing.JTable();
        dateChooseCheckout = new com.toedter.calendar.JDateChooser();
        mataKuliahLabel17 = new javax.swing.JLabel();
        tanggalCheckinValue = new javax.swing.JLabel();
        tanggalCheckoutValue = new javax.swing.JLabel();

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

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Pemesanan");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, coursePanel1Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(41, 41, 41))
        );

        coursePanel.setBackground(new java.awt.Color(153, 153, 153));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Profile");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, coursePanelLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(27, 27, 27))
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
        titleContent.setText("Pembayaran User");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleContent, javax.swing.GroupLayout.DEFAULT_SIZE, 933, Short.MAX_VALUE)
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(titleContent)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        contentPanel2.setBackground(new java.awt.Color(255, 255, 255));
        contentPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.lightGray));

        mataKuliahLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mataKuliahLabel5.setText("Nama Hotel : ");

        mataKuliahLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mataKuliahLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mataKuliahLabel6.setText("Detail Hotel");

        gradeInput.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N

        mataKuliahLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mataKuliahLabel7.setText("Grade");

        lokasiInput.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N

        mataKuliahLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mataKuliahLabel8.setText("Lokasi");

        mataKuliahLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mataKuliahLabel11.setText("Deskripsi");

        mataKuliahLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mataKuliahLabel13.setText("Fasilitas");

        checkinInput.setEditable(false);
        checkinInput.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N

        checkoutTime.setEditable(false);
        checkoutTime.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N

        mataKuliahLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mataKuliahLabel15.setText("Checkout time");

        mataKuliahLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mataKuliahLabel14.setText("Checkin time");

        deskripsiInput.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        deskripsiInput.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jScrollPane1.setViewportView(deskripsiInput);

        jScrollPane6.setBackground(new java.awt.Color(255, 255, 255));

        tableTemaAndFasilitas.setAutoCreateRowSorter(true);
        tableTemaAndFasilitas.setModel(new javax.swing.table.DefaultTableModel(
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
        tableTemaAndFasilitas.setDoubleBuffered(true);
        tableTemaAndFasilitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableTemaAndFasilitasMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tableTemaAndFasilitas);
        tableTemaAndFasilitas.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        mataKuliahLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mataKuliahLabel9.setText("ID Hotel : ");

        idHotelValuePembayaran.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        namaHotelPembayaran.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout contentPanel2Layout = new javax.swing.GroupLayout(contentPanel2);
        contentPanel2.setLayout(contentPanel2Layout);
        contentPanel2Layout.setHorizontalGroup(
            contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanel2Layout.createSequentialGroup()
                .addGroup(contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mataKuliahLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(contentPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(contentPanel2Layout.createSequentialGroup()
                                .addComponent(mataKuliahLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(namaHotelPembayaran))
                            .addComponent(mataKuliahLabel7)
                            .addComponent(mataKuliahLabel8)
                            .addComponent(mataKuliahLabel11)
                            .addComponent(mataKuliahLabel13)
                            .addGroup(contentPanel2Layout.createSequentialGroup()
                                .addComponent(checkinInput, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(checkoutTime, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(contentPanel2Layout.createSequentialGroup()
                                .addComponent(mataKuliahLabel14)
                                .addGap(26, 26, 26)
                                .addComponent(mataKuliahLabel15))
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                            .addGroup(contentPanel2Layout.createSequentialGroup()
                                .addComponent(mataKuliahLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(idHotelValuePembayaran))
                            .addComponent(jScrollPane1)
                            .addComponent(gradeInput)
                            .addComponent(lokasiInput))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contentPanel2Layout.setVerticalGroup(
            contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mataKuliahLabel6)
                .addGap(18, 18, 18)
                .addGroup(contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mataKuliahLabel9)
                    .addComponent(idHotelValuePembayaran))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mataKuliahLabel5)
                    .addComponent(namaHotelPembayaran))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mataKuliahLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gradeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mataKuliahLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lokasiInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mataKuliahLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mataKuliahLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mataKuliahLabel14)
                    .addComponent(mataKuliahLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkoutTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkinInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
        );

        headerPanel2.setBackground(new java.awt.Color(255, 255, 255));
        headerPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.lightGray));

        mataKuliahLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mataKuliahLabel3.setText("Data pemesan");

        emailInput.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N

        mataKuliahLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mataKuliahLabel10.setText("Email");

        noHandphoneInput.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N

        mataKuliahLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mataKuliahLabel12.setText("No handphone");

        namaLengkapInput.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N

        mataKuliahLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mataKuliahLabel16.setText("Nama Lengkap");

        pesanButton.setText("Pesan");
        pesanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesanButtonActionPerformed(evt);
            }
        });

        mataKuliahLabel18.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        mataKuliahLabel18.setText("ID User : ");

        idUserValuePembayaran.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        mataKuliahLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mataKuliahLabel19.setText("Kamu menginap selama : ");

        daysCount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        totalBiaya.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout headerPanel2Layout = new javax.swing.GroupLayout(headerPanel2);
        headerPanel2.setLayout(headerPanel2Layout);
        headerPanel2Layout.setHorizontalGroup(
            headerPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(headerPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mataKuliahLabel3)
                    .addComponent(mataKuliahLabel16)
                    .addComponent(mataKuliahLabel12)
                    .addComponent(mataKuliahLabel10)
                    .addComponent(noHandphoneInput, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(namaLengkapInput)
                    .addComponent(emailInput))
                .addGap(28, 28, 28))
            .addGroup(headerPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerPanel2Layout.createSequentialGroup()
                        .addComponent(mataKuliahLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(idUserValuePembayaran))
                    .addGroup(headerPanel2Layout.createSequentialGroup()
                        .addComponent(mataKuliahLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(daysCount, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(headerPanel2Layout.createSequentialGroup()
                        .addComponent(pesanButton)
                        .addGap(20, 20, 20)
                        .addComponent(totalBiaya, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerPanel2Layout.setVerticalGroup(
            headerPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(headerPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mataKuliahLabel18)
                    .addComponent(idUserValuePembayaran))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mataKuliahLabel3)
                .addGap(18, 18, 18)
                .addComponent(mataKuliahLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(namaLengkapInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mataKuliahLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noHandphoneInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mataKuliahLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(emailInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(headerPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mataKuliahLabel19)
                    .addComponent(daysCount))
                .addGap(17, 17, 17)
                .addComponent(pesanButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalBiaya)
                .addContainerGap(193, Short.MAX_VALUE))
        );

        headerPanel3.setBackground(new java.awt.Color(255, 255, 255));
        headerPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.lightGray));

        mataKuliahLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mataKuliahLabel4.setText("Tanggal Checkin");

        jButton1.setText("Lihat Tipe Kamar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        mataKuliahLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mataKuliahLabel2.setText("Pilih tipe kamar");

        jScrollPane7.setBackground(new java.awt.Color(255, 255, 255));

        tableTipeRoomPembayaran.setAutoCreateRowSorter(true);
        tableTipeRoomPembayaran.setModel(new javax.swing.table.DefaultTableModel(
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
        tableTipeRoomPembayaran.setDoubleBuffered(true);
        tableTipeRoomPembayaran.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableTipeRoomPembayaranMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tableTipeRoomPembayaran);
        tableTipeRoomPembayaran.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        mataKuliahLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mataKuliahLabel17.setText("Tanggal Checkout");

        tanggalCheckinValue.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        tanggalCheckoutValue.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout headerPanel3Layout = new javax.swing.GroupLayout(headerPanel3);
        headerPanel3.setLayout(headerPanel3Layout);
        headerPanel3Layout.setHorizontalGroup(
            headerPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mataKuliahLabel4)
                .addGap(178, 178, 178))
            .addGroup(headerPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(headerPanel3Layout.createSequentialGroup()
                        .addGroup(headerPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mataKuliahLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateChooseCheckin, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateChooseCheckout, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mataKuliahLabel17)
                            .addComponent(tanggalCheckinValue)
                            .addComponent(tanggalCheckoutValue))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        headerPanel3Layout.setVerticalGroup(
            headerPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mataKuliahLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dateChooseCheckin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(tanggalCheckinValue)
                .addGap(18, 18, 18)
                .addComponent(mataKuliahLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dateChooseCheckout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tanggalCheckoutValue)
                .addGap(32, 32, 32)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(mataKuliahLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );

        jLayeredPane1.setLayer(headerPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(contentPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(headerPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(headerPanel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(contentPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(headerPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(headerPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(headerPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contentPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(headerPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(230, 230, 230))
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
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(124, Short.MAX_VALUE))
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
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 793, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
   
    
    
    
    private void lecturerPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lecturerPanelMouseClicked

    }//GEN-LAST:event_lecturerPanelMouseClicked

    
    public void setDetailInputVisibility(boolean value){
       
        deskripsiInput.setEnabled(value);
        gradeInput.setEnabled(value);
        lokasiInput.setEnabled(value);
        checkinInput.setEnabled(value);
        checkoutTime.setEnabled(value);
    }
    
    private void tableTemaAndFasilitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableTemaAndFasilitasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tableTemaAndFasilitasMouseClicked

    
    
    private void tableTipeRoomPembayaranMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableTipeRoomPembayaranMouseClicked
         try{
            checkTanggalKosong();
             System.out.println("hello there");
            int clickedTipeRoom = tableTipeRoomPembayaran.getSelectedRow();
            TableModel tableModel = tableTipeRoomPembayaran.getModel();
         
         
            selectedIdTipeRoom = Integer.parseInt(tableModel.getValueAt(clickedTipeRoom, 0).toString());
            String selectedNamaTipe = tableModel.getValueAt(clickedTipeRoom, 1).toString();
            String selectedKapasitas = tableModel.getValueAt(clickedTipeRoom,2).toString();
            String selectedHarga = tableModel.getValueAt(clickedTipeRoom,3).toString();
            
            System.out.println(selectedNamaTipe);
            System.out.println(selectedHarga);
        
        }catch(InputKosongException e){
            JOptionPane.showMessageDialog(this, "Set dulu tanggal checkin dan checkout!");
        }catch(Exception e){};
    }//GEN-LAST:event_tableTipeRoomPembayaranMouseClicked

    public void checkTanggalKosong() throws InputKosongException{
        if(tanggalCheckinValue.getText().isEmpty() || tanggalCheckoutValue.getText().isEmpty()){
            throw new InputKosongException();
        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            checkTanggalKosong();
            showSubFasilitasByHotel();
        
        }catch(InputKosongException e){
            JOptionPane.showMessageDialog(this, "Set dulu tanggal checkin dan checkout!");
        }catch(Exception e){};
        
    }//GEN-LAST:event_jButton1ActionPerformed

    public void InputDataPemesanException() throws InputKosongException{
        if(namaLengkapInput.getText().isEmpty() || noHandphoneInput.getText().isEmpty() || emailInput.getText().isEmpty()){
            throw new InputKosongException();
        }
    }
    private void pesanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesanButtonActionPerformed
        try{
            String checkinTanggal = cinDate, checkoutTanggal = coutDate;
            int idHotel = Integer.valueOf(idHotelValuePembayaran.getText());
            int idTipeRoom = selectedIdTipeRoom;
            
            List<Pemesanan> listPesanan = pemesananControl.showPemesananByIdHotelAndTipeRoom(idHotel, idTipeRoom);
            System.out.println("riel riel riel");
            for(Pemesanan n : listPesanan){
                System.out.println(n.getTanggalCheckin() + " - "+n.getTanggalCheckout());
            }
            
            LocalDate startDate = LocalDate.parse(checkinTanggal);
            LocalDate endDate = LocalDate.parse(checkoutTanggal);

        
            LocalDate currentDate = startDate;
            
            boolean canOrder = false;
            
            while (!currentDate.isAfter(endDate)) {
                if(pemesananControl.countPemesananBetween(currentDate.toString(), listPesanan) == tipeRoomControl.getKapasitasById(idTipeRoom)){
                    canOrder = false;
                }else{
                    if(currentDate.isEqual(endDate)){
                        canOrder = true;
                    }
                }
                currentDate = currentDate.plusDays(1);
            }
            System.out.println("Can order : "+canOrder);
            
            if(canOrder == true){
                BigInteger saldo = BigInteger.valueOf(0);
            
                saldo = userControl.getSaldo(Integer.valueOf(idUserValuePembayaran.getText()));


                checkTanggalKosong();

                String namaLengkap = namaLengkapInput.getText();
                String noHandphone = noHandphoneInput.getText();
                String email = emailInput.getText();

                TableModel tableModel = tableTipeRoomPembayaran.getModel();
                int clicked = tableTipeRoomPembayaran.getSelectedRow();


                BigInteger pembayaran = BigInteger.valueOf(Long.valueOf(tableModel.getValueAt(clicked, 3).toString())).multiply(BigInteger.valueOf(daysCounter));


                if(saldo.compareTo(pembayaran) < 0){
                    JOptionPane.showMessageDialog(this, "Saldo anda "+saldo+"! Kurang Rp. "+pembayaran.subtract(saldo));
                }else{
                    Pemesanan p = new Pemesanan(0, Integer.valueOf(idUserValuePembayaran.getText()), Integer.valueOf(idHotelValuePembayaran.getText()),
                       selectedIdTipeRoom, cinDate, coutDate ,namaLengkap, noHandphone, email, pembayaran);
                    System.out.println("-----------------------");
                    pemesananControl.insertDataPemesanan(p);
                    JOptionPane.showMessageDialog(this, "Total bayar = Rp."+pembayaran);
                    userControl.updateSaldo(Integer.valueOf(idUserValuePembayaran.getText()),saldo, pembayaran, "kurang");  
                }
            }else{
                JOptionPane.showMessageDialog(this, "Tidak Bisa pesan");
            }
            
            
        }catch(InputKosongException e){
            JOptionPane.showMessageDialog(this, "Data pemesan harus lengkap!");
        }catch(Exception e){}
    }//GEN-LAST:event_pesanButtonActionPerformed

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
            java.util.logging.Logger.getLogger(UserPembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserPembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserPembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserPembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new UserPembayaran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField checkinInput;
    public javax.swing.JTextField checkoutTime;
    private javax.swing.JPanel containerPanel;
    private javax.swing.JPanel contentPanel2;
    private javax.swing.JPanel coursePanel;
    private javax.swing.JPanel coursePanel1;
    private com.toedter.calendar.JDateChooser dateChooseCheckin;
    private com.toedter.calendar.JDateChooser dateChooseCheckout;
    private javax.swing.JLabel daysCount;
    public javax.swing.JLabel deskripsiInput;
    private javax.swing.JTextField emailInput;
    public javax.swing.JTextField gradeInput;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JPanel headerPanel2;
    private javax.swing.JPanel headerPanel3;
    public javax.swing.JLabel idHotelValuePembayaran;
    public javax.swing.JLabel idUserValuePembayaran;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JPanel lecturerPanel;
    private javax.swing.JLabel logo;
    public javax.swing.JTextField lokasiInput;
    private javax.swing.JLabel mataKuliahLabel10;
    private javax.swing.JLabel mataKuliahLabel11;
    private javax.swing.JLabel mataKuliahLabel12;
    private javax.swing.JLabel mataKuliahLabel13;
    private javax.swing.JLabel mataKuliahLabel14;
    private javax.swing.JLabel mataKuliahLabel15;
    private javax.swing.JLabel mataKuliahLabel16;
    private javax.swing.JLabel mataKuliahLabel17;
    private javax.swing.JLabel mataKuliahLabel18;
    private javax.swing.JLabel mataKuliahLabel19;
    private javax.swing.JLabel mataKuliahLabel2;
    private javax.swing.JLabel mataKuliahLabel3;
    private javax.swing.JLabel mataKuliahLabel4;
    private javax.swing.JLabel mataKuliahLabel5;
    private javax.swing.JLabel mataKuliahLabel6;
    private javax.swing.JLabel mataKuliahLabel7;
    private javax.swing.JLabel mataKuliahLabel8;
    private javax.swing.JLabel mataKuliahLabel9;
    public javax.swing.JLabel namaHotelPembayaran;
    private javax.swing.JTextField namaLengkapInput;
    private javax.swing.JTextField noHandphoneInput;
    private javax.swing.JButton pesanButton;
    private javax.swing.ButtonGroup ruangKelasGroup;
    private javax.swing.JPanel sidebarPanel;
    public javax.swing.JTable tableTemaAndFasilitas;
    private javax.swing.JTable tableTipeRoomPembayaran;
    private javax.swing.JLabel tanggalCheckinValue;
    private javax.swing.JLabel tanggalCheckoutValue;
    private javax.swing.JLabel titleContent;
    private javax.swing.JLabel totalBiaya;
    // End of variables declaration//GEN-END:variables
}
