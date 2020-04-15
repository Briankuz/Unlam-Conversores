/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class ConversorGenerico extends javax.swing.JFrame {

    private List<Conversor> conversores;
    private Conversor selectedConversor;
    
    
    /**
     * Creates new form Conversor
     */
    public ConversorGenerico() {
        initComponents();
        setTitle("Mi Conversor");
        
        // Llenar combo de tipos de Conversores
        conversores = new ArrayList<Conversor>();
        conversores.add(new CentimetrosPulgadasConversor());
        conversores.add(new PulgadasCentimetrosConversor());
        conversores.add(new MetrosKMConversor());
        conversores.add(new KMMetrosConversor());
        
        for (Conversor conversor : conversores) {
            jComboBoxConversores.addItem(conversor.toString());    
        }
        
        // Valor por Defecto
        selectedConversor = conversores.get(0);
        jLabel1.setText(selectedConversor.getLabelValor1());
        
        selectedConversor = conversores.get(1);
        jLabel2.setText(selectedConversor.getLabelValor2());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldOne = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButtonConvertir = new javax.swing.JButton();
        jTextFieldTwo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxConversores = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextFieldOne.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldOneFocusLost(evt);
            }
        });
        jTextFieldOne.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldOneKeyPressed(evt);
            }
        });

        jLabel1.setText("Valor 1");

        jButtonConvertir.setText("Convertir");
        jButtonConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConvertirActionPerformed(evt);
            }
        });

        jTextFieldTwo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldTwoFocusLost(evt);
            }
        });

        jLabel2.setText("Pulgadas");

        jComboBoxConversores.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxConversoresItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jTextFieldTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldOne, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(202, 202, 202)))
                    .addComponent(jComboBoxConversores, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBoxConversores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jButtonConvertir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConvertirActionPerformed
        // System.out.println("Centímetros ingresados = "+ jTextFieldOne.getText()); 
        // Convertir   
       
         
         if (conviertoAPulg ) {
             convertirAPulgadas();
         }
         else if (conviertoACen){
           
             convertirACentimetros();
         }
         else 
          if(conviertoAMetrosKM)
          {
              convertirAKM();
          }
          else
              if(conviertoAKMMetros)
              {
                   convertirAMetros();
              }
         
         
    }//GEN-LAST:event_jButtonConvertirActionPerformed
          
    private void convertirAPulgadas() throws HeadlessException {
        Double cent;
        try {
            cent = Double.valueOf(jTextFieldOne.getText().replace(',', '.'));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Formato no válido", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Double valor2 = selectedConversor.convertirValor2Valor1(cent);
        //System.out.println(pulg);
        jTextFieldTwo.setText(String.format("%.2f", valor2));
    }
    
    private void convertirACentimetros() throws HeadlessException{
        Double pulg;
        try {
            pulg = Double.valueOf(jTextFieldTwo.getText().replace(',', '.'));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Formato no válido", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Double valor1 = selectedConversor.convertirValor1Valor2(pulg);
        //System.out.println(pulg);
        jTextFieldOne.setText(String.format("%.2f", valor1));
    }
    
     private void convertirAMetros() {
        //OK
          Double km;
        try {
            km = Double.valueOf(jTextFieldOne.getText().replace(',', '.'));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Formato no válido", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Double valor1 = selectedConversor.convertirValor2Valor1(km);
        //System.out.println(pulg);
        jTextFieldTwo.setText(String.format("%.2f", valor1));
         
    }
     
     
      private void convertirAKM() throws HeadlessException{
        Double metros;
        try {
            metros = Double.valueOf(jTextFieldOne.getText().replace(',', '.'));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Formato no válido", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Double valor1 = selectedConversor.convertirValor1Valor2(metros);
        //System.out.println(pulg);
        jTextFieldTwo.setText(String.format("%.2f", valor1));
    }

    private void jTextFieldOneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldOneFocusLost
//        conviertoAPulg = true;
//        conviertoAMetrosKM = true;
    }//GEN-LAST:event_jTextFieldOneFocusLost

    private void jTextFieldTwoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldTwoFocusLost
//        conviertoAPulg = false;
//        conviertoAMetrosKM = false;
    }//GEN-LAST:event_jTextFieldTwoFocusLost

    private void jTextFieldOneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldOneKeyPressed
        // Se presiono CRLF?
        if (evt.getKeyChar()==KeyEvent.VK_ENTER) {
            convertirAPulgadas();
            convertirACentimetros();
            convertirAMetros();
            convertirAKM();
        }
    }//GEN-LAST:event_jTextFieldOneKeyPressed

    private void jComboBoxConversoresItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxConversoresItemStateChanged
        
        int selectedIndex = jComboBoxConversores.getSelectedIndex();
        jLabel1.setText(conversores.get(selectedIndex).getLabelValor1());
        jLabel2.setText(conversores.get(selectedIndex).getLabelValor2());
        selectedConversor = conversores.get(selectedIndex);
        clearConvertFlag();
        if(selectedIndex == 0)
        {   jTextFieldOne.enable();
            jTextFieldTwo.disable();
            conviertoAPulg = true;
            conviertoACen=false;
            conviertoAMetrosKM = false; 
        }
        
        if(selectedIndex == 1)
        {
            jTextFieldTwo.enable();
            jTextFieldOne.disable();
            conviertoACen=true;
            conviertoAMetrosKM = false;
            conviertoAPulg = false;
        }
         if(selectedIndex == 2)
        {
            jTextFieldTwo.disable();
            jTextFieldOne.enable();
            conviertoAMetrosKM = true;
            conviertoAPulg = false;
            conviertoACen = false;
            
        }
         if(selectedIndex ==3)
         {
           jTextFieldTwo.disable();
            jTextFieldOne.enable();
            conviertoAKMMetros = true;
            conviertoAPulg = false;
            conviertoACen = false;
         }
         
        clearTxtField();
        
    }//GEN-LAST:event_jComboBoxConversoresItemStateChanged
public void clearTxtField() {
		jTextFieldOne.setText(null);
                jTextFieldTwo.setText(null);
	}
public void clearConvertFlag()
{
            conviertoAKMMetros = false;
            conviertoAPulg = false;
            conviertoACen = false;
            conviertoAMetrosKM = false;
}
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
            java.util.logging.Logger.getLogger(ConversorGenerico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConversorGenerico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConversorGenerico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConversorGenerico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConversorGenerico().setVisible(true);
            }
        });
    }

    private boolean conviertoAPulg;
    private boolean conviertoACen;
    private boolean conviertoAMetrosKM;
    private boolean conviertoAKMMetros;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConvertir;
    private javax.swing.JComboBox<String> jComboBoxConversores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextFieldOne;
    private javax.swing.JTextField jTextFieldTwo;
    // End of variables declaration//GEN-END:variables

   

   

    
}