package questao;

public class Questao {

    private String titulo;
    private String Descricao;
     
    public Questao(String titulo, String Descricao) {
        this.titulo = titulo;
        this.Descricao = Descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }
   

    
}
