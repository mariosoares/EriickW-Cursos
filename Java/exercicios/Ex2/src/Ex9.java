
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Erick
 */
public class Ex9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("|                                                                                   |");
        System.out.println("| Esse é um programa que calcula a quantidade de convites que devem ser vendidos !! |");
        System.out.println("|                                                                                   |");
        System.out.println("-------------------------------------------------------------------------------------");
        
        double custo,convite,quantidade;
        
        System.out.printf("Digite o custo total do espetaculo: ");
        custo = entrada.nextDouble();
        
        System.out.printf("Digite quanto custa cada convite: ");
        convite = entrada.nextDouble();
        
        quantidade = custo/convite;
        
        System.out.printf("Para que você tenha algum lucro você precisa vender mais que %s%n ", quantidade + " convites");
        
        entrada.close();
        
        
    }
}
