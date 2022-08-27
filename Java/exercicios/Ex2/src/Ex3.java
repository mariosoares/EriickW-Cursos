  //Essa area é para adicionar arquivos importados (importações de classe
import java.util.Scanner;// Essa classe importada serve para que seja possivel a entrada de dados


public class Ex3 {
  
    

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numero = entrada.nextInt(),dobro = numero *2 ;
        // É necessário que quando for usar o Scanner o codigo que precisará dele esteja antes de fechar com o .close()
        entrada.close();
        System.out.println("Seu dobro:");
        System.out.println(dobro);
    }
}
