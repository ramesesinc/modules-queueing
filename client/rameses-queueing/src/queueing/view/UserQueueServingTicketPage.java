/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package queueing.view;

/**
 *
 * @author wflores
 */
public class UserQueueServingTicketPage extends javax.swing.JPanel {

    public UserQueueServingTicketPage() {
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

        jPanel1 = new javax.swing.JPanel();
        userQueueServingHeader1 = new queueing.view.UserQueueServingHeader();
        jPanel3 = new javax.swing.JPanel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        xButton1 = new com.rameses.rcp.control.XButton();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 32767));
        xButton2 = new com.rameses.rcp.control.XButton();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 32767));
        xButton3 = new com.rameses.rcp.control.XButton();
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 0), new java.awt.Dimension(5, 32767));
        xButton4 = new com.rameses.rcp.control.XButton();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));

        setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new com.rameses.rcp.control.layout.YLayout());
        jPanel1.add(userQueueServingHeader1);

        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 0, 0, 0));
        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));
        jPanel3.add(filler1);

        xButton1.setMargin(new java.awt.Insets(5, 14, 5, 14));
        xButton1.setName("buzz"); // NOI18N
        xButton1.setText("Buzz");
        jPanel3.add(xButton1);
        jPanel3.add(filler3);

        xButton2.setMargin(new java.awt.Insets(5, 14, 5, 14));
        xButton2.setName("skip"); // NOI18N
        xButton2.setText("Skip");
        jPanel3.add(xButton2);
        jPanel3.add(filler4);

        xButton3.setMargin(new java.awt.Insets(5, 14, 5, 14));
        xButton3.setName("finish"); // NOI18N
        xButton3.setText("Finish");
        jPanel3.add(xButton3);
        jPanel3.add(filler5);

        xButton4.setMargin(new java.awt.Insets(5, 14, 5, 14));
        xButton4.setName("forward"); // NOI18N
        xButton4.setText("Forward...");
        jPanel3.add(xButton4);
        jPanel3.add(filler2);

        jPanel1.add(jPanel3);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private queueing.view.UserQueueServingHeader userQueueServingHeader1;
    private com.rameses.rcp.control.XButton xButton1;
    private com.rameses.rcp.control.XButton xButton2;
    private com.rameses.rcp.control.XButton xButton3;
    private com.rameses.rcp.control.XButton xButton4;
    // End of variables declaration//GEN-END:variables
}
