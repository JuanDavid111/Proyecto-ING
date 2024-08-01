/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.*;
import modelo.*;
import java.io.IOException;
import java.net.URISyntaxException;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import java.awt.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Mattxx
 */
public class RegistroProponente extends javax.swing.JFrame {

    /**
     * Creates new form RegistroProponente
     */
    private UI_Login login;
    
    public RegistroProponente() {
        initComponents();
        this.setSize(1280,720);
        this.setLocationRelativeTo(null);
        this.setVisible(false);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new java.awt.Color(86,81,81));
        mercantilField.setVisible(false);
        jLabel10.setVisible(false);
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
        jPanel2 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        mercantilField = new javax.swing.JTextField();
        userField = new javax.swing.JTextField();
        ciField = new javax.swing.JTextField();
        islrField = new javax.swing.JTextField();
        rifField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        confirmField = new javax.swing.JPasswordField();
        resumenField = new javax.swing.JTextField();
        tituloField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        enviarButton = new javax.swing.JButton();
        atrasButton = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        juridicoButton = new javax.swing.JToggleButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(86, 81, 81));

        jPanel2.setBackground(new java.awt.Color(217, 217, 217));
        jPanel2.setPreferredSize(new java.awt.Dimension(1280, 100));

        jButton4.setBackground(new java.awt.Color(217, 217, 217));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/Img/curseate-logo.png"))); // NOI18N
        jButton4.setText("jButton3");

        jLabel24.setFont(new java.awt.Font("Monotype Corsiva", 1, 48)); // NOI18N
        jLabel24.setText("Curseate ");

        jLabel25.setFont(new java.awt.Font("Monotype Corsiva", 1, 32)); // NOI18N
        jLabel25.setText("Login | Register");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 732, Short.MAX_VALUE)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel25)
                            .addComponent(jLabel24))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(217, 217, 217));
        jPanel3.setPreferredSize(new java.awt.Dimension(750, 400));

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel1.setText("Registro");

        jLabel2.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel2.setText("User");

        jLabel3.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel3.setText("Password");

        jLabel4.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel4.setText("Confirm Password");

        jLabel5.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel5.setText("Cedula de Identidad");

        jLabel6.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel6.setText("RIF");

        jLabel7.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel7.setText("ISLR");

        jLabel8.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel8.setText("Resumen Curricular");

        jLabel9.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel9.setText("Titulo Universitario");

        mercantilField.setBackground(new java.awt.Color(86, 81, 81));
        mercantilField.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        mercantilField.setForeground(new java.awt.Color(255, 255, 255));
        mercantilField.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        userField.setBackground(new java.awt.Color(86, 81, 81));
        userField.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        userField.setForeground(new java.awt.Color(255, 255, 255));
        userField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        userField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userFieldActionPerformed(evt);
            }
        });

        ciField.setBackground(new java.awt.Color(86, 81, 81));
        ciField.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        ciField.setForeground(new java.awt.Color(255, 255, 255));
        ciField.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        islrField.setBackground(new java.awt.Color(86, 81, 81));
        islrField.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        islrField.setForeground(new java.awt.Color(255, 255, 255));
        islrField.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        rifField.setBackground(new java.awt.Color(86, 81, 81));
        rifField.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        rifField.setForeground(new java.awt.Color(255, 255, 255));
        rifField.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        passwordField.setBackground(new java.awt.Color(86, 81, 81));
        passwordField.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        passwordField.setForeground(new java.awt.Color(255, 255, 255));
        passwordField.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        confirmField.setBackground(new java.awt.Color(86, 81, 81));
        confirmField.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        confirmField.setForeground(new java.awt.Color(255, 255, 255));
        confirmField.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        resumenField.setBackground(new java.awt.Color(86, 81, 81));
        resumenField.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        resumenField.setForeground(new java.awt.Color(255, 255, 255));
        resumenField.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tituloField.setBackground(new java.awt.Color(86, 81, 81));
        tituloField.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        tituloField.setForeground(new java.awt.Color(255, 255, 255));
        tituloField.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel10.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel10.setText("Registro Mercantil");

        enviarButton.setBackground(new java.awt.Color(86, 81, 81));
        enviarButton.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        enviarButton.setForeground(new java.awt.Color(255, 255, 255));
        enviarButton.setText("Enviar");
        enviarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enviarButton.setFocusable(false);
        enviarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarButtonActionPerformed(evt);
            }
        });

        atrasButton.setBackground(new java.awt.Color(86, 81, 81));
        atrasButton.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        atrasButton.setForeground(new java.awt.Color(255, 255, 255));
        atrasButton.setText("Atras");
        atrasButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        atrasButton.setFocusable(false);
        atrasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasButtonActionPerformed(evt);
            }
        });

        jLabel11.setText("Sube tus archivos :");

        jButton1.setBackground(new java.awt.Color(86, 81, 81));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Aqui");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusable(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });

        juridicoButton.setBackground(new java.awt.Color(86, 81, 81));
        juridicoButton.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        juridicoButton.setForeground(new java.awt.Color(255, 255, 255));
        juridicoButton.setText("Natural");
        juridicoButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        juridicoButton.setBorderPainted(false);
        juridicoButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        juridicoButton.setFocusPainted(false);
        juridicoButton.setFocusable(false);
        juridicoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                juridicoButtonActionPerformed(evt);
            }
        });

        jToggleButton1.setBackground(new java.awt.Color(217, 217, 217));
        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/Img/eye icon.png"))); // NOI18N
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton2.setBackground(new java.awt.Color(217, 217, 217));
        jToggleButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/Img/eye icon.png"))); // NOI18N
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(131, 131, 131)
                .addComponent(jLabel1)
                .addContainerGap(344, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(26, 26, 26)
                        .addComponent(userField))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(islrField))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(26, 26, 26)
                        .addComponent(rifField))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(26, 26, 26)
                        .addComponent(ciField))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(26, 26, 26)
                        .addComponent(confirmField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(26, 26, 26)
                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(atrasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)
                        .addComponent(enviarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jToggleButton2)
                                .addGap(127, 127, 127)
                                .addComponent(juridicoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jToggleButton1)
                                .addGap(58, 58, 58)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(mercantilField, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel8))
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(resumenField, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tituloField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(29, 29, 29)))))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jButton1))
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(userField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(confirmField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(ciField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rifField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(islrField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(resumenField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tituloField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(juridicoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(mercantilField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enviarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(atrasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(246, 246, 246))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 137, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("CURSEATE");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userFieldActionPerformed

    private void enviarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarButtonActionPerformed
        
        if(evt.getSource() == enviarButton){
    //Almacena las contraseñas en una variable para que se puedean comparar
    String password1 = passwordField.getText(); // password
    String password2 = confirmField.getText(); // confirm password
    String name = userField.getText();

    //If para ver si el usuario esta registrado

    Proponente_Control e = Proponente_Control.getinstancia();
        
        //El verificiacion da un valor de verdadero entonces
        if(e.verificacion(name, password1)){
        //Se le daria el paso a Proponente o Administrador, segun donde haya sido presionado el boton y la logica
        //Si se usa la misma logica para el administrador pues la implementacion es igual       
            JOptionPane.showMessageDialog(this, "Usuario ya registrado previamente");
            userField.setText("");
            passwordField.setText("");
            confirmField.setText("");
        }
        //Si no esta registrado
        else { Registrarse usuario = new Registrarse();

            //Preguntta si son iguales las contraseñas
        if(password1.equals(password2)){ 
        //Si son iguales pasa a ver si los demas JField no estan vacios
        if(!"".equals(userField.getText()) && !"".equals(rifField.getText()) && !"".equals(islrField.getText()) && !"".equals(ciField.getText()) && !"".equals(tituloField.getText()) && !"".equals(resumenField.getText())){
            
            //Pregunta si el boton de juridico esta presionado y si esta precionado y tiene algo en el JField de mercantil pues registro exitoso
            if(juridicoButton.isSelected() && !"".equals(mercantilField.getText())){

                usuario.Registrar(userField.getText(),passwordField.getText(),ciField.getText(),rifField.getText(),islrField.getText(),resumenField.getText(),tituloField.getText(),mercantilField.getText());
                
                JOptionPane.showMessageDialog(this,"Registro exitoso");
                this.setVisible(false);
                //Crea un nuevo Login Frame(Si pueden cambiar esta logica para que no se creen muchas instancias)
                UI_Login frame_a_pasar = new UI_Login();
                frame_a_pasar.setVisible(true);
            }
            //Si el boton para el pase de juridico esta presionado y no hay nada escrito
            else if(juridicoButton.isSelected() && "".equals(mercantilField.getText())){
                //Erro, Datos faltantes
                JOptionPane.showMessageDialog(this, "Datos Faltante");
            }
            //Si el boton NO esta presionado pues registro exitoso
            else if(!juridicoButton.isSelected()){

                usuario.Registrar(userField.getText(),passwordField.getText(),ciField.getText(),rifField.getText(),islrField.getText(),resumenField.getText(),tituloField.getText(),mercantilField.getText());

                JOptionPane.showMessageDialog(this,"Registro exitoso");
                this.setVisible(false);
                //Crea un nuevo Login Frame(Si pueden cambiar esta logica para que no se creen muchas instancias)
                UI_Login frame_a_pasar = new UI_Login();
                frame_a_pasar.setVisible(true);
            }
            //registrar administrador
        } else if(!"".equals(userField.getText())&& !"".equals(tituloField.getText())){
            
            usuario.Registrar(userField.getText(),passwordField.getText(),tituloField.getText());
            
            JOptionPane.showMessageDialog(this, "Administrador Registrado");
            this.setVisible(false);
            //Crea un nuevo Login Frame(Si pueden cambiar esta logica para que no se creen muchas instancias)
            UI_Login frame_a_pasar = new UI_Login();
            frame_a_pasar.setVisible(true);
            
        } else{ // Si falta datos aun si el boton esta precionado
            
            // Error, Datos faltantes
            JOptionPane.showMessageDialog(this, "Datos Faltante");
        }

        }
        
    //Fin del if    

    }//Si las contraseñas no son iguales
    if(!password1.equals(password2)){
        //Erro, Contraseña incorrecta
        JOptionPane.showMessageDialog(this, "Password incorrect");
    }

}

/*Fin del codigo de register */


    }//GEN-LAST:event_enviarButtonActionPerformed

    private void atrasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasButtonActionPerformed

        if(evt.getSource() == atrasButton){

            login.setVisible(true);
            this.setVisible(false);
            userField.setText("");
            passwordField.setText("");
            confirmField.setText("");
            rifField.setText("");
            islrField.setText("");
            ciField.setText("");
            resumenField.setText("");
            tituloField.setText("");
            mercantilField.setText("");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_atrasButtonActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        link();  // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));            // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseExited

    public void setlogin(UI_Login login){
    this.login = login;
    }
    
    private void juridicoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_juridicoButtonActionPerformed
        if(juridicoButton.isSelected()){
            juridicoButton.setBackground(new Color(86,81,81));
            juridicoButton.setText("Juridico");
            mercantilField.setVisible(true);
            jLabel10.setVisible(true);
        }
        else{
            juridicoButton.setText("Natural");
            juridicoButton.setBackground(new Color(86,81,81));
            mercantilField.setVisible(false);
            jLabel10.setVisible(false);
            mercantilField.setText("");
        }
    }//GEN-LAST:event_juridicoButtonActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        if(jToggleButton1.isSelected()){
            passwordField.setEchoChar((char)0);
        }
        else{
            passwordField.setEchoChar('\u2022');
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        if(jToggleButton2.isSelected()){
            confirmField.setEchoChar((char)0);
        }
        else{
            confirmField.setEchoChar('\u2022');
        }
    }//GEN-LAST:event_jToggleButton2ActionPerformed

                                             

    private void link(){

        if(java.awt.Desktop.isDesktopSupported()){
            java.awt.Desktop computadora=java.awt.Desktop.getDesktop();
            if(computadora.isSupported(java.awt.Desktop.Action.BROWSE)){
                
               try{
                   java.net.URI link=new java.net.URI("https://drive.google.com/drive/folders/1WXbVFNa22LiJjSN5ZXmyfkUkYf9qDjLM?usp=sharing");
                   computadora.browse(link);
               }catch(IOException | URISyntaxException e){
                   
                   e.printStackTrace();
                   
               }
            
            }
            
            else {
                System.out.println("No se puede");
                System.exit(0);
            }
                
                
        }
        
    }
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
            java.util.logging.Logger.getLogger(RegistroProponente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroProponente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroProponente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroProponente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroProponente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atrasButton;
    private javax.swing.JTextField ciField;
    private javax.swing.JPasswordField confirmField;
    private javax.swing.JButton enviarButton;
    private javax.swing.JTextField islrField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
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
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton juridicoButton;
    private javax.swing.JTextField mercantilField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField resumenField;
    private javax.swing.JTextField rifField;
    private javax.swing.JTextField tituloField;
    private javax.swing.JTextField userField;
    // End of variables declaration//GEN-END:variables
}
