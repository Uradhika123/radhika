class Zomato
{
static void homepage()
{
System.out.println("homepage");
}
static void logout()
{
System.out.println("logout");
}
static void signup()
{
System.out.println("signup");
}
public static void main(String[] args)
{
signup();
login();
homepage();
order();
logout();
}

static void login()
{
System.out.println("login");
}

static void order()
{
System.out.println("order");
}
}