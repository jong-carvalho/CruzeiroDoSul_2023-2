function consultaEndereco() {
    cep = document.querySelector('#cep').value;

    if(cep.length !== 8) {
        alert('Cep inválido!');
        return;
    }

    url = `https://viacep.com.br/ws/${cep}/json`
// fetch bate na url informado
// response vai ser o retorno que a api vai dar
// data é o conteúdo do json
    fetch(url).then(function(response){
        console.log(response)
        response.json().then(function(data){
            console.log(data)
            mostrarEndereco(data)
        })
    })
}

function mostrarEndereco(dados) {
    // querySelector = enncontra o primeiro elemento que bate com o informado
    let resultado = document.querySelector('#resultado');

    if(dados.erro) {
        resultado.innerHTML = "<p>Não foi possível localizar endereço</p>"
    } else {
    resultado.innerHTML = `<p class="atributos">Endereço:</p> <p>${dados.logradouro}</p>
    <p class="atributos">Complemento:</p><p> ${dados.complemento}</p>
    <p class="atributos">Bairro:</p><p> ${dados.bairro}</p>
    <p class="atributos">Cidade:</p><p> ${dados.localidade} - ${dados.uf}</p>`
    }
}