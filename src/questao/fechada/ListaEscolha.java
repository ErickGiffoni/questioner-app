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
public class ListaEscolha extends Lista{

    private String [] escolhas = new String[0];
    
    public ListaEscolha(String titulo, String Descricao) {
        super(titulo, Descricao);
    }

    public String[] getEscolhas() {
        return escolhas;
    }
    
    
    
}
