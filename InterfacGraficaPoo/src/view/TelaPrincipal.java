package view;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Mayk
 * 
 */
public class TelaPrincipal extends javax.swing.JFrame  {
    //PASSAR A PONTUAÇÃO 
    private int pontos = 5;
    
    /**
     * TelaPrincipal
     */
    
    
    public TelaPrincipal() {
        initComponents();
        
        // --------------- INCICIO E MENU DA INTERFACE
        userNick = JOptionPane.showInputDialog(null,"Digite seu nick jovem aventureiro !",JOptionPane.PLAIN_MESSAGE);
       
    
        JOptionPane.showMessageDialog(null, "Senhor dos pontos fala: Tome filho, 5 pontos para se divertir !");
        JOptionPane.showMessageDialog(null, "5 Foram-lhe concedidos ! Aproveite");
              
        this.jLabelOBS.setText("<html>"+jLabelOBS.getText()+"<br><b>"+"OBS: Seus pontos serão atualizados após clicar novamente no botão "+"</html>");

        this.jTextFieldTerceiro.setText("Alex - 2");
        this.jTextFieldSegundo.setText("Junior - 4");
        this.jTextFieldPrimeiro.setText("Jax - 5");
        // --------------- INCICIO E MENU DA INTERFACE
        
        
    }
    //IMplementar Classes que faltam aqui
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        parabensLabel = new javax.swing.JLabel();
        label01 = new javax.swing.JLabel();
        label03 = new javax.swing.JLabel();
        label02 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldPrimeiro = new javax.swing.JTextField();
        jTextFieldTerceiro = new javax.swing.JTextField();
        jTextFieldSegundo = new javax.swing.JTextField();
        jLabelOBS = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldPoints = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("SAIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 474, 158, 43));

        jButton2.setText("JOGAR");
        jButton2.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 474, 158, 43));

        parabensLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        parabensLabel.setForeground(new java.awt.Color(255, 255, 255));
        parabensLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        parabensLabel.setToolTipText("");
        parabensLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        parabensLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(parabensLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 210, 70));

        label01.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        label01.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estrela (2).png"))); // NOI18N
        label01.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        label01.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label01.setInheritsPopupMenu(false);
        getContentPane().add(label01, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 129, 90, 90));

        label03.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        label03.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estrela (2).png"))); // NOI18N
        label03.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        label03.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label03.setInheritsPopupMenu(false);
        getContentPane().add(label03, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 129, 90, 90));

        label02.setBackground(new java.awt.Color(255, 255, 255));
        label02.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        label02.setForeground(new java.awt.Color(255, 255, 255));
        label02.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estrela (2).png"))); // NOI18N
        label02.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        label02.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label02.setInheritsPopupMenu(false);
        getContentPane().add(label02, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 129, 90, 90));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CASSININHO DOS CRIAS");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 430, 81));

        jTextFieldPrimeiro.setEditable(false);
        jTextFieldPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPrimeiroActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldPrimeiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 120, -1));

        jTextFieldTerceiro.setEditable(false);
        getContentPane().add(jTextFieldTerceiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, 120, -1));

        jTextFieldSegundo.setEditable(false);
        getContentPane().add(jTextFieldSegundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 120, -1));

        jLabelOBS.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        getContentPane().add(jLabelOBS, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 170, 120));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel6.setText("Melhor Pontuação do momento:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 160, 30));

        jTextFieldPoints.setEditable(false);
        jTextFieldPoints.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextFieldPoints.setText("Pontos: 5");
        jTextFieldPoints.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPointsActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldPoints, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 402, 160, 40));

        jLabel7.setFont(new java.awt.Font("Gilroy", 0, 18)); // NOI18N
        jLabel7.setText("Seus Pontos:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 140, 30));

        setSize(new java.awt.Dimension(486, 561));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        
        // Codigo da interfaçe
        JOptionPane.showMessageDialog(null, "Você Gastou 1 Ficha !");
        // --------------- PROBABILIDADE DOS NUMEROS
        Random gerador = new Random();
	int a1 = gerador.nextInt(3);
	int a2 = gerador.nextInt(3);
        int a3 = gerador.nextInt(3);
        // --------------- PROBABILIDADE DOS NUMEROS          
        label01.setText(""+a1);
        label02.setText(""+a2);
        label03.setText(""+a3);
        
        
        // --------------- VERIFICAS SE O USER GANHOU O JOGO {NUMEROS IGUAIS}
        if(a1 != a2 || a2 != a3 || a1 != a3) {
            pontos -= 1;
            JOptionPane.showMessageDialog(null, "Você jogou é perdeu 1 ponto !!!");
            JOptionPane.showConfirmDialog(this, "Jogar Novamente ?", "Continuar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        }else if(a1 == a2 && a2 == a3 && a1 == a3) {
            pontos += 1;
            parabensLabel.setText("PARABUAINS !!!!");
            JOptionPane.showMessageDialog(null, "Você ganhou 1 ponto !!!");         
            if(pontos >= 6){
                this.jTextFieldPrimeiro.setText(userNick +"- "+ pontos);
                
                    //HERANÇA NO NICK DO JOGADOR
                    Jogador n1 = new Jogador();
                    n1.nome = userNick;
                    
                    //CLASSE ABSTRATA
                    //Pontos atual_points = new Pontos() {};
                    //pontos = atual_points.setPontos(5);
                    
                    //HERANÇA NO NICK DO JOGADOR
            }

        }
        // --------------- VERIFICAS SE O USER GANHOU O JOGO {NUMEROS IGUAIS}
        
        // --------------- SE VOCÊ ZERAR TUDO VOCÊ PERDEU SEU LOSER !!!!
        if(pontos == 0){
            pontos -= 1;
            JOptionPane.showMessageDialog(null, "Parece que você está sem pontos ! YOU LOSER ");
            jButton2.setEnabled( false );
        }
        
        // --------------- SET PONTOS AO FINAL DA RODADA
        jTextFieldPoints.setText("Pontos: "+pontos);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPrimeiroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPrimeiroActionPerformed

    private void jTextFieldPointsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPointsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPointsActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
        
        

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelOBS;
    private javax.swing.JTextField jTextFieldPoints;
    private javax.swing.JTextField jTextFieldPrimeiro;
    private javax.swing.JTextField jTextFieldSegundo;
    private javax.swing.JTextField jTextFieldTerceiro;
    private javax.swing.JLabel label01;
    private javax.swing.JLabel label02;
    private javax.swing.JLabel label03;
    private javax.swing.JLabel parabensLabel;
    // End of variables declaration//GEN-END:variables
    private String userNick;
}

