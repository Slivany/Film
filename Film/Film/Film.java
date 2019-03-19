
/**
 * Lav en beskrivelse af klassen Film her.
 * 
 * @author (dit navn her)
 * @version (versions nummer eller dato her)
 */
public class Film implements Comparable<Film>
{
    private String title;
    private String genre;
    private int score;
    private int ageLimit;
    
    public Film(String title, String genre, int score, int ageLimit)
    {
        this.title = title;
        this.genre = genre;
        this.score = score;
        this.ageLimit = ageLimit;
        
    }
    
    public String toString()
    {
        return title + ", " + genre + ", Score: " + score + ", Age limit: " + ageLimit + " years";
    }
    
    public String getGenre()
    {
        return genre;
    }
    
    public int getRating()
    {
        return score;
    }
    
    public int getAgeLimit()
    {
        return ageLimit;
    }
    
    public int compareTo(Film other)
    {
        if(!genre.equals(other.genre))
        {
            return genre.compareTo(other.genre);
        }
        return score - other.score;
    }
}
