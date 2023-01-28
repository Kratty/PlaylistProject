
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
        Song Two = new Song("bebe", "Paul", 20, false);
        play.addSong(Two);
        System.out.println(play.view());
        play.like(Two);
        System.out.println(play.view());
    }
}
