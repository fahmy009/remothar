/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import controller.c_addmotor;
import javax.swing.JComboBox;
import javax.swing.JLabel;

/**
 *
 * @author Muhtar
 */
public class addMotor extends javax.swing.JFrame {

    public addMotor() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

//    public String getStatusmotor() {
//        return statusmotor.getSelectedItem().toString();
//    }
//
//    public void setStatusmotor(int statusmotor) {
//        this.statusmotor.setSelectedIndex(statusmotor);
//    }

    public String getIdtor() {
        return idtor.getText();
    }

    public String getHargasewa() {
        return hargasewa.getText();
    }

    public String getMerekmotor() {
        return merekmotor.getText();
    }

    public String getNopol() {
        return nopol.getText();
    }

    public String getTypemotor() {
        return typemotor.getText();
    }

    public String getTahun() {
        return tahun.getText();
    }

    public void setIdtor(String isi) {
        this.idtor.setText(isi);
    }

    public void setHargasewa(String isi) {
        this.hargasewa.setText(isi);
    }

    public void setMerekmotor(String isi) {
        this.merekmotor.setText(isi);
    }

    public void setNopol(String isi) {
        this.nopol.setText(isi);
    }

    public void setTypemotor(String isi) {
        this.typemotor.setText(isi);
    }

    public void setTahun(String isi) {
        this.tahun.setText(isi);
    }

    public void addBtnAddUserListener(ActionListener e) {
        this.btn_adduser.addActionListener(e);
    }

    public void addBtnPinjamListener(ActionListener e) {
        this.btn_pinjam.addActionListener(e);
    }

    public void addBtnPengembalianListener(ActionListener e) {
        this.btn_pengembalian.addActionListener(e);
    }

    public void addBtnKeluarListener(ActionListener e) {
        this.btn_keluar.addActionListener(e);
    }

    public int getSelectedRow() {
        return table.getSelectedRow();
    }

    public void setTable(DefaultTableModel table) {
        this.table.setModel(table);
    }

    public String getValueAt(int baris, int kolom) {
        return (String) this.table.getValueAt(baris, kolom);
    }

    public void addsavemotorListener(ActionListener e) {
        this.btn_save.addActionListener(e);
    }

    public void addeditmotorListener(ActionListener e) {
        this.btn_editmotor.addActionListener(e);
    }

    public void addupdatemotorListener(ActionListener e) {
        this.btn_updatemotor.addActionListener(e);
    }

    public void addhapusmotorListener(ActionListener e) {
        this.btn_deletemotor.addActionListener(e);
    }

    public void message(String pesan) {
        JOptionPane.showMessageDialog(this, pesan);
    }

    public void text(boolean status) {
        this.merekmotor.setEnabled(status);
        this.typemotor.setEnabled(status);
        this.tahun.setEnabled(status);
        this.nopol.setEnabled(status);
        this.hargasewa.setEnabled(status);
    }

    public void button(boolean status) {
        this.btn_save.setEnabled(status);
        this.btn_editmotor.setEnabled(status);
        this.btn_updatemotor.setEnabled(status);
        this.btn_deletemotor.setEnabled(status);
    }

    public void buttonsave(boolean status) {
        this.btn_save.setEnabled(status);
    }

    public void delete(boolean status) {
        this.btn_deletemotor.setEnabled(status);
    }

    public void buttonedit(boolean status) {
        this.btn_editmotor.setEnabled(status);
    }

    public void buttonupdate(boolean status) {
        this.btn_updatemotor.setEnabled(status);
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
        jPanel4 = new javax.swing.JPanel();
        btn_addmotor = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        btn_pinjam = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        btn_pengembalian = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        btn_adduser = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btn_keluar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        btn_save = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        btn_editmotor = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        btn_deletemotor = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        merekmotor = new javax.swing.JTextField();
        typemotor = new javax.swing.JTextField();
        nopol = new javax.swing.JTextField();
        hargasewa = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tahun = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        btn_updatemotor = new javax.swing.JButton();
        idtor = new javax.swing.JLabel();

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
        jLabel2.setText("Add Motor");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 719, Short.MAX_VALUE)
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

        jPanel4.setBackground(new java.awt.Color(255, 190, 127));

