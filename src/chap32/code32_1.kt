package chap32

fun main() {
    var text: String? = "あいうえお"
    text = null;
    println("文字列 「${text}」 の長さ = ${text?.length}")
}