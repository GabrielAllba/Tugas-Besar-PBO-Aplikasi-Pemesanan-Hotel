package view.admin;


import view.admin.*;
import exception.InputKosongException;

import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

import controller.TemaFasilitasControll;
import controller.SubFasilitasControl;
import java.util.ArrayList;

import model.TemaFasilitas;
import java.util.List;
import model.SubFasilitas;

public class FasilitasHotel extends javax.swing.JFrame {
    
    List<TemaFasilitas> listTemaFasilitas;
    TemaFasilitasControll temaFasilitasControl = new TemaFasilitasControll();
    SubFasilitasControl subFasilitasControl = new SubFasilitasControl();
    
    String action=null;
    int selectedId = 0;
    
    String actionSubFasilitas=null;
    int selectedSubFasilitasId=0;
    
 
    
    public void setTemaFasilitasToDropdown(){
        temaFasilitasHotelDropdown.removeAllItems();
        listTemaFasilitas = new ArrayList<TemaFasilitas>();
        listTemaFasilitas = temaFasilitasControl.showListTemaFasilitas();
        for(int i=0; i<listTemaFasilitas.size(); i++){
            temaFasilitasHotelDropdown.addItem(listTemaFasilitas.get(i));
        }
    }
 
    
    public FasilitasHotel() {
       initComponents();
       setTemaFasilitasToDropdown();
       
   
       showTemaFasilitas();
       setSaveCancelTemaFasilitas(false);
       setInputTemaFasilitas(false);
       
       // sub fasilitas
       showSubFasilitas();
       setSaveCancelSubFasilitas(false);
       setInputSubFasilitas(false);
       
   
    }
    
    // TemaFasilitas
    public void setInputTemaFasilitas(boolean value){
        temaFasilitasInput.setEnabled(value);
    }
    public void setSaveCancelTemaFasilitas(boolean value){
        saveTemaBtn.setEnabled(value);
        cancelTemaBtn.setEnabled(value);
    }
    
    public void showTemaFasilitas(){
        tableTemaFasilitas.setModel(temaFasilitasControl.showTemaFasilitas(""));
    }
    
    // SubFasilitas
    
    public void setInputSubFasilitas(boolean value){
        temaFasilitasHotelDropdown.setEnabled(value);
        subFasilitasInput.setEnabled(value);
    }
    public void setSaveCancelSubFasilitas(boolean value){
        saveSubFasilitasBtn.setEnabled(value);
        cancelSubFasilitasBtn.setEnabled(value);
    }
    
    public void showSubFasilitas(){
        tableSubFasilitas.setModel(subFasilitasControl.showSubFasilitas(action));
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
        contentPanel = new javax.swing.JPanel();
        temaFasilitasInput = new javax.swing.JTextField();
        mataKuliahLabel = new javax.swing.JLabel();
        cancelTemaBtn = new javax.swing.JButton();
        saveTemaBtn = new javax.swing.JButton();
        mataKuliahLabel1 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tableTemaFasilitas = new javax.swing.JTable();
        editTemaBtn = new javax.swing.JButton();
        addTemaBtn = new javax.swing.JButton();
        deleteTemaBtn = new javax.swing.JButton();
        contentPanel1 = new javax.swing.JPanel();
        mataKuliahLabel3 = new javax.swing.JLabel();
        temaFasilitasHotelDropdown = new javax.swing.JComboBox<>();
        mataKuliahLabel2 = new javax.swing.JLabel();
        subFasilitasInput = new javax.swing.JTextField();
        mataKuliahLabel4 = new javax.swing.JLabel();
        cancelSubFasilitasBtn = new javax.swing.JButton();
        saveSubFasilitasBtn = new javax.swing.JButton();
        addSubFasilitasBtn = new javax.swing.JButton();
        editSubFasilitasBtn = new javax.swing.JButton();
        deleteSubFasilitasBtn = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        tableSubFasilitas = new javax.swing.JTable();

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
        jLabel4.setText("Hotel");

        javax.swing.GroupLayout coursePanel1Layout = new javax.swing.GroupLayout(coursePanel1);
        coursePanel1.setLayout(coursePanel1Layout);
        coursePanel1Layout.setHorizontalGroup(
            coursePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, coursePanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        coursePanel1Layout.setVerticalGroup(
            coursePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, coursePanel1Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(30, 30, 30))
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

        contentPanel.setBackground(new java.awt.Color(255, 255, 255));
        contentPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.lightGray));

