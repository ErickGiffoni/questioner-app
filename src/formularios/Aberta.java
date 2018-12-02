package formularios;

public class Aberta extends Questao{
    
    private String respostaString;
    private int respostaInt;

    public Aberta(String respostaString, String nome, String enunciado) {
        super(nome, enunciado);
        this.respostaString = respostaString;
    }

    public String getRespostaString() {
        return respostaString;
    }

    public void setRespostaString(String respostaString) {
        this.respostaString = respostaString;
    }
    
    public int getRespostaInt() {
        return respostaInt;
    }

    public void setRespostaInt(int respostaInt) {
        this.respostaInt = respostaInt;
    }
    
}
