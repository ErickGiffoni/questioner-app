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
public class NomeNaoInformadoException extends Exception{

    @Override
    public void Exception() {
        setNome("Nome não foi informado.");
    }

    @Override
    public String toString() {
        return getNome();//????
    }
    
}
