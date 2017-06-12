/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import Env.Constants;
import java.sql.SQLException;
import helpers.Config;
import helpers.Dialogs;
import helpers.Forms;
import java.awt.BorderLayout;
import java.io.InputStream;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import models.DB;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.swing.JRViewer;

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
        btn_cad_funcionario = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        iashd = new javax.swing.JLabel();
        asdasdasd = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        iashd1 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        btnCadastro = new javax.swing.JMenu();
        cadUser = new javax.swing.JMenuItem();
        cadFun = new javax.swing.JMenuItem();
        abaEditMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        abaAuditoria = new javax.swing.JMenuItem();
        abaRelatorio = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem1 = new javax.swing.JMenuItem();
        rel_holerite = new javax.swing.JMenuItem();
        abaIdioma = new javax.swing.JMenu();
        rbPTBR = new javax.swing.JRadioButtonMenuItem();
        rbENUS = new javax.swing.JRadioButtonMenuItem();
        abaSobre = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SHX Principal");
        setResizable(false);

        desktopPane.setBackground(new java.awt.Color(66, 66, 66));

        jToolBar2.setBackground(new java.awt.Color(93, 93, 93));
        jToolBar2.setRollover(true);

        btn_cad_funcionario.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        btn_cad_funcionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/employee.png"))); // NOI18N
        btn_cad_funcionario.setText("Cadastrar Funcionario");
        btn_cad_funcionario.setFocusable(false);
        btn_cad_funcionario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_cad_funcionario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_cad_funcionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cad_funcionarioActionPerformed(evt);
            }
        });
        jToolBar2.add(btn_cad_funcionario);

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

        btnCadastro.setBackground(new java.awt.Color(254, 254, 254));
        btnCadastro.setForeground(new java.awt.Color(254, 254, 254));
        btnCadastro.setText("Cadastros");

        cadUser.setText("Usuarios");
        cadUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadUserActionPerformed(evt);
            }
        });
        btnCadastro.add(cadUser);

        cadFun.setText("Funcionarios");
        cadFun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadFunActionPerformed(evt);
            }
        });
        btnCadastro.add(cadFun);

        menuBar.add(btnCadastro);

        abaEditMenu.setBackground(new java.awt.Color(254, 254, 254));
        abaEditMenu.setForeground(new java.awt.Color(254, 254, 254));
        abaEditMenu.setMnemonic('e');
        abaEditMenu.setText("Ponto");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Registrar Ponto");
        abaEditMenu.add(cutMenuItem);

        abaAuditoria.setText("Auditoria");
        abaAuditoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abaAuditoriaActionPerformed(evt);
            }
        });
        abaEditMenu.add(abaAuditoria);

        menuBar.add(abaEditMenu);

        abaRelatorio.setBackground(new java.awt.Color(254, 254, 254));
        abaRelatorio.setForeground(new java.awt.Color(254, 254, 254));
        abaRelatorio.setMnemonic('h');
        abaRelatorio.setText("Relatorios");

        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Funcionarios");
        contentMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contentMenuItemActionPerformed(evt);
            }
        });
        abaRelatorio.add(contentMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("Folha de Ponto");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        abaRelatorio.add(aboutMenuItem);

        aboutMenuItem1.setMnemonic('a');
        aboutMenuItem1.setText("Relatorio de Usuarios");
        aboutMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItem1ActionPerformed(evt);
            }
        });
        abaRelatorio.add(aboutMenuItem1);

        rel_holerite.setMnemonic('a');
        rel_holerite.setText("Modelo holerite");
        rel_holerite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rel_holeriteActionPerformed(evt);
            }
        });
        abaRelatorio.add(rel_holerite);

        menuBar.add(abaRelatorio);

        abaIdioma.setBackground(new java.awt.Color(254, 254, 254));
        abaIdioma.setForeground(new java.awt.Color(254, 254, 254));
        abaIdioma.setText("Idioma");

        rbPTBR.setText("Portugues pt-br");
        rbPTBR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pt_br.png"))); // NOI18N
        rbPTBR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPTBRActionPerformed(evt);
            }
        });
        abaIdioma.add(rbPTBR);

        rbENUS.setText("Ingles en-us");
        rbENUS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/en_us.png"))); // NOI18N
        rbENUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbENUSActionPerformed(evt);
            }
        });
        abaIdioma.add(rbENUS);

        menuBar.add(abaIdioma);

        abaSobre.setBackground(new java.awt.Color(254, 254, 254));
        abaSobre.setForeground(new java.awt.Color(254, 254, 254));
        abaSobre.setText("Sobre");
        menuBar.add(abaSobre);

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
        infrmPonto objPnt = new infrmPonto(this.desktopPane);
        Forms.showInternal(desktopPane, objPnt);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_cad_funcionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cad_funcionarioActionPerformed
        cadFun.doClick();
    }//GEN-LAST:event_btn_cad_funcionarioActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void rbENUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbENUSActionPerformed
        Locale.setDefault(Locale.ENGLISH);

        this.Traduz();

        // TODO add your handling code here:
        // rbPTBR.setSelected(false);
    }//GEN-LAST:event_rbENUSActionPerformed

    private void rbPTBRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPTBRActionPerformed

        Locale Pt = new Locale("en", "US");
        // TODO add your handling code here:
        Locale.setDefault(Pt);

        this.Traduz();

        //  rbENUS.setSelected(false);
    }//GEN-LAST:event_rbPTBRActionPerformed

    private void cadFunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadFunActionPerformed
        infrmCadFun objFun = new infrmCadFun();
        Forms.showInternal(desktopPane, objFun);
    }//GEN-LAST:event_cadFunActionPerformed

    private void cadUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadUserActionPerformed
        // TODO add your handling code here:
        frmCadUsuario objCadUser = new frmCadUsuario(true);
        objCadUser.setAlwaysOnTop(true);
        objCadUser.setVisible(true);
    }//GEN-LAST:event_cadUserActionPerformed

    private void contentMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contentMenuItemActionPerformed
        try {
            //Pegando-se a conexão do banco
            //Pegando-se o arquivo do relatorio
            InputStream inputStream = getClass().getResourceAsStream("../Relatorio/relatorio_funcionario.jasper");

            //Caso seja necessário relatório parametrizado
            Map parametros = new HashMap();

            //usando uma conexão
            JasperPrint print = JasperFillManager.fillReport(inputStream, parametros, DB.Connect());

            JRViewer viewer = new JRViewer(print);

            //Criar o jFrame
            JFrame frameRelatorio = new JFrame("Janela de relatorio");

            //adiciona o JRViewer no JFram
            frameRelatorio.add(viewer, BorderLayout.CENTER);

            //configura o tamanho padrão da Jframe
            frameRelatorio.setSize(500, 500);

            //Maximiza o JFrame para ocupar a tela toda.
            frameRelatorio.setExtendedState(JFrame.MAXIMIZED_BOTH);

            //configura a operação padrao quando o jframe for fechado.
            frameRelatorio.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            //exibi em tela Jframe
            frameRelatorio.setVisible(true);

        } catch (Exception ex) {
            Dialogs.showError(ex.getMessage());
        }

