package questao;

public class Aberta extends Questao{
    
    private String resposta;

    public Aberta(String resposta, String titulo, String Descricao) {
        super(titulo, Descricao);
        this.resposta = resposta;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }
    
    
    
}
