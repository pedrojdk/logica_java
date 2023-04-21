import java.util.Locale;

public class funcoes_matematica {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    
    double x = 25;
    double y = 4.0;
    double z = -5.0;
    double A, B, C;

    A = Math.sqrt(x + 39);
    B = Math.sqrt(y);
    C = Math.sqrt(25.0);

    System.out.println("Raiz quadrada de " + x + " = " + A);
    System.out.println("Raiz quadrada de " + y + " = " + B);
    System.out.println("Raiz quadrada de 25 = " + C);


    A = Math.pow(x, y);
    B = Math.pow(x, 2.0);
    C = Math.pow(5.0, 2.0);

    System.out.println(x + " elevado a " + y + " = a " + A);
    System.out.println(x + " elevado ao quadrado = " + B);
    System.out.println("5 elevado ao quadrado = " + C);


    A = Math.abs(y);
    B = Math.abs(z);

    System.out.println("O valor absoluto de " + y + " é = " + A);
    System.out.println("O valor absoluto de " + z + " é = " + B);





    //formula -b +- raiz de delta / 2.a
    //delta = b pow 2 - 4.a.c

    //delta = Math.pow(b, 2.0) - 4.a.c
    //x1 = (-b + Math.pow(delta)) / (2.0 . a);
    //x2 = (-b - Math.pow(delta)) / (2.0 . a);


}


}
