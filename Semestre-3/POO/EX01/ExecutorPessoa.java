
//sempre fazer um script para executar minha classe. Geralmente chamado de Main, vou chamar de Executor pq faz mais sentido. É aqui que vem aquela porcaria toda de pubilc void main srting args
public class ExecutorPessoa {
    public static void main(String[] args) {
        //aí aqui dentro eu vou INSTANCIAR, ou seja, se minha classe pessoa é um molde, eu vou CRIAR O OBJETO pessoa. Isso é instanciar.

        Pessoa p1 = new Pessoa();
        // objeto p1 recebe classe pessoa
        //aí agora eu tenho que definir os valores dos atributos que esse objeto vai ter
        p1.Name = "john";
        p1.Age = 25;
        p1.Height = 1.75;
        p1.showInfo();
        //agora vamos executar o metodo para mudar a idade e mostrar a idade nova modificada
        p1.changeAge(30);
        System.out.println("Show info again but updating age");
        p1.showInfo();
    }
    
}
