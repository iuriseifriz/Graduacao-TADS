import java.util.Scanner;

public class ConversaoTempo {

  public static void main(String[]args){
    Scanner in = new Scanner(System.in);

    int segundos;

    int hh;
    int mm;
    int ss;
    int resto;


    System.out.println("insira um numero em segundos: ");
    segundos = in.nextInt();

    hh = segundos / 3600;

    resto = segundos % 3600;

    mm = resto / 60;
    ss = resto % 60;



    System.out.printf("\n\t %02d : %02d : %02d\n\n", hh, mm, ss );

  }
  
}
