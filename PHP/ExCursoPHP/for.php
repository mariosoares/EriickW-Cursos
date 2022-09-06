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