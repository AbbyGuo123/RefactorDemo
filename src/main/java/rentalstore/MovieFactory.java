package rentalstore;

public abstract class MovieFactory {

    int frequentRenterPoints = 0;
    protected abstract double getThisAmount(double thisAmount, Rental each);

    protected int getFrequentRenterPoints(Rental each) {
        frequentRenterPoints ++;
        //add bonus for a two day new release rental
        if((each.getMovie().getMovieFactory() instanceof NewReleaseMovie) && each.getDayRented() > 1){
            frequentRenterPoints ++;
        }
        return frequentRenterPoints;
    }
}
