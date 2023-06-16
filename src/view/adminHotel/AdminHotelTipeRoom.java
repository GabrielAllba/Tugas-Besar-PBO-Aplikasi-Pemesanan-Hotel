
package view.adminHotel;

import view.LandingPage;
import model.Hotel;
import table.TableHotel;
import java.awt.Color;
import java.awt.Font;
import model.TipeRoom;
import controller.HotelControll;
import controller.PemesananControll;
import exception.InputKosongException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import exception.InputKosongException;
import java.math.BigInteger;
import model.TipeRoom;
import controller.TipeRoomControll;
import java.util.ArrayList;
import controller.UserControll;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import table.TableTipeRoom;
import controller.AdminHotelControl;
import javax.swing.SwingUtilities;

public class AdminHotelTipeRoom extends javax.swing.JFrame {

    int selectedIdTipeRoom = 0;
    TipeRoomControll tipeRoomControll = new TipeRoomControll();
    UserControll userControl = new UserControll();
    HotelControll hotelControl = new HotelControll();
    AdminHotelControl adminHotelControl = new AdminHotelControl();
    
    Color panDefault,panClick,panEnter;
    public AdminHotelTipeRoom() {
        initComponents();
        panDefault = Color.white;
        panClick = Color.LIGHT_GRAY;
        panEnter = new Color(204,204,204);
        
        menu1.setBackground(panDefault);
        menu2.setBackground(panEnter);
//        menu3.setBackground(panDefault);
        logout.setBackground(Color.white);
        EditBtn.setEnabled(false);
        DeleteBtn.setEnabled(false);
        inisialisasiTableTipeRoom();
        
        TabelDataTipeRoom.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,12));
        TabelDataTipeRoom.getTableHeader().setOpaque(false);
        TabelDataTipeRoom.getTableHeader().setBackground(new Color(152, 168, 248));
        TabelDataTipeRoom.getTableHeader().setForeground(new Color(255,255,255));
        TabelDataTipeRoom.setRowHeight(25);
        tipeKamarSearch.setEnabled(false);
        
        SaveBtnTipeRoom.setEnabled(false);
        CancelBtnTipeRoom.setEnabled(false);
    }
    
    
    String action = null;
    
    public void setComponent(boolean value){
        tipeKamarInput.setEnabled(value);
        kapasitasInput.setEnabled(value);
        hargaInput.setEnabled(value);
        SaveBtnTipeRoom.setEnabled(value);
        CancelBtnTipeRoom.setEnabled(value);
    }
     public void inisialisasiTableTipeRoom(){
        List<TipeRoom> data= new ArrayList<TipeRoom>();
        TableTipeRoom t = new TableTipeRoom(data);
        TabelDataTipeRoom.setModel(t);
    }
    
     public void showTipeRoomByHotel(){
        TabelDataTipeRoom.setModel(tipeRoomControll.showTipeRoomByHotel(Integer.valueOf(idHotelValueTipeRoom.getText())));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        menu1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        menu2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        logout = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        namaHotelValueTipeRoom = new javax.swing.JLabel();
        idHotelValueTipeRoom = new javax.swing.JLabel();
        LabelPilihHotel3 = new javax.swing.JLabel();
        idHotelAdmin = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        LabelPilihHotel2 = new javax.swing.JLabel();
        tipeKamarInput = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        kapasitasInput = new javax.swing.JTextField();
        hargaInput = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        namaShow4 = new javax.swing.JTextField();
        AddBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        CancelBtnTipeRoom = new javax.swing.JButton();
        SaveBtnTipeRoom = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelDataTipeRoom = new javax.swing.JTable();
        SearchBtn = new javax.swing.JLabel();
        tipeKamarSearch = new javax.swing.JTextField();
        lihatTipeRoomBtn = new javax.swing.JButton();

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
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

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

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(60, 72, 107));
        jLabel5.setText("Room Type");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/bedroom.png"))); // NOI18N

        javax.swing.GroupLayout menu2Layout = new javax.swing.GroupLayout(menu2);
        menu2.setLayout(menu2Layout);
        menu2Layout.setHorizontalGroup(
            menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        menu2Layout.setVerticalGroup(
            menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel5))
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
                .addGap(18, 18, 18)
                .addComponent(menu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        namaHotelValueTipeRoom.setFont(new java.awt.Font("Yu Gothic UI", 1, 48)); // NOI18N
        namaHotelValueTipeRoom.setForeground(new java.awt.Color(60, 72, 107));
        namaHotelValueTipeRoom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        idHotelValueTipeRoom.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        idHotelValueTipeRoom.setForeground(new java.awt.Color(60, 72, 107));
        idHotelValueTipeRoom.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        idHotelValueTipeRoom.setText("ID Hotel  : ");

        LabelPilihHotel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        LabelPilihHotel3.setForeground(new java.awt.Color(60, 72, 107));
        LabelPilihHotel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabelPilihHotel3.setText(" ID HOTEL ADMIN");

        idHotelAdmin.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        idHotelAdmin.setForeground(new java.awt.Color(60, 72, 107));
        idHotelAdmin.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        idHotelAdmin.setText("ID Hotel  : ");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(namaHotelValueTipeRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(idHotelValueTipeRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(207, 207, 207))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(idHotelAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(LabelPilihHotel3, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(392, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(idHotelAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(namaHotelValueTipeRoom, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idHotelValueTipeRoom)
                .addContainerGap())
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                    .addContainerGap(78, Short.MAX_VALUE)
                    .addComponent(LabelPilihHotel3)
                    .addContainerGap()))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        LabelPilihHotel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        LabelPilihHotel2.setForeground(new java.awt.Color(60, 72, 107));
        LabelPilihHotel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelPilihHotel2.setText("Input Tipe Room");

        tipeKamarInput.setForeground(new java.awt.Color(60, 72, 107));
        tipeKamarInput.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(60, 72, 107)));
        tipeKamarInput.setDisabledTextColor(new java.awt.Color(60, 72, 107));
        tipeKamarInput.setEnabled(false);
        tipeKamarInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipeKamarInputActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(60, 72, 107));
        jLabel20.setText("Tipe Kamar");

        jLabel25.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(60, 72, 107));
        jLabel25.setText("Jumlah Kamar");

        kapasitasInput.setForeground(new java.awt.Color(60, 72, 107));
        kapasitasInput.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(60, 72, 107)));
        kapasitasInput.setDisabledTextColor(new java.awt.Color(60, 72, 107));
        kapasitasInput.setEnabled(false);
        kapasitasInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kapasitasInputActionPerformed(evt);
            }
        });

        hargaInput.setForeground(new java.awt.Color(60, 72, 107));
        hargaInput.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(60, 72, 107)));
        hargaInput.setDisabledTextColor(new java.awt.Color(60, 72, 107));
        hargaInput.setEnabled(false);
        hargaInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hargaInputActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(60, 72, 107));
        jLabel26.setText("Harga");

        namaShow4.setBackground(new java.awt.Color(250, 247, 240));
        namaShow4.setForeground(new java.awt.Color(60, 72, 107));
        namaShow4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(60, 72, 107)));
        namaShow4.setDisabledTextColor(new java.awt.Color(60, 72, 107));
        namaShow4.setEnabled(false);
        namaShow4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaShow4ActionPerformed(evt);
            }
        });

        AddBtn.setBackground(new java.awt.Color(0, 153, 0));
        AddBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(250, 247, 240));
        AddBtn.setText("ADD");
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        EditBtn.setBackground(new java.awt.Color(236, 168, 30));
        EditBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        EditBtn.setForeground(new java.awt.Color(250, 247, 240));
        EditBtn.setText("EDIT");
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
            }
        });

        DeleteBtn.setBackground(new java.awt.Color(153, 0, 0));
        DeleteBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(250, 247, 240));
        DeleteBtn.setText("Delete");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        CancelBtnTipeRoom.setBackground(new java.awt.Color(204, 204, 204));
        CancelBtnTipeRoom.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        CancelBtnTipeRoom.setForeground(new java.awt.Color(250, 247, 240));
        CancelBtnTipeRoom.setText("CANCEL");
        CancelBtnTipeRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBtnTipeRoomActionPerformed(evt);
            }
        });

        SaveBtnTipeRoom.setBackground(new java.awt.Color(60, 72, 107));
        SaveBtnTipeRoom.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        SaveBtnTipeRoom.setForeground(new java.awt.Color(250, 247, 240));
        SaveBtnTipeRoom.setText("SAVE");
        SaveBtnTipeRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnTipeRoomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DeleteBtn)
                .addGap(67, 67, 67))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(SaveBtnTipeRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CancelBtnTipeRoom))
                    .addComponent(LabelPilihHotel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(namaShow4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(jLabel20)
                            .addComponent(jLabel26))
                        .addGap(265, 265, 265))
                    .addComponent(hargaInput)
                    .addComponent(kapasitasInput)
                    .addComponent(tipeKamarInput))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(LabelPilihHotel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(namaShow4, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddBtn)
                    .addComponent(EditBtn)
                    .addComponent(DeleteBtn))
                .addGap(26, 26, 26)
                .addComponent(jLabel20)
                .addGap(4, 4, 4)
                .addComponent(tipeKamarInput, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kapasitasInput, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hargaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelBtnTipeRoom)
                    .addComponent(SaveBtnTipeRoom))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel19.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(60, 72, 107));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Data Tipe Kamar");

        jTextField5.setBackground(new java.awt.Color(60, 72, 107));
        jTextField5.setText("jTextField1");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(null);

        TabelDataTipeRoom.setAutoCreateRowSorter(true);
        TabelDataTipeRoom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        TabelDataTipeRoom.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        TabelDataTipeRoom.setForeground(new java.awt.Color(60, 72, 107));
        TabelDataTipeRoom.setModel(new javax.swing.table.DefaultTableModel(
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
        TabelDataTipeRoom.setGridColor(new java.awt.Color(255, 255, 255));
        TabelDataTipeRoom.setIntercellSpacing(new java.awt.Dimension(5, 5));
        TabelDataTipeRoom.setRowHeight(25);
        TabelDataTipeRoom.setSelectionBackground(new java.awt.Color(152, 168, 248));
        TabelDataTipeRoom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelDataTipeRoomMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabelDataTipeRoom);
        if (TabelDataTipeRoom.getColumnModel().getColumnCount() > 0) {
            TabelDataTipeRoom.getColumnModel().getColumn(0).setResizable(false);
            TabelDataTipeRoom.getColumnModel().getColumn(1).setResizable(false);
            TabelDataTipeRoom.getColumnModel().getColumn(2).setResizable(false);
            TabelDataTipeRoom.getColumnModel().getColumn(3).setResizable(false);
            TabelDataTipeRoom.getColumnModel().getColumn(3).setPreferredWidth(10);
        }

        SearchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/search.png"))); // NOI18N

        tipeKamarSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipeKamarSearchActionPerformed(evt);
            }
        });
        tipeKamarSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tipeKamarSearchKeyTyped(evt);
            }
        });

        lihatTipeRoomBtn.setBackground(new java.awt.Color(60, 72, 107));
        lihatTipeRoomBtn.setFont(new java.awt.Font("Yu Gothic UI", 2, 12)); // NOI18N
        lihatTipeRoomBtn.setForeground(new java.awt.Color(250, 247, 240));
        lihatTipeRoomBtn.setText("Click Untuk Tampilkan Tipe Kamar");
        lihatTipeRoomBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lihatTipeRoomBtnActionPerformed(evt);
            }
        });

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
                        .addComponent(tipeKamarSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(lihatTipeRoomBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tipeKamarSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchBtn))
                .addGap(18, 18, 18)
                .addComponent(lihatTipeRoomBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
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
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void menu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu2MouseClicked
        
    }//GEN-LAST:event_menu2MouseClicked

    private void menu2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu2MouseEntered
        
    }//GEN-LAST:event_menu2MouseEntered

    private void menu2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu2MouseExited
        
    }//GEN-LAST:event_menu2MouseExited

    private void menu2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu2MousePressed
        
    }//GEN-LAST:event_menu2MousePressed

    
    private void menu2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu2MouseReleased
        
    }//GEN-LAST:event_menu2MouseReleased

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
        a.idValueInput.setText(idHotelAdmin.getText());
        a.userNameValueInput.setText(adminHotelControl.getUsername(Integer.valueOf(idHotelAdmin.getText())));
