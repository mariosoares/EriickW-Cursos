# ***JavaScript Core***

 - Linguagem de programação que roda no navegador do usuário (front-end)
    - Se você cilcar em algum botão da página e aparece uma janela. Isso é o JavaScript
    - Alteração do site ou aplicativo, conform a interação do usuário 
- Roda também no computador (back-end)

## O que podemos fazer ?
- Podemos criar aplicações web, mobile(React Native), desktop (Electron)
- Empresas famosas que usam:
    - Facebook (instagram, Whatsapp)
    - Google (Youtube, Gmail, Drive)
    - Uber
    - Netflix
    - TikTok
    - ...

- 99.99% dos sites na web usam JavaScript
- Linguagem obrigatória para que programa o Front-end Web

## Evolução

- A comunidade cresce cada vez mais e a linguagem está sempre evoluindo


## Começando

 **A importancia da Sintaxe**

- Toda linguegem tem
- Uma boa comunicação necessitade uma boa sintaxe
- 82% dos erros para iniciantes programação

**Maneira correta :** 
```js
    console.log("Olá, Mundo"); // O console.log('') serve para escreveruma mensagem no console do navegador
```

**Maneira errada ( Se esquecer de um ponto sequer o programa da erro)**

```js
    consolelog("Olá, Mundo");
```

**Comentários**
- no Javascricpt e em outras linguagens de programação um comentário serve para deixar observações ou alguma coisa que você queira 


    ```js
      // Usando "//" você cria um comentário em linha 
     ```
    ```js
    /* 
       Usando  barra asterisco você cria um comentário em bloco ou de multiplas linhas
    */
    ``` 
    - OBS: os comentarios não são enterpretados pelo navegador 


## Tipos de dados 


 - **String** 
- [Pasta dos exemplos de strings](Tipos_de_dados/strings)
    - Cadeia de caracteres Ex : ABC
    - Para mostrar ou identificar uma string:
        - "" aspas duplas
        - '' aspas simples
        - ´´ template literals ou template string

        <br>


- **number**
- [Pasta dos exemplos de numbers](Tipos_de_dados/numbers)
    - números
    
        - 33 (numeros inteiros)
        - 12.5 (numeros reais - float)
        - NaN (Not a Number - não é um número)
        - Infinity (infinito)

        <br>

- **Boolean**
- [Pasta dos exemplos de boolean](Tipos_de_dados/boolean)
    - Somente 2 valores
        - true // verdadeiro
        - false // falso

    ```js
    console.log(true)
    console.log(false)
    ```
<br>

- **undefined**
    - indefinido

<br>

- ***null***
    - nulo
    - objeto que não possui nada dentro
    - diferente de indefinido

<br>

- ***Object***
    - Objeto
    - Propriedades / atributos
    - Funcionalidades / métodos
    - {propriedade: "valor"}
    - dado estrutural

    <br>

    ```js
    console.log({
        name: "Erick",
        idade: 18,
    })
    ```

    <br>

- ***Array***
    - Ele funcina como uma lista
    - Ele agrupa dados

    <br>

    ```js
    console.log(["Erick , 18"])
    ```

    <br>

## ***Variáveis***
- São nomes simbólicos para receber algum valor
- atalhos de código 
- Identificadores
- 3 palavras reservadas para criar uma variável
    - var
    - let
    - const

       <br>

    ```js
        var numero = 1; //forma mais antiga de indicar uma variavel

        let clima = "quente"; // forma mais atual de indicar uma variavel

        const nome = "Erick"; //o const é uma forma de indicar uma constante ou seja não pode ser alterada durante a execução do código

        console.log(`${numero} ${clima} ${nome}`) // saida: 1 quente Erick
    ```

    <br>

- O JS é uma linguagem fracamente tipada e dinâmica
- ou seja variáveis não precisam ter um tipo previamente definido
- Podemos mudar o conteúdo da variável

### ***Scope***
- O scope(escopo) determina a visibilidade de alguma variável no JS
####  ***Block statement (Declaração de bloco)***

<br>

```js
//Vamos iniciar um bloco
{
    // aqui dentro é um bloco e posso colocar qualquer código

} // aqui dechamos o bloco
```
- O bloco , també criará um novo escopo. Chamamos de `block-scoped`

### ***var***

```js
// var é global e poderá funcionar fora de um escopo de bloco ou seja acontece o hoisting onde o JavaScript leva o var x para o começo do programa

console.log('> existe x antes do bloco? ', x);

{
    var x = 0;
}
console.log('> existe x depois do bloco? ', x);

```

### ***let***

