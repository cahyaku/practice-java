
/**
 * MixedMessage 1
 */
public class MixedMessage1 {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        while(x < 5) {

            //1.  y = x - y , result = 00, 11, 21, 32, , 42.
//            y = x - y;

            //2. y = y + 1, result = 00, 11, 23, 36, 4 10.
//            y = y + x;

            //3. y = y + 2;, if (y > 4) ? y = y - 1 : nothing.
//            y  = y + 2;
//            if (y > 4) {
//                y = y - 1;
//            }

            //4. x = x + 1,  y = y + x
//            x = x + 1;
//            y = y + x;

            //5. penjelasannya nyusul aja
            if (y < 5) {
                x = x + 1;
                if (y < 3) {
                    x  = x - 1;
                }
            }
            y = y + 2;
            System.out.println(x + " " + y);

            x = x + 1;
        }
    }
}
