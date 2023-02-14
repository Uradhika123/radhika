class Swiggy
{
static void selectPizza()
{
placeorder("Veggi burst");
}
static void placeorder(String Pizza)
{
System.out.println("order placed successfully "+Pizza);
PizzaHut(Pizza);
}
static void PizzaHut(String Pizzatype)
{
cookanddispatch(Pizzatype);
}
static String cookanddispatch(String Pizzatocook)
{
System.out.println("pizza is ready and getting dispatch");
return("Pizzatocook");
}
public static void main(String[] args)
{
selectPizza();
}
}