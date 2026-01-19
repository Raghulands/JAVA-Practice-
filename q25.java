import java.util.Scanner;
public class q25 {
    public static void main (String args[])
    {
        int count;
        do
        {
            System.out.println("Enter Number:");
            Scanner sc=new Scanner(System.in);
            count=sc.nextInt();
        }
        while(count>10);
    }
}
