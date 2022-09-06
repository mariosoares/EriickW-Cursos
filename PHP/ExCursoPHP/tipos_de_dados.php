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

//boolean (Somente true ou false)

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
