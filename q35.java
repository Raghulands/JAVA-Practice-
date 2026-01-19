import java.util.Scanner;
public class q35
{
    void result(int mark)
    {
        if(mark>=50)
        {
            System.out.println("PASS");
        }
        else
        {
            System.out.println("FAIL");
        }
    }
    public static void main(String args[])
    {
        int total;
        q35 obj=new q35();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Total:");
        total= sc.nextInt();
        obj.result(total);

    }
}
