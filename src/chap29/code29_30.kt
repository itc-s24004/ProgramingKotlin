package chap29

fun main() {
    val car1 = Ferrari("赤")
    val car2 = Prius("グレー")
    driveByCar(car1)
    driveByCar(car2)

}

//fun driveByCar(car: Ferrari) {
//    car.drive(100.0)
//}
//
//fun driveByCar(car: Prius) {
//    car.drive(100.0)
//}


fun driveByCar(car: Car) {
    car.drive(100.0)
}