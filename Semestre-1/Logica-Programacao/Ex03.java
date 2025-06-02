//fazer um programa que pegue o valor de uma posicao num vetor com 10 valores
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int v[] = {10,9,8,7,6,5,4,3,2,1};

        for(int cont = 0 ; cont < 5 ; cont++){
                
            int posicao = scan.nextInt();
            System.out.println(v[posicao]);
            
        }
    }    
}
