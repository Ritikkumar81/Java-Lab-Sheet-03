import java.util.Scanner;

public class Q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3];
        int zeros = 0, nonZeros = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter element: ");
                a[i][j] = sc.nextInt();

                if (a[i][j] == 0) {
                    zeros++;
                } else {
                    nonZeros++;
                }
            }
        }

        System.out.println("Zero elements = " + zeros);
        System.out.println("Non-zero elements = " + nonZeros);

        if (zeros > nonZeros) {
            System.out.println("The matrix is sparse");
        } else {
            System.out.println("The matrix is not sparse");
        }
    }
}
