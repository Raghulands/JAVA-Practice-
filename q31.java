public class q31
{
    void juice(int A)
    {
        System.out.println(A);
    }

    void soap(int soapprice)
    {
        System.out.println("SOAP PRICE:"+soapprice);
    }
    void chocolate(int chocomoney)
    {
        System.out.println(chocomoney);

    }
    public static void main(String agrs[])
    {
        q31 obj1=new q31();
        obj1.soap(20);
        obj1.chocolate(50);
        obj1.juice(10);
    }
}
