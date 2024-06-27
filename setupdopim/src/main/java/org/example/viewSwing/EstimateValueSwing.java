/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package org.example.viewSwing;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import org.example.controller.MotorController;
import org.example.controller.VeiculoController;
import org.example.controller.VeiculosMotoresController;
import org.example.model.entities.Motor;
import org.example.model.entities.Veiculo;
import org.example.model.entities.VeiculosMotores;

/**
 *
 * @author Queiro Ubeda
 */
public class EstimateValueSwing extends javax.swing.JInternalFrame {

    VeiculoController veiculocontroller = new VeiculoController();
    MotorController motorController = new MotorController();
    
    /**
     * Creates new form InternalForme
     */
    public EstimateValueSwing() {

        initComponents();
        initComboBox();
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JpForme = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jpButton = new javax.swing.JPanel();
        jbSalvar = new javax.swing.JButton();
        jbFechar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        labelEspOleo = new javax.swing.JLabel();
        labelModeloOleo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        labelModeloFiltro = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        labelModeloFiltro1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Marca veiculo:");

        jLabel2.setText("Modelo de veiculo:");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox2MouseClicked(evt);
            }
        });
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Ano de veiculo:");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox3MouseClicked(evt);
            }
        });
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jLabel4.setText("Motor de veiculo:");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox4MouseClicked(evt);
            }
        });
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JpFormeLayout = new javax.swing.GroupLayout(JpForme);
        JpForme.setLayout(JpFormeLayout);
        JpFormeLayout.setHorizontalGroup(
            JpFormeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpFormeLayout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addGroup(JpFormeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(98, 98, 98)
                .addGroup(JpFormeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JpFormeLayout.setVerticalGroup(
            JpFormeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpFormeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JpFormeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(JpFormeLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JpFormeLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(JpFormeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(JpFormeLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JpFormeLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jbSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/SalvarIcon2.png"))); // NOI18N
        jbSalvar.setText("Consultar");
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(225, 225, 225)
                .addComponent(jbFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        jpButtonLayout.setVerticalGroup(
            jpButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpButtonLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jpButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jPanel2.setBackground(new java.awt.Color(5, 113, 189));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Recomendaçoes:");

        jLabel6.setText("Especificão Oleo:");

        jLabel7.setText("Modelo Oleo:");

        labelEspOleo.setText("  ");

        labelModeloOleo.setText("  ");

        labelModeloFiltro.setText("Modelo de Filtro:");

        jLabel11.setText("  ");

        labelModeloFiltro1.setText("Ref:");

        jLabel12.setText("  ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelEspOleo, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelModeloOleo, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 95, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(labelModeloFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(labelModeloFiltro1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(labelEspOleo)
                    .addComponent(labelModeloOleo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelModeloFiltro1)
                        .addComponent(jLabel12))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelModeloFiltro)
                        .addComponent(jLabel11)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JpForme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JpForme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        Veiculo veiculo = new Veiculo();
    Motor motor = new Motor();
    
    Object selectedItem = jComboBox3.getSelectedItem();
    if (selectedItem != null) {
        String selectedString = selectedItem.toString();
        String[] parts = selectedString.split(" ");
        if (parts.length > 0) {
            Long id = Long.valueOf(parts[0]);
            veiculo = veiculocontroller.findById(id);
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao obter ID"); 
        }
    } else {
        JOptionPane.showMessageDialog(null, "Ano não selecionado");
        return;
    }

    if (jComboBox4.getSelectedIndex() == 0) {
        JOptionPane.showMessageDialog(null, "Marca do Motor não selecionada");
    } else {
        selectedItem = jComboBox4.getSelectedItem();
        if (selectedItem != null) {
            String selectedString = selectedItem.toString();
            String[] parts = selectedString.split(" ");
            if (parts.length > 0) {
                Long id = Long.valueOf(parts[0]);
                motor = motorController.findById(id);
                VeiculosMotoresController veiculosMotoresController = new VeiculosMotoresController();

                VeiculosMotores veiculosMotores = new VeiculosMotores();
                veiculosMotores.setMotor(motor);
                veiculosMotores.setVeiculo(veiculo);

                veiculosMotoresController.create(veiculosMotores);
                
                Recomendacoes(veiculosMotores);
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao obter ID"); 
            }
        } else {
            JOptionPane.showMessageDialog(null, "Motor não selecionado");
        }
    }  
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFecharActionPerformed
        dispose();
    }//GEN-LAST:event_jbFecharActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jComboBox2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox2MouseClicked
        jComboBox2.removeAllItems();
        jComboBox2.addItem("Selecionar Modelo");
        List<Veiculo> veiculos = new ArrayList<>();
        Veiculo veiculo= new  Veiculo();
        
            String selectedItem = jComboBox1.getSelectedItem().toString();
            String[] parts = selectedItem.split(" ");
            if (parts.length > 0) {
                Long id = Long.valueOf(parts[0]);
                veiculo= veiculocontroller.findById(id);
                veiculos = veiculocontroller.findVeiculosModelos(veiculo.getMarca());
                for(Veiculo veiculochad: veiculos){
                    jComboBox2.addItem(veiculochad.getId()+" "+veiculochad.getModelo());
                }
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao obter ID "); 
            
        }
    }//GEN-LAST:event_jComboBox2MouseClicked

    private void jComboBox3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox3MouseClicked
        jComboBox3.removeAllItems();
        jComboBox3.addItem("Selecionar Ano");
        List<Veiculo> veiculos = new ArrayList<>();
        Veiculo veiculo= new  Veiculo();
        
        
            String selectedItem = jComboBox2.getSelectedItem().toString();
            String[] parts = selectedItem.split(" ");
            if (parts.length > 0) {
                Long id = Long.valueOf(parts[0]);
                veiculo= veiculocontroller.findById(id);
                veiculos = veiculocontroller.findVeiculosAno(veiculo.getAno(), veiculo.getModelo());
                for(Veiculo veiculochad: veiculos){
                    jComboBox3.addItem(veiculochad.getId()+" "+veiculochad.getAno());
                }
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao obter ID "); 
            }
    }//GEN-LAST:event_jComboBox3MouseClicked

    private void jComboBox4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox4MouseClicked
        jComboBox4.removeAllItems();
        jComboBox4.addItem("Selecionar Motor");
        List <Motor> motores= motorController.findAll();
        if (jComboBox3.getSelectedIndex()==0) {
            JOptionPane.showMessageDialog(null, "Ano Invalido");
        }else {   
            for(Motor motorchad: motores){
                    jComboBox4.addItem(motorchad.getId()+" "+motorchad.getNome());
                }
        }
    }//GEN-LAST:event_jComboBox4MouseClicked

    private void prencherComboBoxMarcas(){
        jComboBox1.addItem("Iten test");

        jComboBox1.removeAllItems();
        jComboBox1.addItem("Selecionar Marca");
        List<Veiculo> veiculos = new ArrayList<>();
        List<Veiculo> veiculosVerificar = new ArrayList<>();
        veiculos = veiculocontroller.findAll();
        for (Veiculo veiculochad : veiculos) {
            boolean marcaJaImpressa = false;
            for (Veiculo veiculoInList : veiculosVerificar) {
                if (veiculochad.getMarca().equals(veiculoInList.getMarca())) {
                    marcaJaImpressa = true;
                    break;
                }
            }
            if (!marcaJaImpressa) {
                jComboBox1.addItem(veiculochad.getId()+" "+veiculochad.getMarca());
                veiculosVerificar.add(veiculochad);
            }
        }
    }
    
    private void initComboBox(){
        
        prencherComboBoxMarcas();
        
        jComboBox2.removeAllItems();
        jComboBox2.addItem("Selecionar Modelo");
        
        jComboBox3.removeAllItems();
        jComboBox3.addItem("Selecionar Ano");
        
        jComboBox4.removeAllItems();
        jComboBox4.addItem("Selecionar Motor");

        
    }
    
    private void Recomendacoes (VeiculosMotores veiculoMotor){
        labelEspOleo.setText(veiculoMotor.getMotor().getOleo().getEspecificacao());
        labelModeloOleo.setText(veiculoMotor.getMotor().getOleo().getModelo());
        jLabel11.setText(veiculoMotor.getMotor().getFiltro().getModelo());
        jLabel12.setText(veiculoMotor.getId().toString());
    }
    
    public void setPosicao() {
        JDesktopPane desktopPane = getDesktopPane();
        if (desktopPane != null) {
            Dimension d = desktopPane.getSize();
            this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
        }
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel JpForme;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbFechar;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JPanel jpButton;
    private javax.swing.JLabel labelEspOleo;
    private javax.swing.JLabel labelModeloFiltro;
    private javax.swing.JLabel labelModeloFiltro1;
    private javax.swing.JLabel labelModeloOleo;
    // End of variables declaration//GEN-END:variables
}
