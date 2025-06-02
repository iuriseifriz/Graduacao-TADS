import java.util.Scanner;

public class Exercicio5 {
  public static void main(String[]args){
    Scanner in = new Scanner(System.in);

    float media, nota1, nota2, nota3;

    System.out.println("insira a primeira nota");
    nota1 = in.nextFloat();

    System.out.println("insira a segunda nota");
    nota2 = in.nextFloat();

    System.out.println("insira a terceira nota");
    nota3 = in.nextFloat();

    media = (nota1 + nota2 + nota3) / 3; 

    if(media >= 9){
      System.out.println("Conceito: A");
    } else if (media >= 7.5){
      System.out.println("Conceito: B");
    } else if (media >= 6){
      System.out.println("Conceito: C");
    } else {
      System.out.println("Conceito: D");
    }

    System.out.println("media:" + media);

    in.close();
  }
}