import java.util.*;
class book
{
String name;
String author;
int pages;
int price;
book()
{
}
book(String name,String author,int price,int pages)
{
this.name=name;
this.author=author;
this.price=price;
this.pages=pages;
}
void accept()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the name of book");
name=sc.next();
System.out.println("Enter the author of book");
author=sc.next();
System.out.println("Enter the price of book");
price=sc.nextInt();
System.out.println("Enter the no of pages of book");
pages=sc.nextInt(); 
}
void tostring()
{
System.out.println("Name:"+name+"\n"+"Author:"+author+"\n"+"Price:"+price+"\n"+"No of pages:"+pages);
}
}
class main
{
public static void main(String args[])
{
int n,i;
Scanner a=new Scanner(System.in);
book b1=new book("OOJ","JOHN",4000,350);
System.out.println("Constructor values\n");
b1.tostring();
System.out.println("Enter the number of books");
n=a.nextInt();
book b[]=new book[n];
for(i=0;i<n;i++)
{
b[i]=new book();
System.out.println("Enter the details of book"+(i+1));
b[i].accept();
}
for(i=0;i<n;i++)
{
System.out.println("The details of book"+(i+1)+" are");
b[i].tostring();
}
}
}