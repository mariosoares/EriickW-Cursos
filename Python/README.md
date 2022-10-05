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
- Usa do para criar uma estrutura condicional simples, composta por um único desvio, podemos utilizar a palavra reservada if. O comando irá testar a expressão lógica, e me caso de retorno verdadeiro as ações presentes no bloco de código do it serão executadas 
```python

saldo = 2000.0
saque = float(input("Informe o valor do saque: "))

if saldo>=saque: 
    print("Realizando saque!")

```