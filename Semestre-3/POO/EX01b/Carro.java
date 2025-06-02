public class Carro {
    //primeiro colocar atributos
    String Cor;
    int Ano;
    Double Kilometragem;
    
    //entao os metodos

    //metodo para mostrar as coisas
    public void showInfo(){
        System.out.println("Cor: " + this.Cor);
        System.out.println("Ano: " + this.Ano);
        System.out.println("Kilometragem: " + this.Kilometragem);
        System.out.println(" ");
    }

    void mudaCor(String novaCor){
        System.out.println("Mudando cor do carro:");
        this.Cor = novaCor;
        System.out.println(" ");

    }
}
