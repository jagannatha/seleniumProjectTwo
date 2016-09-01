package com.java.HeadFirstJava.chapter3;


/*
 * Variable
Java Programming language defines mainly three kind of variables.

Instance variables
Static Variables
Local Variables
1) Instance variables

Instance variables are variables that are declare inside a class but outside any method,constructor or block. Instance variable are also variable of object commonly known as field or property.

class Student
{
 String name;
 int age;
}
Here name and age are instance variable of Student class.
2) Static variables

Static are class variables declared with static keyword. Static variables are initialized only once. Static variables are also used in declaring constant along with final keyword.

class Student
{
 String name;
 int age;
 static int instituteCode=1101; 
}
Here instituteCode is a static variable. Each object of Student class will share instituteCode property.
3) Local variables

Local variables are declared in method constructor or blocks. Local variables are initialized when method or constructor block start and will be destroyed once its end. Local variable reside in stack. Access modifiers are not used for local variable.


float getDiscount(int price)
{
 float discount;
 discount=price*(20/100);
 return discount; 
}
 */
public class Variables {
public static void main(String[] args) {
 
	 
	Books[] myBooks=new Books[3];
	myBooks[0] =new Books();
	myBooks[1]=new Books();
	myBooks[2]=new Books();
	int x=0;
	myBooks[0].title="TheJava";
	myBooks[1].title="is a Good";
	myBooks[2].title="Progeamming";
	myBooks[0].author="Hemu";
	myBooks[1].author="jaggu";
	myBooks[2].author="Aby";
	
	while(x<3){
		System.out.println(myBooks[x].author);
		System.out.println("BY");
		System.out.println(myBooks[x].title);
		x=x+1;
		
	}
	
}
}
class Books{
	String title;
	String author;
	
}