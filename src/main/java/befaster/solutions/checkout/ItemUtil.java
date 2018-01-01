package befaster.solutions.checkout;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by damatya on 12/31/17.
 */
public class ItemUtil {

    public static String reformatItems(String items){
        ItemMap itemMap = new ItemMap();

        Map<String, Item> map = itemMap.getItemMap();

        Map<String, Integer> itemsWithCount = new HashMap<>();
        for(char c : items.toCharArray()){
            String character = String.valueOf(c);
            if(itemsWithCount.containsKey(character)){
                int count = itemsWithCount.get(character) +1;
                itemsWithCount.put(character,count);
            }
            else{
                itemsWithCount.put(character,1);
            }
        }

        String finalItems = items;
        for(String key:itemsWithCount.keySet()){
            //finalAmount+=map.get(key).calculatePrice(itemsWithCount.get(key));
            ItemOffer itemOffer = map.get(key).getItemOffer();
            if(itemOffer!=null){
                if(finalItems.contains(itemOffer.getFreeItem().getName())){
                    int itemCount = itemsWithCount.get(key);
                    boolean first=true;
                    while (itemCount>=itemOffer.getItemQuantity()){
                        if(first && ){

                        }
                        if(itemCount>=itemOffer.getItemQuantity() ){

                            String toReplace = "";

                            for(int i=1;i<=itemOffer.getFreeItemQuantity();i++){
                                toReplace+=itemOffer.getFreeItem().getName();
                            }

                            System.out.println("to repalce::"+toReplace);
                            finalItems = finalItems.replaceFirst(toReplace,"");
                            itemCount -=itemOffer.getItemQuantity();
                            if(key.equals(itemOffer.getFreeItem().getName())){
                                itemCount--;
                            }
                        }
                    }
                }
            }
        }
        return finalItems;
    }
}
