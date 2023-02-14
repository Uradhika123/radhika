class Sample
{
void disp()
{
System.out.println("hi");
}
}
class Ampules extends Sample
{
void tata()
{
System.out.println("hello");
}
}
class Maincls1
{
public static void main(String[] args)
{
Sample s1=new Ampules();
s1.disp();
Ampules a1=(Ampules)s1;
a1.tata();
a1.disp();
}
}