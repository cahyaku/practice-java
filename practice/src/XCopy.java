public class XCopy {
    public static void main(String[] args) {
        int orig = 42;

        XCopy x = new XCopy();
        int y = x.go(orig);

        System.out.println(orig + " " + y);
    }

    // Method yang akan mengembalikan return value dalam bentu int.
    int go(int arg) {
        return arg * 2;
    }
}
