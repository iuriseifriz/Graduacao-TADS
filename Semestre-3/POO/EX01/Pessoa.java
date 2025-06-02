

//classe = class
public class Pessoa {
    //depois de criar a classe, botar os atributos dentro da classe, diretamente como variáveis
    String Name;
    int Age;
    double Height;

    //com os atributos prontos, criamos os métodos. Método = void. Dá pra botar public no void também

    //métodos para mostrar os atributos
    void showInfo(){
        System.out.println("Name: " + this.Name);
        System.out.println("Age: " + this.Age);
        System.out.println("Height: " + this.Height);
    };

    //método para mudar o atributo de idade
    void changeAge(int newAge) {
        this.Age = newAge;
    }

}
