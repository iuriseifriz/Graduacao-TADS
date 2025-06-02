import java.util.Scanner;

public class Lista05 {
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);

    float x1, x2, y1, y2, novox, novoy, distancia, novoyy, novoxx;
    System.out.println("Diga a primeira coordenada x");
    x1 = in.nextFloat();
    System.out.println("Diga a primeira coordenada y");
    y1 = in.nextFloat();
    System.out.println("Diga a segunda coordenada x");
    x2 = in.nextFloat();
    System.out.println("Diga a segunda coordenada y");
    y2 = in.nextFloat();

    novox = (x1 - x2);
    novoxx = novox  * novox;
    novoy = y1 - y2;
    novoyy = novoy * novoy;
    distancia = novoxx + novoyy;
    System.out.println("A distância entre as coordenadas é "+ distancia +"Km");

    in.close();
  }
 
}
