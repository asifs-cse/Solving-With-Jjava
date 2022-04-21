import java.util.*;
class color {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String v =in.next();

        if(v.equals("V") || v.equals("v")){
            System.out.println("Violet");
        }else if (v.equals("I") || v.equals("i")){
            System.out.println("Indigo");
        }else if (v.equals("B")|| v.equals("b")){
            System.out.println("Blue");
        }else if (v.equals("G")|| v.equals("g")){
            System.out.println("Green");
        }else if (v.equals("Y")|| v.equals("y")){
            System.out.println("Yellow");
        }else if (v.equals("O")|| v.equals("o")){
            System.out.println("Orange");
        }else if (v.equals("R")|| v.equals("r")){
            System.out.println("Red");
        }else{
            System.out.println("-1");
        }
    }
}
