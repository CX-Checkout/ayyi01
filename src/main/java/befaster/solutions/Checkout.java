package befaster.solutions;

import befaster.runner.SolutionNotImplementedException;

public class Checkout {

    public static Integer checkout(String skus) {
        if(!skus.matches("^[A-C]+")){
            System.out.println("pass");
        }
        return 0;
    }
}
