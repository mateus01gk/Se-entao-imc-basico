import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

 Scanner sc = new Scanner(System.in);


double altura = sc.nextDouble();
double massa = sc.nextDouble();
double imc = massa/ (altura*altura);

    System.out.pintf(" o seu imc é de %f.2 kg/m");

    if(25 < imc) {}
  }
  sc.close();
}