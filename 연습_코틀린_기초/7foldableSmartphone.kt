open class Phone(var isScreenLightOn: Boolean = false) {
    open fun switchOn() {
        isScreenLightOn = true
    }

    fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class FoldablePhone(var isFolded: Boolean = true) : Phone() {
    override fun switchOn() {
        if (!isFolded) {
            isScreenLightOn = true
        }
    }

    fun fold() {
        isFolded = true
    }

    fun unFold() {
        isFolded = false
    }
}

fun main() {
    val galaxyFold4 = FoldablePhone()

    galaxyFold4.unFold()
    galaxyFold4.checkPhoneScreenLight()
    galaxyFold4.switchOn()
    galaxyFold4.checkPhoneScreenLight()
    galaxyFold4.switchOff()
    galaxyFold4.checkPhoneScreenLight()

    galaxyFold4.fold()
    galaxyFold4.checkPhoneScreenLight()
    galaxyFold4.switchOn()
    galaxyFold4.checkPhoneScreenLight()
    galaxyFold4.switchOff()
    galaxyFold4.checkPhoneScreenLight()
}