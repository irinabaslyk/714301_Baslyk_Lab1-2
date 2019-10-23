package PackageWithMainClass;

import MusicClass.Music;

public class Main {
    public static void main(String[] args) {
        Music[] Song = new Music[7];
        Song[0] = new Music("Lana Del Ray - National Anthem",
                true, 103923);
        Song[1] = new Music("Nicki Minag - Anaconda",
                false);
        Song[2] = new Music(Song[0]);
        Song[3] = new Music();
        Song[4] = new Music("Ariana Grande - No Tears Left to Cry",
                false, 43492343);
        Song[5] = new Music("Jodi Benson - Part of Your World",
                true, 5748924);
        Song[6] = new Music("A$AP Twelvyy feat. A$AP Rocky- Diamonds",
                true, 245245);

        System.out.println("__________________________________________________________");
        for (int i = 0; i < 7; i++) {
            Song[i].Print();
            }
        System.out.println("\nGeneral amount of sold copies: " +
                Music.GeneralAmount(Song)+".");
        System.out.println("Amount of songs the can be downloaded: " +
                Music.CanBeDownloaded(Song)+"."+"\n");
        }
}

