public class EnunciadoNaoInformadoException extends Exception{

protected String nome;
public EnunciadoNaoInformadoException(String nome){
    super();
    if(nome.isEmpty())
        this.nome =nome;


}
public String toString(){
    return "Enunciado classe  "+nome+" nao informada";
}

}