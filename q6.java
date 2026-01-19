import java.util.Scanner;
public class q6 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Do you Play Cricket:");
        boolean cri=sc.nextBoolean();
        System.out.println("Do you Play Football");
        boolean fot=sc.nextBoolean();

        if(cri || fot)
        {
            System.out.println("play");
        }
        else {
            System.out.println("Noo");
        }


    }
}
