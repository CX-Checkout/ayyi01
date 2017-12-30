package befaster.solutions.checkout;

/**
 * Created by damatya on 12/30/17.
 */
public class Item {

    private String name;
    private int price;

    private Offer offer;

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

    public Offer getOffer() {
        return offer;
    }

    public void setOffer(Offer offer) {
        this.offer = offer;
    }


    public int calculatePrice(int quantity){
        if(offer==null){
            return quantity*price;
        }
        else
        {
            if(offer.getQuantity()%quantity==0){
                return (quantity/offer.getQuantity()*offer.getAmount());
            }
            else{
                return 0;
            }
        }
    }


}
