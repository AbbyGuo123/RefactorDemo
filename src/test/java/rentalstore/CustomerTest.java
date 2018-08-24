package rentalstore;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CustomerTest {

    private Customer customer = new Customer("abby");

    @Test
    public void should_return_correst_statement_given_customer_has_no_rental() {
        String result = customer.statement();
        assertThat(result,is("Rental Record for abby\n" +
                "Amount owed is0.0\n" +
                "You earned0 frequent renter points"));
    }



}