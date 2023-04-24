import java.io.*;

public class P5 {

    static int Pftno(int x) {
        int sum = 0;
        for (int i = 1; i < x; i++) {
            if (x % i == 0) {
                sum = sum + i;          //Perfect no--> 6=1+2+3 (Addition of factors)
                
            }
        }
        
        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Size of Array :");
        int size = Integer.parseInt(br.readLine());
        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("element " + (i + 1) + " = ");
            arr[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < arr.length; i++) {
            int add=Pftno(arr[i]);

            if(arr[i]==add){
                System.out.println("Perfect no "+arr[i]+" is at index "+i);
            }
        }
    }
}
