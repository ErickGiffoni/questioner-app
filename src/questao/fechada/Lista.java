package questao.fechada;
import questao.Questao;

public class Lista extends Questao {
    
    protected String[] lista= new String[0];

    public Lista(String titulo, String Descricao) {
        super(titulo, Descricao);
    }
    
    protected void addLista(String []li){
      lista= li; 
    }
    protected String [] retLista(){
        return lista;
    } 
    
    
}
