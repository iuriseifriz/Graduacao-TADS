import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Biblioteca bib = new Biblioteca();

        int i = 0;
        while (i != 5){
            //menu de opcoes
            System.out.println("\n O que deseja fazer? | 1 - Adicionar livro | 2 - Exibir livros | 3 - Emprestar livro | 4 - Devolver livro | 5 - Sair");
            i = scanner.nextInt();
            if (i == 1){ 
                bib.adicionarLivro();
            }
            if (i == 2){
                bib.exibirLista();
            }
            if (i == 3){
                bib.emprestar();
            }
            if (i == 4){
                bib.devolver();
            }
            if (i > 5 || i < 1){
                System.out.println("Opcao invalida.");
            }

        }
        System.out.println("Volte sempre (ou não).");
        scanner.close();
        
    }
}