import java.util.Random;
public class q24 {
    public static void main(String args[])
    {
        int i=1;
        while(i<=10)
        {
            System.out.println(i);
            i++;
        }
        Random num=new Random();
        int rannum=num.nextInt(10);
        System.out.println(rannum);

    }
}
