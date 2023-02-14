class Demo
{
int x=20;
}
class Pemocha extends Demo
{
void ho()
{
System.out.println("hello");
}
}
class Maincls
{
public static void main(String[] args)
{
Demo d1=new Pemocha();
System.out.println(d1.x);
Pemocha p1=(Pemocha)d1;
p1.ho();
System.out.println(p1.x);
}
}