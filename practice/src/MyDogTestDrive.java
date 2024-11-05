public class MyDogTestDrive {
    public static void main(String[] args) {
        // create a new object for myDog
        MyDog myDogUci = new MyDog();
        myDogUci.size = 5;

        // create another object of myDog
        MyDog myDogCherry = new MyDog();
        myDogCherry.size = 70;

        MyDog myDogFrank = new MyDog();
        myDogFrank.size = 30;

        myDogUci.bark();
        myDogCherry.bark();
        myDogFrank.bark();
    }
}
