import javax.rmi.ssl.SslRMIClientSocketFactory;

class GoodMorning extends Thread{
    synchronized public void run(){
        try{
            int i=0;
            while(i<5){
                sleep(1000);
                System.out.println("Good Morning");
                i++;
            }
        }catch(Exception e){}
    }
}
class Hello extends Thread{
    synchronized public void run(){
        try{
            int i=0;
            while(i<5){
                Thread.sleep(2000);
                System.out.println("Hello");
                i++;
            }
        }catch(Exception e){}
    }
}
class Welcome extends Thread{
    synchronized public void run(){
        try{
            int i =0;
            while(i<5){
                Thread.sleep(3000);
                System.out.println("Welcome");
                i++;
            }
        }catch(Exception e){}
    }
}
public class ThreadEx {
    public static void main(String args[]){
        GoodMorning gm = new GoodMorning();
        Hello he = new Hello();
        Welcome we = new Welcome();

        gm.start();
        he.start();
        we.start();
    }
    
}
