# PHP

- Significado de PHP: ***PHP Hypertext Processor***

É uma linguagem de script open source de uso gera, muito utilizada, e especialmente adequada para o densenvolvimento web e que pode ser embutida dentro do HTML.

É uma linguagem **back-end** ou **server-side**.Isso significa que ela não é lida pelo navegador. 
Ela é interpretada e renderizada por um servidor (um computador que tenha o interpretador do PHP que devolverá uma resposta)

- O navegador não entende o PHP ( arquivos .php ), o navegador pede para o servidor interpretar e para depois enviar para o usuario, o navegador nunca vai sabero o que está no código pois ele apenas vai receber e mandar diretamente para o usuario

- Para mostrar que é um arquivo é php basta usar a extenção `.php`

```php

// Para começar um bloco de código em PHP você usa essa sintaxe:
    <?php
        // O que colocar aqui vai rodar no PHP
    ?>

```

- O PHP não é case sesitive como o JavaScript ou seja não importa a forma que vocÊ escreve as palavras reservadas

```php
     <?php

        // O comando echo serve para que o php envie dados para fora (De certa forma funciona "como" o console.log do JavaScript), nele pode se retornar tags HTML
        echo "<p>Olá mundo</p>"
        Echo "<p>Olá mundo</p>"
        ECHO "<p>Olá mundo</p>"
        
    // Só as variaveis são case sensitive 

    ?>
```
