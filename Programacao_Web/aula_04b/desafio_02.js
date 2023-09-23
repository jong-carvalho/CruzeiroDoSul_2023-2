

let somaDosPares = 0 
let somaDosImpares = 0

for(let cont = 1; cont <= 1000; cont++){
    if(cont % 2 != 0){
        somaDosImpares += cont
    } else {
        somaDosPares += cont
    }
}

console.log("Soma dos Impares" + somaDosImpares)
console.log("Soma dos Pares" + somaDosPares)