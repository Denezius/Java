import java.util.*;
class Away
{
    String aw;
    Away()
    {
        aw="";
    }
    void fnInput()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the required string");
        aw=sc.nextLine();
        System.out.println("The String befire modification "+aw);
    }
    boolean isValid()
    {
        int f=0;
        int l=aw.length();
        for(int i=0;i<l;i++)
        {
            char c=aw.charAt(i);
            int u=(int)c;
            if(u>=65 && u<=90)
            {
                f++;
            }
        }
        if(f>0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    void fnModify()
    {
        String w="",w1="";
        int l=aw.length();
        int g=0;
        for(int i=0;i<l;i++)
        {
            char c=aw.charAt(i);
            if(c!=' ')
            {
                 w=w+c;
            }
            else
            {
                 int l1=w.length();
                 for(int j=0;j<l1;j++)
                 {
                     char c1=w.charAt(j);
                     int h=0;
                     for(int k=0;k<l1;k++)
                     {
                          char c2=w.charAt(k);
                          if(c1==c2)
                          {
                              h++;
                          }
                     }
                     if(h==1 && g==0)
                     {
                          w1=w1+c1;
                     }
                     if(h>1)
                     {
                         g++;
                         continue;
                     }
                 }
                 w1=w1+' ';
                 g=0;
                 w="";
            }
        }
        String t=w1;
        aw=t;
    }
    void show()
    {
        Away ob=new Away();
        boolean o=ob.isValid();
        if(o==true)
        {
            ob.fnModify();
            System.out.println("String after modification");
            System.out.println(aw);
        }
        else
        {
            System.out.println("Invalid String");
        }
    }
}
        

            