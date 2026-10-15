import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int[] copy = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number: ");
            arr[i] = sc.nextInt();
            copy[i] = arr[i];
        }

        System.out.println("Copied array:");
        for (int num : copy) {
            System.out.print(num + " ");
        }
    }
}
