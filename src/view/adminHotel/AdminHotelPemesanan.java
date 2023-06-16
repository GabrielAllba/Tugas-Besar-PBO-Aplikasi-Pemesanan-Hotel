
package view.adminHotel;

import view.admin.*;
import java.awt.Color;
import view.LandingPage;
import java.util.ArrayList;
import java.util.List;
import model.Hotel;
import table.TableHotel;
import java.awt.Color;
import java.awt.Font;
import controller.HotelControll;
import controller.PemesananControll;
import controller.AdminHotelControl;
import java.util.ArrayList;
import java.util.List;
import javax.swing.SwingUtilities;
import javax.swing.table.TableModel;
import model.Pemesanan;
import table.TableListPemesanan;
import table.TableListPemesananUserInAdmin;

public class AdminHotelPemesanan extends javax.swing.JFrame {

    HotelControll hotelControl = new HotelControll();
    PemesananControll pemesananControl = new PemesananControll();
    AdminHotelControl adminHotelControl = new AdminHotelControl();
    int selectedIdHotel = 0;
    int selectedIdPemesanan = 0;
    Color panDefault,panClick,panEnter;
    public AdminHotelPemesanan() {
        initComponents();
        
        panDefault = Color.white;
        panClick = Color.LIGHT_GRAY;
        panEnter = new Color(204,204,204);
        
        menu1.setBackground(panDefault);
//        menu2.setBackground(panDefault);
        menu3.setBackground(panEnter);
        logout.setBackground(Color.white);
        inisialisasiHotelTable();
        namaShow.setEnabled(false);
        emailShow.setEnabled(false);
        noHandphoneShow.setEnabled(false);
        inShow.setEnabled(false);
        outShow.setEnabled(false);
        jenisKamarShow.setEnabled(false);
        pembayaranShow.setEnabled(false);
        
        tableHotelInPemesanan.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,12));
        tableHotelInPemesanan.getTableHeader().setOpaque(false);
        tableHotelInPemesanan.getTableHeader().setBackground(new Color(152, 168, 248));
        tableHotelInPemesanan.getTableHeader().setForeground(new Color(255,255,255));
        tableHotelInPemesanan.setRowHeight(25);
        tableListPemesanan.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,12));
        tableListPemesanan.getTableHeader().setOpaque(false);
        tableListPemesanan.getTableHeader().setBackground(new Color(152, 168, 248));
        tableListPemesanan.getTableHeader().setForeground(new Color(255,255,255));
        tableListPemesanan.setRowHeight(25);
        SearchText.setEnabled(false);
    }
    
    public void inisialisasiHotelTable(){
        
        List<Hotel> data = new ArrayList<Hotel>();
        TableHotel t = new TableHotel(data);
        tableHotelInPemesanan.setModel(t);
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
        menu3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        logout = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableHotelInPemesanan = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        totalPendapatanInput = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        tampilHotel = new javax.swing.JButton();
        LabelPilihHotel1 = new javax.swing.JLabel();
        idHotelAdminValuePemesanan = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableListPemesanan = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        SearchText = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        namaShow = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        emailShow = new javax.swing.JTextField();
        noHandphoneShow = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        inShow = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        outShow = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jenisKamarShow = new javax.swing.JTextField();
        pembayaranShow = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setkEndColor(new java.awt.Color(240, 240, 240));
        kGradientPanel1.setkStartColor(new java.awt.Color(240, 240, 240));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/ST (3).png"))); // NOI18N

        jTextField2.setBackground(new java.awt.Color(60, 72, 107));

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
                .addContainerGap(35, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menu3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Microsoft YaHei", 1, 40)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(60, 72, 107));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("DETAIL PEMESANAN");

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

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane4.setBorder(null);

        tableHotelInPemesanan.setAutoCreateRowSorter(true);
        tableHotelInPemesanan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        tableHotelInPemesanan.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tableHotelInPemesanan.setForeground(new java.awt.Color(60, 72, 107));
        tableHotelInPemesanan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "", "", "", ""
            }
        ));
        tableHotelInPemesanan.setGridColor(new java.awt.Color(255, 255, 255));
        tableHotelInPemesanan.setIntercellSpacing(new java.awt.Dimension(5, 5));
        tableHotelInPemesanan.setRowHeight(25);
        tableHotelInPemesanan.setSelectionBackground(new java.awt.Color(152, 168, 248));
        tableHotelInPemesanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableHotelInPemesananMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tableHotelInPemesanan);
        if (tableHotelInPemesanan.getColumnModel().getColumnCount() > 0) {
            tableHotelInPemesanan.getColumnModel().getColumn(0).setResizable(false);
            tableHotelInPemesanan.getColumnModel().getColumn(1).setResizable(false);
            tableHotelInPemesanan.getColumnModel().getColumn(2).setResizable(false);
            tableHotelInPemesanan.getColumnModel().getColumn(3).setResizable(false);
            tableHotelInPemesanan.getColumnModel().getColumn(3).setPreferredWidth(10);
        }

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(60, 72, 107));
        jLabel11.setText("Total Pendapatan : ");

        totalPendapatanInput.setForeground(new java.awt.Color(60, 72, 107));
        totalPendapatanInput.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        totalPendapatanInput.setDisabledTextColor(new java.awt.Color(60, 72, 107));
        totalPendapatanInput.setEnabled(false);
        totalPendapatanInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalPendapatanInputActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Yu Gothic UI", 1, 36)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(60, 72, 107));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Total Sales");

        tampilHotel.setBackground(new java.awt.Color(60, 72, 107));
        tampilHotel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 2, 14)); // NOI18N
        tampilHotel.setForeground(new java.awt.Color(250, 247, 240));
        tampilHotel.setText("Click to Show Hotel ");
        tampilHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tampilHotelActionPerformed(evt);
            }
        });

        LabelPilihHotel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        LabelPilihHotel1.setForeground(new java.awt.Color(60, 72, 107));
        LabelPilihHotel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabelPilihHotel1.setText("ID Hotel Admin : ");

        idHotelAdminValuePemesanan.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        idHotelAdminValuePemesanan.setText("afasdf");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalPendapatanInput))
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                    .addComponent(tampilHotel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelPilihHotel1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idHotelAdminValuePemesanan, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelPilihHotel1)
                    .addComponent(idHotelAdminValuePemesanan))
                .addGap(18, 18, 18)
                .addComponent(tampilHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(totalPendapatanInput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel19.setFont(new java.awt.Font("Yu Gothic UI", 1, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(60, 72, 107));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Data Pemesanan");

        jTextField5.setBackground(new java.awt.Color(60, 72, 107));
        jTextField5.setText("jTextField1");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(null);

        tableListPemesanan.setAutoCreateRowSorter(true);
        tableListPemesanan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        tableListPemesanan.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tableListPemesanan.setForeground(new java.awt.Color(60, 72, 107));
        tableListPemesanan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "", "", "", ""
            }
        ));
        tableListPemesanan.setGridColor(new java.awt.Color(255, 255, 255));
        tableListPemesanan.setIntercellSpacing(new java.awt.Dimension(5, 5));
        tableListPemesanan.setRowHeight(25);
        tableListPemesanan.setSelectionBackground(new java.awt.Color(152, 168, 248));
        tableListPemesanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableListPemesananMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableListPemesanan);
        if (tableListPemesanan.getColumnModel().getColumnCount() > 0) {
            tableListPemesanan.getColumnModel().getColumn(0).setResizable(false);
            tableListPemesanan.getColumnModel().getColumn(1).setResizable(false);
            tableListPemesanan.getColumnModel().getColumn(2).setResizable(false);
            tableListPemesanan.getColumnModel().getColumn(3).setResizable(false);
            tableListPemesanan.getColumnModel().getColumn(3).setPreferredWidth(10);
        }

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/search.png"))); // NOI18N

        SearchText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchTextActionPerformed(evt);
            }
        });
        SearchText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SearchTextKeyTyped(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(60, 72, 107));
        jLabel12.setText("Nama Lengkap");

        namaShow.setForeground(new java.awt.Color(60, 72, 107));
        namaShow.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        namaShow.setDisabledTextColor(new java.awt.Color(60, 72, 107));
        namaShow.setEnabled(false);
        namaShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaShowActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(60, 72, 107));
        jLabel15.setText("Email");

        emailShow.setForeground(new java.awt.Color(60, 72, 107));
        emailShow.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        emailShow.setDisabledTextColor(new java.awt.Color(60, 72, 107));
        emailShow.setEnabled(false);
        emailShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailShowActionPerformed(evt);
            }
        });

        noHandphoneShow.setForeground(new java.awt.Color(60, 72, 107));
        noHandphoneShow.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        noHandphoneShow.setDisabledTextColor(new java.awt.Color(60, 72, 107));
        noHandphoneShow.setEnabled(false);

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(60, 72, 107));
        jLabel16.setText("No. Handphone");

        inShow.setForeground(new java.awt.Color(60, 72, 107));

        jLabel17.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(60, 72, 107));
        jLabel17.setText("Check-In");

        outShow.setForeground(new java.awt.Color(60, 72, 107));
        outShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outShowActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(60, 72, 107));
        jLabel18.setText("Check-Out");

        jLabel21.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(60, 72, 107));
        jLabel21.setText("Jenis Kamar");

        jenisKamarShow.setForeground(new java.awt.Color(60, 72, 107));
        jenisKamarShow.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jenisKamarShow.setDisabledTextColor(new java.awt.Color(60, 72, 107));
        jenisKamarShow.setDoubleBuffered(true);
        jenisKamarShow.setDragEnabled(true);
        jenisKamarShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jenisKamarShowActionPerformed(evt);
            }
        });

        pembayaranShow.setForeground(new java.awt.Color(60, 72, 107));
        pembayaranShow.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        pembayaranShow.setDisabledTextColor(new java.awt.Color(60, 72, 107));
        pembayaranShow.setEnabled(false);

        jLabel22.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(60, 72, 107));
        jLabel22.setText("Total Pembayaran");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField5)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(SearchText, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(emailShow)
                            .addComponent(jLabel12)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(namaShow)
                            .addComponent(noHandphoneShow, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel21)
                            .addComponent(jenisKamarShow)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(inShow, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                .addComponent(outShow, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel18)
                                .addGap(39, 39, 39))
                            .addComponent(jLabel22)
                            .addComponent(pembayaranShow))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchText, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(namaShow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emailShow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(noHandphoneShow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jenisKamarShow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inShow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(outShow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pembayaranShow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void showHotel(){
//        tableTipeRoomPembayaran.setModel(tipeRoomControl.showTipeRoomByHotel(Integer.valueOf(idHotelValuePembayaran.getText())));
       tableHotelInPemesanan.setModel(hotelControl.showHotelByHotelAdmin(Integer.valueOf(idHotelAdminValuePemesanan.getText())));
    }
    
    private void menu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu3MouseClicked
        
    }//GEN-LAST:event_menu3MouseClicked

    private void menu3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu3MouseEntered
        
    }//GEN-LAST:event_menu3MouseEntered

    private void menu3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu3MouseExited
        
    }//GEN-LAST:event_menu3MouseExited

    private void menu3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu3MousePressed
        
    }//GEN-LAST:event_menu3MousePressed

    private void menu3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu3MouseReleased
        
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

    
    private void menu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu1MouseClicked
        this.dispose();
        AdminHotelHome a = new AdminHotelHome();
        a.setVisible(true);
        
        a.idValueInput.setText(idHotelAdminValuePemesanan.getText());
        a.userNameValueInput.setText(adminHotelControl.getUsername(Integer.valueOf(idHotelAdminValuePemesanan.getText())));
    }//GEN-LAST:event_menu1MouseClicked

    private void menu1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu1MouseEntered
        menu1.setBackground(panEnter);
    }//GEN-LAST:event_menu1MouseEntered

    private void menu1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu1MouseExited
        menu1.setBackground(panDefault);
    }//GEN-LAST:event_menu1MouseExited

    private void menu1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu1MousePressed
        menu1.setBackground(panClick);
    }//GEN-LAST:event_menu1MousePressed

    private void menu1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu1MouseReleased
        menu1.setBackground(panDefault);
    }//GEN-LAST:event_menu1MouseReleased

    private void clearDetail(){
        namaShow.setText("");
        emailShow.setText("");
        noHandphoneShow.setText("");
        jenisKamarShow.setText("");
        inShow.setText("");
        outShow.setText("");
        pembayaranShow.setText("");
    }
    
    private void tableListPemesananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableListPemesananMouseClicked
        int clickedHotel = tableListPemesanan.getSelectedRow();
        TableModel tableModel = tableListPemesanan.getModel();
        
        selectedIdPemesanan = Integer.parseInt(tableModel.getValueAt(clickedHotel, 0).toString());
        
        namaShow.setText(pemesananControl.detailPemesanan(selectedIdPemesanan).get(0).getNamaLengkap());
        noHandphoneShow.setText(pemesananControl.detailPemesanan(selectedIdPemesanan).get(0).getNoHandphone());
        emailShow.setText(pemesananControl.detailPemesanan(selectedIdPemesanan).get(0).getEmail());
        jenisKamarShow.setText(tableModel.getValueAt(clickedHotel, 3).toString());
        inShow.setText(pemesananControl.detailPemesanan(selectedIdPemesanan).get(0).getTanggalCheckin());
        outShow.setText(pemesananControl.detailPemesanan(selectedIdPemesanan).get(0).getTanggalCheckout());
        pembayaranShow.setText("Rp. "+String.valueOf(pemesananControl.detailPemesanan(selectedIdPemesanan).get(0).getPembayaran()));
    }//GEN-LAST:event_tableListPemesananMouseClicked

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void tableHotelInPemesananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableHotelInPemesananMouseClicked
        
        int clickedHotel = tableHotelInPemesanan.getSelectedRow();
        TableModel tableModel = tableHotelInPemesanan.getModel();
        selectedIdHotel = Integer.parseInt(tableModel.getValueAt(clickedHotel, 1).toString());
        totalPendapatanInput.setText("Rp. "+pemesananControl.countPendapatanByIdHotel(selectedIdHotel));
        tableListPemesanan.setModel(pemesananControl.showPemesananByIdHotel(selectedIdHotel));
        clearDetail();
        SearchText.setEnabled(true);
        
    }//GEN-LAST:event_tableHotelInPemesananMouseClicked

    private void outShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outShowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outShowActionPerformed

    private void namaShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaShowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaShowActionPerformed

    private void totalPendapatanInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalPendapatanInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalPendapatanInputActionPerformed

    private void tampilHotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tampilHotelActionPerformed
        showHotel();
    }//GEN-LAST:event_tampilHotelActionPerformed

    private void jenisKamarShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jenisKamarShowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jenisKamarShowActionPerformed

    private void emailShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailShowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailShowActionPerformed

    private void SearchTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchTextKeyTyped
        SwingUtilities.invokeLater(() -> {
            List<Pemesanan> a = pemesananControl.search(selectedIdHotel, SearchText.getText());
            if(!a.isEmpty()){
                TableListPemesanan tt = new TableListPemesanan(a);
                tableListPemesanan.setModel(tt);
            }else{
                List<Pemesanan> data = new ArrayList<Pemesanan>();
                TableListPemesanan tt = new TableListPemesanan(a);
                tableListPemesanan.setModel(tt);
            }
        });
    }//GEN-LAST:event_SearchTextKeyTyped

    private void SearchTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchTextActionPerformed

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
            java.util.logging.Logger.getLogger(AdminHotelPemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminHotelPemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminHotelPemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminHotelPemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new AdminHotelPemesanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelPilihHotel1;
    private javax.swing.JTextField SearchText;
    private javax.swing.JTextField emailShow;
    public javax.swing.JLabel idHotelAdminValuePemesanan;
    private javax.swing.JTextField inShow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField jenisKamarShow;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JPanel logout;
    private javax.swing.JPanel menu1;
    private javax.swing.JPanel menu3;
    private javax.swing.JTextField namaShow;
    private javax.swing.JTextField noHandphoneShow;
    private javax.swing.JTextField outShow;
    private javax.swing.JTextField pembayaranShow;
    private javax.swing.JTable tableHotelInPemesanan;
    private javax.swing.JTable tableListPemesanan;
    private javax.swing.JButton tampilHotel;
    private javax.swing.JTextField totalPendapatanInput;
    // End of variables declaration//GEN-END:variables
}
