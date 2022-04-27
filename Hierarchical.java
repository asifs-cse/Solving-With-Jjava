class Animal{
    void eat(){System.out.println("Eating...");}
}
class Dog extends Animal{
    void bark(){System.out.println("Barking...");}
}
class Cat extends Animal{
    void meow(){System.out.println("meowingn...");}
}
public class Hierarchical {
    public static void main(String[] args){
        Cat ob = new Cat();
        ob.eat();
        ob.eat();
    }
}
