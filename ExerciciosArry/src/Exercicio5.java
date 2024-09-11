package ExerciciosArry.src;

public class Exercicio5 {

    /* OK
    Escreva um método que receba dois vetores 
    de 5 números cada, 
    gere um terceiro vetor
    com os elementos dos outros dois vetores intercalados.
    Exemplo: vetor 1º ={A,B,C,D,E} | 2º={1,2,3,4,5} |
    3º={A,1,B,2,C,3,D,4,E,5}
    letras 0,2,4,6,8
    numeros 1,3,5,7,9*/
    public static void main(String[] args) throws Exception {

        String[] a = new String[]{"A", "B", "C", "D", "E"};
        String[] b = new String[]{"1", "2", "3", "4", "5"};
        juntaVetor(a, b);

    }

    public static String[] juntaVetor(String[] c, String[] d) {

        String[] juntar = new String[10];

        for (int i = 0; i < 10; i++) {

            for (int j = 1; j < 10; j++) {

                for (int linha = 0; linha < 5; linha++) {

                    juntar[i] = c[linha];
                    i = i + 2;
                    juntar[j] = d[linha];
                    j = j + 2;

                }

            }

        }
        for (int a = 0; a < 10; a++) {

            System.out.print(juntar[a] + " ");
        }
        return juntar;
    }


}
