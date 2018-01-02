package befaster.solutions;

import org.junit.Test;

/**
 * Created by damatya on 12/30/17.
 */
public class CheckoutTest {
    @Test
    public void testCheckout(){
        System.out.println(Checkout.checkout("FFFFFFAAAB")==200);
        System.out.println(Checkout.checkout("ABCDEFABCDEF")==300);
        System.out.println(Checkout.checkout("ABCDEF")==165);
        System.out.println(Checkout.checkout("CDFFAECBDEABZ")==350);


    }


}
