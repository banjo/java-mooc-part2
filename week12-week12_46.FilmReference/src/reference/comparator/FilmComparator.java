package reference.comparator;

import reference.domain.Film;
import reference.domain.Rating;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class FilmComparator implements Comparator<Film> {
    private Map<Film, List<Rating>> ratings;

    public FilmComparator(Map<Film, List<Rating>> ratings) {
        this.ratings = ratings;
    }

    public double getAverageRating(Film film) {
        ArrayList<Rating> allRatings = new ArrayList<Rating>();
        allRatings.addAll(ratings.get(film));

        int sum = 0;

        for (Rating score : allRatings) {
            sum += score.getValue();
        }

        return sum / allRatings.size();


    }

    @Override
    public int compare(Film o1, Film o2) {
        return (int) (getAverageRating(o2) - getAverageRating(o1));
    }
}


