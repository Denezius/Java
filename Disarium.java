import java.util.*;
class Disarium
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int c=0;
        int num=n;
        while(num>0)
        {
            c++;
            num=num/10;
        }
        int n1=n,d,S=0;
        while(n1>0)
        {
            d=n1%10;
            S=S+(int)Math.pow(d,c);
            n1=n1/10;
            c--;
        }
        if(S==n)
        {
            System.out.println(n+" is a Disarium number");
        }
        else
        {
            System.out.println(n+" is not a Disarium number");
        }
    }
}