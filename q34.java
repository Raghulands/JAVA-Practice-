public class q34
{
    void evenorodd(int num)
    {
        if(num%4==0)
        {
            System.out.println("EVEN");
        }
        else {
            System.out.println("ODD");
        }
    }
    public static void main(String args[])
    {
        q34 obj=new q34();
        obj.evenorodd(21);
    }
}
