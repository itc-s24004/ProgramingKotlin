package chap28

class Ferrari(color: String) : Car(color) {
    override fun drive(d: Double) {
        distance += d
        println("${color}のフェラーリが走っています!ブウォォォーン!")
        println("おおっ、かっこいい!!!")
        println("マイレージは ${distance}キロになったぜい!")
    }
}

fun main() {
    val car = Ferrari("赤")
    car.drive(5.0)
    car.drive(10.0)
}