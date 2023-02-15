# C#

## Plataforma .NET

> O que é uma plataforma:

É um conjunto de bibliotecas, e dentro do .net você acha bibliotecas para tudo, pode ser chamado de plataforma ou ambiente de execução

## O que são biblicotecas 

- São módulos/pacotes que extendem a linguagem de programação, **Ex:** Você pode achar módulos que podem manipular a placa de video do computador para desenhar algo na tela, ou bibliotecas para manipular arquivos


## Variáveis

- Variável: Um objeto na memória capaz de armazenar dados de diversos tipos
- OBS: sempre colocar o ";" no final de cada instrução pois sem isso ocorrerá um erro
***Declaração***
```c#
// Para declarar uma variável em c# é necessário colocar o tipo que ela vai receber

//Aqui a variavel vidaPersonagem tem o valor de inteiro (int) e recebe 10
int vidaPersonagem = 10;

// Aqui outro tipo de dado float que faz com que as variaveis aceitem numeros com virgula
// Obs: para ser um valor float deve-se colocar o "f" no fim do numero e usar o ponto no lugar da virgula
float danoPersonagem = 10.20f;

//Aqui um tipo de boleano (verdadeiro ou falso)
bool personagemVivo = true;

//Aqui um tipo de texto (string)
string nomePersonagem = "Dante";

```

> ### Tipos de variáveis: 

Elas podem ser divididas em **privadas** ou **publicas(public)**

```c#
//Essa é uma variavél privada, somente pode ser acessada através do próprio script
int vidas = 10;

//Variável pública, pode ser acessada no editor da Unity e através de outros scripts
public float dano = 20f;

```

## Variaveis do MonoBehaviour (Unity):

- MonoBehaviour: é uma classe base da qual deriva todo script da Unity
```c#
// Variáveis proprias da Unity
GameObject Personagem;
Transform Espada;

```

## Métodos 
- Executa instruções, Iniciar algo, Fazer algo, aplicar algo.
- Um meio de isola o código que excuta uma tarefa especifica e que possa ser chamado de outros lugares

**Exemplo:**

- Executar Explosão

    // Tocar efeito sonoro

    // Aplicar efeito de flash

    // Aplicar 10 de dano na vida do personagem

```c#

//Em código fica +- isso

void Explosao(){
    //tocar efeito sonoro
    //aplicar efeito de flash
    //aplicar 10 de dano na vida do personagem
}

// Assim você chama a função
Explosao()
```

## Tipos de Métodos 

```c#
// SO pode ser usdado dentro do script
void Explosao(){

}

//Metodo publico: Pode ser chamado/Acessado tanto dentro do próprio script como por outro script
public void Explosao(){

}
```

## classes

**Uma forma de agrupar métodos e variáveis juntas**

- Manter o código flexível e minimiazer repetções
- Uso de herança e composição são as metodologias que nos permitem fazer isso
```c#
// Forma de declarar uma classe 

class Player{
    // Métodos(ações) e variaveis (atributos) pertencentes à classe Player vão aqui
}

```
## classes do MonoBehaviour

**Esse tipo de classe herda da classe MonoBehaviour da Unity**

```c#
//chamado uma vez ao inicio do jogo
void Start(){

}

//Chamado a  cada frame
void Update(){

}

```
```c#

class Inimigo:MonoBehaviour{
    void Update(){
        
    }
}

```

## Formatando saidas:

```c#
string produto = "Copo";
// Fazendo assim você pode formatar o texto
// Colocando variaveis no meio dentro das chaves você indica o indice da variavel 
// Que sempre vai estar fora das aspas
Console.WriteLine("Produto.......:{0}",produto);

//Mas e agora? o que é esse 15
// Simplesmente a quantidade de espço que será dado
Console.WriteLine("Produto.......:{0,15}",produto);

```
## Recebendo valores do teclado:

```c#
string nome;

// Console.ReadLine() ele para o script e fica esperando o usuario digitar algo
nome = Console.ReadLine();



```
## Conversão de valores:

```c#

// Aqui eu to recebndo o valor e estou convertendo para um tipo inteiro
int v1;
v1 = int.Parse(Console.ReadLine());
```
## Operadores lógicos:

- | = operador lógico de OU
- & = operador lógico de E
- ! = operador lógico de NEGAÇÃO

## Operações de Bitwise
- De certa forma esse operadores dobram um valor e cortam ele pela metade
- **<<** = Esse sinal dobra o valor
- **>>** = Esse corta pela metade

> *Entretanto a forma correta é: *

