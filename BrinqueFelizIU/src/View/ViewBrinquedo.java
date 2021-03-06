/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ViewBrinquedos.java
 *
 * Created on 19/11/2010, 10:58:28
 */
package View;

import Model.Brinquedo;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author Jane
 */
public class ViewBrinquedo extends javax.swing.JPanel {

    /** Creates new form ViewBrinquedos */
    public ViewBrinquedo() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelFaixa = new javax.swing.JLabel();
        jTextFieldFaixa = new javax.swing.JTextField();
        jLabelRelTitulo = new javax.swing.JLabel();
        jButtonSalvar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jFTextFieldCodBarras = new javax.swing.JFormattedTextField();
        jLabelEstoque = new javax.swing.JLabel();
        jLabelCodBarras = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jTextFieldTitulo = new javax.swing.JTextField();
        jLabelPreco = new javax.swing.JLabel();
        jTextFieldEstoque = new javax.swing.JTextField();
        jTextFieldPreco = new javax.swing.JTextField();

        jLabelFaixa.setText("Faixa etária:");
        jLabelFaixa.setName("jLabelFaixa"); // NOI18N

        jTextFieldFaixa.setName("jTextFieldFaixa"); // NOI18N

        jLabelRelTitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelRelTitulo.setText("Cadastro de Brinquedos");
        jLabelRelTitulo.setName("jLabelRelTitulo"); // NOI18N

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setName("jButtonSalvar"); // NOI18N
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonLimpar.setText("Limpar");
        jButtonLimpar.setName("jButtonLimpar"); // NOI18N
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jFTextFieldCodBarras.setName("jFTextFieldCodBarras"); // NOI18N

        jLabelEstoque.setText("Quantidade em estoque:");
        jLabelEstoque.setName("jLabelEstoque"); // NOI18N

        jLabelCodBarras.setText("Código de Barras:");
        jLabelCodBarras.setName("jLabelCodBarras"); // NOI18N

        jLabelTitulo.setText("Título:");
        jLabelTitulo.setName("jLabelTitulo"); // NOI18N

        jTextFieldTitulo.setName("jTextFieldTitulo"); // NOI18N

        jLabelPreco.setText("Preço:");
        jLabelPreco.setName("jLabelPreco"); // NOI18N

        jTextFieldEstoque.setDocument(new FormatoInteiroDocument());
        jTextFieldEstoque.setName("jTextFieldEstoque"); // NOI18N

