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
public class JOExclusiva extends Questao {

    private String op[] = new String[0];
    private String resposta;

    public String getResposta() {
        return resposta;
    }

    public JOExclusiva(String nome, String enunciado, String[] opcoes) {
        super(nome, enunciado);
        op = opcoes;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public void chamaGui() {
        String m = getEnunciado(), t= getNome(), op0= op[0];
        
            Object selected = JOptionPane.showInputDialog(null, m, t, JOptionPane.PLAIN_MESSAGE, null, op, op0);
        if (selected != null) {
            resposta = selected.toString();
            //do something
        } else {
            resposta = op[0];
        }
    }
//    
//       public static void main(String[] args) {
//        String[] v = {"Oi", "Vivo", "Tim", "Claro", "Nextel"};
//        JOExclusiva joe = new JOExclusiva("titulo", "operadora", v);
//        joe.chamaGui();
//           System.out.println(joe.getResposta());
//           
//           
//    }       
    
}