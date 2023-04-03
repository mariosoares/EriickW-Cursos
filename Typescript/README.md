# Typescript

- Typescript é um **superset** para a linguagem JavaScript
- Ou seja , adiciona funções ao JavaScript, como declaração de tipos de variavel
- Pode ser utilizado com Frameworks / libs, como **Express e React** 
- Precisa ser compilado em Javacript, ou seja, não executamos TS
- Adiciona **confiabilidade** ao programa (tipos)
- Provê novas funcionalidades a JS, como **Interfaces**
- Com TS podemos verificar erros antes da execução do código ou seja, no esenvolvimento 
- Deixa o javascript mais explicito, diminuindo a quantidade de bugs 
- Por estes e outros motivos perdemos menos tempo com bugs


## Começando

> Instalação:

- Primeiro é preciso ter o node  depois no terminal
- Baixar ele globalmente `npm i -g typescript`
- Para que possa executar adequadamente você precisa inicar o arquivo de configuração assim:
    - `tsc --init`
    
- E para compilar basta digitar no terminal `tsc` e `tsc -w` para compilar automaticamente 
- Lembrando que para arrumar onde vai o arquivo conpilado você precisa ir no arquivo `tsconfig.json` 
    - Primeiro na parte de `MODULES` voce vai mudar o `rootDir` para o caminho de onde esta seu arquivo ts 
    ```json
        /* Modules */
        "module": "commonjs",                        
        "rootDir": "./src/script",  
    ```
    - Depois você precisa dizer onde ele vai mandar o arquivo conpilado de javascript na parte de `EMIT` mude o valor de `outDir` para a pasta que irá ficar o javascript compilado 

    ```json
         /* Emit */
        // "sourceMap": true,
        // "inlineSourceMap": true,  JavaScript. */
        // "outFile": "./",                                  
        "outDir": "./dist/script",   

    ```

## Tipagem

```ts
// Para tipar uma variavel basta colocar o seu tipo apos o nome

// Para tipos numericos:

// annotation quando você da o tipo do dado
const x :number = 10;

//inferencia quando você deixa o typescript dar o dado
let y = 21


// Para tipos de texto
let firstName: string = "Erick"


// Para tipos de boolean
let isAdmin: boolean = true

// Array
const myNumbers:number[] = [1,2,3]


// Tuplas 
// é um array de dados mas que deve ser seguido e deve ser exatamete assim
let myTuples:[number,string,string]
```