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

        assert Checkout.checkout("NNNM")==120;
        assert Checkout.checkout("NNNNM")==160;
        assert Checkout.checkout("NNNNNNMMN")==280;


        assert Checkout.checkout("PPPPP")==200;

        assert Checkout.checkout("QQ")==60;
        assert Checkout.checkout("QQQ")==80;

        assert Checkout.checkout("RR")==100;
        assert Checkout.checkout("RRRQ")==150;
        assert Checkout.checkout("RRRQQ")==180;

        assert Checkout.checkout("UUU")==120;
        assert Checkout.checkout("UUUU")==120;

        assert Checkout.checkout("VV")==90;
        assert Checkout.checkout("VVV")==130;
        assert Checkout.checkout("VVVV")==180;
        assert Checkout.checkout("VVVVVV")==260;


    }


}
