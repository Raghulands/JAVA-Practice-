import java.util.Scanner;
public class q9 {
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        int A= sc.nextInt();
        int B= sc.nextInt();

        String result=A>B?"A is Greater":"B is Greater";

        System.out.println(result);
    }
}
