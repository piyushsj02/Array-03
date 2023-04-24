import java.io.*;

class P7 {

    static int strong(int x) {
        int sum = 0;

        while (x != 0) {
            int multi = 1;
            int rem = x % 10;
            for (int i = 1; i <= rem; i++) {
                multi = multi * i;
            }
            sum = sum + multi;
            x = x / 10;

        }
        return sum;
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
            int no = strong(arr[i]);
            if (no == arr[i]) {
                System.out.println("Strong number " + arr[i] + " is at index " + i);
            }

        }

    }
}
