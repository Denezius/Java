import java.util.*;
class Binary
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a decimal number");
        int n=sc.nextInt();
        String S="";
        int num=n;
        while(num>0)
        {
            if(num%2!=0)
            {
                S=S+"1";
            }
            else
            {
                S=S+"0";
            }
            num=num/2;
        }
        String S1="";
        for(int i=0;i<S.length();i++)
        {
            char c=S.charAt(i);
            S1=c+S1;
        }
        System.out.println(n+" 's binary equivalent is "+S1);
    }
}
        