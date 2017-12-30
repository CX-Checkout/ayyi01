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

            }
        }
        return null;
    }
}
