# language: pt

Funcionalidade:  Aprender cucumber

Cenario: Deve executar especificação
  Dado que criei o arquivo corretamente
  Quando executá-lo
  Então a especificação deve finalizar com sucesso

Cenário: Deve incrementar contador
  Dado que o contador é 15
  Quando eu adicionar em 3
  Então o valor do contador será 18
