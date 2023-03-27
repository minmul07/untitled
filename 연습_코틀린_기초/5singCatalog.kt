class Song(
    val title: String,
    val artist: String,
    val releasedYear: Int,
    val playCount: Int
) {
    val isPopular: Boolean
        get() = playCount >= 1000
    fun songReport() {
        println("$title, performed by $artist, was released in $releasedYear.")
    }
}


fun main() {
    val believerSong = Song(title = "Believer", artist = "Imagine Dragon", releasedYear = 2022, playCount = 1010101010)
    believerSong.songReport()
    println(believerSong.isPopular)
}
