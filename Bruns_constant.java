import java.util.*;
class Bruns_constant
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit");
        int n=sc.nextInt();
        double S=0;
        for(int i=2;i<=n;i++)
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
                int c1=0;
                for(int j=1;j<=(i+2);j++)
                {
                    if((i+2)%j==0)
                    {
                        c1++;
                    }
                }
                if(c1==2)
                {
                    S=S+((1/i)+(1/i+2));
                }
            }
        }
        System.out.println(S+" is the Brun's constant for the given limit");
    }
}
