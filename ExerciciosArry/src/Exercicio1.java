package ExerciciosArry.src;

public class Exercicio1 {

    // OK
    // 1. Crie um método que receba 1 vetor com 8 posições,
    // inverta a ordem dos itens e
    // retorne o vetor invertido.
    public static void main(String[] args) {
        int[] matrizA = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };

        inverteArry(matrizA);

    }

    public static int[] inverteArry(int[] A) {

        int[] arry = new int[8];

        for (int i = 0; i < A.length; i++) {

            arry[i] = A[7 - i];
            System.out.println(arry[i]);
        }
        return arry;
    }

}