public class EchoTestDrive {
    public static void main(String[] args) {

        // create new object
        Echo echo1 = new Echo();
        Echo echo2 = new Echo();

        // set x with value 0
        int x = 0;

        // do looping, by using while
        while(x < 4) {
            echo1.hello();

            // disini apa?
            echo1.count = echo1.count + 1;

            if(x == 3) {
                echo2.count = echo2.count + 1;
            }

            if(x > 0) {
                echo2.count = echo2.count + echo1.count;
            }

            x = x + 1;
        }
        System.out.println(echo2.count);
    }
}
