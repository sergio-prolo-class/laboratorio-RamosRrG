import java.util.Scanner;
public class ex4{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);


    System.out.println("Digite o ano e irei dizer se é bissexto ou não gracinha: ");
    int anos = sc.nextInt();

    System.out.println(((anos%400 == 0 && anos%4 == 0) || (anos%4 == 0 && anos%100 !=0 ) ? "é bissexto" : "não é bissexto"));
    
    

    sc.close();
    }


}