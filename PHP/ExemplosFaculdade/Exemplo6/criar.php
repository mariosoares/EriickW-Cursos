<?php
 /*
 Modelo fopen(nomedoarquivo, tipo de abertura)

 Tipo de abertura
 w: write : escrever (Numca abriu ou arquivo ou deseja criar)
 a: append: adicionar (Adiciona condeudo na ultima linha)
 r: read : ler 

 */


if(!isset($arqtxt)){
   $arqtxt = fopen('bdnome.txt','a+');
}


 // $arqtxt = é um ponteiro = não escreve dentro do arquivo
 // F = file = arquivo

 if($arqtxt == true){
   $nome = $_POST["nome"] ;
   $tel = $_POST["tel"]. "\n";


   $text = "Nome:$nome, Tel:$tel" ;
    // fwrite(nomedoponteiro, conteudo, tamanho)
    fwrite($arqtxt,$text , strlen($text));



    print "Escrito com sucesso";
 }
fclose($arqtxt);

// fgets(nomedoarquivo) ele vai pegar linha por linha do aqruivo



//  Ex 

// Criar formulario
//