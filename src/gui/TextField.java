/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class TextField implements ActionListener {
 JTextField tf;
 JLabel lbl;
 JFrame f;  
 JButton btn = new JButton("OK");

    public String getRetorno() {
        return retorno;
    }

    public void setRetorno(String retorno) {
        this.retorno = retorno;
    }
 
 String retorno;
    public TextField(String Formulario,String Pergunta){
        f= new JFrame(Formulario);
        
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            f.setLayout(new FlowLayout());
        lbl = new JLabel(Pergunta);
        tf = new JTextField(30);
        
        tf.setText("");
        f.add(lbl);
        f.add(tf);
        f.add(btn);
        btn.addActionListener(this);
        f.setVisible(true);
        f.setSize(500,100);
        
        
        
    }
  
    public void actionPerformed(ActionEvent ae){
        JOptionPane.showMessageDialog(null, tf.getText());
        this.setRetorno(tf.getText());
        f.dispose();
    }
    
//    public static void main(String[] args) {
//        new TextField("Questao","Seu nome");
//    }
}
