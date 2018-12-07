/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ComboBox implements ItemListener, ActionListener {

    JComboBox<String> cb;
    JLabel lbl;
    JFrame f;
    JButton jbtn = new JButton("ok");
   private String retorno,formulario,pergunta;
   private String[] vetor= new String[0];

    public String getRetorno() {
        return retorno;
    }

    public void setRetorno(String retorno) {
        this.retorno = retorno;
    }

    public ComboBox(String formulario, String pergunta,String [] vetor) {
        this.formulario = formulario;
        this.pergunta = pergunta;
        this.vetor = vetor;
    }
   
    public void initGui(){
        f = new JFrame(formulario);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setLayout(new FlowLayout(FlowLayout.LEFT));
        cb = new JComboBox<>();
        lbl = new JLabel(pergunta);

        for (String s : vetor) {
            cb.addItem(s);
        }
       
        f.add(lbl);
        f.add(cb);
        
        jbtn.addActionListener(this);
        f.add(jbtn);
        cb.addItemListener(this);
        f.setSize(600, 150);
        f.setVisible(true);

    
    }
    public void itemStateChanged(ItemEvent ie) {
       Object item = cb.getSelectedItem();
        lbl.setText("selecionado: " + item);
        this.setRetorno(cb.getSelectedItem().toString());
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        if(s.equals("ok"))
        {
            String r;
            r = pergunta +" "+ cb.getSelectedItem();
            JOptionPane.showMessageDialog(null,r );
            f.dispose();
        }
       
    }
    
//    public static void main(String[] args) {
//        String[] v = {"oi", "claro", "tim", "vivo"};
//        ComboBox comboBox = new ComboBox("formulario", "Qual é a sua operadoratelefonica", v);
//        comboBox.initGui();
//    }


}
