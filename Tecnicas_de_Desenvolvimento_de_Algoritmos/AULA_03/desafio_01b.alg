algoritmo calculaMinutos
inteiro  a, b
início
  escreva ("Digite a quantidade de horas:")
  leia (a)
  escreva ("Digite a quantidade de minutos:")
  leia (b)
  minutos(a, b)
fim

void  minutos (inteiro horas, inteiro minut)
inicio
 inteiro res
 res = horas*60 + minut
 escreva ("A quantidade de minutos que passaram é " + res)
fim
