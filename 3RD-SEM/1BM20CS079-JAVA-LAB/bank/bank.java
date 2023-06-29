import java.util.*;
class bank
{
String name;
String accno;
float balance;
float ci;
void accept()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the name");
name=sc.nextLine();
System.out.println("Enter the account number");
accno=sc.nextLine();
System.out.println("Enter the balance");
balance=sc.nextFloat();
}
void display()
{
System.out.println("NAME: "+name);
System.out.println("ACCOUNT NUMBER: "+accno);
System.out.println("FINAL BALANCE: "+balance);
}
void deposits()
{
Scanner sc=new Scanner(System.in);
System.out.println("Do you want to deposit\n1.Yes\n2.No");
int d=sc.nextInt();
if(d==1)
{
System.out.println("Enter amount to be deposited");
float amt=sc.nextFloat();
balance=balance+amt;
}
else
{
balance=balance+0;
}
System.out.println("The availabe balance is "+balance);
}
}
class curr extends bank
{
void cheque()
{
if(balance>1000)
{
System.out.println("Cheque service available");
}
else
{
System.out.println("Cheque service not available because of insufficient balance");
}
}
void withdraw()
{
float sercharge=100;
Scanner sc=new Scanner(System.in);
System.out.println("Minimum balance is 1000rs");
System.out.println("Enter amount to be withdrawn");
float amount=sc.nextFloat();
if(amount>balance)
{
System.out.println("Insufficient Balance");
}
else
{
balance=balance-amount;
if(balance<1000)
{
balance=balance-sercharge;
System.out.println("Service charge of 100rs is imposed");
}
else
{
System.out.println(amount+" withdrawn");
}
System.out.println("Balance: "+balance);
}
}
}
class save extends bank
{
float amount;
void simint()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter rate");
int r=sc.nextInt();
System.out.println("Enter elapse time period");
int t=sc.nextInt();
System.out.println("Enter no of times");
int n=sc.nextInt();
ci=(1+(r/n));
System.out.println("Compound interset is "+(Math.pow((int)ci,(n*t))));
}
void withdraw()
{
Scanner sc=new Scanner(System.in);
System.out.println("No minimum balance required");
System.out.println("Enter the amount to be withdrawn");
amount=sc.nextFloat();
if(amount>balance)
{
System.out.println("Insufficient Balance");
}
else
{
balance=balance-amount;
System.out.println(amount+" withdrawn");
System.out.println("Balance: "+balance);
}
}
}
class mainclass
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
curr c=new curr();
save s=new save();
System.out.println("Enter your choice");
System.out.println("1.Current account");
System.out.println("2.Savings acoount");
int choice=sc.nextInt();
switch(choice)
{
case 1:c.accept();
c.deposits();
c.cheque();
c.withdraw();
c.display();
break;
case 2:s.accept();
s.deposits();
s.simint();
s.withdraw();
s.display();
}
}
}