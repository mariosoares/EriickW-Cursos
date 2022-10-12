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
A escrita de códigos de um programa é feito através da composição de palavras pré-definidas pela linguagem com as expressões que utilizamos para determinar o nome do nossos arquivos, classes, atributos, e métodos.

É muito comum mesclarmos expressões no idioma americano com o nosso vocabulário. Existem projetos que recomendam que toda a implementação do seu programa seja escrita na língua inglesa.

**Sintaxe de declaração de uma nova classe:**
```java

public class MinhaClasse{
    // Seu código 
}
```
- Caso o arquivo/classe que você estiver criando for um arquivo que sera executado, ou seja o arquivo principal ele deve ter o metodo main
```java

public class MinhaClasse{
   public static void main(String[] args) {
        //Tudo que eu escrever aqui será executado, e so será usado aqui
   }
}
```
> ### Padrão de Nomenclatura
Quando se trata de escrever códigos na linguagem Java, é recomendado seguir algumas convenções de escrita. Esses padrões estão expressos nos items abaixo:

-  Arquivo **.java** : Todo arquivo .java deve começãr com letra MAIÚSCULA. Se a palavra for composta, a segunda palavra deve tembém ser maiúscula, exemplo:
```
    Calculadora.java

    CalculadoraCientifica.java
```
- **Nome da classe no arquivo:** A classe deve possuir o mesmo nome do arquivo.java, exemplo

```java
// arquivo Calculadora

public class Calculadora{

}

```

- **Nome de variável :** Toda variável deve ser escrita com letra minúscula porém se a palavra for composta, a primeira letra da segunda palavra deverá ser *MAIÚSCULA, exemplo:* `ano` e `anoFabricacao`. O nome dessa prática para nomear variáveis dessa forma se chama "camelCase"

    **Recomendações :** Para declarar uma variável nós podemos utilizar caracters, números e símbolos, porém devemos seguir algumas regras da linguagem.

    - Deve conter apenas letras, _ (underline), $ ou os números de 0 a 9
    - Deve obrigatoriamente se iniciar por uma letra (preferencialmente), _ ou $, jamais com númeor
    - Deve iniciar com uma letra minúscula (boa prática - ver abaixo)
    - Não pode conter espaços
    - Não podemos usar palavras-chave da linguagem
    - O nome deve ser único dentro do escopo

> ### Declarando variáveis e métodos

Como identificar entre declaração de variáveis e métodos em nosso programa? Existe uma estrutura para ambas finalidades

**Exemplo :**
- Declarar uma variável em Java segue a seguinte estrutura

```java 
//Estrutura
// Tipo NomeDaVariavel = Atribuição(opcional em alguns casos)

//Exemplos

int idade = 23;
double altura = 1.62;

```
- Declarando métodos em Java segue uma estrutura bem simples:

```java
//Estrutura
//TipoRetorno NomeObjetivoNoInfinitivo parametro(s)

//Exemplo

int somar (int numero1, int numero2)

```

```java

public class MinhaClasse{
    public static void main(String[] args) {
        String primeiroNome = "Erick";
        String segundoNome = "Willian";

        String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}

``` 
> ### Identação

Basicamente **Identar** é um termo utilizado para escrever o código do programa de forma hierárquica, facilitando assim a visualização do programa

> ### Organizando arquivos

À medida que nosso sistema vai evoluindo, surgem novos arquivos (código fonte) em nossa estrutura de arquivos de projeto. Isso exige que seja realizado uma organização destes arquivos através de pacotes (packages).


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