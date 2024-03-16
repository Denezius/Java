import java.util.*;
class Capitals
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s=sc.nextLine();
        s=s.trim();
        int l=s.length();
        String s1="";
        String ch="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for(int i=0;i<l;i++)
        {
            char c=s.charAt(i);
            if(ch.indexOf(c)!=-1)
            {
                int y=(int)c;
                if(c>=97 && c<=122)
                {
                    y=y-32;
                    char c1=(char)y;
                    s1=s1+c1;
                }
                else
                {
                    s1=s1+c;
                }
            }
            else
            {
                s1=s1+c;
            }
        }
        System.out.println(s1);
    }
}