package exceptions;

public class AlternativasNaoInformadasException extends Exception{

    @Override
    public void Exception() {
        setNome("Alternativas não foram informadas");
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return getNome();//????
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
