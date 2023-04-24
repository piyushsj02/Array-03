import java.io.*;

class P1 {

    static int digit(int x) {
        int count = 0;
        while (x != 0) {
            count++;
            x = x / 10;
        }
        return count;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Size of Array : ");
        int size = Integer.parseInt(br.readLine());
        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("element " + (i + 1) + " = ");
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.print("Counts of digits of elements : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(digit(arr[i])+" ");
        }
    }

}
