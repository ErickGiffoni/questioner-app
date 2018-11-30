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
public class Pergunta {

    private String titulo;
    private String Descricao;
     

    public Pergunta(String titulo, String Descricao) {
        this.titulo = titulo;
        this.Descricao = Descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }
   

    
}
