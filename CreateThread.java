class GoodMorning extends Thread{
    public void run(){
        for(int i=0; i<10; i++){
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                System.out.println("Good morning");
            }
        }
    }
}
class Hello extends Thread{
    public void run(){
        for(int i=0; i<10; i++){
            try{
                Thread.sleep(2000);
            }catch(Exception e){
                System.out.println("Hello");
            }
        }
    }
}
class Welcome extends Thread{
    public void run(){
        for(int i=0; i<10; i++){
            try{
                Thread.sleep(3000);
            }catch(Exception e){
                System.out.println("Wlcome");
            }
        }
    }
}
public class CreateThread {
    public static void main(String args[]){
        GoodMorning gm = new GoodMorning();
        Thread t1 = new Thread(gm);
        Hello hl = new Hello();
        
        Thread t2 = new Thread(hl);
        Welcome we = new Welcome();
        Thread t3 = new Thread(we);

        t1.start();
        t2.start();
        t3.start();
    }
    
}
