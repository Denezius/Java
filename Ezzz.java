import java.util.*;
class Ezzz
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s=sc.nextLine();
        s=s.trim();
        int l=s.length();
        int c1=0;
        for(int i=0;i<l;i++)
        {
            char c=s.charAt(i);
            if(c==' ')
            {
                c1++;
            }
        }
        System.out.println(c1+1);
    }
}