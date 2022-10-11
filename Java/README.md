# Java

## O que é o Java

> ### A Linguagem Java é composta por um conjunto bem definido de funcionalidades(features) que são super recomendadas para você.


- **Simples**

    Java é uma linguagem de programação simples e fácil de entender, pois não contém complexidades, que existiam em linguagens de programação anteriores. Na verdade, a simplicidade era o objetivo do design dos povos Javasoft, porque ele tem que funcionar em dispositivos eletrônicos onde menos memória/recurso estão disponíveis
- **Orientada a Objeto**

    Java é uma linguagem de Programação Orientada a Objetos. Isso significa que tudo é escrito em termos de CLASSES e Objetos.

    Para começar a desenvolver softwares de forma constente com  Java, é necessário compreender os pliares da Programação orientada a objetos eles são
    - ***1- Classe e objeto***
    - ***2- Encapsulamento***
    - ***3- Abstração***
    - ***4- Herança***
    - ***5- Polimorfismo***
- **Plataforma idependente**

    O objetivo da design do javasoft people é desenvolver uma linguagem que funcione em qualquer plataforma. Uma plataforma é o ambiente de hardware ou software no qual um programa ée executado...

    Em Java, o código-fonte Java é compilado para bytecode, e esse bytecode não está vinculado a nenhuma plataforma
- **Portátil** 

    O conceito WORA (Write Once Run Anywhere) eo recurso idependente de plataforma tornaram o Java portátil. Agora usando a linguagem de programação Java, os desenvolvedores podem obter o mesmo resultado em qualquer máquina, escrevendo o código apenas uma vez. A razão por trás disso é JVM e Bytecode

- **Robusta**

    A linguagem de programação Java é robusta, o que significa que é capaz de lidar com o encerramento inesperado de um programa
    - Ele usa um gerenciamento de memória forte
    - Java fornece coleta de lixo automática
    - Há tratamento de exceção e mecanismo de verificação de tipo

- **Segura**
    
    Problemas como ameaças de vírus, adulteração, espionagem ou representação podem ser tratados ou minimizados usando java. E nossa construção de aplicativos usando Java também precisa de algum tipo de segurança. Por isso, a linguagem também fornece recursos de segurança para os programadores. Também existem Recursos de criptografia e decriptografia para proteger seus dados contra espionagem e adulteração na internet
- **Interpretada**
    Nas linguagens de programação, você aprendeu que eles usam o compilador ou interpretador, amas a linguagem de programação Java usa os dois. Os programas são compliados para gerar arquivos de bytecode e a JVM (Java Virtual Machine) interpreta o arquivo de bytecode durante a execução

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
## Anatomia das Classes


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


- variaveis estaicas = variaveis com tamanhos definidos 

## Declarando variaveis em java

```java

    int[] num = new int[5];

```