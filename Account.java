class Account extends Bank
{
    private float amt;
    
    public Account(String n, String a, float b,float m)
    {
        super(n,a,b);
        amt=m;
    }
        
    public void deposit(float x)
    {
        amt=x;
        super.p=super.p+amt;
    }
    
    public void withdraw(float x)
    {
        amt=x;
        if(super.p-amt<=0)      // if(super.p<amt)
        {
            System.out.print("\n Insufficient Balance :");
            return;
        }
        else
        {
            super.p-=amt;
            if(super.p-amt<500)
            {
                super.p=super.p - (500 -super.p)/10;
            }
        }
    }
    
    public void display()
    {
        System.out.print("\n Customer Details :\n");
        super.display();
    }
}