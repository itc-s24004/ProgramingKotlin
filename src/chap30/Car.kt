package chap30

abstract class Car(val color: String) {
    var distance = 0.0
    open fun drive(d: Double) {
        distance += d
        println("${color}の車が ${d}km 走りました。")
        println("その結果、マイレージは${distance}キロになりました。")
    }
}