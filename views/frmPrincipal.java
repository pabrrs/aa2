/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import Env.Constants;
import java.sql.SQLException;
import helpers.Config;
import java.awt.Dimension;
import javax.swing.JInternalFrame;

/**
 *
 * @author qwerty
 */
public class frmPrincipal extends javax.swing.JFrame {

    public frmPrincipal(String UserName) throws SQLException {
        initComponents();
        lblUser.setText("Usuario: " + UserName);
        rbPTBR.setSelected((Config.getLang() == Constants.PT_BR));
    }

    public void showInternal(JInternalFrame obj) {
        this.desktopPane.add(obj);
        Dimension dS = desktopPane.getSize();
        Dimension ifz = obj.getSize();
        obj.setLocation((dS.width - ifz.width) / 2,
                (dS.height - ifz.height) / 2);
        obj.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jToolBar2 = new javax.swing.JToolBar();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        iashd = new javax.swing.JLabel();
        asdasdasd = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        iashd1 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        cadUser = new javax.swing.JMenuItem();
        cadFun = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        rbPTBR = new javax.swing.JRadioButtonMenuItem();
        rbENUS = new javax.swing.JRadioButtonMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SHX Principal");
        setPreferredSize(new java.awt.Dimension(1360, 740));
        setResizable(false);

        desktopPane.setBackground(new java.awt.Color(66, 66, 66));

        jToolBar2.setBackground(new java.awt.Color(93, 93, 93));
        jToolBar2.setRollover(true);

        jButton2.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/employee.png"))); // NOI18N
        jButton2.setText("Cadastrar Funcionario");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar2.add(jButton2);

        jButton1.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/clock.png"))); // NOI18N
        jButton1.setText("Registrar Ponto");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar2.add(jButton1);

        jButton3.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/report.png"))); // NOI18N
        jButton3.setText("Relatorio Horas Extras");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar2.add(jButton3);

        jButton4.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/auditoria.png"))); // NOI18N
        jButton4.setText("Auditoria");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBar2.add(jButton4);

        desktopPane.add(jToolBar2);
        jToolBar2.setBounds(0, 0, 1440, 90);

        iashd.setBackground(new java.awt.Color(254, 254, 254));
        iashd.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        iashd.setForeground(new java.awt.Color(254, 254, 254));
        iashd.setText("v1.0.4");
        desktopPane.add(iashd);
        iashd.setBounds(1270, 100, 90, 30);

        asdasdasd.setBackground(new java.awt.Color(254, 254, 254));
        asdasdasd.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        asdasdasd.setForeground(new java.awt.Color(254, 254, 254));
        asdasdasd.setText("Sistema de Controle de Horas Extras");
        desktopPane.add(asdasdasd);
        asdasdasd.setBounds(10, 130, 280, 17);

        lblUser.setBackground(new java.awt.Color(254, 254, 254));
        lblUser.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        lblUser.setForeground(new java.awt.Color(254, 254, 254));
        lblUser.setText("Usuario:<usuario>");
        desktopPane.add(lblUser);
        lblUser.setBounds(10, 170, 170, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/main.png"))); // NOI18N
        desktopPane.add(jLabel1);
        jLabel1.setBounds(-80, -100, 1560, 840);

        iashd1.setBackground(new java.awt.Color(254, 254, 254));
        iashd1.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        iashd1.setForeground(new java.awt.Color(254, 254, 254));
        iashd1.setText("SHX");
        desktopPane.add(iashd1);
        iashd1.setBounds(10, 97, 60, 30);

        menuBar.setBackground(new java.awt.Color(100, 98, 98));

        jMenu3.setBackground(new java.awt.Color(254, 254, 254));
        jMenu3.setForeground(new java.awt.Color(254, 254, 254));
        jMenu3.setText("Cadastros");

        cadUser.setText("Usuarios");
        cadUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadUserActionPerformed(evt);
            }
        });
        jMenu3.add(cadUser);

        cadFun.setText("Funcionarios");
        cadFun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadFunActionPerformed(evt);
            }
        });
        jMenu3.add(cadFun);

        menuBar.add(jMenu3);

        editMenu.setBackground(new java.awt.Color(254, 254, 254));
        editMenu.setForeground(new java.awt.Color(254, 254, 254));
        editMenu.setMnemonic('e');
        editMenu.setText("Ponto");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Registrar Ponto");
        editMenu.add(cutMenuItem);

        jMenuItem3.setText("Auditoria");
        editMenu.add(jMenuItem3);

        menuBar.add(editMenu);

        helpMenu.setBackground(new java.awt.Color(254, 254, 254));
        helpMenu.setForeground(new java.awt.Color(254, 254, 254));
        helpMenu.setMnemonic('h');
        helpMenu.setText("Relatorios");

        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Funcionarios");
        helpMenu.add(contentMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("Folha de Ponto");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        jMenu1.setBackground(new java.awt.Color(254, 254, 254));
        jMenu1.setForeground(new java.awt.Color(254, 254, 254));
        jMenu1.setText("Idioma");

        rbPTBR.setText("Portugues pt-br");
        rbPTBR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pt_br.png"))); // NOI18N
        rbPTBR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPTBRActionPerformed(evt);
            }
        });
        jMenu1.add(rbPTBR);

        rbENUS.setText("Ingles en-us");
        rbENUS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/en_us.png"))); // NOI18N
        rbENUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbENUSActionPerformed(evt);
            }
        });
        jMenu1.add(rbENUS);

        menuBar.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(254, 254, 254));
        jMenu2.setForeground(new java.awt.Color(254, 254, 254));
        jMenu2.setText("Sobre");
        menuBar.add(jMenu2);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1360, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1370, 770));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        cadFun.doClick();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void rbENUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbENUSActionPerformed
        // TODO add your handling code here:
        rbPTBR.setSelected(false);
    }//GEN-LAST:event_rbENUSActionPerformed

    private void rbPTBRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPTBRActionPerformed
        // TODO add your handling code here:
        rbENUS.setSelected(false);
    }//GEN-LAST:event_rbPTBRActionPerformed

    private void cadFunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadFunActionPerformed
        infrmCadFun objFun = new infrmCadFun();
        showInternal(objFun);
    }//GEN-LAST:event_cadFunActionPerformed

    private void cadUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadUserActionPerformed
        // TODO add your handling code here:
        frmCadUsuario objCadUser = new frmCadUsuario(true);
        objCadUser.setAlwaysOnTop(true);
        objCadUser.setVisible(true);
    }//GEN-LAST:event_cadUserActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JLabel asdasdasd;
    private javax.swing.JMenuItem cadFun;
    private javax.swing.JMenuItem cadUser;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JLabel iashd;
    private javax.swing.JLabel iashd1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JLabel lblUser;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JRadioButtonMenuItem rbENUS;
    private javax.swing.JRadioButtonMenuItem rbPTBR;
    // End of variables declaration//GEN-END:variables

}