//        a.idValueInput.setText(hotelControl.detailHotel(WIDTH));
//        a.userNameValueInput.setText(userControl.getNamaUser(Integer.valueOf(idHotelAdmin.getText())));

//        a.userNameValueInput.setText();
//        hotelControl.detailHotel();
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

//    private void clearDetail(){
//        namaShow.setText("");
//        emailShow.setText("");
//        noHandphoneShow.setText("");
//        jenisKamarShow.setText("");
//        inShow.setText("");
//        outShow.setText("");
//        pembayaranShow.setText("");
//    }
    
    private void TabelDataTipeRoomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelDataTipeRoomMouseClicked
        SaveBtnTipeRoom.setEnabled(false);
        CancelBtnTipeRoom.setEnabled(false);
        tipeKamarInput.setEnabled(false);
        kapasitasInput.setEnabled(false);
        hargaInput.setEnabled(false);
        
        int clickedTipeRoom = TabelDataTipeRoom.getSelectedRow();
        TableModel tableModel = TabelDataTipeRoom.getModel();
         
         
         selectedIdTipeRoom = Integer.parseInt(tableModel.getValueAt(clickedTipeRoom, 0).toString());
         String selectedNamaTipe = tableModel.getValueAt(clickedTipeRoom, 1).toString();
         String selectedKapasitas = tableModel.getValueAt(clickedTipeRoom,2).toString();
         String selectedHarga = tableModel.getValueAt(clickedTipeRoom,3).toString();
         
         tipeKamarInput.setText(selectedNamaTipe);
         kapasitasInput.setText(selectedKapasitas);
         hargaInput.setText(selectedHarga);
         
         AddBtn.setEnabled(false);
         EditBtn.setEnabled(true);
         DeleteBtn.setEnabled(true);
    }//GEN-LAST:event_TabelDataTipeRoomMouseClicked

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void tipeKamarInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipeKamarInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipeKamarInputActionPerformed

    private void kapasitasInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kapasitasInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kapasitasInputActionPerformed

    private void hargaInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hargaInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hargaInputActionPerformed

    private void namaShow4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaShow4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaShow4ActionPerformed

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        setComponent(true);
        action = "tambah";
    }//GEN-LAST:event_AddBtnActionPerformed

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
        action = "ubah";
        setComponent(true);
    }//GEN-LAST:event_EditBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        if(!tipeKamarInput.getText().isEmpty()){
            int getAnswer = JOptionPane.showConfirmDialog(rootPane,"Apakah yakin ingin menghapus data ? ", "Konfirmasi", JOptionPane.YES_NO_OPTION);

            switch(getAnswer){
                case 0:
                try{
                    tipeRoomControll.deleteDataTipeRoom(selectedIdTipeRoom);
                    AddBtn.setEnabled(true);
                    EditBtn.setEnabled(false);
                    DeleteBtn.setEnabled(false);
                    showTipeRoomByHotel();
                    tipeKamarInput.setText("");
                    kapasitasInput.setText("");
                    hargaInput.setText("");
                    setComponent(false);
                }catch(Exception e){
                    System.out.println("Error : "+e.getMessage());
                }
                break;
                case 1:
                break;
            }
        }             
    }//GEN-LAST:event_DeleteBtnActionPerformed
    
    public void inputTipeRoomKosong() throws InputKosongException{
        if(tipeKamarInput.getText().isEmpty() || kapasitasInput.getText().isEmpty()){
            throw new InputKosongException();
        }
    }
    
    private void SaveBtnTipeRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnTipeRoomActionPerformed
        try{
            inputTipeRoomKosong();
            
            String tipeKamar = tipeKamarInput.getText();
            String kapasitas = kapasitasInput.getText();
            
            
            if(action.equals("tambah")){
                TipeRoom t = new TipeRoom(0, Integer.valueOf(idHotelValueTipeRoom.getText()), tipeKamar, Integer.valueOf(kapasitas), BigInteger.valueOf(Long.valueOf(hargaInput.getText())));
                tipeRoomControll.insertDataTipeRoom(t);
                showTipeRoomByHotel();
            }else{
                TipeRoom t = new TipeRoom(selectedIdTipeRoom, Integer.valueOf(idHotelValueTipeRoom.getText()), tipeKamar, Integer.valueOf(kapasitas), BigInteger.valueOf(Long.valueOf(hargaInput.getText())));
                tipeRoomControll.updateDataTipeRoom(t);
                showTipeRoomByHotel();
                
            }
            
            tipeKamarInput.setText("");
            kapasitasInput.setText("");
            hargaInput.setText("");
            
            setComponent(false);
            
            AddBtn.setEnabled(true);
            EditBtn.setEnabled(false);
            DeleteBtn.setEnabled(false);
            
            
             
        }catch(InputKosongException e){
            JOptionPane.showMessageDialog(this, e.message());
        }
    }//GEN-LAST:event_SaveBtnTipeRoomActionPerformed

    private void lihatTipeRoomBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lihatTipeRoomBtnActionPerformed
        showTipeRoomByHotel();
        tipeKamarSearch.setEnabled(true);
    }//GEN-LAST:event_lihatTipeRoomBtnActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        
    }//GEN-LAST:event_jLabel2MouseClicked

    private void tipeKamarSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tipeKamarSearchKeyTyped
        
        SwingUtilities.invokeLater(() -> {
            List<TipeRoom> a = tipeRoomControll.search(idHotelValueTipeRoom.getText(), tipeKamarSearch.getText());
            if(!a.isEmpty()){
                for(TipeRoom t : a){
                    System.out.println(t.getId() +""+ t.getKapasitas() +""+""+ t.getHarga());
                }
                TableTipeRoom tt = new TableTipeRoom(a);
                TabelDataTipeRoom.setModel(tt);
            }else{
                List<TipeRoom> data = new ArrayList<TipeRoom>();
                TableTipeRoom tt = new TableTipeRoom(data);
                TabelDataTipeRoom.setModel(tt);
            }
        });
        
        
        
