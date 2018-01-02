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

        Offer oh = new Offer();
        oh.setQuantity(10);
        oh.setAmount(80);

        Offer oh1 = new Offer();
        oh1.setQuantity(5);
        oh1.setAmount(45);

        List<Offer> ohList = new ArrayList<>();
        ohList.add(oh);
        ohList.add(oh1);
        Collections.sort(ohList);

        h.setOfferList(ohList);


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

        Offer ok = new Offer();
        ok.setQuantity(2);
        ok.setAmount(150);


        List<Offer> okList = new ArrayList<>();
        okList.add(ok);
        Collections.sort(okList);

        k.setOfferList(okList);

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
        n.setName("N");
        n.setPrice(40);

        ItemOffer itemOfferN = new ItemOffer();
        itemOfferN.setFreeItem(m);
        itemOfferN.setItemQuantity(3);
        itemOfferN.setFreeItemQuantity(1);

        n.setItemOffer(itemOfferN);

        // for O
        Item o = new Item();
        o.setName("O");
        o.setPrice(10);

        // for P
        Item p = new Item();
        p.setName("P");
        p.setPrice(50);

        Offer op = new Offer();
        op.setQuantity(5);
        op.setAmount(200);


        List<Offer> opList = new ArrayList<>();
        opList.add(op);
        Collections.sort(opList);

        p.setOfferList(opList);

        // for Q
        Item q = new Item();
        q.setName("Q");
        q.setPrice(30);


        Offer oq = new Offer();
        oq.setQuantity(3);
        oq.setAmount(80);


        List<Offer> oqList = new ArrayList<>();
        oqList.add(oq);
        Collections.sort(oqList);

        q.setOfferList(oqList);

        // for R
        Item r = new Item();
        r.setName("R");
        r.setPrice(50);


        ItemOffer itemOfferR = new ItemOffer();
        itemOfferR.setFreeItem(q);
        itemOfferR.setItemQuantity(3);
        itemOfferR.setFreeItemQuantity(1);

        r.setItemOffer(itemOfferR);


        // for S
        Item s = new Item();
        s.setName("S");
        s.setPrice(30);

        // for T
        Item t = new Item();
        t.setName("T");
        t.setPrice(20);

        // for U
        Item u = new Item();
        u.setName("U");
        u.setPrice(40);

        ItemOffer itemOfferU = new ItemOffer();
        itemOfferU.setFreeItem(u);
        itemOfferU.setItemQuantity(3);
        itemOfferU.setFreeItemQuantity(1);

        u.setItemOffer(itemOfferU);

        // for V
        Item v = new Item();
        v.setName("V");
        v.setPrice(50);

        Offer ov = new Offer();
        ov.setQuantity(3);
        ov.setAmount(130);

        Offer ov1 = new Offer();
        ov1.setQuantity(2);
        ov1.setAmount(90);


        List<Offer> ovList = new ArrayList<>();
        ovList.add(ov);
        ovList.add(ov1);
        Collections.sort(ovList);

        v.setOfferList(ovList);

        // for W
        Item w = new Item();
        w.setName("W");
        w.setPrice(20);

        // for X
        Item x = new Item();
        x.setName("X");
        x.setPrice(90);

        // for Y
        Item y = new Item();
        y.setName("Y");
        y.setPrice(10);

        // for Z
        Item z = new Item();
        z.setName("Z");
        z.setPrice(50);


        itemMap.put("A",a);
        itemMap.put("B",b);
        itemMap.put("C",c);
        itemMap.put("D",d);
        itemMap.put("E",e);
        itemMap.put("F",f);
        itemMap.put("G",g);
        itemMap.put("H",h);
        itemMap.put("I",i);
        itemMap.put("J",j);
        itemMap.put("K",k);
        itemMap.put("L",l);
        itemMap.put("M",m);
        itemMap.put("N",n);
        itemMap.put("O",o);
        itemMap.put("P",p);
        itemMap.put("Q",q);
        itemMap.put("R",r);
        itemMap.put("S",s);
        itemMap.put("T",t);
        itemMap.put("U",u);
        itemMap.put("V",v);
        itemMap.put("W",w);
        itemMap.put("X",x);
        itemMap.put("Y",y);
        itemMap.put("Z",z);

    }

    public Map<String, Item> getItemMap() {
        return itemMap;
    }

    public void setItemMap(Map<String, Item> itemMap) {
        this.itemMap = itemMap;
    }


}
