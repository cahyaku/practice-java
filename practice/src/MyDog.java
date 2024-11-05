public class MyDog {

    // Instance variable
    int size;
    String name;

    void bark() {
        if (size > 60) {
            System.out.println("Woof! Woof!");
        } else if (size > 14) {
            System.out.println("Ruff! Ruff!");
        } else {
            System.out.println("Meow! Meow! Yip! Yip!");
        }
    }
}
