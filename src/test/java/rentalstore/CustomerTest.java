package rentalstore;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CustomerTest {

    private Customer customer = new Customer("abby");

    @Test
    public void should_return_correct_statement_given_customer_has_no_rental() {
        String result = customer.TxtStatement();
        assertThat(result,is("Rental Record for abby\n" +
                "Amount owed is0.0\n" +
                "You earned0 frequent renter points"));
    }

    @Test
    public void should_return_correct_statement_given_customer_regular_movie_has_rent_one_rental_and_day_rented_1() {
        Movie movie =new Movie("movie1Title",Movie.REGULAR);
        Rental rental = new Rental(movie,1);
        customer.addRental(rental);
        String result = customer.TxtStatement();
        assertThat(result,is("Rental Record for abby\n" +
                "\tmovie1Title\t2.0\n" +
                "Amount owed is2.0\n" +
                "You earned1 frequent renter points"));
    }

    @Test
    public void should_return_correct_statement_given_customer_regular_movie_has_rent_one_rental_and_day_rented_3() {
        Movie movie =new Movie("movie1Title",Movie.REGULAR);
        Rental rental = new Rental(movie,3);
        customer.addRental(rental);
        String result = customer.TxtStatement();
        assertThat(result,is("Rental Record for abby\n" +
                "\tmovie1Title\t3.5\n" +
                "Amount owed is3.5\n" +
                "You earned1 frequent renter points"));
    }


    @Test
    public void should_return_correct_statement_given_customer_new_release_movie_has_rent_one_rental_and_day_rented_1() {
        Movie movie =new Movie("movie1Title",Movie.NEW_RELEASE);
        Rental rental = new Rental(movie,1);
        customer.addRental(rental);
        String result = customer.TxtStatement();
        assertThat(result,is("Rental Record for abby\n" +
                "\tmovie1Title\t3.0\n" +
                "Amount owed is3.0\n" +
                "You earned1 frequent renter points"));
    }

    @Test
    public void should_return_correct_statement_given_customer_new_release_movie_has_rent_one_rental_and_day_rented_4() {
        Movie movie =new Movie("movie1Title",Movie.NEW_RELEASE);
        Rental rental = new Rental(movie,4);
        customer.addRental(rental);
        String result = customer.TxtStatement();
        assertThat(result,is("Rental Record for abby\n" +
                "\tmovie1Title\t12.0\n" +
                "Amount owed is12.0\n" +
                "You earned2 frequent renter points"));
    }

    @Test
    public void should_return_html_statement() {

        Movie movie =new Movie("Roman Holiday",Movie.NEW_RELEASE);
        Rental rental=new Rental(movie,1);
        customer.addRental(rental);

        String result=  customer.htmlStatement();

        assertEquals("<H1>Rentals for <EM>abby</EM></H1><P>\n" +
                "\tRoman Holiday\t3.0<BR>\n" +
                "<P>You owe<EM>3.0</EM><P>\n" +
                "On this rental you earned <EM>1</EM> frequent renter points<P>",result);

    }

}