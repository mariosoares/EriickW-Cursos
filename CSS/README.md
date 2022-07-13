# CSS

## Flexbox

- [Pasta do FlexBox](./FlexBox)

### ***Terminologia***
- Flex container
    - Flex item
- Nesting (conceito de que elementos vivem dentro de outro elemento)
- Axis (é a ideia de eixo )
    - main (Horizontal)
        - start, end
    - cross (cruzado)
        - start, end
- Flex sizing
    - flexível
    - altera width/height dois itens para preenchimento dos espaços do flex container (usando a proprieda de css flex:1 nos items você faz com que aja uma alteração de tamanho para que eles preenchão todo o container)

### ***Propiedades do flex Container***

**Direção dos itens**
- Flex é uma dimensão (horizontal ou vertical)
- podemos mudar a direção com `flex-direction`
- valores: (row | row-reverse | column | column-reverse)
- o valor padrão do flex-direction é o row (que no caso seria em linha), e o row-reverse ele meio que inverte a posição em linha 
- O valor column muda o eixo do flex fazendo todos os itens ficarem em posição vertical ou seja em coluna 

**Multi linhas** 
- [Pasta do FlexBox](./FlexBox/flex-wrap)
*flex-wrap* (Capacidade que o flex tem de usar multi linas)
- Podemos usar multi linhas 
- Cada nova linha, um novo felx container
- Exemplo: Se os itens não couberem mais na div por exemplo, a div tem `width:100px` e tem quatro itens cada um com `width:50px` usando o `flex-wrap` você avisa ao flex que quando os itens nao caberem mais no container é para quebrar linha

***flex-flow***
- shorthand
- flex-direction || flex-wrap
- Uma abreviação escrita assim `flex-flow: column wrap`
- Na abreviação vem primeiro o flex-direction depois o wrap

***Alinhamento***

*Eixo Principal (Horizontal)*
 - Alinhamento dos elementos dentro do container 
 - Distribuiçao dos elementos

- *Valores*
    - flex-start (Alinha todos os itens do container horizontalmente no começo)
    - flex-end (Alinha todos os itens do container horizontalmente no fim)
    - center (Alinha todos os itens do container horizontalmente no começo)
    - space-around (Cria espaço ao redor dos elementos)
    - space-between (Cria espaço ao entre dos elementos)
    - space-evenly (Cria espaço ao por igual dos elementos ou seja o espaçamento será igual para todos os itens)

*Eixo Cruzado*



**Espaços entre os itens**