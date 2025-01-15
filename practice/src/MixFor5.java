public class MixFor5 {

    public static void main(String[] args) {
        int x = 0;
        int y = 30;

        // Ini contoh declare sebuah variable outher yang isinya int langsung dalam for.
        for (int outher = 0; outher < 3; outher++) {
            for (int inner = 4; inner > 1; inner--) {
                // Masukan candidates disini:
//                x = x + 3; ini akan menghasilkan 54 dan 6
//                x = x + 6; ini akan menghasilkan 60 dan 10
//                x = x + 2; ini akan menghasilkan 45 dan 6
//                x++; ini akan menghasilkan 36 dan 6
//                x--; ini akan menghasilkan 18 dan 6
//                x = x + 0; ini akan menghasilkan 6 dan 14

                y = y - 2;
                if (x == 6) {
                    break;
                }
                x = x + 3;
            }
            y = y - 2;
        }
        System.out.println(x + " " + y);
    }
}
