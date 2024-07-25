fun main() {
    printWithColor("Digite uma frase: ")
    var phrase = readln()

    printWithColor("Digite a palavra que deseja substituir: ")
    val wordToReplace = readln()

    printWithColor("Digite a nova palavra: ")
    val newWord = readln()

    phrase = phrase.replace(wordToReplace, newWord.toString())

    printWithColor("Nova frase: ")
    println("\u001b[0m$phrase")
}

fun printWithColor(text: String) {
    val greenColor = "\u001b[32m"
    val resetColor = "\u001b[0m"

    print(greenColor + text + resetColor)
}