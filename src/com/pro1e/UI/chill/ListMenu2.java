/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pro1e.UI.chill;

import com.pro1e.UI.MainF;

/**
 *
 * @author huyNQph11019
 */
public class ListMenu2 extends javax.swing.JPanel {

    MainF m;

    /**
     * Creates new form ListMenu2
     */
    public ListMenu2(MainF m) {
        initComponents();
        this.m = m;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(" SỰ KIỆN");

        setBackground(new java.awt.Color(8, 3, 12));
        setForeground(new java.awt.Color(8, 3, 12));
        setPreferredSize(new java.awt.Dimension(187, 600));
        setLayout(new java.awt.GridLayout(10, 0));

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(187, 50));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pro1e/icon/icons8_project_24px.png"))); // NOI18N
        jPanel1.add(jLabel1, java.awt.BorderLayout.LINE_START);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" SỰ KIỆN");
        jPanel1.add(jLabel2, java.awt.BorderLayout.CENTER);

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator1, java.awt.BorderLayout.PAGE_START);

        add(jPanel1);

        jPanel2.setBackground(new java.awt.Color(8, 3, 12));
        jPanel2.setPreferredSize(new java.awt.Dimension(187, 50));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pro1e/icon/icons8_report_file_24px.png"))); // NOI18N
        jPanel2.add(jLabel3, java.awt.BorderLayout.LINE_START);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText(" BÁO CÁO");
        jPanel2.add(jLabel8, java.awt.BorderLayout.CENTER);

        add(jPanel2);

        jPanel5.setBackground(new java.awt.Color(8, 3, 12));
        jPanel5.setPreferredSize(new java.awt.Dimension(187, 50));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pro1e/icon/icons8_job_seeker_24px.png"))); // NOI18N
        jPanel5.add(jLabel7, java.awt.BorderLayout.LINE_START);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText(" THÀNH VIÊN");
        jPanel5.add(jLabel9, java.awt.BorderLayout.CENTER);

        add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(8, 3, 12));
        jPanel6.setPreferredSize(new java.awt.Dimension(187, 50));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pro1e/icon/icons8_home_24px.png"))); // NOI18N
        jPanel6.add(jLabel10, java.awt.BorderLayout.LINE_START);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("TRANG CHỦ");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel11, java.awt.BorderLayout.CENTER);

        add(jPanel6);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        m.openNol();
    }//GEN-LAST:event_jLabel11MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

}
