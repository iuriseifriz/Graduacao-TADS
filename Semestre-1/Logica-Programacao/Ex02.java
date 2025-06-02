import java.util.Random;
import java.util.Scanner;
public class Ex02 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int vetor[] = new int[20];
        int posicao = 0;
        int valor = 0;

        while (posicao < vetor.length){
            vetor[posicao] = rand.nextInt(20);
            posicao++;
        }

        posicao = 0;
        System.out.println("digite uma posicao");
        posicao = scan.nextInt();

        while (posicao < vetor.length & posicao >= 0){
            System.out.println(vetor[posicao]);
            System.out.println("digite uma posicao");
            posicao = scan.nextInt();
            }
        System.out.println("valor inválido");
        }

    }
    

