import java.util.*;
public class CommandLine
{
    public static void main(String args[])
    {
        int l=args[0].length();
        int k=Integer.parseInt(args[0]);
        String n="1234567890";
        if(l==0)
        {
            try
            {
                      throw new ArrayIndexOutOfBoundsException ("Array index out of bounds");

            }catch (ArrayIndexOutOfBoundsException e)
            { System.out.println(e);}
                  
       }
        if(n.indexOf(args[0])==-1)
       {
           try
          {
                      throw new NumberFormatException ("Floating Point number entered");

            }catch (NumberFormatException e2)
            { System.out.println(e2);}

      }
       if(k<0)
       {
           try
           {
                throw new IllegalArgumentException ("Illegal argument");
           }catch (IllegalArgumentException e1)
            { System.out.println(e1);}
      }
      else
      {
         int f=1;
         for(int i=2;i<=k;i++)
         {
             f=f*i;
         }
         System.out.println(f);
      }
   }
}