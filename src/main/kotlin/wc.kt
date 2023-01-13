import java.io.File

fun main(args: Array<String>){
    val srcFile = File(args[0])
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
    var sum: Int = 0
    //display map
    for (key in wordFreq.keys) {
        println("$key = ${wordFreq[key]}")
        sum += wordFreq.getValue(key)
    }
    //total words
    println("Total Words = $sum")
}