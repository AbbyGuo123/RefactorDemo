package rentalstore;

public class NewReleaseMovie {
    public NewReleaseMovie() {
    }

    public double getThisAmount(double thisAmount, Rental each){
        thisAmount+=each.getDayRented()*3;
        return thisAmount;
    }
}
