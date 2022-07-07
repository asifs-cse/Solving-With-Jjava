class superMethod2
{
void display ()
{
System.out.println ("BASE CLASS - DISPLAY...");
}
};
class Dc extends superMethod2
{
void display ()
{
super.display (); //refers to base class display method
System.out.println ("DERIVED CLASS- DISPLAY...");
}
};
class InDemo2
{
public static void main (String k [])
{
Dc do1=new Dc ();
do1.display ();
}
};
