/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author lucas
 */
public class TextArea implements ActionListener{

    private String formulario, questao;
    JFrame f;
    JPanel p;
    JLabel textfield;
    JTextArea textarea;
    public TextArea(String formulario, String questao) {
        this.formulario = formulario;
        this.questao = questao;
    }

    public void initGui() {
        f = new JFrame(formulario);

        p = new JPanel(new BorderLayout());

        textfield = new JLabel();
        textfield.setText(questao);

        textarea = new JTextArea();
        //textarea.setText("Australia, -27, 133. AUD");

        JButton button = new JButton("Confirma");
        //button.setFont(new java.awt.Font("Dialog", 0, 15));
       // button.setBorderPainted(false);
        //button.setFocusable(false);
        //button.setForeground(new java.awt.Color(255, 255, 255));
        //button.setBackground(new java.awt.Color(0, 140, 255));
        button.addActionListener(this);
        p.add(textfield, BorderLayout.PAGE_START);
        p.add(textarea);
        p.add(button, BorderLayout.PAGE_END);

        f.setDefaultCloseOperation(f.DISPOSE_ON_CLOSE);
        f.setSize(600, 200);
        f.setLocationRelativeTo(null);
        f.add(p);
        f.setVisible(true);

    }

    public void actionPerformed(ActionEvent ae){
        String m = textarea.getText();
        if(!textarea.getText().isEmpty())
        JOptionPane.showMessageDialog(null, m, formulario, JOptionPane.PLAIN_MESSAGE);
        
        f.dispose();
    }
//    public static void main(String[] args) {
//        TextArea ta = new TextArea("titulo", "questao");
//        ta.initGui();
//
//    }

}
