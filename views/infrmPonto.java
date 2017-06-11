/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.FuncionarioController;
import helpers.Dialogs;
import helpers.Formats;
import helpers.Forms;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.table.DefaultTableModel;
import models.Funcionario;

/**
 *
 * @author qwerty
 */
public class infrmPonto extends javax.swing.JInternalFrame {

    private FuncionarioController m_FuncC = null;
    private String CPF_CADASTRADO, FUNCIONARIO_INSERIDO_SUCESS, FUNCINOARIO_EDITADO_SUCESS, BTN_NOVO, BTN_SALVAR;
    private Funcionario m_objFunc = null;
    private boolean ersHora = false;
    private JDesktopPane inDesktop = null;

    public void Traduz() {
        CPF_CADASTRADO = "CPF ja cadastrado em outro funcionario!";
        FUNCIONARIO_INSERIDO_SUCESS = "Funcionario inserido com Sucesso!";
        FUNCINOARIO_EDITADO_SUCESS = "Funcionario editado com Sucesso!";
        BTN_NOVO = "Novo";
        BTN_SALVAR = "Salvar";
    }

    private void defaultLayout(boolean dl) {
        /* btnCancelar.setEnabled(!dl);
        btnSearch.setText((dl) ? BTN_NOVO : BTN_SALVAR);
        txtFuncionario.setText("");
        txtData.setText("");
        txtSalario.setText("");
        txtHoraBase.setText("");
        lblValorHoraT.setText("0,00 R$/h");
        txtFuncionario.setEnabled(!dl);
        txtData.setEnabled(!dl);
        txtSalario.setEnabled(!dl);
        txtHoraBase.setEnabled(!dl);
        if (dl) {
            loadTable();
        }
         */
    }

    private void loadTable() {
        /* try {
            m_FuncC = new FuncionarioController();
            List<Funcionario> lstFor = m_FuncC.getAll();
            DefaultTableModel tablemd = (DefaultTableModel) tbFunc.getModel();
            tablemd.getDataVector().removeAllElements();
            if (lstFor.size() > 0) {
                for (Funcionario forn : lstFor) {
                    tablemd.addRow(new Object[]{forn.getId(), forn.getNome(), Formats.CPF.Format(forn.getCPF()), forn.getSalario(), forn.getValor_hora()});
                }
                tbFunc.clearSelection();
            }
            tbFunc.updateUI();
        } catch (Exception ex) {
            Dialogs.showError(ex.getMessage());
        }
         */
    }

    private void InserirFuncionario() throws Exception {
        /* m_FuncC = new FuncionarioController();
        m_FuncC.Add(txtFuncionario.getText(), txtData.getText(),
                Double.parseDouble((txtSalario.getText().isEmpty()) ? "0" : txtSalario.getText()),
                Integer.valueOf((txtHoraBase.getText().isEmpty() ? "0" : txtHoraBase.getText())));
        defaultLayout(true);
        Dialogs.showInfo(FUNCIONARIO_INSERIDO_SUCESS);*/
    }

    private boolean FuncionarioDuplicado() throws Exception {
        m_FuncC = new FuncionarioController();
        if (m_objFunc == null) {
            Funcionario objFunc = m_FuncC.SearchFuncionarioByCPF(Formats.CPF.Unformat(txtData.getText()));
            if (objFunc != null) {
                Dialogs.showWarning(CPF_CADASTRADO);
                return true;
            }
            return (objFunc != null);
        } else if (m_FuncC.DuplicatedFuncionario(m_objFunc.getId(), Formats.CPF.Unformat(txtData.getText()))) {
            Dialogs.showWarning(CPF_CADASTRADO);
            return true;
        } else {
            return false;
        }
    }

