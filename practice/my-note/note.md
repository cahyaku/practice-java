### ⋆꙳•̩̩͙❅*̩̩͙‧͙ ‧͙*̩̩͙❆ ͙͛ ˚₊⋆ Masih kosong, baca aja dulu bukunya ☻

#

#

```angular2html
Untuk mengingat saja:
1. Break untuk keluar dari loop (tidak langsung keluar dari program).
2. Return akan langsung keluar dari loop. Return akan mengakhiri fungsi dan mengembalikan kontrol ke fungsi pemanggil.
3. Continue tidak akan keluar dari loop, tapi continue akan melewati iterasi loop saat ini dan melanjutkan ke-iterasi berikutnya.

Perbedaan Break dan Return:
- return mengakhiri fungsi, dan menyebabkan eksekusi seluruh method berhenti.
- break hanya akan mengakhiri loop saja.
```

#                                                                                                                                                                                                                      

#### Inisiatif sendiri („• ֊ •„)੭ 𓇼 ⋆.˚ 𓆉 𓆝 𓆡⋆.˚ 𓇼

```
1. Heart pattern
```

#### Beberapa hal yang masih ragu (perlu di cek ulang/debug)

```angular2html
1. Class MultiFor => page 119, karena x = 2, masih memenuhi syarat looping tapi hasilnya tidak ditampilkan dalam print.
```

#

#

##### Chapter 1 Breaking The Surface

```
1. exercise 1 (code magnet) => page 20 (file Shuffle1)
2. exercise 2 (page 21)
3. exercise 3 (puzzle) ->(page 24) 
4. exercise 4 => Mixed Message (page 23)
5. TTS
```

##### Chapter 2 A trip to Objectville

```
1. Create guess game
    - class GuessGame -> isinya logic
    - class GameLauncher -> isinya main, untuk mememulai game
    - class Player -> untuk membuat object palyernya dan mendapatkan value palyer-nya
2. exercise 1(page 42) -> compiler
    - class TapeDeck dan runnya di TapeDeckTestDrive
    - class DVDPlayer dan class DVDPlayerTestDrive
3. exercise 2(code magnet) -> page 43 (class DrumKit dan class DrumKitTestDrive)
4. exercise 3 puzzle -> page 44 (class Echo, dan class EchoTestDriver)
```

##### Chapter 3 Know Your Variable

```
1. Try to create simple array (class Dog)
2. Exercise 1 page 63 (be the compailer)
   - exercise A => class Books and class BooksTestDrive
   - exercise B => class Hobbits
3. Exercise 2 page 64 (code magnet) => class TestArrays
4. Exercise 3 page 65 (pool puzzle) => class Triangle
5. Exercise 4 page 66 => class HeapQuiz
```

##### Chapter 4 How Objects Behave

```
1. Membuat class sederhana dengan 1 method tetapi berbeda instance variabel => class MyDog, dan run di MyDogTestDrive. 
2. Getter dan setter di page 79 => same in class MyDog dan di run di MyDogTestDrive.
3. Encapsulation page 82 => same in class MyDog, dan di run di MyDogTestDrive (encapsulation mencangkup private, pablic dan protected).
4. Create array juga ada di page 83.
5. Bedanya instance varibale dan local variabel ada di page 85 
    Singkatnya instance varibel hanya dibuat tanpa adanya method.
    Sedangkan local variabel declared within a method, jadi ada instance variable dan digunakan di dalam method.
    dan local variabel harus di initialize terlebih dahulu, misal int x; / int x = 9 => baru bisa int z = x + 3;
6. Exercise 1 (be the compiler) page 88 => class XCopy, dan (class Clock, ClockTestDrive)
7. Argument adalah nilai aktual (value) yang diberikan kepada fungsi atau method saat dipanggil.
8. Exercise 2 (mixed message) page 90 => class Mix4.
9. Exercise 3 (pool puzzle) page 91 => class Puzzle4 dan class puzzle4b
```

##### Chapter 5 Extra-Strength Methods

