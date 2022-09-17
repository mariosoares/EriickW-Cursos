# Laboratorio de Algoritimo

## Paradigmas:
- ***Funcional*** 
- ***Orientada Objetos***
- ***Logica***
- ***Estrutural***

## Pseudocódigo

## Fluxograma

## Introdução a linguagem de programação

## ***Java:***

- Como elaborar um programa
    - Vamo precisar de uma linguagem de programação. Sendo que será necessário as regras léxicas (Ortografia) e sintaxe (gramática)
    - Será necessário uma IDE. Trata-se de um software que irá permitir editar o código e também testá-lo
    -  Um compilador que irá treansformar o código fonte eum umcódigo objeto
    - E por fim uma máquina virtual, na qual irá permitir que o programa seja executado

    - Codigo fonte em Java => Compilador:Realiza a análise léxica e de sintaxe => Bitecode

    - Entrada de dados( Telclado ) => Processamento( CPU ) => Saída ( Monitor )
- ***Dados*** :
    - Numeros: 
        - Inteiros: 1, 2, 3 ... (4bites de memoria)
        - Reais: 1.25, -1.25 ... (8bites de memoria)
    - Literal ( String )
        - Sequencia de caracteres 
    - Lógicos
        - True e False
    - 
    
## Estrutura Básica de Java

```java


public class PrimeiroPrograma {
    public static void main(String[] args) {// Esse metodo é chamado main ( principal ) e será o ponto inicial de execução de programa
        System.out.println("Olá Mundo");//Esse comando é para saida de dados
        System.out.println("Testando a primeira linha");
        // É obrigatório terminar cada linha de código com ponto e virgula
        
        
    }
        
}

public class PrimeiroPrograma {
    public static void main(String[] args) {
 
        int numero = 2, numero2 = 3, soma = numero + numero2;
        
        System.out.println(soma);
        
    }
        
}

```

## Tipos de dados 

8 Tipo de dados e seus espaços na memoria 
- 4 inteiros (Numeros sem ponto flutante ou sem vírgula)
    - byte = 1 byte
    - short = 2 bytes
    - int = 4 bytes 
    - long = 8 bytes
- 2 reais (Números com ponto flutuante ou com vírgulas )
    - float = 4 bytes (numeros com pontos flutantes, no float precisa necessaria mente de um F no final do numero para que o java saiba que é um numero float)
    - double = 8 bytes 
- lógico
    - boolean (true ou false)
- Caracteres 
    - char = 1 caractere ( Colocar em aspas simples par indicar a letra )

## Inferêrencia

- Trata-se de outra maneira de identificar o tipo de dado que será armazenadoem uma variável 

```java

var b = 5;

System.out.println(b);


```
- Neste exemplo a variável **b** por estar recebendo um número inteiro ela passa a ser do tipo inteiro 

## Entrada de Dados

- nextInt()
- nextLine()
- nextDouble()