import java.util.Scanner;

public class Lista01 {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    int  inteiro;
    float  decimal;

    System.out.println("número inteiro: ");
    inteiro = in.nextInt();
    System.out.println("número decimal: ");
    decimal = in.nextFloat();

    float inteir = (float) inteiro;

    int decima  = (int) (decimal);

    System.out.println(inteir);
    System.out.println(decima);

    in.close();
  }
}
