
// -----------------------------------------------

let vglobal = 5

function minhaFuncao() {
    console.log("Dentro da função -> " + vglobal)
}

console.log("Fora da função -> " +vglobal)

minhaFuncao()

// ----------------------------------------------

function outraFuncao() {
    let vLocal = 9
    console.log(vLocal)
}

outraFuncao()

// vai dar erro pois ele não encontra a variavel
// console.log(vLocal)



