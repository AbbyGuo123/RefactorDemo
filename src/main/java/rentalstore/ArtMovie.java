package rentalstore;

public class ArtMovie extends MovieFactory {
    protected  double getThisAmount(double thisAmount, Rental each){
        thisAmount = 6;
        return thisAmount;
    }

    protected double getFrequentRenterPoints(Rental each) {
        frequentRenterPoints =1.5;
        return frequentRenterPoints;
    }
}
