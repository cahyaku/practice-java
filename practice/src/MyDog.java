public class MyDog {

    // Instance variable
    // encapsulation private int size
    private int size;
    String name;


    /**
     * Getter dan setter, ini yang akan digunakan untuk mengganti value instance variable
     * karena instance variable untuk size sudah diset private, dan tidak bisa diakses dengan nama object.instancevariabelnya
     */
    public int getSize() {
        return size;
    }

    public void setSize(int s) {
        size = s;
    }

    /**
     * method with param
     */
    void bark(int numberBarks) {
        while (numberBarks > 0) {
            if (size > 60) {
                System.out.println("Woof! Woof!");
            } else if (size > 14) {
                System.out.println("Ruff! Ruff!");
            } else {
                System.out.println("Meow! Meow! Yip! Yip!");
            }
            numberBarks--;
        }
        System.out.println("__________________________");
    }
}
