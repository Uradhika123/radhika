interface Mobile
{
void operations();
}
class Vedioplayer implements Mobile
{
public void operations()
{
System.out.println("vedioplayer operations");
}
}
class Audioplayer implements Mobile
{
public void operations()
{
System.out.println("audioplayer operations");
}
}
class Gamingtool implements Mobile
{
public void operations()
{
System.out.println("gamingtool operations");
}
}
class Users
{
static void usage(Mobile m1)
{
m1.operations();
}
}
class Maincls1
{
public static void main(String[] args)
{
Vedioplayer v1=new Vedioplayer();
Audioplayer a1=new Audioplayer();
Gamingtool  g1=new Gamingtool();
Users.usage(v1);
Users.usage(a1);
Users.usage(g1);
}
}