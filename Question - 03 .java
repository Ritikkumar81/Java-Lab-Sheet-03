import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number: ");
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        System.out.println("Sum = " + sum);
    }
}
