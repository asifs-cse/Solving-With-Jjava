class ConstructorOverloading {
    int id;
    double cgpa;
    String name;
    
    ConstructorOverloading(int uid, float ucgpa){
        id=uid;
        cgpa = ucgpa;
    }
    ConstructorOverloading(int uid, float ucgpa, String uname){
        id=uid;
        cgpa= ucgpa;
        name= uname;
    }
    void display(){
        System.out.println(name+id+cgpa);
    }
    public static void main(String[] args){
        ConstructorOverloading s1 = new ConstructorOverloading(111, 4.4);
        ConstructorOverloading s1 = new ConstructorOverloading(111, 4.4,"asif" );

        s1.display();
        s2.display();
    }
}
