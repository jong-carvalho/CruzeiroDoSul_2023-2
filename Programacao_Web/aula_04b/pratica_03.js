
let cont = 0
let vetor = []

do{
    if(cont % 2 == 0 && cont >= 30 && cont <= 60)
        vetor.push(cont)
    cont++
} while(cont <= 100)

console.log(vetor)