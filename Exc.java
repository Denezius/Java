class MyException extends Exception {
    public MyException(String s)
    {
        // Call constructor of parent Exception
        super(s);
    }
}
public class Exc
{
   
   public static void main(String args[])
   {
       String s="";
       for(int i=0;i<args.length;i++)
       {
          s=s+args[i];
       }
       double d=Double.parseDouble(s);
       if(d>35.0)
       {
         try
         {
            throw new MyException("TooHot");
         }
         catch(MyException e)
         {
            System.out.println(e);
         }
        }
        else if(d<35.0)
        {
         try
         {
            throw new MyException("TooCold");
         }
         catch(MyException e1)
         {
            System.out.println(e1);
         }
        }
        else if(d==35.0)
        {
           double f=0;
           f=1.8*d;
           System.out.println("Normal\n"+f+" is the temperature in Fahrenheit");
        }
   }
}
