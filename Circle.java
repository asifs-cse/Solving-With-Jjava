import java.util.*;
class Circle {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        double r, area;
        
        r = in.nextDouble();
        area = (3.14*r*r);
        System.out.format("%.2f",area);
    }
}