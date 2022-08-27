
import java.util.Scanner;


public class Ex6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Digite o saldo: ");
        double saldo = entrada.nextDouble();
        double valorReajuste = saldo * 0.15;
        double novoValor = saldo + valorReajuste;
        System.out.printf("O reajuste é de 15 porcento sendo o valor de: %s%n",valorReajuste);
        System.out.printf("Novo valor: %s%n ", novoValor);
        
        entrada.close();
    }
}
