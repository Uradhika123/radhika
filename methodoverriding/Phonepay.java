class Phonepe_v1
{
void pay()
{
System.out.println("pay with number");
}
}
class Phonepe_v2 extends Phonepe_v1
{
void pay()
{
System.out.println("pay with scan");
super.pay();
}
}
class Phonepay
{
public static void main(String[] args)
{
Phonepe_v2 a1=new Phonepe_v2();
a1.pay();
}
}
