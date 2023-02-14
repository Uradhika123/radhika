interface Cloth
{
void design()
}
class Shirt implements Cloth
{
public void design()
{
System.out.println("shirt designs");
}
}
class Tshirt implements Cloth
{
public void design()
{
System.out.println("Tshirt designs");
}
}
class Kurtha implements Cloth
{
public void design()
{
System.out.println("Kurtha designs");
}
}
class Industry
{
void manufacture(Cloth c1)
{
c1.design();
}
}
class Maincls4
{
public static void main(String[] args)
{
Shirt s1=new Shirt();
Tshirt t1=new Tshirt();
Kurtha k1=new Kurtha();
Industry i1=new Industry();
i1.manufacture(s1);
i1.manufacture(t1);
i1.manufacture(k1);
}
}