        btn_addmotor.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn_addmotor.setText("Add Motor");
        btn_addmotor.setBorderPainted(false);
        btn_addmotor.setContentAreaFilled(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_addmotor, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_addmotor, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

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

        jPanel8.setBackground(new java.awt.Color(255, 190, 127));

        btn_adduser.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn_adduser.setText("Add User");
        btn_adduser.setBorderPainted(false);
        btn_adduser.setContentAreaFilled(false);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_adduser, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_adduser, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addComponent(btn_keluar, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_keluar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 930, 80));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id_Motor", "merek", "type", "tahun", "nopol", "harga", "status"
            }
        ));
        jScrollPane1.setViewportView(table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 430, 570, 110));

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

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, -1, 60));

        jPanel10.setBackground(new java.awt.Color(255, 190, 127));

        btn_editmotor.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn_editmotor.setText("Edit");
        btn_editmotor.setBorderPainted(false);
        btn_editmotor.setContentAreaFilled(false);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_editmotor, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_editmotor, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, -1, 60));

        jPanel11.setBackground(new java.awt.Color(255, 190, 127));

        btn_deletemotor.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn_deletemotor.setText("Delete");
        btn_deletemotor.setBorderPainted(false);
        btn_deletemotor.setContentAreaFilled(false);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_deletemotor, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_deletemotor, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 360, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(221, 79, 67));
        jLabel1.setText("Merek Motor");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(221, 79, 67));
        jLabel3.setText("Type Motor");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(221, 79, 67));
        jLabel4.setText("Tahun Produksi");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(221, 79, 67));
        jLabel5.setText("No. Polisi");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(221, 79, 67));
        jLabel6.setText("Harga Sewa");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, -1, -1));

        merekmotor.setBackground(new java.awt.Color(255, 190, 127));
        merekmotor.setBorder(null);
        merekmotor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                merekmotorActionPerformed(evt);
            }
        });
        jPanel1.add(merekmotor, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 390, 20));

        typemotor.setBackground(new java.awt.Color(255, 190, 127));
        typemotor.setBorder(null);
        jPanel1.add(typemotor, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 390, 20));

        nopol.setBackground(new java.awt.Color(255, 190, 127));
        nopol.setBorder(null);
        jPanel1.add(nopol, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 390, 20));

        hargasewa.setBackground(new java.awt.Color(255, 190, 127));
        hargasewa.setBorder(null);
        jPanel1.add(hargasewa, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 390, 20));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(221, 79, 67));
        jLabel8.setText("Id_Motor");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        tahun.setBackground(new java.awt.Color(255, 190, 127));
        tahun.setBorder(null);
        jPanel1.add(tahun, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 390, 20));

        jPanel12.setBackground(new java.awt.Color(255, 190, 127));

        btn_updatemotor.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn_updatemotor.setText("Update");
        btn_updatemotor.setBorderPainted(false);
        btn_updatemotor.setContentAreaFilled(false);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_updatemotor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_updatemotor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, -1, -1));

        idtor.setForeground(new java.awt.Color(81, 3, 0));
        jPanel1.add(idtor, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 120, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void keluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_keluarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_keluarMouseClicked

    private void minimazeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimazeMouseClicked
        this.setState(login.ICONIFIED);
    }//GEN-LAST:event_minimazeMouseClicked

    private void merekmotorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_merekmotorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_merekmotorActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_saveActionPerformed

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
            java.util.logging.Logger.getLogger(addMotor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addMotor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addMotor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addMotor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addMotor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_addmotor;
    private javax.swing.JButton btn_adduser;
    private javax.swing.JButton btn_deletemotor;
    private javax.swing.JButton btn_editmotor;
    private javax.swing.JButton btn_keluar;
    private javax.swing.JButton btn_pengembalian;
    private javax.swing.JButton btn_pinjam;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btn_updatemotor;
    private javax.swing.JTextField hargasewa;
    private javax.swing.JLabel idtor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel keluar;
    private javax.swing.JTextField merekmotor;
    private javax.swing.JLabel minimaze;
    private javax.swing.JTextField nopol;
    private javax.swing.JTable table;
    private javax.swing.JTextField tahun;
    private javax.swing.JTextField typemotor;
    // End of variables declaration//GEN-END:variables

}