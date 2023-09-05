/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.sistema_peluqueria;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Casa
 */
public class MenuView extends javax.swing.JFrame {

   
    
    //FondoBoton fondoBotom = new FondoBoton();

    /**
     * Creates new form MenuView
     */
    public MenuView() {
        initComponents();
        setLocationRelativeTo(null);
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new FondoPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_registrarEmpleado = new javax.swing.JButton();
        btn_registrarProducto = new javax.swing.JButton();
        btn_registrarCliente = new javax.swing.JButton();
        btn_registrarCita = new javax.swing.JButton();
        btn_regresarMenu = new javax.swing.JButton();
        btn_registrarUsuario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Castellar", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Menú");

        btn_registrarEmpleado.setFont(new java.awt.Font("Castellar", 1, 10)); // NOI18N
        btn_registrarEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        btn_registrarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/empleado.png"))); // NOI18N
        btn_registrarEmpleado.setText("REGISTRAR EMPLEADOS");
        btn_registrarEmpleado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_registrarEmpleado.setBorderPainted(false);
        btn_registrarEmpleado.setContentAreaFilled(false);
        btn_registrarEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_registrarEmpleadoMouseClicked(evt);
            }
        });

        btn_registrarProducto.setFont(new java.awt.Font("Castellar", 1, 10)); // NOI18N
        btn_registrarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btn_registrarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/producto.png"))); // NOI18N
        btn_registrarProducto.setText("REGISTRAR PRODUCTOS");
        btn_registrarProducto.setBorderPainted(false);
        btn_registrarProducto.setContentAreaFilled(false);
        btn_registrarProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_registrarProductoMouseClicked(evt);
            }
        });

        btn_registrarCliente.setFont(new java.awt.Font("Castellar", 1, 10)); // NOI18N
        btn_registrarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btn_registrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cliente.png"))); // NOI18N
        btn_registrarCliente.setText("REGISTRAR CLIENTES");
        btn_registrarCliente.setBorderPainted(false);
        btn_registrarCliente.setContentAreaFilled(false);
        btn_registrarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_registrarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_registrarClienteMouseClicked(evt);
            }
        });
        btn_registrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarClienteActionPerformed(evt);
            }
        });

        btn_registrarCita.setFont(new java.awt.Font("Castellar", 1, 10)); // NOI18N
        btn_registrarCita.setForeground(new java.awt.Color(255, 255, 255));
        btn_registrarCita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cita.png"))); // NOI18N
        btn_registrarCita.setText("REGISTRAR CITAS");
        btn_registrarCita.setBorderPainted(false);
        btn_registrarCita.setContentAreaFilled(false);
        btn_registrarCita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_registrarCitaMouseClicked(evt);
            }
        });
        btn_registrarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarCitaActionPerformed(evt);
            }
        });

        btn_regresarMenu.setText("Regresar");

        btn_registrarUsuario.setFont(new java.awt.Font("Castellar", 1, 10)); // NOI18N
        btn_registrarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btn_registrarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png"))); // NOI18N
        btn_registrarUsuario.setText("REGISTRAR USUARIO");
        btn_registrarUsuario.setBorderPainted(false);
        btn_registrarUsuario.setContentAreaFilled(false);
        btn_registrarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_registrarUsuarioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_registrarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_registrarEmpleado)
                            .addComponent(btn_registrarUsuario))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 350, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_registrarCliente)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_registrarCita)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(320, 320, 320))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_regresarMenu)
                        .addGap(45, 45, 45))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(btn_registrarEmpleado)
                        .addGap(46, 46, 46)
                        .addComponent(btn_registrarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 89, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_registrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_registrarUsuario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_registrarCita)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_regresarMenu)
                        .addGap(34, 34, 34))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_registrarEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_registrarEmpleadoMouseClicked
        // TODO add your handling code here:
        this.dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmpleadosView().setVisible(true);
            }
        });
    }//GEN-LAST:event_btn_registrarEmpleadoMouseClicked

    private void btn_registrarProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_registrarProductoMouseClicked
        // TODO add your handling code here:
        this.dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductosView().setVisible(true);
            }
        });

    }//GEN-LAST:event_btn_registrarProductoMouseClicked

    private void btn_registrarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_registrarClienteMouseClicked
        // TODO add your handling code here:
        this.dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientesView().setVisible(true);
            }
        });

    }//GEN-LAST:event_btn_registrarClienteMouseClicked

    private void btn_registrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_registrarClienteActionPerformed

    private void btn_registrarCitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_registrarCitaMouseClicked
        // TODO add your handling code here:
        this.dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new CitasView().setVisible(true);
            }
        });
        
    }//GEN-LAST:event_btn_registrarCitaMouseClicked

    private void btn_registrarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarCitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_registrarCitaActionPerformed

    private void btn_registrarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_registrarUsuarioMouseClicked
        // TODO add your handling code here:
        this.dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsuariosView().setVisible(true);
            }
        });
        
    }//GEN-LAST:event_btn_registrarUsuarioMouseClicked

    
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_registrarCita;
    private javax.swing.JButton btn_registrarCliente;
    private javax.swing.JButton btn_registrarEmpleado;
    private javax.swing.JButton btn_registrarProducto;
    private javax.swing.JButton btn_registrarUsuario;
    private javax.swing.JButton btn_regresarMenu;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    class FondoPanel extends JPanel {

        private Image imagen;

        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/Imagenes/fondo.jpg")).getImage();

            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);

            setOpaque(false);
            super.paint(g);

        }
    }

    
}