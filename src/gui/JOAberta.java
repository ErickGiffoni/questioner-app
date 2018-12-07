/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import formularios.Questao;
import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class JOAberta extends Questao {
    private String resposta;

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }
    public JOAberta(String nome, String enunciado) {
        super(nome, enunciado);
    }
    public void initGui(){
        String tmp;
        String e = getEnunciado(), t= getNome();
        tmp = JOptionPane.showInputDialog(null, e, t, JOptionPane.PLAIN_MESSAGE);
        setResposta(tmp);
    }
    
//    public static void main(String[] args) {
//        JOAberta joa = new JOAberta("titulo","seu nome");
//        joa.chamaGui();
//        System.out.println(joa.getResposta());
//    }
            
}
