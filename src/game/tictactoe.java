/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class tictactoe extends javax.swing.JFrame {

    /**
     * Creates new form tictactoe
     */
    
    private String turn = "X";
    private String p1 = "Player One";
    private String p2 = "Player Two";
    
    private int score1=0;
    private int score2=0;
    
    private String pt="";
    
    public tictactoe() {
        initComponents();
        
        setLocationRelativeTo(null);
        get_player_name();
        pturn();
        get_score();
        
    }
    
    private void tiegame()
    {
         String one=b1.getText();
         String two=b2.getText();
         String three=b3.getText();
         String four=b4.getText();
         String five=b5.getText();
         String six=b6.getText();
         String seven=b7.getText();
         String eight=b8.getText();
         String nine=b9.getText();
         
         if(one!=""&&two!=""&&three!=""&&four!=""&&five!=""&&six!=""&&seven!=""&&eight!=""&&nine!="")
         {
             JOptionPane.showMessageDialog(this,"Game Tie","\nTie",JOptionPane.INFORMATION_MESSAGE);
             resetgame();
         }
         
    }

    private void get_score()
    {
        sc.setText("       "+pt+"'s turn       ");
        //sc.setText(p1+"'s Score is "+String.valueOf(score1)+"      "+pt+"'s turn       "+p2+"'s Score is "+String.valueOf(score2));
    }
    
    private void pturn()
    {
        if(turn.equals("X"))
        {
            pt=p1;
        }
        else
        {
            pt=p2;
        }   
        sc.setText("       "+pt+"'s turn       ");
        //sc.setText(p1+"'s Score is "+String.valueOf(score1)+"      "+pt+"'s turn      "+p2+"'s Score is "+String.valueOf(score2));
    }
    private void get_player_name()
    {
        p1=JOptionPane.showInputDialog(this,"Player One Name:","Player Name",JOptionPane.INFORMATION_MESSAGE);
        p2=JOptionPane.showInputDialog(this,"Player Two Name:","Player Name",JOptionPane.INFORMATION_MESSAGE);
        
        if(p1.equals(""))
        {
            p1="Player One";
        }
        if(p2.equals(""))
        {
            p2="Player Two";
        }
    }
    
     private void determine_turn()
        {
            if(turn.equalsIgnoreCase("X"))
            {
                turn="0";
            }
            else
            {
                turn="X";
            }
        }
     
     private void Xwins()
     {
         JOptionPane.showMessageDialog(this,p1+" wins!!","\nWinner",JOptionPane.INFORMATION_MESSAGE);
         score1++;
         resetgame();
     }
     
     private void Owins()
     {
         JOptionPane.showMessageDialog(this,p2+" wins!!","\nWinner",JOptionPane.INFORMATION_MESSAGE);
         score2++;
         resetgame();
     }
     
     private void resetgame()
     {
         b1.setText("");
         b2.setText("");
         b3.setText("");
         b4.setText("");
         b5.setText("");
         b6.setText("");
         b7.setText("");
         b8.setText("");
         b9.setText("");
         
         get_score();
     }
     
     private void determine_winner()
     {
         String one=b1.getText();
         String two=b2.getText();
         String three=b3.getText();
         String four=b4.getText();
         String five=b5.getText();
         String six=b6.getText();
         String seven=b7.getText();
         String eight=b8.getText();
         String nine=b9.getText();
         
         if(one=="X"&&two=="X"&&three=="X")
         {
             Xwins();
         }
         if(four=="X"&&five=="X"&&six=="X")
         {
             Xwins();
         }
         if(seven=="X"&&eight=="X"&&nine=="X")
         {
             Xwins();
         }
         if(one=="X"&&four=="X"&&seven=="X")
         {
             Xwins();
         }
         if(two=="X"&&five=="X"&&eight=="X")
         {
             Xwins();
         }
         if(three=="X"&&six=="X"&&nine=="X")
         {
             Xwins();
         }
         if(one=="X"&&five=="X"&&nine=="X")
         {
             Xwins();
         }
         if(three=="X"&&five=="X"&&seven=="X")
         {
             Xwins();
         }
         //////////////////////////////////////////////////
         if(one=="0"&&two=="0"&&three=="0")
         {
             Owins();
         }
         if(four=="0"&&five=="0"&&six=="0")
         {
             Owins();
         }
         if(seven=="0"&&eight=="0"&&nine=="0")
         {
             Owins();
         }
         if(one=="0"&&four=="0"&&seven=="0")
         {
             Owins();
         }
         if(two=="0"&&five=="0"&&eight=="0")
         {
             Owins();
         }
         if(three=="0"&&six=="0"&&nine=="0")
         {
             Owins();
         }
         if(one=="0"&&five=="0"&&nine=="0")
         {
             Owins();
         }
         if(three=="0"&&five=="0"&&seven=="0")
         {
             Owins();
         }
     }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b9 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        sc = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b9.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        getContentPane().add(b9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 150, 100));

        b1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 100));

        b2.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 150, 100));

        b3.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 150, 100));

        b4.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        getContentPane().add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 150, 100));

        b5.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        getContentPane().add(b5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 150, 100));

        b6.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        getContentPane().add(b6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 150, 100));

        b7.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        getContentPane().add(b7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 150, 100));

        b8.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        getContentPane().add(b8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 150, 100));

        sc.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        sc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(sc, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 304, 440, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
        b1.setText(turn);
        if(turn.equalsIgnoreCase("X"))
            {
                b1.setForeground(Color.red);
            }
            else
            {
                b1.setForeground(Color.black);
            }
        determine_turn();
        determine_winner();
        tiegame();
        pturn();
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:
         b2.setText(turn);
         if(turn.equalsIgnoreCase("X"))
            {
                b2.setForeground(Color.red);
            }
            else
            {
                b2.setForeground(Color.black);
            }
        determine_turn();
        determine_winner();
        tiegame();
        pturn();
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:
         b3.setText(turn);
         if(turn.equalsIgnoreCase("X"))
            {
                b3.setForeground(Color.red);
            }
            else
            {
                b3.setForeground(Color.black);
            }
        determine_turn();
        determine_winner();
        tiegame();
        pturn();
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        // TODO add your handling code here:
         b4.setText(turn);
         if(turn.equalsIgnoreCase("X"))
            {
                b4.setForeground(Color.red);
            }
            else
            {
                b4.setForeground(Color.black);
            }
        determine_turn();
        determine_winner();
        tiegame();
        pturn();
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        // TODO add your handling code here:
         b5.setText(turn);
         if(turn.equalsIgnoreCase("X"))
            {
                b5.setForeground(Color.red);
            }
            else
            {
                b5.setForeground(Color.black);
            }
        determine_turn();
        determine_winner();
        tiegame();
        pturn();
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        // TODO add your handling code here:
         b6.setText(turn);
         if(turn.equalsIgnoreCase("X"))
            {
                b6.setForeground(Color.red);
            }
            else
            {
                b6.setForeground(Color.black);
            }
        determine_turn();
        determine_winner();
        tiegame();
        pturn();
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        // TODO add your handling code here:
         b7.setText(turn);
         if(turn.equalsIgnoreCase("X"))
            {
                b7.setForeground(Color.red);
            }
            else
            {
                b7.setForeground(Color.black);
            }
        determine_turn();
        determine_winner();
        tiegame();
        pturn();
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        // TODO add your handling code here:
         b8.setText(turn);
         if(turn.equalsIgnoreCase("X"))
            {
                b8.setForeground(Color.red);
            }
            else
            {
                b8.setForeground(Color.black);
            }
        determine_turn();
        determine_winner();
        tiegame();
        pturn();
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        // TODO add your handling code here:
         b9.setText(turn);
         if(turn.equalsIgnoreCase("X"))
            {
                b9.setForeground(Color.red);
            }
            else
            {
                b9.setForeground(Color.black);
            }
        determine_turn();
        determine_winner();
        tiegame();
        pturn();
    }//GEN-LAST:event_b9ActionPerformed

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
            java.util.logging.Logger.getLogger(tictactoe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tictactoe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tictactoe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tictactoe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tictactoe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JLabel sc;
    // End of variables declaration//GEN-END:variables
}
