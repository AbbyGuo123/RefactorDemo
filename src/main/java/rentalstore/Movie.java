package rentalstore;

public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private MovieFactory movieFactory;

    private String title;
    private int priceCode;

    public Movie(String title, int priceCode,MovieFactory movieFactory) {
        this.title = title;
        this.priceCode = priceCode;
        this.movieFactory = movieFactory;
    }

    public int getPriceCode() {
        return priceCode;
    }

    public MovieFactory getMovieFactory() {
        return movieFactory;
    }

    public void setPriceCode(int priceCode) {
        this.priceCode = priceCode;
    }

    public String getTitle() {
        return title;
    }
}
