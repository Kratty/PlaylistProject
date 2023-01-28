
/**
 * Write a description of class PlaylistTester here.
 *
 * @author Theodore Kratter
 * @version 1/28/23
 */
public class PlaylistTester
{
    public static void main(String[] args)
    {
        Playlist play = new Playlist();
        Song One = new Song("Baba", "Theodore", 80, true);

        play.addSong(One);
        System.out.println("Added a song...");
        
        Song Two = new Song("Bebe", "Justin Beibs", 20);
        Song Three = new Song("Chebe", "Dawg", 270);
        Song Four = new Song("Bad Song", "Bad Artist", 500, true);
        
        play.addSong(Two);
        System.out.println("Added a song...");
        play.addSong(Three);
        System.out.println("Added a song...");
        play.addSong(Four);
        System.out.println("Added a song...");
        
        System.out.println(play.view());
        play.like(Three);
        System.out.println("Liked a song...");
        
        System.out.println("Printing out liked songs...");
        System.out.println(play.viewLiked());
        
        System.out.println("Removing that bad song...");
        play.remove(Four);
        
        System.out.println(play.view());
        System.out.println("Total time: "+play.getDuration());
        
        play.removeDisliked();
        System.out.println("Removing unliked songs...");
        
        System.out.println(play.view());
    }
}
