import java.util.*;
class average {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        double a,b,avg;
        a= in.nextDouble();
        b= in.nextDouble();

        avg= ((a+b)/2);
        System.out.format("%.4f",avg);
        
    }
}
