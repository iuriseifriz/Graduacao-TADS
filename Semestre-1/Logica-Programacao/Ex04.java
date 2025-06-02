import java.util.Scanner;
public class Ex04 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        
        // QUAL O VALOR QUE MAIS APARECE NO VETOR E QUANTAS VEZES?

        int vetor[] = { 1, 1, 1, 2, 2, 4, 4, 4, 5, 6, 6, 6, 7, 8, 8, 8, 8};
        int cVetor[] = new int[vetor.length];
        int valorPosicao = 0;

        for(int cont = 0 ; cont < vetor.length ; cont++){
            valorPosicao = vetor[cont];
            cVetor[valorPosicao] =  cVetor[valorPosicao] + 1;
        }

        /* 
        for(int i = 0 ; i < cVetor.length ; i++){
            
            System.out.println("O valor " + i + " apareceu " + cVetor[i] + " vezes");
        }
        */

        int valorMaior = 0;
        int quantMaior = cVetor[0];

        for (int i = 0; i < cVetor.length; i++){
            if (cVetor[i] > quantMaior){
                valorMaior = i;
                quantMaior = cVetor[i];
            }
        }
        System.out.println("O valor " + valorMaior + " apareceu mais vezes. Ele apareceu " + quantMaior + " vezes.");
    }
}
