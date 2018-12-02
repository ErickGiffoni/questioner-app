package exceptions;

public class RespostaNaoSelecionadaException extends Exception{
    
    @Override
    public String toString() {
        return getNome();// ????
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Exception() {
        setNome("Resposta não foi selecionada");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
