/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplos;

import java.lang.reflect.Constructor;
import java.util.Scanner;

/**
 *
 * @author autologon
 */
public class Triangulos {
   public int lado1,lado2,lado3,area;
   Scanner entrada = new Scanner(System.in);
    
    public void SetLados(){
        
        System.out.printf("Digite o primeiro lado: ");
        this.lado1 = entrada.nextInt();
        
        System.out.printf("Digite o segundo lado: ");
        this.lado2 = entrada.nextInt();
        
        System.out.printf("Digite o terceiro lado: ");
        this.lado3 = entrada.nextInt();
        
        
    } 
    
    public void CalcularArea(){
         this.area = (lado1+lado2+lado3) / 2;
    }
}
