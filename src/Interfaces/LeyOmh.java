/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import javax.swing.JOptionPane;

/**
 *
 * @author INES CHAR
 */
public class LeyOmh extends javax.swing.JFrame {

    Leyes ohm = new Leyes();
    float voltaje, corriente, resistencia, potencia;
    int index = 0;
    String titulo = "Calculadora ley de ohm \n";
    String mensaje = "";
    String potenciaS = "";
    
    /**
     * Creates new form LeyOmh
     */
    public LeyOmh() {
        initComponents();
        this.setLocationRelativeTo(null);
        //Opción que inhabilita la opción de cerrar
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        calcular = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        v1 = new javax.swing.JLabel();
        v2 = new javax.swing.JLabel();
        combo = new javax.swing.JComboBox<>();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CALCULADORA LEY DE OHM");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, -1, -1));

        calcular.setBackground(new java.awt.Color(0, 153, 153));
        calcular.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        calcular.setForeground(new java.awt.Color(255, 255, 255));
        calcular.setText("Calcular");
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
            }
        });
        jPanel2.add(calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        area.setColumns(20);
        area.setRows(5);
        jScrollPane1.setViewportView(area);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 330, 180));

        jRadioButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton2.setText("Limpiar texto");
        jPanel2.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, -1, -1));

        jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton1.setText("Potencia");
        jPanel2.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Variable:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, -1, -1));

        v1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        v1.setText("Corriente:");
        jPanel2.add(v1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, -1, -1));

        v2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        v2.setText("Resistencia:");
        jPanel2.add(v2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, -1, -1));

        combo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Voltaje", "Corriente", "Resistencia" }));
        combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboActionPerformed(evt);
            }
        });
        jPanel2.add(combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 90, -1));

        t1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 90, -1));

        t2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, 90, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 670, 300));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboActionPerformed
        // TODO add your handling code here:
        
        index = combo.getSelectedIndex();
        
        if(index == 0){
            
            v1.setText("Corriente: ");
            v2.setText("Resistencia: ");
        
        }else if (index == 1){
           
            v1.setText("Voltaje: ");
            v2.setText("Resistencia: ");
        
        }else if (index == 2){
           
            v1.setText("Voltaje: ");
            v2.setText("Corriente: ");
            
        }
        
        
    }//GEN-LAST:event_comboActionPerformed

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
        // TODO add your handling code here:
        
        switch (index){
            
            case 0:
                corriente = Float.parseFloat(t1.getText());
                resistencia = Float.parseFloat(t2.getText());
                voltaje = ohm.voltaje(corriente, resistencia);
                calcularPotencia();
                mensaje = titulo + "\n" +
                        "Datos ingresados:\nCorriente " + corriente + ""
                        + "A\nResistencia: " + resistencia + " Ω\n\nDatos obtenidos: \n" 
                        + "Voltaje: " + voltaje + " V\n" + potenciaS;
                break;
                
            case 1:
                voltaje = Float.parseFloat(t1.getText());
                resistencia = Float.parseFloat(t2.getText());
                
                if (resistencia != 0){
                corriente = ohm.corriente(voltaje, resistencia);
                calcularPotencia();
                mensaje = titulo + "\n" +
                        "Datos ingresados:\nVoltaje " + voltaje + ""
                        + "V\nResistencia: " + resistencia + " Ω\n\nDatos obtenidos: \n" 
                        + "Corriente: " + corriente + " A\n" + potenciaS;
                }else {
                    JOptionPane.showMessageDialog(null, "El valor de la resistencia debe ser diferente de cero", "Error", JOptionPane.WARNING_MESSAGE);
                }
                break;
                
            case 2:
                voltaje = Float.parseFloat(t1.getText());
                corriente = Float.parseFloat(t2.getText());
                
                if (corriente != 0){
                resistencia = ohm.resistencia(voltaje, corriente);
                calcularPotencia();
                mensaje = titulo + "\n" +
                        "Datos ingresados:\nVoltaje " + voltaje + ""
                        + "V\nCorriente: " + corriente + " A\n\nDatos obtenidos: \n" 
                        + "Resistencia: " + resistencia + " Ω\n" + potenciaS;
                }else {
                    JOptionPane.showMessageDialog(null, "El valor de la corriente debe ser diferente de cero", "Error", JOptionPane.WARNING_MESSAGE);
                }
                break;
                
        }
                area.setText(mensaje);
    }//GEN-LAST:event_calcularActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        area.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new Menu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(LeyOmh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LeyOmh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LeyOmh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LeyOmh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LeyOmh().setVisible(false);
            }
        });
    }
    
    public void calcularPotencia(){
        
        int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea calcular la potencia?", "Calcular potencia", JOptionPane.YES_NO_OPTION);
        
        if (confirmar == 0){
            
            potencia = ohm.potencia(index);
            potenciaS = "Potencia: " + potencia + "W";
            
        }else {
            potenciaS = "";
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area;
    private javax.swing.JButton calcular;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JLabel v1;
    private javax.swing.JLabel v2;
    // End of variables declaration//GEN-END:variables
}
