import java.util.Scanner;
class MyException extends Exception{
    MyException(String str){
        super(str);
    }
}
public class UserDefineException {
    public static void main(String args[]){
        try{
            System.out.println("Welcome");
            System.out.println("Enter amount to withdraw");
            Scanner in = new Scanner(System.in);
            double bal = in.nextInt();

            if(bal>2500){
                MyException me = new MyException("Balance is very high!");
                throw me;
            }
            System.out.println("Balance is withdraws!");
        }catch(MyException e){
            System.out.println(e);
        }
    }
}
