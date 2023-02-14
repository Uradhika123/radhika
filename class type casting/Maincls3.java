class Cool
{
void add()
{
System.out.println("hello");
}
}
class Goolata extends Cool
{
void dispu()
{
System.out.println("good morning");
}
}
class Maincls3
{
public static void main(String[] args)
{
Cool t1=new Goolata();
  t1.add();
Goolata r2=(Goolata)t1;
r2.dispu();
r2.add();
}
}