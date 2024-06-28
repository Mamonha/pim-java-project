/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.example.viewSwing;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;
import org.example.controller.VeiculosClientesMotoresController;
import org.example.model.entities.VeiculosClientesMotores;

/**
 *
 * @author Queiro Ubeda
 */
public class FeatureMain extends javax.swing.JFrame {
    private JProgressBar progressBar;
    VeiculosClientesMotoresController veiculosClientesMotoresController = new VeiculosClientesMotoresController();
    /**
     * Creates new form FeatureMain
     */
    public FeatureMain() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        progressBar = new JProgressBar(0, 100);
        progressBar.setStringPainted(true);

        add(progressBar, BorderLayout.CENTER);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jDesktop = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        placaMenuTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar = new javax.swing.JMenuBar();
        jmPacientes = new javax.swing.JMenu();
        jmiAdmiPacientes = new javax.swing.JMenuItem();
        jmAgendamentos = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktop.setBackground(new java.awt.Color(8, 24, 38));
        jDesktop.setForeground(new java.awt.Color(204, 204, 204));
        jDesktop.setLayout(new java.awt.GridBagLayout());

        jPanel2.setBackground(new java.awt.Color(209, 86, 86));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconmonstr-car-3-64.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("JetBrains Mono", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 242, 242));
        jLabel1.setText("Digite A Placa");

        placaMenuTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placaMenuTxtActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(242, 242, 242));
        jLabel2.setText("Nosso sistema permite você achar o cliente do seu veiculo pela placa");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(placaMenuTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(152, 152, 152)
                            .addComponent(jLabel3))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(110, 110, 110)
                            .addComponent(jLabel1))))
                .addContainerGap(224, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(placaMenuTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(95, 95, 95)
                    .addComponent(jLabel2)
                    .addContainerGap(95, Short.MAX_VALUE)))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 61;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(261, 525, 324, 592);
        jDesktop.add(jPanel2, gridBagConstraints);

        jMenuBar.setBackground(new java.awt.Color(59, 109, 62));

        jmPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconmonstr-customer-6-24.png"))); // NOI18N
        jmPacientes.setText("Clientes");
        jmPacientes.setToolTipText("");

        jmiAdmiPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconmonstr-menu-lined-24.png"))); // NOI18N
        jmiAdmiPacientes.setText("Administrar");
        jmiAdmiPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAdmiPacientesActionPerformed(evt);
            }
        });
        jmPacientes.add(jmiAdmiPacientes);

        jMenuBar.add(jmPacientes);

        jmAgendamentos.setBackground(new java.awt.Color(14, 72, 127));
        jmAgendamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconmonstr-text-check-list-lined-24.png"))); // NOI18N
        jmAgendamentos.setText("Orçamento");

        jMenuItem1.setBackground(new java.awt.Color(14, 72, 127));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconmonstr-menu-lined-24.png"))); // NOI18N
        jMenuItem1.setText("Administrar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jmAgendamentos.add(jMenuItem1);

        jMenuBar.add(jmAgendamentos);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktop, javax.swing.GroupLayout.DEFAULT_SIZE, 1425, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktop, javax.swing.GroupLayout.DEFAULT_SIZE, 737, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiAdmiPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAdmiPacientesActionPerformed
          JIFClientes telaCliente= new JIFClientes();
          jDesktop.add(telaCliente);
          telaCliente.setVisible(true);
          telaCliente.setPosicao();
    }//GEN-LAST:event_jmiAdmiPacientesActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
          EstimateValueSwing TelaestimateValue = new EstimateValueSwing ();
          jDesktop.add(TelaestimateValue);
          TelaestimateValue.setVisible(true);
          TelaestimateValue.setPosicao();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void placaMenuTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placaMenuTxtActionPerformed
        VeiculosClientesMotores veiculoClienteMotor = veiculosClientesMotoresController.findByPlaca(placaMenuTxt.getText());

        if (veiculoClienteMotor != null) {
            String message = "Veículo cliente motor encontrado!\n" + "Cliente : "+ veiculoClienteMotor.getVeiculosClientes().getCliente().getNome() + " Veiculo: " + veiculoClienteMotor.getVeiculosMotores().getVeiculo().getModelo() + 
                             " Motor: " + veiculoClienteMotor.getVeiculosMotores().getMotor().getNome() + "\n" +
                             "Óleo Recomendado: " + veiculoClienteMotor.getVeiculosMotores().getMotor().getOleo().getModelo() + "\n" +
                             "Filtro Recomendado: " + veiculoClienteMotor.getVeiculosMotores().getMotor().getFiltro().getModelo() + "\n" +
                             "Última troca de óleo: " + veiculoClienteMotor.getVeiculosClientes().getUltimaTroca();
            JOptionPane.showMessageDialog(this, message);
        } else {
            JOptionPane.showMessageDialog(this, "Veículo cliente motor com placa " + placaMenuTxt.getText() + " não encontrado.");
        }
    }//GEN-LAST:event_placaMenuTxtActionPerformed

    public void startSeeding() {
        SeederTask seederTask = new SeederTask(progressBar);
        seederTask.execute();
    }
   
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
            java.util.logging.Logger.getLogger(FeatureMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FeatureMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FeatureMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FeatureMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        try {
            UIManager.setLookAndFeel(new com.formdev.flatlaf.FlatDarculaLaf());
            SwingUtilities.invokeLater(() -> {
               
                FeatureMain frame = new FeatureMain();
                frame.setVisible(true);
                frame.startSeeding();
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane jDesktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenu jmAgendamentos;
    private javax.swing.JMenu jmPacientes;
    private javax.swing.JMenuItem jmiAdmiPacientes;
    private javax.swing.JTextField placaMenuTxt;
    // End of variables declaration//GEN-END:variables
}
