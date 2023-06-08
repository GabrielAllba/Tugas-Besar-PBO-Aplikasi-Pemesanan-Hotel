package view.user;



import exception.InputKosongException;
import controller.ProvinsiControll;
import controller.GradeControll;
import controller.HotelControll;
import controller.JenisHotelControll;
import controller.SubFasilitasControl;
import controller.UserControll;
import java.util.List;
import javax.swing.table.TableModel;
import model.Hotel;


public class UserHome extends javax.swing.JFrame {
    
    HotelControll hotelControl = new HotelControll();
    GradeControll gradeControl = new GradeControll();
    ProvinsiControll lokasiControl = new ProvinsiControll();
    SubFasilitasControl subFasilitasControl = new SubFasilitasControl();
    UserControll userControl = new UserControll();
    
    String action=null;
    int selectedId = 0;
    
    String actionGrade=null;
    int selectedGradeId=0;
    
    String actionJenisHotel=null;
    int selectedJenisHotelId=0;
    
    int selectedIdHotel = 0;
    
    public UserHome() {
       initComponents();
       showHotelAll();
       
       setDetailInputVisibility(false);
    }
    
     public void showHotelAll(){
        tableHotel.setModel(hotelControl.showHotel(""));
     }
     
     public void showTemaAndFasilitas(){
        tableTemaAndFasilitas.setModel(subFasilitasControl.showTemaAndFasilitas(selectedIdHotel));
    }
    
    
    
    
    
  
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ruangKelasGroup = new javax.swing.ButtonGroup();
        sidebarPanel = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        lecturerPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pemesananUserPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        coursePanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        containerPanel = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        headerPanel = new javax.swing.JPanel();
        titleContent = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        idUserHomeValue = new javax.swing.JLabel();
        contentPanel2 = new javax.swing.JPanel();
        namaHotelInput = new javax.swing.JTextField();
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
        contentPanel3 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tableHotel = new javax.swing.JTable();
        mataKuliahLabel9 = new javax.swing.JLabel();
        pesanButton = new javax.swing.JButton();

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

        pemesananUserPanel.setBackground(new java.awt.Color(153, 153, 153));
        pemesananUserPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pemesananUserPanelMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Pemesanan");

