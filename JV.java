/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jogodavelha;

/**
 *
 * @author pildo
 */
public class JV {
       private String[][] m = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};      
   
      public String Mostrar(){
    for(int li=0; li<3; li++){
        for(int co=0; co<3; co++){
            System.out.print("   "+ m[li] [co]);
        }
        System.out.println("\n");
    }
    return null;
}//----------------------------------------------------------------
                           
              public boolean Valido(String p){
      for(int li=0; li<3; li++){
         for(int co=0; co<3; co++){
            if(m[li][co].equals(p))
                return true;
         }
      }
      return false;
      } //------------------------------------------
      
      public void Jogada(String p, String j){
          if(p.equals("1"))
              m[0][0] = j;
          else if(p.equals("2"))
              m[0] [1] = j;
          else if(p.equals("3"))
              m[0] [2] = j;
          else if(p.equals("4"))
              m[1] [0] = j;
          else if(p.equals("5"))
              m[1] [1] = j;
          else if(p.equals("6"))
              m[1] [2] = j;
          else if(p.equals("7"))
              m[2] [0] = j;
          else if(p.equals("8"))
              m[2] [1] = j;
          else if(p.equals("9"))
              m[2] [2] = j;
      }//-------------- Todas as posições da matriz, colunas 0, 1, 2 Número 1 ao 9
   public String Ganhou(int jogadas){
      String[] T = new String[8];
      String vencedor = "null";
      if(jogadas == 9){
       vencedor = "EMPATE";   
      }
T[0] = m[0][0] + m[0][1] + m[0][2];
T[1] = m[1][0] + m[1][1] + m[1][2];
T[2] = m[2][0] + m[2][1] + m[2][2];

T[3] = m[0][0] + m[1][0] + m[2][0];
T[4] = m[0][1] + m[1][1] + m[2][1];
T[5] = m[0][2] + m[1][2] + m[2][2];

T[6] = m[0][0] + m[1][1] + m[2][2];
T[7] = m[0][2] + m[1][1] + m[2][0];
  for(int i=0; i<T.length; i++){
   if(T[i].equals("XXX")){
       vencedor = "Jogador 1";
   }else if(T[i].equals("OOO")){
       vencedor = "Jogador 2";
   }   
  }                       
  return vencedor;      
} //------------------------------------------
}
