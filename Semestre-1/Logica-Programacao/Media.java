import java.util.Scanner;

public class Media {
    public static void main(String[] args){
        //declarar o scanner
        Scanner in;

        //inicializar scanner
        in = new Scanner(System.in);

        //variavel
        String apelido;

        //declarar multiplas variaveis separadas por virgula com mesmo tipo
        //int => valor inteiro
        int v1, v2;

        System.out.print("Qual seu apelido? ");
        apelido = in.next();
        System.out.println("Bem vindo, " + apelido + ". Fique a vontade.");

        System.out.println(apelido + ", por favor informe dois numeros");

        v1 = in.nextInt();
        v2 = in.nextInt();

        System.out.println("os valores sao ");
        System.out.println("v1 =>" + v1);
        System.out.println("v2 =>" +v2);
    }
}