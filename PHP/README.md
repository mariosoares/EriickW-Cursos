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
```php
<?php

/*
 *  is_array($array) = verificar se uma determinada variável é um array
 *  in_array($valor, $array) = verififca se um determiado valor existe em alguma posição do array
 *  array_keys($array) = retorna um novo array com as chaves de array passado como parametro ou os indices (Ele pega os indices dos arrays e cria um novo array com eles)
 *  array_values($array) = retorna um novo array com os valores do array passado como parÂmetro (ele pega os valores e cria uma nova array)
 *  array_merge($array1, array2) = Agrega o conteúdo dos dois arrays ou seja faz a fusão dos arrays
 *  array_pop($array) = exclui a ultima posição do array
 *  array_shift($array) = exclui a primeira posição do array
 *  array_unshift($array, "valor") = adiciona um ou mais elementos no início do array
 *  array_push($array, "valor","valor") = Adiciona um ou mais elementos no final de um array
 *  array_combine($keys,$values) = Mescla os dois arrays passados(usa o primeiro array passado como os values ou indices, e o segundo como valores)
 *  array_sum() = calcula a soma dos elementos de um array
 *  explode("/" , "20/01/2001") = Transforma string em array
 *  implode("-", $array) = transforma array em strings
 */

```

##  Condicionais
```php
<?php

     $numero = 10;


    // Essa é uma forma de fazer um if
    if($numero == 10){
        echo "É igual a 10";
    }else{
        echo "Não é 10";
    }


    // Essa é outra forma
    // Que pode ser feita dentro do HTML 
?>

    <?php if ($numero == 10): ?>

        <h1>O número é 10</h1>
    
    <?php else: ?>
    
        <h1>O número não é 10</h1>
    
    <?php endif ?>


    <?php
    // Tambem tem essa forma

    if($numero == 10):
        echo "Igual a 10";
    elseif($numreo <= 9):
        echo "É menor ou igual a 9";
    else:
        echo "Numero invalido";
    endif;

    echo "<hr>";
    //Existe tambem o oprador ternário 
    //Ele é uma forma abreviada do IF

    $media = 7;

    echo ($media >= 7) ? "Aprovado" : "Reprovado";
```
## Switch / Case
```php
<?php
    $cor = "vermelho";

switch($cor):
    case "vermelho":
        echo "Sua cor é vermelho";
    break;

    case "verde":
        echo "Sua cor é verde";
    break;

    case "azul":
        echo "Sua cor é azul";
    break;

    endswitch;

```

## Operadores Aritiméticos

```php

<?php

/*
 *  Operadores Aritimeticos
 * 
 * São usados com valores numéricos para executar operaçoes
 * aritiméticas comuns.
 * 
 * Adição +
 * Subtração -
 * Multiplicação *
 * Divisão /
 * Módulo %
 * Exponenciação **
 * 
 */
```

## Operadores de Comparação

```php

<?php

    // Operadores de Comparação
    // ==  Igual
    // !=  Diferente
    // === Identico ou estritamente igual
    // !== Não Identico ou estritamente diferente
    // <> Diferente
    // <  menor que
    // > maior que
    // <= menor ou igual a
    // >= maior ou igual a
    // <=> 

```

## Operadores Lógicos

```php

<?php

// Operadores lógicos 
// Nos permitem fazer comparações entre expressões 

// e (&& - and) os dois operadores precisam ser verdadeiros para essa expressão seja verdadeira
// ou (|| - or) apenas um operador precisa ser verdadeiro para que essa expressão seja verdadeira
// ou exclusivo (xor) ´So retorna verdadiro se *somente 1 operador* for verdadeiro
// negação (!) Ele nega o valor de um operador

$idade = 19;
$nome = "Erick";

if($idade == 19 && $nome == "Erick"){
    echo "É verdadeiro";
}else{
    echo "É falso";
}
echo "<hr>";


if(($idade == 20 )||($nome == "Erick")):
    echo "É verdadeiro";
else:
    echo "É falso";
endif;

```

## While e Do While (Enquanto e Faça enquanto)
```php

<?php

//While e Do While

// Tanto faz você usar os dois pontos ":" ou as chaves "{}" para iniciar, ambas estão certas, mas usando os 
// dois pontos você precisa obrigatoriamente dar o "endwhile"
// Dependendo do que você está fazendo uma vai ser melhor que a outra

/*
 *  while(){
 * 
 * }
 * 
 */


 $contador = 1;

 //Exemplificando o que está acontecendo:
    // Enquanto (while) o contador for menor ou igual a 10 faca o bloco de codigo abaixo
        // Para que não fique em um loop infinito você precisa incrementar 1 no contador
            // o While tem um unico problema, se o contador começar com o valor 10 ele simplesmente não executa
while($contador <= 10):
    echo "Contador é $contador";
    echo "<br>";
    $contador++;
endwhile;

echo "<hr>";


$contador = 1;


// Diferente do while o  Do while va executar o codigo pelo menos 1 vez
do{
    echo "Contador é $contador";
    echo "<br>";
    $contador++; 
}while($contador<=10);

```

## For

```php

<?php


for ($i=0; $i <= 10 ; $i++) { 
    echo "O contadoor é $i <br>";
}

echo "<hr>";

$cores = array ("Verde", "Vermelho", "Azul");


// O foreach é uma estrutura de repetição que passa pelos indices do array
foreach ($cores as $value) {
    echo "A cor é $value <br>";
}

```
