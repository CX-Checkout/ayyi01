package befaster.solutions;

import org.junit.Test;

/**
 * Created by damatya on 12/30/17.
 */
public class CheckoutTest {
    @Test
    public void testCheckout(){
        String  input = "AAABBC";
        if(!input.matches("^[A-C]+")){
            System.out.println("-1");
        }
        else {
            System.out.println("12");
        }
    }
}
