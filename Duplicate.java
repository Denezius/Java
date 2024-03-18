import java.util.*;
class Duplicate
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit");
        int n=sc.nextInt();
        System.out.println("Enter an array");
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int f=0;
            for(int j=0;j<n;j++)
            {
                if(ar[i]==ar[j])
                {
                    f++;
                }
            }
            if(f>1)
            {
                System.out.println("The element "+ar[i]+" is duplicate");
            }
        }
    }
}