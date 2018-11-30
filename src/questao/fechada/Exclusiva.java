package questao.fechada;

public class Exclusiva extends Lista {

    private int escolha = 0;

    public Exclusiva(String titulo, String Descricao) {
        super(titulo, Descricao);
    }

    public String getEscolha() {
        return lista[escolha];
    }

}
