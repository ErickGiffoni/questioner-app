/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fomulario;

/**
 *
 * @author lucas
 */
public class Lista extends Pergunta {
    
    protected String[] lista= new String[0];

    public Lista(String titulo, String Descricao) {
        super(titulo, Descricao);
    }
    
    protected void addLista(String []li){
      lista= li; 
    }
    protected String [] retLista(){
        return lista;
    } 
    
    
}
