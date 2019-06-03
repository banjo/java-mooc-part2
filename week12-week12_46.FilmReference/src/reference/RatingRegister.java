package reference;

import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RatingRegister {
    private Map<Film, List<Rating>> ratings;
    private Map<Person, Map<Film, Rating>> personalRating;

    public RatingRegister() {
        this.ratings = new HashMap<Film, List<Rating>>();
        this.personalRating = new HashMap<Person, Map<Film, Rating>>();
    }

    public void addRating(Film film, Rating rating) {
        if (!ratings.containsKey(film)) {
            ratings.put(film, new ArrayList<Rating>());
        }

        ratings.get(film).add(rating);
    }

    public void addRating(Person person, Film film, Rating rating) {
        if (!personalRating.containsKey(person)) {
            personalRating.put(person, new HashMap<Film, Rating>());
        }

        personalRating.get(person).put(film, rating);
        addRating(film, rating);
    }

    public List<Rating> getRatings(Film film) {
        if (ratings.containsKey(film)) {
            return ratings.get(film);
        }

        return null;
    }

    public Rating getRatings(Person person, Film film) {
        if (!personalRating.containsKey(person)) {
            return Rating.NOT_WATCHED;
        }

        try {
            return personalRating.get(person).get(film);
        } catch (Exception e) {
            return Rating.NOT_WATCHED;
        }
    }

    public Map<Film, List<Rating>> filmRatings() {
        return ratings;
    }

    public Map<Film, Rating> getPersonalRatings(Person person) {
        if (personalRating.containsKey(person)) {
            return personalRating.get(person);
        }

        return new HashMap();
    }

    public List<Person> reviewers() {
        List reviewers = new ArrayList();
        reviewers.addAll(personalRating.keySet());
        return reviewers;
    }

    public Rating getRating(Person person, Film film) {
        if (!personalRating.containsKey(person)) {
            return Rating.NOT_WATCHED;
        }

        if (personalRating.get(person).get(film) == null) {
            return Rating.NOT_WATCHED;
        }

        return personalRating.get(person).get(film);
    }
}
