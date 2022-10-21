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

> ### Java Beans

Uma das maiores dificuldades na progrmamação é escrever algoritmos çégiveis a níveis que sejam compreendidos por todo seu time ou por você mesmo no futuro. Para isso a linguagem Java sugere, através de convenções, formas de escrita universal para nossas classes, atributos, métodos e pacotes

- Variáveis

    Mais cedo já aprendemos algumas regras de declaração de variáveis, mas agora iremos conhecer algumas sugestões de nomeclatura:

    - Uma variável deve ser clara, sem abreviações ou definição sem sentido 
    - Uma variável é sempre no singular, exeto quando se referir a um array ou coleção
    - Defina um idioma único para suas variáveis. Se você for declarar variáveis em inglês, defina todas em inglês

- Métodos

    Os métodos deverão ser nomeados como verbos, através de uma mistura de letras minúsculas e maiúsculas. Em princípio todas as letras que compões o nome deve ser mantidas em minúsculo, com exceção da primeira letra de cada palavra composta a partir da segunda palavra.


    **Exemplos sugeridos para nomenclatura de métodos :**
    ```java

    somar(int n1, int n2){}

    abrirConexao(){}

    ```

## Tipos de dados 
  No Java, existem algumas palavras reservadas para a representação dos tipos de dados básicos que precisam ser manipulados para a construção de de programas. Estes tipos de dados são conhecidos como tipos primitivos (Primitive Types)

> ### Os 8 tipos de dados em Java são:
- 4 inteiros (Numeros sem ponto flutante ou sem vírgula)
    - byte = 1 byte 
        - Numeros que podem ser usados em byte esta entre -128 e 127 menos ou mais que isso não cabe nele
    - short = 2 bytes
        - Numeros entre -32.768 e 32.767
    - int = 4 bytes 
        - Numeros entre -2.147.483.648 e 2.147.483.647
    - long = 8 bytes
        - Numeros entre -9.223.372.036.854.775.808 e 9.223.372.036.854.775.807
- 2 reais (Números com ponto flutuante ou com vírgulas )
    - float = 4 bytes (numeros com pontos flutantes, no float precisa necessaria mente de um F no final do numero para que o java saiba que é um numero float)
        -  Numeros entre -3,4028E + 38 e 3,4028E + 38
    - double = 8 bytes 
        - Numeros entre -1,7976E + 308 e 1,7976E + 308
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


## Declaração de Variáveis

Variável é uma identificação de espaço em memória utilizado pelo nosso programa. Seguindo as convenções em linguagem de programação, toda variável é composta por: tipo de dados + identificação + valor atribuido.

**A estrutura padrão para se declara uma variável é:**

***`<Tipo> <nomeVariavel> = <AtribuiçãoDeValorOpcional>`***

## Declarando variaveis em java

```java

    int num = 20;
    int num2;// aqui a variavel é somente iniciada


    
```

## Variáveis e constantes

Uma **variável** é uma área de memória, associada a um nome, que pode armazenar valores de um determinado tipo. Um tipo de dado define um conjunto de valores e um conjunto de operações. **Java** é uma linguagem com rigidez de tipos, difernete de linguagens como JavaScript, onde declarar o tipo de varável não é obrigatório.

No java utilizamos indentificadores que representam uma referência a um valor em memória, e esta referência pode ser redirecionada a outro, sendo portanto esta a causa do nome "variavel", pois o valor pode variar.

Ja as **Constantes** são valores armazenados em memória que não podem ser modificados depois que declaramos. Em Java, esses valores são representados pela palavra reservda **`final`**, seguida do tipo.

Por convenção, **Constantes** são sempre em CAIXA ALTA
```java

    int numero = 5;

    final double  VALOR_DE_PI = 3.14; //Constante

```
## Operadores

    Símbolos especiais que tem um significado próprio paara a linguagem e estão associados a determinadas operações.

Geralemente as primeires palavras que ouvimos em um curso de programação são: um programa é um conjunto de instruções lógicas que, quado executadas, produzem algum resultado. Com isso em mente, ao começar a criar as primeiras linhas de código, logo você notará que é comum receber dados do usuário, prover alguma lógica para processá-los e então apresentar o resultado desse processamento.
> ### Operador de Atribuição
Representado pelo símbolo de igualdade **`=`**

O operador de atribuição é utilizado para definir o valor inical de uma variável ou sobrescrever o valor de uma. Em java definimos um tipo, nome, e opcionalmente atribuímos um valor através do operador de atribuição

