import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter numbers separated by space: ");
        String[] parts = sc.nextLine().split(" ");
        int[] arr = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i]);
        }

        System.out.print("Choose algorithm (bubble / quick): ");
        String algo = sc.nextLine();

        if (algo.equalsIgnoreCase("bubble")) {
            arr = BubbleSort.sort(arr);
        } else if (algo.equalsIgnoreCase("quick")) {
            arr = QuickSort.sort(arr);
        } else {
            System.out.println("Invalid algorithm");
            return;
        }

        System.out.println("Sorted result: " + Arrays.toString(arr));
    }
}