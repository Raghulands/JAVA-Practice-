import java.util.*;

public class q70 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String num = sc.nextLine();

        int original = Integer.parseInt(num);
        int length = num.length();
        int sum = 0;

        for (int i = 0; i < length; i++) {
            int digit = num.charAt(i) - '0';
            sum += Math.pow(digit, length);
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong number");
        } else {
            System.out.println(original + " is NOT an Armstrong number");
        }
    }
}