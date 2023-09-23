inicio
 real quantidadeParcelas, real valorCompra
 escreva ("Digite o valor da compra: ")
 leia valorCompra
 escreva ("Digite a quantidade de parcelas: ")
 leia quantidadeParcelas

 escreva ("O valor da parcela é: " + quantidadeParcelas(valorCompra, quantidadeParcelas))
fim


real calcularParcelas(real quantidadeParcelas, real valorCompra)
 inicio
     real juros
     real valorParcelas
     juros = 0.05
     valorParcelas = (valorCompra * (1+juros)) / quantidadeParcelas
     retorne valorParcelas
 fim
