
/**
 * This creates a song object that hold the variables: title, artist, duration, and status of liked or not
 *
 * @author Theodore Kratter
 * @version 01/25/2023
 */
public class Song
{
    // instance variables - replace the example below with your own
    
    private String title;
    private String artist;
    private int durationMin;
    private int durationSec;
    private String timeString;
    private boolean like;
    
    /**
     * Constructor for objects of class Song
     */
    public Song(String title, String artist, int secondsLong)
    {
        this.title = title;
        this.artist = artist;
        like = false;
        
        durationMin = (int)(secondsLong/60);
        durationSec = secondsLong - (durationMin*60);
        
        timeString = durationMin + ":" + durationSec;
    }
    
    /**
     * Constructor for objects of class Song
     */
    public Song(String title, String artist, String timeString )
    {
        this.title = title;
        this.artist = artist;
        this.timeString = timeString;
        like = false;
        
    }
    
    /**
     * Constructor for objects of class Song
     */
    public Song(String title, String artist, String timeString, boolean like )
    {
        this.title = title;
        this.artist = artist;
        this.timeString = timeString;
        this.like = like;
    }
    
    /**
     * Constructor for objects of class Song
     */
    public Song(String title, String artist, int secondsLong, boolean like)
    {
        this.title = title;
        this.artist = artist;
        this.like = like;
        
        durationMin = (int)(secondsLong/60);
        durationSec = secondsLong - (durationMin*60);
        
        timeString = durationMin + ":" + durationSec;
    }

    /**
     * This method will return the title
     * @return    the title title
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * This method will return the artist
     * @return    the artist artist
     */
    public String getArtist()
    {
        return artist;
    }
    
    /**
     * This method will return duration
     * @return    the duration duration
     */
    public String getDuration()
    {
        return timeString;
    }
    
    /**
     * This method will return duration
     * @return    the duration duration
     */
    public int getDMiN()
    {
        return durationMin;
    }
    
    /**
     * This method will return duration
     * @return    the duration duration
     */
    public int getDSeC()
    {
        return durationSec;
    }
    
    public void like()
    {
        like = true;
    }
    
    public void dislike()
    {
        like = false;
    }
    
    public Boolean isLiked()
    {
        return like;
    }
}
