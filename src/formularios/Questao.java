package formularios;

public class Questao {

    public String nome;
    public String enunciado;
     
    public Questao(String nome, String enunciado) {
        this.nome = nome;
        this.enunciado = enunciado;
    }
    
    public Questao(){};//construtor vazio

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }
   

    
}
