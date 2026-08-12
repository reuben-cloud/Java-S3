import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements (n): ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the number to search: ");
        int key = sc.nextInt();

        int position = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                position = i + 1; // 1-based index position
                break;
            }
        }

        if (position != -1) {
            System.out.println("Number found at position (1-based index): " + position);
        } else {
            System.out.println("Number not found in the array.");
        }

        sc.close();
    }
}
