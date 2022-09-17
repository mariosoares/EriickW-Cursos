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
public class ex11 {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nota1,nota2,media,cont,temp=0;
        System.out.printf("Digite as notas do aluno 1");
         for(int i = 1; i<=10;i++){
             
             System.out.printf("\nDigite a primeira nota: ");
             nota1 = entrada.nextInt();
             
              System.out.printf("\nDigite a segunda nota: ");
             nota2 = entrada.nextInt();
             
           media = (nota1+nota2)/2;
           
             System.out.printf("A media do aluno %d é de: %d \n\n",i,media);
             
             cont = i;
             if(i<10){
                 System.out.printf("Digite as notas do aluno %d",++cont);
             }
             
             temp = media+temp;
        }
         media = temp/10;
          System.out.printf("A media total da sala é de : %d",media);
        entrada.close();
    }
}
