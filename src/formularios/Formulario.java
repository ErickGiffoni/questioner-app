/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import java.text.SimpleDateFormat;

/**
 *
 * @author erick.giffoni
 */
public class Formulario {
    private String nome;
    private String descricao;
    private SimpleDateFormat dataDeInicio;
    private SimpleDateFormat dataDeTermino;
    public Questao[] questoes;//um formulario tem varias questoes
    
    public Formulario(){};//construtor simples
    public Formulario(String nome, String description, SimpleDateFormat dataInicial, SimpleDateFormat dataFinal){
        setNome(nome); setDescricao(description);
        setDataDeInicio(dataInicial); setDataDeTermino(dataFinal);
    }
    
    public String getNome(){
        return this.nome;
    }//end of getNome
    

    public void setNome(String nome) {
        this.nome = nome;
    }//end of setNome

    public String getDescricao(){
        return this.descricao;
    }//end of getDescricao
    
    public void setDescricao(String description) {
        this.descricao = description;
    }//end of setDescricao
    
    public SimpleDateFormat getDataDeInicio(){
        return this.dataDeInicio;
    }//end of getDataDeInicio

    public void setDataDeInicio(SimpleDateFormat dataInicial) {
        this.dataDeInicio = dataInicial;
    }//end of setDataDeInicio
    
    public SimpleDateFormat getDataDeTermino(){
        return this.dataDeTermino;
    }//end of getDataDeTermino

    public void setDataDeTermino(SimpleDateFormat dataFinal) {
        this.dataDeTermino = dataFinal;
    }//end of setDataDeTermino
}
