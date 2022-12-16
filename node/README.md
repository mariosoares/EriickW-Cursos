# Node
Para executar javascript é necessário baixar o node

 > ## Globais

- `__dirname` : Mostra o diretório local, onde está o arquivo que estamos executando

```js
console.log(__dirname)
```

- `__filename` : Caminho completo + nome do arquivo

```js
console.log(__filename)
```

> ## O que são e como utilizar módulos

- `require()` : uma maneira de chamar módulos nátivos do node ou módulos criados
```js
// Aqui ele vai buscar um módulo node, e esse modulo é um objeto
const path = require("path")


// aqui usando o .basename(__filename é do nome do arquivo) com o basename ele vai retornar somente o nome do aquivo
console.log(path.basename(__filename))
```

> ## Criando Módulos
- `module.exports` serve para exportar algo de um arquivo em formato de módulo
```js
//você pode exportar quase tudo com isso

module.exports = "Olá mundo !!"

```
- importando para outro aquivo

```js

//dentro do parentes você deve colocar o caminho do arquivo onde foi criado o modulo
const myModule = require('./modulo.js')

```

> ## Pegando informações do processo 

```js
//vai retornar lista de argumanto que está rodando no node
console.log(process.argv)
```

> ## Passando flags como argumentos

```js
console.log(process.argv)

//para você passar argumantos para o process vc deve passalos na chamada no node
// Supondo que o arquivo é chamdo de process.js para executalo no node fica assim

node process --name "Erick Willian"
```