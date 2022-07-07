public class buildInException {
    public static void main(String args[]){
        try{
            int arr[]={1,2,3,4};
            System.out.println(arr[15]);
        }catch(ArrayIndexOutOfBoundException e){
            System.out.println(e);
        }
    }
}
