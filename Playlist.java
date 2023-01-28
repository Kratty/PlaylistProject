
/**
 * The playlist class allows the user to store songs inside a playlist
 *
 * @author Theodore Kratter
 * @version 1/25/23
 */
import java.util.ArrayList;
public class Playlist
{
    // instance variables - replace the example below with your own
    ArrayList<Song> playlist;

    /**
     * Constructor for objects of class Playlist
     */
    public Playlist()
    {
        playlist = new ArrayList<Song>();
    }

    /**
     * Add song method adds a song to the playlist
     * @param  the song to add  
     */
    public void addSong(Song s)
    {
        playlist.add(s);
    }
    
     /**
     * Add song method adds a song to the playlist
     * @param  the song to add  
     */
    public void like(Song s)
    {
        for (int i = 0; i< playlist.size(); i++)
        {
            if (playlist.get(i).getTitle().equalsIgnoreCase(s.getTitle()))
            {
                playlist.get(i).like();
            }
        }
    }
    
    /**
     * Add song method adds a song to the playlist
     * @param  the song to add  
     */
    public void remove(Song s)
    {
        for (int i = 0; i< playlist.size(); i++)
        {
            if (playlist.get(i).getTitle().equalsIgnoreCase(s.getTitle()))
            {
                playlist.remove(i);
            }
        }    
    }
    
    public String view()
    {
        String view = "";
        for (int i = 0; i< playlist.size(); i++)
        {
            view += 
            ("| "+ playlist.get(i).getTitle());
            view+=(" by ");
            view+=playlist.get(i).getArtist();
            view+=(" " + playlist.get(i).getDuration() + "|");
            if (playlist.get(i).isLiked())
            {
                view+=" - Liked ";
            }
            view+="\n";
        }  
        return view;
    }
}
