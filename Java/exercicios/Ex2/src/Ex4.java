import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        
        System.out.println("Digite o primeiro número:");
        int N1 = entrada.nextInt();
        
        
        System.out.println("Digite o segundo número:");
        int N2  = entrada.nextInt(),M = (N1+N2)/2;
        entrada.close();
        
        
        System.out.println("Essa é a média entre os números:");
        System.out.println(M);
   
        
    }
}