        javax.swing.GroupLayout pemesananUserPanelLayout = new javax.swing.GroupLayout(pemesananUserPanel);
        pemesananUserPanel.setLayout(pemesananUserPanelLayout);
        pemesananUserPanelLayout.setHorizontalGroup(
            pemesananUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pemesananUserPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                .addContainerGap())
        );
        pemesananUserPanelLayout.setVerticalGroup(
            pemesananUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pemesananUserPanelLayout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(41, 41, 41))
        );

        coursePanel.setBackground(new java.awt.Color(153, 153, 153));
        coursePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                coursePanelMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Profile");

        javax.swing.GroupLayout coursePanelLayout = new javax.swing.GroupLayout(coursePanel);
        coursePanel.setLayout(coursePanelLayout);
        coursePanelLayout.setHorizontalGroup(
            coursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coursePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
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
            .addComponent(pemesananUserPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(pemesananUserPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        titleContent.setText("Homepage User");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("ID User : ");

        idUserHomeValue.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        idUserHomeValue.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addComponent(titleContent, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 137, Short.MAX_VALUE))
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idUserHomeValue, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(titleContent)
                .addGap(18, 18, 18)
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(idUserHomeValue))
                .addGap(7, 7, 7))
        );

        contentPanel2.setBackground(new java.awt.Color(255, 255, 255));
        contentPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.lightGray));

        namaHotelInput.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N

        mataKuliahLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mataKuliahLabel5.setText("Nama Hotel");

        mataKuliahLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
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

        javax.swing.GroupLayout contentPanel2Layout = new javax.swing.GroupLayout(contentPanel2);
        contentPanel2.setLayout(contentPanel2Layout);
        contentPanel2Layout.setHorizontalGroup(
            contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanel2Layout.createSequentialGroup()
                .addGroup(contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mataKuliahLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(contentPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(mataKuliahLabel5)
                                .addComponent(mataKuliahLabel7)
                                .addComponent(mataKuliahLabel8)
                                .addComponent(mataKuliahLabel11)
                                .addComponent(jScrollPane1)
                                .addComponent(namaHotelInput, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                                .addComponent(gradeInput)
                                .addComponent(lokasiInput))
                            .addComponent(mataKuliahLabel13)
                            .addGroup(contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, contentPanel2Layout.createSequentialGroup()
                                    .addComponent(checkinInput, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(checkoutTime, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, contentPanel2Layout.createSequentialGroup()
                                    .addComponent(mataKuliahLabel14)
                                    .addGap(26, 26, 26)
                                    .addComponent(mataKuliahLabel15)))
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contentPanel2Layout.setVerticalGroup(
            contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mataKuliahLabel6)
                .addGap(18, 18, 18)
                .addComponent(mataKuliahLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(namaHotelInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mataKuliahLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gradeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mataKuliahLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lokasiInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(mataKuliahLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mataKuliahLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mataKuliahLabel14)
                    .addComponent(mataKuliahLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkoutTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkinInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        contentPanel3.setBackground(new java.awt.Color(255, 255, 255));
        contentPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.lightGray));

        jScrollPane5.setBackground(new java.awt.Color(255, 255, 255));

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
        jScrollPane5.setViewportView(tableHotel);
        tableHotel.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        mataKuliahLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        mataKuliahLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mataKuliahLabel9.setText("Hotel");

        pesanButton.setBackground(new java.awt.Color(0, 153, 0));
        pesanButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pesanButton.setForeground(new java.awt.Color(255, 255, 255));
        pesanButton.setText("Pesan");
        pesanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesanButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentPanel3Layout = new javax.swing.GroupLayout(contentPanel3);
        contentPanel3.setLayout(contentPanel3Layout);
        contentPanel3Layout.setHorizontalGroup(
            contentPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanel3Layout.createSequentialGroup()
                .addGroup(contentPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mataKuliahLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(contentPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pesanButton)
                .addGap(31, 31, 31))
        );
        contentPanel3Layout.setVerticalGroup(
            contentPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanel3Layout.createSequentialGroup()
                .addComponent(mataKuliahLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pesanButton)
                .addContainerGap())
        );

        jLayeredPane1.setLayer(headerPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(contentPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(contentPanel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(contentPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(contentPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(contentPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contentPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 861, Short.MAX_VALUE))
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
        namaHotelInput.setEnabled(value);
        deskripsiInput.setEnabled(value);
        gradeInput.setEnabled(value);
        lokasiInput.setEnabled(value);
        checkinInput.setEnabled(value);
        checkoutTime.setEnabled(value);
    }
    
    private void tableHotelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableHotelMouseClicked

        int clickedHotel = tableHotel.getSelectedRow();        
        TableModel tableModel = tableHotel.getModel();
        selectedIdHotel = Integer.parseInt(tableModel.getValueAt(clickedHotel, 1).toString());
        
        List<Hotel> detailHotel = hotelControl.detailHotel(selectedIdHotel);
        Hotel h = detailHotel.get(0);
        
        namaHotelInput.setText(h.getNamaHotel());
        deskripsiInput.setText(h.getDeskripsi());
        
        gradeInput.setText(gradeControl.getGrade(h.getId_grade()));
        lokasiInput.setText(lokasiControl.getLokasi(h.getId_provinsi()));
        checkinInput.setText(h.getCheckinTime());
        checkoutTime.setText(h.getCheckoutTime());
        
        showTemaAndFasilitas();
    }//GEN-LAST:event_tableHotelMouseClicked

    private void pesanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesanButtonActionPerformed
        UserPembayaran u = new UserPembayaran();
        u.setVisible(true);
        u.idHotelValuePembayaran.setText(""+selectedIdHotel);
        u.namaHotelPembayaran.setText(hotelControl.detailHotel(selectedIdHotel).get(0).getNamaHotel());
        u.lokasiInput.setText(""+lokasiControl.getLokasi(hotelControl.detailHotel(selectedIdHotel).get(0).getId_provinsi()));
        u.deskripsiInput.setText(hotelControl.detailHotel(selectedIdHotel).get(0).getDeskripsi());
        u.gradeInput.setText(gradeControl.getGrade(hotelControl.detailHotel(selectedIdHotel).get(0).getId_grade()));
        u.checkinInput.setText(hotelControl.detailHotel(selectedIdHotel).get(0).getCheckinTime());
        u.checkoutTime.setText(hotelControl.detailHotel(selectedIdHotel).get(0).getCheckoutTime());
        u.tableTemaAndFasilitas.setModel(subFasilitasControl.showTemaAndFasilitas(selectedIdHotel));
        u.idUserValuePembayaran.setText(idUserHomeValue.getText());
    }//GEN-LAST:event_pesanButtonActionPerformed

    private void tableTemaAndFasilitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableTemaAndFasilitasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tableTemaAndFasilitasMouseClicked

    private void pemesananUserPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pemesananUserPanelMouseClicked
        this.dispose();
        UserPemesanan a = new UserPemesanan();
        a.setVisible(true);
        a.idUserInputInPemesananUser.setText(""+idUserHomeValue.getText());
        a.usernameInput.setText(""+userControl.getNamaUser(Integer.valueOf(idUserHomeValue.getText())));
        
    }//GEN-LAST:event_pemesananUserPanelMouseClicked

    private void coursePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_coursePanelMouseClicked
         this.dispose();
         UserProfile u = new UserProfile();
         u.setVisible(true);
         u.idUserProfile.setText(idUserHomeValue.getText());
         u.saldoInput.setText(""+userControl.getSaldo(Integer.valueOf(idUserHomeValue.getText())));
//         idUserHomeValue;
         
    }//GEN-LAST:event_coursePanelMouseClicked

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
            java.util.logging.Logger.getLogger(UserHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField checkinInput;
    private javax.swing.JTextField checkoutTime;
    private javax.swing.JPanel containerPanel;
    private javax.swing.JPanel contentPanel2;
    private javax.swing.JPanel contentPanel3;
    private javax.swing.JPanel coursePanel;
    private javax.swing.JLabel deskripsiInput;
    private javax.swing.JTextField gradeInput;
    private javax.swing.JPanel headerPanel;
    public javax.swing.JLabel idUserHomeValue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JPanel lecturerPanel;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField lokasiInput;
    private javax.swing.JLabel mataKuliahLabel11;
    private javax.swing.JLabel mataKuliahLabel13;
    private javax.swing.JLabel mataKuliahLabel14;
    private javax.swing.JLabel mataKuliahLabel15;
    private javax.swing.JLabel mataKuliahLabel5;
    private javax.swing.JLabel mataKuliahLabel6;
    private javax.swing.JLabel mataKuliahLabel7;
    private javax.swing.JLabel mataKuliahLabel8;
    private javax.swing.JLabel mataKuliahLabel9;
    private javax.swing.JTextField namaHotelInput;
    private javax.swing.JPanel pemesananUserPanel;
    private javax.swing.JButton pesanButton;
    private javax.swing.ButtonGroup ruangKelasGroup;
    private javax.swing.JPanel sidebarPanel;
    private javax.swing.JTable tableHotel;
    private javax.swing.JTable tableTemaAndFasilitas;
    private javax.swing.JLabel titleContent;
    // End of variables declaration//GEN-END:variables
}
