import java.util.*;
class Encryption
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the number of sentences");
        int n=x.nextInt();
        System.out.println("Enter a string array that might contain between 1 and 10 sentences");
        String ar[]=new String[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextLine();
        }
        if(n<=10)
        {
        for(int i=0;i<n;i++)
        {
            int l=ar[i].length();
            if(ar[i].charAt(l-1)!='.')
            {
                ar[i]=ar[i]+'.';
            }
            if(i%2==0)
            {
                String s="";
                for(int j=0;j<ar[i].length();j++)
                {
                    char c=ar[i].charAt(j);
                    if(c!=' ' || c!='.')
                    {
                        int y=(int)c;
                        int h=y+2;
                        char c1=(char)h;
                        s=s+c1;
                    }
                    else
                    {
                        s=s+" ";
                    }
                }
                ar[i]=s;
                s="";
            }
            else
            {
                String s="";
                for(int j=0;j<ar[i].length();j++)
                {
                    char c=ar[i].charAt(i);
                    if(c!=' ' || c!='.')
                    {
                        s=c+s;
                    }
                    else
                    {
                        s=s+" ";
                    }
                }
                ar[i]=s;
                s="";
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(ar[i]);
        }
    }
    else
    {
        System.out.println("Invalid input");
    }
}
}
                        
                        