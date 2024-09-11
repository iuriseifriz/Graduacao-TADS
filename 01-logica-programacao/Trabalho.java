//by Iuri Seifriz

import java.util.Random;
import java.util.Scanner;
public class Trabalho{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        Random r = new Random();

        String nome[] = {"vini", "luciano", "desesperanca","sibele","telecken","denise"};
        String genero[] = {"m", "m","m","f","m","f"};
        String cabelo[] = {"castanho", "grisalho","grisalho","loiro","grisalho","castanho"};
        String corte[] = {"curto", "curto","curto","longo","curto","longo"};
        String olhos[] = {"escuro", "claro","escuro","claro","claro","escuro"};
        String altura[] = {"baixa", "alta","media","baixa","media","baixa"};
        String acessorio[] = {"oculos", "oculos", "oculos","nenhum","oculos","nenhum"};

        
        String perguntas[] = {"m", "f", "castanho","loiro","grisalho","longo","claro", "escuro", "baixa","media","alta","oculos"};


        int resposta = r.nextInt(5); //add numero random na resposta


        System.out.println("//////////////////////////////////////////////////");
        
        System.out.println("BEEEEEM VINDO AO CARA A CARA! Você deve fazer perguntas de acordo com as opções possíveis e depois tentar adivinhar quem é a pessoa misteriosa. Você pode subir no terminal a qualquer momento para verificar as informações das pessoas misteriosas acima ^ !");

        System.out.println("/////////////////////////////////////////////////");


    
        System.out.println("Perguntas possíveis:\n" +
            "0 - O personagem é M?\n" +
            "1 - O personagem é F?\n" +
            "2 - Tem cabelo castanho?\n" +
            "3 - Tem cabelo loiro?\n" +
            "4 - Tem cabelo grisalho?\n" +
            "5 - Tem cabelo longo?\n" +
            "6 - Tem olhos claros?\n" +
            "7 - Tem olhos escuros?\n" +
            "8 - Tem altura baixa?\n" +
            "9 - Tem altura média?\n" +
            "10 - Tem altura alta?\n" +
            "11 - Usa óculos?");

        for (int i = 3 ; i > 0 ; i--){

            
            System.out.println("");

            
            System.out.println("perguntas restantes: " + i);
            System.out.println("insira o numero da sua pergunta");
            
            int pergunta = scan.nextInt();

            
            while (pergunta > 11 || pergunta < 0){
                    System.out.println("Número inválido.");

                    System.out.println("");
                    System.out.println("insira o numero da sua pergunta");
                    pergunta = scan.nextInt();
            
            }

            System.out.println(perguntas[pergunta] + "?");

            
            if (pergunta == 0){
                if(perguntas[pergunta].equals(genero[resposta])){
                    System.out.println("Sim.");
                }
                else{
                    System.out.println("Não");
                }
            
            }

            
            if (pergunta == 1){
                if(perguntas[pergunta].equals(genero[resposta])){
                    System.out.println("Sim.");
                }
                else{
                    System.out.println("Não");
                }
            
            }

            
            if (pergunta == 2){
                if(perguntas[pergunta].equals(cabelo[resposta])){
                    System.out.println("Sim.");
                }
                else{
                    System.out.println("Não");
                }
            
            }

            
            if (pergunta == 3){
                if(perguntas[pergunta].equals(cabelo[resposta])){
                    System.out.println("Sim.");
                }
                else{
                    System.out.println("Não");
                }
            
            }

            
            if (pergunta == 4){
                if(perguntas[pergunta].equals(cabelo[resposta])){
                    System.out.println("Sim.");
                }
                else{
                    System.out.println("Não");
                }
            
            }

            
            if (pergunta == 5){
                System.out.println("corte de cabelo longo?");
                if(perguntas[pergunta].equals(corte[resposta])){
                    System.out.println("Sim.");
                }
                else{
                    System.out.println("Não");
                }
            
            }

            
            if (pergunta == 6){
                if(perguntas[pergunta].equals(olhos[resposta])){
                    System.out.println("Sim.");
                }
                else{
                    System.out.println("Não");
                }
            
            }

            
            if (pergunta == 7){
                if(perguntas[pergunta].equals(olhos[resposta])){
                    System.out.println("Sim.");
                }
                else{
                    System.out.println("Não");
                }
            
            }
            
            
            if (pergunta == 8){
                if(perguntas[pergunta].equals(altura[resposta])){
                    System.out.println("Sim.");
                }
                else{
                    System.out.println("Não");
                }
            
            }
            
            
            if (pergunta == 9){
                if(perguntas[pergunta].equals(altura[resposta])){
                    System.out.println("Sim.");
                }
                else{
                    System.out.println("Não");
                }
            
            }
            
            
            if (pergunta == 10){
                if(perguntas[pergunta].equals(altura[resposta])){
                    System.out.println("Sim.");
                }
                else{
                    System.out.println("Não");
                }
            
            }

            if (pergunta == 11){
                if(perguntas[pergunta].equals(acessorio[resposta])){
                    System.out.println("Sim.");
                }
                else{
                    System.out.println("Não");
                }
            
            }
        }
                


        System.out.println("//////////////////////////////////////////////////");

        //mostras as opcoes possiveis
        System.out.println("As opcoes possiveis são: ");
        System.out.println();

        for(int i = 0; i < nome.length ; i++){
            
            System.out.println("nome: " + nome[i]);
            System.out.println("genero: " + genero[i]);
            System.out.println("cabelo: " + cabelo[i]);
            System.out.println("corte: " + corte[i]);
            System.out.println("olhos: " + olhos[i]);
            System.out.println("altura: " + altura[i]);
            System.out.println("acessorio: " + acessorio[i]);

        
            System.out.println();

        }
        
        //deduza a pessoa
        System.out.println("Quem é a pessoa?");
        System.out.println("Opções: 'vini' 'luciano' 'desesperanca' 'denise' 'sibele' 'telecken'");
        String nomeResp = scan.next();

        if(nomeResp.equals(nome[resposta])){
            System.out.println("Você ganhou, a pessoa era " + nome[resposta]);
        }
        else{
            System.out.println("Errou, seu animal. A pessoa certa era " + nome[resposta]);
        }

        


        scan.close();
        
    }
}