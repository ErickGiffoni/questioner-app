package questao.fechada;

public class ListaEscolha extends Lista{

    private String [] escolhas = new String[0];
    
    public ListaEscolha(String titulo, String Descricao) {
        super(titulo, Descricao);
    }

    public String[] getEscolhas() {
        return escolhas;
    }
    
    
    
}
