public class SimpleDotCom {

    // Declare array int
    int[] locationCells; // Untuk menampung sel lokasi
    int numberOfHints = 0; // declare int, untuk jumlah hints

    // Declare setter yang mengambil array int, array tersebut memiliki tiga lokasi sebagai int misal(2,3,4).
    public void setLocationCells(int[] locs) {
        locationCells = locs;
    }

    // Ingat jika membuat method dengan tipe data (bukan void) wajib ada return valuenya.
    // declare check method checkYourSelf() yang mengambil string untuk tebakan pengguna (1,2,3, dst).
    public String checkYourself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);// convert string to an int
        String result = "miss"; // Variabael  untuk menampung hasil yang kita dapatkan kembali.

        for (int cell : locationCells) {

            /**
             * Memeriksa hasil input tebakan
             * Tapi ini masih salah karena setiap tebakan masih di set sebagai hit.
             */
            if (guess == cell) {
                result = "Hit";
                numberOfHints++;
                break;
            }
        }

        if (numberOfHints == locationCells.length) {
            result = "kill";
        }

        System.out.println(result);
        return result; // return the result back to the calling method
    } // end method

//    public static void main(String[] args) {
//        int numOfGuesses = 0;
//        GameHelper helper = new GameHelper();
//        SimpleDotCom theDotCom = new SimpleDotCom();
//        int randomNum = (int) (Math.random() * 5);
//
//        int[] locations = {randomNum, randomNum + 1, randomNum + 2};
//        theDotCom.setLocationCells(locations);
//        boolean isAlive = true;
//        while (isAlive == true) {
//            String guess = helper.getUserInput("enter a number");
//            String result = theDotCom.checkYourself(guess);
//            numOfGuesses++;
//            if (result.equals("kill")) {
//                isAlive = false;
//                System.out.println("You took " + numOfGuesses + "guesses");
//            } // close if
//        } // close while
//    }
} // closed class
