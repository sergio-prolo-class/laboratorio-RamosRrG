import java.util.Scanner;
public class ex5{
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o primeiro número do código: ");
    int n_1 = sc.nextInt();

    System.out.println("Digite os proximos 6 números: ");
    int n_2_5 = sc.nextInt();

    System.out.println("Digite os ultimos 5 números: ");
    int n_6_12 = sc.nextInt();

    int n12 = n_6_12 % 10;
    int n11 = n_6_12 %100 / 10;
    int n10 = n_6_12 % 1000 /100;
    int n9 = n_6_12 % 10000 / 1000;
    int n8 = n_6_12 % 100000 / 10000;
    int n7 = n_2_5 % 10;
    int n6 = n_2_5 % 100 / 10;
    int n5 = n_2_5 % 1000 / 100;
    int n4 = n_2_5 % 10000 / 100;
    int n3 = n_2_5 % 100000 / 10000;
    int n2 = n_2_5 % 1000000 / 100000;
    System.out.println("o segundo numero do código: " + n2);
    sc.close();
    }
}