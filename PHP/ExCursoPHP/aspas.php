<?php

$nome = 'Erick Willian';
//Tudo que está em aspas simples é considerada um texto
echo  'Meu nome é $nome';

//Para concatenar basta usar ponto
echo  'Meu nome é ' . $nome;

// Já as aspas simples são interpretativas ou seja se tiver uma variavel dentro das aspas ele vai mandar o valor dela
echo "Meu nome é $nome"