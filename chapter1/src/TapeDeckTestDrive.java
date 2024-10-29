public class TapeDeckTestDrive {
    public static void main(String[] args) {
        // buat objectnya dulu, baru bisa akses method di dalamnya.
        TapeDeck tapeDeck1 = new TapeDeck();

        tapeDeck1.canRecord = true;
        tapeDeck1.playTape();

        if(tapeDeck1.canRecord == true) {
            tapeDeck1.recordTape();
        }

    }
}
