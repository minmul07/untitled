package f01

fun main() {
    /*
    val coins: (Int) -> String = {
        "$it quarters"
    } 사용안함. 람다 표현식을 함수에 직접 전달하였음*/

    /*
    val coins: (Int) -> String = { quantity ->
            "$quantity quarters"
    }*/

    val treatFunction = trickOrTreat(false, { "$it quarters" })
    //val treatFunction = trickOrTreat(false) { "$it quarters" } 위와 같음. 후행 람다 문법
    val trickFunction = trickOrTreat(true, null)
    treatFunction()
    trickFunction()

    repeat(4) {
        treatFunction()
    }
    trickFunction()
}

fun trickOrTreat(isTrick: Boolean, extraTreat: ((Int) -> String)?): () -> Unit {
    if (isTrick) {
        return trick
    } else {
        if (extraTreat != null) {
            println(extraTreat(5))
        }
        return treat
    }

}

val trick = {
    println("No Treats!")
}

val treat: () -> Unit = {
    println("Have a treat!")
}

/*
fun trick() {
    println("No Treats!")
} */