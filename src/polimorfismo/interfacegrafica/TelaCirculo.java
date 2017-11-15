package polimorfismo.interfacegrafica;

import java.util.ArrayList;
import polimorfismo.classes.Circulo;
import polimorfismo.classes.Figura;

public class TelaCirculo extends javax.swing.JPanel {

    private ArrayList<Figura> circulos;

    public TelaCirculo() {
        initComponents();
        circulos = new ArrayList<Figura>();
    }
    
    public void limparDados(){
        this.raioField.setText("");
        this.nomeField.setText("");
        this.resultadoField.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        raioLabel = new javax.swing.JLabel();
        raioField = new javax.swing.JTextField();
        botaoCalcular = new javax.swing.JButton();
        resultadoLabel = new javax.swing.JLabel();
        resultadoField = new javax.swing.JLabel();
        nomeField = new javax.swing.JTextField();
        nomeLabel = new javax.swing.JLabel();

        raioLabel.setText("Raio:");

        raioField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raioFieldActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(botaoCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(90, 90, 90)
                        .addComponent(resultadoLabel)
                        .addGap(18, 18, 18)
                        .addComponent(resultadoField))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(raioLabel)
                                .addGap(24, 24, 24)
                                .addComponent(raioField, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nomeLabel)
                                .addGap(18, 18, 18)
                                .addComponent(nomeField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(39, Short.MAX_VALUE))
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
                    .addComponent(raioLabel)
                    .addComponent(raioField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultadoLabel)
                    .addComponent(resultadoField)
                    .addComponent(botaoCalcular))
                .addContainerGap(64, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void raioFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raioFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_raioFieldActionPerformed

    private void botaoCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCalcularActionPerformed
        Figura circulo = new Circulo(
                Double.parseDouble(raioField.getText()));
        circulo.setNome(nomeField.getText());
        resultadoField.setText(circulo.area().toString());
        circulos.add(circulo);
    }//GEN-LAST:event_botaoCalcularActionPerformed

    private void nomeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeFieldActionPerformed

    public ArrayList<Figura> getCirculos() {
        return circulos;
    }

    public void setCirculos(ArrayList<Figura> circulos) {
        this.circulos = circulos;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCalcular;
    private javax.swing.JTextField nomeField;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JTextField raioField;
    private javax.swing.JLabel raioLabel;
    private javax.swing.JLabel resultadoField;
    private javax.swing.JLabel resultadoLabel;
    // End of variables declaration//GEN-END:variables
}