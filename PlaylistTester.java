
/**
 * Write a description of class PlaylistTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PlaylistTester
{
    public static void main(String[] args)
    {
        Playlist play = new Playlist();
        Song One = new Song("baba", "Theodore", 80, true);
        play.addSong(One);
        Song Two = new Song("bebe", "Paul", 20);
        Song Three = new Song("chebe", "Snuggles", 270);
        play.addSong(Two);
        play.addSong(Three);
        System.out.println(play.view());
        play.like(Three);
        System.out.println(play.viewLiked());
        System.out.println(play.view());
        System.out.println("Total time: "+play.getDuration());
    }
}
