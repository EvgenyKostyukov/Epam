package by.algorithmization.decompositionusingmethods;

public class Task13 {
    private static int[][] findTwin(int n) {
        int[][] twinNumbers = new int[n - 1][2];
        for (int i = 0; i < twinNumbers.length; i++) {
            twinNumbers[i][0] = n + i;
            twinNumbers[i][1] = twinNumbers[i][0] + 2;
        }
        return twinNumbers;
    }

    private static void printMatrix(int[][] square) {
        for (int[] array : square) {
            for (int element : array) {
                System.out.printf("%2d ", element);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 40;
        int[][] twinNumbers = findTwin(n);
        System.out.printf("Numbers \"Twins\" on the distance from %d till %d:%n", n, n * 2);
        printMatrix(twinNumbers);
    }
}
