
// compras quitanda

let expr = "cereja"

switch(expr) {
    case "laranjas":
        console.log("As laranjas custam $3.20 o quilo")
        break
    case "maçãs":
        console.log("As maçãs custam $2.75 o quilo")
        break
    case "bananas":
        console.log("As bananas custam $4.00 a dúzia")
        break
    case "goiabas":
        console.log("As goiabas custam $1.20 o quilo")
        break
    default:
        console.log("Desculpe, estamos sem nenhuma " + expr + ".")
        break
}