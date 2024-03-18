import java.util.*;
class Encryption_2
{
    String Message,EncMsg;
    Encryption_2()
    {
        Message="";
        EncMsg="";
    }
    void readMessage()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence");
        Message=sc.nextLine();
    }
    String Rot13(String s)
    {
        String S="";
        s=s.trim();
        s=s+' ';
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            char c=s.charAt(i);
            if(c!=' ')
            {
                int ch=(int)c;
                if(ch>=65 && ch<=90)
                {
                    if(ch>=65 && ch<=77)
                    {
                        int t=ch+13;
                        char d=(char)t;
                        S=S+d;
                    }
                    if(ch>=78 && ch<=90)
                    {
                        int t=ch-78;
                        int g=t+65;
                        char d=(char)g;
                        S=S+d;
                    }
                }
                if(ch>=97 && ch<=122)
                {
                    if(ch>=97 && ch<=109)
                    {
                        int t=ch+13;
                        char d=(char)t;
                        S=S+d;
                    }
                    if(ch>=110 && ch<=122)
                    {
                        int t=ch-110;
                        int g=t+97;
                        char d=(char)g;
                        S=S+d;
                    }
                }
            }
        }
        return S;
    }
    void main()
    {
        EncMsg="";
        Encryption_2 ob=new Encryption_2();
        String S=ob.Rot13(Message);
        EncMsg=EncMsg+S;
        System.out.println(Message+" "+EncMsg);
        System.out.println("I'd hoped that it would be better than the original Encryption, and now it is, thanks to my love for this shit, man I'm so happy now, I feel I could write a verse or do 20 integrations, ps:- i know you're thinking that this is advertising my methods an shit but it ain' dawg, believe your homie it ain't");
    }
}
        
                    
            
        