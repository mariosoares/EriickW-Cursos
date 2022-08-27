
import java.util.Scanner;


public class Ex7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        
        System.out.printf("Digite sua data de nascimento: ");
        int anoNascimento = entrada.nextInt();
        
        
        System.out.printf("Digite o ano atual: ");
        int anoAtual = entrada.nextInt(),idadeAtual, idadeDepois;
        
        
        idadeAtual = anoAtual - anoNascimento;
        System.out.printf("Sua idade é de: %s%n ",idadeAtual);
        
        
        idadeDepois =  2040 - anoNascimento;
        System.out.printf("Sua idade em 2040 será de: %s%n ",idadeDepois);
        
        
        entrada.close();
        
    }
}
