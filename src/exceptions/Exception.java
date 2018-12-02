/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author erick.giffoni
 */
public abstract class Exception {
    private String nome;
    public Exception(String Nome){
        this.nome = Nome;
    }//construtor da classe abstrata
    public  abstract String toString();//metodo abstrato toString
    
}//end of class Exception
