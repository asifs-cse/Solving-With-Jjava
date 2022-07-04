
public class testFinaly {
    public static void main(String args[]){
        try{
            System.out.println("Inside try block");
            int data=25/0;
            System.out.println(data);
        }catch(ArithmeticException e){
            System.out.println("Exception Handled");
            System.err.println(e);
        }
        finally{
            System.out.println("finally block is always executed");
        }
    }
}
