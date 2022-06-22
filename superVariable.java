class Animal{
    String color = "Pink";
}
class Animal2 extends Animal{
    String color = "White";
}
class Dog extends Animal2{
    String color ="Black";
    void printColor(){
        System.out.println(super.color); //print color of dog class
        System.out.println(super.color); //print color of Animal class
    }
}
class superVariable {
    public static void main(String arggs[]){
        Dog d = new Dog();
        d.printColor();
    }
}
