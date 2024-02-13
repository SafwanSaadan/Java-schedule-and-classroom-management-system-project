/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projecttable.UI;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import projecttable.Database;
import projecttable.Department;
import projecttable.Teacher;

/**
 *
 * @author Safwan
 */
public class DepartmentUI extends javax.swing.JFrame {

    /**
     * Creates new form DepartmentUI
     */
    public DepartmentUI() {
        initComponents();
        show_Department();
    }

        
    Department dept = new Department();
    public void show_Department(){ 
    Department dept = new Department();
    List<Department> list = dept.display();
     DefaultTableModel tabModel = (DefaultTableModel)table_Department.getModel();
     Object[] row = new Object[2];
     for (int i = 0; i < list.size(); i++) {
        row[1] = list.get(i).getDepartmentId();
        row[0] = list.get(i).getDepartmentName();
        tabModel.addRow(row);
    }
                
}
    
    private void clear(){
            textDeptName.setText("");
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jToolBar2 = new javax.swing.JToolBar();
        jLayeredPane4 = new javax.swing.JLayeredPane();
        jButton4 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_Department = new javax.swing.JTable();
        labTableName = new javax.swing.JLabel();
        bUpdate = new javax.swing.JButton();
        bPrint = new javax.swing.JButton();
        bAdd = new javax.swing.JButton();
        bClear = new javax.swing.JButton();
        bDelete = new javax.swing.JButton();
        search = new javax.swing.JButton();
        labMajor1 = new javax.swing.JLabel();
        textDeptName = new javax.swing.JTextField();
        textDeptSearch = new javax.swing.JTextField();
        bExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jToolBar2.setRollover(true);
        jToolBar2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton4.setText("الجداول الدراسية");
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(102, 255, 255));
        jButton8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton8.setText("الاقسام");
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jButton9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton9.setText("التخصصات");
        jButton9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton10.setText("المعلمين");
        jButton10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton11.setText("القاعات ");
        jButton11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton11.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton12.setText("المواد");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jLayeredPane4.setLayer(jButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jButton8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jButton9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jButton10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jButton11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jButton12, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane4Layout = new javax.swing.GroupLayout(jLayeredPane4);
        jLayeredPane4.setLayout(jLayeredPane4Layout);
        jLayeredPane4Layout.setHorizontalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane4Layout.setVerticalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton10)
                        .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton9, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jButton11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton12, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        jToolBar2.add(jLayeredPane4);

        table_Department.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        table_Department.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "اسم القسم", "رقم القسم"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_Department.setColumnSelectionAllowed(true);
        table_Department.setRowHeight(30);
        jScrollPane1.setViewportView(table_Department);
        table_Department.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        labTableName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labTableName.setForeground(new java.awt.Color(255, 255, 51));
        labTableName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labTableName.setText("اسم القسم");

