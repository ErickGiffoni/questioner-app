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
   
    public ComboBox(String formulario, String pergunta, String[] vetor) {
        f = new JFrame(formulario);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setLayout(new FlowLayout(FlowLayout.CENTER));
        cb = new JComboBox<>();
        lbl = new JLabel(pergunta);

        for (String s : vetor) {
            cb.addItem(s);
        }
       
        f.add(cb);
        f.add(lbl);
        jbtn.addActionListener(this);
        f.add(jbtn);
        cb.addItemListener(this);
        f.setSize(300, 150);
        f.setVisible(true);

    }

    public void itemStateChanged(ItemEvent ie) {
       Object item = cb.getSelectedItem();
        lbl.setText("selecionado: " + item);
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        if(s.equals("ok"))
        {
            JOptionPane.showMessageDialog(null, cb.getSelectedItem());
            f.dispose();
        }
    }
    
//    public static void main(String[] args) {
//        String[] v = {"oi", "claro", "tim", "vivo"};
//        ComboBox comboBox = new ComboBox("formulario", "sua operadora", v);
//    }


}
