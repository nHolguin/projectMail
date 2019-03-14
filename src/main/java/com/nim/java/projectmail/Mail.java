package com.nim.java.projectmail;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Mail extends javax.swing.JFrame {

    /**
     * Creates new form Mail
     */
    public Mail() {
        initComponents();
    }

    private String valorARB = "Este es un texto que abre la cabecera";
    private String valorCPH = "Este es un texto que indica la documentación específica";
    private String valorCPS = "Este es un texto del slack";
    private String valorDES = "Este es un textp de desocupados";
    private String valorCRB = "Este es un texto que cierra la cabecera";
    private String [] listaMensaje = {"","","","",""};

    private void copy(String copiar) {

        StringSelection selection = new StringSelection(copiar);

        Clipboard resultado = Toolkit.getDefaultToolkit().getSystemClipboard();

        resultado.setContents(selection, null);

    }

    private String paste() {

        String resultado = "";

        Clipboard valor = Toolkit.getDefaultToolkit().getSystemClipboard();

        Transferable contenido = valor.getContents(null);

        if (contenido.isDataFlavorSupported(DataFlavor.stringFlavor)) {
            try {
                resultado = (String) contenido.getTransferData(DataFlavor.stringFlavor);
            } catch (UnsupportedFlavorException ex) {
                Logger.getLogger(Mail.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Mail.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return resultado;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        recibido = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        enviar = new javax.swing.JTextArea();
        copiar = new javax.swing.JButton();
        checkARB = new javax.swing.JCheckBox();
        checkCPH = new javax.swing.JCheckBox();
        checkCPS = new javax.swing.JCheckBox();
        checkDES = new javax.swing.JCheckBox();
        checkCRB = new javax.swing.JCheckBox();
        pegar = new javax.swing.JButton();
        limpiarTodo = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        limpiarRecibido = new javax.swing.JButton();
        limpiarEnviar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        arb = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cph = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        des = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        cps = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        crb = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        recibido.setColumns(20);
        recibido.setLineWrap(true);
        recibido.setRows(5);
        recibido.setWrapStyleWord(true);
        jScrollPane3.setViewportView(recibido);

        enviar.setColumns(20);
        enviar.setLineWrap(true);
        enviar.setRows(5);
        enviar.setWrapStyleWord(true);
        jScrollPane4.setViewportView(enviar);

        copiar.setText("Copiar");
        copiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copiarActionPerformed(evt);
            }
        });

        checkARB.setText("ARB");
        checkARB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkARBActionPerformed(evt);
            }
        });

        checkCPH.setText("CPH");
        checkCPH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkCPHActionPerformed(evt);
            }
        });

        checkCPS.setText("CPS");
        checkCPS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkCPSActionPerformed(evt);
            }
        });

        checkDES.setText("DES");
        checkDES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkDESActionPerformed(evt);
            }
        });

        checkCRB.setText("CRB");
        checkCRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkCRBActionPerformed(evt);
            }
        });

        pegar.setText("Pegar");
        pegar.setToolTipText("");
        pegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pegarActionPerformed(evt);
            }
        });

        limpiarTodo.setText("Limpiar Todo");
        limpiarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarTodoActionPerformed(evt);
            }
        });

        jLabel6.setText("Recibido");

        jLabel7.setText("Enviar");

        limpiarRecibido.setText("Limpiar Recibido");
        limpiarRecibido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarRecibidoActionPerformed(evt);
            }
        });

        limpiarEnviar.setText("Limpiar Enviar");
        limpiarEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarEnviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(pegar)
                                .addGap(135, 135, 135)
                                .addComponent(copiar))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkARB)
                            .addComponent(checkCPH)
                            .addComponent(checkCPS)
                            .addComponent(checkDES)
                            .addComponent(checkCRB)
                            .addComponent(limpiarTodo)
                            .addComponent(limpiarRecibido)
                            .addComponent(limpiarEnviar)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel6)
                        .addGap(156, 156, 156)
                        .addComponent(jLabel7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(checkARB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkCPH)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(checkCPS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(checkDES)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(checkCRB)
                        .addGap(33, 33, 33)
                        .addComponent(limpiarTodo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(limpiarRecibido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(limpiarEnviar)
                        .addGap(0, 140, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4)
                            .addComponent(jScrollPane3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pegar)
                            .addComponent(copiar))))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Respuestas", jPanel1);

        jLabel1.setText("ARB");

        arb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arbActionPerformed(evt);
            }
        });

        jLabel2.setText("CPH");

        jLabel3.setText("DES");

        des.setColumns(20);
        des.setRows(5);
        jScrollPane1.setViewportView(des);

        jLabel4.setText("CPS");

        jLabel5.setText("CRB");

        crb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
                    .addComponent(arb)
                    .addComponent(cph)
                    .addComponent(cps)
                    .addComponent(crb))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(arb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cph, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(crb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Configuracion", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void arbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arbActionPerformed

    private void crbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crbActionPerformed

    private void copiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copiarActionPerformed
        // TODO add your handling code here:
        copy(enviar.getText());
    }//GEN-LAST:event_copiarActionPerformed

    private void pegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pegarActionPerformed
        // TODO add your handling code here:
        recibido.setText(paste());
    }//GEN-LAST:event_pegarActionPerformed

    private void limpiarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarTodoActionPerformed
        // TODO add your handling code here:
        enviar.setText("");
        recibido.setText("");

    }//GEN-LAST:event_limpiarTodoActionPerformed

    private void limpiarRecibidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarRecibidoActionPerformed
        // TODO add your handling code here:
        recibido.setText("");
    }//GEN-LAST:event_limpiarRecibidoActionPerformed

    private void limpiarEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarEnviarActionPerformed
        // TODO add your handling code here:
        enviar.setText("");
    }//GEN-LAST:event_limpiarEnviarActionPerformed

    private void mostrarMensaje() {
        
        String mensaje = "";
        
        for(String iterador: listaMensaje) {
            
            mensaje = mensaje + "\n\n" + iterador;
            
        }
        
        enviar.setText(mensaje);
        
    }
    private void eventoCheckbox(int flag) {
        
        boolean check = false;

        switch (flag) {
            case 1:
                if (checkARB.isSelected() == true) {
                    check = true;
                } else if (checkARB.isSelected() == false) {
                    check = false;
                }
                break;
            case 2:
                if (checkCPH.isSelected() == true) {
                    check = true;
                } else if (checkCPH.isSelected() == false) {
                    check = false;
                }
            break;
            case 3:
                if (checkCPS.isSelected() == true) {
                    check = true;
                } else if (checkCPS.isSelected() == false) {
                    check = false;
                }
                break;
            case 4:
                if (checkDES.isSelected() == true) {
                    check = true;
                } else if (checkDES.isSelected() == false) {
                    check = false;
                }
            break;
            case 5:
                if (checkCRB.isSelected() == true) {
                    check = true;
                } else if (checkCRB.isSelected() == false) {
                    check = false;
                }
                break;
        }

        if(flag == 1) {
            if(check == true) {
                listaMensaje[0] = valorARB;
            }
            else {
                listaMensaje[0] = "";
            }
        }
        
        if(flag == 2) {
            if(check == true) {
                listaMensaje[1] = valorCPH;
            }
            else {
                listaMensaje[1] = "";
            }
        }
        
        if(flag == 3) {
            if(check == true) {
                listaMensaje[2] = valorCPS;
            }
            else {
                listaMensaje[2] = "";
            }
        }
        
        if(flag == 4) {
            if(check == true) {
                listaMensaje[3] = valorDES;
            }
            else {
                listaMensaje[3] = "";
            }
        }
        
        if(flag == 5) {
            if(check == true) {
                listaMensaje[4] = valorCRB;
            }
            else {
                listaMensaje[4] = "";
            }
        }
        
        mostrarMensaje();
        //JOptionPane.showMessageDialog(null, listaMensaje);

    }

    private void checkARBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkARBActionPerformed
        // TODO add your handling code here:

        eventoCheckbox(1);
    }//GEN-LAST:event_checkARBActionPerformed

    private void checkCPHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkCPHActionPerformed
        // TODO add your handling code here:
        eventoCheckbox(2);
    }//GEN-LAST:event_checkCPHActionPerformed

    private void checkCPSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkCPSActionPerformed
        // TODO add your handling code here:
        eventoCheckbox(3);
    }//GEN-LAST:event_checkCPSActionPerformed

    private void checkDESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkDESActionPerformed
        // TODO add your handling code here:
        eventoCheckbox(4);
    }//GEN-LAST:event_checkDESActionPerformed

    private void checkCRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkCRBActionPerformed
        // TODO add your handling code here:
        eventoCheckbox(5);
    }//GEN-LAST:event_checkCRBActionPerformed

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
            java.util.logging.Logger.getLogger(Mail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                Toolkit pantalla = Toolkit.getDefaultToolkit();
                Dimension tamanioPantalla = pantalla.getScreenSize();

                int altoPantalla = tamanioPantalla.height;
                int anchoPantalla = tamanioPantalla.width;

                //setSize(anchoPantalla / 2, altoPantalla / 2);
                Mail mail = new Mail();
                mail.setTitle("App Mail");

                Image icono = pantalla.getImage("images/mail.png");
                mail.setIconImage(icono);

                mail.setLocation(anchoPantalla / 4, altoPantalla / 4);

                mail.setVisible(true);

                //new Mail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField arb;
    private javax.swing.JCheckBox checkARB;
    private javax.swing.JCheckBox checkCPH;
    private javax.swing.JCheckBox checkCPS;
    private javax.swing.JCheckBox checkCRB;
    private javax.swing.JCheckBox checkDES;
    private javax.swing.JButton copiar;
    private javax.swing.JTextField cph;
    private javax.swing.JTextField cps;
    private javax.swing.JTextField crb;
    private javax.swing.JTextArea des;
    private javax.swing.JTextArea enviar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton limpiarEnviar;
    private javax.swing.JButton limpiarRecibido;
    private javax.swing.JButton limpiarTodo;
    private javax.swing.JButton pegar;
    private javax.swing.JTextArea recibido;
    // End of variables declaration//GEN-END:variables

}
