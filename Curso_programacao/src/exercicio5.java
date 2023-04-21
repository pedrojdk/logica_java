import java.util.Scanner;
import java.util.Locale;

public class exercicio5 {
  public static void main(String [] args) {


    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);

    int n, ht;
    double sh, salario, mes;

    System.out.println("DIgite o seu número: ");

    n = sc.nextInt();

    System.out.println("Digite o valor de horas trabalhadas: ");

    ht = sc.nextInt();

    System.out.println("Digite o seu salário por hora: ");

    sh = sc.nextDouble();

    salario = ht * sh;

    mes = salario * 22;

    System.out.println("Number: " + n);
    System.out.printf("Diary salary = U$ %.2f%n", salario);
    System.out.printf("Mensal salary = U$ %.2f%n ", mes);
    






    sc.close();

  }
}
