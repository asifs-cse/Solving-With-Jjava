import java.util.*;
class bill {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String id, name;
        double unit, bill=00;

        id = in.nextLine();
        name = in.nextLine();
        unit = in.nextDouble();

        if(unit<83){
            bill=100;
        }else if(unit<200){
            bill = unit*1.20;
        }else if(unit<400 && unit>200){
            bill = unit*1.50;
            if(bill>265){
                bill+= bill*0.15;
            }
        }else if(unit<600 && unit>399){
            bill = unit*1.80;
            bill+= bill*0.15;
        }else if(unit>599){
            bill = unit*2.00;
            bill+= bill*0.15;
        }

        System.out.format("%.2f", bill, args);
    }
}
