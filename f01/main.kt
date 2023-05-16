package f01

/*
fun main() {
    val trafficLightColor = "Green"

    val message =
        if (trafficLightColor == "Red") "Stop"
        else if (trafficLightColor == "Yellow") "Wait"
        else if (trafficLightColor == "Green") "Go"
        else "Invalid traffic-light color"

    println(message)

}*/

/*
fun main() {
    val x: Any = 12.231f

    when (x) {
        2, 3, 5, 7 -> println("x is a prime number between 1 and 10.")
        in 1..10 -> println("x is a number between 1 and 10, but not a prime number.")
        is Int -> println("x is an integer number, but not between 1 and 10.")
        else -> println("x isn't an integer number.")
    }
}*/


fun main() {
    val trafficLightColor = "Green"

    when (trafficLightColor) {
        "Red" -> println("Stop")
        "Yellow" -> println("Wait")
        "Green" -> println("Go")
        else -> println("Invalid traffic-light Color")
    }
}

/*
fun main() {
    val trafficLightColor = "Black"

    if (trafficLightColor == "Red") {
        println("Stop")
    } else if (trafficLightColor == "Yellow") {
        println("Wait")
    } else if (traffiffic-light color")
    }
cLightColor == "Green") {
        println("Go")
    } else {
        println("Invalid tra
} */