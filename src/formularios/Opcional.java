/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import javax.swing.JOptionPane;
import exceptions.QuantidadeInsuficienteDeAlternativasException;

/**
 *
 * @author erick.giffoni
 */
public class Opcional extends Lista{
    public Opcional(){super();};//construtor simples
    public Opcional(String nome, String enunciado, int numeroDeAlternativas){
        try{
            if(numeroDeAlternativas < 2){
                throw new QuantidadeInsuficienteDeAlternativasException();
            }
            else{
                setNome(nome); setEnunciado(enunciado); setNumeroDeAlternativas(numeroDeAlternativas);
            }
        }catch(QuantidadeInsuficienteDeAlternativasException e){
            JOptionPane.showMessageDialog(null, "A quantidade de alternativas desejada é insuficiente. Tente novamente");
        }
    }//end of construtor robusto
}
