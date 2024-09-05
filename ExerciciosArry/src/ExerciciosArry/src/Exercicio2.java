package ExerciciosArry.src;

public class Exercicio2 {
    /* OK
     * 2. Crie um método que receba 3 vetores
     * com 8 posições
     * cada e retorne uma matriz
     * de 8x3 posições com os respectivos valores
     * armazenados nos vetores.
     */

    public static void main(String[] args) {
        int[] matrizA = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
        int[] matrizB = new int[] { 9, 10, 11, 12, 13, 14, 15, 16 };
        int[] matrizC = new int[] { 17, 18, 19, 20, 21, 22, 23, 24 };
        newArry(matrizA, matrizB, matrizC);

    }

    public static int[][] newArry(int[] A, int[] B, int[] C) {

        int[][] arrys = new int[8][3];
        for (int linha = 0; linha < 8; linha++) {

            arrys[linha][0] = A[linha];
            arrys[linha][1] = B[linha];
            arrys[linha][2] = C[linha];
            for (int i = 0; i < 8; i++) {
                for (int indc = 0; indc < 8; indc++) {
                    System.out.println("[" + arrys[indc][0] + "]" + "[" + arrys[indc][1] + "}" + "[ " + arrys[indc][2]
                            + "] " + "\n ");
                }
            }

        }
        return arrys;

    }
}
