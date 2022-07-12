class AC
{
String Brand;
double price;
int rating;
int warranty;
double  summertemp;
double wintertemp;
double normaltemp;

public void displayAC()
{
System.out.println("Brand: " +Brand);
System.out.println("price: " +price+ " RS");
System.out.println("Rating: " +rating+" Star");
System.out.println("warranty: " +warranty+ " year");
}

public void displaysummertemp()
{
System.out.println("The summer temperature is: " +summertemp+ " *c");
}

public void displaywintertemp()
{
System.out.println("The winter temperature is: " +wintertemp+ " *c");
}

public void displaynormaltemp()
{
System.out.println("The normal temperature is: " +normaltemp+ " *c");
}

}
