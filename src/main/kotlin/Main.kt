fun main(args: Array<String>) {


//println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
   // println("Program arguments: ${args.joinToString()}")
    //List - immutable, ordered, can contain duplicates, istovrsni tipovi
    val colors = listOf("red", "blue","green")
    println(colors)

    val colors2 = listOf<String?>("red", "blue", null, null)
    println(colors2)
    println(colors2[0])
    println(colors2.size)

    val colors3 = listOf<String>()
    println(colors3)
    println(colors3.size)
println(colors3.isEmpty())
    println(colors3.contains("red"))

    //mutable liste

    val colors4 = arrayListOf<String?>("Blue", "Red")
    println(colors4)
    colors4.add("Green")
    println(colors4)
    colors4.addAll(colors2)
    println(colors4)
    colors4.remove("Blue")
    println(colors4)
    colors4.removeLast()
    println(colors4)
    colors4.removeAll(listOf("red"))

    //colors4.clear()
    println(colors4)

    //Setovi - nema ponavljanja

    val colors5 = listOf("red", "green")
    val colors6 = arrayListOf("red", "green")//da se moze remove
    println(colors5 == colors6)
    colors6.remove("red")
    println(colors5 == colors6)

    val numersSet = setOf(1,2,3,null,null)
    println(numersSet)
    println(numersSet.contains(1))
    //println(numersSet[0])//nema indexacije
    println(numersSet.size)
    println(numersSet.isEmpty())
    println("************")


    //mutaboilni set

    val numberHashSet= hashSetOf(1,2,3,null,null)
    println(numberHashSet)
    numberHashSet.add(5)
    println(numberHashSet)

    val colorsHashset = hashSetOf("blue", "red")
    println(colorsHashset)
    colorsHashset.addAll(colors6)
    println(colorsHashset)



}