        jTextFieldPreco.setDocument(new FormatDoubleDocument());
        jTextFieldPreco.setName("jTextFieldPreco"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabelCodBarras)
                                .addComponent(jLabelTitulo)
                                .addComponent(jLabelFaixa)
                                .addComponent(jLabelEstoque)
                                .addComponent(jLabelPreco))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextFieldPreco, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldEstoque, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldFaixa, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFTextFieldCodBarras, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonLimpar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButtonSalvar)
                            .addGap(225, 225, 225)))
                    .addComponent(jLabelRelTitulo))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelRelTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTitulo)
                    .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCodBarras)
                    .addComponent(jFTextFieldCodBarras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFaixa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFaixa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEstoque)
                    .addComponent(jTextFieldEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPreco)
                    .addComponent(jTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonLimpar))
                .addGap(174, 174, 174))
        );
    }// </editor-fold>//GEN-END:initComponents

    static private double transDouble(String entrada) {
        double valor = 0.0;


        entrada = entrada.replace(",", ".");
        entrada = entrada.replace(" ", "");

        try {
            valor = Double.parseDouble(entrada);
            return valor;

        } catch (NumberFormatException e) {
            BrinqueFelizApp.mostraMensagem("Valor inválido. Digite novemente.", "Cadastro de Brinquedos");
            return -1;
        }



    }
    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed

        String bcod, bnome, bfaixa, spreco, sest;
        int est;
        double preco;
        Brinquedo brinq;
        bcod = jFTextFieldCodBarras.getText();
        bnome = jTextFieldTitulo.getText();
        bfaixa = jTextFieldFaixa.getText();
        spreco = jTextFieldPreco.getText();

        sest = jTextFieldEstoque.getText();
        sest = sest.replace(" ", "");
        spreco = spreco.replace(" ", "");
        if (sest.length() < 1) {
            BrinqueFelizApp.mostraMensagem("Estoque inválido! \n"
                    + "Preencha corretamente o estoque", "Cadastro de "
                    + "Brinquedos");
        } else if (spreco.length() < 1) {

            spreco = spreco.replace(".", "");
            spreco = spreco.replace(",", ".");

            try {
                preco = Double.parseDouble(spreco);
            } catch (NumberFormatException e) {
                BrinqueFelizApp.mostraMensagem("Preço inválido. \nPreencha "
                        + "corretamente.", "Cadastro de Brinquedos");

            }

        } else {
            est = Integer.parseInt(sest);

            preco = transDouble(spreco);
            if (preco != -1) {

                brinq = BrinqueFelizApp.controle.buscarBrinquedoCodBarras(bcod);
                if (brinq == null) {


                    brinq = new Brinquedo(bcod, bnome, bfaixa, est, preco);

                    BrinqueFelizApp.controle.salvarBrinquedo(brinq);
                    jFTextFieldCodBarras.setText("");
                    jTextFieldTitulo.setText("");
                    jTextFieldFaixa.setText("");
                    jTextFieldPreco.setText("");
                    jTextFieldEstoque.setText("");
                } else {
                    BrinqueFelizApp.mostraMensagem("Brinquedo já possui cadastro no sistema! \n"
                            + "Caso tenha recebido novos produtos, apenas"
                            + " atualize o estoque", "Cadastro de Brinquedos");

                }
            }
        }

    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        jFTextFieldCodBarras.setText("");
        jTextFieldTitulo.setText("");
        jTextFieldFaixa.setText("");
        jTextFieldPreco.setText("");
        jTextFieldEstoque.setText("");
}//GEN-LAST:event_jButtonLimparActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JFormattedTextField jFTextFieldCodBarras;
    private javax.swing.JLabel jLabelCodBarras;
    private javax.swing.JLabel jLabelEstoque;
    private javax.swing.JLabel jLabelFaixa;
    private javax.swing.JLabel jLabelPreco;
    private javax.swing.JLabel jLabelRelTitulo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JTextField jTextFieldEstoque;
    private javax.swing.JTextField jTextFieldFaixa;
    private javax.swing.JTextField jTextFieldPreco;
    private javax.swing.JTextField jTextFieldTitulo;
    // End of variables declaration//GEN-END:variables

    private class FormatDoubleDocument extends PlainDocument {

        public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
            try {
                Integer.parseInt(str);
                String texto = getText(0, getLength());
                if (texto.length() < 13) {
                    remove(0, getLength());
                    StringBuffer strBuf = new StringBuffer(texto.replaceAll(",", "").replace(".", "") + str);
                    if (strBuf.length() < 3) {
                        strBuf.insert(0, ",");
                        strBuf.insert(0, "0");
                    } else {
                        if (strBuf.length() == 4 && strBuf.charAt(0) == '0') {
                            strBuf.deleteCharAt(0);
                        }
                        strBuf.insert(strBuf.length() - 2, ",");
                    }
                    if (strBuf.length() > 6) {
                        strBuf.insert(strBuf.length() - 6, ".");
                    }
                    if (strBuf.length() > 10) {
                        strBuf.insert(strBuf.length() - 10, ".");
                    }
                    super.insertString(0, strBuf.toString(), a);
                }
            } catch (Exception e) {
            }
        }
    }

    private class FormatoInteiroDocument extends PlainDocument {

        @Override
        public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
            try {
                Integer.parseInt(str);
                String texto = getText(0, getLength());
                if (texto.length() < 11) {
                    remove(0, getLength());
                    StringBuffer strBuf = new StringBuffer(texto.replaceAll(",", "").replace(".", "") + str);

                    if (strBuf.length() > 3) {
                        strBuf.insert(strBuf.length() - 3, ".");
                    }
                    if (strBuf.length() > 7) {
                        strBuf.insert(strBuf.length() - 7, ".");
                    }

                    super.insertString(0, strBuf.toString(), a);
                }
            } catch (Exception e) {
            }
        }
    }
}
