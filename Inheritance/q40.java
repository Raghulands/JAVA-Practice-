//inheritance
class Dad
{
    int money=2000;
}
class Son extends Dad
{

}
public class q40
{
    public static void main (String agrs [])
    {
        Son obj=new Son();
        System.out.println(obj.money);

    }
}
