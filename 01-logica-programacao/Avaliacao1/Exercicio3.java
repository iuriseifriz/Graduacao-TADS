import java.util.Scanner;

public class Exercicio3 {
  public static void main(String[]args){
    Scanner in = new Scanner(System.in);

    int idade;

    System.out.println("insira a idade do nadador:");
    idade = in.nextInt();

    if(idade > 60 || idade < 4){
      System.out.println("Impossivel realizar classificacao");
    } else if (idade > 17){
      System.out.println("Adulto");
    } else if (idade > 13){
      System.out.println("Juvenil");
    } else if (idade > 8){
      System.out.println("Infantil");
    } else if (idade < 9){
      System.out.println("Mirim");
    }

    in.close();

  }
}
