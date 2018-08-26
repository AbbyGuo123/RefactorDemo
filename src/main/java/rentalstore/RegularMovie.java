package rentalstore;

public class RegularMovie extends MovieFactory{
    protected double getThisAmount(double thisAmount, Rental each){
       thisAmount += 2;
       if(each.getDayRented() > 2){
           thisAmount+=(each.getDayRented() - 2) * 1.5;
       }
       return thisAmount;
   }

}
