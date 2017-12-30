package befaster.solutions;

import org.junit.Test;

/**
 * Created by damatya on 12/30/17.
 */
public class CheckoutTest {
    @Test
    public void testCheckout(){
        System.out.println(Checkout.checkout("CCADDEEBBA"));


    }

    @Test
    public void testIt(){
        int n = 3;
        String s = "hello";
        System.out.println(String.format("0%"+n+"d",0).replace("0",s).replace(" ",""));
    }
}
