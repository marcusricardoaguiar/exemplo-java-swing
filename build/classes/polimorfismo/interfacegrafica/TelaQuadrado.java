package polimorfismo.interfacegrafica;

import java.util.ArrayList;
import polimorfismo.classes.Figura;
import polimorfismo.classes.Quadrado;

public class TelaQuadrado extends javax.swing.JPanel {

    private ArrayList<Figura> quadrados;

    public TelaQuadrado() {
        initComponents();
        quadrados = new ArrayList<Figura>();
    }
    
    public void limparDados(){
        this.ladoField.setText("");
        this.nomeField.setText("");
        this.resultadoField.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        ladoLabel = new javax.swing.JLabel();
        ladoField = new javax.swing.JTextField();
        botaoCalcular = new javax.swing.JButton();
        resultadoLabel = new javax.swing.JLabel();
        resultadoField = new javax.swing.JLabel();
        nomeField = new javax.swing.JTextField();
        nomeLabel = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ladoLabel.setText("Lado:");

        ladoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ladoFieldActionPerformed(evt);
            }
        });

        botaoCalcular.setText("Calcular");
        botaoCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCalcularActionPerformed(evt);
            }
        });

        resultadoLabel.setText("Resultado:");

        resultadoField.setText("0.0");

        nomeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeFieldActionPerformed(evt);
            }
        });

        nomeLabel.setText("Nome:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(resultadoLabel)
                        .addGap(18, 18, 18)
                        .addComponent(resultadoField))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeLabel)
                            .addComponent(ladoLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ladoField, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nomeField, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeLabel)
                    .addComponent(nomeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ladoLabel)
                    .addComponent(ladoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultadoLabel)
                    .addComponent(resultadoField)
                    .addComponent(botaoCalcular))
                .addContainerGap(64, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ladoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ladoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ladoFieldActionPerformed

    private void botaoCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCalcularActionPerformed
        Figura quadrado = new Quadrado(
                Double.parseDouble(ladoField.getText()));
        quadrado.setNome(nomeField.getText());
        resultadoField.setText(quadrado.area().toString());
        quadrados.add(quadrado);
    }//GEN-LAST:event_botaoCalcularActionPerformed

    private void nomeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeFieldActionPerformed

    public ArrayList<Figura> getQuadrados() {
        return quadrados;
    }

    public void setQuadrados(ArrayList<Figura> quadrados) {
        this.quadrados = quadrados;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCalcular;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JTextField ladoField;
    private javax.swing.JLabel ladoLabel;
    private javax.swing.JTextField nomeField;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JLabel resultadoField;
    private javax.swing.JLabel resultadoLabel;
    // End of variables declaration//GEN-END:variables
}
