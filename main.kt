fun main() {
    val lettersOriginal = listOf("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z")
    val lettersFiltered = lettersOriginal.filterIndexed {index, _ -> (index % 2 !=0)}
    for(i in lettersFiltered){
        print (i+" ")
    }
}