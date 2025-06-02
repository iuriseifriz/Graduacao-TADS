public class Vetores {
        public static void main(String[] args) {

            int n[] = {3,2,8,7,5,4};
            //int n[] = new int

            System.out.println("O vetor N possui " + n.length + " posições/índices");

            for(int c = 0 ; c <= n.length-1; c++){
                System.out.print(n[c]);
            }

            String mes[] = {"Jan", "Fev", "Mar", "Abr"};
            int dias[]= {31, 28, 31, 30};

            System.out.println();

            for(int cont = 0 ; cont < mes.length ; cont++){
                System.out.println("O numero de dias que o mes " + mes[cont] + " tem é " + dias[cont] + " dias.");
            }

            

    }
}