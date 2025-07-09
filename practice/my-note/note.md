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

### Chapter 1 Breaking The Surface

```
1. exercise 1 (code magnet) => page 20 (file Shuffle1)
2. exercise 2 (page 21)
3. exercise 3 (puzzle) ->(page 24) 
4. exercise 4 => Mixed Message (page 23)
5. TTS
```
#
### Chapter 2 A trip to Objectville

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
#
### Chapter 3 Know Your Variable

```
1. Try to create simple array (class Dog)
2. Exercise 1 page 63 (be the compailer)
   - exercise A => class Books and class BooksTestDrive
   - exercise B => class Hobbits
3. Exercise 2 page 64 (code magnet) => class TestArrays
4. Exercise 3 page 65 (pool puzzle) => class Triangle
5. Exercise 4 page 66 => class HeapQuiz
```
#

### Chapter 4 How Objects Behave

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
#

### Chapter 5 Extra-Strength Methods

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
#

### Chapter 6 Using the Java Library

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
#

### Chapter 7 Inheritance/ Pewarisan (extends)

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
#

### Chapter 8 Serious Polymorphism()

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

```
#

### Chapter 9 Life and Death of an Object.
```angular2html
Nothing special, jadi notesnya langsung di google docs saja.
```

#

### Chapter 10  Life and Death of an Object.
```angular2html
1. Exercise 1 in chapter 10 (page 312) => Class FullMoons.
```
#



```
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
   
4. page 225.
   Apa yang benar-benar Anda dapatkan dari sebuah antarmuka (Interface)?
   Answer:
   Karena dengan menggunakan antarmuka bukannya subclas conret (atau bahkan superclass abstrak)
   sebagai argumen dan tipe pengembalian, Anda dapat mengoper apa pun yang mengimplementasikan Interface tersebut. 
   Dengan sebuah Interface, sebuah class tidak harus bersalah dari satu pohon pewarisan.
   Jadi kita bisa memperlakukan sebuah objek berdasarkan perannya, bukan berdasarkan dari mana objek tersebut
   diintamsiasi. Fakta bahwa tidak dapat memasukkan kode implementasi ternyata tidak menjadi masalah bagi sebagian besar
   desain yang bagus, karena metode antarmuka tidak akan masuk akal jika diimplementasikan dengan cara yang umum. 
   Dengan kata lain, sebagian besar interface perlu ditimpa (override) bahkan jika metode itu tidak dipaksa untuk menjadi abstrak.

5. page 226, bagian akhir (di bawah).
   Akan lebih baik jika class dapat mengimplementasikan beberapa Interface.
   Caranya dengan menggunakan kata kunci implement Pet, Saveable, Paintable.
   Example:
   public class Dog extends Animal implement Pet, Saveable, Painable {....}
 
 
   PENTING, SEMUA PENTING :)      
   Jadi kesimpulan antara extend dan implement adalah:
   - Kita hanya bisa malakukan 1 kali extends dari sebuah kelas.
   - Tapi bisa melakukan lebih dari 1 kali implements dari beberapa interface.
   - Dan bisa melakukan implement, meskipun sudah melakukan extends dari kelas lain (bisa digunakan secara bersamaan).
   - Kelas Java hanya bisa memiliki 1 parent (superclass),dan parent class akan mendefinisikan siapa anda.
     Tapi kita dapat mengimplementasikan beberapa interface, 
     Interface tersebut akan mendefinisikan peran yang dapat anda mainkan.


6. page 227.
   Bagaimana anda tahu akan membuat sebuah kelas, subkelas, kelas abstrak, atau sebuah interface?
   a. Membuat kelas yang tidak memperluas apa pun (selain Object) ketika kelas baru Anda tidak 
      lulus tes IS-A untuk tipe lain.
   b. Membuat subkelas (dengan kata lain, memperluas kelas/extends) hanya jika perlu membuat versi yang lebih spesifik
      versi dari sebuah kelas dan perlu mengganti atau menambahkan perilaku baru.
   c. Gunakan kelas abstrak saat ingin mendefinisikan template untuk sekelompok subkelas, dan memiliki setidaknya 
      beberapa kode implementasi yang dapat digunakan oleh semua subkelas. Jadikan kelas abstrak ketika 
      ingin menjamin bahwa tidak ada yang bisa membuat objek dari tipe tersebut.
   d. Gunakan antarmuka (Interface) ketika ingin mendefinisikan peran yang dapat dimainkan oleh kelas lain,
      di mana pun kelas-kelas tersebut berada di pohon pewarisan. 

