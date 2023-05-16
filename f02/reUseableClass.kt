package f02

enum class Difficulty {
    EASY, MEDIUM, HARD
}

class Quiz {
    val question1 = Question<String>("학교 이름은?", "광운대학교", Difficulty.EASY)
    val question2 = Question<Int>("만나이 몇살?", 18, Difficulty.MEDIUM)
    val question3 = Question<Boolean>("지금 졸려?", true, Difficulty.HARD)

    companion object StudentProgress {
        var total = 10
        var answered = 3
    }
}

// 제너릭을 사용한 재사용 가능한 클래스
data class Question<answerType>(
    val questionText: String,
    val answer: answerType,
    val difficulty: Difficulty
)

fun main() {
    println("${Quiz.answered} of ${Quiz.total} answered.")
}

// 싱글톤 객체 사용 중