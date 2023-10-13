let pares = 0
let impares = 0
let numerosDigitados = ""


function cadastrarNumeros() {
    let num = parseFloat(document.getElementById('num').value)

    if(num % 2 === NaN){
        document.getElementById("escrever").innerHTML = `Número inválido, tente novamente!`
    }
    if(num % 2 == 0){
        pares++
        numerosDigitados += num + ", "
        document.getElementById("escrever").innerHTML = `Número: ${num}, foi cadastrado`
    } else if(num % 2 != 0) {
        impares++
        numerosDigitados += num + " "
        document.getElementById("escrever").innerHTML = `Número: ${num}, foi cadastrado`
    } 
    
}

function mostrarNumeros() {
    document.getElementById("escrever").innerHTML = 
    `Pares digitados: ${pares} <br>
    Ímpares digitados: ${impares} <br>
    Total de números digitados: ${pares + impares} <br>
    Números digitados: ${numerosDigitados}`
}