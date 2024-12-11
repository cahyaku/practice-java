public class MyDogTestDrive {
    public static void main(String[] args) {
        // create a new object for myDog
        MyDog myDogUci = new MyDog();

        // ini tidak bisa karena instance variable private
//        myDogUci.size = 5;
        // jadi pakai yang public method, get size.
        myDogUci.setSize(5);

        // create another object of myDog
        MyDog myDogCherry = new MyDog();

        //tidak bisa karena instance variabel = private, myDogCherry.size = 70;, jadi harus menggunakan method setternya sbg berikut:
        myDogCherry.setSize(70);

        MyDog myDogFrank = new MyDog();
        // tidak bisa karena insatance variabel = private, myDogFrank.size = 30;, jadi:
        myDogFrank.setSize(30);

        myDogUci.bark(2);
        myDogCherry.bark(3);
        myDogFrank.bark(1);
    }
}
