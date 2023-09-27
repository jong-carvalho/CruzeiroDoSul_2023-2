import java.util.ArrayList

fun main() {

    var nomes = arrayOf("Alexa Martins Almeida", "Pedro Silva Pereira", "Lucas Oliveira Souza", "Maria Santos Rodrigues", "Isabella Ferreira Lima", "João Pereira Ribeiro", "Gabriel Alves Cardoso", "Laura Gonçalves Santos", "André Fernandes Mendes", "Beatriz Costa Almeida", "Matheus Rodrigues Souza", "Ana Martins Silva", "Leonardo Ribeiro Oliveira", "Clara Almeida Pereira", "Enzo Cardoso Martins", "Luiza Silva Rodrigues", "Rafael Alves Pereira", "Gustavo Fernandes Santos", "Carolina Gonçalves Ferreira", "João Pereira Ribeiro", "Lucas Fernandes Lima", "Manuela Almeida Costa", "Miguel Lima Alves", "Sofia Martins Santos", "Davi Rodrigues Pereira")
    val sexos = arrayOf("Feminino",              "Masculino",           "Masculino",            "Feminino",               "Feminino",               "Masculino",              "Masculino",            "Feminino",              "Masculino",              "Feminino",              "Masculino",               "Feminino",          "Masculino",                   "Feminino",             "Masculino",            "Feminino",             "Masculino",            "Masculino",                "Feminino",                     "Masculino",             "Masculino",            "Feminino",            "Masculino",             "Feminino",        "Masculino")
    var idades = arrayOf(19,                     65,                    34,                     72,                         18,                     28,                         59,                     44,                     27,                         76,                     18,                         18,                 61,                         22,                         56,                     32,                     73,                     18,                         16,                             67,                     41,                     70,                 30,                         57,                 24)
    var salarios = arrayOf(2500, 3200, 1800, 4200, 2900, 5500, 3800, 4700, 2100, 3600, 2800, 5000, 3400, 4400, 2600, 4000, 3100, 2300, 4700, 3300, 2700, 4900, 3500, 2000, 4100)
    var cargos = arrayOf("Gerente de Vendas", "Diretor", "Desenvolvedor de Software", "Assistente Administrativo", "Engenheiro de Projetos", "Designer Gráfico", "Contador Financeiro", "Especialista em Recursos Humanos", "Consultor de Negócios", "Enfermeiro(a) Clínico(a)", "Analista de Dados", "Coordenador de Logística", "Gerente de Operações", "Assistente de Atendimento ao Cliente", "Médico(a) Generalista", "Professor(a) de Inglês", "Analista de Finanças", "Arquiteto(a) de Interiores", "Analista de Suporte Técnico", "Jornalista Freelancer", "Diretor", "Técnico de Laboratório", "Consultor de Segurança Cibernética", "Engenheiro de Qualidade", "Diretor")


    var resultados: List<Int>

//    idades
    var auxOld = 0
    var auxYoung = 0
    var sumAges = 0
    var positionOld = 0
    var positionYoung = 0
//    idades

//    salarios
    var auxHighestSalary = 0
    var auxLowestSalary = 0
    var sumSalaries = 0
    var positionHighest = 0
    var positionLowest = 0
//    salarios

    var count = 0
    var alreadyExecuteOnce = false


//////////////////////////////////// homens - idades ////////////////////////////////////
    for(i in 0..24){
        if (sexos.get(i).equals("Masculino") && alreadyExecuteOnce == false){
            auxOld = idades.get(i)
            auxYoung = idades.get(i)
            alreadyExecuteOnce = true
            sumAges += idades.get(i)
            count++
        } else if(sexos.get(i).equals("Masculino") && idades.get(i) >= auxOld){
            auxOld = idades.get(i)
            positionOld = i
            sumAges += idades.get(i)
            count++
        } else if(sexos.get(i).equals("Masculino") && idades.get(i) <= auxYoung){
            auxOld = idades.get(i)
            positionYoung = i
            sumAges += idades.get(i)
            count++
        }
    }

    println("O homem mais velho é ${nomes.get(positionOld)} e ele tem ${idades.get(positionOld)}")
    println("O homem mais novo é ${nomes.get(positionYoung)} e ele tem ${idades.get(positionYoung)}")
    println("A média da idade dos homens ${sumAges/count}")
//////////////////////////////////// homenes - idades ////////////////////////////////////

    println("---------------------------------------------------------------------------------------------------")

//////////////////////////////////// mulheres - idades ////////////////////////////////////
    for(i in 0..24){
        if (sexos.get(i).equals("Feminino") && alreadyExecuteOnce == false){
            auxOld = idades.get(i)
            auxYoung = idades.get(i)
            alreadyExecuteOnce = true
            sumAges += idades.get(i)
            count++
        } else if(sexos.get(i).equals("Feminino") && idades.get(i) >= auxOld){
            auxOld = idades.get(i)
            positionOld = i
            sumAges += idades.get(i)
            count++
        } else if(sexos.get(i).equals("Feminino") && idades.get(i) <= auxYoung){
            auxOld = idades.get(i)
            positionYoung = i
            sumAges += idades.get(i)
            count++
        }
    }

    println("A mulher mais velha é ${nomes.get(positionOld)} e ela tem ${idades.get(positionOld)}")
    println("A mulher mais nova é ${nomes.get(positionYoung)} e ela tem ${idades.get(positionYoung)}")
    println("A média da idade das mulheres ${sumAges/count}")
//////////////////////////////////// mulheres - idades ////////////////////////////////////

    println("---------------------------------------------------------------------------------------------------")

//////////////////////////////////// media de todas as idades ////////////////////////////////////

    for(i in 0..24){
        sumAges += idades.get(i)
        count++
    }

    println("A média das idades é: ${sumAges/count}")
//////////////////////////////////// media de todas as idades ////////////////////////////////////
    println("---------------------------------------------------------------------------------------------------")
    println("---------------------------------------------------------------------------------------------------")
//////////////////////////////////// media de todas as idades ////////////////////////////////////

    count = 0
    alreadyExecuteOnce = false
//////////////////////////////////// homens - salarios ////////////////////////////////////
    for(i in 0..24){
        if (sexos.get(i).equals("Masculino") && alreadyExecuteOnce == false){
            auxHighestSalary = salarios.get(i)
            auxLowestSalary = salarios.get(i)
            alreadyExecuteOnce = true
            sumSalaries += salarios.get(i)
            count++
        } else if(sexos.get(i).equals("Masculino") && salarios.get(i) >= auxHighestSalary){
            auxHighestSalary = salarios.get(i)
            positionHighest = i
            sumSalaries += salarios.get(i)
            count++
        } else if(sexos.get(i).equals("Masculino") && salarios.get(i) <= auxLowestSalary){
            auxHighestSalary = salarios.get(i)
            positionLowest = i
            sumSalaries += salarios.get(i)
            count++
        }
    }

    println("O homem com o salario mais alto é o ${nomes.get(positionHighest)} e ele ganha ${salarios.get(positionHighest)}")
    println("O homem com o salario mais baixo é o  ${nomes.get(positionLowest)} e ele ganha ${salarios.get(positionLowest)}")
    println("A média dos salarios dos homens é ${sumSalaries/count}")
//////////////////////////////////// homens - salarios ////////////////////////////////////
    println("---------------------------------------------------------------------------------------------------")
    //////////////////////////////////// homens - salarios ////////////////////////////////////
    for(i in 0..24){
        if (sexos.get(i).equals("Feminino") && alreadyExecuteOnce == false){
            auxHighestSalary = salarios.get(i)
            auxLowestSalary = salarios.get(i)
            alreadyExecuteOnce = true
            sumSalaries += salarios.get(i)
            count++
        } else if(sexos.get(i).equals("Feminino") && salarios.get(i) >= auxHighestSalary){
            auxHighestSalary = salarios.get(i)
            positionHighest = i
            sumSalaries += salarios.get(i)
            count++
        } else if(sexos.get(i).equals("Feminino") && salarios.get(i) <= auxLowestSalary){
            auxHighestSalary = salarios.get(i)
            positionLowest = i
            sumSalaries += salarios.get(i)
            count++
        }
    }

    println("A mulher com o salario mais alto é a ${nomes.get(positionHighest)} e ela ganha ${salarios.get(positionHighest)}")
    println("A mulher com o salario mais baixo é a  ${nomes.get(positionLowest)} e ela ganha ${salarios.get(positionLowest)}")
    println("A média dos salarios das mulheres é ${sumSalaries/count}")
//////////////////////////////////// homens - salarios ////////////////////////////////////
    println("---------------------------------------------------------------------------------------------------")
//////////////////////////////////// media de todos os salarios ////////////////////////////////////

    for(i in 0..24){
        sumSalaries += salarios.get(i)
        count++
    }

    println("A média de todos os salarios é: ${sumSalaries/count}")
//////////////////////////////////// media de todos os salarios ////////////////////////////////////
    println("---------------------------------------------------------------------------------------------------")
    println("---------------------------------------------------------------------------------------------------")

    var highestDirectorPosition = 0
    alreadyExecuteOnce = false

//////////////////////////////////// diretor com maior salario ////////////////////////////////////
    for(i in 0..24){
        if (cargos.get(i).equals("Diretor") && alreadyExecuteOnce == false){
            highestDirectorPosition = i
            alreadyExecuteOnce = true
        } else if(cargos.get(i).equals("Diretor") && salarios.get(i) >= salarios.get(highestDirectorPosition)){
            highestDirectorPosition = i
        }
    }

    println("Diretor com o maior salario é o ${nomes.get(highestDirectorPosition)} e seu salario é ${salarios.get(highestDirectorPosition)}")
//////////////////////////////////// diretor com maior salario ////////////////////////////////////
    println("---------------------------------------------------------------------------------------------------")

    var greatestName = 0
    alreadyExecuteOnce = false

//////////////////////////////////// maior nome ////////////////////////////////////
    for(i in 0..24){
        if (alreadyExecuteOnce == false){
            greatestName = i
            alreadyExecuteOnce = true
        } else if(nomes.get(i).length >= nomes.get(greatestName).length){
            greatestName = i
        }
    }
    println("O maior nome entre os funcionários é ${nomes.get(greatestName)}")
//////////////////////////////////// maior nome ////////////////////////////////////

    println("---------------------------------------------------------------------------------------------------")

//////////////////////////////////// pessoas com 18 anos ////////////////////////////////////


    println("Pessoas com 18 anos: ")

    for(i in 0..24){
        if(idades.get(i) == 18){
            println("       ${nomes.get(i)}")
        }
    }

//////////////////////////////////// pessoas com 18 anos ////////////////////////////////////

    println("---------------------------------------------------------------------------------------------------")

//////////////////////////////////// pessoas com o nome iniciando com a letra A ////////////////////////////////////
    println("Pessoas com nome iniciando em A: ")

    for(i in 0..24){
        if(nomes.get(i).first().lowercase().equals("a")){
            println("       ${nomes.get(i)}")
        }
    }
//////////////////////////////////// pessoas com o nome iniciando com a letra A ////////////////////////////////////



    }



