package problemsolving;

import java.util.HashMap;
import java.util.Map;

public class MaximumAndMinimumInArray {
    public static void main(String[] args) {

        int[] arrayOfNumbers = {1,2,3,0,5,-1,-2,6,7,-3};

        System.out.println(findMaximumAndMinimumInArray(arrayOfNumbers));

    }

    private static Map<String, Integer> findMaximumAndMinimumInArray(int[] arrayOfNumbers) {

        Map<String, Integer> mapOfMinimumAndMaximumNumbers = new HashMap<>();

        int count = 0, minimumNumber = 0, maximumNumber = 0;

        int temp;

        while (count < arrayOfNumbers.length) {

            minimumNumber = arrayOfNumbers[count];
            maximumNumber = arrayOfNumbers[count];

            for (int i = 0; i < arrayOfNumbers.length; i++) {

                if (minimumNumber > arrayOfNumbers[i]) {

                    minimumNumber = arrayOfNumbers[i];

                }
                if (maximumNumber < arrayOfNumbers[i]) {

                    maximumNumber = arrayOfNumbers[i];

                }

            }

            count++;
        }

        mapOfMinimumAndMaximumNumbers.put("maximumNumber", maximumNumber);
        mapOfMinimumAndMaximumNumbers.put("minumumNumber", minimumNumber);

        return mapOfMinimumAndMaximumNumbers;

    }
}
