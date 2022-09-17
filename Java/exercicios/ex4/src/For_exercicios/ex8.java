/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package For_exercicios;

import java.util.Scanner;

/**
 *
 * @author autologon
 */
public class ex8 {
    public static void main(String[] args) {
        
       Scanner entrada = new Scanner(System.in);
       int num,soma; 
       
        System.out.printf("Digite um número: ");
        num = entrada.nextInt();
        for(int i = 1; i<=10;i++){
            soma = num + i;
            System.out.printf("%d + %d = %d \n",num,i,soma);
            
        }
        entrada.close();
    }
}
