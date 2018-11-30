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
public class Exclusiva extends Lista {

    private int escolha = 0;

    public Exclusiva(String titulo, String Descricao) {
        super(titulo, Descricao);
    }

    public String getEscolha() {
        return lista[escolha];
    }

}
