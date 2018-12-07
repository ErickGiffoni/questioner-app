/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RadioButton implements ActionListener {

    JLabel lbl;
    JFrame f;
    JButton jbtn = new JButton("OK");
    JButton radiobutton;
    private String retorno;
    private String Formulario;
    private String Pergunta;
    private String [] vetor= new String[0];

    public String getRetorno() {
        return retorno;
    }

    public void setRetorno(String retorno) {
        this.retorno = retorno;
    }

    public RadioButton(String Formulario, String Pergunta, String[] vetor) {
        this.Formulario =Formulario;
        this.Pergunta =Pergunta;
        this.vetor =vetor;
             
        
    }

    public void initGui() {
        f = new JFrame(Formulario);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel p = new JPanel(new GridLayout(vetor.length + 3, 2));
        p.setLayout(new FlowLayout(FlowLayout.CENTER));
        ButtonGroup bg = new ButtonGroup();
        JRadioButton[] rb = new JRadioButton[vetor.length];

        lbl = new JLabel(Pergunta);
        p.add(lbl);
        for (int i = 0; i < vetor.length; i++) {
            rb[i] = new JRadioButton(vetor[i]);
        }


        for (JRadioButton rb1 : rb) {
            p.add(rb1);
            bg.add(rb1);
        }
        
        for (JRadioButton rb1 : rb) {
            rb1.addActionListener(this);
        }

        p.add(jbtn, FlowLayout.LEFT);
        jbtn.addActionListener((ActionEvent e) -> {
            radiobutton = (JButton) e.getSource();
            //JOptionPane.showMessageDialog(null, radiobutton.getText());
            f.dispose();
        });
        f.add(p);
        f.setSize(600, 150);
        f.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        JRadioButton radiobutton = (JRadioButton) ae.getSource();
        lbl.setText("Selecionado: " + radiobutton.getText());
        this.setRetorno(radiobutton.getText());
    }

//    public static void main(String[] args) {
//        
//        String []v = {"oi","claro","tim","vivo"};
//        new RadioButton("Formulario","questao",v).initGui();
//        
//    }
}
