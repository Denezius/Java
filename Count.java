import java.util.*;
class Count
{
    String s;
    Count()
    {
        s="";
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        s=sc.nextLine();
    }
    int conSame(String s,int i)
    {
        int l=s.length();
        if(i==l-1)
        {
            return 0;
        }
        else
        {
            char c=s.charAt(i);
            char c1=s.charAt(i+1);
            c=Character.toLowerCase(c);
            c1=Character.toLowerCase(c1);
            if(c==c1)
            {
                return 1+conSame(s,i+1);
            }
            else
            {
                return conSame(s,i+1);
            }
        }
    }
    void main()
    {
        Count ob=new Count();
        int c=ob.conSame(s,0);
        System.out.println("There are "+c+" consecutively identical letters in the word");
    }
}