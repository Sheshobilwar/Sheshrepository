class Refrigerator
{
String Brand;
double price;
String colour;
int ltr;
double summertemp;
double wintertemp;
double normaltemp;

public void displaysummertemp()
{
System.out.println("The summer temperature is: " +summertemp);
}

public void displaywintertemp()
{
System.out.println("The winter temperature is: " +wintertemp);
}

public void displaynormaltemp()
{
System.out.println("The normal temperature is: " +normaltemp);
}

public void displayref()
{
	System.out.println("The Brand: "+Brand);
	System.out.println("The price: "+price);
	System.out.println("The colour: "+colour);
	System.out.println("The liter: "+ltr);
	
}
}