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