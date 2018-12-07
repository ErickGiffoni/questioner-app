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
    String nome,enunciado;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }
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
 public void initGui()
 {
     
        f= new JFrame(nome);
        
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            f.setLayout(new FlowLayout());
        lbl = new JLabel(enunciado);
        tf = new JTextField(30);
        
        tf.setText("");
        f.add(lbl);
        f.add(tf);
        f.add(btn);
        btn.addActionListener(this);
        f.setVisible(true);
        f.setLocation(200, 200);
        f.setSize(500,100);
        

}
 
    public TextField(String Formulario,String Pergunta){
        setNome(Formulario);
        setEnunciado(Pergunta);       
        
    }
  
    public void actionPerformed(ActionEvent ae){
        if(tf.getText().isEmpty())
        {
           // f.dispose();
            
            
        }else
        JOptionPane.showMessageDialog(null, tf.getText());
        this.setRetorno(tf.getText());
        f.dispose();
    }
    
//    public static void main(String[] args) {
//       TextField tf =new TextField("Questao","Seu nome");
//        
//        tf.initGui();
//    }
}
