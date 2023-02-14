class Sample 
{
void co()
{
System.out.println("hi");
}
}
class Guluyalu extends Sample 
{
void disp()
{
System.out.println("hello");
}
}
class Maincls5
{
public static void main(String[] args)
{
Sample s2=new Guluyalu();
  s2.co();
Guluyalu g1=(Guluyalu)s2;
g1.disp();
g1.co();
}
}