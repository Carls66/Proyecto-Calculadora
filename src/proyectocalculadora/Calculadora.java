/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocalculadora;

/**
 *
 * @author JrCarlosAlberto
 */
public class Calculadora extends javax.swing.JFrame {

    String memoria1;
    String signo = "";
    String memoria2;
    String memoria3;
    Double contador = 0.0;
    String operacion;
    Boolean igualPrecionado = false;
    Boolean activo = false;
    Boolean restaAct = false;
    Boolean sumaAct = false;
    String cuenta = "";
    String resultado = "";

    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
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

        txtPantalla = new javax.swing.JTextField();
        bnt1 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        bnt4 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        bntMasMenos = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnPunto = new javax.swing.JButton();
        btnMenos = new javax.swing.JButton();
        btnMas = new javax.swing.JButton();
        btnPor = new javax.swing.JButton();
        btnDividir = new javax.swing.JButton();
        btnBorrarOperacion = new javax.swing.JButton();
        btnBorrarPantalla = new javax.swing.JButton();
        btnInvertir = new javax.swing.JButton();
        bntIgual = new javax.swing.JButton();
        txtOperacion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setResizable(false);

        txtPantalla.setEditable(false);
        txtPantalla.setBackground(new java.awt.Color(255, 255, 255));
        txtPantalla.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtPantalla.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPantalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPantallaActionPerformed(evt);
            }
        });

        bnt1.setText("1");
        bnt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt1ActionPerformed(evt);
            }
        });

        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        bnt4.setText("4");
        bnt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt4ActionPerformed(evt);
            }
        });

        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        bntMasMenos.setText("+/-");
        bntMasMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntMasMenosActionPerformed(evt);
            }
        });

        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btnPunto.setText(".");
        btnPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntoActionPerformed(evt);
            }
        });

        btnMenos.setText("-");
        btnMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosActionPerformed(evt);
            }
        });

        btnMas.setText("+");
        btnMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasActionPerformed(evt);
            }
        });

        btnPor.setText("*");
        btnPor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPorActionPerformed(evt);
            }
        });

        btnDividir.setText("/");
        btnDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDividirActionPerformed(evt);
            }
        });

        btnBorrarOperacion.setText("C");
        btnBorrarOperacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarOperacionActionPerformed(evt);
            }
        });

        btnBorrarPantalla.setText("CE");
        btnBorrarPantalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarPantallaActionPerformed(evt);
            }
        });

        btnInvertir.setText("1/x");
        btnInvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInvertirActionPerformed(evt);
            }
        });

        bntIgual.setText("=");
        bntIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntIgualActionPerformed(evt);
            }
        });

        txtOperacion.setEditable(false);
        txtOperacion.setBackground(new java.awt.Color(255, 255, 255));
        txtOperacion.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bnt1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bnt4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bntMasMenos, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPor, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMas, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBorrarOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bntIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBorrarPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtPantalla)
                    .addComponent(txtOperacion))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bnt1, bnt4, bntIgual, bntMasMenos, btn0, btn2, btn3, btn5, btn6, btn7, btn8, btn9, btnBorrarOperacion, btnBorrarPantalla, btnDividir, btnInvertir, btnMas, btnMenos, btnPor, btnPunto});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(txtPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bnt1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bnt4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn0))
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bntMasMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(bntIgual, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(btnMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnMas, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnPor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(btnBorrarOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(49, 49, 49)
                                            .addComponent(btnInvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(btnBorrarPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(49, 49, 49))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {bnt1, bnt4, bntIgual, bntMasMenos, btn0, btn2, btn3, btn5, btn6, btn7, btn8, btn9, btnBorrarOperacion, btnBorrarPantalla, btnDividir, btnInvertir, btnMas, btnMenos, btnPor, btnPunto});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPantallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPantallaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPantallaActionPerformed

    private void bnt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt1ActionPerformed
        // TODO add your handling code here:
//        if (igualPrecionado == true) {
//            txtPantalla.setText("");
//            igualPrecionado = false;
//        }
        
        if (!resultado.equals("")) {
            txtPantalla.setText("");
            resultado = "";
        }
        txtPantalla.setText(txtPantalla.getText() + "1");

    }//GEN-LAST:event_bnt1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        if (!resultado.equals("")) {
            txtPantalla.setText("");
            resultado = "";
        }
        txtPantalla.setText(txtPantalla.getText() + "2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        if (!resultado.equals("")) {
            txtPantalla.setText("");
            resultado = "";
        }
        txtPantalla.setText(txtPantalla.getText() + "3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void bnt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt4ActionPerformed
        // TODO add your handling code here:
        if (!resultado.equals("")) {
            txtPantalla.setText("");
            resultado = "";
        }
        txtPantalla.setText(txtPantalla.getText() + "4");
    }//GEN-LAST:event_bnt4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
        if (!resultado.equals("")) {
            txtPantalla.setText("");
            resultado = "";
        }
        txtPantalla.setText(txtPantalla.getText() + "5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
        if (!resultado.equals("")) {
            txtPantalla.setText("");
            resultado = "";
        }
        txtPantalla.setText(txtPantalla.getText() + "6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
        if (!resultado.equals("")) {
            txtPantalla.setText("");
            resultado = "";
        }
        txtPantalla.setText(txtPantalla.getText() + "7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
        if (!resultado.equals("")) {
            txtPantalla.setText("");
            resultado = "";
        }
        txtPantalla.setText(txtPantalla.getText() + "8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
        if (!resultado.equals("")) {
            txtPantalla.setText("");
            resultado = "";
        }
        txtPantalla.setText(txtPantalla.getText() + "9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        // TODO add your handling code here:
        if (!resultado.equals("")) {
            txtPantalla.setText("");
            resultado = "";
        }
        txtPantalla.setText(txtPantalla.getText() + "0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntoActionPerformed
        // TODO add your handling code here:
        //variable cadena para almacenar el texto de la pantalla de la calculadora
        String cadena;
        cadena = txtPantalla.getText();
        //comparacion para saber si la cadena esta vacia
        if (cadena.length() <= 0) {
            txtPantalla.setText("o.");

        } else {
            if (!existePunto(txtPantalla.getText())) {
                txtPantalla.setText(txtPantalla.getText() + ".");

            }
        }
    }//GEN-LAST:event_btnPuntoActionPerformed

    private void btnBorrarOperacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarOperacionActionPerformed
        // TODO add your handling code here:
        String cadena;
        cadena = txtPantalla.getText();

        if (cadena.length() > 0) {
            cadena = cadena.substring(0, cadena.length() - 1);
            txtPantalla.setText(cadena);
        }
    }//GEN-LAST:event_btnBorrarOperacionActionPerformed

    private void btnBorrarPantallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarPantallaActionPerformed
        // TODO add your handling code here:
        txtPantalla.setText("");
        txtOperacion.setText("");
        cuenta = "";
        contador = 0.0;
        memoria1 = "";
        memoria2 = "";
        signo = "";
        resultado = "";
    }//GEN-LAST:event_btnBorrarPantallaActionPerformed

    private void btnInvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInvertirActionPerformed
        // TODO add your handling code here:
        String cadena;
        Double num;
        cadena = txtPantalla.getText();

        if (cadena.length() > 0) {
            num = 1 / (Double.parseDouble(cadena));
            txtPantalla.setText(num.toString());
        }
    }//GEN-LAST:event_btnInvertirActionPerformed

    private void bntMasMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntMasMenosActionPerformed
        // TODO add your handling code here:
        Double num;
        String cadena;
        cadena = txtPantalla.getText();

        if (cadena.length() > 0) {
            num = (-1) * Double.parseDouble(cadena);
            txtPantalla.setText(num.toString());
        }
    }//GEN-LAST:event_bntMasMenosActionPerformed

    private void btnMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosActionPerformed
        // TODO add your handling code here:
//        if (!txtPantalla.getText().equals("")) {
//            contador = contador - Double.parseDouble(txtPantalla.getText());
//            memoria1 = contador.toString();
//            signo = "-";
//            txtPantalla.setText("");
//        } else {
//            memoria1 = "0";
//        }

        String resta;

        if (!signo.equals("") && igualPrecionado == false) {
            
              memoria2 = txtPantalla.getText();
            resta = calculadora(memoria1, memoria2, signo);
            memoria1 = resta;
            signo = "-";
            cuenta = cuenta + " " + txtPantalla.getText() +" "+ signo;
            txtOperacion.setText(cuenta);
            txtPantalla.setText("");
            igualPrecionado = false;
            
        }else{
            
            igualPrecionado = false;
            if (!txtPantalla.getText().equals("")) {
                contador = Double.parseDouble(txtPantalla.getText());
                memoria1 = txtPantalla.getText();
                signo = "-";
                cuenta = " " + cuenta + " " + txtPantalla.getText() + " " + signo;
                txtOperacion.setText(cuenta);
                txtPantalla.setText("");
                restaAct = true;
            }else{
                memoria1="0";
            }
            
        }
        
        
        
//        if (restaAct == false) {
//            if (!txtPantalla.getText().equals("")) {
//                contador = Double.parseDouble(txtPantalla.getText());
//                memoria1 = txtPantalla.getText();
//                signo = "-";
//                cuenta = " " + cuenta + " " + txtPantalla.getText() + " " + signo;
//                txtOperacion.setText(cuenta);
//                txtPantalla.setText("");
//                restaAct = true;
//            }else{
//                memoria1="0";
//            }
//
//        } else {
//
//            memoria2 = txtPantalla.getText();
//            resta = calculadora(memoria1, memoria2, signo);
//            memoria1 = resta;
//            signo = "-";
//            cuenta = cuenta + " " + txtPantalla.getText() + signo;
//            txtOperacion.setText(cuenta);
//            txtPantalla.setText("");
//        }


    }//GEN-LAST:event_btnMenosActionPerformed

    private void btnMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasActionPerformed
        // TODO add your handling code here:
//Version 1 funcional suma
//        if (!txtPantalla.getText().equals("")) {
//            contador = contador + Double.parseDouble(txtPantalla.getText());
//            memoria1 = contador.toString();
//            signo = "+";
//            txtPantalla.setText("");
//        } else {
//            memoria1 = "0";
//        }

        
        if (!signo.equals("") && igualPrecionado == false) {
            
              memoria2 = txtPantalla.getText();
            operacion = calculadora(memoria1, memoria2, signo);
            memoria1 = operacion;
            signo = "+";
            cuenta = cuenta + " " + txtPantalla.getText() +" "+ signo;
            txtOperacion.setText(cuenta);
            txtPantalla.setText("");
            igualPrecionado = false;
            
        }else{
            
            igualPrecionado = false;
            if (!txtPantalla.getText().equals("")) {
                contador = Double.parseDouble(txtPantalla.getText());
                memoria1 = txtPantalla.getText();
                signo = "+";
                cuenta = " " + cuenta + " " + txtPantalla.getText() + " " + signo;
                txtOperacion.setText(cuenta);
                txtPantalla.setText("");
                restaAct = true;
            }else{
                memoria1="0";
            }
            
        }
        
        
//        String suma;
//        
//        if (sumaAct == false) {
//            if (!txtPantalla.getText().equals("")) {
//                contador = Double.parseDouble(txtPantalla.getText());
//                memoria1 = txtPantalla.getText();
//                signo = "+";
//                cuenta = " " + cuenta + " " + txtPantalla.getText() + " " + signo;
//                txtOperacion.setText(cuenta);
//                txtPantalla.setText("");
//                sumaAct = true;
//            }else{
//                memoria1="0";
//            }
//
//        } else {
//
//            memoria2 = txtPantalla.getText();
//            suma = calculadora(memoria1, memoria2, signo);
//            memoria1 = suma;
//            signo = "+";
//            cuenta = cuenta + " " + txtPantalla.getText() + signo;
//            txtOperacion.setText(cuenta);
//            txtPantalla.setText("");
//        }
        
        

    }//GEN-LAST:event_btnMasActionPerformed

    private void btnPorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPorActionPerformed
        // TODO add your handling code here:
