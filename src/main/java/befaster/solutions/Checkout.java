package befaster.solutions;

import befaster.runner.SolutionNotImplementedException;
import befaster.solutions.checkout.Item;
import befaster.solutions.checkout.ItemMap;
import org.apache.commons.codec.binary.StringUtils;

import java.util.HashMap;
import java.util.Map;

public class Checkout {

    public static Integer checkout(String skus) {
        Map<String, Integer> itemsWithCount = new HashMap<>();

        if("".equals(skus)){
            return 0;
        }

        if(!skus.matches("^[A-E]+")){
            return -1;
        }

        for(char c : skus.toCharArray()){
            String character = String.valueOf(c);
            if(itemsWithCount.containsKey(character)){
                int count = itemsWithCount.get(character) +1;
                itemsWithCount.put(character,count);
            }
            else{
                itemsWithCount.put(character,1);
            }
        }

        ItemMap itemMap = new ItemMap();
        Map<String, Item> map = itemMap.getItemMap();

        int finalAmount = 0;
        for(String key:itemsWithCount.keySet()){
            finalAmount+=map.get(key).calculatePrice(itemsWithCount.get(key));
        }
        return finalAmount;
    }
}
