class Demo1
{
double z=2.01;
}
class Dumtaka extends Demo1
{
int x=40;
}
class Maincls4
{
public static void main(String[] args)
{
Demo1 t1=new Dumtaka();
  System.out.println(t1.z);
Dumtaka r2=(Dumtaka)t1;
System.out.println(r2.z);
System.out.println(r2.x);
}
}