//        if (!txtPantalla.getText().equals("")) {
//            contador = 1.0;
//            contador = contador * Double.parseDouble(txtPantalla.getText());
//
//            memoria1 = contador.toString();
//            signo = "*";
//            txtPantalla.setText("");
//        } else {
//            memoria1 = "0";
//        }
        
        
        
        if (!signo.equals("") && igualPrecionado == false) {
            
              memoria2 = txtPantalla.getText();
            operacion = calculadora(memoria1, memoria2, signo);
            memoria1 = operacion;
            signo = "*";
            cuenta = cuenta + " " + txtPantalla.getText() +" "+ signo;
            txtOperacion.setText(cuenta);
            txtPantalla.setText("");
            igualPrecionado = false;
            
        }else{
            
            igualPrecionado = false;
            if (!txtPantalla.getText().equals("")) {
                contador = Double.parseDouble(txtPantalla.getText());
                memoria1 = txtPantalla.getText();
                signo = "*";
                cuenta = " " + cuenta + " " + txtPantalla.getText() + " " + signo;
                txtOperacion.setText(cuenta);
                txtPantalla.setText("");
                restaAct = true;
            }else{
                memoria1="0";
            }
            
        }
    }//GEN-LAST:event_btnPorActionPerformed

    private void btnDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDividirActionPerformed
        // TODO add your handling code here:
