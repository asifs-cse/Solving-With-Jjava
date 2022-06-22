import java.util.Scanner;

public class PrimeInRange {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int m,n, prime=0;
        m = in.nextInt();
        n = in.nextInt();

        for(int i =m; i<=n; i++){
            for(int j=2; j<Math.sqrt(i); j++){
                if(i%j==0){
                    prime= prime+1;
                    break;
                }
            }
        }
        System.out.println(prime);
    }
}
