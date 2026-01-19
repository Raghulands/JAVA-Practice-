public class q27
{
    String name="";
    String Company="";
    int ram=0;
    int price=0;

    public static void main(String args[])
    {
        q27 lap1=new q27();

        lap1.name="TUF Gaming";
        lap1.Company="ASUS";
        lap1.ram=16;
        lap1.price=600000;

        q27 lap2=new q27();

        lap2.name="Envy";
        lap2.Company="HP";
        lap2.ram=8;
        lap2.price=40000;

        System.out.println(lap2.name);
    }
}
