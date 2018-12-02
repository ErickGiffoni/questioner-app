/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

/**
 *
 * @author erick.giffoni
 */
public class Fechada extends Questao{
    private int numeroDeAlternativas;
    public int getNumeroDeAlternativas(){
        return this.numeroDeAlternativas;
    }
    public void setNumeroDeAlternativas(int numero){
        this.numeroDeAlternativas = numero;
    }
    
    public Fechada(){
        super();
    }//construtor vazio
    
    public Fechada(String nome, String enunciado, int numeroDeAlternativas){
        super(nome, enunciado);
        this.numeroDeAlternativas = numeroDeAlternativas;
    }
    
}
