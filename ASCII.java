import java.util.*;
class ASCII
{
    void fnC()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character");
        char c=sc.next().charAt(0);
        int i=(int)c;
        System.out.println(i+" is the American Standard Code For Information Interchange of "+c);
    }
}