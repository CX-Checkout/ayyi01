package befaster.solutions;

import org.junit.Assert;
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

        assert Checkout.checkout("HHHHHH")==55;
        assert Checkout.checkout("HHHHHHHHHH")==80;
        assert Checkout.checkout("HHHHHHHHHHHH")==100;
        assert Checkout.checkout("HHHHHHHHHHHHHHH")==125;

        assert Checkout.checkout("KK")==150;
        assert Checkout.checkout("KKKKK")==380;


    }


}
