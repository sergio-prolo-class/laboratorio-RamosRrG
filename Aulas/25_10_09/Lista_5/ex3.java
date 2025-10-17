package Lista_5;
import java.security.cert.CertificateNotYetValidException;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Esta é a megamacho calculadora de centavos para notas utilizando apenas o necessário e somente o necessário do serelepe aluno de ico");
        System.out.println("Entre com o valor de centavos por gentileza: ");
        int centavos = sc.nextInt();

        int nota50 = (centavos/50);
        int nota25 = (centavos%50)/25;
        int nota10 = ((centavos % 50) %25)/10;   //aqui estamos realizando um brincadeira onde o resto da divisão anterior atua na divisão atual e define o valor da mesma
        int nota5 = (((centavos %50)%25)%10)/5;
        int nota2 = ((((centavos %50)%25)%10)%5)/2;
        int centavinhos = ((((centavos %50)%25)%10)%5)%2;

        System.out.println(nota50 >0 ? "notas de 50: " + nota50 : "");
        System.out.println(nota25 >0 ? "notas de 25: " + nota25 : "");        // Aqui estamos utilizando o ternario para que a condição logica seja de escrever e escrever o valor caso o valor da variavel seja maior que zero, e não escrever nada caso não seja.
        System.out.println(nota10 > 0 ? "notas de 10: " + nota10 : "");
        System.out.println(nota5 > 0 ? "notas de 5: " + nota5: "");
        System.out.println(nota2 > 0 ? "notas de 2: "+ nota2: "");
        System.out.println(centavinhos > 0 ? "centavinhos: " + centavinhos : "");

        sc.close();
    }
}
