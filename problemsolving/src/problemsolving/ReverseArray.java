package problemsolving;

import java.util.ArrayList;
import java.util.List;

public class ReverseArray {
    public static void main(String[] args) {
        ReverseArrayImpl reverseArray = new ReverseArrayImpl();
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            integerList.add(i);
        }
        System.out.println(reverseArray.reverseArray(integerList));
    }
}

