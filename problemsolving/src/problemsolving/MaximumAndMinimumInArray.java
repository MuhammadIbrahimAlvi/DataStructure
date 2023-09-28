package problemsolving;

public class MaximumAndMinimumInArray {
    public static void main(String[] args) {

        int[] arrayOfNumbers = {1,2,3,0,5,-1,-2,6,7,-3};

        System.out.println(findMaximumAndMinimumInArray(arrayOfNumbers));

    }

    private static int findMaximumAndMinimumInArray(int[] arrayOfNumbers) {

        int count = 0, minimumNumber = 0, maximumNumber = 0;

        int temp;

        while (count < arrayOfNumbers.length) {

            minimumNumber = arrayOfNumbers[count];

            for (int i = 0; i < arrayOfNumbers.length; i++) {

                if (minimumNumber > arrayOfNumbers[i]) {

                    minimumNumber = arrayOfNumbers[i];

                }

            }

            count++;
        }

        return minimumNumber;

    }
}
