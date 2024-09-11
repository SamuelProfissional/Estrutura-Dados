package ExerciciosArry.src;

public class RecursaoExercicio2 {
    /*
     * Crie um método recursivo que receba dois números inteiros como parâmetros,
     * o primeiro será o número base e o segundo a potência, e retorne o valor da
     * função.
     */

    public static void main(String[] args) {

        System.out.println(calculaPotencia(5, 4) + " ");

    }

    public static int calculaPotencia(int a, int b) {

        if (b == 0)
            return 1;
        else
            return a * calculaPotencia(a, b - 1);

    }

}
