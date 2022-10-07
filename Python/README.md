# Python

//


## Estruturas Condiconais e de repetição

> ### Identação e blocos
- Identar código é uma forma de manter o código fonte mais legível e manutenível. Mas em Python ela exerce um segundo papel, através da identação o interpretadaor consegue determinar onde um bloco de comando inicia e onde ele termina

> ### bloco de comando
- As linguagens de programação costumam utilizar caracteres ou palavras reservadas para terminar o início e o fim do bloco. Em Java e C por exemplo, utilizamos chaves:

> ### Utilizando Espaços
- Existe uma convenção em Python, que define as boas práticas para escrita de código na linguagem. Nesse documento é indicado utilizar 4 espaços em branco por nível de identação, ou seja, a cada novo bloco adicionamos 4 novos espaçõs em branco
```python

def sacar(self, valor: float) -> None: # inicio do loco do metodo

    if self.saldo >= valor: # Inicio do if

        self.saldo -= valor

    # fim do bloco if

# fim do bloco do metodo    

```

## Estruturas Condicionais
- A estrutura condicional permite o desvio de fluxo de controle, quando determinadas expressões lógicas são atendidas

> ### *If*
- Usado para criar uma estrutura condicional simples, composta por um único desvio, podemos utilizar a palavra reservada if. O comando irá testar a expressão lógica, e me caso de retorno verdadeiro as ações presentes no bloco de código do it serão executadas 
```python

saldo = 2000.0
saque = float(input("Informe o valor do saque: "))

if saldo>=saque: 
    print("Realizando saque!")

```

> ### *if/else*
- Para criar uma estrutura condicional com dois desvios, podemos utilizar as palavras reservadas if e else. Como sabemos se a expressão lógica testada no if for verdadeira então o bloco de código do if será executado. Caso contrario o bloco do else será executado.
```python

saldo = 2000.0
saque = float(input("Informe o valor do saque: "))

if saldo>=saque: 
    print("Realizando saque!")
else:
    print("Saldo insuficiente!")

```

> ### *if/elif/else*
- Em alguns cenários queremos mais de dois desvios, para isso podemos utilizar a palavra reservada elif. O elif é composto por uma nova expressão lógica, que será testada e caso retorne verdadeiro o bloco de código do elif será executado. Não existe um número máximo de elifs que podemos utilizar, porém evite criar grandes estruturas codicionais, pois elas aumentam a complexidade do código


> ### *if ternário*
- O if ternário permite escrever uma condição em uma única linha. Ele é composto por três partes, a primeira parte é o retorno caso a expressão retorne verdadeiro, a segunda parte é a expressão lógica e a terceira parte é o retorno caso seja falso

```python

status = "Sucesso" if saldo >= saque else "Falha"

```

## Estruturas de repetição

> ### O QUE são
- São estruturas utilizadas para repetir um trecho de codigo um dterminado número de vezes. Esse número pode ser conhecido previamente ou determinado através de uma expressão logica

> ### *Comando for*
- O comandofor é usado para percorrer um objeto iterável. Faz sentido usar for quando sabemos o número exato de vezes que nosso bloco de código deve ser executad, ou quando queremos percorrer um objeto iterável

```python

texto = input("Informe um texto: ")
VOGAIS = "AEIOU"

for letra in texto:
    if letra.upper() in VOGAIS:
        print(letra, end="")
print()

```
```python

texto = input("Informe um texto: ")
VOGAIS = "AEIOU"

for letra in texto:
    if letra.upper() in VOGAIS:
        print(letra, end="")
else: #O else no for é usado para executar um codigo no fim do laço de repetição
    print()

```
> **Função range**
- Range é uma função built-in do Python, ela é usada para produzir uma sequência de númeor inteiros a partir de um ínicio (inclusivo) para um fim (exclusivo). Se usarmos range(i,j) será produzido:  i,i+1,i+2 ...
- Ele recebe 3 argumentos: stop (obrigatorio) , start (opicional) step opicional(o step sao meio que pulos de quntidade)
```python
# range(stop) -> retorna range object
# renge(start, stop[,step])

list(range(4))

for numero in range(0,11):
    print(numero, end = " ")

for numero in range(0,51, 5):# Pulando de 5 em 5
    print(numero, end = " ")


```
> ### Comando *while*
- O comando while é usado para repetir um bloco de código várias vezes. Faz sentido usar while quando não sabemos o número exatos de vezes que nosso bloco de código deve ser executado
```python
opcao = -1

while opcao != 0:
    opcao = int(input(" 1- Sacar \n 2 - Extrato \n 0 - Sair \n"))

    if opcao == 1: 
        print("Sacando....")
    elif opcao == 2:
        print("Exibindo o extrato....")

```

## Manipulação de Strings

> ### Conhecendo método úteis da classe string

- A classe String do Python é famosa por ser rica em métodos e possuir uma interface muito fácil de trabalhar. Em algumas linguagens manipular sequências de caracteres não é um trabalho trivial, porém, em Python esse trabalho é muito simples 
```python

curso = "pYtHon"

print(curso.upper())
# PYTHON

print(curso.lower())
# python

print(curso.title())
# Python



# Eliminando espaços em branco #

curso = "      Python  "

print(curso.strip())
# Python

print(curso.lstrip())# remove so da esquerda
# "Python  "

print(curso.rstrip())# Remove so da direita
# "      Python"


# Junções e centralização
curso = "Python"

print(curso.center(10,"#"))
# "##Python##"

print(".".join(curso))
#"P.y.t.h.o.n"
```