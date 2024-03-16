import java.util.*;
class Convert
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number in octal i.e no 9's");
        int n=sc.nextInt();
        int num=n,c=0;
        while(num>0)
        {
            c++;
            num=num/10;
        }
        int dn=0,n1=n;
        while(n1>0)
        {
            int p=(int)Math.pow(10,c-1);
            int y=n1/p;
            
            dn=dn+(((int)Math.pow(8,c-1))*y);
            n1=n1%p;
            c--;
        }
        System.out.println("The number in decimal is "+dn);
    }
}
            
        