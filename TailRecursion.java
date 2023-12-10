import java.util.LinkedList;
import java.util.ListIterator;

public class TailRecursion {
    public static void main(String[] args) {

        // 3 lists
        LinkedList<String> teqSong = new LinkedList<>();
        LinkedList<String> teqArtist = new LinkedList<>();

        // 5 songs
        teqSong.add("Life Puzzle");
        teqSong.add("Retrograde");
        teqSong.add("Unsure");
        teqSong.add("Timezones");
        teqSong.add("G");

        // 5 artists
        teqArtist.add("Arthur Nery");
        teqArtist.add("Alisson Shore");
        teqArtist.add("Shortone");
        teqArtist.add("MANILA GREY");
        teqArtist.add("Kiyo");

        ListIterator<String> songsIterator = teqSong.listIterator();
        ListIterator<String> artistsIterator = teqArtist.listIterator();

        System.out.format("%-21s %-21s %-30s%n", "Songs", "Artists", "Albums");
        System.out.println();

        combine(true, songsIterator, artistsIterator);
    }
    
    // tail recursion
    private static void combine(boolean condition, ListIterator<String> songs, ListIterator<String> artists) {
        if (!condition) {
            return;
        }

        if (songs.hasNext() && artists.hasNext()) {
            String song = songs.next();
            String artist = artists.next();
            String album = song + " by " + artist;
            System.out.format("%-21s %-21s %-30s%n", song, artist, album);

            condition = songs.hasNext();
        }

        combine(condition, songs, artists);
    }
}