```js
// const e let são locais e só funcinam no escopo onde foram criadas


console.log('> existe x antes do bloco? ', x);

{
    let x = 0;
    console.log('> existe x dentro do bloco? ', x);
}

console.log('> existe x depois do bloco? ', x);
```

### ***const***
- Funciona da mesma forma que o let entretanto o valor atribuido a ele não pode ser alterado durante a aplicação

## ***Nomeando variáveis***

* JS é case-sensitive (sensível ao caso)
* JS aceita a cadeia de caracteres Unicode

- ***Posso:***
    * Iniciar com esses caracteres especiais: $ _
    * Iniciar com letras
    * Colocar acentos 
    * Letras maíusculas e minúsculas fazem diferença
- ***Não posso:***
    * Iniciar com números 
    * Colocar espaços vazios no nome 
- ***Ideal***
    * Criar nomes que fazem sentido 
    * De preferencia um nome que explique o que a variável é ou faz
    * camelCase(usar letras maisuculas para cada troca de palavra ex: meuNome)
    * snake_case
    * Escrever em inglês
- statement (declaração)

## ***Functions***
- As functions possuem duas finalidades 
    - Explicar o que um trecho de código faz 
    - Repetir esse trecho de codigo diversas vezes sem precisar copiar e colar
- Ela é um tipo de dado estrutural 

```js
function frase(){
    console.log("Bom dia");
    console.log("Boa Tarde");
    console.log("Boa noite");
}
frase();

/* Saída:

Bom dia
Boa Tarde
Boa noite
*/
```
### ***Argumentos e parâmetros :***
```js
//Função anonima , function expression, é quando você atribui o uma função a uma variavel sem colocar o nome da função

//num1 e num2 são parâmetors da função, servem como "variaveis" dentro da função onde quando a função for chamada os valores podem ser passados em forma de argumentos

const sum = function(num1,num2){
  console.log(num1+num2)
}
sum(2,3)// Arguments - Argumentos 
```
<br>


### ***Retornando valores dentro da função :***

```js
// Outra forma de retornar dados de uma função (de forma mais eficiente) é necessário usar o "return", e logo após dele colocar o dado que deve ser retornado no caso mostrado ao chamar a função
const sum = function(num1,num2){
  let total = num1+num2;
  return total
}

let number1= 30;
let number2=40;
console.log(`O numero 1 é ${number1}`);
console.log(`O numero 2 é ${number2}`)
console.log(`A soma entre eles é ${sum(number1,number2)}`)
```

<br>

### ***Function Scope :***
```js

let subject = 'create video';


// O valor de uma variável pode ser alterado dentro de uma função entretanto o valor que foi colocado na variável que está sendo usado como argumento so vai existir dentro do escopo da função, ou seja fora dela a variável continua com seu valor anterior   
function createThink(subject){
  subject='study'
  return subject;
  
}
console.log(subject);
console.log(createThink(subject))

/* Saida:

create video
study

*/
```

<br>

### ***Function hoisting :***
```js
sayMyName()

// No JavaScript (e outras linguagens de programação) as funções que são chamadas antes recebem um hoisting que siginifica "elevação" ou seja quando o programa iniciar ele vai "jogar" a função pra cima de todo o código fazemdo com que essa opção de chamar a função antes seja possivel
function sayMyName(){
  console.log("Erick")
}
```
- Casos onde a função não sofre elevação
```js
sayMyName()

// Quando é escrita em forma de expressão ela não será elevada ou seja todas as alternativas de escrver uma função abaixo irão dar erro

const sayMyName = function sayMyName(){
  console.log("Erick")
}

var sayMyName = function sayMyName(){
  console.log("Erick")
}
let sayMyName = function sayMyName(){
  console.log("Erick")
}
```

<br>

### ***Arrow Function :***
- Maneira mais moderna e compacta de escrever uma função

```js

//Geralmente é usado o const para fazer uma arrow function mas não é obrigatório pode usar outros modos de declarar variáveis

const sayMyName = () => {
  console.log('Erick')
}

sayMyName()
```

### ***callback function :***
- É uma função que recebe uma função como parâmetro ou uma função que serve de parâmetro para outra função (as duas são a mesma coisa , rs)

```js

function sayMyName (name) {
  console.log('Antes de executar a funcao callback');

  name();

  console.log('Despois de executar a função callback')
}


sayMyName(
    () =>{
        console.log('Estou em uma callback');
    }

);
```

<br>

### ***Funções Construtoras :***

```js
//Funciona como um objeto usando a palavra chave "new" você cria o objeto, para criar "Caracteristicas" basta usar a palavra chave "this"

function Person(name){
  this.name = name
} 

const erick = new Person("Erick");

console.log(erick)
```

