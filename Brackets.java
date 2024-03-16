import java.util.*;
class Brackets
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence containing brackets");
        String s=sc.nextLine();
        s=s.trim();
        char f=s.charAt(0),g=s.charAt(s.length()-1);
        int l=s.length();
        if(l==2 && g!=f)
        {
            System.out.println(s+" is a Valid String");
        }
        if(l%2!=0)
        {
            System.out.println(s+" is not a Valid String");
        }
        else if(f==g)
        {
            System.out.println(s+" is not a Valid String");
        }
        else if(f!=g)
        {
            int p=0,q=0;
            for(int i=0;i<l-1;i++)
            {
                char d=s.charAt(i);
                if(d==f)
                {
                    p++;
                }
            }
            for(int i=l-1;i>=0;i--)
            {
                char e=s.charAt(i);
                if(e==g)
                {
                    q++;
                }
            }
            if(p==q)
            {
                System.out.println(s+" is a valid String");
            }
            else
            {
                System.out.println(s+" is not a valid String");
            }
        }
    }
}