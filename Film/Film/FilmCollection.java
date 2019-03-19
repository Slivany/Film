import java.util.*;
/**
 * Lav en beskrivelse af klassen FilmCollection her.
 * 
 * @author (dit navn her)
 * @version (versions nummer eller dato her)
 */
public class FilmCollection
{
    private String owner;
    private ArrayList<Film> films;

    /**
     * Konstruktør for objekter af klassen FilmCollection
     */
    public FilmCollection(String owner)
    {
        this.owner = owner;
        films = new ArrayList<Film>();
    }

    public void add(Film f)
    {
        films.add(f);
    }

    public void remove(Film f)
    {
        films.remove(f);
    }

    public Film FilmOfGenre(String genre)
    {
        for(Film f : films)
        {
            if(f.getGenre().equals(genre))
            {
                return f;
            }
        }
        return null;
    }

    public Film bestFilmOfGenre(String genre)
    {
        Film best = null;
        for(Film f : films)
        {
            if(f.getGenre().equals(genre))
            {
                if(best == null || best.getRating() < f.getRating())
                {
                    best = f;
                }
            }
        }
        return best;
    }

    public void printFilmCollection(int age)
    {
        System.out.println(owner);

        Collections.sort(films);

        for(Film f : films)
        {
            if(age < f.getAgeLimit())
            {
                System.out.println(f);
            }
        }
    }
}
