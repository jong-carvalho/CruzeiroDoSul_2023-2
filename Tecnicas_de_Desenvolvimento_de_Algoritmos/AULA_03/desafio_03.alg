algoritmo volumeCaixa
real larg, alt, prof
início
escreva ("Digite a largura da caixa em cm:")
leia (larg)
escreva ("Digite a altura da caixa em cm:"
leia (alt)
escreva ("Digite a profundidade da caixa em cm:")
leia (prof)
volume(larg, alt, prof)
fim


void  volume (real l, real a, real p) {
real res
res = (l/100 * a/100 * p/100)
escreva ("O volume da caixa é " + res + " m³" )
}
