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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import projecttable.Classroom;
import projecttable.Course;
import projecttable.Database;
import projecttable.Major;
import projecttable.Schedule;

/**
 *
 * @author Safwan
 */
public class MainUI extends javax.swing.JFrame {

    /**
     * Creates new form MainUI
     */
    public MainUI() {
        initComponents();
        clear();
        show_Schedule();
    }
    
    Schedule s = new Schedule();
    public void show_Schedule(){
        Schedule s = new Schedule();
    List<Schedule> list = s.display();
     DefaultTableModel tabModel = (DefaultTableModel)table_Main.getModel();
     Object[] row = new Object[10];
     for (int i = 0; i < list.size(); i++) {
        row[9] = list.get(i).getTableId();
        row[8] = list.get(i).getTableName();
        row[7] = list.get(i).getMajorName();
        row[6] = list.get(i).getLevel();
        row[5] = list.get(i).getCourse();
        row[4] = list.get(i).getTeacher();
        row[3] = list.get(i).getClassName();
        row[2] = list.get(i).getDay();
        row[1] = list.get(i).getStartTime();
        row[0] = list.get(i).getEndTime();
        tabModel.addRow(row);
    }
                
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
        labMajor = new javax.swing.JLabel();
        labLevel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_Main = new javax.swing.JTable();
        listDay = new javax.swing.JComboBox<>();
        textTableName = new javax.swing.JTextField();
        labTableName = new javax.swing.JLabel();
        labClass = new javax.swing.JLabel();
        labCorse = new javax.swing.JLabel();
        labDay = new javax.swing.JLabel();
        labTeachar = new javax.swing.JLabel();
        listMajor = new javax.swing.JComboBox<>();
        listLevel = new javax.swing.JComboBox<>();
        labTimeStart = new javax.swing.JLabel();
        labTimeEnd = new javax.swing.JLabel();
        listTimeEnd = new javax.swing.JComboBox<>();
        listTimeStart = new javax.swing.JComboBox<>();
        bUpdate = new javax.swing.JButton();
        bPrint = new javax.swing.JButton();
        bAdd = new javax.swing.JButton();
        bClear = new javax.swing.JButton();
        bDelete = new javax.swing.JButton();
        seve5 = new javax.swing.JButton();
        labMajor1 = new javax.swing.JLabel();
        listMajorSearch = new javax.swing.JComboBox<>();
        labLevel1 = new javax.swing.JLabel();
        listTeacher = new javax.swing.JComboBox<>();
        listClass = new javax.swing.JComboBox<>();
        listCorse = new javax.swing.JComboBox<>();
        bExit = new javax.swing.JButton();
        txetLevelSearch = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jToolBar2.setRollover(true);
        jToolBar2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jButton4.setBackground(new java.awt.Color(102, 255, 255));
        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton4.setText("الجداول الدراسية");
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton8.setText("الاقسام");
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

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

        labMajor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labMajor.setForeground(new java.awt.Color(255, 255, 51));
        labMajor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labMajor.setText("اختار التخصص");

        labLevel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labLevel.setForeground(new java.awt.Color(255, 255, 51));
        labLevel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labLevel.setText("المستوى");

        table_Main.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        table_Main.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "وقت الإنتهاء", "وقت البدأ", "اليوم", "القاعة", "الاستاذ", "المادة", "المستوى", "التخصص", "اسم الجدول", "رقم الجدول"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_Main.setColumnSelectionAllowed(true);
        table_Main.setRowHeight(30);
        jScrollPane1.setViewportView(table_Main);
        table_Main.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        listDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "السبت", "الأحد", "الإثنين", "الثلاثاء", "الأربعاء", "الخميس" }));

        textTableName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textTableName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTableNameActionPerformed(evt);
            }
        });

        labTableName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labTableName.setForeground(new java.awt.Color(255, 255, 51));
        labTableName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labTableName.setText("اسم الجدول");

        labClass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labClass.setForeground(new java.awt.Color(255, 255, 51));
        labClass.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labClass.setText("القاعة الدراسية");

        labCorse.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labCorse.setForeground(new java.awt.Color(255, 255, 51));
        labCorse.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labCorse.setText("المادة");

        labDay.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labDay.setForeground(new java.awt.Color(255, 255, 51));
        labDay.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labDay.setText("اليوم");

        labTeachar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labTeachar.setForeground(new java.awt.Color(255, 255, 51));
        labTeachar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labTeachar.setText("المدرس");

        listLevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));

        labTimeStart.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labTimeStart.setForeground(new java.awt.Color(255, 255, 51));
        labTimeStart.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labTimeStart.setText("وقت بدأ المحاضرة");

        labTimeEnd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labTimeEnd.setForeground(new java.awt.Color(255, 255, 51));
        labTimeEnd.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labTimeEnd.setText("وقت إنتهاء المحاضرة");

        listTimeEnd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10:00", "11:00", "12:00", "1:00", "2:00", "3:00", "4:00", "5:00" }));

        listTimeStart.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8:00", "9:00", "10:00", "11:00", "12:00", "1:00", "2:00", "3:00" }));

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

        seve5.setBackground(new java.awt.Color(0, 153, 153));
        seve5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        seve5.setForeground(new java.awt.Color(255, 255, 255));
        seve5.setText("بحث");
        seve5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seve5MouseClicked(evt);
            }
        });
        seve5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seve5ActionPerformed(evt);
            }
        });

        labMajor1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labMajor1.setForeground(new java.awt.Color(255, 255, 51));
        labMajor1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labMajor1.setText("اختار التخصص");

        labLevel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labLevel1.setForeground(new java.awt.Color(255, 255, 51));
        labLevel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labLevel1.setText("أو اكتب هنا");

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

        txetLevelSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txetLevelSearchKeyReleased(evt);
            }
        });

        jLayeredPane3.setLayer(jToolBar2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(labMajor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(labLevel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(listDay, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(textTableName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(labTableName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(labClass, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(labCorse, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(labDay, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(labTeachar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(listMajor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(listLevel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(labTimeStart, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(labTimeEnd, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(listTimeEnd, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(listTimeStart, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(bUpdate, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(bPrint, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(bAdd, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(bClear, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(bDelete, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(seve5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(labMajor1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(listMajorSearch, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(labLevel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(listTeacher, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(listClass, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(listCorse, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(bExit, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(txetLevelSearch, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jLayeredPane3Layout.createSequentialGroup()
                        .addComponent(txetLevelSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labLevel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(listMajorSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labMajor1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(seve5, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane3Layout.createSequentialGroup()
                        .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textTableName)
                            .addComponent(listMajor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(listLevel, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(listDay, 0, 245, Short.MAX_VALUE)
                            .addComponent(listTimeStart, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(listTimeEnd, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(listTeacher, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(listClass, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(listCorse, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labClass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labCorse, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labDay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labLevel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labTeachar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labTimeStart, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labTimeEnd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                            .addComponent(labMajor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(labTableName, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                    .addComponent(textTableName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seve5)
                    .addComponent(labMajor1)
                    .addComponent(listMajorSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labLevel1)
                    .addComponent(txetLevelSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane3Layout.createSequentialGroup()
                        .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labMajor)
                            .addComponent(listMajor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labLevel)
                            .addComponent(listLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labCorse)
                            .addComponent(listCorse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labTeachar)
                            .addComponent(listTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labClass)
                            .addComponent(listClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labDay)
                            .addComponent(listDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labTimeStart)
                            .addComponent(listTimeStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labTimeEnd)
                            .addComponent(listTimeEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addComponent(bAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(bClear)
                        .addGap(18, 18, 18)
                        .addComponent(bDelete)
                        .addGap(18, 18, 18)
                        .addComponent(bPrint)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bExit)
                        .addGap(0, 21, Short.MAX_VALUE))
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

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        TeacherUI c = new TeacherUI();
        c.setSize(1366, 750);
        c.setLocation(0, 0);
        c.setResizable(false);
        c.setVisible(true);
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

    private void textTableNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTableNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textTableNameActionPerformed

    private void bUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bUpdateMouseClicked

    }//GEN-LAST:event_bUpdateMouseClicked

    private void bUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUpdateActionPerformed
 
        DefaultTableModel tabModel = (DefaultTableModel)table_Main.getModel();
//        جلب القيم من الجدول
        if(table_Main.getSelectedRowCount() == 1){
            String id = tabModel.getValueAt(table_Main.getSelectedRow(), 9).toString();
            int tableId = Integer.parseInt(id);
            String name = textTableName.getText();
            String major = listMajor.getSelectedItem().toString();
            String level = listLevel.getSelectedItem().toString();
            String corse = listCorse.getSelectedItem().toString();
            String teacher = listTeacher.getSelectedItem().toString();
            String classRoom = listClass.getSelectedItem().toString();
            String day = listDay.getSelectedItem().toString();
            String timeStart = listTimeStart.getSelectedItem().toString();
            String timeEnd = listTimeEnd.getSelectedItem().toString();

            int level1 = 0,major_Id = 0 ,corses_Id = 0, teacher_Id = 0, class_Id = 0;
            if(level== "1"){level1 = 1;}else if(level== "2"){level1 = 2;}else if(level == "3"){level1 = 3;}else if(level == "4"){level1 = 4;}

        try {
            String query1 = "SELECT major_id FROM majors WHERE major_name= '"+major+"';";
            PreparedStatement statement1 = Database.conn().prepareStatement(query1);
            ResultSet resultSet1 = statement1.executeQuery();
        while (resultSet1.next()) {   
              major_Id = resultSet1.getInt("major_id");
        } }catch (SQLException e) {
            System.out.println("حدث خطأ أثناء استعراض الجدول!");
            e.printStackTrace();
        }
            
       try {
            String query2 = "SELECT course_id FROM courses WHERE course_name= '"+corse+"';";
            PreparedStatement statement2 = Database.conn().prepareStatement(query2);
            ResultSet resultSet2 = statement2.executeQuery();
        while (resultSet2.next()) {   
              corses_Id = resultSet2.getInt("course_id");
        } }catch (SQLException e) {
            System.out.println("حدث خطأ أثناء استعراض الجدول!");
            e.printStackTrace();
        }
            
       try {
            String query3 = "SELECT teacher_id FROM teachers WHERE teacher_name= '"+teacher+"';";
            PreparedStatement statement3 = Database.conn().prepareStatement(query3);
            ResultSet resultSet3 = statement3.executeQuery();
            while (resultSet3.next()) {   
               teacher_Id = resultSet3.getInt("teacher_id");
        } }catch (SQLException e) {
            System.out.println("حدث خطأ أثناء استعراض الجدول!");
            e.printStackTrace();
        }
               
        try {
            String query4 = "SELECT class_id FROM classrooms WHERE class_name= '"+classRoom+"';";
            PreparedStatement statement4 = Database.conn().prepareStatement(query4);
            ResultSet resultSet4 = statement4.executeQuery();
            while (resultSet4.next()) {   
               class_Id = resultSet4.getInt("class_id");
            }} catch (SQLException e) {
                System.out.println("حدث خطأ أثناء استعراض الجدول!");
                e.printStackTrace();
            }
            
             Schedule sc = new Schedule(tableId,name,major_Id,level1,corses_Id,teacher_Id,class_Id,day,timeStart,timeEnd);
             Schedule.updateSchedule(sc);
            
             //            وضع القيم في الحقول
            tabModel.setValueAt(name, table_Main.getSelectedRow(), 8);
            tabModel.setValueAt(major, table_Main.getSelectedRow(), 7);
            tabModel.setValueAt(level, table_Main.getSelectedRow(), 6);
            tabModel.setValueAt(corse, table_Main.getSelectedRow(), 5);
            tabModel.setValueAt(teacher, table_Main.getSelectedRow(), 4);
            tabModel.setValueAt(classRoom, table_Main.getSelectedRow(), 3);
            tabModel.setValueAt(day, table_Main.getSelectedRow(), 2);
            tabModel.setValueAt(timeStart, table_Main.getSelectedRow(), 1);
            tabModel.setValueAt(timeEnd, table_Main.getSelectedRow(), 0);
            
             JOptionPane.showMessageDialog(this, "تم التحديث بنجاح ..");
   
             clear();
        }else{
            if(table_Main.getSelectedRowCount() == 0){
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
        DefaultTableModel tabModel = (DefaultTableModel)table_Main.getModel();
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
        if(textTableName.getText().equals("")){  
             
             JOptionPane.showMessageDialog(this, "الرجاء ادخال قيم في الحقول ..!");
          }else{
            int id = Database.count("table_id","schedules")+1;
            String tableId = Integer.toString(id);
            String name = textTableName.getText();
            String major = listMajor.getSelectedItem().toString();
            String level = listLevel.getSelectedItem().toString();
            String corse = listCorse.getSelectedItem().toString();
            String teacher = listTeacher.getSelectedItem().toString();
            String classRoom = listClass.getSelectedItem().toString();
            String day = listDay.getSelectedItem().toString();
            String timeStart = listTimeStart.getSelectedItem().toString();
            String timeEnd = listTimeEnd.getSelectedItem().toString();

             String data[] = {timeEnd,timeStart,day,classRoom,teacher,corse,level,major,name,tableId};
             DefaultTableModel tabModel = (DefaultTableModel)table_Main.getModel();

            int level1 = 0,major_Id = 0 ,corses_Id = 0, teacher_Id = 0, class_Id = 0;
            if(level== "1"){level1 = 1;}else if(level== "2"){level1 = 2;}else if(level == "3"){level1 = 3;}else if(level == "4"){level1 = 4;}

        try {
            String query1 = "SELECT major_id FROM majors WHERE major_name= '"+major+"';";
            PreparedStatement statement1 = Database.conn().prepareStatement(query1);
            ResultSet resultSet1 = statement1.executeQuery();
        while (resultSet1.next()) {   
              major_Id = resultSet1.getInt("major_id");
        } }catch (SQLException e) {
            System.out.println("حدث خطأ أثناء استعراض الجدول!");
            e.printStackTrace();
        }
            
       try {
            String query2 = "SELECT course_id FROM courses WHERE course_name= '"+corse+"';";
            PreparedStatement statement2 = Database.conn().prepareStatement(query2);
            ResultSet resultSet2 = statement2.executeQuery();
        while (resultSet2.next()) {   
              corses_Id = resultSet2.getInt("course_id");
        } }catch (SQLException e) {
            System.out.println("حدث خطأ أثناء استعراض الجدول!");
            e.printStackTrace();
        }
            
       try {
            String query3 = "SELECT teacher_id FROM teachers WHERE teacher_name= '"+teacher+"';";
            PreparedStatement statement3 = Database.conn().prepareStatement(query3);
            ResultSet resultSet3 = statement3.executeQuery();
            while (resultSet3.next()) {   
               teacher_Id = resultSet3.getInt("teacher_id");
        } }catch (SQLException e) {
            System.out.println("حدث خطأ أثناء استعراض الجدول!");
            e.printStackTrace();
        }
               
        try {
            String query4 = "SELECT class_id FROM classrooms WHERE class_name= '"+classRoom+"';";
            PreparedStatement statement4 = Database.conn().prepareStatement(query4);
            ResultSet resultSet4 = statement4.executeQuery();
            while (resultSet4.next()) {   
               class_Id = resultSet4.getInt("class_id");
            }} catch (SQLException e) {
                System.out.println("حدث خطأ أثناء استعراض الجدول!");
                e.printStackTrace();
            }

             Schedule sc = new Schedule(id,name,major_Id,level1,corses_Id,teacher_Id,class_Id,day,timeStart,timeEnd);
             Schedule.addSchedule(sc);
             tabModel.addRow(data);
             JOptionPane.showMessageDialog(this, "تم إضافة البيانات بنجاح ..");
             clear();
        }
    }//GEN-LAST:event_bAddActionPerformed

    private void bClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bClearMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bClearMouseClicked

    private void bClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bClearActionPerformed
                clear();
    }//GEN-LAST:event_bClearActionPerformed

    private void clear(){
        String major_id = null, teacher_name = null, class_name = null, course_name = null;
        try {
            String query1 = "SELECT major_name FROM majors ;";
            PreparedStatement statement1 = Database.conn().prepareStatement(query1);
            ResultSet resultSet1 = statement1.executeQuery();
        while (resultSet1.next()) {   
               major_id = resultSet1.getString("major_name"); 
            listMajor.addItem(major_id);
            listMajorSearch.addItem(major_id);
        } }catch (SQLException e) {
        System.out.println("حدث خطأ أثناء استعراض الجدول!");
        e.printStackTrace();
    }
        
        try {
            String query3 = "SELECT teacher_name FROM teachers WHERE teacher_active= 'متوفر';";
            PreparedStatement statement3 = Database.conn().prepareStatement(query3);
            ResultSet resultSet3 = statement3.executeQuery();
        while (resultSet3.next()) {   
               teacher_name = resultSet3.getString("teacher_name"); 
            listTeacher.addItem(teacher_name);}
        } catch (SQLException e) {
        System.out.println("حدث خطأ أثناء استعراض الجدول!");
        e.printStackTrace();
    }
        
       try {
            String query2 = "SELECT course_name FROM courses ;";
            PreparedStatement statement2 = Database.conn().prepareStatement(query2);
            ResultSet resultSet2 = statement2.executeQuery();
            while (resultSet2.next()) {   
               course_name = resultSet2.getString("course_name"); 
            listCorse.addItem(course_name);}
        } catch (SQLException e) {
        System.out.println("حدث خطأ أثناء استعراض الجدول!");
        e.printStackTrace();
    }    
       
        try {
        String query4 = "SELECT class_name FROM classrooms WHERE class_active= 'متاحة';";
            PreparedStatement statement4 = Database.conn().prepareStatement(query4);
            ResultSet resultSet4 = statement4.executeQuery();
            while (resultSet4.next()) {   
               class_name = resultSet4.getString("class_name"); 
            listClass.addItem(class_name);}
        } catch (SQLException e) {
        System.out.println("حدث خطأ أثناء استعراض الجدول!");
        e.printStackTrace();
    }
        
            textTableName.setText("");
            listMajor.setSelectedIndex(0);
            listLevel.setSelectedIndex(0);
            listDay.setSelectedIndex(0);
            listTimeStart.setSelectedIndex(0);
            listTimeEnd.setSelectedIndex(0);
            listMajorSearch.setSelectedIndex(0);
    }
    
    private void bDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bDeleteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bDeleteMouseClicked

    private void bDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeleteActionPerformed
        DefaultTableModel tabModel = (DefaultTableModel)table_Main.getModel();
         
         if(table_Main.getSelectedRowCount() == 1){  
            String id = tabModel.getValueAt(table_Main.getSelectedRow(), 9).toString();
            s.delete(Integer.parseInt(id));
            tabModel.removeRow(table_Main.getSelectedRow());
          }else{
            if(table_Main.getSelectedRowCount() == 0){
                JOptionPane.showMessageDialog(this, "الرجاء تحديد صف لحذفه ..");
            }else{
                JOptionPane.showMessageDialog(this, "الرجاء تحديد صف واحد فقط ..");
            }
        }
       
    }//GEN-LAST:event_bDeleteActionPerformed

    private void seve5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seve5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_seve5MouseClicked

    private void seve5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seve5ActionPerformed
        String n = listMajorSearch.getSelectedItem().toString();
        search(n);
    }//GEN-LAST:event_seve5ActionPerformed
   public void search (String str){
        DefaultTableModel tabModel = (DefaultTableModel)table_Main.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(tabModel);
        table_Main.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
    }
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        DepartmentUI d = new DepartmentUI();
        d.setSize(1366, 750);
        d.setResizable(false);
        d.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        MajorUI d = new MajorUI();
        d.setSize(1366, 750);
        d.setResizable(false);
        d.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void bExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bExitMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bExitMouseClicked

    private void bExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bExitActionPerformed

    private void txetLevelSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txetLevelSearchKeyReleased
        String n = txetLevelSearch.getText();
        search(n);
    }//GEN-LAST:event_txetLevelSearchKeyReleased


//    String x = majorfield.getText();
//        Major major =  new Major();
//        major.search(x);
//        
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
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainUI().setVisible(true);
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
    private javax.swing.JLabel labClass;
    private javax.swing.JLabel labCorse;
    private javax.swing.JLabel labDay;
    private javax.swing.JLabel labLevel;
    private javax.swing.JLabel labLevel1;
    private javax.swing.JLabel labMajor;
    private javax.swing.JLabel labMajor1;
    private javax.swing.JLabel labTableName;
    private javax.swing.JLabel labTeachar;
    private javax.swing.JLabel labTimeEnd;
    private javax.swing.JLabel labTimeStart;
    private javax.swing.JComboBox<String> listClass;
    private javax.swing.JComboBox<String> listCorse;
    private javax.swing.JComboBox<String> listDay;
    private javax.swing.JComboBox<String> listLevel;
    private javax.swing.JComboBox<String> listMajor;
    private javax.swing.JComboBox<String> listMajorSearch;
    private javax.swing.JComboBox<String> listTeacher;
    private javax.swing.JComboBox<String> listTimeEnd;
    private javax.swing.JComboBox<String> listTimeStart;
    private javax.swing.JButton seve5;
    private javax.swing.JTable table_Main;
    private javax.swing.JTextField textTableName;
    private javax.swing.JTextField txetLevelSearch;
    // End of variables declaration//GEN-END:variables


}
