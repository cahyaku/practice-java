public class BooksTestDrive {
    public static void main(String[] args) {

        // Create array myBooks with length 10\
        // sepertinya jumlah array yg di-set harus sesuai dengan jumlah data yang akan dibuat.
        Books[] myBooks = new Books[3];
        int x = 0;

        // Jika ingin mengisi array myBooks maka sama wajib create objectnya dulu sbg berikut:
        // karena kalau ini belum dibuatkan object saat proses assigned value di bawah akan menjadi null
        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();

        // Isi value title-nya apa
        myBooks[0].title = "The Grapes of Java";
        myBooks[1].title = "The Java Gatsby";
        myBooks[2].title = "The Java Cookbook";

        // Isi value author-nya
        myBooks[0].author = "bob";
        myBooks[1].author = "sue";
        myBooks[2].author = "ian";

        // Lakukan looping, untuk menampilkan data ke i
        while (x < myBooks.length) {
            System.out.print(myBooks[x].title);
            System.out.print("by");
            System.out.println(myBooks[x].author);
            x = x + 1;
        }
    }
}
