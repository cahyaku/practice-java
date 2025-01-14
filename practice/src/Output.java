public class Output {
    public static void main(String[] args) {
        // Membuat object baru.
        Output o = new Output();

        // ini memanggil method/function go().
        o.go();
    }

    // method ini tidak mengembalikan return value.
    void go() {
        int y = 7;

        // Dalam for juga langsung men-declare variable x.
        // Dan ingat dalam for ini x  itu selalu ditambah 1.
        for (int x = 1; x < 8; x++) {
            y++;
            if (x > 4) {
                System.out.print(++y + " ");
            }

            if (y > 14) {
                System.out.println(" x = " + x);
                break;
            }
        }
    }
}

// Run code diatas atau berikut ini adalah hasil output yang dihasilkan:
// 13 15 x = 6