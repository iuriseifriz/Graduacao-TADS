import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {

    //cria o scanner, pra poder usar inputs
    Scanner scanner = new Scanner(System.in);
    //cria a lista pra botar livros dentro
    ArrayList<Livro> livros = new ArrayList<>();
    
    

    public void adicionarLivro(){
        Livro novoLivro = new Livro();
        //add titulo
        System.out.println("Digite o titulo: ");
        String novoTitulo = scanner.nextLine();
        novoLivro.setTitulo(novoTitulo);

        //add autor
        System.out.println("Digite o nome do autor: ");
        String novoAutor = scanner.nextLine();
        novoLivro.setAutor(novoAutor);

        //setar disponibilidade
        boolean novoDisponivel = true;  
        novoLivro.setDisponivel(novoDisponivel);

        livros.add(novoLivro);
    };

    public void exibirLista(){
        int i = 0;
        while (i < livros.size()){
            System.out.println("");
            System.out.println(livros.get(i));
            System.out.println("Codigo: " + i);
            i++;
            System.out.println("");
        }
        
    }

    public void emprestar(){
        
        System.out.println("Digite o Codigo do livro que deseja emprestar:");
        int cod = scanner.nextInt();

        //verifica se o livro existe
        if(cod > livros.size() || cod < 0){
            System.out.println("Livro inexistence");
        }
        //verifica se o livro ta disponivel
        else if((livros.get(cod).getDisponivel()) == false){
            System.out.println("Livro indisponível");
        }
        //se ta tudo certinho pode emprestar
        else{
            livros.get(cod).setDisponivel(false);
            System.out.println("Livro emprestado: \n");
            System.out.println(livros.get(cod));
        }
    }

    public void devolver(){
        
        System.out.println("\nDigite o Codigo do livro que deseja devolver:");
        int cod = scanner.nextInt();

        //verifica se o livro existe pra nao dar out of bounds
        if(cod > livros.size() || cod < 0){
            System.out.println("Livro inexistence");
        }
        //verifica se ta disponivel o livro
        else if((livros.get(cod).getDisponivel()) == true){
            System.out.println("Livro já está disponível. Pode ficar com o seu aí");
        }
        //se deu tudo certo ele deixa emprestar
        else{
            livros.get(cod).setDisponivel(true);
            System.out.println("\nLivro devolvido: \n");
            System.out.println(livros.get(cod));
        }
    
    }
}
