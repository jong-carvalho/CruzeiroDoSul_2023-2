function consultarFilme() {
    let filme = document.getElementById('filme').value;

    console.log(filme)

    url = `http://www.omdbapi.com/?t=${filme}&apikey=7cb4be69`

    utl = url.replace(/ /g, "+")

    console.log(url)
// fetch bate na url informado
// response vai ser o retorno que a api vai dar
// data é o conteúdo do json
    fetch(url).then(function(response){
        console.log(response)
        response.json().then(function(data){
            console.log(data)
            mostrarDadosDoFilme(data)
        })
    })
}


function mostrarDadosDoFilme(dados) {
    // querySelector = enncontra o primeiro elemento que bate com o informado
    let resultado = document.querySelector('#resultado');

    if(dados.Response == "False") {
        resultado.innerHTML = "<p>Não foi possível localizar seu filme</p>"
    } else {
    resultado.innerHTML = `
    <img id="poster" src="${dados.Poster}" alt="${dados.Title}">
        <p><strong>Título:</strong> ${dados.Title}</p>
        <p><strong>Ano:</strong>${dados.Year}</p>
        <p><strong>Nota IMDB:</strong> ${dados.imdbRating}</p>
        <p><strong>Receita:</strong> ${dados.BoxOffice}</p>
    `
    }
}