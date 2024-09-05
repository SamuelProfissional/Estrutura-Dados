package ExerciciosArry.src;

public class Exercicio5 {

    //Não consegui fazer
    /*Escreva um método que receba dois vetores 
    de 5 números cada, 
    gere um terceiro vetor
    com os elementos dos outros dois vetores intercalados.
    Exemplo: vetor 1º ={A,B,C,D,E} | 2º={1,2,3,4,5} |
    3º={A,1,B,2,C,3,D,4,E,5}*/
    public static void main(String[] args) throws Exception {

        String[] a = new String[]{"A", "B", "C", "D", "E"};
        String[] b = new String[]{"1", "2", "3", "4", "5"};
        juntaVetor(a, b);

    }

    public static String[] juntaVetor(String[] c, String[] d) {

        String[] juntar = new String[10];
        String[] jun = new String[10];
        for (int i = 0; i < 10; i++) {

            for (int j = 1; j < 10; j++) {

                for (int linha = 0; linha < 5; linha++) {

                    juntar[i + 2] = c[linha];
                    juntar[j + 2] = d[linha];
                    jun[i] = juntar[i];
                    //System.out.print(juntar[i] + " ");
                    for (int l = 0; l < 10; l++) {
                        System.out.print(juntar[l] + " ");
                    }
                }

            }
        }
        // ainda da erro para imprimir
       // System.out.print(juntar[0] + " " + juntar[1] + " " + " " + juntar[2] + " "+ " " + juntar[3] + " "+ " " + juntar[4] + " "+ " " + juntar[5] + " " );
        return jun;

    }

}
