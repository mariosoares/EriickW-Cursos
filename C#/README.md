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
// Para criar um contrutor você presia crialo dentro da classe
    public Vampiro(int forca1){
        forca = forca1;
    }
}

// E quando for instanciar um objeto com a classe basta passar os atributos nos parentes

Vampiro Dracula = new Vampiro(forca1);

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