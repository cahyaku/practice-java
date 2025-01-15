public class MultiFor {
    public static void main(String[] args) {
        /**
         * Membuat for dalam for (multi for)
         */

        // Nilai yang dihasilkan oleh variable x adalah 0, 1, 3 karena x diawal diset dengan 0, dan harus kurang dari 4.
        // Perlu diingat tidak ada dua, karena terdapat kondisi jika x == 1 akan + 1.
        for (int x = 0; x < 4; x++) {

            // Nilai y akan selalu 4 dan 3, karena y diawal diset 4, dan y harus lebih besar dari 2.
            // Perlu diingat bahwa y tidak ada auto increment-nya.
            for (int y = 4; y > 2; y--) {
                System.out.println(x + " " + y);
            }

            // Jika nilai x == 1 maka jumlahkan nilai x dengan 1.
            if (x == 1) {
                x++;
            }
        }
    }
}

// Hasil result setelah di-run (nilai yang ditampilkan untuk x) adalah 0,1,dan 3
// Ada kondisi jika  x == 1 maka akan ditambahkan dengan 1 sehingga hasilnya adalah 2.
// Tapi yang saya bingung kenapa nilai 2 tidak tampil saat println.
// Padahal nilai x = 2 memenuhi syarat untuk x < 4, dan dalam for