//        contador = 1.0;
//        if (!txtPantalla.getText().equals("")) {
//            
//            contador = contador / Double.parseDouble(txtPantalla.getText());
//            memoria1 = contador.toString();
//            signo = "/";
//            txtPantalla.setText("");
//        } else {
//            memoria1 = "0";
//        }

        if (!signo.equals("") && igualPrecionado == false) {
            
              memoria2 = txtPantalla.getText();
            operacion = calculadora(memoria1, memoria2, signo);
            memoria1 = operacion;
            signo = "/";
            cuenta = cuenta + " " + txtPantalla.getText() + " " + signo;
            txtOperacion.setText(cuenta);
            txtPantalla.setText("");
            igualPrecionado = false;
            
        }else{
            
            igualPrecionado = false;
            if (!txtPantalla.getText().equals("")) {
                contador = Double.parseDouble(txtPantalla.getText());
                memoria1 = txtPantalla.getText();
                signo = "/";
                cuenta = cuenta + " " + txtPantalla.getText() + " " + signo;
                txtOperacion.setText(cuenta);
                txtPantalla.setText("");
                restaAct = true;
            }else{
                memoria1="0";
            }
            
        }
        
        
        
        
        
        
        
        
        
        
//        String division;
//
//        if (activo == false) {
//            if (!txtPantalla.getText().equals("")) {
//                contador = Double.parseDouble(txtPantalla.getText());
//                memoria1 = txtPantalla.getText();
//                signo = "/";
//                txtPantalla.setText("");
//                activo = true;
//            } else {
//                memoria1 = "0";
//            }
//
//        } else {
//
//            memoria2 = txtPantalla.getText();
//            division = calculadora(memoria1, memoria2, signo);
//            memoria1 = division;
//            signo = "/";
//            txtPantalla.setText("");
//
////            if (!memoria2.equals("")) {
////            resultado = calculadora(memoria1, memoria2, signo);
////            txtPantalla.setText(resultado);
////            contador = 0.0;
////            igualPrecionado = true;
//////            memoria1 = "";
//////            memoria2 = "";
//        }


    }//GEN-LAST:event_btnDividirActionPerformed

    private void bntIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntIgualActionPerformed
        // TODO add your handling code here:
