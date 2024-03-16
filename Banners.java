import java.util.*;
class Banners
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the value of N,2<N<9");
        int N=sc.nextInt();
        if(N<2)
        {
            System.out.println("Invalid Input");
            System.exit(0);
        }
        if(N>9)
        {
            System.out.println("Invalid Input");
            System.exit(0);
        }
        System.out.println("Enter a 2_D array of length N,2<N<9");
        String ar[]=new String[N];
        for(int i=0;i<N;i++)
        {
            ar[i]=ob.nextLine();
        }
        int l=0;
        for(int i=0;i<N;i++)
        {
            int l1=ar[i].length();
            if(l1>l)
            {
                l=l1;
            }
        }
        String w="";
        
        for(int i=0;i<N;i++)
        {
             char c=ar[i].charAt(i);
             int l1=ar[i].length();
             if(c==' '||i==l || i>l1)
             {
                 w=w+' ';
             }
             if(i==l)
             {
                 break;
             }
             else
             {
                 w=w+c;
             }
             System.out.print(w);
             
             w="";
             System.out.println();
        }
    }
}
        
        