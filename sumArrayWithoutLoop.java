import java.util.Scanner;

class sumArrayWithoutLoop{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n, sum=0;
        n = in.nextInt();
        int[] arr = new int[n];

        for(int i =0; i<n; i++){
            arr[i] = in.nextInt();
            sum = sum+arr[i];
        }

        System.out.println(sum);
    }
}