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
public abstract class Exception extends java.lang.Exception{
    private String nome;
    public abstract void Exception(String Nome);//construtor da classe abstrata
    public  abstract String toString();//metodo abstrato toString
    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String Nome){
        this.nome = Nome;
    }
    
}//end of class Exception
