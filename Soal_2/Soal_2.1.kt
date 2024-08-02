package Soal_2

fun main() {
    val mataPelajaran = listOf("Bahasa Indonesia", "Bahasa Inggris", "Matematika", "IPA")
    val nilai = mutableListOf<Int>()

    fun inputNilai(mataPelajaran: String): Int {
        while (true) {
            println("Masukkan nilai $mataPelajaran (0-100): ")
            val input = readLine()
            val nilai = input?.toIntOrNull()

            if (nilai != null && nilai in 0..100) {
                return nilai
            } else {
                println("Input tidak valid. Masukkan nilai antara 0 dan 100.")
            }
        }
    }

    for (pelajaran in mataPelajaran) {
        val nilaiPelajaran = inputNilai(pelajaran)
        nilai.add(nilaiPelajaran)
    }

    val rataRata = nilai.sum() / nilai.size

    val grade = when (rataRata) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        in 60..69 -> "D"
        else -> "E"
    }

    println("Nilai rata-rata: $rataRata")
    println("Grade: $grade")
}
