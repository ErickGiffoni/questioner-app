package ui;


import javax.swing.JOptionPane;


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
    public static void main(String[] args){
        boolean acertouMizeravi = true;
        do{
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, titulo+ "\n\n"+ "\t" + opcao1 + " - Digite 1\n\n"+ opcao2 + " - Digite 2\n\n" + opcao3+" - Digite 3\n\n"));
        switch(opcao){
            case 1://novo form
                break;
            case 2://responder form
                break;
            case 3://visualizar form
                break;
            default:
                acertouMizeravi = false;
                JOptionPane.showMessageDialog(null, "Opção inválida\nTente novamente\n");
        }
        }while(!acertouMizeravi);
    }
}
