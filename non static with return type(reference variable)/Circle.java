class Circle
{
double area()
{
double pi=3.142;
int r=3;
double result=pi*r*r;

return result;
}
public static void main(String[] args)
{
Circle s1= new Circle();
    
double x=s1.area();
System.out.println(x);
}
}