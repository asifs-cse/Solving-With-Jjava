import java.util.*;
class coin {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int x, y;
        x=in.nextInt();
        y=in.nextInt();

        if(x==0 && y%2==0){
            System.out.println("YES");
        }else if(x==0 && y%2!=0){
            System.out.println("NO");
        }else if((x+(2*y))%2==0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
