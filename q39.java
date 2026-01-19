public class q39
{
    String name;
    q39()
    {
        System.out.println("Constructor");
    }
    void teacher(String name)
    {
        this.name=name;
        System.out.println(name);
    }
    public static void main(String agrs[])
    {
        q39 obj=new q39();
        obj.teacher("Anitha");

    }
}
