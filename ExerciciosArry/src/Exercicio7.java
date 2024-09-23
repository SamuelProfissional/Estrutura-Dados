package ExerciciosArry.src;

public class Exercicio7 {
  
 /*OK
Crie um método que dado uma matriz [3x2] 
gere sua equivalente [2x3] transposta.
Conforme exemplo, utilize o algoritmo do exercício 6
para imprimir a matriz
original e a transposta.

   matriz [3x2]  
      0 1
    0 a f
    1 b e
    2 c d
    
    matriz [2x3] 
      0 1 2 
    0 a b c
    1 f e d
    
     */
    public static void main(String[] args) {
        //    matriz [3x2] 
        String[][] a = new String[][]{{"a", "f"}, {"b", "e"}, {"c", "d"}};
        mudaMatriz(a);

    }

    public static String[][] mudaMatriz(String[][] matriz) {

        String[][] convertido = new String[2][3];

        for (int l = 0; l < 2; l++) {

            for (int c = 0; c < 3; c++) {
                convertido[l][c] = matriz[c][l];

            }

        }
        for (int c = 0; c < 3; c++) {

            System.out.println(convertido[0][c] + " " + convertido[1][c] + " ");

        }

        return convertido;
    }
}
