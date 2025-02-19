package Inheritance;

/**
 * Melakukan extends yang pertama
 * Jadi class B juga akan dapat memiliki method yang berada pada class A.
 */
class B extends A {
    // Ini karena di deklarasikan kembali, berarti melakukan override.
    // Jadi method m1 yang akan digunakan adalah yang ada pada method ini.
    void m1() {
        System.out.println("B's m1, ");
    }
}