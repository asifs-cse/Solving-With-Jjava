import java.util.*;
class checkPositive {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        if(num<0){
            System.out.println("Negative Number");
        }else{
            System.out.println("Positive Number");
            
        }
    }
}