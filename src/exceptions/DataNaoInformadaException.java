package exceptions;

public class DataNaoInformadaException extends Exception{

    @Override
    public void Exception() {
        setNome("Data não foi informada");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return getNome();//????
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