//        String resultado;

        if (igualPrecionado == false) {

            memoria2 = txtPantalla.getText();
            txtOperacion.setText("");
            cuenta = "";
            

            if (!memoria2.equals("")) {
                resultado = calculadora(memoria1, memoria2, signo);
                txtPantalla.setText(resultado);
                contador = 0.0;
                igualPrecionado = true;
                activo = false;
                restaAct = false;
                sumaAct = false;
                
                
//            memoria1 = "";
//            memoria2 = "";
            }
        } else {

            memoria1 = txtPantalla.getText();

            resultado = calculadora(memoria1, memoria2, signo);
//            operacion = Double.parseDouble(resultado) + Double.parseDouble(memoria3);
//            resultado = operacion.toString();
            txtPantalla.setText(resultado);
            contador = 0.0;
            igualPrecionado = true;
            

//            memoria1 = "";
//            memoria2 = "";
        }

//        memoria2 = txtPantalla.getText();
//        if (!memoria2.equals("")) {
//            resultado = calculadora(memoria1, memoria2, signo);
//            txtPantalla.setText(resultado);
//            contador = 0.0;
//            igualPrecionado = true;
////            memoria1 = "";
////            memoria2 = "";
//        }

    }//GEN-LAST:event_bntIgualActionPerformed

    public static String calculadora(String memoria1, String memoria2, String signo) {
        Double resultado = 0.0;
        String respuesta;

        if (signo.equals("-")) {
            resultado = Double.parseDouble(memoria1) - Double.parseDouble(memoria2);
        }
        if (signo.equals("+")) {
            resultado = Double.parseDouble(memoria1) + Double.parseDouble(memoria2);
        }
        if (signo.equals("*")) {
            resultado = Double.parseDouble(memoria1) * Double.parseDouble(memoria2);
        }
        if (signo.equals("/")) {
            resultado = Double.parseDouble(memoria1) / Double.parseDouble(memoria2);

        }
        respuesta = resultado.toString();
        return respuesta;

    }

    public static boolean existePunto(String cadena) {
        boolean resultado;
        resultado = false;

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.substring(i, i + 1).equals(".")) {
                resultado = true;
                break;

            }

        }
        return resultado;
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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnt1;
    private javax.swing.JButton bnt4;
    private javax.swing.JButton bntIgual;
    private javax.swing.JButton bntMasMenos;
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnBorrarOperacion;
    private javax.swing.JButton btnBorrarPantalla;
    private javax.swing.JButton btnDividir;
    private javax.swing.JButton btnInvertir;
    private javax.swing.JButton btnMas;
    private javax.swing.JButton btnMenos;
    private javax.swing.JButton btnPor;
    private javax.swing.JButton btnPunto;
    private javax.swing.JTextField txtOperacion;
    private javax.swing.JTextField txtPantalla;
    // End of variables declaration//GEN-END:variables
}
