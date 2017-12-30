package befaster.solutions;

import befaster.runner.SolutionNotImplementedException;

public class Checkout {

    public static Integer checkout(String skus) {
        if(!skus.matches("^[A-D]+")){
            return -1;
        }
        return 0;
    }
}
