package rentalstore;

public class ChildrenMovie {
    public ChildrenMovie() {
    }
    public double getThisAmount(double thisAmount, Rental each){
        thisAmount+=1.5;
        if(each.getDayRented() > 3){
            thisAmount += (each.getDayRented() -3)*1.5;
        }
        return thisAmount;
    }
}
