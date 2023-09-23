
let cont
let vetor = []

for(cont = 0; cont <= 100; cont++){
    if(cont % 3 == 0)
        continue
    else if(cont == 50)
            break
            else if(cont % 2 == 0)
                    vetor.push(cont)
         
}

console.log(vetor)