import java.util.*;
class Happy_Number
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int S=0;
        int num=n;
        while(n>0)
        {
            int d=n%10;
            n=n/10;
            S=S+(d*d);
            while(S>9 && n==0)
            {
                n=S;
                S=0;
            }
        }
        if(S==1)
        {
            System.out.println(num+" is a Happy number");
        }
        else
        if(S==4)
        {
            System.out.println(num+" is an Unhappy number");
        }
        else
        {
            System.out.println(num+" is neither Happy nor Unhappy");
        }
    }
}