```
1. Create Battleship-style, game(Sink a Dot Com)
2. Class Output, dalam class tersebut membuat object dan memanggil method yang dimiliki,
   yang ada pada Class output => page 118.
3. Class Multifor => page 119, membuat for dalam for.
4. Class MixFor5 (mixed messages) => page 121, tinggal salin ke buku head First Java. 
5. Class SimpleDotCom (convert string into int) Integer.parseInt() => page 106 dan class SimpleDotComTestDrive
   untuk menjalankan logic yang ada pada class SimpleDotCom dan beberapa tambahan pada page 110,
   ini akan ada improved pada chapter 6 untuk mengganti nama class dan mekanisme pengecekan.
   Tapi saya memilih mmebuat clas baru yang di beri nama DotCom class. 
6. Class GameHelper yang akan dipanggil pada class simpleDotComTestDrive => page 112.
```

##### Chapter 6 Using the Java Library

```
1. Fix the DotCom code (improved DotCom class).
2. Class DotComBust -> start from page 146.
3. Final version of the DotCom class, because have to add a new getter and setter method (page 150).
4. Improve GameHelper class, page 152 - 153.
5. Exercise code magnet -> Class ArrayListMagnet, page 161.
6. Materi java.util (Java API) -> 159.

Java library atau Java API adalah sebuah library yang ditulis sebelumnya yang bebas digunakan,
termasuk ke dalam Java Development Environment.

// Example arrayList dan cara menambahkan datanya ada di class ArrayListMagnet.
- Untuk menambahkan sesuatu kedalam arrayList bisa dengan menggunakan method add().
- Untuk menghapus data dari arrayList bisa menggunakan method remove().
- Untuk mendapat nomorIndex dari arrayList bisa menggunakan method indexOf().
- Untuk mengecek apakah arrayList ada datanya bisa menggunakan method contains().

```

##### Chapter 7 Inheritance/ Pewarisan (extends)

```
1. Contoh penggunaan inheritance dalam class Doctor ada pada page 169.
2. exercise chapter 7 ada di package Inheritance (page 192-194).
3. Class MonsterTestDrive adalah salah satu contoh penggunaan inheritance (turunan), 
   dengan menggunakan kata kunci extends -> page 193.

Some important poin:
1. Inheritance di perlukan agar tidak ada banyak duplikat codingan.
   Inheritance tentu akan mewariskan sifatnya kepada subclassnya, hal ini meliputi instance variable dan method.
   Dan main class atau untuk startnya ada di class Mixed2.
2. Override -> digunakan untuk mengabaikan method dari kelas parentnya (superclass).
   Dilakukan dengan cara mendeklarasikan kembali method di dalam subclass-nya.
3. Overriding -> adalah kondisi dimana ada dua buah method yang memiliki nama yang sama.
```

##### Chapter 8 Serious Polymorphism()

