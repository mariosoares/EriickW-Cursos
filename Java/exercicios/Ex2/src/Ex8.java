
import java.util.Scanner;


public class Ex8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Esse é um programa que calcula aumento de salario");
        System.out.printf("Digite seu salario: ");
        double salario = entrada.nextInt(),
                taxa = 20,aumento = salario * (taxa/100),
                novoSalario = salario + aumento ;
        System.out.printf("O aumento foi de %s%n ",taxa + " porcento");
        System.out.printf("Seu salario é de %s%n ", novoSalario);
        
        entrada.close();
    }
}
