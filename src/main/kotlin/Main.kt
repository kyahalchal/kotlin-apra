import java.io.File

fun catF(filePath: String): Unit {
    val srcFile = File(filePath)
    for (line in srcFile.readLines()){
        println(line)
    }
}

fun copyF(SourcePath: String, DestPath: String): Unit {
    val srcFile =  File(SourcePath)
    val destFile =  File(DestPath)
    for (line in srcFile.readLines()){
        destFile.appendText(line+"\n")
    }
}

fun countWord(filePath: String): Unit {
    val srcFile = File(filePath)
    var wordFreq = LinkedHashMap<String, Int>()
    for (line in srcFile.readLines()){
        var lineSplit = line.split(" ")

    }

}

fun main() {
//    val sc = Scanner(System.`in`)
    do {
        println("Choose: ")
        var command = readln()
        var commandSplit = command.split(" ")

        when (commandSplit[0]){
            "cat" -> catF(commandSplit[1])
            "copy" -> copyF(commandSplit[1],commandSplit[2])
            "exit" -> print("Thanks for coming!")
            "cw" -> countWord(commandSplit[1])
            else -> print("Invalid Query")
        }
    }while (commandSplit[0] != "exit")
}