        bUpdate.setBackground(new java.awt.Color(51, 51, 255));
        bUpdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bUpdate.setForeground(new java.awt.Color(255, 255, 255));
        bUpdate.setText("تحديث");
        bUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bUpdateMouseClicked(evt);
            }
        });
        bUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUpdateActionPerformed(evt);
            }
        });

        bPrint.setBackground(new java.awt.Color(51, 51, 51));
        bPrint.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bPrint.setForeground(new java.awt.Color(255, 255, 255));
        bPrint.setText("طباعة");
        bPrint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bPrintMouseClicked(evt);
            }
        });
        bPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPrintActionPerformed(evt);
            }
        });

        bAdd.setBackground(new java.awt.Color(0, 153, 0));
        bAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bAdd.setForeground(new java.awt.Color(255, 255, 255));
        bAdd.setText("إضافة");
        bAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bAddMouseClicked(evt);
            }
        });
        bAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddActionPerformed(evt);
            }
        });

        bClear.setBackground(new java.awt.Color(102, 102, 102));
        bClear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bClear.setForeground(new java.awt.Color(255, 255, 255));
        bClear.setText("تفريغ");
        bClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bClearMouseClicked(evt);
            }
        });
        bClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bClearActionPerformed(evt);
            }
        });

        bDelete.setBackground(new java.awt.Color(204, 0, 0));
        bDelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bDelete.setForeground(new java.awt.Color(255, 255, 255));
        bDelete.setText("حذف");
        bDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bDeleteMouseClicked(evt);
            }
        });
        bDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeleteActionPerformed(evt);
            }
        });

        search.setBackground(new java.awt.Color(0, 153, 153));
        search.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        search.setForeground(new java.awt.Color(255, 255, 255));
        search.setText("بحث");
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMouseClicked(evt);
            }
        });
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        labMajor1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labMajor1.setForeground(new java.awt.Color(255, 255, 51));
        labMajor1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labMajor1.setText("ادخل بيانات القسم الذي تريد البحث عنها");

        textDeptName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textDeptName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDeptNameActionPerformed(evt);
            }
        });

        textDeptSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textDeptSearch.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textDeptSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textDeptSearchKeyReleased(evt);
            }
        });

        bExit.setBackground(new java.awt.Color(102, 0, 0));
        bExit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bExit.setForeground(new java.awt.Color(255, 255, 255));
        bExit.setText("خروج");
        bExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bExitMouseClicked(evt);
            }
        });
        bExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExitActionPerformed(evt);
            }
        });

        jLayeredPane3.setLayer(jToolBar2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(labTableName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(bUpdate, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(bPrint, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(bAdd, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(bClear, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(bDelete, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(search, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(labMajor1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(textDeptName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(textDeptSearch, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(bExit, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jLayeredPane3Layout.createSequentialGroup()
                        .addComponent(textDeptSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labMajor1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane3Layout.createSequentialGroup()
                        .addComponent(textDeptName, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                        .addGap(11, 11, 11)
                        .addComponent(labTableName, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bPrint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bExit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labTableName)
                    .addComponent(search)
                    .addComponent(labMajor1)
                    .addComponent(textDeptName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textDeptSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane3Layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(bAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(bClear)
                        .addGap(18, 18, 18)
                        .addComponent(bDelete)
                        .addGap(12, 12, 12)
                        .addComponent(bPrint)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bExit)
                        .addContainerGap())
                    .addGroup(jLayeredPane3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(10, 10, 10))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane3)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane3)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        MainUI m = new MainUI();
        m.setSize(1366, 750);
        m.setLocation(0, 0);
        m.setResizable(false);
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        TeacherUI d = new TeacherUI();
        d.setSize(1366, 750);
        d.setLocation(0, 0);
        d.setResizable(false);
        d.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        ClassroomUI c = new ClassroomUI();
        c.setSize(1366, 750);
        c.setLocation(0, 0);
        c.setResizable(false);
        c.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        CourseUI co = new CourseUI();
        co.setSize(1366, 750);
        co.setLocation(0, 0);
        co.setResizable(false);
        co.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void bUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bUpdateMouseClicked

    }//GEN-LAST:event_bUpdateMouseClicked

    private void bUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUpdateActionPerformed

        DefaultTableModel tabModel = (DefaultTableModel)table_Department.getModel();


        if(table_Department.getSelectedRowCount() == 1){
            if(textDeptName.getText().equals("")){  
                     JOptionPane.showMessageDialog(this, "يجب ادخال قيمة في حقل اسم القيم ...");
             }else{
                
            String id = tabModel.getValueAt(table_Department.getSelectedRow(), 1).toString();
            int depId = Integer.parseInt(id);
            String name = textDeptName.getText();

                //            وضع القيم في الحقول
                tabModel.setValueAt(name, table_Department.getSelectedRow(), 0);

                Department dep  =  new Department(depId,name);
                Department.updateDepartment(dep);

                JOptionPane.showMessageDialog(this, "تم التحديث بنجاح ..");

                clear();
            }
           }else{
            if(table_Department.getSelectedRowCount() == 0){
                JOptionPane.showMessageDialog(this, "الرجاء تحديد الصف الذي تريد تحديثه ..");
            }else{
                JOptionPane.showMessageDialog(this, "الرجاء تحديد صف واحد فقط ..");
            }
        }

    }//GEN-LAST:event_bUpdateActionPerformed

    private void bPrintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bPrintMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bPrintMouseClicked

    private void bPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPrintActionPerformed
            // Create some data
//        String str = textClassSearch.getText();
        DefaultTableModel tabModel = (DefaultTableModel)table_Department.getModel();
//        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(tabModel);
//        table_Class.setRowSorter(trs);
//        trs.setRowFilter(RowFilter.regexFilter(str));
//        trs.getRowFilter();
        
        // Create a table
        int tableWidth = tabModel.getColumnCount() * 100; // تعديل العرض حسب احتياجاتك
        int tableHeight = tabModel.getRowCount() * 25; // تعديل الارتفاع حسب احتياجاتك
                                                         
        JTable table = new JTable(tabModel);
        table.setSize(tableWidth, tableHeight);
        
        // Create a window
        JFrame frame = new JFrame();
        frame.add(new JScrollPane(table));
        frame.setLocation(720, 0);
        frame.setSize(650, 600);
        frame.setVisible(true);
//        frame.pack();

        // Create a printer job
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setPrintable(new Printable() {
            public int print(Graphics g, PageFormat pf, int page) throws PrinterException {
                // Should only have one page, and page # is zero-based
                if (page > 0) {
                    return Printable.NO_SUCH_PAGE;
                }

                // Fit the table on the whole page
                double scale = Math.min(pf.getImageableWidth() / table.getWidth(), pf.getImageableHeight() / table.getHeight());

                Graphics2D g2 = (Graphics2D) g;
                g2.translate(pf.getImageableX(), pf.getImageableY());
                g2.scale(scale, scale);
                table.print(g2);

                return Printable.PAGE_EXISTS;
            }
        });

        // Show the print dialog and print
        if (job.printDialog()) {
            try {
                job.print();
            } catch (PrinterException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_bPrintActionPerformed

    private void bAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bAddMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bAddMouseClicked

    private void bAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddActionPerformed

        if( textDeptName.getText().equals("")){

            JOptionPane.showMessageDialog(this, "الرجاء إدخال قيمة في حقل الاسم ..");
        }else{
            int id = Database.count("dep_id","Departments")+1;
            String depId = Integer.toString(id);
            String name = textDeptName.getText();

            String data[] = {name,depId};

            DefaultTableModel tabModel = (DefaultTableModel)table_Department.getModel();
            tabModel.addRow(data);
            JOptionPane.showMessageDialog(this, "تم إضافة البيانات بنجاح ..");

            Department te = new Department(id,name);
            Department.addDepartment(te);

            clear();
        }
    }//GEN-LAST:event_bAddActionPerformed

    private void bClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bClearMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bClearMouseClicked

    private void bClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bClearActionPerformed
        clear();
    }//GEN-LAST:event_bClearActionPerformed

    private void bDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bDeleteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bDeleteMouseClicked

    private void bDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeleteActionPerformed

        DefaultTableModel tabModel = (DefaultTableModel)table_Department.getModel();

        if(table_Department.getSelectedRowCount() == 1){
            
            String d = tabModel.getValueAt(table_Department.getSelectedRow(), 1).toString();
            dept.delete(Integer.parseInt(d));
            tabModel.removeRow(table_Department.getSelectedRow());
        }else{
            if(table_Department.getSelectedRowCount() == 0){
                JOptionPane.showMessageDialog(this, "الرجاء تحديد صف ..!!");
            }else{
                JOptionPane.showMessageDialog(this, "الرجاء تحديد صف واحد فقط ..");
            }
        }
    }//GEN-LAST:event_bDeleteActionPerformed

    private void searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_searchMouseClicked

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed

        String n = textDeptSearch.getText();
        search(n);

    }//GEN-LAST:event_searchActionPerformed

     public void search (String str){
            DefaultTableModel tabModel = (DefaultTableModel)table_Department.getModel();
            TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(tabModel);
            table_Department.setRowSorter(trs);
            trs.setRowFilter(RowFilter.regexFilter(str));
    }
    
    private void textDeptNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDeptNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textDeptNameActionPerformed

    private void textDeptSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textDeptSearchKeyReleased
      String n = textDeptSearch.getText();
      search(n);
    }//GEN-LAST:event_textDeptSearchKeyReleased

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        MajorUI d = new MajorUI();
        d.setSize(1366, 750);
        d.setResizable(false);
        d.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void bExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bExitMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bExitMouseClicked

    private void bExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bExitActionPerformed

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
            java.util.logging.Logger.getLogger(DepartmentUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DepartmentUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DepartmentUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DepartmentUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DepartmentUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAdd;
    private javax.swing.JButton bClear;
    private javax.swing.JButton bDelete;
    private javax.swing.JButton bExit;
    private javax.swing.JButton bPrint;
    private javax.swing.JButton bUpdate;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLayeredPane jLayeredPane4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JLabel labMajor1;
    private javax.swing.JLabel labTableName;
    private javax.swing.JButton search;
    private javax.swing.JTable table_Department;
    private javax.swing.JTextField textDeptName;
    private javax.swing.JTextField textDeptSearch;
    // End of variables declaration//GEN-END:variables
}
