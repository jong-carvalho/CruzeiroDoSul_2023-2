
let proteinasAcumuladas = 0

function cadastrarAlimento(){
    let proteinas = document.getElementById('proteinas').value
    
    if(proteinas == "peixe"){
        proteinasAcumuladas+=33
        document.getElementById("escrever").innerHTML = `Proteína: peixe foi adicionada ao seu calculo diário`
    } else if(proteinas == "carne"){
        proteinasAcumuladas+=35
        document.getElementById("escrever").innerHTML = `Proteína: carne foi adicionada ao seu calculo diário`
    } else if(proteinas == "leite"){
        proteinasAcumuladas+=30
        document.getElementById("escrever").innerHTML = `Proteína: leite foi adicionada ao seu calculo diário`
    } else if(proteinas == "ovos"){
        proteinasAcumuladas+=31
        document.getElementById("escrever").innerHTML = `Proteína: ovos foi adicionada ao seu calculo diário`
    } else if(proteinas == "frango"){
        proteinasAcumuladas+=34
        document.getElementById("escrever").innerHTML = `Proteína: frango foi adicionada ao seu calculo diário`
    } else {
        document.getElementById("escrever").innerHTML = `Proteína não reconhecida. Digite novamente`
    }

}

function mostrarInformacoes(){

    let peso = parseFloat(document.getElementById('peso').value)

    let calculoProteico = proteinasAcumuladas/peso

    console.log(calculoProteico)

    if(calculoProteico > 1.5){
        document.getElementById("escrever").innerHTML = `Você está consumindo muita proteína`
    } else if(calculoProteico >= 1.2 && calculoProteico < 1.5){
        document.getElementById("escrever").innerHTML = `Você está consumindo proteína na medida certa`
    } else {
        document.getElementById("escrever").innerHTML = `Você está consumindo pouca proteína`
    }

}