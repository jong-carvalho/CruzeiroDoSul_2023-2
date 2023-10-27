let vogais = 0
let consoantes = 0
let letrasDigitadas = ""


function cadastrarLetras() {
    let letra = document.getElementById('letra').value

    if(letra == "Joao_12345" || letra == "Maria_54321"){
        document.getElementById("escrever").innerHTML = `Melhor aluno do mundo!`
    } else if(letra == "a" || letra == "e" || letra == "i" || letra == "o" || letra == "u"){
        vogais++
        letrasDigitadas += letra + ", "
        document.getElementById("escrever").innerHTML = `Letra: ${letra} foi adicionada`
    } else if(letra == "b" || letra == "c" || letra == "d" || letra == "f" || letra == "g" || 
    letra == "h" || letra == "j" || letra == "k" || letra == "l" || letra == "m" || 
    letra == "n" || letra == "p" || letra == "q" || letra == "r" || letra == "s" || 
    letra == "t" || letra == "v" || letra == "w" || letra == "x" || letra == "y" || 
    letra == "z") {
        consoantes++
        letrasDigitadas += letra + ", "
        document.getElementById("escrever").innerHTML = `Letra: ${letra} foi adicionada`
    } else {
        document.getElementById("escrever").innerHTML = `Letra inválida, tente novamente!`
    }
    
}

function mostrarLetras() {
    document.getElementById("escrever").innerHTML = 
    `Vogais digitadas: ${vogais} <br>
    Consoantes digitadas: ${consoantes} <br>
    Total de letras digitadas: ${vogais + consoantes} <br>
    Letras digitadas: ${letrasDigitadas}`
}