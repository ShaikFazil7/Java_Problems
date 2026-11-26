
import java.util.LinkedList;
import java.util.Scanner;

public class D4T4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinkedList<String> playlist = new LinkedList<>();

        playlist.add("Shape of You");
        playlist.add("Perfect");
        playlist.add("Believer");
        playlist.add("Despacito");
        playlist.add("Closer");

        System.out.println(" MUSIC PLAYLIST ");

        for (String song : playlist) {
            System.out.println(song);
        }

        System.out.print("Enter song to add at beginning: ");
        String firstSong = sc.nextLine();

        playlist.addFirst(firstSong);

        System.out.println("Song added at beginning.");

        System.out.print("Enter song to add at end: ");
        String lastSong = sc.nextLine();

        playlist.addLast(lastSong);

        System.out.println("Song added at end.");

        System.out.println(" UPDATED PLAYLIST ");

        for (String song : playlist) {
            System.out.println(song);
        }

        System.out.println("First Song: " + playlist.getFirst());
        System.out.println("Last Song: " + playlist.getLast());

        System.out.println("Removed First Song: " +
                           playlist.removeFirst());

        System.out.println("Removed Last Song: " +
                           playlist.removeLast());

        System.out.print("Enter song name to search: ");
        String searchSong = sc.nextLine();

        if (playlist.contains(searchSong)) {
            System.out.println("Song found in playlist.");
        } else {
            System.out.println("Song not found in playlist.");
        }

        if (!playlist.isEmpty()) {

            System.out.println(" PLAYING NEXT SONG ");

            String playingSong = playlist.removeFirst();

            System.out.println("Now Playing: " + playingSong);

        } else {
            System.out.println("Playlist is empty.");
        }
        System.out.println(" FINAL PLAYLIST ");

        for (String song : playlist) {
            System.out.println(song);
        }
    }
}
