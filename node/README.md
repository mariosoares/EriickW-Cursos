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
- Atenção para adicionar valores no process deve se tomar cuidado pois você precisa indicar qual o arquivo vai receber novos valores no array do process

- No terminal fica assim:

        node importFlag.js --name "erick"

- Sempre lembre node nomedoArquivo.js  flag  valorDesejado
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

> ## NPM - Node Package Manager

__Glossary: Dependencies, Packages, Modules__

- [ ] Verificar se tem o npm instalado `npm -v`
- [ ] Criar nosso próprio pacote

    Para iniciar os pacotes do node você te duas opções:

    1 - `npm init`

    2 - `npm init -y ` praticamente igual ao de cima mas da sim para todas as opções de config inicial

- [ ] O que é o arquivo package.json

    é um arquivo .json (JavaScript object notation) ao abrir ele você vai perceber que ele é um objeto javascript com chave e valor,     caso você você altere algo no package.json você obrigatóriamente precias digitar no terminal ` npm update`

- [ ] Utilizar módulos terceiros 

    Para baixar packages de terceios basta ir no terminal e escrever `npm install (Nome do package)` 

- [ ] O que é o diretório node_modules


- [ ] O que é o arquivo package-lock.json

    Ele é um arquivo .json igual ao outro mas nele você não pode mexer pois ele faz o mapeamento das suas dependeicias que existem no projeto e ele configura o seu projeto tambem é impotante não apagar ele

- [ ] Criar scripts para rodar com o npm


- [ ] Instalar pacote de maneira global

    `npm i (nome do pacote) -g` assim vc instala de forma global ára que você não precise instalar sempre

- [ ] Desintalar pacotes

    `npm unistall (nome do pacote) -g`
- [ ] Mudar versão de pacotes 

    Instalando pacote `npm i moment`

    - Vai ficar assim no package.json
    ```json
        "dependencies":{
            "moment":"^2.29.1"
        }
    ```
    - Esses numeros significam `major.minor.patch`
        - **patch**: é um numero que indica que stá resovendo um bugzinho
        - **minor**: significa que ele vai ter alterações mas que não vai quebrar o que está acontecendo no pacote
        - **major**:  significa a versão do projeto mostrando que o projeto poderá quebrar dependendo do que aconteça
        - o sinal **^** antes significa que o npm vai pegar sempre a versão mais recente do minor e o patch
        - o sinal **~** antes significa que vai autalizar só o path
        - SE não tiver nada ele nunca vai atualizar e sempre vai manter aquela versão
        - "*" assim ele sempre vai alterar todas as versões
    - Para colocar a versão dcesejada basta escrever no terminal `npm i nomePacote@versaoDesejada` 
    - Para verificar versões `npm outdated`
    - Para aumentar a versão para uma mais estável `npm upgrade` 
    - Para aumentar para a mais atual novamente `npm i nomePacote@latest` 

- [ ] Rmovendo Pacotes `npm unistall (nome do pacote)`