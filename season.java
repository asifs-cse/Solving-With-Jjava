import java.util.*;
class season {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if(n<1 || n>12){
            System.out.println("-1");
        }else if(n==4 || n==5 || n==4){
            System.out.println("Summer");
        }else if(n==7 || n==8 || n==9 || n==10 || n==11){
            System.out.println("Rainy");
        }else if(n==11 || n==12 || n==1){
            System.out.println("Winter");
        }else if(n==2 || n==3){
            System.out.println("Spring");
        }
    }
}
