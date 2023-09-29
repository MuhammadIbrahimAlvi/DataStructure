package problemsolving;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * How are duplicates removed from an array without using any library?
 * **/

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 1};
        int[] resultArray = removeDuplicates(array);
        System.out.println(Arrays.toString(resultArray));
    }

    private static int[] removeDuplicates(int[] array) {
        int length = array.length;

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (array[i] == array[j]) {
                    array[j] = array[length - 1];
                    length--;
                    j--;
                }
            }
        }

        return array;
    }

}
