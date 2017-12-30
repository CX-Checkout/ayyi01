package befaster.solutions;

import befaster.runner.SolutionNotImplementedException;

import java.util.HashMap;
import java.util.Map;

public class Checkout {

    public static Integer checkout(String skus) {
        Map<String, Integer> itemsWithCount = new HashMap<>();

        if(!skus.matches("^[A-D]+")){
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
        return 0;
    }
}
