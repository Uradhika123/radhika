class Whatsapp_v1
{
void status()
{
System.out.println("status with text");
}
}
class Whatsapp_v2 extends Whatsapp_v1
{
void status()
{
System.out.println("status with text,image,vedios");
}
}
class Whatsapp
{
public static void main(String[] args)
{
Whatsapp_v2 a1=new Whatsapp_v2();
a1.status();
}
}
