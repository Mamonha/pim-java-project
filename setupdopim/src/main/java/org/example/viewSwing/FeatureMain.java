/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.example.viewSwing;

import java.awt.BorderLayout;
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

        jDesktop = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        placaMenuTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar = new javax.swing.JMenuBar();
        jmPacientes = new javax.swing.JMenu();
        jmiAdmiPacientes = new javax.swing.JMenuItem();
        jmAgendamentos = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("JetBrains Mono", 0, 18)); // NOI18N
        jLabel1.setText("Digite A Placa");

        placaMenuTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placaMenuTxtActionPerformed(evt);
            }
        });

        jLabel2.setText("Nosso sistema permite você achar o cliente do seu veiculo pela placa");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(placaMenuTxt)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(placaMenuTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        jDesktop.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopLayout = new javax.swing.GroupLayout(jDesktop);
        jDesktop.setLayout(jDesktopLayout);
        jDesktopLayout.setHorizontalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopLayout.createSequentialGroup()
                .addGap(527, 527, 527)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(591, Short.MAX_VALUE))
        );
        jDesktopLayout.setVerticalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopLayout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(375, Short.MAX_VALUE))
        );

        jmPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PacientesIcon.png"))); // NOI18N
        jmPacientes.setText("Clientes");
        jmPacientes.setToolTipText("");

        jmiAdmiPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PacientesAdmiIcon.png"))); // NOI18N
        jmiAdmiPacientes.setText("Administrar");
        jmiAdmiPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAdmiPacientesActionPerformed(evt);
            }
        });
        jmPacientes.add(jmiAdmiPacientes);

        jMenuBar.add(jmPacientes);

        jmAgendamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/AgendaIcon.png"))); // NOI18N
        jmAgendamentos.setText("Orçamento");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PacientesAdmiIcon.png"))); // NOI18N
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
            .addComponent(jDesktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktop)
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
        SwingUtilities.invokeLater(() -> {
        FeatureMain frame = new FeatureMain();
        frame.setVisible(true);
        //frame.startSeeding();
    });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane jDesktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu jmAgendamentos;
    private javax.swing.JMenu jmPacientes;
    private javax.swing.JMenuItem jmiAdmiPacientes;
    private javax.swing.JTextField placaMenuTxt;
    // End of variables declaration//GEN-END:variables
}
