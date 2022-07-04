class Animal{
    void eat(){
        System.out.println("eating...");
    }
}
class Dog extends Animal{
    void eat(){System.out.println("Eating brea...");}
    void bark(){System.out.println("Barking...");}
    void work(){
        eat();
        bark();
    }
}
public class superMethod {
    public static void main(String args[]){
        Dog d = new Dog();
        d.work();
    }
}
