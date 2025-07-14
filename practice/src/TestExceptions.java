public class TestExceptions {
    public static void main(String [] args) {
//        String test = "no";
        String test = "yes"; // Ganti ini untuk mencoba exception

        try {
            System.out.println("start try");
            doRisky(test);
            System.out.println("end try");
        } catch ( ScaryException se) {
            System.out.println("scary exception");
        } finally {
            System.out.println("finally");
        }
        System.out.println("end of main");
    }
    static void doRisky(String test) throws ScaryException {
        System.out.println("start risky");
        if ("yes".equals(test)) {
            throw new ScaryException();
        }
        System.out.println("end risky");
        return;
    }
}

// Jika tidak ada, maka akan terjadi error saat kompilasi karena ScaryException tidak dikenali.
// Jika ingin membuat custom exception, harus extend dari Exception atau RuntimeException.
// Jika extend dari Exception, maka harus dideklarasikan dengan throws pada method yang melempar exception tersebut.
// Jika extend dari RuntimeException, maka tidak perlu dideklarasikan dengan throws, karena merupakan unchecked exception.
// coba saja komen ini untuk melihat perbedaannya.
class ScaryException extends Exception {
//    ScaryException() {
//        super("This is a scary exception");
//    }
}
