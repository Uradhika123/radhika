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
public class Multilevel
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
}
}