**O valor em binario vai ser deslocado, como assim?**

*Supondo que temos o valor de 10 em binario ele é 1010 mas para entender vamos colocar assim: 00001010, então:*

- **<<** = Esse vai deslocar os 5 ultimos bits para a esquerda, caso fique um "buraco" faltando numeros você coloca 0 assim:

    00001010 << 1    

    **Fica Assim: 00010100**

    e o valor de 00010100 é 20 dobrando o valor

- **>>** = Esse vai deslocar os 5 ultimos bits para a direita, caso fique um "buraco" faltando numeros você coloca 0 assim:

    00001010 << 1    

    **Fica Assim: 00000101**

    e o valor de 00000101 é 5 metade do valor
```c#

int num1 = 10;

//Fazendo assim ele executa a operção de Bitwise 1 vez
num1 = num1 << 1;

```
## Enumeradores (enum)
- Básicamente é um recurso que nos permite criar um tipo próprio com valores pré definidos
- Funciona como um objeto com valores constantes que podem ser atribuidos a variaveis dessa forma:
```c#

 class Program
    {
        enum Nen { Conjuração, Manipulação, Emissão, Transmutação, Aprimoramento,Especialização };
        static void Main(string[] args)
        {
            Nen Killua = Nen.Transmutação;
            Console.WriteLine("Killua: " + Killua);
            Nen Gon = Nen.Aprimoramento;
            Console.WriteLine("Gon: " + Gon);
        }
    }

```
## Conversões de tipos (typecast) 

```c#

 class Program
    {
        static void Main(string[] args)
        {
           int vInt = 10;

           // Fazendo assim você converte o int em short
           short vShort = (short)vInt;
        }
    }

```
## Arrays

```c#

//Declarando 

int[] numeros = {10,20,30,40};

// Fazendo desta forma você indica o tamanho do array
string nomes = new string[5];
// Imprimindo
Console.WriteLine(numeros[1]);

// Imprimindo na unity

print(numeros[2]);
Debug.Log(numeros[2]);

```
## foreacch

```c#
int[] numeros = {10,20,30,40};

// a cada interação ele vai pegar cada posição do array numero e vai colocar uma posição de cada vez no I
foreach(int i in numeros){

}

```

## LISTAS E COLEÇOES DE ELEMENTOS 

```c#
// Assim você cria uma lista colocando List pra começar uma
// <tipo de dados da lista>
// nome da lista
// depois você intancia uma lista
List<int> numeros = new List<int>();

void start(){

    // Para adicionar dados em uma lista basta uasr o metodo .Add

    numeros.Add(12);//A lista pode ser acessada igual a um array usando indices
    numeros.Add(5);

    numeros.Remove(5);// Removendo o numero 5
    numeros.RemoveAt(1);// Removendo o numero na posição 1 que seria tabem o 5

    numeros.Sort();// Esse metodo vai organizar a lista de forma crescente


    numeros.Clear();// Serve para apagar tudo que está na lista

    numeros.IndexOf(1);//Você coloca o elemento que está procurando e ele manda o indice dele na lista

    int tamanhoLista = numeros.Count;// Assim você consegue o tamanho da lista
}

```

## COLEÇÃO DICTIONARY / DICIONARIOS 

```c#
// É um pouco semelhante a estrutura de objetos em JavaScript

// Para iniciar um dicionario basta fazer desta forma:
Dictionary<string,string> viloes = new Dictionary<string,string>();
//Dictionary<tipoDaKey,tipoDoValue> 


// Para adicionar valores ao dicionario é igual ao da lista
// viloes.add(key,value);
viloes.add("Slime","Poison" + "Força: 100");

// Para acessar
print(viloes["Slime"]);

```

## Classes
- Uma classe é uma forma de definir um tipo de dado em uma linguagem orientada a objeto. Ela é formada por dados e comportamentos.

- Para definir os dados são utilizados os atributos, e para definir o comportamento são utilizados métodos. Depois que uma classe é definida podem ser criados diferentes objetos que utilizam a classe. 
-  bastando declarar uma variável com o tipo da classe e com a palavra reservada *new* criar um novo objeto.
```c#
//Para declarar classes basta fazer isso:
// É uma boa prática colocar a primeira letra da classe em maiusculo
class Vampiros{
    private string nome;

    void setNome(string name){
        this.nome = name
    }
}


```

