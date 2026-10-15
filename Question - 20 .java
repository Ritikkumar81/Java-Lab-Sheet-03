import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] marks = new int[3][];

        marks[0] = new int[2];
        marks[1] = new int[3];
        marks[2] = new int[4];

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter marks for student " + (i + 1));

            for (int j = 0; j < marks[i].length; j++) {
                marks[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Student " + (i + 1) + " marks:");

            for (int mark : marks[i]) {
                System.out.print(mark + " ");
            }
            System.out.println();
        }
    }
}
