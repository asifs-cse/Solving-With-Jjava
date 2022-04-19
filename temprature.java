import java.util.*;
class temprature {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        double c,f;
        c = in.nextDouble();

        f = 32+(c*9/5);
        System.out.format("%.2f",f);
    }
}
