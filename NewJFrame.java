
import javax.swing.DefaultListModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.DefaultListModel;
/**
 *
 * @author kevmm
 */
public class NewJFrame extends javax.swing.JFrame {
DefaultListModel mod = new DefaultListModel();
    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        list_numbers = new javax.swing.JList<>();
        button_add1 = new javax.swing.JButton();
        button_clear1 = new javax.swing.JButton();
        tf_num1 = new javax.swing.JTextField();
        button_deletenum = new javax.swing.JButton();
        button_addnum2 = new javax.swing.JButton();
        lb_sum = new javax.swing.JLabel();
        button_whileadd = new javax.swing.JButton();
        lb_whileadd = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(list_numbers);

        button_add1.setText("Add >");
        button_add1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_add1MouseClicked(evt);
            }
        });

        button_clear1.setText("Clear >");
        button_clear1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_clear1MouseClicked(evt);
            }
        });

        button_deletenum.setText("< Delete ");
        button_deletenum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_deletenumMouseClicked(evt);
            }
        });

        button_addnum2.setText("Average:");
        button_addnum2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_addnum2MouseClicked(evt);
            }
        });

        lb_sum.setText("jLabel1");

        button_whileadd.setText("While Add:");
        button_whileadd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_whileaddMouseClicked(evt);
            }
        });

        lb_whileadd.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(tf_num1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(button_add1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(button_clear1)))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(button_addnum2)
                            .addComponent(button_deletenum)
                            .addComponent(button_whileadd))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_whileadd)
                            .addComponent(lb_sum, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tf_num1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button_add1))
                        .addGap(42, 42, 42)
                        .addComponent(button_clear1)
                        .addGap(26, 26, 26)
                        .addComponent(button_deletenum))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(button_addnum2)
                    .addComponent(lb_sum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_whileadd)
                    .addComponent(lb_whileadd))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_add1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_add1MouseClicked
        // TODO add your handling code here:
        list_numbers.setModel(mod);
        mod.addElement(tf_num1.getText());
        tf_num1.setText("");
        tf_num1.requestFocus();
    }//GEN-LAST:event_button_add1MouseClicked

    private void button_clear1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_clear1MouseClicked
        // TODO add your handling code here:
       
        list_numbers.setModel(mod);
        mod.clear();
    }//GEN-LAST:event_button_clear1MouseClicked

    private void button_deletenumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_deletenumMouseClicked
        // TODO add your handling code here:
        int index;
        index = list_numbers.getSelectedIndex();
        if (index > -1)
        {
            list_numbers.setModel(mod);
            mod.remove(index);
        }
        
        
        
    }//GEN-LAST:event_button_deletenumMouseClicked

    private void button_addnum2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_addnum2MouseClicked
        // TODO add your handling code here:
        int sum = 0, count = 0, result = 0, average = 0;
        
        for (int x=0;x<mod.size();x++)
        {
            sum = sum + Integer.parseInt(mod.get(x).toString());
            result += sum;
            count++;
        }
        average = sum/count;
        lb_sum.setText(String.valueOf(average));
    }//GEN-LAST:event_button_addnum2MouseClicked

    private void button_whileaddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_whileaddMouseClicked
        // TODO add your handling code here:
        int sum = 0, x = 0, count = 0, result = 0, average = 0;
        
        x = 0;
        while (x < mod.size())
        {
            sum = sum + Integer.parseInt(mod.get(x).toString());
            x++;
            result += sum;
            
        }
        average = sum/x;
        lb_whileadd.setText(String.valueOf(average));
    }//GEN-LAST:event_button_whileaddMouseClicked

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_add1;
    private javax.swing.JButton button_addnum2;
    private javax.swing.JButton button_clear1;
    private javax.swing.JButton button_deletenum;
    private javax.swing.JButton button_whileadd;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_sum;
    private javax.swing.JLabel lb_whileadd;
    private javax.swing.JList<String> list_numbers;
    private javax.swing.JTextField tf_num1;
    // End of variables declaration//GEN-END:variables
}
