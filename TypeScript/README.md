# TypeScript

## ***O que é TypeScript***
- TypeScript é um **superset** para a  linguagem JavaScript
- Ou seja, adiciona funções ao JavaScript, como a **Declaração de tipos de variável**
- Pode ser utilizado com frameworks/libs, como: **Express e React**
- Precisa ser compilado em JavaScript, ou seja, não executamos TS
- Desenvolvido e mantido pela Microsoft

## ***Por que TypeScript?***
- Adiciona confiabilidade ao programa(tipos)
- Provê novas funcionalidades a JS, como interfaces
- Com TS podemos verificar os erros antes da execução do código, ou seja, no desenvolvimento
- Deixa JavaScript mais explicito, diminiuindo a quantidade de bugs,
- Por estes e outros motivos perdemos menos tempo com debug 

## ***Instalando o TypeScript***
- Para instalar o TS vamos utilizar o **npm**
- O nome do pacote é **typescript**
- E vamos adicionar de forma global com a **flag -g**
- A partir da instalação como **executar/compilar** TS em qualquer locar da nossa máquina com o comando **tsc**
- Para adicionar o arquivo de confi basta usar o    tsc --init
- Arquivo com exemplo [Aqui](src/index.ts)
- Para ligar a compilação automatica basta usar o tsc -w

## ***Inferencia X Annotation***

**inferencia**:
- Qunado não é explicito o tipo de dado que a variavel é 
- Ela deixa o compilador ou interpretador identificar o tipo da variavel 

**annotation**:
- Quando nós colocamos o tipo explicitamente 
 
## Tipos Básicos
- string
- number
- boolean
- tuplas: serve para criar um array que pode colocar os tipos expecificos
- object literals: serve da mesma forma que uma tupla mas nele deve ser colocado as Keys e os valores com os seus respectivos tipos
- any: é uma tipagem que aceita todo tipo de dado
- union type: serve para quando uma variavel precisa receber dois tipos de dados
- type alias: serve para criar meio que variaveis para tipos para que não aja repetição de codigo
- interface: é um contrato que força uma classe ou um objeto (no caso do JavaScript) a implementar uma funcionalidade especifica.
- **Obs:** Os tipos devem ser indicados com letra minuscula pois em letra maiuscula são os objetos

```typescript
let num1: number = 12;
let name: string = "Erick";
let isTrue: boolean = true;
let myNumbers: number[] = [1, 2, 3]; // Para criar arrays deve se indicar o tipo e colocar os colchetes logo após

//Tupla
// Quando for colocar os valores no array deve colocar nessa mesma ordem de tipos
// Se o que foi inserido não for do tipo especificado ele dará erro
let myTuple: [number, string, string]

//object literals
const user: {name:string, age:number} = {
    name:"Erick",
    age:18
}
//any
let a: any = 0

// union type
let id: strimg | number = 10

// type alias
type myIdType = number | string
const userId: myIdType = 10



```
```typescript
//interface
interface IAnimal{
    nome: srting;
    tipo: "terrestre" | "aquático";

}
// Você pode extender a interface animal para outra interface, como assim? Simples você pode pegar todos os elementos as Keys e os values e adiciona ao outro elemento

interface IFelino extends IAnimal{//A interface IFelino vai receber Todas as Keys da interface IAnimal sem precisar passar os tipos novamente

}

```
## Tratando a tag input
- O typescript não consgue identificar uma tag html sem que seja dito a ele ou seja voê precia indicar o tipo da tag html
- Sem especificar não pode usar os métodos do input
```typescript
    const input = document.getElementById("input") as HTMLInputElement;

    input.addEventListener("input", (event)=>{//Até mesmo quando você vai pegar um evento você precia dizer de onde esta vindo esse evento
        const i = event.currentTarget as HTMLInputElement;
        console.log(i.value);

    });


```

## Generic Types
- Serve para quando não sabemos o tipo de valor que iremos receber 
- Ou seja deixamos que o TypeScript identifique os tipos 
- usando um <> (diamante) e dentro dele colocamos um nome para que seja usado em outro lugares
```typescript
function adicionarALista<T>(array: any[], valor: T){
    return array.map(item => item + valor)
}

adicionarALista([1, 2, 3], 1)

```
## Definindo o tipo de retorno de uma função
```typescript
// Assim você pode definir o tipo que a função vai retornar
// Isso impede que os valores que irão sair não sejam de outro tipo

function calculaNumeros(number1: number, number2: number): number{
    return number1 + number2
}

console.log(calculaNumeros(1,2))

```
## Quando usar o tipo void em funções
```typescript
// Ela serve quando não temos retorno de dados 
function calculaNumeros(number1: number, number2: number): void{
    console.log( number1 + number2)
}

```
