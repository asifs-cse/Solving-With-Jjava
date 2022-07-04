class Animal{
    Animal(){System.out.println("Animal is created");}
}
class Dog extends Animal{
    Dog(){
        System.out.println("dog is created");
    }
}
public class superConstructor {
    public static void main(String args[]){
        Dog d = new Dog();
    }
}
