package rentalstore;

public abstract class MovieFactory {
    protected abstract double getThisAmount(double thisAmount, Rental each);
}
