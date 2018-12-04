/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class CheckBox implements ItemListener, ActionListener {

    JLabel lbl;
    JFrame f;
    JButton btn = new JButton("Confirma");
    ArrayList<String> as = new ArrayList<String>();

    public CheckBox(String FormularioNome, String Questao, String[] vetor) {
        f = new JFrame(FormularioNome);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JPanel p = new JPanel(new GridLayout(vetor.length + 3, 1));
        JCheckBox cb[] = new JCheckBox[vetor.length];

        for (int i = 0; i < vetor.length; i++) {
            cb[i] = new JCheckBox(vetor[i]);

        }
        lbl = new JLabel("Selecionado");
        p.add(new JLabel(Questao));

        for (JCheckBox cb1 : cb) {
            p.add(cb1);
        }

        p.add(lbl);
        p.add(btn);
        btn.addActionListener(this);
        for (JCheckBox cb1 : cb) {
            cb1.addItemListener(this);
        }

        f.add(p);
        f.setSize(300, 200);
        f.setVisible(true);
    }

    public void itemStateChanged(ItemEvent ie) {
        JCheckBox rb = (JCheckBox) ie.getSource();
        int state = ie.getStateChange();
        String Label = rb.getText();
        if (state == ItemEvent.SELECTED) {
            lbl.setText(Label + " marcada!");
            if (as.contains(Label)) {
            } else {
                as.add(Label);
            }
        } else {
            lbl.setText(Label + " desmarcada!");
            if (as.contains(Label)) {
                as.remove(Label);
            } else {

            }

        };

    }

    public void actionPerformed(ActionEvent ae) {
        StringBuilder sb = new StringBuilder();
        for (String al : as) {
            sb.append(al);
            sb.append("\n");
        }

        JOptionPane.showMessageDialog(null, sb);
        f.dispose();
    }

//    public static void main(String[] args) {
//        String[] v = {"Oi", "Vivo", "Tim", "Claro", "Nextel"};
//        CheckBox cb = new CheckBox("Formulario", "Operadora", v);
//    }
}
