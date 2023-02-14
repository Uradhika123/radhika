class Bottle
{
void store()
{
System.out.println("storing some liquids");
}
}
class Waterbottle extends Bottle
{
void store()
{
System.out.println("storing water");
}
}
class Milkbottle extends Bottle
{
void store()
{
System.out.println("storing milk");
}
}
class Juicebottle extends Bottle
{
void store()
{
System.out.println("storing Juice");
}
}
class Storingtype
{
static void use(Bottle b1)
{
b1.store();
}
}
class Maincls2
{
public static void main(String[] args)
{
Waterbottle w1=new Waterbottle();
Milkbottle m1=new Milkbottle();
Juicebottle b1=new Juicebottle();
Storingtype.use(w1);
Storingtype.use(m1);
Storingtype.use(b1);
}
}