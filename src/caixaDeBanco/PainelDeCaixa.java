/*
 *UNICESUMAR
 *Data: 	03 de outubro de 2020
 *Discente: 	Alexsandro Reis Nascimento		RA 19117932-5
 *Disciplina:	Programação 2
 *Curso:	Análise e Desenvolvimento de Sistemas

				Mapa de Programação II 
 */
/**
 * @author Alexsandro Reis Nascimento
 */


package caixaDeBanco;


//import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class PainelDeCaixa extends javax.swing.JFrame {
    
    //atributos da classe Painel de Caixa
    private List<Senha> filaCaixa;
    private int numComum; // contador da senha de atendimento comum
    private int numRapido; // contador da senha de atendimento rapido
    private int numPrioritario; // contador da senha de atendimento prioritario
    
    
    /**
     * Creates new form PainelDeCaixa
     */
    public PainelDeCaixa() {
        initComponents();
        filaCaixa = new ArrayList<Senha>();
        numComum = 0;
        numRapido = 0;
        numPrioritario = 0;
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lAreaCliente = new javax.swing.JLabel();
        painelCliente = new javax.swing.JPanel();
        btComum = new javax.swing.JButton();
        btRapido = new javax.swing.JButton();
        btPrioritario = new javax.swing.JButton();
        lEscolhaSeuAtendimento = new javax.swing.JLabel();
        campoSuaSenha = new javax.swing.JTextField();
        lSuaSenha = new javax.swing.JLabel();
        painelCaixa = new javax.swing.JPanel();
        btCaixa1 = new javax.swing.JButton();
        btCaixa2 = new javax.swing.JButton();
        btCaixa3 = new javax.swing.JButton();
        btCaixa4 = new javax.swing.JButton();
        lAreaCaixa = new javax.swing.JLabel();
        lDisplaySenha = new javax.swing.JLabel();
        lDisplayNmCaixa = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Painel de Caixa - Banco Nascimento");
        setResizable(false);

        lAreaCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lAreaCliente.setText("Para Clientes:");
        lAreaCliente.setToolTipText("");

        painelCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btComum.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btComum.setText("Comum");
        btComum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btComumActionPerformed(evt);
            }
        });

        btRapido.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btRapido.setText("Rápido");
        btRapido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRapidoActionPerformed(evt);
            }
        });

        btPrioritario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btPrioritario.setText("Prioritário");
        btPrioritario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPrioritarioActionPerformed(evt);
            }
        });

        lEscolhaSeuAtendimento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lEscolhaSeuAtendimento.setText("Escolha seu tipo de atendimento");

        campoSuaSenha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        campoSuaSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoSuaSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSuaSenhaActionPerformed(evt);
            }
        });

        lSuaSenha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lSuaSenha.setText("Sua senha é:");

        javax.swing.GroupLayout painelClienteLayout = new javax.swing.GroupLayout(painelCliente);
        painelCliente.setLayout(painelClienteLayout);
        painelClienteLayout.setHorizontalGroup(
            painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelClienteLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lSuaSenha)
                    .addComponent(lEscolhaSeuAtendimento)
                    .addGroup(painelClienteLayout.createSequentialGroup()
                        .addComponent(btComum)
                        .addGap(54, 54, 54)
                        .addComponent(btRapido)
                        .addGap(51, 51, 51)
                        .addComponent(btPrioritario))
                    .addComponent(campoSuaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        painelClienteLayout.setVerticalGroup(
            painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelClienteLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lEscolhaSeuAtendimento)
                .addGap(39, 39, 39)
                .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btComum)
                    .addComponent(btRapido)
                    .addComponent(btPrioritario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(lSuaSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoSuaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        painelCaixa.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btCaixa1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btCaixa1.setText("Caixa 1");
        btCaixa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCaixa1ActionPerformed(evt);
            }
        });

        btCaixa2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btCaixa2.setText("Caixa 2");
        btCaixa2.setToolTipText("");
        btCaixa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCaixa2ActionPerformed(evt);
            }
        });

        btCaixa3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btCaixa3.setText("Caixa 3");
        btCaixa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCaixa3ActionPerformed(evt);
            }
        });

        btCaixa4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btCaixa4.setText("Caixa 4");
        btCaixa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCaixa4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelCaixaLayout = new javax.swing.GroupLayout(painelCaixa);
        painelCaixa.setLayout(painelCaixaLayout);
        painelCaixaLayout.setHorizontalGroup(
            painelCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCaixaLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(painelCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btCaixa3)
                    .addComponent(btCaixa1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btCaixa2)
                    .addComponent(btCaixa4))
                .addGap(43, 43, 43))
        );
        painelCaixaLayout.setVerticalGroup(
            painelCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCaixaLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(painelCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCaixa1)
                    .addComponent(btCaixa2))
                .addGap(48, 48, 48)
                .addGroup(painelCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCaixa4)
                    .addComponent(btCaixa3))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        lAreaCaixa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lAreaCaixa.setText("Para Caixas:");

        lDisplaySenha.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N

        lDisplayNmCaixa.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(painelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lAreaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lAreaCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(painelCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(413, 413, 413)
                        .addComponent(lDisplaySenha))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(399, 399, 399)
                        .addComponent(lDisplayNmCaixa)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lAreaCaixa))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(lDisplaySenha)
                        .addGap(82, 82, 82)
                        .addComponent(lDisplayNmCaixa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 202, Short.MAX_VALUE)
                        .addComponent(lAreaCliente)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoSuaSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSuaSenhaActionPerformed
              
        
    }//GEN-LAST:event_campoSuaSenhaActionPerformed

    
    //botão senha comum. Gera uma nova senha comum, insere na fila e exibe na tela do cliente
    private void btComumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btComumActionPerformed
        
        numComum ++;
        Senha senhaComum = new Senha("C", numComum);
        filaCaixa.add(senhaComum);
        campoSuaSenha.setText( " C - " + numComum);
        
    }//GEN-LAST:event_btComumActionPerformed
    
    
    //botão senha rapida. Gera uma nova senha rapida, insere na fila e exibe na tela do cliente
    private void btRapidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRapidoActionPerformed
        
        numRapido ++;
        Senha senhaRapida = new Senha("R", numRapido);
        filaCaixa.add(senhaRapida);
        campoSuaSenha.setText( " R - " + numRapido);

    }//GEN-LAST:event_btRapidoActionPerformed

    //botão senha prioritaria. Gera uma nova senha prioritaria, insere na fila e exibe na tela do cliente
    private void btPrioritarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPrioritarioActionPerformed
        numPrioritario ++;
        Senha senhaPrioritaria = new Senha("P", numPrioritario);
        filaCaixa.add(senhaPrioritaria);
        campoSuaSenha.setText( " P - " + numPrioritario);
    }//GEN-LAST:event_btPrioritarioActionPerformed

    //botão caixa 1.
    private void btCaixa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCaixa1ActionPerformed
        
        Iterator<Senha> itr = filaCaixa.iterator();
        boolean temSenhaPrioritaria = false;
        
        for(Senha senhas : filaCaixa){ //percorre o array e verifica se tem pelo menos 1 senha prioritária 
                
            if(senhas.getTipoDeSenha().equals("P")){
                temSenhaPrioritaria = true;
                break;
            }                    
                    
        }
            
        if(temSenhaPrioritaria){//caso o laço anterior confirme que tem pelo menos uma senha prioritaria, percorre o vetor, localiza e atende a proxima prioritaria
            while(itr.hasNext()){
                Senha senhaAtual = itr.next();
            
                if(senhaAtual.verificaPrioritaria()){
                    itr.remove();
                    lDisplaySenha.setText(String.valueOf(senhaAtual.getTipoDeSenha()) + " - " + String.valueOf(senhaAtual.getNumeroDaSenha()));
                    lDisplayNmCaixa.setText("Caixa 1");
                    temSenhaPrioritaria = false;
                    break;  
               }
            }
        }else{   
            while(itr.hasNext()){//caso o laço anterior nao encontre senha prioritária, atende as outras senhas na ordem que estão alocadas no array
                Senha senhaAtual2 = itr.next();
                itr.remove();
                lDisplaySenha.setText(String.valueOf(senhaAtual2.getTipoDeSenha()) + " - " + String.valueOf(senhaAtual2.getNumeroDaSenha()));
                lDisplayNmCaixa.setText("Caixa 1");
                break;          
            }  
        }
    }//GEN-LAST:event_btCaixa1ActionPerformed

    private void btCaixa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCaixa2ActionPerformed
        Iterator<Senha> itr = filaCaixa.iterator();
        boolean temSenhaRapida = false;
        
        for(Senha senhas : filaCaixa){//percorre o array e verifica se tem pelo menos 1 senha rapida 
                
            if(senhas.getTipoDeSenha().equals("R")){
                temSenhaRapida = true;
                break;
            }                    
                    
        }
            
        if(temSenhaRapida){//caso o laço anterior confirme que tem pelo menos uma senha rapida, percorre o vetor, localiza e atende a proxima rapida
            while(itr.hasNext()){
                Senha senhaAtual = itr.next();
            
                if(senhaAtual.verificaRapido()){
                    itr.remove();
                    lDisplaySenha.setText(String.valueOf(senhaAtual.getTipoDeSenha()) + " - " + String.valueOf(senhaAtual.getNumeroDaSenha()));
                    lDisplayNmCaixa.setText("Caixa 2");
                    temSenhaRapida = false;
                    break;  
                }
            }
        }else{//caso o laço anterior nao encontre senha rapida, atende as outras senhas na ordem que estão alocadas no array   
            while(itr.hasNext()){
                Senha senhaAtual2 = itr.next();
                itr.remove();
                lDisplaySenha.setText(String.valueOf(senhaAtual2.getTipoDeSenha()) + " - " + String.valueOf(senhaAtual2.getNumeroDaSenha()));
                lDisplayNmCaixa.setText("Caixa 2");
                break;  
                    
            }  
        }
    }//GEN-LAST:event_btCaixa2ActionPerformed

    private void btCaixa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCaixa3ActionPerformed
        Iterator<Senha> itr = filaCaixa.iterator();
        boolean temSenhaRapida = false;
        
        for(Senha senhas : filaCaixa){//percorre o array e verifica se tem pelo menos 1 senha rapida
                
            if(senhas.getTipoDeSenha().equals("R")){
                temSenhaRapida = true;
                break;
            }                    
        }
            
        if(temSenhaRapida){//caso o laço anterior confirme que tem pelo menos uma senha rapida, percorre o vetor, localiza e atende a proxima rapida
            while(itr.hasNext()){
                Senha senhaAtual = itr.next();
            
                if(senhaAtual.verificaRapido()){
                    itr.remove();
                    lDisplaySenha.setText(String.valueOf(senhaAtual.getTipoDeSenha()) + " - " + String.valueOf(senhaAtual.getNumeroDaSenha()));
                    lDisplayNmCaixa.setText("Caixa 3");
                    temSenhaRapida = false;
                    break;  
                }
            }
        }else{//caso o laço anterior nao encontre senha rapida, atende as outras senhas na ordem que estão alocadas no array   
            while(itr.hasNext()){
                Senha senhaAtual2 = itr.next();
                itr.remove();
                lDisplaySenha.setText(String.valueOf(senhaAtual2.getTipoDeSenha()) + " - " + String.valueOf(senhaAtual2.getNumeroDaSenha()));
                lDisplayNmCaixa.setText("Caixa 3");
                break;              
            }  
        }
    }//GEN-LAST:event_btCaixa3ActionPerformed

    private void btCaixa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCaixa4ActionPerformed
        Iterator<Senha> itr = filaCaixa.iterator();
        boolean temSenhaComum = false;
        
        for(Senha senhas : filaCaixa){//percorre o array e verifica se tem pelo menos 1 senha comum
                
            if(senhas.getTipoDeSenha().equals("C")){
                temSenhaComum = true;
                break;
            }                    
                    
        }
            
        if(temSenhaComum){//caso o laço anterior confirme que tem pelo menos uma senha comum, percorre o vetor, localiza e atende a proxima comum
            while(itr.hasNext()){
                Senha senhaAtual = itr.next();
            
                if(senhaAtual.verificaComum()){
                    itr.remove();
                    lDisplaySenha.setText(String.valueOf(senhaAtual.getTipoDeSenha()) + " - " + String.valueOf(senhaAtual.getNumeroDaSenha()));
                    lDisplayNmCaixa.setText("Caixa 4");
                    temSenhaComum = false;
                    break;  
                }
            }
        }else{//caso o laço anterior nao encontre senha comum, atende as outras senhas na ordem que estão alocadas no array
            while(itr.hasNext()){
                Senha senhaAtual2 = itr.next();
                itr.remove();
                lDisplaySenha.setText(String.valueOf(senhaAtual2.getTipoDeSenha()) + " - " + String.valueOf(senhaAtual2.getNumeroDaSenha()));
                lDisplayNmCaixa.setText("Caixa 4");
                break;               
            }  
        }
    }//GEN-LAST:event_btCaixa4ActionPerformed

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
            java.util.logging.Logger.getLogger(PainelDeCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PainelDeCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PainelDeCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PainelDeCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PainelDeCaixa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCaixa1;
    private javax.swing.JButton btCaixa2;
    private javax.swing.JButton btCaixa3;
    private javax.swing.JButton btCaixa4;
    private javax.swing.JButton btComum;
    private javax.swing.JButton btPrioritario;
    private javax.swing.JButton btRapido;
    private javax.swing.JTextField campoSuaSenha;
    private javax.swing.JLabel lAreaCaixa;
    private javax.swing.JLabel lAreaCliente;
    private javax.swing.JLabel lDisplayNmCaixa;
    private javax.swing.JLabel lDisplaySenha;
    private javax.swing.JLabel lEscolhaSeuAtendimento;
    private javax.swing.JLabel lSuaSenha;
    private javax.swing.JPanel painelCaixa;
    private javax.swing.JPanel painelCliente;
    // End of variables declaration//GEN-END:variables

}
