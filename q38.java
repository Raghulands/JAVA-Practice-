public class q38
{
    int no;
    String name;
    q38(int a, String b)
    {
        no=a;
        name=b;
        System.out.println("DETAILS:"+a+","+b);
    }
    q38()
    {
        System.out.println("OVERLOAD CONSTRUCTOR");
    }
    public static void main(String agrs[])
    {
        q38 obj=new q38(37,"Ragu");
        q38 obj1=new q38();
    }
}
