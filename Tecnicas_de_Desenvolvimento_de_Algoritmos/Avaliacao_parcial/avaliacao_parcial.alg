algoritmo Votação
    início
        inteiro idade
        inteiro zonaEleitoral
        literal cidadania 
        literal justificativa
        literal votoJustificado

        escreva("Digite a sua idade: ")
        leia(idade)

        escreva("Digite a sua zona eleitoral: ")
        leia(zonaEleitoral)

        escreva("Digite a sua cidadania: ")
        leia(cidadania)

        se(idade >= 16 e cidadania == "brasileiro" e zonaEleitoral == 132){
            escreva("Parabéns, você está apto a votar!")
        } senao {
            escreva("Você não está apto a votar. O que deseja fazer? Justificar voto ou Não justificar?")
            leia(justificativa)

            se(justificativa == "justificar"){
                escreva("Digite sua justificativa")
                leia(votoJustificado)
                escreva("Obrigado por justificar seu voto!")
            } senao {
                escreva("Até a próxima!")
            }
        }
    fim