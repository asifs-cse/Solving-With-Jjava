import java.util.*;
class vowel {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String n=in.nextLine().toUpperCase();

        if(n.equals("A") || n.equals("E") || n.equals("I") || n.equals("O") ||n.equals("U")){
            System.out.println("Vowel");
        }else{
            System.out.println("Consonant");
        }
    }
}
