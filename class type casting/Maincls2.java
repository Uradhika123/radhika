class Tester
{
int r=20;
}
class Tista extends Tester
{
void uliya()
{
System.out.println("hello");
}
}
class Maincls2
{
public static void main(String[] args)
{
Tester t1=new Tista();
System.out.println(t1.r);
Tista r2=(Tista)t1;
r2.uliya();
System.out.println(r2.r);
}
}