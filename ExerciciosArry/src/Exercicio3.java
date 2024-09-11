package ExerciciosArry.src;
//import java.util.Scanner;

/**
 *
 * @author SAMUEL
 * Ok
 */
public class Exercicio3 {

    /*3. Crie um método que receba 
    como parâmetro um número binário na forma de um
    vetor com 8 posições e retorne esse número 
    convertido para decimal.*/
    public static void main(String[] args) {
        /* Scanner entrada = new Scanner(System.in);
        
        Forma Alternativa usando o Scanner para reseber o numero binario
        int c = 8;
        
        For(int r =0; r < c; r++) {
        
          System.out.println(" Digitem um numero binario de ate 8 digitos");
           A[r] = entrada.nextInt();
        }
         */

        int[] A = new int[]{0, 1, 0, 1, 1, 0, 1, 0};
        // o valor do binario convertido é 90 

        converteBinario(A);

    }

    public static int[] converteBinario(int[] B) {

        int[] convertido = new int[]{128, 64, 32, 16, 8, 4, 2, 0};
        int[] resultado = new int[8];
        int valorConvertido = 0;
        //  String[] valor = new String[1];
        // ver como somar os indices do arry
        for (int i = 0; i < B.length; i++) {

            resultado[i] = B[i] * convertido[i];
            valorConvertido = valorConvertido + resultado[i];
            //System.out.println("O valor convertido e: " + valorConvertido);
            // valor[0] = String.format("O valor convertido é: %d", valorConvertido);

        }

        System.out.println("O valor convertido e: " + valorConvertido);
        return resultado;
    }
}
