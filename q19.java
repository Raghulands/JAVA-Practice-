import java.util.Scanner;
public class q19
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size:");
        int arrsize=sc.nextInt();
        int []arr=new int[arrsize];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(arr[(arr.length)/2]);

    }
}
