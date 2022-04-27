import java.util.*;
public class MultiDimantiondArray {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[2][2];

        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                arr[i][j] = in.nextInt();
            }
        }
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                System.out.println(arr[i][j]);
            }
        }


    }
}
