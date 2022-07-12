class RefrigeratorDriver
{
public static void main(String [] args)
{
Refrigerator r1=new Refrigerator();

r1.Brand="LG";
r1.price=20000;
r1.colour="Black";
r1.ltr=15;
r1.summertemp=10;
r1.wintertemp=12;
r1.normaltemp=15;

r1.displayref();
r1.displaysummertemp();
r1.displaywintertemp();
r1.displaynormaltemp();
}
}