## Herança
- A herança é um mecanismo da Orientação a Objeto que permite criar novas classes a partir de classes já existentes, aproveitando-se das características existentes na classe a ser estendida. Este mecanismo é muito interessante, pois promove um grande reuso e reaproveitamento de código existente.  Com a herança é possível criar classes derivadas, subclasses, a partir de classes bases, superclasses. As subclasses são mais especializadas do que as suas superclasses, mais genéricas.

```c#
class Inimigo{
    private string nome;
    private float dano;
    private float speed;
    

    public void setNome(string name){
        this.nome = name
    }
}

// Assim você faz uma classe herdar outra 
// Fazndo isso tudo que esta na outra classe é copiado para essa
// Entretanto para poder usar coisas de outra  classe elas tem que estar publica
class Vampiro : Inimigo{

}

```

## Unity
- Pegando Um objeto na Unity
```c#

//para você achar um objeto na unity e referenciar em uma variavel 
// Basta usar assim:
    // Para declarar um gameOject
    private GameObject Player;
    public GameObject enemyObject;

    private void main(){
        // Assim ele acha o objeto com nome player
        player = GameObject.Find("Player");
    }

```

- Coisas legais como mover um personagem
```c#

    public void followPlayer(){
        Main();
        // Use o Vector3.MoveTowards para movimentar os obj em 3d
        // Use o Vector2.MoveTowards para movimentar os obj em 2d
        //Vector3.MoveTowards(posiçãoInicial,posiçãoFinal, velocidade * Time.deltaTime)
        enemyObject.transform.position = Vector3.MoveTowards(enemyObject.transform.position,Player.trasform.position, speedEnemy * Time.deltaTime);
    }

```
```c#

//para refenciar o "inimigo" no jogo 
// basta cirar um novo arquivo e instanciar a classe assim
// A classe pode se chamar Enemies
Enemies inimigo = new Enemies();

void Start(){
    // assim quando você vincular o srcipt c# em um objeto unity 
    // O this vai se refenciar a ele, e o inimigo.enemyObject vai receber o gameObject[


        
    
    inimigo.enemyObject = this.gameObject;
}

```

## Static
- Na verdade um Membro Estático funciona de forma semelhante a um método "comum". A maior vantagem de utiliza-lo é que não precisamos instanciar a classe para poder utiliza-lo.

## Método Construtor

- Método Construtor ou função construtora ele é chamado no momento do objeto, ele serve para inicializar os vvalores das varivaveis

```C#



class Vampiro{
    public forca;
// Para criar um contrutor você presia crialo dentro da classe e com mesmo nome da classe 
    public Vampiro(int forca1){
        forca = forca1;
    }
}

// E quando for instanciar um objeto com a classe basta passar os atributos nos parentes

Vampiro Dracula = new Vampiro(forca1);

```
## Método Destrutores
- É chamado quando o objeto que foi instanciado é destruido 
- A destruição o corre quando ele ja é utilizado e o programa precisa liberar espaço automaticamente 

```c#

//Para criar um metodo destrutor ele precisa ter o memsmo nome da classe 
// E antes do nome ele precisa ter um "~"
~Jogador(){
     
}


```

## This e Base
- O this se refere ao objeto/classe no qual ele  foi chamado

```c#

public class Pessoas{
    string nome;

    void setNome(string nome){

        // O this ele meio que vai "copiar" toda a classe pra ele fazendo entaõ ser possivel acessar o nome do lado de fora da funnção
        // Sem o this fica ass Pessoas.nome = nome
        this.nome = nome;
    }
}

```

- Ja o base serve meio que para referenciar classe diferentes, ou seja é uasdo geralmente para pegar variaveis de outras classes

```c#



public class Inimigo{
    public string nome;

}

public class Orc : Inimigo{
    void ataque(int velocidade){
        base.velocidade = velocidade
    }
}

```

## Sobrecarga De Métodos

- Geralmente é usado quando queremos criar um método e depois queremos fazer variações dessse mesmo metodo

```c#
public class calculadora{

    public int soma(int a, int b){
        return a + b
    }
    // fazendo assim você crai uma variação da mesma funçao que so altera o tipo de dados do param
    public int soma(float a, float b){
        return a + b
    }


    // Mas como fica  na hora de chamar?
    // A reposta é normalmente, ele vai so trocar de função quando os parametros forem diferentes
    soma(a,b)

}

```

## Sobrescrita de Métodos - (Virtual Override)

- Serve para sobrescrever um método, mas como assim?
- Simples, vamos supor que você tem o metodo de uma classe e  quer que outra classe herde esse método, entretanto você quer que esse mesmo metodo tenha algo diferente basta fazer assim:

