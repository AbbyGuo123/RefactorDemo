package rentalstore;

public class NewReleaseMovie extends MovieFactory{

    protected double getThisAmount(double thisAmount, Rental each){
        thisAmount+=each.getDayRented()*3;
        return thisAmount;
    }
    protected double getFrequentRenterPoints(Rental each) {
        frequentRenterPoints ++;
        //add bonus for a two day new release rental
        if(each.getDayRented() > 1){
            frequentRenterPoints ++;
        }
        return frequentRenterPoints;
    }

}