    public infrmPonto(JDesktopPane inDesktop) {
        initComponents();
        this.inDesktop = inDesktop;
        Traduz();
        defaultLayout(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCancelar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        lblNome = new javax.swing.JLabel();
        lblSalario = new javax.swing.JLabel();
        txtData = new javax.swing.JFormattedTextField();
        txtFuncionario = new javax.swing.JTextField();
        lblNome1 = new javax.swing.JLabel();
        lblNome2 = new javax.swing.JLabel();
        lblNome3 = new javax.swing.JLabel();
        lblNome4 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblNome5 = new javax.swing.JLabel();
        txtEntrada1 = new javax.swing.JFormattedTextField();
        txtEntrada2 = new javax.swing.JFormattedTextField();
        txtSaida1 = new javax.swing.JFormattedTextField();
        txtSaida2 = new javax.swing.JFormattedTextField();

        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setClosable(true);
        setTitle("SHX Funcionarios");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        lblNome.setText("Data");

        lblSalario.setText("Funcionario");

        try {
            txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/2017")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtData.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataActionPerformed(evt);
            }
        });
        txtData.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDataKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDataKeyPressed(evt);
            }
        });

        txtFuncionario.setEditable(false);

        lblNome1.setText("Entrada");

        lblNome2.setText("Saida");

        lblNome3.setText("Entrada");

        lblNome4.setText("Saida");

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Data", "Funcionario", "H. Trab.", "H. Extra", "%", "T. Extra", "T. Dia"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(80);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(80);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setMinWidth(100);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(100);
        }

        lblNome5.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        lblNome5.setForeground(new java.awt.Color(251, 8, 8));
        lblNome5.setText("Percentual aplicado para o dia: 50%");

        try {
            txtEntrada1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtEntrada1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEntrada1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEntrada1KeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEntrada1KeyPressed(evt);
            }
        });

        try {
            txtEntrada2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtEntrada2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEntrada2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEntrada2KeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEntrada2KeyPressed(evt);
            }
        });

        try {
            txtSaida1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtSaida1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSaida1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSaida1KeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSaida1KeyPressed(evt);
            }
        });

        try {
            txtSaida2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtSaida2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSaida2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSaida2KeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSaida2KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSalario, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNome, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(lblNome5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNome3)
                            .addComponent(lblNome4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEntrada1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSaida1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNome2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNome1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEntrada2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSaida2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblNome))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtSaida1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblNome4))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtSaida2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblNome2))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblSalario))
                                .addComponent(btnSearch, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtEntrada1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNome3))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtEntrada2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNome1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(lblNome5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNovo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCancelar)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDataKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDataKeyTyped
        Forms.OnlyNumbers(evt);
    }//GEN-LAST:event_txtDataKeyTyped

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

        infrmConsFunc objConsF = new infrmConsFunc(this.inDesktop);
        Forms.showInternal(this.inDesktop, objConsF);

    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtDataKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDataKeyPressed
        Forms.goNextField(evt.getKeyCode(), txtEntrada1);
    }//GEN-LAST:event_txtDataKeyPressed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        defaultLayout(true);
        m_objFunc = null;
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        // TODO add your handling code here:   
        try {
            if (btnSearch.getText().equals(BTN_SALVAR)) {
                if (m_objFunc == null) {
                    if (!FuncionarioDuplicado()) {
                        InserirFuncionario();
                    }
                    /*  } else if (!FuncionarioDuplicado()) {
                    m_FuncC.Edit(m_objFunc.getId(), txtFuncionario.getText(), txtData.getText(),
                            Double.parseDouble((txtSalario.getText().isEmpty()) ? "0" : txtSalario.getText()),
                            Integer.valueOf((txtHoraBase.getText().isEmpty() ? "0" : txtHoraBase.getText())));
                    Dialogs.showInfo(FUNCINOARIO_EDITADO_SUCESS);
                    m_objFunc = null;
                    defaultLayout(true);*/
                }
            } else if (btnSearch.getText().equals(BTN_NOVO)) {
                defaultLayout(false);
                txtFuncionario.requestFocus();
            }
        } catch (Exception ex) {
            Dialogs.showError(ex.getMessage());
        }
    }//GEN-LAST:event_btnNovoActionPerformed

    private void txtEntrada1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEntrada1KeyTyped
        // TODO add your handling code here:
        Forms.OnlyNumbers(evt);
    }//GEN-LAST:event_txtEntrada1KeyTyped

    private void txtEntrada1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEntrada1KeyPressed
        // TODO add your handling code here:
        Forms.goNextField(evt.getKeyCode(), txtSaida1);
    }//GEN-LAST:event_txtEntrada1KeyPressed

    private void txtEntrada2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEntrada2KeyTyped
        // TODO add your handling code here:
        Forms.OnlyNumbers(evt);
    }//GEN-LAST:event_txtEntrada2KeyTyped

    private void txtEntrada2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEntrada2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEntrada2KeyPressed

    private void txtSaida1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSaida1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSaida1KeyTyped

    private void txtSaida1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSaida1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSaida1KeyPressed

    private void txtSaida2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSaida2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSaida2KeyTyped

    private void txtSaida2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSaida2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSaida2KeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNome1;
    private javax.swing.JLabel lblNome2;
    private javax.swing.JLabel lblNome3;
    private javax.swing.JLabel lblNome4;
    private javax.swing.JLabel lblNome5;
    private javax.swing.JLabel lblSalario;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JFormattedTextField txtEntrada1;
    private javax.swing.JFormattedTextField txtEntrada2;
    private javax.swing.JTextField txtFuncionario;
    private javax.swing.JFormattedTextField txtSaida1;
    private javax.swing.JFormattedTextField txtSaida2;
    // End of variables declaration//GEN-END:variables
}
