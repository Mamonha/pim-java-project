/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package org.example.viewSwing;

//Ok
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.List;
import org.example.controller.ClienteController;
import org.example.model.entities.Cliente;
import static org.example.viewSwing.FeatureMain.jDesktop;
//OK

/**
 *
 * @author Queiro Ubeda
 */
 public class JIFClientes extends javax.swing.JInternalFrame {

     ClienteController clienteController = new ClienteController();
    /**
     * Creates new form InternalForme
     */
    public JIFClientes() {
        initComponents();
        ativarBotoes(true);
        popularTabela();
    }

    public void setPosicao() {
        JDesktopPane desktopPane = getDesktopPane();
        if (desktopPane != null) {
            Dimension d = desktopPane.getSize();
            this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
        }
    }
    public void ativarBotoes(Boolean ativar){
        jbNovo.setEnabled(ativar);
        JbEditar.setEnabled(ativar);
        JbExcluir.setEnabled(ativar);
        jbSalvar.setEnabled(!ativar);
        jbCancelar.setEnabled(!ativar);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JpForme = new javax.swing.JPanel();
        labelNome = new javax.swing.JLabel();
        textNome = new javax.swing.JTextField();
        LabelEmail = new javax.swing.JLabel();
        textEmail = new javax.swing.JTextField();
        labelContato = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        textCpf = new javax.swing.JFormattedTextField();
        jpTable = new javax.swing.JPanel();
        labelConsulta = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableClientes = new javax.swing.JTable();
        jpButton = new javax.swing.JPanel();
        JbEditar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jbNovo = new javax.swing.JButton();
        JbExcluir = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jbFechar = new javax.swing.JButton();

        setMaximumSize(null);
        setPreferredSize(null);

        labelNome.setText("Nome");

        textNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNomeActionPerformed(evt);
            }
        });
        textNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textNomeKeyTyped(evt);
            }
        });

        LabelEmail.setText("Email:");

        labelContato.setText("CPF");

        try {
            textCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCpfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JpFormeLayout = new javax.swing.GroupLayout(JpForme);
        JpForme.setLayout(JpFormeLayout);
        JpFormeLayout.setHorizontalGroup(
            JpFormeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpFormeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JpFormeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2))
                .addContainerGap())
            .addGroup(JpFormeLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(JpFormeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JpFormeLayout.createSequentialGroup()
                        .addGroup(JpFormeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelEmail)
                            .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(JpFormeLayout.createSequentialGroup()
                        .addGroup(JpFormeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNome))
                        .addGap(73, 73, 73)
                        .addGroup(JpFormeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JpFormeLayout.createSequentialGroup()
                                .addComponent(labelContato)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(JpFormeLayout.createSequentialGroup()
                                .addComponent(textCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        JpFormeLayout.setVerticalGroup(
            JpFormeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpFormeLayout.createSequentialGroup()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(JpFormeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNome)
                    .addComponent(labelContato))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JpFormeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(LabelEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpTable.setBackground(new java.awt.Color(5, 113, 189));

        labelConsulta.setText("Clientes:");

        jTableClientes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTableClientes);

        javax.swing.GroupLayout jpTableLayout = new javax.swing.GroupLayout(jpTable);
        jpTable.setLayout(jpTableLayout);
        jpTableLayout.setHorizontalGroup(
            jpTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelConsulta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane2)
        );
        jpTableLayout.setVerticalGroup(
            jpTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelConsulta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(306, 306, 306))
        );

        JbEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/EditarIcon.png"))); // NOI18N
        JbEditar.setText("Editar");
        JbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbEditarActionPerformed(evt);
            }
        });

        jbCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CancelarIcon.png"))); // NOI18N
        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jbNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/NovoIcon.png"))); // NOI18N
        jbNovo.setText("Novo");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });

        JbExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ExluirIcon.png"))); // NOI18N
        JbExcluir.setText("Excluir");
        JbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbExcluirActionPerformed(evt);
            }
        });

        jbSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/SalvarIcon2.png"))); // NOI18N
        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jbFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FecharIcon.png"))); // NOI18N
        jbFechar.setText("Fechar");
        jbFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpButtonLayout = new javax.swing.GroupLayout(jpButton);
        jpButton.setLayout(jpButtonLayout);
        jpButtonLayout.setHorizontalGroup(
            jpButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpButtonLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jbNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JbEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(jbFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        jpButtonLayout.setVerticalGroup(
            jpButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpButtonLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jpButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JbEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(JpForme, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(JpForme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(jpTable, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbEditarActionPerformed

        int selectedRow = jTableClientes.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um cliente na tabela para editar e apos selecionar clique em EDITAR novamente!.", "Aviso", JOptionPane.WARNING_MESSAGE);
        } else {
            int confirm = JOptionPane.showConfirmDialog(null, "Deseja editar este cliente?", "Confirmação", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            preencherCampos(selectedRow);
        }
    }
    }//GEN-LAST:event_JbEditarActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        int confirm = JOptionPane.showConfirmDialog(null, "Deseja salvar as alterações?", "Confirmação", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            ativarBotoes(true);
            boolean erro = false;
            Cliente cliente = new Cliente();
            EstimateValueSwing telaEstimateValue =new EstimateValueSwing();
            jDesktop.add(telaEstimateValue);
            telaEstimateValue.setVisible(true);
            telaEstimateValue.setPosicao();
            
            if (textNome.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Nome Inválido");
                erro = true;
            } else {
                cliente.setNome(textNome.getText().trim());
            }

            if (textEmail.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Email Inválido");
                erro = true;
            } else {
                cliente.setEmail(textEmail.getText().trim());
            }

            if (textCpf.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "CPF Inválido");
                erro = true;
            } else {
                cliente.setCpf(textCpf.getText());
            }

            if (!erro) {
                int selectedRow = jTableClientes.getSelectedRow();
                if (selectedRow != -1) {
                    cliente.setId((Long) jTableClientes.getValueAt(selectedRow, 0));
                    clienteController.update(cliente);
                    JOptionPane.showMessageDialog(null, "Cliente atualizado com sucesso!");
                } else {
                    clienteController.create(cliente);
                    JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
                }
                popularTabela();
                limparCampos();
            }
        }
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        ativarBotoes(false);
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jbFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFecharActionPerformed
        dispose();
    }//GEN-LAST:event_jbFecharActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        ativarBotoes(true);
        limparCampos();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void textNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNomeActionPerformed

    private void textNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textNomeKeyTyped
        char c= evt.getKeyChar();

        if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || c == KeyEvent.VK_SPACE)) {
            evt.consume();
        }

    }//GEN-LAST:event_textNomeKeyTyped

    private void textCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCpfActionPerformed

    private void JbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbExcluirActionPerformed
        int selectedRow = jTableClientes.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um cliente na tabela para excluir e apos selecionar clique em EXCLUIR novamente.", "Aviso", JOptionPane.WARNING_MESSAGE);
        } else {
            int confirm = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir este cliente?", "Confirmação", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                excluirCliente(selectedRow);
            }
        } 
    }//GEN-LAST:event_JbExcluirActionPerformed

    private void limparCampos (){
        textNome.setText(" ");
        textEmail.setText(" ");
        textCpf.setText("");
        
    }
    private void preencherCampos(int selectedRow) {
    textNome.setText(jTableClientes.getValueAt(selectedRow, 1).toString());
    textEmail.setText(jTableClientes.getValueAt(selectedRow, 2).toString());
    textCpf.setText(jTableClientes.getValueAt(selectedRow, 3).toString());

    textNome.setEditable(true);
    textEmail.setEditable(true);
    textCpf.setEditable(true);

    ativarBotoes(false);
    }
    private void excluirCliente(int selectedRow) {
    DefaultTableModel model = (DefaultTableModel) jTableClientes.getModel();
    Cliente cliente = getClienteFromRow(selectedRow);
    model.removeRow(selectedRow);
    clienteController.delete(cliente);
    JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
}
    private Cliente getClienteFromRow(int selectedRow) {
       String idString = jTableClientes.getValueAt(selectedRow, 0).toString();
       Long id = Long.parseLong(idString);
        return clienteController.findById(id);
    }

    private void popularTabela(){
        
        List<Cliente> dadosClientes = clienteController.findAll();

        List<Object[]> linhas= new ArrayList<>();
      for (Cliente cliente : dadosClientes) {
            linhas.add(new Object[]{
                cliente.getId(),
                cliente.getNome(),
                cliente.getEmail(),
                cliente.getCpf()
            });
        }
      
       Object[][] data = linhas.toArray(new Object[0][]);
        String[] columnNames = {"ID", "Nome Cliente", "Email","CPF"};
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        jTableClientes.setModel(model);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbEditar;
    private javax.swing.JButton JbExcluir;
    private javax.swing.JPanel JpForme;
    private javax.swing.JLabel LabelEmail;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTableClientes;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbFechar;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JPanel jpButton;
    private javax.swing.JPanel jpTable;
    private javax.swing.JLabel labelConsulta;
    private javax.swing.JLabel labelContato;
    private javax.swing.JLabel labelNome;
    private javax.swing.JFormattedTextField textCpf;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField textNome;
    // End of variables declaration//GEN-END:variables
}
