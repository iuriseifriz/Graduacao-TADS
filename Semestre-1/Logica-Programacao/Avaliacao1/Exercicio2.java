
import java.util.Scanner;

public class Exercicio2 {
  public static void main(String[]args){
    Scanner in = new Scanner(System.in);

    int HoraInicio, HoraFim, resultado;

    System.out.println("insira hora de inicio:");
    HoraInicio = in.nextInt();

    System.out.println("insira hora de fim:");
    HoraFim = in.nextInt();

    if(HoraInicio < HoraFim){
      resultado = HoraFim - HoraInicio;
    } else {
      resultado = HoraFim + ((HoraInicio - 24) * -1); 
    }
    System.out.println(resultado + " horas de jogo");

    in.close();

  }
  
}
