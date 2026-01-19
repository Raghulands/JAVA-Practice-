import java.util.Scanner;
class q1{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int A= sc.nextInt();
        int B= sc.nextInt();
        int C= sc.nextInt();
        int D= A*B*C;
        int E=A+B+C;
        int sol=D/E;
        System.out.println(sol);

    }
}