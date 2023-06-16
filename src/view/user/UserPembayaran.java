
package view.user;

import view.admin.*;
import java.awt.Color;
import view.LandingPage;
import exception.InputKosongException;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import controller.ProvinsiControll;
import controller.GradeControll;
import controller.JenisHotelControll;
import model.Provinsi;
import exception.InputKosongException;
import controller.ProvinsiControll;
import controller.GradeControll;
import controller.HotelControll;
import controller.SubFasilitasControl;
import controller.TipeRoomControll;
import java.util.List;
import javax.swing.table.TableModel;
import java.sql.Date;
import controller.PemesananControll;
import controller.UserControll;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import model.Pemesanan;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

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
    
    Color panDefault,panClick,panEnter;
    public UserPembayaran() {
        initComponents();
        panDefault = Color.white;
        panClick = Color.LIGHT_GRAY;
        panEnter = new Color(204,204,204);
        
        menu1.setBackground(panEnter);
        menu2.setBackground(panDefault);
        menu3.setBackground(panDefault);
        logout.setBackground(Color.white);
        
        showHotelAll();
       setDetailInputVisibility(false);
       
       
       lihatTipeKamarBtn.setEnabled(false);
       tableTipeRoomPembayaran.setEnabled(false);
       
       setDetailInput(false);
       pesanButton.setEnabled(false);
       
       
       
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
                
                Calendar c = Calendar.getInstance();
                c.setTime(selectedDate);
                c.add(java.util.Calendar.DAY_OF_YEAR, 1);
                
                java.util.Date nextDay = c.getTime();
                
                dateChooseCheckout.getJCalendar().setMinSelectableDate(nextDay); 
                dateChooseCheckin.setEnabled(false);

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
                    totalMenginap.setText(""+daysCounter+" malam");
                    
                    lihatTipeKamarBtn.setEnabled(true);
                    dateChooseCheckout.setEnabled(false);
                  
            }  
           
            
        });
    }

   public void setDetailInput(boolean value){
        namaLengkapInput.setEnabled(value);
        noHandphoneInput.setEnabled(value);
        emailInput.setEnabled(value);
        totalMenginap.setEnabled(value);
        biayaMenginap.setEnabled(value);
        pesanButton.setEnabled(value);
        
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

        jToggleButton1 = new javax.swing.JToggleButton();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        menu2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        menu3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        logout = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        menu1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        namaHotelPembayaran = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableTemaAndFasilitas = new javax.swing.JTable();
        idHotelValuePembayaran = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lokasiInput = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        deskripsiInput = new javax.swing.JTextArea();
        jLabel23 = new javax.swing.JLabel();
        checkinInput = new javax.swing.JTextField();
        checkoutTime = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        gradeInput = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableTipeRoomPembayaran = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        dateChooseCheckin = new com.toedter.calendar.JDateChooser();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        dateChooseCheckout = new com.toedter.calendar.JDateChooser();
        lihatTipeKamarBtn = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jTextField9 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        namaLengkapInput = new javax.swing.JTextField();
        noHandphoneInput = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        tanggalCheckinValue = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        emailInput = new javax.swing.JTextField();
        totalMenginap = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        biayaMenginap = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        pesanButton = new javax.swing.JButton();
        tanggalCheckoutValue = new javax.swing.JLabel();
        idUserValuePembayaran = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setkEndColor(new java.awt.Color(240, 240, 240));
        kGradientPanel1.setkStartColor(new java.awt.Color(240, 240, 240));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/ST (3).png"))); // NOI18N

        jTextField2.setBackground(new java.awt.Color(60, 72, 107));

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

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/home.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(60, 72, 107));
        jLabel5.setText("Home");

        javax.swing.GroupLayout menu2Layout = new javax.swing.GroupLayout(menu2);
        menu2.setLayout(menu2Layout);
        menu2Layout.setHorizontalGroup(
            menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/log-out.png"))); // NOI18N

        jLabel28.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(60, 72, 107));
        jLabel28.setText("Logout");

        javax.swing.GroupLayout logoutLayout = new javax.swing.GroupLayout(logout);
        logout.setLayout(logoutLayout);
        logoutLayout.setHorizontalGroup(
            logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logoutLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        logoutLayout.setVerticalGroup(
            logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoutLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menu1.setBackground(new java.awt.Color(255, 255, 255));
        menu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menu1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menu1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menu1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                menu1MouseReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(60, 72, 107));
        jLabel8.setText("Payment");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/payment.png"))); // NOI18N

        javax.swing.GroupLayout menu1Layout = new javax.swing.GroupLayout(menu1);
        menu1.setLayout(menu1Layout);
        menu1Layout.setHorizontalGroup(
            menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menu1Layout.setVerticalGroup(
            menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
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
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addComponent(menu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(logout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(menu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(menu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(menu3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGap(0, 699, Short.MAX_VALUE)
                    .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Microsoft YaHei", 1, 40)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(60, 72, 107));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Pembayaran Hotel");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        jPanel7.setForeground(new java.awt.Color(255, 255, 255));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(60, 72, 107));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Detail Pemesanan Hotel");

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

        jTextField1.setBackground(new java.awt.Color(60, 72, 107));
        jTextField1.setText("jTextField1");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(60, 72, 107));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("ID Hotel : ");

        namaHotelPembayaran.setToolTipText("");
        namaHotelPembayaran.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(60, 72, 107)));
        namaHotelPembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaHotelPembayaranActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(null);

        tableTemaAndFasilitas.setAutoCreateRowSorter(true);
        tableTemaAndFasilitas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        tableTemaAndFasilitas.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tableTemaAndFasilitas.setForeground(new java.awt.Color(60, 72, 107));
        tableTemaAndFasilitas.setModel(new javax.swing.table.DefaultTableModel(
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
        tableTemaAndFasilitas.setGridColor(new java.awt.Color(255, 255, 255));
        tableTemaAndFasilitas.setIntercellSpacing(new java.awt.Dimension(5, 5));
        tableTemaAndFasilitas.setRowHeight(25);
        tableTemaAndFasilitas.setSelectionBackground(new java.awt.Color(152, 168, 248));
        tableTemaAndFasilitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableTemaAndFasilitasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableTemaAndFasilitas);
        if (tableTemaAndFasilitas.getColumnModel().getColumnCount() > 0) {
            tableTemaAndFasilitas.getColumnModel().getColumn(0).setResizable(false);
            tableTemaAndFasilitas.getColumnModel().getColumn(1).setResizable(false);
            tableTemaAndFasilitas.getColumnModel().getColumn(2).setResizable(false);
            tableTemaAndFasilitas.getColumnModel().getColumn(3).setResizable(false);
            tableTemaAndFasilitas.getColumnModel().getColumn(3).setPreferredWidth(10);
        }

        idHotelValuePembayaran.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        idHotelValuePembayaran.setForeground(new java.awt.Color(60, 72, 107));
        idHotelValuePembayaran.setText("i");

        jLabel20.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(60, 72, 107));
        jLabel20.setText("Nama Hotel");

        lokasiInput.setForeground(new java.awt.Color(255, 255, 255));
        lokasiInput.setToolTipText("");
        lokasiInput.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(60, 72, 107)));
        lokasiInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lokasiInputActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(60, 72, 107));
        jLabel21.setText("Lokasi");

        jLabel22.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(60, 72, 107));
        jLabel22.setText("Deskripsi");

        deskripsiInput.setColumns(20);
        deskripsiInput.setRows(5);
        jScrollPane4.setViewportView(deskripsiInput);

        jLabel23.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(60, 72, 107));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Check-In");

        checkinInput.setForeground(new java.awt.Color(255, 255, 255));

        checkoutTime.setForeground(new java.awt.Color(255, 255, 255));
        checkoutTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutTimeActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(60, 72, 107));
        jLabel24.setText("Fasilitas");

        jLabel25.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(60, 72, 107));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Check-Out");

        jLabel31.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(60, 72, 107));
        jLabel31.setText("Grade");

        gradeInput.setForeground(new java.awt.Color(255, 255, 255));
        gradeInput.setToolTipText("");
        gradeInput.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(60, 72, 107)));
        gradeInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradeInputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING)
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
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lokasiInput, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idHotelValuePembayaran, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(checkinInput)
                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(checkoutTime)
                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))
                        .addContainerGap())
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane4)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(namaHotelPembayaran, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(gradeInput, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(jLabel20)
                            .addComponent(jLabel31))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(idHotelValuePembayaran))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(namaHotelPembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gradeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel21)
                .addGap(4, 4, 4)
                .addComponent(lokasiInput, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkinInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkoutTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setForeground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(60, 72, 107));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Input Data Kamar");

        jTextField4.setBackground(new java.awt.Color(60, 72, 107));
        jTextField4.setText("jTextField1");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jScrollPane2.setBorder(null);

        tableTipeRoomPembayaran.setAutoCreateRowSorter(true);
        tableTipeRoomPembayaran.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        tableTipeRoomPembayaran.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tableTipeRoomPembayaran.setForeground(new java.awt.Color(60, 72, 107));
        tableTipeRoomPembayaran.setModel(new javax.swing.table.DefaultTableModel(
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
        tableTipeRoomPembayaran.setGridColor(new java.awt.Color(255, 255, 255));
        tableTipeRoomPembayaran.setIntercellSpacing(new java.awt.Dimension(5, 5));
        tableTipeRoomPembayaran.setRowHeight(25);
        tableTipeRoomPembayaran.setSelectionBackground(new java.awt.Color(152, 168, 248));
        tableTipeRoomPembayaran.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableTipeRoomPembayaranMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableTipeRoomPembayaran);
        if (tableTipeRoomPembayaran.getColumnModel().getColumnCount() > 0) {
            tableTipeRoomPembayaran.getColumnModel().getColumn(0).setResizable(false);
            tableTipeRoomPembayaran.getColumnModel().getColumn(1).setResizable(false);
            tableTipeRoomPembayaran.getColumnModel().getColumn(2).setResizable(false);
            tableTipeRoomPembayaran.getColumnModel().getColumn(3).setResizable(false);
            tableTipeRoomPembayaran.getColumnModel().getColumn(3).setPreferredWidth(10);
        }

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(60, 72, 107));
        jLabel15.setText("Tanggal Check-In");

        jLabel26.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(60, 72, 107));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Pilih Tipe Kamar");

        jLabel27.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(60, 72, 107));
        jLabel27.setText("Tanggal Check-Out");

        lihatTipeKamarBtn.setBackground(new java.awt.Color(60, 72, 107));
        lihatTipeKamarBtn.setFont(new java.awt.Font("Yu Gothic UI Light", 3, 12)); // NOI18N
        lihatTipeKamarBtn.setForeground(new java.awt.Color(255, 255, 255));
        lihatTipeKamarBtn.setText("Click Untuk MemilihTipe Kamar");
        lihatTipeKamarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lihatTipeKamarBtnActionPerformed(evt);
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
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dateChooseCheckin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dateChooseCheckout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lihatTipeKamarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dateChooseCheckin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dateChooseCheckout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lihatTipeKamarBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setForeground(new java.awt.Color(255, 255, 255));

        jTextField9.setBackground(new java.awt.Color(60, 72, 107));
        jTextField9.setText("jTextField1");
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(60, 72, 107));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Input Data Pembeli");

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(60, 72, 107));
        jLabel16.setText("No. Handphone");

        jLabel17.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(60, 72, 107));
        jLabel17.setText("Nama Lengkap");

        namaLengkapInput.setToolTipText("");
        namaLengkapInput.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(60, 72, 107)));
        namaLengkapInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaLengkapInputActionPerformed(evt);
            }
        });

        noHandphoneInput.setToolTipText("");
        noHandphoneInput.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(60, 72, 107)));
        noHandphoneInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noHandphoneInputActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(60, 72, 107));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("ID User: ");

        tanggalCheckinValue.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        tanggalCheckinValue.setForeground(new java.awt.Color(250, 247, 240));
        tanggalCheckinValue.setText("i");

        jLabel29.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(60, 72, 107));
        jLabel29.setText("Email");

        emailInput.setToolTipText("");
        emailInput.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(60, 72, 107)));
        emailInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailInputActionPerformed(evt);
            }
        });

        totalMenginap.setForeground(new java.awt.Color(255, 255, 255));
        totalMenginap.setToolTipText("");
        totalMenginap.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(60, 72, 107)));
        totalMenginap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalMenginapActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(60, 72, 107));
        jLabel30.setText("Total Menginap");

        biayaMenginap.setForeground(new java.awt.Color(255, 255, 255));
        biayaMenginap.setToolTipText("");
        biayaMenginap.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(60, 72, 107)));
        biayaMenginap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                biayaMenginapActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(60, 72, 107));
        jLabel32.setText("Biaya Menginap");

        pesanButton.setBackground(new java.awt.Color(22, 52, 122));
        pesanButton.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        pesanButton.setForeground(new java.awt.Color(255, 255, 255));
        pesanButton.setText("Pesan");
        pesanButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pesanButtonMouseClicked(evt);
            }
        });
        pesanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesanButtonActionPerformed(evt);
            }
        });

        tanggalCheckoutValue.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        tanggalCheckoutValue.setForeground(new java.awt.Color(250, 247, 240));
        tanggalCheckoutValue.setText("i");

        idUserValuePembayaran.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        idUserValuePembayaran.setForeground(new java.awt.Color(60, 72, 107));
        idUserValuePembayaran.setText("i");

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
                            .addComponent(namaLengkapInput, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(noHandphoneInput, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idUserValuePembayaran, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(emailInput, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(totalMenginap, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(biayaMenginap, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(tanggalCheckinValue, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tanggalCheckoutValue, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(pesanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 75, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(idUserValuePembayaran))
                .addGap(23, 23, 23)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(namaLengkapInput, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noHandphoneInput, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailInput, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalMenginap, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(biayaMenginap, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(pesanButton)
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tanggalCheckoutValue)
                    .addComponent(tanggalCheckinValue))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addGap(28, 28, 28)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setDetailInputVisibility(boolean value){
       
        deskripsiInput.setEnabled(value);
        gradeInput.setEnabled(value);
        lokasiInput.setEnabled(value);
        checkinInput.setEnabled(value);
        checkoutTime.setEnabled(value);
    }
    
    
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void namaHotelPembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaHotelPembayaranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaHotelPembayaranActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void noHandphoneInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noHandphoneInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noHandphoneInputActionPerformed

    private void namaLengkapInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaLengkapInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaLengkapInputActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void menu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu2MouseClicked
        this.dispose();
        UserHome a = new UserHome();
        a.setVisible(true);
        a.idUserHomeValue.setText(idUserValuePembayaran.getText());
        String nama = userControl.getNamaUser(Integer.valueOf(idUserValuePembayaran.getText()));
        a.welcomeText.setText("Selamat Datang Kak "+nama+", Segera temukan Hotel Impianmu :) ");
    }//GEN-LAST:event_menu2MouseClicked

    private void menu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu3MouseClicked
        this.dispose();
        UserPemesanan a = new UserPemesanan();
        a.setVisible(true);
        a.idUserInputInPemesananUser.setText(idUserValuePembayaran.getText());
        a.usernameInput.setText(userControl.getNamaUser(Integer.valueOf(idUserValuePembayaran.getText())));
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

    public void InputDataPemesanException() throws InputKosongException{
        if(namaLengkapInput.getText().isEmpty() || noHandphoneInput.getText().isEmpty() || emailInput.getText().isEmpty()){
            throw new InputKosongException();
        }
    }
    public void checkTanggalKosong() throws InputKosongException{
        if(tanggalCheckinValue.getText().isEmpty() || tanggalCheckoutValue.getText().isEmpty()){
            throw new InputKosongException();
        }
    }
    
    private void tableTemaAndFasilitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableTemaAndFasilitasMouseClicked
        
    }//GEN-LAST:event_tableTemaAndFasilitasMouseClicked

    private void tableTipeRoomPembayaranMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableTipeRoomPembayaranMouseClicked
        try{
            checkTanggalKosong();
            setDetailInput(true);
            int clickedTipeRoom = tableTipeRoomPembayaran.getSelectedRow();
            TableModel tableModel = tableTipeRoomPembayaran.getModel();
         
         
            selectedIdTipeRoom = Integer.parseInt(tableModel.getValueAt(clickedTipeRoom, 0).toString());
            String selectedNamaTipe = tableModel.getValueAt(clickedTipeRoom, 1).toString();
            String selectedKapasitas = tableModel.getValueAt(clickedTipeRoom,2).toString();
            String selectedHarga = tableModel.getValueAt(clickedTipeRoom,3).toString();
            
            System.out.println(selectedNamaTipe);
            System.out.println(selectedHarga);
            setDetailInput(true);
            pesanButton.setEnabled(true);
            totalMenginap.setEnabled(false);
            BigInteger pembayaran = BigInteger.valueOf(Long.valueOf(tableModel.getValueAt(clickedTipeRoom, 3).toString())).multiply(BigInteger.valueOf(daysCounter));
            biayaMenginap.setText("Rp. "+pembayaran);
            biayaMenginap.setEnabled(false);
        }catch(InputKosongException e){
            JOptionPane.showMessageDialog(this, "Set dulu tanggal checkin dan checkout!");
        }catch(Exception e){};
    
    }//GEN-LAST:event_tableTipeRoomPembayaranMouseClicked

    private void lokasiInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lokasiInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lokasiInputActionPerformed

    private void checkoutTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkoutTimeActionPerformed

    private void emailInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailInputActionPerformed
       
    }//GEN-LAST:event_emailInputActionPerformed

    private void totalMenginapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalMenginapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalMenginapActionPerformed

    private void gradeInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradeInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gradeInputActionPerformed

    private void biayaMenginapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_biayaMenginapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_biayaMenginapActionPerformed

    private void lihatTipeKamarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lihatTipeKamarBtnActionPerformed
        try{
            checkTanggalKosong();
            showSubFasilitasByHotel();
            tableTipeRoomPembayaran.setEnabled(true);
        }catch(InputKosongException e){
            JOptionPane.showMessageDialog(this, "Set dulu tanggal checkin dan checkout!");
        }catch(Exception e){};
    }//GEN-LAST:event_lihatTipeKamarBtnActionPerformed

    
    private void inputDetailKosong() throws InputKosongException{
        if(namaLengkapInput.getText().isEmpty() || noHandphoneInput.getText().isEmpty() || emailInput.getText().isEmpty()){
            throw new InputKosongException();
        }
    }
    
    private void pesanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesanButtonActionPerformed
        try{
            inputDetailKosong();
            String checkinTanggal = cinDate, checkoutTanggal = coutDate;
            int idHotel = Integer.valueOf(idHotelValuePembayaran.getText());
            int idTipeRoom = selectedIdTipeRoom;
            
            List<Pemesanan> listPesanan = pemesananControl.showPemesananByIdHotelAndTipeRoom(idHotel, idTipeRoom);
            
            LocalDate startDate = LocalDate.parse(checkinTanggal);
            LocalDate endDate = LocalDate.parse(checkoutTanggal);
            LocalDate currentDate = startDate;
            
            boolean canOrder = false;
            
            long totalDays = ChronoUnit.DAYS.between(startDate, endDate);
            

            
            
            while (!currentDate.isAfter(endDate)) {
                if(pemesananControl.countPemesananBetween(currentDate.toString(), listPesanan, totalDays) >= tipeRoomControl.getKapasitasById(idTipeRoom)){
                    canOrder = false;
                    break;
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
            
                saldo = userControl.getSaldo(Integer.valueOf(tanggalCheckinValue.getText()));


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
                    Pemesanan p = new Pemesanan(0, Integer.valueOf(tanggalCheckinValue.getText()), Integer.valueOf(idHotelValuePembayaran.getText()),
                       selectedIdTipeRoom, cinDate, coutDate ,namaLengkap, noHandphone, email, pembayaran);
                    System.out.println("-----------------------");
                    pemesananControl.insertDataPemesanan(p);
                    JOptionPane.showMessageDialog(this, "Total bayar = Rp."+pembayaran);
                    userControl.updateSaldo(Integer.valueOf(tanggalCheckinValue.getText()),saldo, pembayaran, "kurang");
                }
            }else{
                JOptionPane.showMessageDialog(this, "Tidak Bisa pesan");
            }
            
            
        }catch(InputKosongException e){
            JOptionPane.showMessageDialog(this, "Data pemesan harus lengkap!");
        }catch(Exception e){}
    }//GEN-LAST:event_pesanButtonActionPerformed

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

    private void pesanButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pesanButtonMouseClicked
        
        
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
            
            long totalDays = ChronoUnit.DAYS.between(startDate, endDate);
            
            boolean canOrder = false;
            
            while (!currentDate.isAfter(endDate)) {
                if(pemesananControl.countPemesananBetween(currentDate.toString(), listPesanan, totalDays) == tipeRoomControl.getKapasitasById(idTipeRoom)){
                    canOrder = false;
                    break;
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
    }//GEN-LAST:event_pesanButtonMouseClicked

    private void menu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_menu1MouseClicked

    private void menu1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_menu1MouseEntered

    private void menu1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_menu1MouseExited

    private void menu1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_menu1MousePressed

    private void menu1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_menu1MouseReleased

    
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
    private javax.swing.JTextField biayaMenginap;
    public javax.swing.JTextField checkinInput;
    public javax.swing.JTextField checkoutTime;
    private com.toedter.calendar.JDateChooser dateChooseCheckin;
    private com.toedter.calendar.JDateChooser dateChooseCheckout;
    public javax.swing.JTextArea deskripsiInput;
    private javax.swing.JTextField emailInput;
    public javax.swing.JTextField gradeInput;
    public javax.swing.JLabel idHotelValuePembayaran;
    public javax.swing.JLabel idUserValuePembayaran;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JToggleButton jToggleButton1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JButton lihatTipeKamarBtn;
    private javax.swing.JPanel logout;
    public javax.swing.JTextField lokasiInput;
    private javax.swing.JPanel menu1;
    private javax.swing.JPanel menu2;
    private javax.swing.JPanel menu3;
    public javax.swing.JTextField namaHotelPembayaran;
    private javax.swing.JTextField namaLengkapInput;
    private javax.swing.JTextField noHandphoneInput;
    private javax.swing.JButton pesanButton;
    public javax.swing.JTable tableTemaAndFasilitas;
    private javax.swing.JTable tableTipeRoomPembayaran;
    private javax.swing.JLabel tanggalCheckinValue;
    private javax.swing.JLabel tanggalCheckoutValue;
    private javax.swing.JTextField totalMenginap;
    // End of variables declaration//GEN-END:variables
}
