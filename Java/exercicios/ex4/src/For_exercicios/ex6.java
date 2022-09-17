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
public class ex6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, suc,ant;
         for(int i = 1; i<=5;i++){
             System.out.printf("\n \n Digite um número: ");
             num = entrada.nextInt();
             
             suc = num + 1;
             ant = num - 1;
             System.out.printf("\n %d , %d, %d \n",ant,num,suc);

        }
        entrada.close();
    }
}
