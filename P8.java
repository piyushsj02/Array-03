//Armstrong no

import java.io.*;

class P8{

    static int armStrong(int x){
        int no=x;
        int count=0;
        int sum=0;
        
        while(no!=0){
            count++;
            no=no/10;
        }
        while(x!=0){
            int rem=x%10;
            int multi=1;
            for(int i=1;i<=count;i++){
                multi=multi*rem;
            }
            sum=sum+multi;
            x=x/10;
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
            int n = armStrong(arr[i]);
            if (n== arr[i]) {
                System.out.println("ArmStrong number " + arr[i] + " is at index " + i);
            }

        }

    }
}