//escopo de variaveis

var vglobal = 4

function minhaFuncao() {
    console.log("Dentro da função -> " + vglobal)
}

console.log("Fora da função -> " +vglobal)

minhaFuncao()

// ----------------------------------------------

function outraFuncao() {
    var vLocal = 7
    console.log(vLocal)
}

outraFuncao()

// vai dar erro pois ele não encontra a variavel
// console.log(vLocal)

