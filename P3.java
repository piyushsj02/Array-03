// find Composite number in array with its index
//          Size of Array :3
//          Input  :  [ 2 5 12 ]
//          Output :  composite number 12 is at index 2


import java.io.*;

public class P3 {

// function for counting factors
static int compo(int x){
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
        
        if(compo(arr[i])>2){
            System.out.println("composite number "+arr[i]+" is at index "+i);
        }
        else{}
    }
}
    
}
