package rentalstore;

import java.util.Enumeration;

public abstract class Statement {
    double totalAmount = 0;
    int frequentRenterPoints = 0;

    public String statement(Customer customer){
        Enumeration rentals = customer.getRentals().elements();
        String result = getHeaderString(customer);
        result +=getAllItemString(rentals);
        result += getFooterString();
        return result;
    }

    protected abstract String getAllItemString(Enumeration rentals);
    protected abstract String getHeaderString(Customer customer);
    protected abstract String getFooterString();

}
