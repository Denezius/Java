import java.util.*;
class Array_Combination
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit");
        int n=sc.nextInt();
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter a character array");
        char c[]=new char[n];
        for(int i=0;i<n;i++)
        {
            c[i]=ob.next().charAt(0);
        }
        System.out.println("Enter an integer array which indicates the number of times the character having same index in the charcter array shall be repeated");
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        int f=0;
        for(int i=0;i<n;i++)
        {
            f=f+ar[i];
        }
        int v=0;
        char c1[]=new char[f];
        for(int j=0;j<n;j++)
        {
            while(ar[j]>0)
            {
                c1[v]=c[j];
                v++;
                ar[j]--;
            }
        }
        System.out.println("The new array is");
        for(int i=0;i<f;i++)
        {
            System.out.println(c1[i]+" ");
        }
    }
}
                
                