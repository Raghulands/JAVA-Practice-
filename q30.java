public class q30
{
    int apple_price=20;
    int apple_count=5;

    static void total_money()
    {
        q30 price=new q30();
        System.out.println("Total:"+(price.apple_price*price.apple_count));

    }

    public static void main(String args [])
    {
        total_money();
    }
}
