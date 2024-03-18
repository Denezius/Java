import java.util.*;
class Equal_Arrays
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  array sizes respectively, be careful !, since you're entering 2 Two-D arrays");
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println("Enter the first array,and remember the golden rule, dawg,go slow");
        int ar[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                ar[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the second array,and remember the golden rule, dawg,slow and steady gets the girl");
        int ar1[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                ar1[i][j]=sc.nextInt();
            }
        }
        int c=m*n;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                  if(ar[i][j]==ar1[i][j])
                  {
                      c--;
                  }
            }
        }
        if(c==0)
        {
            for(int i=0;i<n;i++)
            {
                  for(int j=0;j<m;j++)
                  {
                      System.out.print(ar[i][j]+" ");
                  }
                  System.out.println();
            }
            for(int i=0;i<n;i++)
            {
                  for(int j=0;j<m;j++)
                  {
                      System.out.print(ar1[i][j]+" ");
                  }
                  System.out.println();
            }
            System.out.println("Equal, but how's it special, if this is special, then I'm an alien from an exoplanet 23000 light years away");
        }
        else
        {
            for(int i=0;i<n;i++)
            {
                  for(int j=0;j<m;j++)
                  {
                      System.out.print(ar[i][j]+" ");
                  }
                  System.out.println();
            }          
            for(int i=0;i<n;i++)
            {
                  for(int j=0;j<m;j++)
                  {
                      System.out.print(ar1[i][j]+" ");
                  }
                  System.out.println();
            }
            System.out.println("Not equal, don't start acting like it even matters");
        }
    }
}
            