import java.util.*;
class ConsChange
{
    String word;
    int len;
    String word1;
    String word2;
    ConsChange()
    {
        word="";
        len=0;
    }
    void readword()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word");
        word=sc.nextLine();
    }
    void shiftcons()
    {
        String w=word;
        len=word.length();
        word1="";
        String sc="",sv="";
        len=w.length();
        for(int i=0;i<len;i++)
        {
            char c=w.charAt(i);
            String v="aeiouAEIOU";
            if(v.indexOf(c)!=-1)
            {
                sv=sv+c;
            }
            else
            {
                sc=sc+c;
            }
        }
        word1=word1+sc+sv;
    }
    void changeword()
    {
        String w=word;
        len=word.length();
        word2="";
        String sc="",sv="";
        len=w.length();
        for(int i=0;i<len;i++)
        {
            char c=w.charAt(i);
            String v="aeiouAEIOU";
            if(v.indexOf(c)!=-1)
            {
                sv=sv+c;
            }
            else
            {
                sc=sc+c;
                sc=sc.toUpperCase();
            }
        }
        word2=word2+sc+sv;
    }
    void show()
    {
        System.out.println(word+" "+word1+" "+word2);
    }
    void main()
    {
        ConsChange ob=new ConsChange();
        ob.readword();
        ob.shiftcons();
        ob.show();
    }
}
        