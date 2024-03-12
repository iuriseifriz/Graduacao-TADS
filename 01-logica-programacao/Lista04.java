import java.util.Scanner;
public class Lista04 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int ascii;
    char letra, maiuscula;

    System.out.println("Digite um caractere");
    letra = in.next() .charAt(0);
    ascii = (int) letra;
    maiuscula = (char) (ascii - 32);
    System.out.println(Character.SIZE);
    System.out.println(Integer.SIZE);

    System.out.println("");


    in.close();
  }
}
