package ro.fastrackit.curs6;

import java.util.Arrays;
import java.util.Random;

public class Exercises {
    public static void main(String[] args) {
        int[] intNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        integersSum(intNumbers);
        oddNumbers(intNumbers);
        biggerThanGivenNr(intNumbers, 5);
        donations(25000);
        limitedDonations(25000, 10);
        textToSplit("One morning Josef Kahn is arrested for a crime he did not commit. In fact, he is never even told the nature of the offence. His life is thrown into turmoil as he becomes enmeshed in a struggle to prove his innocence. As the confounding case unfolds, Kahn is ultimately powerless - battling against a remote and uncaring bureaucracy.");


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

    static void donations(int target) {
        int donated = 0;
        do {
            Random random = new Random();
            int rand = random.nextInt(2000);
            donated += rand;

        } while (donated <= target);

        System.out.println(donated);
    }

    static void limitedDonations(int target, int maxDonation) {
        int donated = 0;
        int count = 0;
        for (int i = 1; i <= maxDonation; i++) {
            count++;
            if (count <= maxDonation & donated <= target) {
                Random random = new Random();
                int rand = random.nextInt(2000);
                donated += rand;
            }
        }
        System.out.println(donated);
    }

    static void textToSplit(String text){
        String[] arrOfText = text.split("\\.");
        for (String a: arrOfText){
            System.out.println(a.trim());
        }
    }

}