// TODO add your handling code here:
    }//GEN-LAST:event_contentMenuItemActionPerformed

    private void aboutMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItem1ActionPerformed
        try {
            //Pegando-se a conexão do banco
            //Pegando-se o arquivo do relatorio
            InputStream inputStream = getClass().getResourceAsStream("../Relatorio/relatorio_usuarios.jasper");

            //Caso seja necessário relatório parametrizado
            Map parametros = new HashMap();

            //usando uma conexão
            JasperPrint print = JasperFillManager.fillReport(inputStream, parametros, DB.Connect());

            JRViewer viewer = new JRViewer(print);

            //Criar o jFrame
            JFrame frameRelatorio = new JFrame("Janela de relatorio");

            //adiciona o JRViewer no JFram
            frameRelatorio.add(viewer, BorderLayout.CENTER);

            //configura o tamanho padrão da Jframe
            frameRelatorio.setSize(500, 500);

            //Maximiza o JFrame para ocupar a tela toda.
            frameRelatorio.setExtendedState(JFrame.MAXIMIZED_BOTH);

            //configura a operação padrao quando o jframe for fechado.
            frameRelatorio.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            //exibi em tela Jframe
            frameRelatorio.setVisible(true);

        } catch (Exception ex) {
            Dialogs.showError(ex.getMessage());
        }

