import java.util.Scanner;

public class Lista03 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Digite uma palavra:");
    String p1 = in.next();
    System.out.println("Digite uma palavra:");
    String p2 = in.next();

    System.out.println(p1 + " " + p2);
    
    in.close();
  }
}
