package rentalstore;

import java.util.Enumeration;

public class HtmlStatement extends Statement{

    protected String getAllItemString(Enumeration rentals) {
        String result = "";
        while(rentals.hasMoreElements()){
            double thisAmount =0;
            Rental each = (Rental) rentals.nextElement();

            thisAmount = getThisAmount(thisAmount, each);

            //show figures for this rental
            result += "\t"
                    + each.getMovie().getTitle()
                    + "\t"
                    + String.valueOf(thisAmount)
                    + "<BR>\n";
            totalAmount += thisAmount;

        }
        return result;
    }



    protected String getFooterString() {
        //add footer lines
        String result = "<P>You owe<EM>"
                + String.valueOf(totalAmount)
                + "</EM><P>\n"
                + "On this rental you earned <EM>"
                + String.valueOf(frequentRenterPoints)
                + "</EM> frequent renter points<P>";
        return result;
    }

    protected String getHeaderString(Customer customer) {
        return "<H1>Rentals for <EM>"
                + customer.getName()
                + "</EM></H1><P>\n";
    }


}
