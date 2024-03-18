import java.util.*;
class Digit_Ascii_sum
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence with digits present");
        String s=sc.nextLine();
        int S=0;
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            char c=s.charAt(i);
            String a="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()_+-=|{}[]?/';:,<>.~`";
            int k=a.indexOf(c);
            if(c!=' ' &&  k==-1)
            {
                int j=(int)c;
                S=S+j;
            }
        }
        System.out.println("Ascii value of digits is "+S);
    }
}
           