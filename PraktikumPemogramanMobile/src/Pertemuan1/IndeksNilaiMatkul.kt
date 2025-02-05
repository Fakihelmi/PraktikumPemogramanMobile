package Pertemuan1
class IndeksNilaiMatkul {
    fun hitungIndeks(nilaiAkhir: Int?): String {
        // Check if value is null or empty
        if (nilaiAkhir == null) {
            return "Nilai harus diisi"
        }

        // Check if value is within valid range
        return when {
            nilaiAkhir in 80..100 -> "A"
            nilaiAkhir in 70..79 -> "AB"
            nilaiAkhir in 60..69 -> "B"
            nilaiAkhir in 50..59 -> "BC"
            nilaiAkhir in 40..49 -> "C"
            nilaiAkhir in 30..39 -> "D"
            nilaiAkhir in 0..29 -> "E"
            else -> "Nilai di luar jangkauan"
        }
    }
}