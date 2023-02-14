class Sample
{
static void area(double pi, int r)
{
 double result=pi*r*r;
System.out.println(result);
}
}
class Circle
{
public static void main(String[] args)
{
Sample.area(3.142,5);
}
}