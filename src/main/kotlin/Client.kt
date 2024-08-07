import SortAlgorithms.BubbleSort

fun main(){
    var arrayList = listOf(37,2,12,90,-22,103)
    val bubbleSort = BubbleSort()
    arrayList = bubbleSort.sort(arrayList.toTypedArray()).toList()
    println(arrayList)
}