package exceptions;

public class DescricaoObrigatoriaNaoInformadaException extends Exception{

    @Override
    public void Exception(String Nome) {
        setNome("Descrição obrigatória não foi informada");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return getNome();//????
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
