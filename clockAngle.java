import java.util.Scanner;

public class clockAngle {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int h, m;
        double angle;
        h =in.nextInt();
        m =in.nextInt();

        h=h%12;

        if(h==12) h=0;
        if(m==60) m=0;

        angle =Math.abs(((h*30)-(11*m)/2));
       

        if(angle>180){
            System.out.println(360-angle);
        }else{
            System.out.println(angle);
        }
    }
}
