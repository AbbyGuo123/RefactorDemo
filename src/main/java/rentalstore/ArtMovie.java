package rentalstore;

public class ArtMovie extends MovieFactory {
    protected  double getThisAmount(double thisAmount, Rental each){
        thisAmount+=6;
        if(each.getDayRented() > 3){
            thisAmount += (each.getDayRented() -3)*1.5;
        }
        return thisAmount;
    }
}
