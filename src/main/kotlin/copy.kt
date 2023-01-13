import java.io.File

fun main(args: Array<String>){
    val srcFile =  File(args[0])
    val destFile =  File(args[1])
    for (line in srcFile.readLines()){
        destFile.appendText(line+"\n")
    }
}