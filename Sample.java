import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            int number = 1;

            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");

                number = number * (i - j) / (j + 1);
            }

            System.out.println();
        }
    }
}
