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
