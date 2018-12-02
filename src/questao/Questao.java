package questao;

public class Questao {

    public String nome;
    public String enunciado;
     
    public Questao(String nome, String enunciado) {
        this.nome = nome;
        this.enunciado = enunciado;
    }

    public String getnome() {
        return nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public String getenunciado() {
        return enunciado;
    }

    public void setenunciado(String enunciado) {
        this.enunciado = enunciado;
    }
   

    
}
