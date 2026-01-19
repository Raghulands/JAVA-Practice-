import java.util.Scanner;
public class q7 {
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        int score=sc.nextInt();

        if (score>=35 && score<60)
        {
            System.out.println("Just pass nee laa ennatha panna poriyow");
        }
        else if(score>=60 && score<90)
        {
            System.out.println("Saapida ethachum kedaikum");
        }
        else if(score>=90){
            System.out.println("Nambadhaa");
        }
        else
        {
            System.out.println("Sorry");
        }
    }
}
