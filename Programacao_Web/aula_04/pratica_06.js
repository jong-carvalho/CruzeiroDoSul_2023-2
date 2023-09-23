
// media com ponto extra se fizer todos os exercicios


let avaliacao = 3
let exercicio = 5
let total = 0

if(exercicio == 5 && avaliacao < 5){
    total = avaliacao + 1 + exercicio
    console.log("Sua nota final é: " + total)
} else {
    console.log("Você não tem direito a ponto extra.")
    total = avaliacao + exercicio
    console.log("Sua nota final é: " + total)
}
