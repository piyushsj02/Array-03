// second max element

import java.util.*;

class P9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int x = sc.nextInt();
        int arr[] = new int[x];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Element " + (i + 1) + "= ");
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            } 
        }
        int secmax =arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= secmax && arr[i] < max) {
                secmax = arr[i];
            }

        }
        System.out.println("Second max element : " +secmax);
    }
}
