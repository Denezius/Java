import java.util.*;
class Conversion
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numerator and denominator of the fraction");
        double num=sc.nextDouble();
        double den=sc.nextDouble();
        while((long)num!=num || (long)den!=den)
        {
            num=num*10;
            den=den*10;
        }
        System.out.println(num+"/"+den);
    }
}