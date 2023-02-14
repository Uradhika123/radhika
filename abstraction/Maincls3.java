interface Classroom
{
void environment();
}
class Comic implements Classroom
{
public void environment()
{
System.out.println("Comic environment");
}
}
class Study implements Classroom
{
public void environment()
{
System.out.println("study environment");
}
}
class Presentation implements Classroom
{
public void environment()
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