import java.util.*;
class Boundary_Elements
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the indexes");
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.println("Enter an array");
        int ar[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                ar[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
        int S=0;
        for(int i=0;i<n;i++)
        {
            S=S+ar[0][i];
        }
        for(int i=0;i<m;i++)
        {
            S=S+ar[i][0];
        }
        for(int i=0;i<n;i++)
        {
            S=S+ar[m-1][i];
        }
        for(int i=0;i<m;i++)
        {
            S=S+ar[i][n-1];
        }
        S=S-(ar[0][0]+ar[0][n-1]+ar[m-1][0]+ar[m-1][n-1]);
        System.out.println(S);
    }
}
          