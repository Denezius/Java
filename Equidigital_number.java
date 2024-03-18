import java.util.*;
class Equidigital_number
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int num=n;
        int num1=n;
        int f=1;
        for(int i=2;i<=(n/2);i++)
        {
            while(num1%i==0)
            {
                f=f*i;
                num1=num1/i;
            }
        }
        int c=0;
        while(num>0)
        {
            c++;
            num=num/10;
        }
        int n1=f,c1=0;
        while(n1>0)
        {
            c1++;
            n1=n1/10;
        }
        System.out.println(f);
        if(c==c1)
        {
            System.out.println(n+" is an Equidigital number");
        }
        else
        {
            System.out.println(n+" is  not an Equidigital number");
        }
    }
}
           
            