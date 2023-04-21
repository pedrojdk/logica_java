import java.util.Scanner;

public class exercicio4 {
  public static void main(String[] ars) {

   Scanner sc = new Scanner(System.in);

    int A, B, C, D, ab, cd, sum;


    System.out.println("Digite 2 valores inteiros: ");

     A = sc.nextInt();
     B = sc.nextInt();
     ab = A * B;

     System.out.println("Agora, digite + 2 valores inteiros: ");

     C = sc.nextInt();
     D = sc.nextInt();
     cd = C * D;
    
     sum = ab - cd;

    System.out.println("A diferença entre os 4 valores digitados é: = " + sum);




   sc.close();

  }
}
