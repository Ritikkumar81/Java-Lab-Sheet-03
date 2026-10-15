import java.util.Scanner;

public class Q27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter element: ");
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Boundary elements:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 0 || i == 2 || j == 0 || j == 2) {
                    System.out.print(a[i][j] + "\t");
                } else {
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }
    }
}