> ### Operador de Aritiméticos
O operador aritimético é utilizado para realizar operações aritiéticas

Adição `+`

Subtração `-`

Multiplicação `*`

Divisão `/`

Modulo `%`

> ### Unários
Esses operadores são aplicados juntamente com um outro operador aritmético. Eles realizam alguns trabalhos básicos como incrementar,decrementar,inverter valores numéricos e booleanos

- (+) **Operador unário de valor positivo** - números são positivos sem esse operador explicitamente;

- (-) **Operador unário de valor negativo** - nega um número ou expressão

- (++) **Operador unário de incremento** - incrementa o valor em 1;
- (--) **Operador unário de decremento** - decrementa o valor em 1;
- (!) **Operador unário lógico de negação** - Nega o valor de uma expressão booleana
> ### Operadores Relacionais
- == : Igual
- != : Diferente
- <  : Menor
- '>  : Maior
- <=  : Menor igual
- '>=  : Maior igual 

> ### Ternário

O Operador de condição Ternária é uma forma resumida para definir uma condição e escolher por um dentre dois valores. Você deve pensar numa condição ternária como se fosse uma condição IF normal, porém, de um forma em que toda a sua estrutura estará escrita numa única linha.

O operador ternário é representadado pelos símbolos `?:` utilizamos na seguinte estrutura de sintaxe:

    <Expressão Condicional>  ? <Caso condição seja true> : <Caso a condição seja false>



> ### Lógicos

Os operadores lógicos representam o recurso que nos permite criar expressões lógicas maiores a partir da junção de duas ou mais expressões.
- && Operador Lógico "E"
- || Operador Lógico "OU" 


## Métodos
Uma classe é definida por atributos e métodos. Já vimos que atributos são, em sua grande maioria, variáveis de diferentes tipos e valores. Os métodos por sua vez, correspondem a **Funções** ou **sub-rotinas** disponíveis dentro das nossas classes


- **Critério de nomeação de Métodos**

    Esse critérios não são obrigatórios, mas é recomendável que sejam seguidos pois essa convenções facilitam a vida dos programadores ao trabalharem em códigos de forma colaborativa. Ao seguir estas convenções, tornamos o codigo mais legível para nós e também para outras pessoas. Para métodos, os critérios são:

    - Deve ser nomeado como verbo
    - Seguir o padrão camelCase (Todas as letras minúsculas com a exeção da primeira letra da segunda palavra)

    ```java
        somar(int n1,int n2){}
    ```


    **ATENÇÃO**: Não existe em Java  o conceito de métodos globais. Todos os métodos devem SEMPRE ser definidos dentro de uma classe


- **Critério de definição de métodos:**

Mas como sabemos a melhor forma de definir os métodos das nossas classes? Para chegar à essa conclusão, somos auxiliados por uma convenção estrutural para todos os métodos. Essa Convenção é determinada pelos aspectos abaixo

1. **Qual a proposta principal do método ?** Você deve se perguntar constantemente até compreender a real finalidade do mesmo

2. **Qual o tipo de retorno esperado após executar o método ?** Você deveanalisar se o método será responsável por retornar algum valor ou não

> Caso o método não retorne nenhum valor, ele será representado pela palavra-chave *void*

3. **Quais os parâmetros serão necessários para a execução do método ?** Os métodos as vezes precisão de argumentos como critérios para a execção.

4. **O método possui o risco de apresenta alguma exceção ?** Exceções são comuns na execução de métodos, as vezes é necessário prever e tratar a possível existência de uma exceção

4. **Qual a visibilidade do método ?** Será necessário que p método seja visível a toda aplicação, somente em emsmos pacotes, através de herança ou somente a nível a própria classe

    EXEMPLOS:

```java

public class myClass{

    public static void main(String[] args) {
        
    }


    // Os métodos devem ficar fora do main mas dentro do public class

    //Como vemos devemos mostrar qual é o tipo de dado que o método deve retornar

    //Usando o public o metodo fica visivel por todo o sistema
    public double somar(int num1, int num2){
        //finalidade do método

        return ...; //É obrigatório o uso do return
    }


    public void imprimir(String texto){
        // Aqui não precisa do return
        // Pois não será retornado nenhum resultado
    }
    //throws Exception: indica o que o método ao ser utilizado
    public double dividir(int dividendo, int divisor)throws Exception{}

    // Esse método não pode ser visto por outas classes no programa
    private void metodoPrivado(){

    }
} 


```

## Entrada de Dados

- nextInt()
- nextLine()
- nextDouble()


- variaveis estaicas = variaveis com tamanhos definidos 

