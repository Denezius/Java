import java.util.*;
class Decimal_to_Binary
{
    String s="";
    int convert(int n)
    {
        if(n==1)
        {
            s=s+'1';
            return 1;
        }
        else
        {
            if(n%2==0)
            {
                s=s+'0';
            }
            else
            {
                s=s+'1';
            }
            return convert(n/2);
        }
    }
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int r=convert(n);
        String b="";
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            b=c+b;
        }
        System.out.println(n+" "+b);
    }
}
        