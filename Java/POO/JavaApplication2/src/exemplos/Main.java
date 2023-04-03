/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplos;

/**
 *
 * @author autologon
 */
public class Main {
    public static void main(String[] args) {
        Triangulos triangulo1 = new Triangulos();
        Triangulos triangulo2 =  new Triangulos();
        
        
        
        triangulo1.SetLados();
        triangulo1.CalcularArea();
        
        System.out.printf("%d\n",triangulo1.area);
        System.out.printf("\n\n ");
        
        
        triangulo2.SetLados();
        triangulo2.CalcularArea();
        
        System.out.printf("%d\n",triangulo2.area);
        
        
    }
}
