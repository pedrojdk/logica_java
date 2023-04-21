import java.util.Scanner; 
import java.util.Locale;

public class exercicio6 {
  public static void main(String [] args) {

    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);

    int codigo1, codigo2, np1, np2;
    double vu1, vu2, soma1, soma2, somat;

    System.out.println("Digite o código da peça: ");
    codigo1 = sc.nextInt();

    System.out.println("Digite o número de peças: ");
    np1 = sc.nextInt();

    System.out.println("Digite o valor de cada peça: ");
    vu1 = sc.nextDouble();

    soma1 = np1 * vu1;
    System.out.printf("O valor das peças 1 = %.2f%n ", soma1);
    


    System.out.println("Digite o código da peça: ");
    codigo2 = sc.nextInt();

    System.out.println("Digite o número de peças: ");
    np2 = sc.nextInt();

    System.out.println("Digite o valor de cada peça: ");
    vu2 = sc.nextDouble();

    soma2 = np2 * vu2;
    System.out.printf("O valor das peças 2 = %.2f%n ", soma2);


    somat = soma1 + soma2;

    System.out.printf("O valor total pagar = %.2f%n ", somat);

  














    sc.close();

  }
}
