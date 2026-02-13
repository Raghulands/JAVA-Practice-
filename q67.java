import java.util.*;
public class q67 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ip=sc.nextLine();
        int A=ip.charAt(ip.length()-2)-'0';
        int B=ip.charAt(ip.length()-1)-'0';
        System.out.print(A+B);
    }
}