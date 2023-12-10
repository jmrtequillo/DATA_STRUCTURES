import java.util.LinkedList;
import java.util.ListIterator;

public class Music {
    public static void main(String[] args) {
        
        // 3 lists
        LinkedList<String> teqSong = new LinkedList<>();
        LinkedList<String> teqArtist = new LinkedList<>();
        LinkedList<String> teqAlbum = new LinkedList<>();
        
        // 5 songs
        teqSong.add("Life Puzzle");
        teqSong.add("Retrograde");
        teqSong.add("Unsure");
        teqSong.add("Timezones");
        teqSong.add("G");
        
        //5 artists
        teqArtist.add("Arthur Nery");
        teqArtist.add("Alisson Shore");
        teqArtist.add("Shortone");
        teqArtist.add("MANILA GREY");
        teqArtist.add("Kiyo");
        

        ListIterator<String> songsIterator = teqSong.listIterator();
        ListIterator<String> artistsIterator = teqArtist.listIterator();

        while (songsIterator.hasNext() && artistsIterator.hasNext()) {
            String song = songsIterator.next();
            String artist = artistsIterator.next();
            String album = song + " by " + artist;
            teqAlbum.add(album);
        }

        System.out.format("%-21s %-21s %-30s%n", "Songs", "Artists", "Albums");
        System.out.println();
        
        for (int tq = 0; tq < teqSong.size(); tq++) {
            String song = teqSong.get(tq);
            String artist = teqArtist.get(tq);
            String album = teqAlbum.get(tq);
            System.out.format("%-21s %-21s %-30s%n", song, artist, album);
        }
    }
}