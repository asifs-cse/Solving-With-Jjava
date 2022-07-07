import java.io.IOException;
public class throwsKey {
    static void method() throws IOException{
        System.out.println("Inside the medhod()");
        throw new ArithmeticException("throwing Arithmetic exception!");
    }

    public static void main(String args[]) throws IOException{
        try{
            method();
        }catch(ArithmeticException e){
            System.out.println("Caught in metho()");
        }
    }
}