```c#

public class Monstro{
    // O virtua serve para que o método possa ser sobrescrito na classe descendente (que herda da classe principal)
    public virtual void Ataque(){
        //funcionalidades do metodo
    }
}

public class Gosma : Monstro{
    // Um método override fornece uma nova implementação de um membro herdado de uma classe
    // é necessário para estender ou modificar a implementação abstrata ou virtual de um método
    public override void Ataque(){
        // aqui dentro você chama a função original
        base.Ataque();

        //e embaixo vc coloca mais funcionalidades
    }

}

```


## Modificadores de Acesso : Public vs Private

- Public : Serve para dar acesso livre a variavel, classe , funções, o acesso livre se refere que quando a classe detentora da variavel publica for herdada por outra essa vai ter acesso a variavel

- Private : essa são privadas elas não podem ser acessada por outas classes


## Modificador de Acesso Protected

- Serve para impedir que outras classes que não herdaram de outra acesse uma variavel

```c#
public class Numeros{
    protected int num1;
}

public class Acesso1:Numeros{
    //classes herdadas podem acessar variaveis portected
    num1= 10;
}
public class Acesso2{
     //classes não herdadas não podem acessar variaveis portected
    num1=1;
}


```

## Modificador De Parâmetro Ref e Passagem Por Refêrencia

- É uma forma de econimizar memoria, para otimizer apps ou jogos
- Sempre que você cria uma função pedindo parametros ela sempre vai criar um espaço novo na memoria então para resolver isso 
- Usando os metododos de referencia o compilador não vai armazenar os dados em outros locais mas vai pegar o locar de memoria da variavel passada como parametro
- Observação: se você alterar o valor da variavel usada como parametro você altera a original
```c#

int numero = 10;

void iniciar(){

    // Quando você for chamar a função e passar parametros você 
    // precisa passar a diretiva ref 
    exemplo(ref numero);
}

// Usanodo ref na criação da função você deixa explicito que 
// ira usar uma referenci e que o compilador não crie
// outro espaço na memoria
void exemplo(ref int n){
    print(n);
}



```

## Modificadores de Parâmetros: Argumento Out
- O out é usado quando queremos mandar varios returns em uma função

```c# 

void iniciar(){
    int soma,sub;


    // Ai quando você for chamar a função voce precisa passar qual a variavel que vai armazenar a variavel do out
    calculadora(1 , 3 , out sub)

}
// Você precisa expecificar qual será a outra saida pelos parametros usando o out
void calculadora(int a , int b , out int sub){
    sub = a-b;
    return a+b;
}


```

## Modificadores de Parâmetros: Argumento Params (Passagem Multidimensional)
- Da a passar varias informações como parametro e todas as informações são armazendads em um array é não precissa saber o tamanho do array

```c# 

int SomaNumeros(params int[] array ){
    int result = 0;

    for(int i= 0;i< array.Length;i++){
        result += array[i];
    }

    return result;
}


```
## Ramdom.Range
- É um comando para gerar numeros randomicos
- Ramdom.Range(numeroInicial,Numerofinal)

## Comando Goto
- Serve para levar a execução para partes do código

```c#

//para indicar onde o goto deve ir basta fazer assim
pontoInicial:

//Assim você faz para usar o goto
goto pontoInicial


```

## Classes e Métodos Abstratos
- classes abstratas Servem de referencia para outras classes que herdem dessa classe, serve como se fosse um molde
-Tipo de dado composto de dados, propriedades(variaveis), e metodos(funções),uma classse que serve para instanciar objetos, ela que vai ditar as regras dos objetos, apartir de uma classe você pode instanciar diversos objetose cada objetos são individuos diferentes 
- metodos abstratos você não consegue fazer uma implementação dele na classe que foi criado, e todo metodo abstrato precisa necessariamente ser implementado na classe herdada
```c#

public abstract class Viloes{
    public float forca,velocidade;

    public void Viloes(){
        forca=100;
        velocidade=50;
    }

    // Funciona como vc tivesse apenas declarrando a função
    abstract public void ataque();
}

public class Bane:Viloes{
    // e para implementar basta usar o override para sobrescrever a função
    override public void ataque(){

    }
} 
```

## Classe Sealed(Classe selada)
- Esse tipo de classe não pode ser herdada por outras classes
```c#

sealed class A{

}


``` 
## Metodos Sealed(metodos selados)
- Esse tipo de metodo não pode ser redefinido
```c#

sealed void escrerva(){
    Console.WriteLine("Ola");
}


``` 

