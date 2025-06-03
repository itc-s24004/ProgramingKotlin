package chap31

class FlyingPerson (name: String, age: Int) : Person(name, age), Flyable {
    override fun fly() {
        println("すごい!")
    }
}