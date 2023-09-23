algoritmo descontos
 início
   real valorCompra
   inteiro parcelas

   escreva("Digite o valor da compra: ")
   leia(valorCompra)

   escreva("Digite a quantidade de parcelas: ")
   leia(parcelas)

   se(parcelas == 1){
     escreva("O valor a ser pago é: " + (valorCompra - (valorCompra * 0,1)))
   }
   senão se(parcelas == 2){
     escreva("O valor a ser pago é: " + (valorCompra + (valorCompra * 0,03)))
   }
   senão se(parcelas == 3){
     escreva("O valor a ser pago é: " + (valorCompra + (valorCompra * 0,06)))
   }
   senão se(parcelas == 4){
     escreva("O valor a ser pago é: " + (valorCompra + (valorCompra * 0,09)))
   }
   senão se(parcelas == 5){
     escreva("O valor a ser pago é: " + (valorCompra + (valorCompra * 0,12)))
   }
 fim
