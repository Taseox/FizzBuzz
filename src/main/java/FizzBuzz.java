import java.util.LinkedList;
import java.util.List;

public class FizzBuzz {
    public static String fizzBuzz(int num) {
        String result = "";
        try {
            if (String.valueOf(num).contains("-")) {
                throw new Exception("Cannot compute negative numbers!");
            } else if (String.valueOf(num).contains("66")) {
                result = "FizzBuzz";
            } else if (num % 5 == 0 && num % 7 == 0) {
                result = "FizzBuzz";
            } else if (num % 5 == 0) {
                result = "Fizz";
            } else if (num % 7 == 0) {
                result = "Buzz";
            } else {
                result = String.valueOf(num);
            }
        } catch (Exception e) {
            System.out.println("Cannot compute negative numbers!");
        }
        return result;
    }

    public static List<String> fizzBuzzMultiple(int num1, int num2) {
        List<String> returnList = new LinkedList<>();
        for(int i = num1; i<num2; i++){
            //idk
        }
        return returnList;
    }
}

