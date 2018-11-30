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
public class Aberta extends Pergunta{
    
    private String resposta;

    public Aberta(String resposta, String titulo, String Descricao) {
        super(titulo, Descricao);
        this.resposta = resposta;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }
    
    
    
}
