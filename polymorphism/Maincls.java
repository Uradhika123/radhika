class Human
{
void emotions()
{
System.out.println("some emotions");
}
}
class Sad extends Human
{
void emotions()
{
System.out.println("sad emotions");
}
}
class Happy extends Human
{
void emotions()
{
System.out.println("Happy emotions");
}
}
class Angry extends Human
{
void emotions()
{
System.out.println("angry emotions");
}
}
class Situations
{
static void react(Human H2)
{
H2.emotions();
}
}
class Maincls
{
public static void main(String[] args)
{
Sad s1=new Sad();
Happy H1=new Happy();
Angry a1=new Angry();
Situations.react(s1);
Situations.react(H1);
Situations.react(a1);
}
}