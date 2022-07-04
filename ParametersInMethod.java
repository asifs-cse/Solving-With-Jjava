class Example
{
int a=10;
void change(Example x) //called or callee function
{
x.a=x.a+100;
}
}
class CallByValue
{
public static void main(String args[]) //calling function
{
Example e=new Example();
System.out.println("a value before calling change() :"+e.a); //10
e.change(e); //call by value(passing non primitive data type) (or) Class Objects as Parameters in Methods
System.out.println("a value after calling change() :"+e.a); //110
}
}