import java.util.Scanner;

public class Ex01 {
        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);

            //int numero[] = new int[6];

            int numero[] = {2,6,9,4,7,5};
            int cont = 0;

            for(cont = 0 ; cont < 6 ; cont++){
                if(numero[cont] % 2 == 0){
                    System.out.println("O numero " + numero[cont] + " é par.");
                }else{
                    System.out.println("o numero " + numero[cont] + " é impar");
            }


        }
        
    }
}