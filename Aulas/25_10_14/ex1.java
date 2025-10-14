import java.util.Scanner;

public class ex1{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("digita a altura da pessoa e o peso: ");
            double altura = sc.nextDouble();
            double peso = sc.nextDouble();
            if ( altura <= 0 || peso <= 0 ){
                sc.close();
                return;
            }
            double imc = peso / (altura*altura);
                
            System.out.printf("este é o seu imc: %.3f %n", imc);

        sc.close();
    }
}