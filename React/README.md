# React

- Uma biblioteca JS para ciração de interfaces 
- Uilizado para construir SPAs (Single page application);
- Baseado em componentes 
- Utiliza o JSX para renderizar o HTML 
- E aplica o Virtual DOM para realizar as alteracões de Dom
- Podemos adicionar a um projeto ou criar um projeto com ele 

## Como instalar o React ?

- Para instalar o React vamos utiliazar uama ferramaenta chamada Create React App
- Recebemos todos os arquivos da biblioteca e temos como executá-la
- Para utilizar precisamos do Node e também npm
- Esta ferramenta também otimiza o app gerado para produção
- é possivel inciar a aplicação com `npm start`

## Entendendo o JSX
- O `JSX` é como um HTML, porem dentro do código JavaScript
- É a principal maneira de esvrever HTML com React
- Podemos `Interpolar variáveis`, inserindo ela entre {} 
- É possível também executar funções em JSX
- Inserir valores em atributos de tags também é valido em JSX


```js
// Para poder mecher no html do site vai no arquivo App.js na pasta src
function App() {
    // Lembrando você precisa fazer tudo dentro dessa função
    // Fora dela fica somente as importações e exportações 
    // Você pode declarar variaveis  dentro
  const nome = "Erick";


    // lembrando que no return deve somente retornar uma unica tag que estará englobando todas as outras
    //
  return (
    // Para declarar classes em JSX
    <div className = 'App'>
        <p>
          Olá {nome}
        </p>
    </div>
  );
}

export default App;


```

## Componentes 
- Permite dividir a aplicação em partes 
- Os componentes renderizam JSX, assim como App.js (Que é um componente)
- Precisamos criar um arquivo de componente 
- E importálo onde precisamos utilizar 
- Normalmente fiam em uma pasta chamada components

```js
// Exportando co default

function Ola(){
    return <p>Olá Mundo !!</p>
}
// Para caso você queira mandar somente isso 
export default Ola

```
```js
// Importando
// É de extrema importancia que o nome do arquivo que ta o componente tenha o nome de index
// Pois na hora de importar basta somente colocar o nome da pasta
import  Ola  from "./components";


function App() {

  const nome = "Erick";

  return (
    <div>
        <p>
            <Ola />
        </p>
    </div>
  );
}

export default App;
```

- Importando e exportando com object destruturing 
```js
// Exportando co default

function Ola(){
    return <p>Olá Mundo !!</p>
}
// Para caso você queira mandar mais de uma coisa 
// Você precisa mandar eles em formato de objeto 
export {Ola}

```
```js
// Importando
// E na hora de importar você precisa usar uma desestruturação para tirar o que você quer do objeto
import  {Ola}  from "./components";


function App() {

  const nome = "Erick";

  return (
    <div>
        <p>
            <Ola />
        </p>
    </div>
  );
}

export default App;
```

## Props

- As `props` são valores passados para componentes 
- Podemos deixá-los `dinâmicos`
- Ou seja, `mudando a execução` por causa do valor da prop
- O valor é passado como um atributo na chamada do componente 
- E precisa ser resgatado dentro de uma prorpiedade / argumento chamada props na função de definição do componente
- As props são somente de leitura   
```js
//As props vão ser enviadas para ca em formato de objeto contendo todas as props
function Propriedades(props){
    console.log(props)

    return <p>{props.text}</p>
}
export default Propriedades

```
```js 
import Propriedades from "./components/Propriedade";

function App() {


  return (
    // Assim voce passa uma prop 
    // Dando qualquer nome para ela e atribuindo um valor
    <div>
  
        <Propriedades text="Sou uma prop" />
    </div>
  );
}


```
```js
//Mas caso tenha muitas props 
// Uma boa prática é usar a desestruturação para tirar os valores desejados
function Propriedades({text}){
    console.log(text)

    return <p>{text}</p>
}
export default Propriedades

```
## Adicionando CSS 

- O css pode ser adiiconado de forma global na aplicação, por meio do arquivo index.css por exemplo
- Porem é possível estilizar a nível de componentes 
- Utiliazamos o CSS modules para isso
- Basta criar um arquivo como: Componente.module.css
- e chamar este css no componente

## Fragmentos 
- Os React Fragments permite a criação de um componente sem elemento pai
- O propósito é descomplicar os nós do DOM
- A sintaxe é <> e </>, não ha nome para a tag
- Criamos no próprio jsx

## Avançando em props
- Podemos definir tipos para as props, realizando uma espécie de validação
- Definimos em um objetochamado propTypes no próprio componente
- E ainda há possibilidade de definir um valor padrão
- Neste caso utilizamos o objeto defaultProps

```js

// Aqui você esta importando uma biblioteca que permite dar o tipo de dado para uma prop
import  PropTypes  from "prop-types"

export default function AvanProps({marca, lan}){
    return <p>Carro:</p>
}


// Aqui usando o .propTypes recebendo um objeto que vai o nome da prop como key
// do objeto e como valor o tipo de dado que ela vai receber
// com isso o tipo de dado deve ser respeitado
AvanProps.propTypes = {
    // colocando como value o PropTypes.(tipo do dado)
    marca: PropTypes.string,
    // colocando o isRequired você faz com que seja de extrema importancia aquela prop
    // com isso o componente não funciona sem
    lan: PropTypes.number.isRequired,
}


// Aqui é para deixar valores pré definidos nas props caso elas não seja passadas
AvanProps.defaultProps = {
    marca: "Faltou a marca",
    lan:0,
}
```
## Eventos
- Os eventos de React são os mesmos eventos do DOM
- Ou seja, temos eventos para responder a um click
- O evento atrelado a uma tag que irá executá-lo
- Geralmente um método é atribuido ao evento
- Esse m´rtodo deve ser criado no componente

## useState

- O `useState` é um hook do React
- Com ele conseguimos manusear o estado de um componente de forma simples 
- Este hook funciona muito bem com eventos 
- Podemos atrelar um evento a mudança de state