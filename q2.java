import java.util.Scanner;
public class q2 {
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        float score=sc.nextFloat();
        sc.nextLine();
        String dept=sc.nextLine();
        System.out.println("My name is"+name);
        System.out.print("My Score is "+score/10);
        System.out.println("/10");
        System.out.println("My Department is"+dept);

    }
}
