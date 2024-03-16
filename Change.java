import java.util.*;
class Change
{
    String str,newstr;
    int len;
    Change()
    {
        str="";
        newstr="";
        len=0;
    }
    void inputword()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word");
        str=sc.nextLine();
    }
    char caseconvert(char ch)
    {
        int i=(int)ch;
        ch=' ';
        if(i>=65 && i<=90)
        {
            int k=i-65;
            int y=97+k;
            char z=(char)y;
            return z;
        }
        else
        {
            int k=i-97;
            int y=65+k;
            char z=(char)y;
            return z;
        }
    }
    void recchange(int i)
    {
        len=str.length();
        if(i<len)
        {
            char c=str.charAt(i);
            char c1=caseconvert(c);
            newstr=newstr+c1;
            recchange(i+1);
        }
    }
    void main()
    {
        Change x=new Change();
        x.inputword();
        x.recchange(0);
        System.out.println(str+" "+newstr);
    }
}
