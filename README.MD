# Discounts Grupo 5
Gabriel bomfim
Henrique Beltrami
Pedro Henrique Carvalho
Pedro Henrique Jaber
Robert martins

# Nova Regra de Negócio para o Sistema de Pedidos
  ## Desconto Baseado na Quantidade de Itens:
     - Se o pedido tiver 20 ou mais itens:
            O cliente recebe um desconto de 15% sobre o valor total do pedido, independentemente de ser ou não membro do clube de fidelidade.
     - Se o pedido tiver entre 11 e 19 itens:
            Se o cliente for membro do clube de fidelidade, ele receberá um desconto de 10% sobre o valor total do pedido.
     - Se o pedido tiver 10 ou menos itens:
            Nenhum desconto é aplicado, a menos que outras condições (como promoções ou cupons) sejam satisfeitas.

  ## Desconto Durante o Período Promocional:
     - Se o pedido for feito durante o período promocional (entre 1º de dezembro e 31 de dezembro do ano corrente):
            - Se o pedido tiver mais de 5 itens e o cliente não for membro do clube de fidelidade:
                O cliente recebe um desconto adicional de 5% sobre o valor total do pedido.

  ## Desconto Baseado em Cupons:
        Se o cliente fornecer um código de cupom válido ao fazer o pedido, os seguintes descontos são aplicados:
            Cupom "BLACKFRIDAY": Aplica um desconto de 20% sobre o valor total do pedido.
            Cupom "NEWYEAR": Aplica um desconto de 10% sobre o valor total do pedido.

  ## Combinação de Descontos:
        Descontos não são cumulativos: O desconto mais vantajoso para o cliente será aplicado. Por exemplo, se o cliente tiver direito a um desconto de 15% por ter mais de 20 itens no pedido, outros descontos menores, como o de 10% para membros do clube ou 5% por período promocional, não serão aplicados.

# Fluxo de Decisão:

    Primeiro, verifica-se se o pedido contém 20 ou mais itens para aplicar o desconto de 15%.
    Se o pedido não tiver 20 ou mais itens, mas o cliente for membro do clube de fidelidade e tiver mais de 10 itens, aplica-se o desconto de 10%.
    Verifica-se então se o pedido foi feito durante o período promocional de dezembro e se o cliente não é membro, aplicando um desconto de 5% se o pedido tiver mais de 5 itens.
    Por fim, se o cliente fornecer um código de cupom válido, aplica-se o desconto correspondente ao cupom, sendo o de maior valor entre os aplicáveis.
