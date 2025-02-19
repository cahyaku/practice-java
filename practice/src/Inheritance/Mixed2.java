package Inheritance;

public class Mixed2 {
    public static void main(String[] args) {
        // create new object
        A a = new A();
        B b = new B();
        C c = new C();
        A a2 = new A();

        // Ini candidates code yang sesuai dengan hasil output seperi pada page 192.

//        b.m1();
//        c.m2();
//        a.m3();

        // Hasil yang ini masih sedikit ragu, saya pikir c.m1 output = A's m1,
        // tapi yang keluar malah C's m3, 13, entah ini asalnya dari mana.
        c.m1();
        c.m2();
        c.m3();

//        a.m1();
//        b.m2();
//        c.m3();

//        a2.m1();
//        a2.m2();
//        a2.m3();
    }
}
