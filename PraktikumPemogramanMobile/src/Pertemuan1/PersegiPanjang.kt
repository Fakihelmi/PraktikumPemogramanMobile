package Pertemuan1
    class PersegiPanjang(private val panjang: Double, private val lebar: Double) {
        fun hitungLuas(): Double {
            return panjang * lebar
        }

        fun hitungKeliling(): Double {
            return 2 * (panjang + lebar)
        }
    }
