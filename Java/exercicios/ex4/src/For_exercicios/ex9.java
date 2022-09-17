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
public class ex9 {
         
       public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
         float altura,media,totalAltura=0; 
       
        
        for(int i = 1; i<=5;i++){
            System.out.printf("Digite a altura da pessoa %d \n",i);
            altura = entrada.nextFloat();
            
            totalAltura = totalAltura+altura;
            
        }
        media = totalAltura/5;
           System.out.printf("A média de altura entre essas 5 pessoas são de %f",media);
        entrada.close();
    }
}
