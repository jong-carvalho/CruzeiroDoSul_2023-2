algoritmo CalculaMédia
início
  real n1,n2
  literal tipo
  escreva("Nota1:")
  leia(n1)
  escreva("Nota 2:")
  leia(n2)
  escreva("Qual o tipo (A ou P): ")
  leia(tipo)
  escreva("Média: "  + calculaMedia(n1, n2, tipo))
fim


real calculaMedia(real nota1, real nota2, literal tipo)
inicio
   real media
     se(tipo == ‘A’ ou tipo == ‘a’) {
       media = (nota1+nota2)/2
     }
      senão{
       media = (nota1*3 + nota2*7)/10
     }
     retorne media
 fim
