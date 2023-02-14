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
public class Singlelevel
{
public static void main(String[] args)
{
Demo d1=new Demo();
d1.add();
System.out.println(d1.x);
}
}