package formularios;

public class Alternativa extends Lista{

    //private String [] escolhas = new String[0];
    
    //public ListaEscolha(String titulo, String Descricao) {
     //   super(titulo, Descricao);
   // }

    //public String[] getEscolhas() {
     //   return escolhas;
    //}
    private int contadorDeRespostas;
    private int[] posicoesDasRespostas;
    private String[] respostas;
    
    public int getContadorDeRespostas(){
        return this.contadorDeRespostas;
    }//end of getContadorDeRespostas
    
    public void setContadorDeRespostas(int numeroDeRespostas){
        this.contadorDeRespostas = numeroDeRespostas;
    }//end of setContadorDeRespostas
    
    public int[] getPosicoesDasRespostas(){
        return this.posicoesDasRespostas;
    }//end of getPosicoesDasRespostas
    
    public void setPosicoesDasRespostas(int [] posicoes, int quantidadeDeRespostas){
        this.posicoesDasRespostas = posicoes;//aponta para o vetor de posicoes 
        setContadorDeRespostas(quantidadeDeRespostas);
    }//end of setPosicoesDasRespostas
    
    public String[] getRespostas(){
        return this.respostas;
    }//end of getRespostas
    
    public void setRespostas(int [] posicoesDasRespostas){
        this.respostas = new String[posicoesDasRespostas.length];//respostas tem a quantidade de posicoes.lenght
        for(int i=0; i< posicoesDasRespostas.length; i++){
            this.respostas[i] = getAlternativas(posicoesDasRespostas[i]);//pega a alternativa na posicao indicada pelo vetor de posicoes das respostas
        }//for percorre posicoes e respostas
    }
    
}
