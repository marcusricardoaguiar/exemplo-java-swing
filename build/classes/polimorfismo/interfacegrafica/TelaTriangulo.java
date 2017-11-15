package polimorfismo.interfacegrafica;

import java.util.ArrayList;
import polimorfismo.classes.Figura;
import polimorfismo.classes.Triangulo;

public class TelaTriangulo extends javax.swing.JPanel {

    private ArrayList<Figura> triangulos;

    public TelaTriangulo() {
        initComponents();
        triangulos = new ArrayList<Figura>();
    }
    
    public void limparDados(){
        this.alturaField.setText("");
        this.baseField.setText("");
        this.nomeField.setText("");
        this.resultadoField.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        baseLabel = new javax.swing.JLabel();
        alturaLabel = new javax.swing.JLabel();
        baseField = new javax.swing.JTextField();
        alturaField = new javax.swing.JTextField();
        botaoCalcular = new javax.swing.JButton();
        resultadoLabel = new javax.swing.JLabel();
        resultadoField = new javax.swing.JLabel();
        nomeField = new javax.swing.JTextField();
        nomeLabel = new javax.swing.JLabel();

        baseLabel.setText("Base:");

        alturaLabel.setText("Altura:");

        baseField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baseFieldActionPerformed(evt);
            }
        });

        alturaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alturaFieldActionPerformed(evt);
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                        .addComponent(resultadoLabel)
                        .addGap(18, 18, 18)
                        .addComponent(resultadoField))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(alturaLabel)
                            .addComponent(baseLabel)
                            .addComponent(nomeLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(baseField, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(alturaField, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nomeField))))
                .addContainerGap(40, Short.MAX_VALUE))
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
                    .addComponent(baseLabel)
                    .addComponent(baseField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(alturaLabel)
                    .addComponent(alturaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(resultadoLabel)
                        .addComponent(resultadoField))
                    .addComponent(botaoCalcular))
                .addContainerGap(33, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void baseFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baseFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_baseFieldActionPerformed

    private void alturaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alturaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alturaFieldActionPerformed

    private void botaoCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCalcularActionPerformed
        Figura triangulo = new Triangulo(
                Double.parseDouble(baseField.getText()), 
                Double.parseDouble(alturaField.getText()));
        triangulo.setNome(nomeField.getText());
        resultadoField.setText(triangulo.area().toString());
        triangulos.add(triangulo);
    }//GEN-LAST:event_botaoCalcularActionPerformed

    private void nomeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeFieldActionPerformed

    public ArrayList<Figura> getTriangulos() {
        return triangulos;
    }

    public void setTriangulos(ArrayList<Figura> triangulos) {
        this.triangulos = triangulos;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alturaField;
    private javax.swing.JLabel alturaLabel;
    private javax.swing.JTextField baseField;
    private javax.swing.JLabel baseLabel;
    private javax.swing.JButton botaoCalcular;
    private javax.swing.JTextField nomeField;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JLabel resultadoField;
    private javax.swing.JLabel resultadoLabel;
    // End of variables declaration//GEN-END:variables
}