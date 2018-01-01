package befaster.solutions.checkout;

import java.util.*;

/**
 * Created by damatya on 12/30/17.
 */
public class ItemMap {

    private Map<String, Item> itemMap = new HashMap<>();

    public ItemMap(){
        //TODO set from other source eg database

        // for A
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

        a.setOfferList(oaList);


        // for B
        Item b = new Item();
        b.setName("B");
        b.setPrice(30);

        Offer ob = new Offer();
        ob.setQuantity(2);
        ob.setAmount(45);

        List<Offer> obList = new ArrayList<>();
        obList.add(ob);

        b.setOfferList(obList);

        // for C

        Item c = new Item();
        c.setName("C");
        c.setPrice(20);


        // for D

        Item d = new Item();
        d.setName("D");
        d.setPrice(15);

        // for E

        Item e = new Item();
        e.setName("E");
        e.setPrice(40);

        ItemOffer itemOfferB = new ItemOffer();
        itemOfferB.setFreeItem(b);
        itemOfferB.setItemQuantity(2);
        itemOfferB.setFreeItemQuantity(1);

        e.setItemOffer(itemOfferB);


        // for F

        Item f = new Item();
        f.setName("F");
        f.setPrice(10);


        ItemOffer itemOfferF = new ItemOffer();
        itemOfferF.setFreeItem(f);
        itemOfferF.setItemQuantity(2);
        itemOfferF.setFreeItemQuantity(1);

        f.setItemOffer(itemOfferF);



        // for G
        Item g = new Item();
        g.setName("G");
        g.setPrice(20);

        // for H
        Item h = new Item();
        h.setName("H");
        h.setPrice(10);

        // for I
        Item i = new Item();
        i.setName("I");
        i.setPrice(35);

        // for J
        Item j = new Item();
        j.setName("J");
        j.setPrice(60);

        // for K
        Item k = new Item();
        k.setName("K");
        k.setPrice(80);

        // for L
        Item l = new Item();
        l.setName("L");
        l.setPrice(90);

        // for M
        Item m = new Item();
        m.setName("M");
        m.setPrice(15);

        // for N
        Item n = new Item();
        f.setName("N");
        f.setPrice(40);

        // for O
        Item o = new Item();
        f.setName("O");
        f.setPrice(10);

        // for G
        Item f = new Item();
        f.setName("F");
        f.setPrice(10);

        // for G
        Item f = new Item();
        f.setName("F");
        f.setPrice(10);

        // for G
        Item f = new Item();
        f.setName("F");
        f.setPrice(10);

        // for G
        Item f = new Item();
        f.setName("F");
        f.setPrice(10);

        // for G
        Item f = new Item();
        f.setName("F");
        f.setPrice(10);

        // for G
        Item f = new Item();
        f.setName("F");
        f.setPrice(10);

        // for G
        Item f = new Item();
        f.setName("F");
        f.setPrice(10);

        // for G
        Item f = new Item();
        f.setName("F");
        f.setPrice(10);

        // for G
        Item f = new Item();
        f.setName("F");
        f.setPrice(10);

        // for G
        Item f = new Item();
        f.setName("F");
        f.setPrice(10);

        // for G
        Item f = new Item();
        f.setName("F");
        f.setPrice(10);


        itemMap.put("A",a);
        itemMap.put("B",b);
        itemMap.put("C",c);
        itemMap.put("D",d);
        itemMap.put("E",e);
        itemMap.put("F",f);

    }

    public Map<String, Item> getItemMap() {
        return itemMap;
    }

    public void setItemMap(Map<String, Item> itemMap) {
        this.itemMap = itemMap;
    }


}
