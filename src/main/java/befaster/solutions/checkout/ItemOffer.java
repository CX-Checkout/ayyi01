package befaster.solutions.checkout;

/**
 * Created by damatya on 12/31/17.
 */
public class ItemOffer {


    private Item freeItem;

    private int itemQuantity;

    private int freeItemQuantity;

    public Item getFreeItem() {
        return freeItem;
    }

    public void setFreeItem(Item freeItem) {
        this.freeItem = freeItem;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public int getFreeItemQuantity() {
        return freeItemQuantity;
    }

    public void setFreeItemQuantity(int freeItemQuantity) {
        this.freeItemQuantity = freeItemQuantity;
    }

}
