package by.algorithmization.decompositionusingmethods;

public class Task17 {
    private static int countSubtraction(int number) {
        int count = 0;
        while (number > 0) {
            number -= countSumOfDigits(number);
            count++;
        }
        return count;
    }

    private static int countSumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.print(sum + ", ");
        return sum;
    }

    public static void main(String[] args) {
        int n = countSubtraction(331);
        System.out.println("\nThe quantity of the substractions: " + n);
    }
}
