/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;

/**
 *
 * @author Muhtar
 */
public class peminjampega extends javax.swing.JFrame {

    String pinja;
    String kemba;
    public String getIdmotor;

    /**
     * Creates new form peminjampega
     */
    public peminjampega() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public String getPinja() {
        return pinja;
    }

    public String getKemba() {
        return kemba;
    }

    public String getIdpeminjam() {
        return idpeminjam.getText();
    }

    public int getcIdmotor() {
        return idmotor.getSelectedIndex();
    }

    public JComboBox<String> getIdmotor() {
        return idmotor;
    }

    public void check(ItemListener a) {
        this.idmotor.addItemListener(a);
    }

    public String getAlamat() {
        return alamat.getText();
    }

    public JTextField getHarga() {
        return harga;
    }

    public String getNama() {
        return nama.getText();
    }

    public String getNoktp() {
        return noktp.getText();
    }

    public String getNotelp() {
        return notelp.getText();
    }

    public String getStatus() {
        return nopol.getText();
    }

    public String getTipe() {
        return type.getText();
    }

    public String getMerek() {
        return merek.getText();
    }

    public JTable getTabel() {
        return table;
    }

//    public JDateChooser getTglkembali() {
//        return tglkembali;
//    }
//
//    public JDateChooser getTglpinjam() {
//        return tglpinjam;
//    }
//    public String getTglkembali() {
//        return tglkembali.getText();
//    }
//
//    public String getTglpinjam() {
//        return tglpinjam.getText();
//    }
    public void setAlamat(String isi) {
        this.alamat.setText(isi);
    }

    public void setBtn_pinjam(String isi) {
        this.btn_pinjam.setText(isi);
    }

    public void setIdmotor(String[] idmotor) {
        for (String a : idmotor) {
            this.idmotor.addItem(a);
        }
    }

    public void setIdmotor(int idmotor) {
        this.idmotor.setSelectedIndex(idmotor);
    }

    public void setIdpeminjam(String isi) {
        this.idpeminjam.setText(isi);
    }

    public void setNama(String isi) {
        this.nama.setText(isi);
    }

    public void setNoktp(String isi) {
        this.noktp.setText(isi);
    }

    public void setNotelp(String isi) {
        this.notelp.setText(isi);
    }

    public void setNopol(String isi) {
        this.nopol.setText(isi);
    }

    public void setMerek(String isi) {
        this.merek.setText(isi);
    }

    public void setType(String isi) {
        this.type.setText(isi);
    }

//    public void setTglkembali(JDateChooser tglkembali) {
//        this.tglkembali = tglkembali;
//    }
//
//    public void setTglpinjam(JDateChooser tglpinjam) {
//        this.tglpinjam = tglpinjam;
//    }
//
//    public void setTglkembali(String isi) {
//        this.tglkembali.setText(isi);
//    }
//
//    public void setTglpinjam(String isi) {
//        this.tglpinjam.setText(isi);
//    }
    public void addBtnPinjamListener(ActionListener e) {
        this.btn_pinjam.addActionListener(e);
    }

    public void addBtnPengembalianListener(ActionListener e) {
        this.btn_pengembalian.addActionListener(e);
    }

    public void addBtnKeluarListener(ActionListener e) {
        this.btn_keluar.addActionListener(e);
    }
//
//    public void addBtnMotorListener(ActionListener e) {
//        this.btn_addmotor.addActionListener(e);
//    }

//    public void addBtnUserListener(ActionListener e) {
//        this.btn_adduser.addActionListener(e);
//    }

    public int getSelectedRow() {
        return table.getSelectedRow();
    }

    public void setTable(DefaultTableModel table) {
        this.table.setModel(table);
    }

    public String getValueAt(int baris, int kolom) {
        return (String) this.table.getValueAt(baris, kolom);
    }

    public void addsaveListener(ActionListener e) {
        this.btn_save.addActionListener(e);
    }

//    public void addeditListener(ActionListener e) {
//        this.btn_edit.addActionListener(e);
//    }
//
//    public void addupdateListener(ActionListener e) {
//        this.btn_update.addActionListener(e);
//    }

    public void addhapusListener(ActionListener e) {
        this.btn_delete.addActionListener(e);
    }

    public void addhitungListener(ActionListener e) {
        this.btn_hitung.addActionListener(e);
    }

