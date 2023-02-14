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
class Tester extends Demo
{
void disp()
{
System.out.println("one boys pg");
}
}
class Animal extends Sample
{
void mul()
{
System.out.println("one girls pg");
}
}
public class Hybrid
{
public static void main(String[] args)
{
Demo d1=new Demo();
d1.add();
System.out.println(d1.x);
Tester s1=new Tester();
s1.disp();
s1.add();
System.out.println(s1.x);
Animal a1=new Animal();
a1.mul();
System.out.println(a1.x);
Demo d2=new Demo();
d2.add();
System.out.println(d2.x);
}
}