7. page 228.
   Bagaimana jika ingin membuat subkelas konkret dan perlu mengganti sebuah metode, tetapi
   kita menginginkan perilaku dalam versi superclass dari metode tersebut? 
   Dengan kata lain, bagaimana jika kita tidak perlu mengganti metode dengan penggantian,
   tetapi kita hanya ingin menambahkannya dengan beberapa kode spesifik tambahan.
   Answer:

8. Super keyword ada di page 228.
   Contoh override juga ada di page 228.

```

```
Point penting terkait dengan interface:

1. Kelas abstrak: digunakan saat kita tidak ingin ada orang yang membuat objek baru dari tipe kelas tersebut. 
2. Kelas abstrak bisa memiliki method abstrak dan method non-abstrak.
3. Jika sebuah kelas memiliki satu method abstrak, kelas tersebut harus ditandai sebagai abstrak.
4. Method abstrak tidak memiliki body (tubuh), sehingga selalu di akhiri dengan (); semicolon.
5. Semua method abstrak harus diimplementasikan pada subkelas konkret pertama di dalam pohon pewarisan.
6. Metode dapat dideklarasikan dengan argumen Objek dan/atau tipe pengembalian. 
7. Kita dapat memanggil metode pada sebuah objek hanya jika metode tersebut berada di dalam kelas (atau interface/antarmuka)
   yang digunakan sebagai tipe variabel referensi, terlepas dari tipe objek yang sebenarnya. Jadi, sebuah
   variabel referensi bertipe Object hanya bisa digunakan untuk memanggil metode yang didefinisikan dalam kelas
   Object, terlepas dari jenis objek yang menjadi referensi.
8. Variabel referensi bertipe Object tidak dapat ditetapkan ke tipe referensi lain
   tanpa cast. Cast dapat digunakan untuk menetapkan variabel referensi dari satu tipe ke
   variabel referensi dari subtipe, tetapi pada saat runtime, cast akan gagal jika objek pada
   heap BUKAN tipe yang kompatibel dengan cast.
   Contoh: Dog d = (Dog) x.getObject(aDog);
9. Semua objek keluar dari ArrayList<Objek> sebagai tipe Object (artinya, mereka bisa
   direferensikan hanya dengan variabel referensi Object, kecuali jika Anda menggunakan cast).
10. Hanya bisa memiliki 1 super class, jadi 1 kali extend saja.
11. Interface seperti kelas abstrak murni 100%. Karena Interface hanya mendefinisikan method abstract.
12. Membuat interface dengan kata kunci interface, bukan menggunakan kata kunci class.
13. Menerapkan interface dengan kata kunci implements
14. Kelas dapat mengimplementasikan beberapa interfaces.
15. Kelas yang mengimplementasikan interfaces harus mengimplementasikan semua method interfaces,
    karena semua method interfaces secara implisit bersifat public dan abstrak.
16. Super keyoword adalah kata kunci yang digunakan untuk memanggil versi super sebuah method dari subkelas 
    yang menimpa method. Example:  super.runReport().

Untuk memanggil versi superclass dari sebuah metode dari subkelas yang menimpa metode
menggunakan kata kunci super. Contoh: super.runReport();
```

### Prep code dan test code

```angular2html
1. Prep code contoh 1 dengan nama class NumberGuessingGame.
2. Test code dari contoh 1 atas ada di class NumberGuessingGameTestDrive.

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
   
5. Kata kunci interface untuk membuat interface, ini sebagai pengganti kata kunci kelas,
   penjelasan ada di page 224.
     
6. Untuk implement an interface gunakan kata kunci "implement" yang diikuti dengan nama interfacenya.
   Meskipun sduah mengimplementasikan sebuah interface, anda masih bisa memperluas kelas deangan melakukan extend.
   Example ada pada page 224. Saat kita menggunakan implements, kita wajib menerapkan method yang ada pada interface.
   
7. Method abstrak tidak memiliki body jadi diakhiri dengan(); bukan (){}. 
```