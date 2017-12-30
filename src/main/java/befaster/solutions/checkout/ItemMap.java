package befaster.solutions.checkout;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by damatya on 12/30/17.
 */
public class ItemMap {

    private Map<String, Item> itemMap = new HashMap<>();

    public ItemMap(){
        //TODO set from other source eg database

        Item a = new Item();
        a.setName("A");
        a.setPrice(50);

        Offer oa = new Offer();
        oa.setQuantity(3);
        oa.setAmount(130);

        a.setOffer(oa);


        Item b = new Item();
        b.setName("B");
        b.setPrice(30);

        Offer ob = new Offer();
        ob.setQuantity(2);
        ob.setAmount(45);

        b.setOffer(ob);


        Item c = new Item();
        c.setName("C");
        c.setPrice(20);

        Item d = new Item();
        d.setName("D");
        d.setPrice(15);


        itemMap.put("A",a);
        itemMap.put("B",b);
        itemMap.put("C",c);
        itemMap.put("D",d);

    }

    public Map<String, Item> getItemMap() {
        return itemMap;
    }

    public void setItemMap(Map<String, Item> itemMap) {
        this.itemMap = itemMap;
    }


}
