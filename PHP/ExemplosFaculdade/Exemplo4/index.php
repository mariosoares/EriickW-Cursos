<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <script src="main.js" defer></script>
    <title>Document</title>
</head>
<body>

    <form action="enviar.php" method="get">
        Digite Seu Texto:
        <input type="text" name="texto"><br>

        Escolha o tamanho da letra do texto:<br>

        1<input type="radio" name="tamanho" value="1"><br>
        2<input type="radio" name="tamanho" value="2"><br>
        3<input type="radio" name="tamanho" value="3"><br>
        4<input type="radio" name="tamanho" value="4"><br>
        
        
        Escolha a cor para o texto:<br>
        Vermelho<input type="radio" name="color"value="red"><br>
        Amarelo<input type="radio" name="color" value="yellow"><br>
        Azul<input type="radio" name="color" value="blue"><br>

        <input type="submit">
    </form>
    <?php
    //Declaração de variavel começa com $<nomeVar>
    //Para usar a variavel é necessario usar o $ antes da variavel sempre que for chamar
    // os comandos echo e print fazem exatamente a mesma coisa(Imprimem algo na tela)
    $nome = "Erick";
    //echo "Meu nome é " , $nome
    // O ponto serve para concatenar strings, a virgula também tem essa função
    ?>

</body>
</html>