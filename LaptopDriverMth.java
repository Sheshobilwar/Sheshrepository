class CompDriver
{
public static void main(String [] args)
{
Comp a1=new Comp();
Comp a2=new Comp();
Comp a3=new Comp();

a2.price=25000;
a2.ram=4;
a2.HD=1;
a2.processor="I5";
a2.Brand="Dell";
a2.os="Windows 11";


a3.Brand="Asus Tuf Gaming F15";
a3.price=60000;
a3.ram=8;
a3.HD=2;
a3.processor="I5";
a3.os="windows 11";

a1.displayComp();
a2.displayComp();
a3.displayComp();
}
}