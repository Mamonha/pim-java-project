/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package org.example.viewSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

import org.example.controller.ClienteController;
import org.example.controller.VeiculosClientesMotoresController;
import org.example.controller.VeiculosClientesController;
import org.example.controller.VeiculosMotoresController;
import org.example.model.entities.Cliente;
import org.example.model.entities.VeiculosClientes;
import org.example.model.entities.VeiculosClientesMotores;
import org.example.model.entities.VeiculosMotores;
import static org.example.view.ClientesMenu.listarClientes;

/**
 *
 * @author Queiro Ubeda
 */
 public class JIFAgendar extends javax.swing.JInternalFrame {
     ClienteController clienteController = new ClienteController();
     VeiculosClientesMotoresController veiculosClientesMotoresController = new VeiculosClientesMotoresController();
     VeiculosClientesController veiculosClientesController = new VeiculosClientesController();
     VeiculosMotoresController veiculosMotoresController  = new VeiculosMotoresController();
    /**
     * Creates new form InternalForme
     */
    public JIFAgendar() {

        initComponents();
        ativarBotoes(true);
        popularTabela();
    }

    public void ativarBotoes(Boolean ativar){
        jbNovo.setEnabled(ativar);
        //JbEditar.setEnabled(ativar);
        JbExcluir.setEnabled(ativar);
        jbSalvar.setEnabled(!ativar);
        jbCancelar.setEnabled(!ativar);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JpForme = new javax.swing.JPanel();
        labelNome = new javax.swing.JLabel();
        textKilometragem = new javax.swing.JTextField();
        LabelDiaAgendamento = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        textUltimaTroca = new javax.swing.JFormattedTextField();
        textPlaca = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jpTable = new javax.swing.JPanel();
        labelConsulta = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jpButton = new javax.swing.JPanel();
        jbCancelar = new javax.swing.JButton();
        jbNovo = new javax.swing.JButton();
        JbExcluir = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jbFechar = new javax.swing.JButton();

        labelNome.setText("Kilometragem");

        textKilometragem.setEditable(false);
        textKilometragem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textKilometragemActionPerformed(evt);
            }
        });

        LabelDiaAgendamento.setText("Ultima Troca");

        try {
            textUltimaTroca.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel1.setText("Placa");

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
                .addGap(101, 101, 101)
                .addGroup(JpFormeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JpFormeLayout.createSequentialGroup()
                        .addGroup(JpFormeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textUltimaTroca, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(JpFormeLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(JpFormeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LabelDiaAgendamento)
                                    .addComponent(jLabel1))))
                        .addGap(98, 612, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpFormeLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(JpFormeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textKilometragem, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNome))
                        .addGap(432, 432, 432))))
        );
        JpFormeLayout.setVerticalGroup(
            JpFormeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpFormeLayout.createSequentialGroup()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(JpFormeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNome)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JpFormeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textKilometragem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LabelDiaAgendamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textUltimaTroca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpTable.setBackground(new java.awt.Color(5, 113, 189));

        labelConsulta.setText("Clientes");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Nome Paciente", "Agendamento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jpTableLayout = new javax.swing.GroupLayout(jpTable);
        jpTable.setLayout(jpTableLayout);
        jpTableLayout.setHorizontalGroup(
            jpTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelConsulta)
                .addGap(114, 849, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 895, Short.MAX_VALUE)
        );
        jpTableLayout.setVerticalGroup(
            jpTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelConsulta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jbCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CancelarIcon.png"))); // NOI18N
        jbCancelar.setText("Cancalar");
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
            .addComponent(jpTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(JpForme, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JpForme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        ativarBotoes(true);      
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        ativarBotoes(false);
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jbFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFecharActionPerformed
        dispose();
    }//GEN-LAST:event_jbFecharActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        ativarBotoes(true);
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void textKilometragemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textKilometragemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textKilometragemActionPerformed

    public void setPosicao() {
        JDesktopPane desktopPane = getDesktopPane();
        if (desktopPane != null) {
            Dimension d = desktopPane.getSize();
            this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
        }
    }
    
    private void popularTabela(){
        List <Cliente> dadosClientes = clienteController.findAll();
        java.util.List<Object[]> linhas = new ArrayList<>();
        
        for (Cliente clientes : dadosClientes) {
            linhas.add(new Object[]{
                clientes.getId(),
                clientes.getNome(),
                clientes.getEmail()
            });
        }
        
        Object[][] data = linhas.toArray(new Object[0][]);
        String[] columnNames = {"ID", "Nome Cliente", "Email"};
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        jTable1.setModel(model);
        jTable1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                boolean confirmacaoMostrada = false;
                if (!confirmacaoMostrada) {
                    JTable target = (JTable) e.getSource();
                    int row = target.getSelectedRow();

                    if (row != -1) {
                        int confirm = JOptionPane.showConfirmDialog(null, "Deseja editar este usuário?", "Confirmação", JOptionPane.YES_NO_OPTION);

                        if (confirm == JOptionPane.YES_OPTION) {
                            long selectClienteId = Long.parseLong(target.getValueAt(row, 0).toString());
                        }
                    }

                    confirmacaoMostrada = true;
                }
            }
        });
    }
    
    private void cadastrarVeiculosClientes() {
        listarClientes();

        String idStr = JOptionPane.showInputDialog(this, "Digite o id do cliente que você deseja cadastrar:");
        Long id = Long.parseLong(idStr);
        Cliente cadastrarCliente = clienteController.findById(id);

        if (cadastrarCliente != null) {
            String placa = textPlaca.getText();
            String kilometragem = textKilometragem.getText();
            LocalDate ultimaTroca = LocalDate.parse(textUltimaTroca.getText());

            VeiculosClientes veiculoCliente = new VeiculosClientes(null, placa, kilometragem, ultimaTroca, null, cadastrarCliente);
            veiculoCliente = veiculosClientesController.create(veiculoCliente);

            mostrarCarro();
            String idCarroStr = JOptionPane.showInputDialog(this, "Digite o código do carro que você deseja adicionar");
            Long idCarro = Long.parseLong(idCarroStr);
            VeiculosMotores veiculosMotores = veiculosMotoresController.findById(idCarro);

            if (veiculosMotores != null) {
                VeiculosClientesMotores vc = new VeiculosClientesMotores(null, veiculoCliente, veiculosMotores);
                vc = veiculosClientesMotoresController.create(vc);
                JOptionPane.showMessageDialog(this, "Veículo cadastrado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(this, "Veículo não encontrado!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Cliente não encontrado!");
        }
    }
    
     private void mostrarCarro() {
        List<VeiculosMotores> veiculos = veiculosMotoresController.findAll();

        StringBuilder resultado = new StringBuilder();
        for (VeiculosMotores veiculo : veiculos) {
            resultado.append("ID: ").append(veiculo.getId()).append(" Nome: ").append(veiculo.getVeiculo().getMarca())
                    .append(" Modelo: ").append(veiculo.getVeiculo().getModelo()).append(" Ano: ").append(veiculo.getVeiculo().getAno())
                    .append(" Motor: ").append(veiculo.getMotor().getNome()).append(" Filtro: ")
                    .append(veiculo.getMotor().getFiltro().getModelo()).append(" OLEO: ").append(veiculo.getMotor().getOleo().getModelo())
                    .append("\n");
        }

        JOptionPane.showMessageDialog(this, resultado.toString(), "Lista de Veículos", JOptionPane.INFORMATION_MESSAGE);
    }
     
      private void procurarVeiculoPlaca() {
        VeiculosClientesMotores veiculoClienteMotor = veiculosClientesMotoresController.findByPlaca(textPlaca.getText());

        if (veiculoClienteMotor != null) {
            String message = "Veículo cliente motor encontrado!\n" +
                             "Motor: " + veiculoClienteMotor.getVeiculosMotores().getMotor().getNome() + "\n" +
                             "Óleo Recomendado: " + veiculoClienteMotor.getVeiculosMotores().getMotor().getOleo().getModelo() + "\n" +
                             "Filtro Recomendado: " + veiculoClienteMotor.getVeiculosMotores().getMotor().getFiltro().getModelo() + "\n" +
                             "Última troca de óleo: " + veiculoClienteMotor.getVeiculosClientes().getUltimaTroca();
            JOptionPane.showMessageDialog(this, message);
        } else {
            JOptionPane.showMessageDialog(this, "Veículo cliente motor com placa " + textPlaca.getText() + " não encontrado.");
        }
    }
    
    private void limparCampos (){
        textKilometragem.setText(" ");
        textUltimaTroca.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbExcluir;
    private javax.swing.JPanel JpForme;
    private javax.swing.JLabel LabelDiaAgendamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbFechar;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JPanel jpButton;
    private javax.swing.JPanel jpTable;
    private javax.swing.JLabel labelConsulta;
    private javax.swing.JLabel labelNome;
    public javax.swing.JTextField textKilometragem;
    private javax.swing.JTextField textPlaca;
    public javax.swing.JFormattedTextField textUltimaTroca;
    // End of variables declaration//GEN-END:variables
}