## ***Manipulando dados***

### ***Type conversion coersion***
 - Alteração de um tipo de dado
 - **Type conversion ( typecasting )** : Altera explicitamente um tipo de dado para o outro
 - **Type coersion** : É quando o JavaScript altera impicitamente
 ```js
 // O Javascript quando ele se depara com esse código ele vai coverter o 5 em uma string para que o programa não apresente erros, ou seja, em vez de somar ele vai concatenar as duas string
console.log('9'+ 5)
// Saída:  95

// Aqui você esta alterando o valor string em número ou seja o '9' vai valer 9 ou seja a soma irá ser feita corretamente
console.log(Number('9') + 5)
//Saída: 14
```

```js
// Contar quantos caracteres tem uma palavra e quantos digitios tem um número
let word = "Paralelepipedo";
console.log(word.length);

// Dados de tipo number não recebem o .length ou seja para mostrar quantos caracteres ele possui precisa transforma-lo em string
let number =1234;
console.log(String(number).length)
```

### ***Manipulando Strings e Números***

```js
// Transforamr um número quebrado com duas casas decimais e trocar ponto por vírgula

let number = 473838.373838;
/* O .toFixed serve para colocar um limite de números após a vírgula, ela é uma função atrelada ao objeto number,
 quando uma função é atrelada ao um objeto chamamos de método, 
 e dentro dos parentese ele espera a quantidade de números após a vírgula o retorno disso será uma string*/
console.log(number.toFixed(2).replace(".",","))

// Para trocar o ponto por virgula basta usar o .replace("O que você quer trocar"  ,  "O que vc que colocar no lugar")
```
<br>

```js
// Transforme letras minúsculas em maiúsculas. Faça o contrario disso também


let word = "Olá mundo";
//Maiúsculas
console.log(word.toUpperCase())//Tudo em JS é um objeto ou seja a variavel word é um objeto que recebe o metodo .toUpperCase e esse metodo so funciona com strings

//Minúsculas
console.log(word.toLowerCase())

```
<br>

```js
// Verificar se o texto contém a palavra Programar

let phrase = "Eu gosto de ler"

// O metodo .includes funciona para verificar se tem ou não dentro da frase o que foi colocado detro do parenteses  
console.log(phrase.includes("Programar"))

// Observação: o .includes é case sensitive ou seja maiúsculas e minúsculas fazem diferença se colocar na frase programar em minúsculas o programa da erro

```

<br>

## Manipulando Strings e Arrays
```js
// Separe um texto que contem espaços, em um novo array onde cada texto é uma posição do array. Depois disso, transforme o array em um texto e onde eram espaços, coloque _

let phrase = "Eu gosto de programar"

//O metodo .split recebe como argumento um caractere que apartir dele a frase será dividida e colocada em um array
let myArray = phrase.split(" ")

// O metodo .join serve para unir arrays e dentro do parenteses fica qual será o separador
let phraseWithUnderscore = myArray.join("_")
console.log(phraseWithUnderscore )

```

<br>

```js
// Contar elementos de um array

let array =[2,4,5,5,6,7]

console.log(array.length)
```

<br>

```js
// Transformar uma cadeia de caracteres em elemntos de um array

let word = "Manipulação"
// Array é um objeto disponivel de forma global no código e o metodo .from espera receber como argumento uma string 
console.log(Array.from(word))
```

<br>

```js
// Manipulando Arrays

let techs = ["html","css","js"]

// Adicionar um item no fim
//O metodo .push identifica qual é o ultimo item do array e adiciona o que foi colocado como argumento dentro dos parenteses
techs.push("node.js")

// Adicionar no começo
// Funciona da do meio inverso ao do push
techs.unshift("sql")

//Remover do fim
// Basta apenas colocar o metodo .pop() que ele simplesmente retira o ultimo item do array
techs.pop()

// Remover do começo
// Basta apenas colocar o metodo .shift()  que ele retira um item do começo
techs.shift()

// Pegar somente alguns elementos do array
// Usando o .slice() você meio que "corta" e mostra somente de qual posição ate qual posição você quer ver

//console.log(techs.slice(1,3))

// Remover 1 ou mais items em qualquer posição do array
// o metodo .splice(qual posição no array, quantidade de items a serem retirados) serve para retirar 1 ou mais itens de um array

//techs.splice(1,2)

// Encontrar a posição de um elemento no array
// O metodo .indexOf() serve para procurar qual a posição do item dado como parametro dentro do array e o valor que será encotrado sera colocado na variavel index
let index = techs.indexOf('css')

console.log(index)

```