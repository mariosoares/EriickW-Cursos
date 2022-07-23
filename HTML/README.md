<h1 align="center">HTML</h1>

## Estrutura Básica:

<img src="../img/semanticaHTML.png">

- ***Documento HTML***

```html
<!DOCTYPE html><!-- Essa "tag" serve para mostrar ao navegador o que você está escevendo é um documento HTML-->

<html>

    <head><!-- Tag que é a cabeça do documento tudo que esta no head nao ira aparecer em tela no site -->
        
        <meta><!-- define qualquer informação de metadados que não podem ser definidos por outros elementos HTML.Conteúdo de metadado, geralmente é colocado charset que pode configurar os caracteres de acentução -->

        <title></title><!-- Titulo da pagina aquela que aparece nas apas do navegador -->

    </head>

    <body><!-- Tag que é o Corpo do documento ou site, aqui que será escrito o que irá aparecer no site -->

    </body>

</html>
```
### Semântica

```html
<section></section><!-- Serve para representar uma seção genérica -->

<header></header><!-- Representa o cabeçalho da página  -->

<article></article><!-- Representa um conteudo relevante, poderia ser um artigo  -->

<aside></aside><!-- Pode se colocar diversos tipos de conteudo, geralmente representado como uma barra lateral -->

<footer></footer><!-- Rodapé da pagina ou de qualquer outra tag -->

<h1>-<h6><!-- serve para colocar titulos e subtitulos  -->

<p></p><!-- Conteúdo do artigo. ou paragrafo -->

<a href="" target="_blank"></a><!-- Tag de link usado para levar para outro lugar, no mesmo site  -->

<img src=""><!-- Serve para colocar imagens na pagina html o atributo src é obrigatório pois nele que vamos colocar o endereço da imagem -->

<ul></ul><!-- Lista não ordenada (apenas com pontos-->
<ol></ol><!-- Lista ordenada (Pode ser ordenado com numeros )-->
<li></li><!-- Item de lista -->

<!-- Fica Assim -->
<ul>
    <li></li>
</ul>

<!-- Ou -->

<ol>
    <li></li>
</ol>

```