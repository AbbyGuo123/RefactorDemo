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

    protected double getThisAmount(double thisAmount, Rental each) {
        switch (each.getMovie().getPriceCode()){
            case Movie.REGULAR:
               RegularMovie regularMovie = new RegularMovie();
               thisAmount = regularMovie.getThisAmount(thisAmount,each);
               break;
            case Movie.NEW_RELEASE:
                NewReleaseMovie newReleaseMovie = new NewReleaseMovie();
                thisAmount = newReleaseMovie.getThisAmount(thisAmount,each);
                break;
            case Movie.CHILDRENS:
                ChildrenMovie childrenMovie = new ChildrenMovie();
                thisAmount = childrenMovie.getThisAmount(thisAmount,each);
                break;
        }

        //add frequent renter points
        frequentRenterPoints ++;
        //add bonus for a two day new release rental
        if((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && each.getDayRented() > 1){
            frequentRenterPoints ++;
        }
        return thisAmount;
    }

}
