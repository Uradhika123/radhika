class Sample
{
int x=40;
}
class Demo extends Sample
{
void add()
{
System.out.println("2 buildings");
}
}
class Animal extends Sample
{
void mul()
{
System.out.println("one girls pg");
}
}
public class Hierarchical
{
public static void main(String[] args)
{
Demo d1=new Demo();
d1.add();
System.out.println(d1.x);
Animal a1=new Animal();
a1.mul();
System.out.println(a1.x);
}
}