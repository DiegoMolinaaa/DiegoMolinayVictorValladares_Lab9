/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diegomolinayvictorvalladares_lab9;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class login extends javax.swing.JFrame {
    Random r = new Random();
    /**
     * Creates new form login
     */
    public login() {
        initComponents();
        this.pack();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registro_maestro = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        bt_registrarse_maestro = new javax.swing.JButton();
        tf_nombre_maestro = new javax.swing.JTextField();
        tf_user_maestro = new javax.swing.JTextField();
        tf_password_maestro = new javax.swing.JTextField();
        tf_rrhh = new javax.swing.JTextField();
        pf_password_maestro = new javax.swing.JPasswordField();
        registro_alumno = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tf_nombre_alumno = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        tf_user_alumno = new javax.swing.JTextField();
        tf_password_alumno = new javax.swing.JTextField();
        pf_password_alumno = new javax.swing.JPasswordField();
        jLabel18 = new javax.swing.JLabel();
        tf_carrera_alumno = new javax.swing.JTextField();
        plataforma_alumno = new javax.swing.JFrame();
        jPanel4 = new javax.swing.JPanel();
        label_nombre_alumno = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        plataforma_maestro = new javax.swing.JFrame();
        jPanel5 = new javax.swing.JPanel();
        label_nombre_maestro = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        plataforma_admin = new javax.swing.JFrame();
        jPanel6 = new javax.swing.JPanel();
        bt_crudExamen = new javax.swing.JButton();
        bt_crudClase = new javax.swing.JButton();
        bt_verClases = new javax.swing.JButton();
        bt_Calificaciones = new javax.swing.JButton();
        bt_crudPregunta = new javax.swing.JButton();
        label_nombre_admin = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        modificar_alumno = new javax.swing.JFrame();
        modificar_maestro = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Contraseña = new javax.swing.JLabel();
        tf_username = new javax.swing.JTextField();
        tf_password = new javax.swing.JTextField();
        bt_registro_m = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        registro_maestro.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Registrarse como maestro");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Confirmar Contraseña");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("RRHH");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, -1));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Nombre de usuario");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Contraseña");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Nombre");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        bt_registrarse_maestro.setText("Registrarse");
        bt_registrarse_maestro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_registrarse_maestroMouseClicked(evt);
            }
        });
        jPanel2.add(bt_registrarse_maestro, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, -1, -1));
        jPanel2.add(tf_nombre_maestro, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 190, -1));
        jPanel2.add(tf_user_maestro, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 190, -1));
        jPanel2.add(tf_password_maestro, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 190, -1));
        jPanel2.add(tf_rrhh, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 190, -1));
        jPanel2.add(pf_password_maestro, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 190, -1));

        registro_maestro.getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        registro_alumno.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Registrarse como alumno");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Confirmar Contraseña");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Nombre de usuario");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Contraseña");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Nombre");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));
        jPanel3.add(tf_nombre_alumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 180, -1));

        jButton1.setText("Registrarse");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 100, 40));
        jPanel3.add(tf_user_alumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 180, -1));
        jPanel3.add(tf_password_alumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 180, -1));
        jPanel3.add(pf_password_alumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 180, -1));

        jLabel18.setBackground(new java.awt.Color(0, 0, 0));
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Carerra");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, -1));
        jPanel3.add(tf_carrera_alumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 180, -1));

        registro_alumno.getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 380));

        plataforma_alumno.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_nombre_alumno.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 24)); // NOI18N
        label_nombre_alumno.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(label_nombre_alumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 200, 30));

        jLabel15.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("0:00 minutos");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        jButton4.setText("Realizar examen");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jPanel4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("5");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 20, 20));

        jLabel19.setBackground(new java.awt.Color(0, 0, 0));
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("1");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 20, 20));

        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("2");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 20, 20));

        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("3");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 20, 20));

        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("4");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 20, 20));
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 310, 20));
        jPanel4.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 290, 20));
        jPanel4.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 290, 20));
        jPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 280, 20));
        jPanel4.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 330, 20));

        jLabel28.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 24)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setText("Bienvenido: ");
        jPanel4.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jButton5.setText("Finalizar examen");
        jPanel4.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setText("Clase de la que se va a realizar el examen");
        jPanel4.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jPanel4.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 160, -1));

        jButton6.setText("Editar Cuenta");
        jPanel4.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, -1, -1));

        plataforma_alumno.getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 410));

        plataforma_maestro.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_nombre_maestro.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 24)); // NOI18N
        label_nombre_maestro.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(label_nombre_maestro, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 200, 30));

        jLabel16.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Bienvenido: ");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        plataforma_maestro.getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 490));

        plataforma_admin.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt_crudExamen.setText("Crear Examen");
        jPanel6.add(bt_crudExamen, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 270, 40));

        bt_crudClase.setText("Crear Clase");
        jPanel6.add(bt_crudClase, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 270, 50));

        bt_verClases.setText("Ver Clases");
        jPanel6.add(bt_verClases, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 270, 50));

        bt_Calificaciones.setText("Ir a Centro de Calificaciones");
        jPanel6.add(bt_Calificaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, 270, 50));

        bt_crudPregunta.setText("Crear Pregunta");
        jPanel6.add(bt_crudPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 270, 50));

        label_nombre_admin.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 24)); // NOI18N
        label_nombre_admin.setForeground(new java.awt.Color(0, 0, 0));
        jPanel6.add(label_nombre_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 200, 30));

        jLabel17.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Bienvenido: ");
        jPanel6.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        plataforma_admin.getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 560));

        javax.swing.GroupLayout modificar_alumnoLayout = new javax.swing.GroupLayout(modificar_alumno.getContentPane());
        modificar_alumno.getContentPane().setLayout(modificar_alumnoLayout);
        modificar_alumnoLayout.setHorizontalGroup(
            modificar_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        modificar_alumnoLayout.setVerticalGroup(
            modificar_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout modificar_maestroLayout = new javax.swing.GroupLayout(modificar_maestro.getContentPane());
        modificar_maestro.getContentPane().setLayout(modificar_maestroLayout);
        modificar_maestroLayout.setHorizontalGroup(
            modificar_maestroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        modificar_maestroLayout.setVerticalGroup(
            modificar_maestroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("NeoBlackboard");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, -1));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Usuario");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        Contraseña.setForeground(new java.awt.Color(0, 0, 0));
        Contraseña.setText("Contraseña");
        jPanel1.add(Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));
        jPanel1.add(tf_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 246, -1));
        jPanel1.add(tf_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 246, -1));

        bt_registro_m.setText("Registrarse como Maestro");
        bt_registro_m.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_registro_mMouseClicked(evt);
            }
        });
        jPanel1.add(bt_registro_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 200, 60));

        jButton2.setText("Iniciar Sesion");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 160, 40));

        jButton3.setText("Registrarse como Alumno");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, 190, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_registro_mMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_registro_mMouseClicked
        this.setVisible(false);
        registro_maestro.pack();
        registro_maestro.setLocationRelativeTo(this);
        registro_maestro.setVisible(true);
    }//GEN-LAST:event_bt_registro_mMouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        this.setVisible(false);
        registro_alumno.pack();
        registro_alumno.setLocationRelativeTo(this);
        registro_alumno.setVisible(true);
    }//GEN-LAST:event_jButton3MouseClicked

    private void bt_registrarse_alumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_registrarse_alumnoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_registrarse_alumnoMouseClicked

    private void bt_registrarse_maestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_registrarse_maestroActionPerformed
        String nombre;
        String user;
        String Password;
        String confirm;
        int rrhh;
        
        try{
            nombre = tf_nombre_maestro.getText();
            user = tf_user_maestro.getText();
            Password = tf_password_maestro.getText();
            confirm = pf_password_maestro.getText();
            rrhh = Integer.parseInt(tf_rrhh.getText());
            if (!(confirm.equals(Password))){
                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
            }else{
                Maestro x = new Maestro (rrhh, nombre, user, Password);
                maestros.add(x);
                
                Dba db = new Dba("./Universidad.accdb");
                db.conectar();
                
                db.query.execute("INSERT INTO Maestros"
                    + " (Nombre,RRHH)"
                    + " VALUES ('" + nombre + "', '" + rrhh + "')");
                db.commit();
                
                JOptionPane.showMessageDialog(null, "Se ha creado el maestro exitosamente");
                db.desconectar();
                
                tf_nombre_maestro.setText("");
                tf_user_maestro.setText("");
                tf_password_maestro.setText("");
                pf_password_maestro.setText("");
                
                registro_maestro.setVisible(false);
                this.pack();
                this.setLocationRelativeTo(null);
                this.setVisible(true);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error");
        }
    }//GEN-LAST:event_bt_registrarse_maestroActionPerformed

    private void bt_registrarse_alumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_registrarse_alumnoActionPerformed
        // TODO add your handling code here:
        String nombre, user, carrera, pass="";
        nombre = tf_nombre_alumno.getText();
        user = tf_user_alumno.getText();
        if(tf_password_alumno.getText() == pf_password_alumno.getText()){
            pass = pf_password_alumno.getText();
        }
        else{
            JOptionPane.showMessageDialog(null, "Las contrasenas no coinciden");
        }
        int numCuenta = 1+r.nextInt(999999);
        carrera = tf_carrera_alumno.getText();
        usuarios.add(new Alumno(numCuenta, carrera, nombre, user, pass));
        
        Dba db = new Dba("./Universidad.accdb");
        db.conectar();
        try {
            db.query.execute("INSERT INTO Alumnos"
                    + " (Nombre,# de Cuenta,Carrera)"
                    + " VALUES ('" + nombre + "', '" + numCuenta + "', '" + carrera + "')");
            db.commit();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        db.desconectar();
        JOptionPane.showMessageDialog(null, "Se ha registrado exitosamente");
        tf_nombre_alumno.setText("");
        tf_user_alumno.setText("");
        tf_password_alumno.setText("");
        pf_password_alumno.setText("");
        
        registro_alumno.setVisible(false);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }//GEN-LAST:event_bt_registrarse_alumnoActionPerformed

    private void bt_registrarse_maestroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_registrarse_maestroMouseClicked
        String nombre;
        String user;
        String Password;
        String confirm;
        int rrhh;
        
        try{
            nombre = tf_nombre_maestro.getText();
            user = tf_user_maestro.getText();
            Password = tf_password_maestro.getText();
            confirm = pf_password_maestro.getText();
            rrhh = Integer.parseInt(tf_rrhh.getText());
            if (!(confirm.equals(Password))){
                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
            }else{
                Maestro x = new Maestro (rrhh, nombre, user, Password);
                maestros.add(x);
                
                Dba db = new Dba("./Universidad.accdb");
                db.conectar();
                
                db.query.execute("INSERT INTO Maestros"
                    + " (Nombre,RRHH)"
                    + " VALUES ('" + nombre + "', '" + rrhh + "')");
                db.commit();
                
                JOptionPane.showMessageDialog(null, "Se ha creado el maestro exitosamente");
                db.desconectar();
                
                tf_nombre_maestro.setText("");
                tf_user_maestro.setText("");
                tf_password_maestro.setText("");
                pf_password_maestro.setText("");
                
                registro_maestro.setVisible(false);
                this.pack();
                this.setLocationRelativeTo(null);
                this.setVisible(true);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error");
        }
    }//GEN-LAST:event_bt_registrarse_maestroMouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Contraseña;
    private javax.swing.JButton bt_Calificaciones;
    private javax.swing.JButton bt_crudClase;
    private javax.swing.JButton bt_crudExamen;
    private javax.swing.JButton bt_crudPregunta;
    private javax.swing.JButton bt_registrarse_maestro;
    private javax.swing.JButton bt_registro_m;
    private javax.swing.JButton bt_verClases;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel label_nombre_admin;
    private javax.swing.JLabel label_nombre_alumno;
    private javax.swing.JLabel label_nombre_maestro;
    private javax.swing.JFrame modificar_alumno;
    private javax.swing.JFrame modificar_maestro;
    private javax.swing.JPasswordField pf_password_alumno;
    private javax.swing.JPasswordField pf_password_maestro;
    private javax.swing.JFrame plataforma_admin;
    private javax.swing.JFrame plataforma_alumno;
    private javax.swing.JFrame plataforma_maestro;
    private javax.swing.JFrame registro_alumno;
    private javax.swing.JFrame registro_maestro;
    private javax.swing.JTextField tf_carrera_alumno;
    private javax.swing.JTextField tf_nombre_alumno;
    private javax.swing.JTextField tf_nombre_maestro;
    private javax.swing.JTextField tf_password;
    private javax.swing.JTextField tf_password_alumno;
    private javax.swing.JTextField tf_password_maestro;
    private javax.swing.JTextField tf_rrhh;
    private javax.swing.JTextField tf_user_alumno;
    private javax.swing.JTextField tf_user_maestro;
    private javax.swing.JTextField tf_username;
    // End of variables declaration//GEN-END:variables
    String username_admin = "admin";
    String password_admin = "admin1234";
    ArrayList<Usuario> usuarios = new ArrayList();
    ArrayList <Alumno> alumnos = new ArrayList ();
    ArrayList <Maestro> maestros = new ArrayList ();
}
