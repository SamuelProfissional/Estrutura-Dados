package ExerciciosArry.src;

public class Exercicio6 {
  //Não consegui fazer impreção
  /*Escreva um método para imprimir no console uma matriz de 2 dimensões. Utilize
o seguinte padrão.
| X | X | X |
| Y | Y | Y |
| Z | Z | Z |
Utilize System.out.print( “|” + ”\t” + variável + “\t” + “|”) para imprimir no console os
marcadores com o espaço TAB entre eles.*/
public static void main(String[] args) {

  String[][] matriz = new String[][]{{" X", "X ", "X "}, {"Y ", "Y ", "Y "}, {"Z ", "Z ", "Z"}};

  imprimir(matriz);

}

public static String[][] imprimir(String[][] A) {

  String[][] arrys = new String[3][3];
  for (int linha = 0; linha < 3; linha++) {

      arrys[0][linha] = A[0][linha];
      arrys[1][linha] = A[1][linha];
      arrys[2][linha] = A[2][linha];
      for (int i = 0; i < 8; i++) {
          //"|" + "\t" + variável + "\t" + "|");
          for (int indc = 0; indc < 3; indc++) {
              System.out.println("|" + "\t" + arrys[indc][indc] + "\t" + "|");

          }

      }

  }
  return arrys;
}
}
