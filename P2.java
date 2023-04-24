//  print array of reverse numbers in given array
//          Size of Array : 3
//          Input : [ 123 456 789 ]
//          Output : [ 321 654 987 ]


import java.io.*;

class P2{
static int rev(int x){
    int n=0;
    while(x!=0){
        int rem=x%10;
        n=n*10+rem;
        x=x/10;
    }
    return n;
}
public static void main(String[] args)throws IOException {
    
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Size of Array : ");
    int size=Integer.parseInt(br.readLine());
    int arr[]=new int[size];

    for(int i=0;i<arr.length;i++){
        System.out.print("element "+(i+1)+" = ");
        arr[i]=Integer.parseInt(br.readLine());
    }


// for normal array

    System.out.print("Input : [ ");
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.print("]");

    System.out.println();

// for reverse no array
    System.out.print("Output : [ ");
    for(int i=0;i<arr.length;i++){
        System.out.print(rev(arr[i])+" ");
    }
    System.out.print("]");





}
}
