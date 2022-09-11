import java.util.Scanner;

/**
 *
 * @author autologon
 */
public class CondicionalTeste {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int numero;
            System.out.printf("Digite um numero: ");
            numero = entrada.nextInt();
            
            if(numero > 0 ){
                System.out.println("Numero positivo");
            }else if(numero<0){
                System.out.println("Numero Negativo");
            }else{
                System.out.println("Numero igual a 0");
            }
        }
    }
}