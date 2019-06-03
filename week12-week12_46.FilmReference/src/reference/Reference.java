package reference;

import reference.comparator.FilmComparator;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

import java.util.*;

public class Reference {
    private RatingRegister ratings;

    public Reference(RatingRegister ratings) {
        this.ratings = ratings;
    }

    public Film recommendFilm(Person person) {

        // get rating of person
        Map<Film, Rating> personalRatings = ratings.getPersonalRatings(person);

        // the film comparator
        FilmComparator filmComparator = new FilmComparator(ratings.filmRatings());

        // get all films
        List<Film> films = new ArrayList<Film>();
        films.addAll(ratings.filmRatings().keySet());

        // return null if person has watched all films
        if (personalRatings.size() == films.size()) {
            return null;
        }

        // remove all movies that has been seen
        films.removeAll(personalRatings.keySet());

        Collections.sort(films, filmComparator);

        return films.get(0);

    }
}
