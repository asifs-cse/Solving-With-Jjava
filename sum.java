import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class sum {
    public static void main(String args[]){
        //Scanner in = new Scanner(System.in);
        BufferedReader in = new BufferedReader(
            new InputStreamReader(System.in));
        int n, sum=0;
        n=in.read();
        if(n>=1 && n<=30){
            int arr[] = new int[5];
        
            arr[0]=in.read();
            arr[1]=in.read();
            arr[2]=in.read();
            arr[3]=in.read();
            arr[4]=in.read();

            sum = arr[0]+arr[1]+arr[2]+arr[3]+arr[4];

            System.out.println(sum);
        }else{
            System.out.println("Enter a Valid Number");
        }
        
            
        
    }
}