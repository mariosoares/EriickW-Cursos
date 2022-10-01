# Python

## Escrevendo Olá mundo
```py

print("Olá mundo");

```

## Tipos de dados 

### Por que usamos tipos?
- Os tipos servem para definir as caracteristicas e comportamentos de um valor (objeto) para o interpretador.

    > Por exemplo:
        Com esse tipo eu sou capaz de realizar operações matemáticas.  
        Esse tipo para ser armazenado na memoria irá 24 bytes

### Tpos em Python:

- ***Texto:*** `str`
- ***Númerico:*** ` int, float, complex`
- ***Sequência:*** `list, tuple, range`
- ***Mapa:*** `dict`
- ***Coleção:*** `set, fronzenset`
- ***Booleano:*** `bool`
- ***Binário:*** ` bytes, bytearray, memoryview` 


## Númerico 


> ### Números inteiros

- Números inteiros são representados pela classe ***int*** e possuem precisão ilimitada. São exemplos válidos de números inteiros:  1, 2, 3, 100, -1, -10

> ### Números de ponto flutuante

- Os números de ponto flutuante são usados para representar os númeor racionais e sua implementação é feita pela classe ***float***. São exemplos validos 1.5, -10.543, 0.76 


## Booleano e Strings

> ### Booleano
- É usado para representar verdadeiro ou falso, e é implementado pela classe ***bool***. Em Python o tipo booleano é uma subclasse de ***int***, uma vez que qualquer número diferente de 1 representa verdadeiro e o 0 representa falso.

> ### Strings
- Strings ou cadeia de caracteres são usadas para representar valores alfanúmericos, em Python as strings são definidas utilizando a classe ***str***. São exemplos válidos de string: "Python", 'python'