//        TableTipeRoom t = new TableTipeRoom(a);
//        TabelDataTipeRoom.setModel(t);
        
//        TabelDataTipeRoom.setModel();
        
    }//GEN-LAST:event_tipeKamarSearchKeyTyped

    private void tipeKamarSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipeKamarSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipeKamarSearchActionPerformed

    private void CancelBtnTipeRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBtnTipeRoomActionPerformed
        tipeKamarInput.setText("");
            kapasitasInput.setText("");
            hargaInput.setText("");
            
            tipeKamarInput.setEnabled(false);
            kapasitasInput.setEnabled(false);
            hargaInput.setEnabled(false);
            
            setComponent(false);
            AddBtn.setEnabled(true);
            EditBtn.setEnabled(false);
            DeleteBtn.setEnabled(false);
    }//GEN-LAST:event_CancelBtnTipeRoomActionPerformed

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
            java.util.logging.Logger.getLogger(AdminHotelTipeRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminHotelTipeRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminHotelTipeRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminHotelTipeRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
      
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHotelTipeRoom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JButton CancelBtnTipeRoom;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JLabel LabelPilihHotel2;
    private javax.swing.JLabel LabelPilihHotel3;
    private javax.swing.JButton SaveBtnTipeRoom;
    private javax.swing.JLabel SearchBtn;
    private javax.swing.JTable TabelDataTipeRoom;
    private javax.swing.JTextField hargaInput;
    public javax.swing.JLabel idHotelAdmin;
    public javax.swing.JLabel idHotelValueTipeRoom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField5;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField kapasitasInput;
    private javax.swing.JButton lihatTipeRoomBtn;
    private javax.swing.JPanel logout;
    private javax.swing.JPanel menu1;
    private javax.swing.JPanel menu2;
    public javax.swing.JLabel namaHotelValueTipeRoom;
    private javax.swing.JTextField namaShow4;
    private javax.swing.JTextField tipeKamarInput;
    private javax.swing.JTextField tipeKamarSearch;
    // End of variables declaration//GEN-END:variables
}
