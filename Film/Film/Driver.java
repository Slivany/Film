
/**
 * Lav en beskrivelse af klassen Driver her.
 * 
 * @author (dit navn her)
 * @version (versions nummer eller dato her)
 */
public class Driver
{   
    public static void exam()
    {
        System.out.println("");
        Film f1 = new Film("The Room", "drama", 1, 14);
        Film f2 = new Film("The Shining", "thriller", 9, 18);
        Film f3 = new Film("Scarface", "crime", 10, 16);
        Film f4 = new Film("Forrest Gump", "comedy", 8, 3);
        Film f5 = new Film("Mall Cop", "comedy", 4, 14);
        
        System.out.println(f1.toString());
        System.out.println(f2.toString());
        System.out.println(f3.toString());
        System.out.println(f4.toString());
        System.out.println(f5.toString());
        
        System.out.println("");
        FilmCollection fc = new FilmCollection("Warner Bros. collection");
        fc.add(f1);
        fc.add(f2);
        fc.add(f3);
        fc.add(f4);
        fc.add(f5);
        
        System.out.println("");
        System.out.println("Find a movie of specified genre: ");
        System.out.println(fc.FilmOfGenre("comedy"));
        
        System.out.println("");
        System.out.println("Find the best movie of specicied genre: ");
        System.out.println(fc.bestFilmOfGenre("crime"));
        
        System.out.println("");
        fc.printFilmCollection(15);
    }
}
