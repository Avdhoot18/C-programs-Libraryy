import java.util.Scanner;

public class LinearSearch {
    public static int search(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.print("Enter key: ");
        int key = sc.nextInt();

        int result = search(arr, key);
        if (result == -1) System.out.println("Not Found");
        else System.out.println("Found at index " + result);
    }
}
