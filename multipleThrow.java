public class multipleThrow {
    public static void main(String args[]){
        int num=1;
        for(num=1; num<=10; num++){
            try{
                if(num==5)
                    throw new ArithmeticException("Arithmetic exception");
                else if(num<2)
                    throw new RuntimeException("Runtime Exception");
                else if(num>9)
                    throw new NullPointerException("NullPoint Exception");
            }catch(Exception e){
                System.out.println("Catch an exception");
                System.out.println(e.getMessage());
            }
            
        }
    }
}
