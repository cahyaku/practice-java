import java.util.Scanner;

public class NumberGuessingGameTestDrive {
    public static void main(String[] args) {
        NumberGuessingGame game = new NumberGuessingGame();
        Scanner scanner = new Scanner(System.in);
        String result;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100.");

        // Mengulangi hingga pengguna menebak dengan benar
        while (true) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt(); // Membaca tebakan pengguna
            result = game.checkGuess(userGuess); // Memeriksa tebakan pengguna

            System.out.println(result);
            if (result.startsWith("Correct!")) {
                break; // Menghentikan permainan jika tebakan benar
            }
        }

        scanner.close();
    }
}