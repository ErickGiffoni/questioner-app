package exceptions;

public abstract class Exception extends java.lang.Exception{
    private String nome;
    public abstract void Exception();//construtor da classe abstrata
    public  abstract String toString();//metodo abstrato toString
    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String Nome){
        this.nome = Nome;
    }
    
}
