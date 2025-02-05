package Pertemuan1

    fun main() {
        //persegipanjang//
        println("--- Persegi Panjang (Rectangle) ---")
        val persegiPanjang = PersegiPanjang(4.0, 2.0)
        println("Panjang: 4")
        println("Lebar: 2")
        println("Luas: ${persegiPanjang.hitungLuas()}")
        println("Keliling: ${persegiPanjang.hitungKeliling()}")

        //hitung nilai//
        println("\n--- Indeks Nilai Matkul (Course Grade Index) ---")
        val indeksNilai = IndeksNilaiMatkul()
        val testCases = listOf(77, 110, null, 25)

        testCases.forEachIndexed { index, nilai ->
            println("Test Case ${index + 1}: $nilai -> ${indeksNilai.hitungIndeks(nilai)}")
        }
    }

