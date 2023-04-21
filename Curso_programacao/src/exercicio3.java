import java.util.Locale;
import java.util.Scanner;

public class exercicio3 {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    
    double raio, A, pi = 3.14159; 

    raio = sc.nextDouble();
    A = pi * raio;
    

    
    System.out.printf("A = %.4f%n ", A);








    sc.close();

  }
}
