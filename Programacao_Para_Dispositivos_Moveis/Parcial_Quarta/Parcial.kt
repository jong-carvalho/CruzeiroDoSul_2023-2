
fun main() {


    val nomes = arrayOf("Maria Silva", "João Santos", "Ana Pereira", "Pedro Oliveira", "Mariana Sousa", "Lucas Fernandes", "Carolina Almeida", "Gustavo Barbosa", "Isabela Castro", "Rafael Ferreira", "Beatriz Gomes", "Daniel Rodrigues", "Juliana Costa", "Matheus Martins", "Larissa Rocha", "Julia Mancini")
    val notas = arrayOf(7, 8, 3, 7, 2, 10, 9, 8, 6, 7, 4, 6, 8, 9, 9, 1)
    val rgms = arrayOf(3345, 3362, 3331, 3372, 3389, 3344, 3367, 3390, 3361, 3322, 3342, 3351, 3353, 3398, 3309, 3304)

    var somaNotasPar = 0
    var somaNotasImpar = 0.0
    for(i in 0..15){
        if(rgms.get(i) % 2 == 0){
            somaNotasPar += notas.get(i)
        } else {
            somaNotasImpar += notas.get(i)
        }
    }

    println("Soma das notas dos alunos com RGM final par: " + somaNotasPar)
    println("Soma das notas dos alunos com RGM final ímpar: " + somaNotasImpar)

    var maiorNota = 0
    var posicaoAlunoMaiorNota = 0
    for(i in 0..15){
        if(maiorNota < notas.get(i)){
            maiorNota = notas.get(i)
            posicaoAlunoMaiorNota = i
        }
    }

    println("Aluno com a maior nota ${nomes.get(posicaoAlunoMaiorNota)} e sua nota é: ${maiorNota}")

    var menorNota = 100
    var posicaoAlunoMenorNota = 0
    for(i in 0..15){
        if(menorNota > notas.get(i)){
            menorNota = notas.get(i)
            posicaoAlunoMenorNota = i
        }
    }

    println("Aluno com a menor nota ${nomes.get(posicaoAlunoMenorNota)} e sua nota é: ${menorNota}")


    for(i in 0..15){
        if(notas.get(i) >= 6){
            println("Aluno: ${nomes.get(i)} tirou a nota ${notas.get(i)} e está APROVADO")
        } else {
            println("Aluno: ${nomes.get(i)} tirou a nota ${notas.get(i)} e  está REPROVADO")
        }
    }


}


