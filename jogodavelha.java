package com.mycompany.jogodavelha;
import java.util.Scanner;

public class Jogodavelha {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        JV jogo = new JV ();
        String posicao;
        int valida = 0, Jogadas = 0;
        
        while(true){//while infinito
            System.out.println(": : : : Jogo da velha : : : : :");
            jogo.Mostrar();
            
            do{//Inicia jogador 1
                System.out.println("Jogador 1, informe uma posição:");
                posicao = ler.next();
                while(!jogo.Valido(posicao)){
                    System.out.println("Jogada inválida, tente novamente!");
                    System.out.println("Jogador 1, informe uma posição");
                    posicao = ler.next();
                    valida = 0;
                }
                jogo.Jogada(posicao, "X");
                valida = 1;
                
            }while(valida == 0);//fim jogador 1
            
            Jogadas++; 
            valida = 0; //Verificar se o jogador 1 ganhou ou não
            jogo.Mostrar();
            if(!jogo.Ganhou(Jogadas).equals("null")){
                break; //quebrar o while infinito 
            }
            
            do{//Inicia jogador 2
                System.out.println("Jogador 2, informe uma posição:");
                posicao = ler.next();
                while(!jogo.Valido(posicao)){
                    System.out.println("Jogada inválida, tente novamente!");
                    System.out.println("Jogador 2, informe uma posição");
                    posicao = ler.next();
                    valida = 0;
                }
                jogo.Jogada(posicao, "O");
                valida = 1;
                
            }while(valida == 0);//fim jogador 2
            
            Jogadas++; 
            valida = 0; //Verificar se o jogador 2 ganhou ou não
            jogo.Mostrar();
            if(!jogo.Ganhou(Jogadas).equals("null")){//Ou achou o vencedor ou da empate
                break; //quebrar o while infinito 
            }
            
        } //-----------------------------------------------------------
        System.out.println("O "+jogo.Ganhou(Jogadas)+" Venceu!");
        
    }
}
