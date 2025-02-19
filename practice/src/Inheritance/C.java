package Inheritance;

/**
 * Melakukan pewarisan yang ke-2 untuk kelas C, dimana class B juga memiliki
 * method dari kelas A karena (sudah extends class A).
 * Jadi kelas C akan sama memiliki semua method yang ada di class A.
 */
public class C extends B {

    // Deklarasikan kembali, berarti melakukan override.
    // Jadi method m1 yang akan digunakan adalah yang ada pada method ini.
    void m1() {
        System.out.println("C's m3, " + (ivar + 6));
    }
}
