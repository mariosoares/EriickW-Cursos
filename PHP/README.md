# PHP

- Significado de PHP: ***PHP Hypertext Processor***

É uma linguagem de script open source de uso gera, muito utilizada, e especialmente adequada para o densenvolvimento web e que pode ser embutida dentro do HTML.

É uma linguagem **back-end** ou **server-side**.Isso significa que ela não é lida pelo navegador. 
Ela é interpretada e renderizada por um servidor (um computador que tenha o interpretador do PHP que devolverá uma resposta)

- O navegador não entende o PHP ( arquivos .php ), o navegador pede para o servidor interpretar e para depois enviar para o usuario, o navegador nunca vai sabero o que está no código pois ele apenas vai receber e mandar diretamente para o usuario

- Para mostrar que é um arquivo é php basta usar a extenção `.php`

```php

// Para começar um bloco de código em PHP você usa essa sintaxe:
    <?php
        // O que colocar aqui vai rodar no PHP
    ?>

```

- O PHP não é case sesitive como o JavaScript ou seja não importa a forma que vocÊ escreve as palavras reservadas

```php
     <?php

        // O comando echo serve para que o php envie dados para fora (De certa forma funciona "como" o console.log do JavaScript), nele pode se retornar tags HTML
        echo "<p>Olá mundo</p>"
        Echo "<p>Olá mundo</p>"
        ECHO "<p>Olá mundo</p>"
        
    // Só as variaveis são case sensitive 

    ?>

    // voce pode fazer assim
    /* Usando essa tag php <?= ?> você abrevia o jeito de escrever algo  igual ao de cima 
    é como você estivesse usando o echo de forma abreviada */
    <?= "Qualquer coisa"?>
```
 
## Variaveis
- Para indicar uma variavel em PHP basta usar $ antes do nome da variavel por exemplo: `$nome`
- Não precisa indicar o tipo da variavel
- Para exibila precisa sempre do `$`
```php
<?php
    //Variaveis
    $nome = "Erick Willian";
    $idade = 19;
    $altura = 1.80;

    echo $nome
?>
```

### Variaveis dinâmicas
```php

<?php
    // Variaveis dinamicas

    $bebida = "refrigerante";

    // Colocando dois $$ voce faz com que o valor dentro da variavel tenha tambem um valor
    // é como você pegase o valor dentro de uma variavel, usa esse valor, e cria uma variavel
    $$bebida = "Guaraná";

    echo $refrigerante
?>

```

## Tipos de dados
```php

        <?php

    // Escalares 

    // String (Sequencia de caracteres)
    $nome = "Erick";
    // o var_dump() permique que você saiba mais informações sobre a variavel que esta dentro do parenteses 
    echo var_dump($nome);

    // o is_string() verifica se o que tem na variavel é uma string , mandando um resultado em boolean, True ou False
    $verificaNome = is_string($nome);


    // ============================================================

    // int (Numero inteiro)
    $idade = 19;
    echo var_dump($idade);

    $verificaIdade = is_int($idade)

    //=============================================================

    // float(Numeros reais, numeros com virgula)

    $altura = 1.80;
    echo var_dump($altura);

    $verificaIdade = is_float($altura)

    // ============================================================

    //boolean (Somente true:1 ou false:0 ou nada )

    $estaChovendo = false;
    echo var_dump($estaChovendo);

    //============================================================

    // array
    // Para indicar um array precisa atribuir a variavel o array() e dentro dos parenteses os valores
    $carros = array("Gol", "Uno", "Camaro", 12,20.6,true);

    // ===========================================================

    //Object
    // usando o "public" você cria uma key e atribui valor
    class Cliente{
        public $nome;
        public function atribuirNome($nome){
            $this -> $nome = $nome;
        }
    }

    $cliente = new Cliente();


```

## Aspas simples, Aspas duplas e Concatenação
```php

<?php

    $nome = 'Erick Willian';
    //Tudo que está em aspas simples é considerada um texto
    echo  'Meu nome é $nome';

    //Para concatenar basta usar ponto
    echo  'Meu nome é ' . $nome;

    // Já as aspas simples são interpretativas ou seja se tiver uma variavel dentro das aspas ele vai mandar o valor dela
    echo "Meu nome é $nome"

```

## Constantes
```php

<?php

    //Constante
    // Identificador pra valor único ou seja esse valor nunca vai mudar durante a execução do codigo
    // Para criar uma constante basta usar a função define(nome da variavel, valor da variavel)
    // Por convenção os nomes das constantes são em letras maiusculas
    define("NOME", "Erick Willian");
    //Para acessa-las não é necessário usar o $
    //As constantes são automaticamente globais
    echo NOME;

```
## Arrays
```PHP

<?php

    //Arrays

    $carros = array("BMW", "Veloster", "Hilux");
    // Para imprimir um Array inteiro basta usar o print_r(nome do array)
    print_r($carros);


    //Voce tambem pode criar indices personalizados fazendo assim:
    //Obs: Voce pode usar quase tudo para nomear a posição
    $carros = array(1=>"BMW", 2=>"Veloster", 3=>"Hilux");


    // Para adicionar um item no array basta fazer isso:
    // Fazendo isso ela vai para o ultimo indice 
    $carros[]="Amarok";

    //Também você pode indicar qual posição quer que ela ocupe
    $carros[10] = "Camaro";


    // Pode se criar um Array assim:
    $clientes = ["João", "Victor"]

```
```PHP

<?php

    //Arrays pt2

    $carros = array("BMW", "Veloster", "Hilux");
    
    // Para ver a quantidade de items que tem dentro de um array basta usar a função count(nome do array)
    echo count($carros);


    //Existe também um loop que percorre arrays
    // foreach($variavel as $temp){}
    foreach($carros as $valor){
        // Por exemplo: para cada elemento do array $carros vai ser atribuido a variavel valor 
        // Ou seja ele vai dar o valor de cada posição do array a variavel valor, sempre trocando 

        echo $valor;
    }

    // Arrays associativos
    // São arrays que seus indices não sao numeros mas sim strings(textos)
    $pessoa = array("nome"=> "Erick", "idade"=>19)

     // Arrays Multidimensionais
    // Arrays que tem mais arrays ou arrays dentro de arrays

    $times =array(
        "cariocas"=> array("Vasco","Flamengo", "Botafogo"),
        "paulistas"=> array("Santos", "São Paulo", "Palmeiras")
    );
    echo $times["cariocas"][1];
   

```
```

```