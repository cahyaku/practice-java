public class Mix4 {
    int counter = 0;

    public static void main(String[] args) {
        int count = 0;

        // create array yang berisi object Mix4
        Mix4[] m4a = new Mix4[20];
        int x = 0;

        while (x < 19) {
            // jika nilai x masih true maka create new object, dan append dalam array m4a[x].
            m4a[x] = new Mix4();
            m4a[x].counter = m4a[x].counter + 1;// atau bisa disingkat m4a[x].counter++;
            count = count + 1;
            count = count + m4a[x].mayBeNew(x);
            x = x + 1;
        }
        System.out.println(count + " " + m4a[1].counter);

    }

    public int mayBeNew(int index) {
        if (index < 1) {
            Mix4 m4 = new Mix4();
            m4.counter = m4.counter + 1;
            return 1;
        }
        return 0;
    }

}
