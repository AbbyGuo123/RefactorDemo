package rentalstore;

public class NewReleaseMovie extends MovieFactory{

    protected double getThisAmount(double thisAmount, Rental each){
        thisAmount+=each.getDayRented()*3;
        return thisAmount;
    }
}
