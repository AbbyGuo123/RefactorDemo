package rentalstore;

import java.util.Enumeration;

public class TXTStatement extends Statement{

    protected String getAllItemString(Enumeration rentals) {
        String result="";
        while(rentals.hasMoreElements()){
            double thisAmount =0;
            Rental each = (Rental) rentals.nextElement();

            thisAmount = getThisAmount(thisAmount, each);

            //show figures for this rental
            result += "\t"
                    + each.getMovie().getTitle()
                    + "\t" + String.valueOf(thisAmount)
                    + "\n";
            totalAmount += thisAmount;
        }
        return result;
    }

    protected String getHeaderString(Customer customer) {
        return "Rental Record for "
                + customer.getName()
                + "\n";
    }

    protected String getFooterString() {
        String  frequentRenterPointsString = String.valueOf(frequentRenterPoints);
        if(Math.round(frequentRenterPoints)-frequentRenterPoints==0){
            frequentRenterPointsString=  String.valueOf((long)frequentRenterPoints);
        }
        //add footer lines
        String result = "Amount owed is"
                + String.valueOf(totalAmount)
                + "\n"
                + "You earned"
                + frequentRenterPointsString
                + " frequent renter points";
        return result;
    }
}
