public class Exercise2 {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("-------------Exercise A--------------");
        System.out.println();
        int x = 1;
        while(x < 10 ) {
            // Ini harus ada penjumlahannya
            // Karena value x diawal = 1, jika tidak di tambah valuenya =  1 terus  => nested loop,
            // karena kondisi di while x < 1.
            x = x + 1;
            if (x > 3) {
                System.out.println("big x");
            }
        }

        System.out.println();
        System.out.println("-------------Exercise B--------------");
        System.out.println();
        // compile dapat dijalankan karena kondisi value terpenuhi dan, sudah di dalam class
        int c = 6;
        while (c > 1) {
            c = c - 1;
            if (c < 3) {
                System.out.println("small c");
            }
        }

        System.out.println();
        System.out.println("-------------Exercise C--------------");
        System.out.println();
        int y = 5;
        while (y > 1) {
            y = y - 1;
            if(y < 3){
                System.out.println("very small x");
            }
        }


    }



}
