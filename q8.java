import java.util.Scanner;
public class q8 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("MAT:");
        int mat=sc.nextInt();
        System.out.println("ENG:");
        int eng=sc.nextInt();
        System.out.println("BIO:");
        int bio=sc.nextInt();
        System.out.println("PHY:");
        int phy=sc.nextInt();
        System.out.println("CHE:");
        int che=sc.nextInt();

        int avg=(mat+eng+bio+phy+che)/5;

        if(avg>35)
        {
            System.out.println("YOU ARE GOOD TO GOO");

        }
        else {
            System.out.println("Need to IMPROVE");
        }
    }
}
