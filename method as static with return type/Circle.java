class Sample
{
static double area()
{
 double pi=3.142;
int r=5;


double result=pi*r*r;

return result;
}
}
class Circle
{
public static void main(String[] args)
{
 double x=Sample.area();
 System.out.println(x);


}

}