package f01

fun main() {
    var favoriteActor: String? = null

    // val lengthOfName = favoriteActor?.length
    val lengthOfName = favoriteActor?.length ?: 0

    println("The number of characters in your favorite actor's name is $lengthOfName.")
}

/*
fun main() {
    var favoriteActor: String? = "Sandra Oh"

    val lengthOfName = if (favoriteActor != null) {
        favoriteActor.length
    } else {
        0
    }

    println("The number of characters in your favorite actor's name is ${lengthOfName}")
}*/

/*
fun main() {
    var favoriteActor: String? = "Sandra Oh"

    if (favoriteActor != null) {
        println("The number of characters in your favorite actor's name is ${favoriteActor.length}")
    } else {
        println("You didn't input a name")
    }
}*/

/*
fun main() {
    var favoriteActor: String? = null
    println(favoriteActor!!.length)
    // 에러 발생 - NullPointerException
}*/

/*
fun main() {
    var favoriteActor: String? = "RDJ"

    println(favoriteActor)

    favoriteActor = null

    println(favoriteActor)
}*/