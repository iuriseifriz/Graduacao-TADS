public class Main {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        
        String novaCor = "Preto";

        c1.Cor = "vermelho";
        c1.Ano = 2022;
        c1.Kilometragem = 15.000;
        c1.showInfo();
        c1.mudaCor("Preto");
        c1.showInfo();

    }
}
