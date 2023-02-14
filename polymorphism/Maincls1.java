class Mobile
{
void operations()
{
System.out.println("some operations");
}
}
class Vedioplayer extends Mobile
{
void operations()
{
System.out.println("vedioplayer operations");
}
}
class Audioplayer extends Mobile
{
void operations()
{
System.out.println("audioplayer operations");
}
}
class Gamingtool extends Mobile
{
void operations()
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
