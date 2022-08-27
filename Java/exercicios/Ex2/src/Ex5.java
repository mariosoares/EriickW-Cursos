
import java.util.Scanner;


public class Ex5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Entre com o valor de X:");
        
        int X = entrada.nextInt(), Y = (3 * X)+ 2;
        
        System.out.printf("y(x)= %s%n", Y);
    }
}
