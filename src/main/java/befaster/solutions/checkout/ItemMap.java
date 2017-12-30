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


        Item b = new Item();
        b.setName("B");
        b.setPrice(30);


        Item c = new Item();
        c.setName("C");
        c.setPrice(20);

        Item d = new Item();
        d.setName("D");
        d.setPrice(15);

    }

    public Map<String, Item> getItemMap() {
        return itemMap;
    }

    public void setItemMap(Map<String, Item> itemMap) {
        this.itemMap = itemMap;
    }


}
