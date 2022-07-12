class ACDriver
{
public static void main(String []  args)
{
AC c1=new AC();

c1.Brand="BlueStar";
c1.price=50000;
c1.rating=5;
c1.warranty=2;
c1.summertemp=10;
c1.wintertemp=12;
c1.normaltemp=15;

c1.displayAC();
c1.displaysummertemp();
c1.displaywintertemp();
c1.displaynormaltemp();
}
}
