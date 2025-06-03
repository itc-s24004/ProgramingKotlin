package chap26


fun main() {
    val p = Person(age = 7)
}


class Person (val name: String, var age: Int) {
    init {
        println("プライマリコンストラクタのイニシャライザが呼ばれました。")
        println("指定されたパラメータは${name} と  ${age} です。")
    }

    constructor(age: Int) : this(name = "名無しさん", age) {
        println("年齢だけを指定するセカンダリコンストラクタのイニシャライザが呼ばれました。")
    }
}