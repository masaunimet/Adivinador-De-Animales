
package Interfaz;

import Clases.Archivo;
import Clases.Memoria;
import static Clases.Proyecto_II.arbol;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.UIManager;



public class Interfaz extends javax.swing.JFrame {

    public Memoria memoria;
    public Archivo archivo = new Archivo();
    
    public Interfaz() {
        
        arbol = archivo.Inicializar();
        UIManager.put("TabbedPane.selected",new Color(46, 45, 131));
        initComponents();
        this.setLocationRelativeTo(null);
        memoria = new Memoria(arbol); 
     
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        IniciarSesion = new javax.swing.JButton();
        Guardar = new javax.swing.JButton();
        NuevaBaseConocimientos = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jInternalFrame1 = new javax.swing.JInternalFrame();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Proyecto II");
        setIconImage(getIconImage());
        setUndecorated(true);
        setResizable(false);

        jTabbedPane1.setBackground(new java.awt.Color(235, 106, 32));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane1.setFont(new java.awt.Font("Open Sans Semibold", 1, 12)); // NOI18N
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Integrantes: Tony Cunsolo / Yoselyn Morle");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 520, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Open Sans", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText(" ADIVINADOR DE ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Open Sans", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("ANIMALES");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, -1, -1));

        jPanel3.setBackground(new java.awt.Color(46, 45, 131));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IniciarSesion.setBackground(new java.awt.Color(255, 255, 255));
        IniciarSesion.setForeground(new java.awt.Color(102, 102, 102));
        IniciarSesion.setText("Iniciar Sesion");
        IniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                IniciarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                IniciarSesionMouseExited(evt);
            }
        });
        IniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarSesionActionPerformed(evt);
            }
        });
        jPanel3.add(IniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 220, -1));

        Guardar.setBackground(new java.awt.Color(255, 255, 255));
        Guardar.setForeground(new java.awt.Color(102, 102, 102));
        Guardar.setText("Guardar Base de Conocimientos");
        Guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                GuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                GuardarMouseExited(evt);
            }
        });
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });
        jPanel3.add(Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 220, -1));

        NuevaBaseConocimientos.setBackground(new java.awt.Color(255, 255, 255));
        NuevaBaseConocimientos.setForeground(new java.awt.Color(102, 102, 102));
        NuevaBaseConocimientos.setText("Inicializar Base de Conocimientos");
        NuevaBaseConocimientos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NuevaBaseConocimientosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NuevaBaseConocimientosMouseExited(evt);
            }
        });
        NuevaBaseConocimientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevaBaseConocimientosActionPerformed(evt);
            }
        });
        jPanel3.add(NuevaBaseConocimientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 220, -1));

        Salir.setBackground(new java.awt.Color(255, 255, 255));
        Salir.setForeground(new java.awt.Color(102, 102, 102));
        Salir.setText("Salir");
        Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SalirMouseExited(evt);
            }
        });
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jPanel3.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 110, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 540));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Artboard 1.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, -1, -1));

        jTabbedPane1.addTab("Proyecto II", jPanel1);

        jPanel2.setBackground(new java.awt.Color(46, 45, 131));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Base de Conocimientos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Open Sans Semibold", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane1.setBackground(new java.awt.Color(46, 45, 131));

        jInternalFrame1.setBackground(new java.awt.Color(153, 153, 153));
        jInternalFrame1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jInternalFrame1.setIconifiable(true);
        jInternalFrame1.setMaximizable(true);
        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 316, Short.MAX_VALUE)
        );

        jDesktopPane1.add(jInternalFrame1);
        jInternalFrame1.setBounds(30, 30, 520, 340);

        jPanel2.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 580, 400));

        jTabbedPane1.addTab("Base de datos", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 765, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked

        complementos();
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void NuevaBaseConocimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevaBaseConocimientosActionPerformed

        int dialogButton = JOptionPane.showConfirmDialog(null, "\nSe borraran los datos existentes en la Base de Conocimientos\n           del programa. Esta seguro que desea continuar?\n ", "WARNING!", JOptionPane.YES_NO_OPTION, 2);

        if (dialogButton == JOptionPane.YES_OPTION) {

            memoria.BorrarMemoria();

            JOptionPane.showMessageDialog(null, "Se ha Inicializado una nueva Base de Conocimientos", " ...", 1);

            System.out.println("Se han cambiado los datos en el sistema");

        }
        else if(dialogButton == JOptionPane.CLOSED_OPTION){
        
            this.dispose();
        }
        else{

            JOptionPane.showMessageDialog(null, "No se han cambiado los datos en el sistema", "...", 0);
        }
    }//GEN-LAST:event_NuevaBaseConocimientosActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed

        int dialogButton = JOptionPane.showConfirmDialog(null, "\nSe guardaran los cambios en la Base de Conocimientos\n      del programa. Esta seguro que desea continuar?\n ", "WARNING!", JOptionPane.YES_NO_OPTION,2);

        if (dialogButton == JOptionPane.YES_OPTION) {

            archivo.GuardarArbol(arbol);

            JOptionPane.showMessageDialog(null, "Se han cambiado los datos en el sistema", " ...", 1);
        }
        else{

            JOptionPane.showMessageDialog(null, "No se han cambiado los datos en el sistema", "...", 0);
        }
    }//GEN-LAST:event_GuardarActionPerformed

    private void IniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarSesionActionPerformed

        memoria.Iniciar();
    }//GEN-LAST:event_IniciarSesionActionPerformed

    private void IniciarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IniciarSesionMouseEntered
        IniciarSesion.setBackground(new Color(235,106,32));
        IniciarSesion.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_IniciarSesionMouseEntered

    private void IniciarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IniciarSesionMouseExited
        IniciarSesion.setBackground(new Color(255,255,255));
        IniciarSesion.setForeground(new Color(102,102,102));
    }//GEN-LAST:event_IniciarSesionMouseExited

    private void GuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GuardarMouseEntered
        Guardar.setBackground(new Color(235,106,32));
        Guardar.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_GuardarMouseEntered

    private void GuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GuardarMouseExited
        Guardar.setBackground(new Color(255,255,255));
        Guardar.setForeground(new Color(102,102,102));
    }//GEN-LAST:event_GuardarMouseExited

    private void NuevaBaseConocimientosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NuevaBaseConocimientosMouseEntered
        NuevaBaseConocimientos.setBackground(new Color(235,106,32));
        NuevaBaseConocimientos.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_NuevaBaseConocimientosMouseEntered

    private void NuevaBaseConocimientosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NuevaBaseConocimientosMouseExited
        NuevaBaseConocimientos.setBackground(new Color(255,255,255));
        NuevaBaseConocimientos.setForeground(new Color(102,102,102));
    }//GEN-LAST:event_NuevaBaseConocimientosMouseExited

    private void SalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseEntered
        Salir.setBackground(new Color(235,106,32));
        Salir.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_SalirMouseEntered

    private void SalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseExited
        Salir.setBackground(new Color(255,255,255));
        Salir.setForeground(new Color(102,102,102));
    }//GEN-LAST:event_SalirMouseExited

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_SalirActionPerformed

    public void complementos(){
        this.repintarArbol();
    }
    
    private void repintarArbol() {
        
        JScrollPane jscrollpane = new JScrollPane();
        JPanel jpanel = new JPanel();
        
        this.jDesktopPane1.removeAll();
        Rectangle tamaño = this.jInternalFrame1.getBounds();
        this.jInternalFrame1 = null;
        this.jInternalFrame1 = new JInternalFrame("Representación gráfica", true);
        this.jDesktopPane1.add(this.jInternalFrame1, JLayeredPane.DEFAULT_LAYER);
        this.jInternalFrame1.setVisible(true);
        this.jInternalFrame1.setBounds(tamaño);
        this.jInternalFrame1.setEnabled(false);
	this.jInternalFrame1.setResizable(false);
       
        
        jpanel = this.memoria.getDibujo();
        
        jpanel.setPreferredSize(new Dimension(2000,1000));
        
        jscrollpane.setBounds(tamaño);
        
        jscrollpane.add(jpanel);
        
        jscrollpane.setViewportView(jpanel);
        
        this.jInternalFrame1.add(jscrollpane, BorderLayout.CENTER);
        
        jscrollpane.getViewport().setViewPosition(new Point(760,0));
    }
    
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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }
    
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
        getImage(ClassLoader.getSystemResource("Imagenes/icono.png"));
        return retValue;
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Guardar;
    private javax.swing.JButton IniciarSesion;
    private javax.swing.JButton NuevaBaseConocimientos;
    private javax.swing.JButton Salir;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
