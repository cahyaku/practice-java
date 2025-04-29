import java.util.Random;

public class NumberGuessingGame {
    private int targetNumber; // Angka yang harus ditebak
    private int attempts; // Jumlah upaya tebakan

    // Konstruktor untuk menginisialisasi permainan
    public NumberGuessingGame() {
        Random rand = new Random();
        this.targetNumber = rand.nextInt(100) + 1; // Angka acak antara 1 dan 100
        this.attempts = 0; // Inisialisasi jumlah upaya
    }

    // Method untuk memeriksa tebakan pengguna
    public String checkGuess(int userGuess) {
        attempts++; // Menambah jumlah upaya menebak

        // Membandingkan tebakan pengguna dengan angka target
        if (userGuess == targetNumber) { // jika tenbakan sama persis
            return "Correct! You've guessed the number in " + attempts + " attempts.";
        } else if (userGuess < targetNumber) { // jika tebakan kurang dari terget
            return "Too low! Try again.";
        } else { // jika tebakan lebih dari target
            return "Too high! Try again.";
        }
    }
}