        temaFasilitasInput.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        temaFasilitasInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temaFasilitasInputActionPerformed(evt);
            }
        });

        mataKuliahLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mataKuliahLabel.setText("Tema Fasilitas");

        cancelTemaBtn.setBackground(new java.awt.Color(153, 0, 0));
        cancelTemaBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancelTemaBtn.setForeground(new java.awt.Color(255, 255, 255));
        cancelTemaBtn.setText("Batal");
        cancelTemaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelTemaBtnActionPerformed(evt);
            }
        });

        saveTemaBtn.setBackground(new java.awt.Color(22, 52, 122));
        saveTemaBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        saveTemaBtn.setForeground(new java.awt.Color(255, 255, 255));
        saveTemaBtn.setText("Simpan");
        saveTemaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveTemaBtnActionPerformed(evt);
            }
        });

        mataKuliahLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        mataKuliahLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mataKuliahLabel1.setText("Fasilitas");

        jScrollPane7.setBackground(new java.awt.Color(255, 255, 255));

        tableTemaFasilitas.setAutoCreateRowSorter(true);
        tableTemaFasilitas.setModel(new javax.swing.table.DefaultTableModel(
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
        tableTemaFasilitas.setDoubleBuffered(true);
        tableTemaFasilitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableTemaFasilitasMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tableTemaFasilitas);

        editTemaBtn.setBackground(new java.awt.Color(236, 168, 30));
        editTemaBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        editTemaBtn.setForeground(new java.awt.Color(255, 255, 255));
        editTemaBtn.setText("Ubah");
        editTemaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editTemaBtnActionPerformed(evt);
            }
        });

        addTemaBtn.setBackground(new java.awt.Color(0, 153, 0));
        addTemaBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addTemaBtn.setForeground(new java.awt.Color(255, 255, 255));
        addTemaBtn.setText("Tambah");
        addTemaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTemaBtnActionPerformed(evt);
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

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(contentPanelLayout.createSequentialGroup()
                                .addComponent(saveTemaBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cancelTemaBtn))
                            .addComponent(mataKuliahLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(temaFasilitasInput, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(mataKuliahLabel))
                            .addGroup(contentPanelLayout.createSequentialGroup()
                                .addComponent(addTemaBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(editTemaBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(deleteTemaBtn)))))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contentPanelLayout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(26, Short.MAX_VALUE)))
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mataKuliahLabel1)
                .addGap(18, 18, 18)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addTemaBtn)
                    .addComponent(editTemaBtn)
                    .addComponent(deleteTemaBtn))
                .addGap(18, 18, 18)
                .addComponent(mataKuliahLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(temaFasilitasInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveTemaBtn)
                    .addComponent(cancelTemaBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contentPanelLayout.createSequentialGroup()
                    .addGap(227, 227, 227)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(21, Short.MAX_VALUE)))
        );

        contentPanel1.setBackground(new java.awt.Color(255, 255, 255));
        contentPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.lightGray));

        mataKuliahLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        mataKuliahLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mataKuliahLabel3.setText("Sub Fasilitas");

        temaFasilitasHotelDropdown.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N

        mataKuliahLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mataKuliahLabel2.setText("Tema fasilitas");

        subFasilitasInput.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        subFasilitasInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subFasilitasInputActionPerformed(evt);
            }
        });

        mataKuliahLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mataKuliahLabel4.setText("Nama sub fasilitas");

        cancelSubFasilitasBtn.setBackground(new java.awt.Color(153, 0, 0));
        cancelSubFasilitasBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancelSubFasilitasBtn.setForeground(new java.awt.Color(255, 255, 255));
        cancelSubFasilitasBtn.setText("Batal");
        cancelSubFasilitasBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelSubFasilitasBtnActionPerformed(evt);
            }
        });

        saveSubFasilitasBtn.setBackground(new java.awt.Color(22, 52, 122));
        saveSubFasilitasBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        saveSubFasilitasBtn.setForeground(new java.awt.Color(255, 255, 255));
        saveSubFasilitasBtn.setText("Simpan");
        saveSubFasilitasBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveSubFasilitasBtnActionPerformed(evt);
            }
        });

        addSubFasilitasBtn.setBackground(new java.awt.Color(0, 153, 0));
        addSubFasilitasBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addSubFasilitasBtn.setForeground(new java.awt.Color(255, 255, 255));
        addSubFasilitasBtn.setText("Tambah");
        addSubFasilitasBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSubFasilitasBtnActionPerformed(evt);
            }
        });

        editSubFasilitasBtn.setBackground(new java.awt.Color(236, 168, 30));
        editSubFasilitasBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        editSubFasilitasBtn.setForeground(new java.awt.Color(255, 255, 255));
        editSubFasilitasBtn.setText("Ubah");
        editSubFasilitasBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editSubFasilitasBtnActionPerformed(evt);
            }
        });

        deleteSubFasilitasBtn.setBackground(new java.awt.Color(153, 0, 0));
        deleteSubFasilitasBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deleteSubFasilitasBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteSubFasilitasBtn.setText("Hapus");
        deleteSubFasilitasBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteSubFasilitasBtnActionPerformed(evt);
            }
        });

        jScrollPane8.setBackground(new java.awt.Color(255, 255, 255));

        tableSubFasilitas.setAutoCreateRowSorter(true);
        tableSubFasilitas.setModel(new javax.swing.table.DefaultTableModel(
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
        tableSubFasilitas.setDoubleBuffered(true);
        tableSubFasilitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableSubFasilitasMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(tableSubFasilitas);

        javax.swing.GroupLayout contentPanel1Layout = new javax.swing.GroupLayout(contentPanel1);
        contentPanel1.setLayout(contentPanel1Layout);
        contentPanel1Layout.setHorizontalGroup(
            contentPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mataKuliahLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(contentPanel1Layout.createSequentialGroup()
                .addGroup(contentPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(contentPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contentPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(mataKuliahLabel4)
                                .addComponent(temaFasilitasHotelDropdown, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(mataKuliahLabel2)
                                .addComponent(subFasilitasInput, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(contentPanel1Layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(saveSubFasilitasBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cancelSubFasilitasBtn))))
                    .addGroup(contentPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(addSubFasilitasBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editSubFasilitasBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteSubFasilitasBtn)))
                .addGap(0, 23, Short.MAX_VALUE))
            .addGroup(contentPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contentPanel1Layout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        contentPanel1Layout.setVerticalGroup(
            contentPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mataKuliahLabel3)
                .addGap(16, 16, 16)
                .addGroup(contentPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addSubFasilitasBtn)
                    .addComponent(editSubFasilitasBtn)
                    .addComponent(deleteSubFasilitasBtn))
                .addGap(18, 18, 18)
                .addComponent(mataKuliahLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(temaFasilitasHotelDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mataKuliahLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(subFasilitasInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(contentPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveSubFasilitasBtn)
                    .addComponent(cancelSubFasilitasBtn))
                .addContainerGap(181, Short.MAX_VALUE))
            .addGroup(contentPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contentPanel1Layout.createSequentialGroup()
                    .addGap(269, 269, 269)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(19, Short.MAX_VALUE)))
        );

        jLayeredPane1.setLayer(headerPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(contentPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(contentPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(contentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(contentPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(contentPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contentPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout containerPanelLayout = new javax.swing.GroupLayout(containerPanel);
        containerPanel.setLayout(containerPanelLayout);
        containerPanelLayout.setHorizontalGroup(
            containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerPanelLayout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 346, Short.MAX_VALUE))
        );
        containerPanelLayout.setVerticalGroup(
            containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(180, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(containerPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sidebarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidebarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void inputTemaFasilitasKosongException() throws InputKosongException{
//        if(namaTemaFasilitasInput.getText().isEmpty()){
//            throw new InputKosongException();
//        }
    }
    
    public void inputSubFasilitasKosongException() throws InputKosongException{
        if(subFasilitasInput.getText().isEmpty() || temaFasilitasHotelDropdown.getSelectedIndex()==-1){
            throw new InputKosongException();
        }
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

    
    public void inputTemaKosongException() throws InputKosongException{
        if(temaFasilitasInput.getText().isEmpty()){
            throw new InputKosongException();
        }
    }
    
    private void saveTemaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveTemaBtnActionPerformed
        try{
            inputTemaKosongException();
            
            String temaFasilitas = temaFasilitasInput.getText();
            
            if(action.equals("tambah")){
                TemaFasilitas p = new TemaFasilitas(0,temaFasilitas);
                temaFasilitasControl.insertDataTemaFasilitas(p);
            }else{
                TemaFasilitas p = new TemaFasilitas(selectedId,temaFasilitas);
                temaFasilitasControl.updateDataTemaFasilitas(p);
            }
            
            showTemaFasilitas();
            temaFasilitasInput.setText("");
            temaFasilitasInput.setEnabled(false);
            setSaveCancelTemaFasilitas(false);
            setTemaFasilitasToDropdown();
            
            
            
        }catch(InputKosongException e){
            JOptionPane.showMessageDialog(this, e.message());
        }
    }//GEN-LAST:event_saveTemaBtnActionPerformed

    private void cancelTemaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelTemaBtnActionPerformed

        setSaveCancelTemaFasilitas(false);
        temaFasilitasInput.setText("");
        temaFasilitasInput.setEnabled(false);
    }//GEN-LAST:event_cancelTemaBtnActionPerformed

    private void temaFasilitasInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temaFasilitasInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_temaFasilitasInputActionPerformed

    private void tableTemaFasilitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableTemaFasilitasMouseClicked
        int clickedRow = tableTemaFasilitas.getSelectedRow();
        TableModel tableModel = tableTemaFasilitas.getModel();
        
        selectedId = Integer.parseInt(tableModel.getValueAt(clickedRow, 0).toString());
        temaFasilitasInput.setText(tableModel.getValueAt(clickedRow, 1).toString());
    }//GEN-LAST:event_tableTemaFasilitasMouseClicked

    private void subFasilitasInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subFasilitasInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subFasilitasInputActionPerformed

    private void cancelSubFasilitasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelSubFasilitasBtnActionPerformed
        temaFasilitasHotelDropdown.setEnabled(false);
        subFasilitasInput.setEnabled(false);
        subFasilitasInput.setText("");
    }//GEN-LAST:event_cancelSubFasilitasBtnActionPerformed

    private void saveSubFasilitasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveSubFasilitasBtnActionPerformed
        try{
            inputSubFasilitasKosongException();
            
            int temaFasilitas = temaFasilitasHotelDropdown.getSelectedIndex();
            TemaFasilitas t = listTemaFasilitas.get(temaFasilitas);
            
            String namaFasilitas = subFasilitasInput.getText();
            if(actionSubFasilitas.equals("tambah")){
                SubFasilitas p = new SubFasilitas(0,t.getId(), namaFasilitas);
                subFasilitasControl.insertDataSubFasilitas(p);
            }else{
                SubFasilitas p = new SubFasilitas(selectedSubFasilitasId, t.getId(), namaFasilitas);
                subFasilitasControl.updateDataSubFasilitas(p);
            }
            
            showSubFasilitas();
            setInputSubFasilitas(false);
            setSaveCancelSubFasilitas(false);
            subFasilitasInput.setText("");
            temaFasilitasHotelDropdown.setSelectedItem(ABORT);
            
            
            
        }catch(InputKosongException e){
            JOptionPane.showMessageDialog(this, e.message());
        }
    }//GEN-LAST:event_saveSubFasilitasBtnActionPerformed

    private void deleteTemaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteTemaBtnActionPerformed

        if(!temaFasilitasInput.getText().isEmpty()){
            int getAnswer = JOptionPane.showConfirmDialog(rootPane,"Apakah yakin ingin menghapus data ? ", "Konfirmasi", JOptionPane.YES_NO_OPTION);

            switch(getAnswer){
                case 0:
                try{
                    temaFasilitasControl.deleteDataTemaFasilitas(selectedId);

                    temaFasilitasInput.setEnabled(false);
                    temaFasilitasInput.setText("");

                    showTemaFasilitas();
                    showSubFasilitas();
                    
                    setSaveCancelTemaFasilitas(false);
                    setTemaFasilitasToDropdown();
                }catch(Exception e){
                    System.out.println("Error : "+e.getMessage());
                }
                break;
                case 1:
                break;
            }
        }

    }//GEN-LAST:event_deleteTemaBtnActionPerformed

    private void addTemaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTemaBtnActionPerformed
        setInputTemaFasilitas(true);
        setSaveCancelTemaFasilitas(true);
        action="tambah";
    }//GEN-LAST:event_addTemaBtnActionPerformed

    private void editTemaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editTemaBtnActionPerformed

        if(!temaFasilitasInput.getText().isEmpty()){
            action = "ubah";
            temaFasilitasInput.setEnabled(true);
            setSaveCancelTemaFasilitas(true);
        }

    }//GEN-LAST:event_editTemaBtnActionPerformed

    private void deleteSubFasilitasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteSubFasilitasBtnActionPerformed
        if(!subFasilitasInput.getText().isEmpty()){
            int getAnswer = JOptionPane.showConfirmDialog(rootPane,"Apakah yakin ingin menghapus data ? ", "Konfirmasi", JOptionPane.YES_NO_OPTION);

            switch(getAnswer){
                case 0:
                try{
                    subFasilitasControl.deleteDataSubFasilitas(selectedSubFasilitasId);

                    subFasilitasInput.setEnabled(false);
                    subFasilitasInput.setText("");
                    
                    temaFasilitasHotelDropdown.setSelectedIndex(-1);
                    temaFasilitasHotelDropdown.setEnabled(false);
                    
                    showSubFasilitas();
                    
                    setSaveCancelTemaFasilitas(false);
                    setTemaFasilitasToDropdown();
                }catch(Exception e){
                    System.out.println("Error : "+e.getMessage());
                }
                break;
                case 1:
                break;
            }
        }
    }//GEN-LAST:event_deleteSubFasilitasBtnActionPerformed

    private void editSubFasilitasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editSubFasilitasBtnActionPerformed
        if(!subFasilitasInput.getText().isEmpty()){
            actionSubFasilitas = "ubah";
            subFasilitasInput.setEnabled(true);
            temaFasilitasHotelDropdown.setEnabled(true);
            setSaveCancelSubFasilitas(true);
        }
    }//GEN-LAST:event_editSubFasilitasBtnActionPerformed

    private void addSubFasilitasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSubFasilitasBtnActionPerformed
        setInputSubFasilitas(true);
        setSaveCancelSubFasilitas(true);
        actionSubFasilitas="tambah";
    }//GEN-LAST:event_addSubFasilitasBtnActionPerformed

    private void tableSubFasilitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSubFasilitasMouseClicked
        int index= -1;
        
        int clickedRow = tableSubFasilitas.getSelectedRow();
        TableModel tableModel = tableSubFasilitas.getModel();
        
        selectedSubFasilitasId = Integer.parseInt(tableModel.getValueAt(clickedRow, 0).toString());
        subFasilitasInput.setText(tableModel.getValueAt(clickedRow, 2).toString());
        
        String temaID = tableModel.getValueAt(clickedRow, 1).toString();
        
        for(TemaFasilitas tema : listTemaFasilitas){
            if(Integer.valueOf(temaID).equals(tema.getId())){
                index = listTemaFasilitas.indexOf(tema);
            }
        }
        
        temaFasilitasHotelDropdown.setSelectedIndex(index);
    }//GEN-LAST:event_tableSubFasilitasMouseClicked

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
            java.util.logging.Logger.getLogger(FasilitasHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FasilitasHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FasilitasHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FasilitasHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FasilitasHotel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addSubFasilitasBtn;
    private javax.swing.JButton addTemaBtn;
    private javax.swing.JButton cancelSubFasilitasBtn;
    private javax.swing.JButton cancelTemaBtn;
    private javax.swing.JPanel containerPanel;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JPanel contentPanel1;
    private javax.swing.JPanel coursePanel;
    private javax.swing.JPanel coursePanel1;
    private javax.swing.JButton deleteSubFasilitasBtn;
    private javax.swing.JButton deleteTemaBtn;
    private javax.swing.JButton editSubFasilitasBtn;
    private javax.swing.JButton editTemaBtn;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JPanel lecturerPanel;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel mataKuliahLabel;
    private javax.swing.JLabel mataKuliahLabel1;
    private javax.swing.JLabel mataKuliahLabel2;
    private javax.swing.JLabel mataKuliahLabel3;
    private javax.swing.JLabel mataKuliahLabel4;
    private javax.swing.ButtonGroup ruangKelasGroup;
    private javax.swing.JButton saveSubFasilitasBtn;
    private javax.swing.JButton saveTemaBtn;
    private javax.swing.JPanel sidebarPanel;
    private javax.swing.JTextField subFasilitasInput;
    private javax.swing.JTable tableSubFasilitas;
    private javax.swing.JTable tableTemaFasilitas;
    private javax.swing.JComboBox<TemaFasilitas> temaFasilitasHotelDropdown;
    private javax.swing.JTextField temaFasilitasInput;
    private com.raven.swing.TimePicker timePickerCheckin;
    private com.raven.swing.TimePicker timePickerCheckout;
    private javax.swing.JLabel titleContent;
    // End of variables declaration//GEN-END:variables
}
