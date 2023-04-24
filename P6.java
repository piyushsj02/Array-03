
import java.io.*;

class P6 {
    static int rev(int x) {
        int n = 0;
        while (x != 0) {
            int rem = x % 10;
            n = n * 10 + rem;
            x = x / 10;
        }
        return n;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Size of Array : ");
        int size = Integer.parseInt(br.readLine());
        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.print("Input : [ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            int no = rev(arr[i]);
            if (no == arr[i]) {
                System.out.println("Palindrome no " + arr[i] + " is at index " + i);
            }

        }

    }
}
