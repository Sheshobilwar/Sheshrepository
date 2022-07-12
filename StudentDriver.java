class StudentDriver
{
public static void main(String [] args)
{
Student S1=new Student();
Student S2=new Student();

System.out.println(S1.Name);
System.out.println(S1.MobNo);
System.out.println(S1.email);
System.out.println(S1.Qualification);
System.out.println(S1.Percent);
System.out.println(S1.passout);
 
 S2.Name="Shesh Sanjay Obilwar";
 S2.MobNo="9284239130";
 S2.email="sheshobilwar05@gmail.com";
 S2.Qualification="B.E-mechanical engineering";
 S2.Percent=80;
 S2.passout=2020;
 
 System.out.println(S2);
System.out.println(S2.Name);
System.out.println(S2.MobNo);
System.out.println(S2.email);
System.out.println(S2.Qualification);
System.out.println(S2.Percent);
System.out.println(S2.passout);
}
}