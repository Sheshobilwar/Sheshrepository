class LaptopDriver
{
public static void main(String [] args)
{
Laptop L1=new Laptop();
Laptop L2=new Laptop();


System.out.println(L1.price);
System.out.println(L1.ram);
System.out.println(L1.HD);
System.out.println(L1.processor);
System.out.println(L1.Brand);
System.out.println(L1.os);
System.out.println(L2.price);
System.out.println(L2.ram);

L2.price=25000;
L2.ram=4;
L2.HD=1;
L2.processor="I5";
L2.Brand="Dell";
L2.os="Windows 11";

System.out.println(L2.price);
System.out.println(L2.ram);
System.out.println(L2.HD);
System.out.println(L2.processor);
System.out.println(L2.os);
System.out.println(L2.Brand);
System.out.println(L2);

Laptop L3=new Laptop();

L3.Brand="Asus Tuf Gaming F15";
L3.price=60000;
L3.ram=8;
L3.HD=2;
L3.processor="I5";
L3.os="windows 11";

System.out.println(L3.Brand);
System.out.println(L3.price);
System.out.println(L3.ram);
System.out.println(L3.HD);
System.out.println(L3.processor);
System.out.println(L2.os);



}
}