public class SimpleDotComTestDrive {
    public static void main(String[] args) {

        /**
         * Based on the page 103.
         */
//        SimpleDotCom dot = new SimpleDotCom();
//        int[] locations = {2, 3, 4};
//        dot.setLocationCells(locations);
//
//        String userGuess = "2";
//        String result = dot.checkYourself(userGuess);
//        String testResult = "failed";
//        if (result.equals("hit")) {
//            testResult = "passed";
//        }
//        System.out.println(testResult);


        /**
         *  Based on the page 110, by using math.random()
         */
        int numberOfGuesses = 0; // Untuk melacak berapa banyak tebakan yang dibuat oleh pengguna.

        GameHelper helper = new GameHelper(); // class untuk mendapatkan inputan dari pengguna.

        // instantiate a simple dot com object
        SimpleDotCom theDotCom = new SimpleDotCom();

        int randomNum = (int) (Math.random() * 5); // membuat nomor acak untuk sel

        // declare an array int with random number
        int[] locations = {randomNum, randomNum + 1, randomNum + 2}; // menampung hasilnya dalam bentuk array
        // value dalam array ini yang nantinya akan dikirim
        // ke method setLocationCells()
        theDotCom.setLocationCells(locations);

        boolean isAlive = true; // membuat variable boolean untuk melacak apakah game tersebut masih hidup
        // dan akan digunakan dalam (loop test).

        // Loop Test
        while (isAlive == true) {
            String guess = helper.getUserInput("Enter a number");
            String result = theDotCom.checkYourself(guess);
            numberOfGuesses++;

            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("You took " + numberOfGuesses + " guesses");
            }
        }


////        // invoke/ panggil setter method on the dot com
////        dot.setLocationCells(locations);
////
////        // make a fake user guess
////        String userGuess = "1"; // ini seperti inputan dari user
////
////        // panggil method checkYourSelf() on the dot com object
////        String result = dot.checkYourSelf(userGuess);
    }
}

