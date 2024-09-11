import java.util.Scanner;

public class Ex05 {
        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);


            
            System.out.println("Digite uma palavra:");
            String palavString = scan.next();
            char letras[] = palavString.toCharArray();
            char letrasReverso[] = new char[letras.length];
            
            int posicao = 0;

            
            System.out.println("Palavra selecionada:");
            System.out.println(palavString);
            System.out.println("Palavra invertida:");

            for (int i = letras.length -1; i > -1 ; i--){
                letrasReverso[posicao] = letras[i];
                System.out.print(letras[i]);
                posicao++;
            }

            System.out.println();

            int checadorPalavra = 0;

            for (int i = 0; i < letras.length ; i++){
                if(letras[i] == letrasReverso[i]){
                    checadorPalavra++;
                }
            }

            if(checadorPalavra == letras.length){
                System.out.println("Palavra é palindromo");
            }
            else{
                System.out.println("Palavra não é palindromo");

            }
        }

}
