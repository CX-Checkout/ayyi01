package befaster.solutions.checkout;

import java.util.List;

/**
 * Created by damatya on 12/30/17.
 */
public class Item {

    private String name;
    private int price;




    private List<Offer> offerList;


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


    public int calculatePrice(int quantity){
        System.out.println("quantity::"+quantity);
        if(offer==null){
            return quantity*price;
        }
        else
        {
            if(quantity%offer.getQuantity()==0){
                return (quantity/offer.getQuantity()*offer.getAmount());
            }
            else{
                int amount = 0;
                while(quantity>offer.getQuantity()){
                    amount += offer.getAmount();
                    quantity = quantity-offer.getQuantity();
                }
                amount += quantity*price;
                System.out.println("in here amount "+amount);
                return amount;

            }
        }
    }


}
