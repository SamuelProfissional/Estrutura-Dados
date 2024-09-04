package ExerciciosArry.src;
public class Arry {
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] A = new int[5];
        
        
        int[]  B  = new int[5];
        
        for(int i = 0; i < A.length; i ++){
            
            A[i] = i+1;
            B[i] = A[i];
            
            System.out.println("Vetor A: " + A[i] + " ");
             System.out.println("Vetor B: " + B[i] + " ");
        }
}
}
