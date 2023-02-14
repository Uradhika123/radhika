class Classroom
{
void environment()
{
System.out.println("some environment");
}
}
class Comic extends Classroom
{
void environment()
{
System.out.println("Comic environment");
}
}
class Study extends Classroom
{
void environment()
{
System.out.println("study environment");
}
}
class Presentation extends Classroom
{
void environment()
{
System.out.println("Presentation environment");
}
}
class Student
{
static void behaviour(Classroom c2)
{
c2.environment();
}
}
class Maincls3
{
public static void main(String[] args)
{
Comic c1=new Comic();
Study s1=new Study();
Presentation p1=new Presentation();
Student.behaviour(c1);
Student.behaviour(s1);
Student.behaviour(p1);
}
}