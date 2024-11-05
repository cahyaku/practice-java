public class Dog {

    String name;

    public static void main(String[] args) {
        // make  a Dog object and access it
        Dog dog1 = new Dog();
        dog1.name = "Lussy nan imut";
        dog1.bark();


        // make a dog array
        Dog[] myDogs = new Dog[3];

        // put some dogs in it
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        //access the Dogs using the array
        //references
        myDogs[0].name = "Cika";
        myDogs[1].name = "Ciko";

        // just for check
        System.out.println(myDogs[0].name);
        System.out.println(myDogs[1].name);

        // What is myDogs[2] name?
        // Jadi array myDogs[2] akan bersini name dari dog1 ("Lussy nan imut")
        // Karena myDogs[2] adalah hasil append dari dog1
        System.out.print("last dog's name is ");
        System.out.println(myDogs[2].name);
        System.out.println();

        // Do looping array of dog, and tell the dogs to bark
        int x = 0;
        while (x < myDogs.length) {
            myDogs[x].bark();
            x = x + 1;
        }

    }


    //method ini diluar main, karena main juga termasuk method, dan ini wajib di dalam sebuah class
    public void bark() {
        System.out.println(name + ", say rarw.... (˶ᵔ ᵕ ᵔ˶)");
    }

    public void eat() {
    }

    public void chaseCat() {
    }

}
