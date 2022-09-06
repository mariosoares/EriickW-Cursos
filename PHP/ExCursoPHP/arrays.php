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
    $clientes = ["João", "Victor"];

// =================================================================================

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
    $pessoa = array("nome"=> "Erick", "idade"=>19);


    // Arrays Multidimensionais
    // Arrays que tem mais arrays ou arrays dentro de arrays

    $times =array(
        "cariocas"=> array("Vasco","Flamengo", "Botafogo"),
        "paulistas"=> array("Santos", "São Paulo", "Palmeiras")
    );
    echo $times["cariocas"][1];