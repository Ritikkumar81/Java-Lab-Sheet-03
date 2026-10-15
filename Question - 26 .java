import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter element: ");
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Upper triangular matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j >= i) {
                    System.out.print(a[i][j] + "\t");
                } else {
                    System.out.print("0\t");
                }
            }
            System.out.println();
        }

        System.out.println("Lower triangular matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j <= i) {
                    System.out.print(a[i][j] + "\t");
                } else {
                    System.out.print("0\t");
                }
            }
            System.out.println();
        }
    }
}
