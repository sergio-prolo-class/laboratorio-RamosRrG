import java.util.Scanner; // chamo o scanner

public class ex1 {
    public static void main (String []args){
    
        Scanner sc = new Scanner(System.in); //crio o obejeto scanner na minha classe

        System.out.print("Digite a temperatura em Fahrenheit: "); // solicito uma entrada
        double fahrenheit = sc.nextDouble(); // defino a variavel fhareneit como a entrada da linha anterior
    
        fahrenheit = (fahrenheit - 32.0)*5 /  9; // defino o valor da variavel celcius como sendo uma operação

        System.out.printf("Este grau em celcius é = %.2f!%n", fahrenheit); // escrevo o valor de celcios
    
        sc.close();
    }



}