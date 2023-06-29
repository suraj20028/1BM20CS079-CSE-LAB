import java.util.*;
class student
{
String usn;
String name;
int credits[];
int marks[];
float sgpa;
int totalcredits=0;
void accept()
{
int n,i;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the name of student");
name=sc.nextLine();
System.out.println("Enter the usn of student");
usn=sc.nextLine();
System.out.println("Enter the number of subjects");
n=sc.nextInt();
credits=new int[n];
marks=new int[n];
System.out.println("Enter the details of subjects");
for(i=0;i<n;i++)
{
System.out.println("Enter the credits of subject"+(i+1));
credits[i]=sc.nextInt();
System.out.println("Enter the marks in subject"+(i+1));
marks[i]=sc.nextInt();
calculate(credits[i],marks[i],i);
}
}
void calculate(int credits,int marks,int j)
{
totalcredits=totalcredits+credits;
if(marks>=90&&marks<=100)
{
sgpa=sgpa+(10*credits);
}
else if(marks>=80&&marks<89)
{
sgpa=sgpa+(9*credits);
}
else if(marks>=70&&marks<79)
{
sgpa=sgpa+(8*credits);
}
else if(marks>=60&&marks<69)
{
sgpa=sgpa+(7*credits);
}
else if(marks>=50&&marks<59)
{
sgpa=sgpa+(6*credits);
}
else if(marks>=40&&marks<49)
{
sgpa=sgpa+(5*credits);
}
else
{
System.out.println("Student failed");
}
}
void display()
{
System.out.println("Name:"+name);
System.out.println("USN:"+usn);
System.out.println("SGPA:"+(sgpa/totalcredits));
}
}
class mainclass
{
public static void main(String args[])
{
student s=new student();
s.accept();
s.display();
}
}