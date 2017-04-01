import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int number[] = new int[n];
        for (int i = 0; i < n; i++) {
            number[i] = scanner.nextInt();
        }

        for (int i = number.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (number[j + 1] > number[j]) {
                    int Auxiliary = number[j];
                    number[j] = number[j + 1];
                    number[j + 1] = Auxiliary;
                }
            }
        }

        for (int i = 0; i < number.length; i++) {
            if (i < n) System.out.print(number[i] + " ");
            else if (i == n) System.out.println(number[i]);
        }
    }
}
