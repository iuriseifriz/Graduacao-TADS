//se a > b, trocar os valores

import java.util.Scanner;

public class TrocaAsVezes { 
  public static void main(String[]args){
    Scanner in = new Scanner(System.in);

    int a, b, c;


    System.out.println("informe valor original de A");
    a = in.nextInt();

    System.out.println("informe valor original de B");
    b = in.nextInt();

    System.out.println("Valores originais: A = " + a + " B = " + b);

    if (a > b){
      c = a;
      a = b;
      b = c;
    }

    System.out.println("Valor após (talvez) verificar se há troca: A = " + a + " B = " + b);

    in.close();

  }
}