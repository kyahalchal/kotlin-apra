import java.io.File
//import java.nio.file.Paths

//method to diplay content of program
fun catF(filePath: String): Unit {
    val srcFile = File(filePath)
    for (line in srcFile.readLines()){
        println(line)
    }
}

//method to copy content of a given file to another file
fun copyF(srcPath: String, destPath: String): Unit {
    val srcFile =  File(srcPath)
    val destFile =  File(destPath)
    for (line in srcFile.readLines()){
        destFile.appendText(line+"\n")
    }
}

//method to display frequency of each words in a given file
fun countWord(filePath: String): Unit {
    val srcFile = File(filePath)
    var wordFreq  = mutableMapOf<String, Int>()

    //stores key and value in map
    for (line in srcFile.readLines()){
        var lineSplit = line.split(" ",",",". ",";",":","/","\n","?","\\","<",">","#",
            "{","}","[","]","\"","!","@","$","%","^","&","*","(",")","\t","\r",".") //these are the delimeters
        for (word in lineSplit){
            if (word in wordFreq){
                var count = wordFreq.getValue(word)
                wordFreq[word] = count+1
            }else{
                wordFreq[word] = 1
            }
        }
    }

    wordFreq.remove("")  //removes mapping of empty string

    //display map
    for (key in wordFreq.keys) {
        println("$key = ${wordFreq[key]}")
    }
}

fun main(args: Array<String>) {
    var command = args
    println(args)
//    val path = Paths.get("").toAbsolutePath().toString()


//    val path = System.getProperty("user.dir")
    /*do {
//        print("$path>")
        var command = args  //example - cat filepath.txt
        var commandSplit = command.split(" ") //["cat", "filepath.txt"]

        when (commandSplit[0]){
            "cat" -> try{
                        catF(commandSplit[1])
                    }catch (e: java.io.FileNotFoundException){
                        println("File not found")
                    }
            "copy" -> try {
                        copyF(commandSplit[1],commandSplit[2])
                    }catch (e: java.io.FileNotFoundException){
                        println("File not found")
                    }
            "wc" -> try {
                        countWord(commandSplit[1])
                    }catch (e: java.io.FileNotFoundException){
                        println("File not found")
                    }
            "exit" -> print("Exiting...")
            else -> print("Invalid Query")
        }
        println()
    }while (commandSplit[0] != "exit")*/
}
