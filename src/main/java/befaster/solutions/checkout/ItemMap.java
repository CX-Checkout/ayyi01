package befaster.solutions.checkout;

import java.util.*;

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
        oa.setQuantity(5);
        oa.setAmount(200);

        Offer oa1 = new Offer();
        oa1.setQuantity(3);
        oa1.setAmount(130);

        List<Offer> oaList = new ArrayList<>();
        oaList.add(oa);
        oaList.add(oa1);
        Collections.sort(oaList);

        System.out.println("the oalist::"+oaList.get(0).getQuantity());
        a.setOfferList(oaList);


        Item b = new Item();
        b.setName("B");
        b.setPrice(30);

        Offer ob = new Offer();
        ob.setQuantity(2);
        ob.setAmount(45);

        List<Offer> obList = new ArrayList<>();
        obList.add(ob);

        b.setOfferList(obList);


        Item c = new Item();
        c.setName("C");
        c.setPrice(20);

        Item d = new Item();
        d.setName("D");
        d.setPrice(15);

        Item e = new Item();
        d.setName("E");
        d.setPrice(40);


        itemMap.put("A",a);
        itemMap.put("B",b);
        itemMap.put("C",c);
        itemMap.put("D",d);
        itemMap.put("E",e);

    }

    public Map<String, Item> getItemMap() {
        return itemMap;
    }

    public void setItemMap(Map<String, Item> itemMap) {
        this.itemMap = itemMap;
    }


}
