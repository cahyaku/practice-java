import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * GameHelper page 112
 */
//public class GameHelper {
//    public String getUserInput(String prompt) {
//        String inputLine = null;
//        System.out.print(prompt + " ");
//        try {
//            BufferedReader is = new BufferedReader(
//                    new InputStreamReader(System.in));
//            inputLine = is.readLine();
//
//            if (inputLine.length() == 0) return null;
//            // if (inputLine.isEmpty()) return null;
//
//        } catch (IOException e) {
//            System.out.println("IOException: " + e);
//        }
//        return inputLine;
//    }
//
//    public ArrayList<String> placeDotCom(int i) {
//        return null;
//    }
//}

/**
 * Page 152 - 153
 */
public class GameHelper {
    // Declare variable
    private static final String alphabet = "abcdefg";
    private int gridLength = 7;
    private int gridSize = 49;
    private int[] grid = new int[gridSize];
    private int comCount = 0;

    public String getUserInput(String prompt) {
        String inputLine = null;
        System.out.print(prompt + " ");
        try {
            BufferedReader is = new BufferedReader(
                    new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0) return null;
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }

        assert inputLine != null; // Ini untuk mengecek jika input line tidak kosong
        return inputLine.toLowerCase();
    }

    public ArrayList<String> placeDotCom(int comSize) {
        ArrayList<String> alphaCells = new ArrayList<String>();

        String temp = null;
        int[] coords = new int[comSize];
        int attempts = 0;
        boolean success = false;
        int location = 0;

        comCount++;
        int incr = 1;
        if ((comCount % 2) == 1) {
            incr = gridLength;
        }

        while (!success & attempts++ < 200) {
            location = (int) (Math.random() * gridSize);
            // System.out.print("try " + location);
            int x = 0;
            success = true;
            while (success && x < comSize) {
                if (grid[location] == 0) {
                    coords[x++] = location;
                    location += incr;
                    if (location >= gridSize) {
                        success = false;
                    }
                    if (x > 0 && (location % gridLength == 0)) {
                        success = false;
                    }
                } else {
                    //System.out.print(" used" + location);
                    success = false;
                }
            }
        }

        int x = 0;
        int row = 0;
        int column = 0;
        // System.out.println("\n");
        while (x < comSize) {
            grid[coords[x]] = 1;
            row = (int) (coords[x] / gridLength);
            column = coords[x] % gridLength;
            temp = String.valueOf(alphabet.charAt(column));
            alphaCells.add(temp.concat(Integer.toString(row)));
            x++;
            //System.out.print(" coord "+x+" = " + alphaCells.get(x-1));//Pernyataan yang memberitahu persis lokasi DotCom
        }
        // System.out.println("\n");
        return alphaCells;
    }
}