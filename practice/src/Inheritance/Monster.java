package Inheritance;

public class Monster {
    boolean frighten(int d) {
        System.out.println("arrrgh");
        return true;
    }
}

// Karena satu file tidak perlu di set public lagi
class Vampire extends Monster {
    boolean frighten(int x) {
        System.out.println("a bite?");
        return false;
    }
}

class Dragon extends Monster {
    boolean frighten(int degree) {
        System.out.println("breath fire");
        return true;
    }
}