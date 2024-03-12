import java.util.Scanner;

public class Lista02 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int v1, v2, mais, menos, vezes;
    float dividir, resto;
    
    System.out.println("Primeiro número");
    v1 = in.nextInt();
    System.out.println("Segundo número");
    v2 = in.nextInt();

    mais = v1 + v2;
    menos = v1 - v2;
    vezes = v1 * v2;
    dividir = v1 / v2;
    resto = v1 % v2;
    System.out.println("Resultados em ordem de mais, menos,vezes e dividir");
    System.out.println(mais);
    System.out.println(menos);
    System.out.println(vezes);
    System.out.println(dividir  + " com resto igual à " + resto);
    in.close();
  }
}
