import java.util.*;
class Frequency
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
            System.out.println(ar[i]+" is present "+f+" times in the array");
        }
    }
}