// TODO add your handling code here:
    }//GEN-LAST:event_aboutMenuItem1ActionPerformed

    private void abaAuditoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abaAuditoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_abaAuditoriaActionPerformed

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
        try {
            //Pegando-se a conexão do banco
            //Pegando-se o arquivo do relatorio
            InputStream inputStream = getClass().getResourceAsStream("../Relatorio/relatorio_usuarios.jasper");

            //Caso seja necessário relatório parametrizado
            Map parametros = new HashMap();

            //usando uma conexão
            JasperPrint print = JasperFillManager.fillReport(inputStream, parametros, DB.Connect());

            JRViewer viewer = new JRViewer(print);

            //Criar o jFrame
            JFrame frameRelatorio = new JFrame("Janela de relatorio");

            //adiciona o JRViewer no JFram
            frameRelatorio.add(viewer, BorderLayout.CENTER);

            //configura o tamanho padrão da Jframe
            frameRelatorio.setSize(500, 500);

            //Maximiza o JFrame para ocupar a tela toda.
            frameRelatorio.setExtendedState(JFrame.MAXIMIZED_BOTH);

            //configura a operação padrao quando o jframe for fechado.
            frameRelatorio.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            //exibi em tela Jframe
            frameRelatorio.setVisible(true);

        } catch (Exception ex) {
            Dialogs.showError(ex.getMessage());
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    private void rel_holeriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rel_holeriteActionPerformed
        try {
            //Pegando-se a conexão do banco
            //Pegando-se o arquivo do relatorio
            InputStream inputStream = getClass().getResourceAsStream("../Relatorio/relatorio_usuarios.jasper");

            //Caso seja necessário relatório parametrizado
            Map parametros = new HashMap();

            //usando uma conexão
            JasperPrint print = JasperFillManager.fillReport(inputStream, parametros, DB.Connect());

            JRViewer viewer = new JRViewer(print);

            //Criar o jFrame
            JFrame frameRelatorio = new JFrame("Janela de relatorio");

            //adiciona o JRViewer no JFram
            frameRelatorio.add(viewer, BorderLayout.CENTER);

            //configura o tamanho padrão da Jframe
            frameRelatorio.setSize(500, 500);

            //Maximiza o JFrame para ocupar a tela toda.
            frameRelatorio.setExtendedState(JFrame.MAXIMIZED_BOTH);

            //configura a operação padrao quando o jframe for fechado.
            frameRelatorio.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            //exibi em tela Jframe
            frameRelatorio.setVisible(true);

        } catch (Exception ex) {
            Dialogs.showError(ex.getMessage());
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_rel_holeriteActionPerformed

    public void Traduz() {

        ResourceBundle propriedades = ResourceBundle.getBundle("lang/lg");
        btnCadastro.setText(propriedades.getString("btnCadastro"));
        abaEditMenu.setText(propriedades.getString("abaEditMenu"));
        abaRelatorio.setText(propriedades.getString("abaRelatorio"));
        abaIdioma.setText(propriedades.getString("abaIdioma"));
        abaSobre.setText(propriedades.getString("abaSobre"));
        cadUser.setText(propriedades.getString("cadUser"));
        cadFun.setText(propriedades.getString("cadFun"));
        abaAuditoria.setText(propriedades.getString("abaAuditoria"));

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem abaAuditoria;
    private javax.swing.JMenu abaEditMenu;
    private javax.swing.JMenu abaIdioma;
    private javax.swing.JMenu abaRelatorio;
    private javax.swing.JMenu abaSobre;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem aboutMenuItem1;
    private javax.swing.JLabel asdasdasd;
    private javax.swing.JMenu btnCadastro;
    private javax.swing.JButton btn_cad_funcionario;
    private javax.swing.JMenuItem cadFun;
    private javax.swing.JMenuItem cadUser;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel iashd;
    private javax.swing.JLabel iashd1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JLabel lblUser;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JRadioButtonMenuItem rbENUS;
    private javax.swing.JRadioButtonMenuItem rbPTBR;
    private javax.swing.JMenuItem rel_holerite;
    // End of variables declaration//GEN-END:variables

}
