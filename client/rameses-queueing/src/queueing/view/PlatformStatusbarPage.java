/*
 * PlatformStatusbarPage.java
 *
 * Created on September 11, 2010, 2:13 PM
 */

package queueing.view;

/**
 *
 * @author  wflores
 */
public class PlatformStatusbarPage extends javax.swing.JPanel {
    
    public PlatformStatusbarPage() {
        initComponents(); 
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        xLabel3 = new com.rameses.rcp.control.XLabel();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 3, 2, 3));
        setLayout(new java.awt.BorderLayout());

        xLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(180, 180, 180)));
        xLabel3.setExpression("<div style=\"white-space:nowrap;\"><b>TERMINAL</b>: #{info}</div>");
        xLabel3.setIconResource("images/terminal.png");
        xLabel3.setPreferredSize(new java.awt.Dimension(168, 22));
        xLabel3.setUseHtml(true);
        add(xLabel3, java.awt.BorderLayout.NORTH);
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.control.XLabel xLabel3;
    // End of variables declaration//GEN-END:variables
    
}
