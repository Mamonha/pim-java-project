/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.viewSwing;

import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.SwingWorker;
import org.example.seeder.FiltroSeeder;
import org.example.seeder.MotorSeeder;
import org.example.seeder.OleoSeeder;
import org.example.seeder.VeiculoMotorSeeder;
import org.example.seeder.VeiculoSeeder;

/**
 *
 * @author lucas
 */
class SeederTask  extends SwingWorker<Void, Integer> {
      private JProgressBar progressBar;
      
       public SeederTask(JProgressBar progressBar) {
        this.progressBar = progressBar;
    }
       @Override
    protected Void doInBackground() throws Exception {
        int totalTasks = 5;
        int progress = 0;

        // Run each seeder and update progress
        FiltroSeeder.runFiltro();
        progress += (100 / totalTasks);
        publish(progress);

        OleoSeeder.runOleo();
        progress += (100 / totalTasks);
        publish(progress);

        MotorSeeder.runMotor();
        progress += (100 / totalTasks);
        publish(progress);

        VeiculoSeeder.runVeiculo();
        progress += (100 / totalTasks);
        publish(progress);

        VeiculoMotorSeeder.runVeiculoMotor();
        progress += (100 / totalTasks);
        publish(progress);

        return null;
    }
    @Override
    protected void process(java.util.List<Integer> chunks) {
        for (Integer chunk : chunks) {
            progressBar.setValue(chunk);
        }
    }
     @Override
    protected void done() {
        JOptionPane.showMessageDialog(progressBar.getParent(), "Seeding Complete");
    }
}
