package formularios;

import exceptions.PosicaoInvalidaException;
import javax.swing.JOptionPane;

public class Lista extends Fechada {
    
    private String[] alternativas= new String[0];
    private String resposta;
    private boolean respostaFoiSelecionada = false;//a principio nao tem nenhuma resposta selecionada

    public Lista(String nome, String enunciado, int numeroDeAlternativas) {
        super(nome, enunciado, numeroDeAlternativas);
    }
    
    public Lista(){};//construtor simples
    
    public String getAlternativas(int posicao){
        try{
            if(posicao > alternativas.length -1 ){//se a posicao for 4 e o tamanho de alternativas seja 4, por exemplo, nao existe posicao 4
                throw new PosicaoInvalidaException();
            }
            else{
                return alternativas[posicao];
            }
        }catch(PosicaoInvalidaException e){
            JOptionPane.showMessageDialog(null, "Posicao informada é inválida. Tente novamente");
            return "";//retorna string vazia
        }
        
    }//end of getAlternativas
    
    public void setAlternativas(String alternativa, int posicaoParaInserir){
        try{
           if(posicaoParaInserir > alternativas.length -1 ){//se a posicao for 4 e o tamanho de alternativas seja 4, por exemplo, nao existe posicao 4
                throw new PosicaoInvalidaException();
            }
            else{
                this.alternativas[posicaoParaInserir] = alternativa;
           }
        }catch(PosicaoInvalidaException e){
            JOptionPane.showMessageDialog(null, "Posição informada é inválida. Tente novamente");
        }
    }//end of setAlternativas
    
    public String getResposta(){
        return this.resposta;
    }//end of getResposta
    
    public void setResposta(String resposta){
        this.resposta = resposta;
    }//end of setResposta
    
    public boolean getRespostaFoiSelecionada(){
        return this.respostaFoiSelecionada;
    }//end getRespostaFoiSelecionada
    
    public void setRespostaFoiSelecionada(boolean simOuNao){
        this.respostaFoiSelecionada = simOuNao;
    }//end of setRespostaFoiSelecionada
    
    protected void addLista(String []li){
      alternativas= li; 
    }
    protected String [] retLista(){
        return alternativas;
    } 
    
    
}
