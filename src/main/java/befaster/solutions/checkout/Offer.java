package befaster.solutions.checkout;

import java.util.Comparator;

/**
 * Created by damatya on 12/30/17.
 */
public class Offer implements Comparable<Offer>{



    private int quantity;
    private int amount;
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }


    @Override
    public int compareTo(Offer o) {
        int compareQuantity = this.quantity-o.getQuantity();
        return compareQuantity;
    }
}
