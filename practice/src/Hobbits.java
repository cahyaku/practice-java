public class Hobbits {
    String name;

    public static void main(String[] args) {
        // ini salah
        Hobbits[] hobbits = new Hobbits[3];

        // int z = 0; z harus = -1, karena ada + 1 dalam while, dan array hanya dimulai dari nol.
        int z = -1;

        // Ingat array itu dimulai dari 0, jadi wajib sama jumlahnya
        // kalau tidak pakai array.length
        while (z < 2) {
            z = z + 1;
            // dan karena array di mulai dari 0.
            hobbits[z] = new Hobbits();
            hobbits[z].name = "Bilblo";

            if (z == 1) {
                hobbits[z].name = "Frodo";
            }

            if (z == 2) {
                hobbits[z].name = "Sam";
            }

            System.out.print(hobbits[z].name + " is a ");
            System.out.println("good Hobbit name");
        }
    }
}
