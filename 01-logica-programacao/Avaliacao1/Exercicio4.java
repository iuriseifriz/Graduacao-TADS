
import java.util.Scanner;

public class Exercicio4{
  public static void main(String[]args){
    Scanner in = new Scanner(System.in);


    int saque;

    System.out.println("Insira o valor que deseja sacar:");
    saque = in.nextInt();

    int nota100, nota50, nota20, nota10;
    int sobra100, sobra50, sobra20, sobra10;
    int nota5 = 0;
    int nota2 = 0;

    nota100 = saque / 100;
    sobra100 = saque % 100;
    
    nota50 = sobra100 / 50;
    sobra50 = sobra100 % 50;

    nota20 = sobra50 / 20;
    sobra20 = sobra50 % 20;

    nota10 = (sobra20 / 10);
    sobra10 = (sobra20 % 10);

    if (sobra10 == 5){
      nota5 = 1;
    }else if(sobra10 == 6){
      nota2 = 3;
    } else if (sobra10 == 7) {
      nota2 = 1;
      nota5 = 1;
    } else if (sobra10 == 8) {
      nota2 = 4;
    } else if (sobra10 == 9){
      nota5 = 1;
      nota2 = 2;
    } else if (sobra10 == 1){
      nota10 = -1;
      nota5 = 1;
      nota2 = 3;
    } else if (sobra10 == 3){
      nota10 = -1;
      nota5 = 1;
      nota2 = 4;
    }

    if (nota10 == -1){
      nota10 = 0;
    }


    System.out.println("Você recebera " + nota100 + " nota/s de 100");
    System.out.println("Você recebera " + nota50 + " nota/s de 50");
    System.out.println("Você recebera " + nota20 + " nota/s de 20");
    System.out.println("Você recebera " + nota10 + " nota/s de 10");
    System.out.println("Você recebera " + nota5 + " nota/s de 5");
    System.out.println("Você recebera " + nota2 + " nota/s de 2");

    in.close();
    
  }
}
