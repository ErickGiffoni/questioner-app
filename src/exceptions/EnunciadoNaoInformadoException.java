package exceptions;

public class EnunciadoNaoInformadoException extends Exception{

    @Override
    public void Exception() {
        setNome("Enunciado não foi informado");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return getNome();//????
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
