package befaster.solutions.checkout;

import java.util.List;

/**
 * Created by damatya on 12/30/17.
 */
public class Item {

    private String name;
    private int price;




    private List<Offer> offerList;


    private ItemOffer itemOffer;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public List<Offer> getOfferList() {
        return offerList;
    }

    public void setOfferList(List<Offer> offerList) {
        this.offerList = offerList;
    }

    public ItemOffer getItemOffer() {
        return itemOffer;
    }

    public void setItemOffer(ItemOffer itemOffer) {
        this.itemOffer = itemOffer;
    }



    public int calculatePrice(int quantity){
        if(offerList==null){
            return quantity*price;
        }
        else
        {
            int amount = 0;

            for(Offer offer:offerList) {

                System.out.println("quantity::"+quantity);
                if (quantity % offer.getQuantity() == 0) {
                    amount += (quantity / offer.getQuantity() * offer.getAmount());
                    quantity = 0;
                    break;
                } else {
                    while (quantity > offer.getQuantity()) {
                        amount += offer.getAmount();
                        quantity = quantity - offer.getQuantity();
                    }
                }

            }
            amount += quantity * price;
            System.out.println("in here amount " + amount);

            return amount;
        }
    }


}
