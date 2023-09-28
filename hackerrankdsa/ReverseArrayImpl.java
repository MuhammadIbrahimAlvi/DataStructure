package hackerrankdsa;

import java.util.ArrayList;
import java.util.List;

public class ReverseArrayImpl {
    public static List<Integer> reverseArray(List<Integer> a) {
        // Write your code here
        List<Integer> reverse = new ArrayList<>();
        for (int i = a.size(); i > 0; i--) {
            reverse.add(a.get(i - 1));
        }
        return reverse;
    }

}
