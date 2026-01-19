public class q36
{
    void sum(int a, int b, int c)
    {
        System.out.println("SUM:"+(a+b+c));
    }
    void sum(int a, int b)
    {
        System.out.println("SUM:"+(a+b));
    }
    public static void main(String args [])
    {
        q36 obj=new q36();
        obj.sum(10,15);
        obj.sum(10,15,20);
    }
}
