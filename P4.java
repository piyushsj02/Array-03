// find Prime number in array with its index
//      Size of array :5
//      Input  :    [ 5 8 3 10 11 ]
//      Output :    Prime number 5 is at index 0
//                  Prime number 3 is at index 1
//                  Prime number 11 is at index 4

import java.io.*;

public class P4 {

// function for counting factors
static int prime(int x){
    int count=0;
    for(int i=1;i<=x;i++){
        if(x%i==0){
            count++;
        }
        
    }
        return count; 
    
}
public static void main(String[] args) throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Size of Array :");
    int size=Integer.parseInt(br.readLine());
    int arr[]=new int[size];

    for(int i=0;i<arr.length;i++){
        System.out.print("element "+(i+1)+" = ");
        arr[i]=Integer.parseInt(br.readLine());
    }

    for(int i=0;i<arr.length;i++){
        
        if(prime(arr[i])==2){
            System.out.println("Prime number "+arr[i]+" is at index "+i);
        }
        else{}
    }
}
    
}

