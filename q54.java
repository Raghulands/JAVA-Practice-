import java.util.Scanner;
public class q54
{
    public static void main(String args[])
    {
        char alp='a';
        char alpx='a';
        char alpc='A';
        //char [] input=new char[i];
        char [] alpn=new char[30];
        char [] ascii=new char[130];
        for (int i=1;i<=26;i++)
        {

            alpn[i]=alp;
            alp++;
        }
        for (int i=65;i<=90;i++)
        {
            ascii[i]=alpc;
            alpc++;
        }
        for (int i=97;i<=123;i++)
        {

            ascii[i]=alpx;
            alpx++;
        }

        System.out.println(alpn[2]);
//        Scanner sc=new Scanner(System.in);
//        for (int i=0;i<6;i++)
//        {
//            char [] input=new char[i];
//
//        }
//        for (int i=0;i<6;i++)
//        {
//            input[i]%26=char [] dev=new char[i];
//        }

    }
}
