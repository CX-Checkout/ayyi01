package befaster.solutions;

import org.junit.Test;

/**
 * Created by damatya on 12/30/17.
 */
public class CheckoutTest {
    @Test
    public void testCheckout(){
        System.out.println(Checkout.checkout("FFFFFFAAAB"));
        System.out.println(Checkout.checkout("ABCDEFABCDEF"));
        System.out.println(Checkout.checkout("ABCDEF"));
        System.out.println(Checkout.checkout("CDFFAECBDEABZ"));


    }


}
