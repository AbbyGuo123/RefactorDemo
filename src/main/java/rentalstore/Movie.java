package rentalstore;

public class Movie {
    private MovieFactory movieFactory;

    private String title;


    public Movie(String title,MovieFactory movieFactory) {
        this.title = title;
        this.movieFactory = movieFactory;
    }


    public MovieFactory getMovieFactory() {
        return movieFactory;
    }

    public String getTitle() {
        return title;
    }
}