```
1. Kelas konkret. 
   Kelas konkret adalah kelas yang cukup spesifik untuk diinstansiansi.
   Sebuah kelas konkret berarti tidak apa-apa untuk membuat objek dari jenis itu.
   (Jadi class bisa langsung dijadikan sebagai objeck-nya). Sehingga saat mendesain
   pewarisan kelas,kita harus memutuskan kelas mana yang abstrak dan mana yang konkret.        
2. Abstrak class dapat dibuat dengan menggunakan kata kunci abstrak sebelum kata kunci class.
   Di Java abstrak class adalah kelas yang tidak bisa dibuat instance-nya sendiri. 
   ex. 

>   abstract class Canine extends Animal {
>       public void roam() { }
>   }

3. Kita tidak boleh membuat objek atau instance variable dari kelas abstrak langsung di dalamnya.
   Tapi jika ingin membuat objek dari kelas lain yang tidak abstrak di dalam superclass yang abstrak ini diperbolehkan,
   sama seperti pada page 201.

4. Perbedaan kelas abstrak kelas dengan kelas concrete.
   Abstract class VS concrete class:
   
   Abstract class adalah:  

5. Building our own Dog-specific list 1, page 206 (class MyDogList) package polymorphism.

6. Building our own Dog-specific list 2, page 207 (class MyAnia) package polymorphism.
   
Some important point:
😮 Java interfaces adalah blueprint kelas yang mendefinisikan method tanpa implementasi. Interface hanya dapat berisi 
   konstanta, method statis, dan tipe bersarang.
   Dengan interfaces akan membantu menciptakan desain yang fleksibel dan modular. 
😮 Kelas abstrak berart kelas tersebut harus diperluas jadi harus di extends.
😮 Abstrak method berarti, method harus dighanti jadi method harus di override.
😮 Untuk mengakses metode antarmuka, antarmuka/abstrak harus "diimplementasikan" 
   oleh kelas lain dengan kata kunci implement.
😮 Membuat method abstrak, untuk membuat/ medeklarasikan method abstrak anda harus tandai kelas sebagai abstrak juga.    
   Karena anda tidak dapat memiliki methode abstrak dalam kelas non abstrak.
   Kesimpulannya, method abstrak class-nya juga wajib ditandai sebagai abstrak.
   Tapi kita juga dapat mencampurkan method abstrak dan method non-abstrak di kelas abstrak 
   (Kelas abstrak bisa punya method non-abstrak).
😮 Ketika kami mengatakan "harus meng-implement method abstrak", itu berarti anda harus memberikan tubuh.
   Anda harus membuat method non-abstrak di kelas anda dengan method signature yang sama(nama dan argmen)
   dan tipe pengembalian yang kompapitabel dengan tiape pengembalian yang dideklarasikan dari method abstrak.
😮 Polymorphism berarti banyak bentuk -> ada di page 2015.
😮 Ketika anda meletakan sebuah objek dalam ArrayList<Object>, kita hanya bisa memperlakukannya sebagai objek.
   Ketika anda mendapatkan referensi dari ArrayList<Object>, referensi tersebut selalu bertipe objek.
😮 Untuk dapat mengembalikan sifat objek sesuai dengan kondisi awalnya, dapat dialkukan dengan
   melempar kembali referensi objek ke tipe aslinya -> ada di page 216.
😮 Mengekpos method berarti membuat semuah method dapat diakses, biasanya dengan menandainya sbg public.


Hal yang membingungkan?
1. Kapan saja kita perlu menggunakan/membuat abstrak class?
2. Apa sebenaranya polymorphism itu?
3. Polimorphic itu apa sebenarnya? dan digunakan saat kondisi bagaimana saja?
```

```
DUMB Questions page 203
-----------------------
1. Apa gunanya metode abstrak? Saya pikir
inti dari kelas abstrak adalah memiliki kesamaan
kode yang dapat diwarisi oleh subclass.

2. page 210.
   Apakah kelas objek bersifat abtrak?
   Answer: Tidak, kelas objek tidak bersifat abstrak karena memiliki kode implementasi method
           yang dapat diwarisi dan digunakan oleh semua kelas secara langsung, tanpa harus mengganti method.

3. page 210.
   Jadi, apakah adil untuk mengatakan bahwa tujuan utama dari tipe Object adalah agar Anda dapat
   menggunakannya untuk argumen polimorfik dan tipe kembalian? Seperti di ArrayList?
   Answer: 
   Kelas Object bertindak sebagai tipe polimorfik untuk metode yang perlu bekerja pada kelas apa pun
   dan untuk menyediakan kode metode nyata untuk semua objek di Java saat runtime (dan menaruhnya di dalam
   kelas Object, semua kelas lain akan mewarisinya).
```

----------------------------
Beberapa hal yang saya skip
----------------------------

```
1. Java pass by value => chapter 4 page 77.
2. exercise di chapter 6 pazge 162 & 164 masih cahya skipp :)
3. page 205 masih skip (sharpen your pencil).       
```

```
Some important method:
1. getClass(); -> page 209.
   Untuk mengembalikan tempat objek tesebut diinstansiasi (instantited).
   Example:
   
   Cat c = new Cat();
   System.out.println(c.getClass());
   // Output: class Cat

2. hashCode();
   Untuk mencetak kode hash objek, anggap saja sebagai ID yang unik
   Example:
   
   Car c = new Cat();
   System.out.println(c.hashCode());
   //Output: 8202111
   
3. toString();
   Untuk mencetak pesan string dengan nama kelas dan beberapa nomor lain yang jarang kita pedulikan.
   Example:
   
   Cat c = new Cat();
   System.out.println(c.toString());
   //Output:
   Cat@7d277f
 
4. Membuat arrayList yang dideklarasikan untuk menampung objek Dog.
   example: yang lainnya juga ada pada pege 211.
   ArrayList<Dog> myDogArrayList = new ArrayList<Dog>();
   LEbih lengkap, dan penting ada di page 211.
```