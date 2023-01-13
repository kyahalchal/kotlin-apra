import java.io.File

fun main(args: Array<String>){
    val srcFile = File(args[0])
    for (line in srcFile.readLines()){
        println(line)
    }
}