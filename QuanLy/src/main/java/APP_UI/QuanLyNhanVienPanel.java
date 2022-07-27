/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package APP_UI;

import Dao.NhanVienDao;
import Helpers.DataValidator;
import Helpers.MessageDialogHelper;
import Model.NhanVien;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class QuanLyNhanVienPanel extends javax.swing.JPanel {
 private  MainForm parentForm;
 private DefaultTableModel tblModel;
 
    /**
     * Creates new form QuanLyNhanVienPanel
     */
    public QuanLyNhanVienPanel() {
        initComponents();
        initTable();
        loadDaTaToTable();
    }
    private void initTable(){
        tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(new String[]{"Mã Nhân Viên","Họ Tên","Tuổi","Địa chỉ","Sdt","Quê Quán"});
        tblQLNV.setModel(tblModel);
    }
 
    private void loadDaTaToTable(){
        try{
            NhanVienDao dao = new NhanVienDao();
            List<NhanVien> list = dao.finadAll();
            tblModel.setRowCount(0);
            for (NhanVien x : list) {
                tblModel.addRow(new Object[]{
                    x.getMaNhanVien(),x.getHoTen(),x.getTuoi(),
                    x.getDiaChi(),x.getSdt(),x.getQueQuan()
                });
            }
            tblModel.fireTableDataChanged();
        } catch(Exception e){
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(parentForm,e.getMessage(),"Lỗi");
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblMaNhanVien = new javax.swing.JLabel();
        lblTenNhanVien = new javax.swing.JLabel();
        lblTuoi = new javax.swing.JLabel();
        lblDiaChi = new javax.swing.JLabel();
        lblSDT = new javax.swing.JLabel();
        lblQueQuan = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        txtTenNV = new javax.swing.JTextField();
        txtTuoi = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        txtQueQuan = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnThemMoi = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        bntXoa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblQLNV = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Quản Lý Nhân Viên");

        lblMaNhanVien.setText("Mã Nhân Viên");

        lblTenNhanVien.setText("Tên Nhân Viên");

        lblTuoi.setText("Tuổi");

        lblDiaChi.setText("Địa chỉ");

        lblSDT.setText("SDT");

        lblQueQuan.setText("Quê quán");

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnThemMoi.setText("Thêm Mới");
        btnThemMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemMoiActionPerformed(evt);
            }
        });

        btnCapNhat.setText("Cập nhật");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        bntXoa.setText("Xóa");
        bntXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntXoaActionPerformed(evt);
            }
        });

        tblQLNV.setModel(new javax.swing.table.DefaultTableModel(
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
        tblQLNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblQLNVMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblQLNV);

        jLabel2.setText("Tìm Kiếm Nhân Viên");

        btnTimKiem.setText("Tìm Kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(183, 183, 183)
                            .addComponent(jLabel1))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(60, 60, 60)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnTimKiem))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblTenNhanVien)
                                        .addComponent(lblTuoi, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblDiaChi, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblSDT, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblQueQuan, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblMaNhanVien, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGap(61, 61, 61)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtMaNV)
                                        .addComponent(txtTenNV)
                                        .addComponent(txtTuoi)
                                        .addComponent(txtDiaChi)
                                        .addComponent(txtSDT)
                                        .addComponent(txtQueQuan, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnThem)
                                    .addGap(42, 42, 42)
                                    .addComponent(btnThemMoi)
                                    .addGap(43, 43, 43)
                                    .addComponent(btnCapNhat)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                                    .addComponent(bntXoa)
                                    .addGap(14, 14, 14)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaNhanVien)
                    .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTenNhanVien)
                    .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTuoi)
                    .addComponent(txtTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDiaChi)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSDT)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblQueQuan)
                    .addComponent(txtQueQuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnThemMoi)
                    .addComponent(btnCapNhat)
                    .addComponent(bntXoa))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemMoiActionPerformed
        // TODO add your handling code here:
           txtMaNV.setText("");
        txtTenNV.setText("");
        txtTuoi.setText("");
        txtDiaChi.setText("");
        txtSDT.setText("");
        txtQueQuan.setText("");
    }//GEN-LAST:event_btnThemMoiActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        StringBuilder sb = new StringBuilder();
        DataValidator.validateEmply(txtMaNV, sb, "mã nhân viên không được để trống");
        DataValidator.validateEmply(txtTenNV, sb, "tên nhân viên không được để trống");
        DataValidator.validateEmply(txtTuoi, sb, "Tuổi nhân viên không được để trống");
        DataValidator.validateEmply(txtDiaChi, sb, "Địa Chỉ nhân viên không được để trống");
        DataValidator.validateEmply(txtSDT, sb, "SDT nhân viên không được để trống");
        DataValidator.validateEmply(txtQueQuan, sb, "Quê Quán nhân viên không được để trống");
        if(sb.length()>0){
            MessageDialogHelper.showErrorDialog(parentForm, sb.toString(),"lỗi");
            return;
        }
        
        try{
            NhanVien nv = new NhanVien();
            nv.setMaNhanVien(txtMaNV.getText());
            nv.setHoTen(txtTenNV.getText());
            nv.setTuoi(Integer.parseInt(txtTuoi.getText()));
            nv.setDiaChi(txtDiaChi.getText());
            nv.setSdt(txtSDT.getText());
            nv.setQueQuan(txtQueQuan.getText());
            
            NhanVienDao dao = new NhanVienDao();
            if(dao.insert(nv)){
                MessageDialogHelper.showMessageDialog(parentForm, "Nhân viên đã được lưu", "Thông báo");
                loadDaTaToTable();
            } else {
                 MessageDialogHelper.showMessageDialog(parentForm, "Nhân viên không lưu được ", "Cảnh báo");
            }
        } catch(Exception e){
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(parentForm,e.getMessage(),"Lỗi");
        }

    }//GEN-LAST:event_btnThemActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        // TODO add your handling code here:
           StringBuilder sb = new StringBuilder();
        DataValidator.validateEmply(txtMaNV, sb, "mã nhân viên không được để trống");
        DataValidator.validateEmply(txtTenNV, sb, "tên nhân viên không được để trống");
        DataValidator.validateEmply(txtTuoi, sb, "Tuổi nhân viên không được để trống");
        DataValidator.validateEmply(txtDiaChi, sb, "Địa Chỉ nhân viên không được để trống");
        DataValidator.validateEmply(txtSDT, sb, "SDT nhân viên không được để trống");
        DataValidator.validateEmply(txtQueQuan, sb, "Quê Quán nhân viên không được để trống");
        if(sb.length()>0){
            MessageDialogHelper.showErrorDialog(parentForm, sb.toString(),"lỗi");
            return;
        }
        if(MessageDialogHelper.showConfirmDialog(parentForm, "bạn có muốn cập nhật nhân viên không?","hỏi")==JOptionPane.NO_OPTION){
            return;
        }
           
     try{
              NhanVien nv = new NhanVien();
            nv.setMaNhanVien(txtMaNV.getText());
            nv.setHoTen(txtTenNV.getText());
            nv.setTuoi(Integer.parseInt(txtTuoi.getText()));
            nv.setDiaChi(txtDiaChi.getText());
            nv.setSdt(txtSDT.getText());
            nv.setQueQuan(txtQueQuan.getText());
            
            NhanVienDao dao = new NhanVienDao();
            if(dao.update(nv)){
                MessageDialogHelper.showMessageDialog(parentForm, "Nhân viên đã được cập nhật", "Thông báo");
                loadDaTaToTable();
            } else {
                 MessageDialogHelper.showMessageDialog(parentForm, "Nhân viên không được cập nhật ", "Cảnh báo");
            }
     }catch(Exception e){
         e.printStackTrace();
             MessageDialogHelper.showErrorDialog(parentForm,e.getMessage(),"Lỗi");}
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void bntXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntXoaActionPerformed
        // TODO add your handling code here:
                 StringBuilder sb = new StringBuilder();
        DataValidator.validateEmply(txtMaNV, sb, "mã nhân viên không được để trống");
       
        if(sb.length()>0){
            MessageDialogHelper.showErrorDialog(parentForm, sb.toString(),"lỗi");
            return;
        }
        if(MessageDialogHelper.showConfirmDialog(parentForm, "bạn có muốn xóa nhân viên không?","hỏi")==JOptionPane.NO_OPTION){
            return;
        }
        try{
            NhanVienDao dao = new NhanVienDao();
            if(dao.delete(txtMaNV.getText())){
                MessageDialogHelper.showMessageDialog(parentForm, "Nhân viên đã được xóa", "Thông báo");
                loadDaTaToTable();
                btnThemMoiActionPerformed(evt);
            } else {
                 MessageDialogHelper.showMessageDialog(parentForm, "Nhân viên không xóa được do lỗi ", "Cảnh báo");
            }
        } catch(Exception e){
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(parentForm,e.getMessage(),"Lỗi");
        }
    }//GEN-LAST:event_bntXoaActionPerformed

    private void tblQLNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblQLNVMouseClicked
        // TODO add your handling code here:
        try{
            int row = tblQLNV.getSelectedRow();
            if(row>=0){
                String id = (String) tblQLNV.getValueAt(row, 0);
                NhanVienDao dao = new NhanVienDao();
                NhanVien nv = dao.findById(id);
                
                if(nv != null){
                    txtMaNV.setText(nv.getMaNhanVien());
                    txtTenNV.setText(nv.getHoTen());
                    txtTuoi.setText(Integer.toString(nv.getTuoi()));
                    txtDiaChi.setText(nv.getDiaChi());
                    txtSDT.setText(nv.getSdt());
                    txtQueQuan.setText(nv.getQueQuan());
                }
            }
        }catch(Exception e){
            e.printStackTrace();
              MessageDialogHelper.showErrorDialog(parentForm,e.getMessage(),"Lỗi");
        }
    }//GEN-LAST:event_tblQLNVMouseClicked

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        // TODO add your handling code here:
          StringBuilder sb = new StringBuilder();
            DataValidator.validateEmply(txtTimKiem, sb, "mã nhân viên không được để trống");
       
        if(sb.length()>0){
            MessageDialogHelper.showErrorDialog(parentForm, sb.toString(),"lỗi");
            return;
        }
         try{
            NhanVienDao dao = new NhanVienDao();
            if(dao.findById(txtTimKiem.getText()) != null){
                MessageDialogHelper.showMessageDialog(parentForm, "Thông tin nhân viên đã được tìm thấy", "Thông báo");                   
           NhanVien nv = dao.findById(txtTimKiem.getText());
              txtMaNV.setText(nv.getMaNhanVien());
                    txtTenNV.setText(nv.getHoTen());
                    txtTuoi.setText(Integer.toString(nv.getTuoi()));
                    txtDiaChi.setText(nv.getDiaChi());
                    txtSDT.setText(nv.getSdt());
                    txtQueQuan.setText(nv.getQueQuan());

            } else {
                 MessageDialogHelper.showMessageDialog(parentForm, "Thông tin nhân viên không được tìm thấy ", "Cảnh báo");
                 btnThemMoiActionPerformed(evt);
            }
        } catch(Exception e){
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(parentForm,e.getMessage(),"Lỗi");
        }
    }//GEN-LAST:event_btnTimKiemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntXoa;
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThemMoi;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblDiaChi;
    private javax.swing.JLabel lblMaNhanVien;
    private javax.swing.JLabel lblQueQuan;
    private javax.swing.JLabel lblSDT;
    private javax.swing.JLabel lblTenNhanVien;
    private javax.swing.JLabel lblTuoi;
    private javax.swing.JTable tblQLNV;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtQueQuan;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenNV;
    private javax.swing.JTextField txtTimKiem;
    private javax.swing.JTextField txtTuoi;
    // End of variables declaration//GEN-END:variables



}