class Pizza
{
static void select_Pizza()
{
placeorder("Veggi burst");
}
static void placeOrder(String Pizza)
{
System.out.println("order placed successfully"+Pizza);
PizzaHut(Pizza);
}
static void Pizza_Hut(String Pizzatype)
{
cookanddispatch(Pizzatype);
}
static String cook_and_dispatch(String Pizzatocook)
{
System.out.println("pizza is ready and getting dispatch");
return"Pizzatocook";
}
public static void main(String[] args)
{
selectPizza();
}
}