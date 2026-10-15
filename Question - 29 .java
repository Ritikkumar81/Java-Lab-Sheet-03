import java.util.Arrays;

public class Q29 {
    public static void main(String[] args) {
        int[][] arr = {
            {5, 2, 8},
            {9, 1},
            {7, 4, 3, 6}
        };

        for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr[i]);
        }

        System.out.println("Sorted jagged array:");
        for (int[] row : arr) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
