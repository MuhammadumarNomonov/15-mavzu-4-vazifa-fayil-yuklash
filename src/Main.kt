import java.util.Scanner
import kotlin.random.Random
fun main() {
    val input = Scanner(System.`in`)
    var davomEtish = true

    while (davomEtish) {
        println("Fayl nomini kiriting: ")
        val faylNomi = input.next()

        println("Fayl yuklanmoqda...")
        val natija = faylYuklash(faylNomi)
        println(natija)

        println("Qayta yuklash uchun 1 raqamini kiriting : dasturni tugatish uchun boshqa tugmani bosing.")
        val tanlov = input.nextInt()

        davomEtish = tanlov == 1
    }

    println("Dastur tugatildi.")
}

fun faylYuklash(faylNomi: String): String {
    return if (Random.nextBoolean()) {
        "Fayl muvaffaqiyatli yuklandi: $faylNomi"
    } else {
        "Fayl yuklanishda xato: Yuklash muvaffaqiyatsiz bo'ldi."
    }
}  // 4 vazifa

