<?php

//Constante
// Identificador pra valor único ou seja esse valor nunca vai mudar durante a execução do codigo
// Para criar uma constante basta usar a função define(nome da variavel, valor da variavel)
// Por convenção os nomes das constantes são em letras maiusculas
define("NOME", "Erick Willian");
//Para acessa-las não é necessário usar o $
//As constantes são automaticamente globais
echo NOME;