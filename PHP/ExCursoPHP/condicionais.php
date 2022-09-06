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

        