package f02

enum class Difficulty {
    EASY, MEDIUM, HARD
}

// 제너릭을 사용한 재사용 가능한 클래스
data class Question<answerType>(
    val questionText: String,
    val answer: answerType,
    val difficulty: Difficulty
)

interface ProgressPrintable {
    val progressText: String
    fun printProgressBar()
}

class Quiz : ProgressPrintable {
    val question1 = Question<String>("학교 이름은?", "광운대학교", Difficulty.EASY)
    val question2 = Question<Int>("만나이 몇살?", 18, Difficulty.MEDIUM)
    val question3 = Question<Boolean>("지금 졸려?", true, Difficulty.HARD)

    companion object StudentProgress {
        var total = 17
        var answered = 7
    }

    override val progressText: String
        get() = "${answered} of ${total} answered."

    override fun printProgressBar() {
        repeat(Quiz.answered) { print("▓") }
        repeat(Quiz.total) { print("▒") }
        println()
        println(progressText) //Quiz 참조를 삭제하여 인터페이스의 새 progressText 변수를 참고
        println()
    }

    fun printQuiz() {
        question1.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
            println()
        }
        question2.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
            println()
        }
        question3.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
            println()
        }

    }
}

// 위 클래스 override로 인해 미사용
/*val Quiz.StudentProgress.progressText: String
    get() = "${answered} of ${total} answered."*/

//확장 함수
/*fun Quiz.StudentProgress.printProgressBar() {
    repeat(Quiz.answered) { print("▓") }
    repeat(Quiz.total) { print("▒") }
    println()
    println(Quiz.progressText)
}*/

fun main() {
    Quiz().printProgressBar()
    Quiz().apply { printQuiz() }
}
