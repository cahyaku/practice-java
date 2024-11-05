import java.util.ArrayList;
import java.util.Arrays;

public class Shuffle1 {
    /**
     * Exercise 1, page 20, using method
     * @param x , type int
     * Untuk lebih jelasnya debug saja (jadi bisa langsung melihat perubahan valuenya) => just smile (•ᴗ•).
     */
    static void shuffleTest(int x) {
        // looping terus berjalan selama value di x lebih besar dari 0
        while (x > 0) {
            if(x > 2) {
                System.out.print("a");
            }

            // Jika berhasil lolos ke line ini, berarti x nilainya lebih besar dari 2.
            // disini pengurangannya, sehingga x akan di awal = 3 akan menjadi 2.
            // dengan value setelah substract > 0
            // (intinya selama hasil penguran masih > 0 dia akan masuk ke block while lagi).
            x = x - 1;
            System.out.print("-");

            if(x == 2 ) {
                System.out.print("b c");
            }

            // Hingga value x mencapai 1 baru dia akan masuk ke blok kode ini
            if(x == 1) {
                System.out.print("d");

                // ini perlu agar x menjadi 0, jika tidak dia akan masuk lagi ke block while
                // dan akan lolos di x - 1 lalu  dilanjutkan dengan System.out.print("-");
                x = x - 1;
            }
        }
    }


    /**
     * Ini jika suatu method me-return array
     * @return array of name
     */
    static String[] showListOfName()
    {
        // Ini hanya mencoba membuat array aja, karena biasanya pakai object (•ᴗ•)
        // ex. membuat string array of name, sengaja tidak inline return (biar bisa lihat cara declare-nya).
        String[] name = {"Cahya Kumala", "Ayong", "Bunda lopez", "Omang Cutyyy"};
        return name;
    }

    /**
     * Try to create loop with array list
     */
    static void sayHello() {
        for (int i = 0; i < showListOfName().length; i++) {
            System.out.println("Hai hai halowww telolet haha (˶ˆᗜˆ˵) " + showListOfName()[i]);
        }
    }

    // method main
    public static void main(String[] args) {
        int x = 3;
        // call method
        shuffleTest(x);
        System.out.println();

        System.out.println("-----------------------------");
        //ex. cek jumlah panjang list di suatu array
        int listOfName = showListOfName().length;
        System.out.println(listOfName);

        System.out.println("-----------------------------");
        //ex. membuat array of age
        int[] age = {19,20,21,22,23,24,25};
        System.out.println(Arrays.toString(age));
        int countListOfAge = age.length;
        System.out.println(countListOfAge);

        System.out.println("-----------------------------");
        //ex. ingin mengambil data ke-index ya sama tinggal [indexnya]
        String name = showListOfName()[0];
        System.out.println(name);

        System.out.println("-----------------------------");
        sayHello();
    }
}