## Struct / Estruturas

- É um tipo é usado para armazenar varios tipos de informações
- Deve ser criado fora da classe

```c#

// Para Fazer uma variavel receber o struct

Vilão Bane;


// Para acessar 
Bane.forca = 20;


// Para criar um struct 
public struct Vilão{
    public int forca=10;
}

```

## Interfaces
- Para a criação de uma interface é igual a uma classe sempre fora de outras classes
- Como boa prática é usado o "I" antes do nome da interface
- Ele é usado para criar metodos abstratos e depois é possivel implementar em classes
- Usado geralmente usado para criar implementações que podem substituir multiplos if's
- Funciona como uma herança(Mas não é chamado herança e sim contrato, por exemplo a classe faz um contrato com a interface) ele passa as funções abstratas para a classe e a mesma é obrigada a implementar todas as funções 

```c#

public interface IInteracoes{
    void atacar();
}

// Assim voce faz o contrato de uma interface
public class Inimigo:IInteracoes{
    public void Interacoes(){
        //Implementação do código
    }
}

```

- Supondo que você queira passar parametros você faz assim

```c#

// Entre <nome do parametro>
public interface IInteracoes<I>{
    void atacar(float I);
}


//Quando for realizado o contrato voce precisa indicar o tipo da variavel
public class Inimigo:IInteracoes<float>{
    public void Interacoes(float game){

    }
}

```

## Delegates
- Ele é geralmente usado com eventos 
- Serve para fazer referencia ao um metodo 
- Serve para armazenar funções em uma variavel
```c#
// Assim você inicia um delegate, de certa forma o exemploDel() vira um tipo
// É necessário que você coloque o tipo de retorno e a função que a variavel vai receber deve ser do mesmo tipo
delegate void exemploDel();

// Assim voce faz com que a variavel seja possivel receber funções
exemploDel variavelDel;

     
static void Main(string[] args)
{
    // Para atribuir é assim
    // Perceba que aqui voce apenas passa a função nao chama ela
    variavelDel = ataque;


    //A maior vantagem é que voce pode declarar varias funçoes na mesma variavel fazendo com que ela execute varias funções ao mesmo tempo

    variavelDel += pular;


    // Para remover uma função basta usar 

    variavelDel-=pular;
}

void ataque(){

}

// E somente usando delegate voce pode passar uma função como parametro
// Entretanto a função abaixo ira dar erro pois voce declarou o exemploDel com uma assinatura de sem paramaetros
// E como você passou param para algo que não aceita ira dar erro
void pular(exemploDel metodo){
    
}

void defesa(){
    
}

```

## Events
- Serve para notificar alguma classe que alguma ação aconteceu 

```c#
// Classe personagem

public class player:MonoBehaviour{
    private void Start(){

        Vilão.OnEnemyDied+=Comemorar;
    }

    private void Comemorar(){
        Debug.Log("Comemorar")
    }
}


```

```c#
// Classe vilão

public class Vilão:MonoBehaviour{
    // Para usar eventos é necessario o uso de delegates 
    public delegate void EnemyDeath();


     // Usando o public static event, você inicia a criação de um evento que pode ser acessado por otras classes
     // é necessario associar ao delegate o tipo do delegate 
     // Depois Para criar o nome do evento por convenção é colocado o ON primeiro e usado o nome no pasado
    public static event EnemyDeath OnEnemyDied; 

    public enemyLife = 10;

    void Update{
        if(enemyLife == 0){
            if(OnEnemyDied != null){
                OnEnemyDied();
            }
            
        }
    }


```
## Involke 

- Serve para poder invocar metodos apos um intervalo de tempo 
- Vantagens
    - Ele é bastante simples de usar 
- Desvantagem 
    - Não funciona muito bem quando usado em larga escala pos gasta muita memoria
```c#

void Start(){

    //Involke("Nome da função", segundos de espera pra executar)
    Involke("Like",5);
}
void Like(){
    Debug.Log("Teste");
}

```

## Propriedades, Get e Set

- Servem para acessar ou mudar dados, variaveis privads dentro de classes 
```c#

public class Exemplo{
    private int numero = 10;
    pubilc int Numero{
        //Dessa forma eu consigo somente VER a variavel o valor no caso 
        get { return numero };
    }

    public void SetNumero{
        //Dessa forma eu consigo somente gravar um valor na variavel
        // O value é o que ele vai receber quando for chamado em outra classe
        // obj = Exemplo.SetNumero = 10;
        set { numero = value };
    }


}


```