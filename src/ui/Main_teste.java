package ui;

import exceptions.DescricaoObrigatoriaNaoInformadaException;
import java.util.ArrayList;
import gui.JOExclusiva;
import gui.*;
import javax.swing.JOptionPane;
import exceptions.NomeNaoInformadoException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author erick.giffoni
 */
public class Main_teste {

    private static String titulo = "QUESTIONER";
    private static String opcao1 = "Novo";
    private static String opcao2 = "Responder";
    private static String opcao3 = "Visualizar";

    public static void main(String[] args) {
        ArrayList<Object> o = new ArrayList();
        int continua=-1 ;
        String NOME =null, PERGUNTA = null;
        String []VETOR= new String[0];
        boolean acertouMizeravi = true;
        do {
            int opcao =0;
            
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null, titulo + "\n\n" + "\t" + opcao1 + " - Digite 1\n\n" + opcao2 + " - Digite 2\n\n" + opcao3 + " - Digite 3\n\nSair - Digite 0\n\n",JOptionPane.OK_OPTION));
            
            
            
            
            switch (opcao) {
                case 1://novo form
                {
                    
                    String[] op = {"CheckBox", "ComboBox", "Radio", "TextArea", "TextField"};
                    JOExclusiva joe = new JOExclusiva(titulo, "Tipo de Formulario", op);
                    
                    do{
                    joe.chamaGui();
                    String sJoe = joe.getResposta();
                    switch (sJoe) {
                        case "CheckBox": {
                            try{
                                
                            }catch(Exception e)
                            {
                            
                            }
                            finally{
                            
                            }
                            
                            break;
                        }
                        case "ComboBox": {
                            try{
                                
                            }catch(Exception e)
                            {
                            
                            }
                            finally{
                            
                            }
                            break;
                        }
                        case "TextField": {
                            try{
                                
                                NOME= JOptionPane.showInputDialog(null, "Titulo", titulo);
                                if (NOME.isEmpty()|| NOME.equals(""))
                                    throw new NomeNaoInformadoException();
                            }catch(Exception e)
                            {
                                JOptionPane.showMessageDialog(null,e.toString());
                                        
                                NOME= JOptionPane.showInputDialog(null, "Titulo", titulo);
                            }
                                
                            try{
                                PERGUNTA= JOptionPane.showInputDialog(null, "Enunciado", titulo);
                                if (PERGUNTA.isEmpty()|| PERGUNTA.equals(""))
                                    throw new DescricaoObrigatoriaNaoInformadaException();
                            }catch(Exception e)
                            {
                                 JOptionPane.showMessageDialog(null,e.toString());
                                 PERGUNTA= JOptionPane.showInputDialog(null, "Enunciado", titulo);
                            }
                            o.add(new TextField(NOME,PERGUNTA));
                            
                            NOME =null;
                            PERGUNTA =null;
                            break;
                        }
                        case "Radio": {
                            try{
                                
                                
                                
                            }catch(Exception e)
                            {
                            
                            }
                            finally{
                            
                            }
                            break;
                        }

                        case "TextArea": {
                            try{
                                
                                
                            }catch(Exception e)
                            {
                            
                            }
                            finally{
                            
                            }
                            break;
                        }
                            
                    }
                    continua =JOptionPane.showConfirmDialog(null, "Mais uma",titulo,0);
                    
                    }while(continua == JOptionPane.YES_OPTION);

                

                break;
            }
          case 2://responder form
                   {
                   for(Object o1: o)
                       o1.initGui();

                    break;
                }
                case 3://visualizar form
                    {

                    break;
                }
                    
                case 0:
                {
                    acertouMizeravi= false;
                    break;
                }   
                default:
                    {
                           JOptionPane.showMessageDialog(null, "Opção inválida\nTente novamente\n");

                    break;
                }

            }
            }while(acertouMizeravi);
    }
}

