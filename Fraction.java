import java.util.*;
class Fraction
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numerator and denominator in decimal");
        String n=sc.nextLine();
        String d=sc.nextLine();
        int l=n.length();
        int l1=d.length();
        int c1=n.indexOf('.');
        int c2=d.indexOf('.');
        int ndc=l-(c1+1);
        int ddc=l1-(c2+1);
        int i=Integer.parseInt(n);
        int i1=Integer.parseInt(d);
        double d1=Double.parseDouble(n);
        double d2=Double.parseDouble(d);
        int t=0;
        if(ndc>=ddc)
        {
            t=ndc;
        }
        if(ddc>=ndc)
        {
            t=ddc;
        }
        int dx=(int)d1*(int)Math.pow(10,t);
        int dy=(int)d2*(int)Math.pow(10,t);
        int numerator=i*ndc+dx;
        int denominator=i1*ddc+dy;
        System.out.print(numerator/denominator);
    }
}

    


