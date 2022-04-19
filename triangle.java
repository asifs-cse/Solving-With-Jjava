import java.util.*;
class triangle{
    public static void main(String arggs[]){
        Scanner in = new Scanner(System.in);
        double a,b,c,s, ans;
        a= in.nextDouble();
        b= in.nextDouble();
        c= in.nextDouble();

        s= (a+b+c)/2;

        ans = Math.sqrt(s*((s-a)*(s-b)*(s-c)));
        System.out.format("%.2f",ans);

    }
}