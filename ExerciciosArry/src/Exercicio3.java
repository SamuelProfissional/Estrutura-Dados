package ExerciciosArry.src;
public class Exercicio1 {
  /*3. Crie um método que receba 
    como parâmetro um número binário na forma de um
    vetor com 8 posições e retorne esse número 
    convertido para decimal.*/

public static void main(String[] args) {
        
  int[] A = new int[]{0,1,0,1,1,0,1,0};
        
  converteBinario(A);
  
}
public static int[] converteBinario(int[] B){
   
   int[] convertido = new int[8];
  
     for (int i = 0; i < B.length ; i++) {
         
   convertido[i] = B[7 - i];
   
    int resultado = convertido[i] * 2;
    
     }
   
return resultado;
}
}
