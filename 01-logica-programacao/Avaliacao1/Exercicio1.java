import java.util.Scanner;

public class Exercicio1{
  public static void main(String[]args){
    Scanner in = new Scanner(System.in);

    float comprimento, largura, altura;
    double resultado;

    System.out.println("insira comprimento:");
    comprimento = in.nextInt();

    System.out.println("insira largura:");
    largura = in.nextInt();

    System.out.println("insira altura:");
    altura = in.nextInt();

    resultado = (((altura * largura) * 2) + ((altura * comprimento) * 2)) / 1.5;

    System.out.println("Sera necessario " + resultado + "caixas de azulejos");

    in.close();

  }
}