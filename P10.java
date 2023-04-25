
// second minimum element of array -->

import java.util.*;

class P10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int x = sc.nextInt();
        int arr[] = new int[x];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Element " + (i + 1) + "= ");
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Second minimum element : " + arr[1]);
    }
}
