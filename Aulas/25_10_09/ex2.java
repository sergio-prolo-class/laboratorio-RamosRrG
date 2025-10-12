import java.util.Scanner;

public class ex2{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        //está errado desta forma pois ira ter mais de 2 variavel
        //O certo é somar o nota direto no sc.nextdouble e ja concatenar com outra chamada de sc.nextdouble
        //System.out.print("digite as notas do aluno: ");
        //double nota = sc.nextdouble();
        // double soma = nota;
        // nota = sc.nextdouble();
        // soma = soma + nota;
        // nota = sc.nextdouble();
        // soma = soma + nota;
        // nota = sc.nextdouble();
        // soma = soma + nota;
        

        System.out.print("Diigite as 4 notas dos alunos");
        double nota  = (sc.nextadouble() + sc.nextdouble() + sc.nextdouble() + sc.nextDouble())/4;

        System.out.println(nota);


        sc.close();
    }
}