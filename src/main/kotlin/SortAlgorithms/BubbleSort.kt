package SortAlgorithms

class BubbleSort {
    fun sort(numbers : Array<Int>) : Array<Int>{
        for (lastUnsortedIndex in numbers.size - 1 downTo 0){
            for (i in 0 until lastUnsortedIndex){
                if (numbers[i] > numbers[i + 1]){
                    val temp = numbers[i]
                    numbers[i] = numbers[i+1]
                    numbers[i + 1] = temp
                }
            }
        }
        return numbers
    }
}