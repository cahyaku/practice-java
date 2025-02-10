import java.util.ArrayList;
//import java.util.ArrayList;

public class DotComBust {
    /**
     * Step 1 (Variable declarations)
     * Declare and instantiate the GameHelper instance variable, named helper.
     * Declare and instantiate an ArrayList to hold the list of DotComs.
     * Declare an int variable to hold the number of  user guesses.
     */
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numberOfGuesses = 0;

    /**
     * Step 2 (Method declarations)
     * Declare a setUpGame() method, untuk membuat & menginisialisasi objek DotCom dengan nama & lokasi.
     * Declare a startPlaying() method, meminta tebakan dari pemain dan memanggil method checkUserGuess().
     * Declare a checkUserGuess() method, untuk mengulang / loops semua object DotCom
     * dan memanggil setiap method checkYourself().
     */
    private void setUpGame() {
        /**
         * Make three DotCom objects, give names and stick in the ArrayList
         */
        DotCom one = new DotCom();
        one.setName("Pets.com");

        DotCom two = new DotCom();
        two.setName("eToys.com");

        DotCom three = new DotCom();
        three.setName("Go2.com");

        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

        // Mencetak instruksi singkat untuk pengguna
        System.out.println("Your goal is to sink three dot coms.");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Try to sink them all in the fewest number of guesses.");

        // Ulangi DotCom list
        for (DotCom dotComToSet : dotComsList) {
            // mintalah helper untuk lokasi DotCom sebuah arrayList dari String
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation); // untuk memberi lokasi
        }
    }

    private void startPlaying() {
        /**
         * Ulangi setiap DotCom dalam datar slema DotCom list tidak kosong,
         * dan panggil method checkUserGuess.
         */
        while (!dotComsList.isEmpty()) {
            String userGuess = helper.getUserInput("Enter a guess");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void checkUserGuess(String userGuess) {
        numberOfGuesses++; // increment, untuk jumlah tebakan yang telah dibuat pengguna
        String result = "miss";
        //ulangi degan semua DotCom dalam daftar
        for (DotCom dotComTest : dotComsList) {
            result = dotComTest.checkYourSelf(userGuess);
            if (result.equals("hit")) {
                break;
            }
            if (result.equals("kill")) {
                dotComsList.remove(dotComTest);
                break;
            }
        }
        System.out.println(result);
    }

    private void finishGame() {
        System.out.println("All Dot Coms are dead! Your stock is now worthless.");
        if (numberOfGuesses <= 18) {
            System.out.println("It only took you " + numberOfGuesses + " guesses.");
            System.out.println("You got out before your options sank.");
        } else {
            System.out.println("Took you  long enough. " + numberOfGuesses + " guesses.");
            System.out.println("Fish are dancing with your options");
        }
    }

    public static void main(String[] args) {
        // create the game object
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }
}
