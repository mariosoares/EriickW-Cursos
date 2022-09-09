
import java.util.Scanner;

/*
 *
 * @author Erick
 */
public class Ex10 {
      public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("|                                                                                   |");
        System.out.println("| Esse é um programa que calcula a quantidade de ração de gatos após 5 dia !!       |");
        System.out.println("|                                                                                   |");
        System.out.println("-------------------------------------------------------------------------------------");
        
        int pesoKg,pesoG,consumo1,consumo2, consumoTotal, resto;
        
          System.out.printf("Digite o peso do saco de ração em KG: ");
          pesoKg = entrada.nextInt();
          pesoG = pesoKg * 1000;
          
          System.out.printf("Digite o consumo por dia do primeiro gato (em gramas): ");
          consumo1 = entrada.nextInt();
          
          System.out.printf("Digite o consumo por dia do segundo gato (em gramas):");
          consumo2 = entrada.nextInt();
          
          consumoTotal = (consumo1 + consumo2)*5;
          System.out.println("O consumo total dos gatos durante 5 dias são de: " + consumoTotal + "g");
          
          resto = pesoG - consumoTotal;
          System.out.println("Após 5 dias vai ter sobrado: " + resto + "g");
               
          
        
        entrada.close();
    }
  
}
