# language: pt

Funcionalidade:  Aprender cucumber

Cenario: Deve executar especificação
  Dado que criei o arquivo corretamente
  Quando executá-lo
  Então a especificação deve finalizar com sucesso

Cenário: Deve incrementar contador com sucesso
  Dado que o contador é 15
  Quando eu adicionar em 3
  Então o valor do contador será 18

Cenário: Deve incrementar contador com sucesso 2
  Dado que o contador é 20
  Quando eu adicionar em 10
  Então o valor do contador será 30

Cenário: Ao realizar um pedido, deve ser entregue no dia que o sistema calculou para entrega
  Dado que o pedido foi realizado dia 01/12/2020
  Quando a entrega atrasar 5 dias
  Então O pedido deve ser entregue na data 06/12/2020