import java.util.*;
class Goldbach
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number between 9 and 50");
        int n=sc.nextInt();
        int ar[]=new int[50];
        int o=0;
        if(n%2==0)
        {
            for(int i=0;i<50;i++)
            {
                int c=0;
                for(int j=1;j<=i;j++)
                {
                    if(i%j==0)
                    {
                        c++;
                    }
                }
                if(c==2)
                {
                    ar[i]=i;
                }
            }
            for(int i=1;i<50;i++)
            {
                int y=0;
                for(int u=1;u<=i;u++)
                {
                    if(i%u==0)
                    {
                        y++;
                    }
                }
                for(int j=0;j<50;j++)
                {
                    if(i+ar[j]==n && y==2 && i%2!=0 && ar[i]%2!=0)
                    {
                        System.out.println(i+" "+ar[j]);
                        o++;;
                    }
                }
            }
            if(o==0)
            {
                System.out.println("Not a Goldbach number");
            }
            else
            {
                System.out.println("Goldbach Number");
            }
        }
        else
        {
           System.out.println("Not a Goldbach number");
        }
    }
}
                    
                