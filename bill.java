import java.util.*;
class bill {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String id, name;
        int unit;
        double chg, amt, netamt, surchg=0;

        id = in.nextLine();
        name = in.nextLine();
        unit = in.nextInt();

        if(unit<200){
            chg = 1.20;
        }else if(unit>200 && unit<400){
            chg = 1.50;
        }else if(unit>400 && unit<600){
            chg = 1.8;
        }else{
            chg = 2.0;
        }
        amt = unit*chg;
        if(amt>400){
            surchg = amt *0.15;
        }
        netamt = amt+surchg;
        if(netamt<100){
            netamt = 100;
        }

        System.out.format("%.2f", netamt);
    }
}