    public void text(boolean status) {
        this.nama.setEnabled(status);
        this.alamat.setEnabled(status);
        this.notelp.setEnabled(status);
        this.noktp.setEnabled(status);
        this.nopol.setEnabled(status);
//        this.tglpinjam.setEnabled(status);
//        this.tglkembali.setEnabled(status);
        this.hari.setEnabled(status);
    }

    public void button(boolean status) {
        this.btn_save.setEnabled(status);
//        this.btn_edit.setEnabled(status);
//        this.btn_update.setEnabled(status);
        this.btn_delete.setEnabled(status);
        this.btn_hitung.setEnabled(status);

    }

    public void buttonsave(boolean status) {
        this.btn_save.setEnabled(status);
    }

    public void delete(boolean status) {
        this.btn_delete.setEnabled(status);
    }

//    public void buttonedit(boolean status) {
//        this.btn_edit.setEnabled(status);
//    }

//    public void buttonupdate(boolean status) {
//        this.btn_update.setEnabled(status);
//    }

    public void buttonhitung(boolean status) {
        this.btn_hitung.setEnabled(status);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        keluar = new javax.swing.JLabel();
        minimaze = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        btn_pinjam = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        btn_pengembalian = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btn_keluar = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        btn_save = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        btn_delete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nopol = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        notelp = new javax.swing.JTextField();
        noktp = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        alamat = new javax.swing.JTextField();
        idpeminjam = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        hari = new javax.swing.JTextField();
        idmotor = new javax.swing.JComboBox<>();
        btn_hitung = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        harga = new javax.swing.JTextField();
        pinjaman = new com.toedter.calendar.JDateChooser();
        kembali = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        merek = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        type = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(81, 3, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(221, 79, 67));
        jPanel2.setPreferredSize(new java.awt.Dimension(910, 43));

        keluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                keluarMouseClicked(evt);
            }
        });

        minimaze.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimazeMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 211, 181));
        jLabel2.setText("Form Peminjam");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 737, Short.MAX_VALUE)
                .addComponent(minimaze)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(keluar))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(keluar)
                    .addComponent(minimaze)
                    .addComponent(jLabel2))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 30));

        jPanel3.setBackground(new java.awt.Color(227, 148, 104));

        jPanel7.setBackground(new java.awt.Color(255, 190, 127));

        btn_pinjam.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn_pinjam.setText("Pinjam Motor");
        btn_pinjam.setBorderPainted(false);
        btn_pinjam.setContentAreaFilled(false);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_pinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_pinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 190, 127));

        btn_pengembalian.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn_pengembalian.setText("Pengembalian");
        btn_pengembalian.setBorderPainted(false);
        btn_pengembalian.setContentAreaFilled(false);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_pengembalian))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_pengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 190, 127));

        btn_keluar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn_keluar.setText("Keluar");
        btn_keluar.setBorderPainted(false);
        btn_keluar.setContentAreaFilled(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_keluar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_keluar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(222, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 930, 80));

        jPanel9.setBackground(new java.awt.Color(255, 190, 127));

        btn_save.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn_save.setText("Save");
        btn_save.setBorderPainted(false);
        btn_save.setContentAreaFilled(false);
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, -1, 60));

        jPanel11.setBackground(new java.awt.Color(255, 190, 127));

        btn_delete.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn_delete.setText("Delete");
        btn_delete.setBorderPainted(false);
        btn_delete.setContentAreaFilled(false);
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 380, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(221, 79, 67));
        jLabel1.setText("Id_Motor");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(221, 79, 67));
        jLabel3.setText("Nama");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(221, 79, 67));
        jLabel4.setText("Alamat");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(221, 79, 67));
        jLabel5.setText("NoTelp");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(221, 79, 67));
        jLabel6.setText("Harga");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(221, 79, 67));
        jLabel7.setText("Type");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, -1, -1));

        nopol.setBorder(null);
        nopol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nopolActionPerformed(evt);
            }
        });
        jPanel1.add(nopol, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 160, 210, 20));

        nama.setBorder(null);
        jPanel1.add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 210, 20));

        notelp.setBorder(null);
        jPanel1.add(notelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 210, 20));

        noktp.setBorder(null);
        jPanel1.add(noktp, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 210, 20));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(221, 79, 67));
        jLabel8.setText("Id_Peminjam");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        alamat.setBorder(null);
        jPanel1.add(alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 210, 20));
        jPanel1.add(idpeminjam, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 120, 20));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(221, 79, 67));
        jLabel9.setText("NoKTP");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(221, 79, 67));
        jLabel10.setText("No. Polisi");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, -1, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(221, 79, 67));
        jLabel11.setText("Tanggal Kembali");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, -1, -1));

        hari.setBorder(null);
        hari.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        hari.setEnabled(false);
        hari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hariActionPerformed(evt);
            }
        });
        jPanel1.add(hari, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 250, 210, 20));

        idmotor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        jPanel1.add(idmotor, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 140, -1));

        btn_hitung.setBackground(new java.awt.Color(255, 190, 127));
        btn_hitung.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn_hitung.setText("Hitung");
        btn_hitung.setBorderPainted(false);
        btn_hitung.setContentAreaFilled(false);
        btn_hitung.setOpaque(true);
        btn_hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hitungActionPerformed(evt);
            }
        });
        jPanel1.add(btn_hitung, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 320, 100, 30));

        table.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(table);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 450, 920, 110));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(221, 79, 67));
        jLabel12.setText("Lama");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, -1, -1));

        harga.setBorder(null);
        harga.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        harga.setEnabled(false);
        harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hargaActionPerformed(evt);
            }
        });
        jPanel1.add(harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 280, 210, 20));

        pinjaman.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                pinjamanPropertyChange(evt);
            }
        });
        jPanel1.add(pinjaman, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 190, 140, -1));

        kembali.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                kembaliPropertyChange(evt);
            }
        });
        jPanel1.add(kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 220, 140, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(221, 79, 67));
        jLabel13.setText("Merek");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, -1, -1));

        merek.setBorder(null);
        merek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                merekActionPerformed(evt);
            }
        });
        jPanel1.add(merek, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 210, 20));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(221, 79, 67));
        jLabel14.setText("Tanggal Pinjam");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, -1, -1));

        type.setBorder(null);
        type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeActionPerformed(evt);
            }
        });
        jPanel1.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 210, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void keluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_keluarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_keluarMouseClicked

    private void minimazeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimazeMouseClicked
        this.setState(login.ICONIFIED);
    }//GEN-LAST:event_minimazeMouseClicked

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void nopolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nopolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nopolActionPerformed

    private void hariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hariActionPerformed

    private void btn_hitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hitungActionPerformed
        // TODO add your handling code here:
        //
        //        try {
        //            DateFormat df = new SimpleDateFormat("dd MMMM yyyy");
        //            Date pinjam = df.parse(pinja);
        //            Date kembali = df.parse(kemba);
        //            long pinjam1 = pinjam.getTime();
        //            long kembali1 = kembali.getTime();
        //            long diff = kembali1 - pinjam1;
        //            long lama = diff / (24 * 60 * 60 * 1000);
        //            hari.setText(Long.toString(lama) + " Hari");
        //        } catch (Exception e) {
        //            System.out.println("" + e.getMessage());
        //        }
    }//GEN-LAST:event_btn_hitungActionPerformed

    private void hargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hargaActionPerformed

    private void pinjamanPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_pinjamanPropertyChange
        // TODO add your handling code here:
        if (pinjaman.getDate() != null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            pinja = simpleDateFormat.format(pinjaman.getDate());
        }
    }//GEN-LAST:event_pinjamanPropertyChange

    private void kembaliPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_kembaliPropertyChange
        // TODO add your handling code here:
        if (kembali.getDate() != null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            kemba = simpleDateFormat.format(kembali.getDate());
        }
    }//GEN-LAST:event_kembaliPropertyChange

    private void merekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_merekActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_merekActionPerformed

    private void typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeActionPerformed

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
            java.util.logging.Logger.getLogger(peminjampega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(peminjampega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(peminjampega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(peminjampega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new peminjampega().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamat;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_hitung;
    private javax.swing.JButton btn_keluar;
    private javax.swing.JButton btn_pengembalian;
    private javax.swing.JButton btn_pinjam;
    private javax.swing.JButton btn_save;
    private javax.swing.JTextField harga;
    private javax.swing.JTextField hari;
    private javax.swing.JComboBox<String> idmotor;
    private javax.swing.JLabel idpeminjam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel keluar;
    private com.toedter.calendar.JDateChooser kembali;
    private javax.swing.JTextField merek;
    private javax.swing.JLabel minimaze;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField noktp;
    private javax.swing.JTextField nopol;
    private javax.swing.JTextField notelp;
    private com.toedter.calendar.JDateChooser pinjaman;
    private javax.swing.JTable table;
    private javax.swing.JTextField type;
    // End of variables declaration//GEN-END:variables

    public JTextField getHari() {
        return hari;
    }
}
