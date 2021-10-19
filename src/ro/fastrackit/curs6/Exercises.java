package ro.fastrackit.curs6;

import java.util.Arrays;

public class Exercises {
    public static void main(String[] args) {
        int[] intNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        integersSum(intNumbers);
        oddNumbers(intNumbers);
        biggerThanGivenNr(intNumbers, 5);


    }

    static int integersSum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }

    static int oddNumbers(int[] numbers) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    static int[] biggerThanGivenNr(int[] numbers, int nrToCompare) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > nrToCompare) {
                count++;
            }
        }
        int[] bigger = new int[count];
        int j = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > nrToCompare) {
                bigger[j++] = numbers[i];
            }
        }
        return bigger;
    }

}
