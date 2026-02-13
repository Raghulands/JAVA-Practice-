import java.util.*;
public class q66 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String letter = sc.nextLine();
        int x = 0;
        for(int i = 0; i < letter.length(); i++)
        {
            char ch = letter.charAt(i);

            if(ch >= 'A' && ch <= 'Z')
            {
                x++;
            }
        }
        System.out.println(x);
    }
}
