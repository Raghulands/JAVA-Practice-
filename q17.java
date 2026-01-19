import java.util.Scanner;
public class q17
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        int [] arr=new int[5];
        int total=0;
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
            total+=arr[i];

        }
        System.out.println(total);
        for(int i=0;i<5;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
