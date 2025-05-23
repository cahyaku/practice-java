import java.util.ArrayList;

/**
 * New and improved DotCom class.
 */
public class DotCom {

    private ArrayList<String> locationCells; // arrayList lokasi sel
    private String name; // the Dot Com's name.

    // Declare setter method
    // Menggunakan paramter arrayList sebagai lokasi sel ex.(2,3,4).
    public void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }

    /**
     * Basic setter method
     */
    public void setName(String n) {
        name = n;
    }

    public String checkYourSelf(String userInput) {
        String result = "miss";

        // Cek apakah tebakan pengguna ada di ArrayList, dengan menanyakan indexnya.
        int index = locationCells.indexOf(userInput);

        // Cek jika indeks lebih besar dari atau sama dengan nol,
        // tebakan pengguna pasti ada di daftar cells, jadi  hapus.
        if (index >= 0) {
            locationCells.remove(index);

            // Cek jika daftar locations cells kosong maka ini adalah pukulan mematikan.
            if (locationCells.isEmpty()) {
                result = "kill";
                System.out.println("Ouch! You sunk " + name + " : ( ");
            } else {
                result = "hit";
            }
        }
        return result;
    }
}