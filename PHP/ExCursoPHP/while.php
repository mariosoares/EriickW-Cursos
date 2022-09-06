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