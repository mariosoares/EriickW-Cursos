<?php

$nome = "Erick"

function exibeNome(){
    echo $nome;
}
exibeNome();

//Essa função vai dar erro pois a variavel não foi definida no escopo global e a função é de escopo local,ou seja somente variaveis globais ou variaveis feitas na função podem ser utilizadas


// Para corrigir isso basta colocar global na variavel, para indicar que ela pertence ao escopo local

$nome2 = "João"

function exibirNome2(){
    global $nome;
    echo $nome;
}

$a = 10;
$b = 20;
$c = 5;

// Outra forma de definir variaveis globais é usando o array $GLOBALS
function soma(){
    echo $GLOBALS['a'] + $GLOBALS['b'] + $GLOBALS['c'];
}