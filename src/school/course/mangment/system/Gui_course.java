/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school.course.mangment.system;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author noeman213124
 */
public class Gui_course extends javax.swing.JFrame {

     ArrayList <Program> ps ; 
     Student x; 
     int ig = 0;
     int nat = 1;
     int sat = 2;
    /**
     * Creates new form 
     */
    public Gui_course() {
        initComponents();
        counter.setText(" ");
    }
    public void catchOb(Student a){
        this.x =a ; 
    }
public void catchProg(ArrayList <Program> al){
    this.ps = al ; 
  
   counter.setText(Integer.toString(this.ps.get(0).getNumberOfStudents()));

}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        arabic = new javax.swing.JCheckBox();
        english = new javax.swing.JCheckBox();
        maths = new javax.swing.JCheckBox();
        computer = new javax.swing.JCheckBox();
        history = new javax.swing.JCheckBox();
        science = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        programCB = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        counter = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/school/course/mangment/system/books.png"))); // NOI18N
        jLabel1.setText("Manage courses");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        arabic.setText("Arabic");

        english.setText("English");

        maths.setText("Maths");

        computer.setText("Computer");

        history.setText("History");

        science.setText("Science");

        jButton1.setText("Update courses");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel2.setText("Program: ");

        programCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IGCSE", "NATIONAL", "AMERICAN" }));
        programCB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                programCBItemStateChanged(evt);
            }
        });
        programCB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                programCBMouseClicked(evt);
            }
        });
        programCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                programCBActionPerformed(evt);
            }
        });

        jLabel3.setText("Students count:");

        counter.setText("jLabel4");
        counter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                counterMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(arabic)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(english)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(maths)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(computer)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(history)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(science))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel2)
                        .addGap(29, 29, 29)
                        .addComponent(programCB, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(counter, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jLabel1)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(programCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(counter))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(arabic)
                    .addComponent(english)
                    .addComponent(maths)
                    .addComponent(computer)
                    .addComponent(history)
                    .addComponent(science))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void programCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_programCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_programCBActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int program = programCB.getSelectedIndex();        // TODO add your handling code here:
        
            this.x.changeProgram(ps.get(program));
          JOptionPane.showMessageDialog(null, "Current Program : "+this.x.getP().getName());
            
        
        
      

    counter.setText(Integer.toString(this.ps.get(program).getNumberOfStudents()));
    
    if(arabic.isSelected()){
        if(this.x.getModules().contains("Arabic")){
                      JOptionPane.showMessageDialog(null, "you already have arabic");
        }else{
            this.x.getModules().add("Arabic"); 
            JOptionPane.showMessageDialog(null, "Added Arabic");

            
        }
    }
        if(english.isSelected()){
        if(this.x.getModules().contains("English")){
                      JOptionPane.showMessageDialog(null, "you already have English");
        }else{
            this.x.getModules().add("English"); 
            JOptionPane.showMessageDialog(null, "Added English");

            
        }
    } 
    if(maths.isSelected()){
        if(this.x.getModules().contains("Maths")){
                      JOptionPane.showMessageDialog(null, "you already have Maths");
        }else{
            this.x.getModules().add("Maths"); 
            JOptionPane.showMessageDialog(null, "Added Maths");

            
        }
    }
            if(computer.isSelected()){
        if(this.x.getModules().contains("Computer")){
                      JOptionPane.showMessageDialog(null, "you already have Computer");
        }else{
            this.x.getModules().add("Computer"); 
            JOptionPane.showMessageDialog(null, "Added Computer");

            
        }
    }
      if(history.isSelected()){
        if(this.x.getModules().contains("History")){
                      JOptionPane.showMessageDialog(null, "you already have History");
        }else{
            this.x.getModules().add("History"); 
            JOptionPane.showMessageDialog(null, "Added History");

            
        }
    }
       if(science.isSelected()){
        if(this.x.getModules().contains("Science")){
                      JOptionPane.showMessageDialog(null, "you already have Science");
        }else{
            this.x.getModules().add("Science"); 
            JOptionPane.showMessageDialog(null, "Added Science");

            
        }
    }
       
       science.setSelected(false); 
       arabic.setSelected(false); 
       english.setSelected(false); 
       maths.setSelected(false); 
       computer.setSelected(false); 
       history.setSelected(false); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void programCBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_programCBMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_programCBMouseClicked

    private void counterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_counterMouseClicked



    }//GEN-LAST:event_counterMouseClicked

    private void programCBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_programCBItemStateChanged
int in = programCB.getSelectedIndex();
      

    counter.setText(Integer.toString(this.ps.get(in).getNumberOfStudents()));    }//GEN-LAST:event_programCBItemStateChanged

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
            java.util.logging.Logger.getLogger(Gui_course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui_course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui_course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui_course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui_course().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox arabic;
    private javax.swing.JCheckBox computer;
    private javax.swing.JLabel counter;
    private javax.swing.JCheckBox english;
    private javax.swing.JCheckBox history;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JCheckBox maths;
    private javax.swing.JComboBox<String> programCB;
    private javax.swing.JCheckBox science;
    // End of variables declaration//GEN-END:variables
}
