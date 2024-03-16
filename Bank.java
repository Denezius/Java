/*Write a program to create a superclass Bank having the following
Member data:-name,accno,p
Bank(String nm,ac_no,double pr)-parametrised constructor
display()-display all the necessary details
Create a subclass Amount having the following
Member data-amt
Account(String n, String a, float b,float m)-parametrised constructor
deposit(float x)-to deposit rupees x
withdraw(float x)-to withdraw rupees x
display()-display all the necessary details
Write a class InitBank to do the following
Create a menu and either deposit withdraw or display amount of money in the bank*/

class Bank
{
    protected String name;
    protected String accno;
    protected double p;
    Bank()
    {
        name="";
        accno="";
        p=0.0;
    }
    Bank(String nm,String ac_no,double pr)//initialising the member data
    {
        name=nm;
        accno=ac_no;
        p=pr;
    }
    void display()
    {

        System.out.println("The name of the customer is "+name);
        System.out.println("The account number of the customer is "+accno);
        System.out.println("The principal value is Rs "+p);
    }
}
    