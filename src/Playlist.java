
/*
Challenge
Build Playlist.java with the best possible playlist of music using a Java ArrayList

This is to practice array and arrayLists as well as the syntax.
 */
import java.util.ArrayList;
public class Playlist {
    public static void main(String[] args){
        ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
        //add songs to your playlist
        desertIslandPlaylist.add("Doin' Time");
        desertIslandPlaylist.add("West Coast");
        desertIslandPlaylist.add("Cinnamon Girl");
        desertIslandPlaylist.add("Money Power Glory");
        desertIslandPlaylist.add("Aint No Sunshine");
        desertIslandPlaylist.add("D.S");
        desertIslandPlaylist.add("Thique");
        //check how many songs you currently have in your playlist
        System.out.println(desertIslandPlaylist);
        System.out.println(desertIslandPlaylist.size());

        //remove 2 songs from your playlist
        desertIslandPlaylist.remove(3);
        desertIslandPlaylist.remove(4);

        //check how many songs you currently have in your playlist
        System.out.println(desertIslandPlaylist);
        System.out.println(desertIslandPlaylist.size());

        //Swap the position of one music from the playlist with another

    }
}
