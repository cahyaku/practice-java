public class DVDPlayerTestDrive {
    public static void main(String[] args) {
        DVDPlayer dvdPlayer = new DVDPlayer();
        dvdPlayer.canRecord = true;

        // ini wajib ada di class DVDPlayer, baru bisa dipanggil dari objectnya
        dvdPlayer.playDVD();

        // cek jika canRecord bernilai true
        if(dvdPlayer.canRecord) {
        dvdPlayer.recordDVD();
        }
    }
}
