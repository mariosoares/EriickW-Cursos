# ***HTTP***
> HyperText Transfer Protocol

- **Visão geral**
    - Permite troca de informações e dados na internet
    - Uma troca de mensagens
    - HTML, CSS, Scripts, imagens, videos
    - Uma chamada para cada um deses recursos


## Comunicação do Browser e o Servidor
> Funciona como uma troca de conversa:

- Primeiro o browser faze um pedido (request) ao servidor
- Depois que o servidor recebe o pedido ele processa e manda uma resposta (response) 

> Analisando a "Conversa" entre servidor e browser

***Recurso***

- Local que irei enviar o pedido
- Usarei uma URL para acessar o recurso
- Exemplo: https://google.com/

***Massage***

- Pedido (request):

    Qual é o verbo a ação que queremos executar com esse pedido isso se chama:
    - Metodos
        - Isso vai definir o tipo do pedido
        - Qual ação eu quero fazer no servidor
        - Exemplos: GET (Serve para pegar um recurso), POST (Criar um recurso)
    - Heders
    - Body
- Resposta (Response)
    - Primeiro ele irá responder um Status code
        - Resposta do servidor sobre o status do pedido
        - Exemplo : 200(Status de tudo ok), 301(redirecionamento), 404 (não encontrado), 500 (Erro interno de servidor)
    - Heders
    - body

- Header
    - Campos informativos
    - Propriedade valor
    - Exemplo:
        - Content/Type application/json
        - User-Agent Chrome
        - Request URL: www.google.com
- Body
    - HTML
    - Conteudo
    - JSON