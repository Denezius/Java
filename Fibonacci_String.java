import java.util.*;
class Fibonacci_String
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit");
        int n=sc.nextInt();
        String S="a",S1="b",S2;
        for(int i=1;i<=n;i++)
        {
            S2=S1+S;
            System.out.print(S+" ");
            String temp=S1;
            S1=S2;
            S=temp;
        }
    }
}
