package rentalstore;

public abstract class MovieFactory {

    double frequentRenterPoints = 0;
    protected abstract double getThisAmount(double thisAmount, Rental each);

    protected double getFrequentRenterPoints(Rental each) {
        frequentRenterPoints ++;
        return frequentRenterPoints;
    }
}
